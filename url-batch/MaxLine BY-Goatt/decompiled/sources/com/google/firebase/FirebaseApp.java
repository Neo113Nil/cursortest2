package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import defpackage.an;
import defpackage.hi;
import defpackage.jy;
import defpackage.km;
import defpackage.ll3;
import defpackage.tt1;
import defpackage.zm;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class FirebaseApp {
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    private static final String LOG_TAG = "FirebaseApp";
    private final Context applicationContext;
    private final ComponentRuntime componentRuntime;
    private final Lazy<DataCollectionConfigStorage> dataCollectionConfigStorage;
    private final Provider<DefaultHeartBeatController> defaultHeartBeatController;
    private final String name;
    private final FirebaseOptions options;
    private static final Object LOCK = new Object();
    static final Map<String, FirebaseApp> INSTANCES = new hi(0);
    private final AtomicBoolean automaticResourceManagementEnabled = new AtomicBoolean(false);
    private final AtomicBoolean deleted = new AtomicBoolean();
    private final List<BackgroundStateChangeListener> backgroundStateChangeListeners = new CopyOnWriteArrayList();
    private final List<FirebaseAppLifecycleListener> lifecycleListeners = new CopyOnWriteArrayList();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class GlobalBackgroundStateListener implements zm {
        private static AtomicReference<GlobalBackgroundStateListener> INSTANCE = new AtomicReference<>();

        private GlobalBackgroundStateListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureBackgroundStateListenerRegistered(Context context) {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (INSTANCE.get() == null) {
                    GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                    AtomicReference<GlobalBackgroundStateListener> atomicReference = INSTANCE;
                    while (!atomicReference.compareAndSet(null, globalBackgroundStateListener)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    an.a(application);
                    an anVar = an.q;
                    anVar.getClass();
                    synchronized (anVar) {
                        anVar.o.add(globalBackgroundStateListener);
                    }
                }
            }
        }

        @Override // defpackage.zm
        public void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.LOCK) {
                try {
                    ArrayList arrayList = new ArrayList(FirebaseApp.INSTANCES.values());
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        FirebaseApp firebaseApp = (FirebaseApp) obj;
                        if (firebaseApp.automaticResourceManagementEnabled.get()) {
                            firebaseApp.notifyBackgroundStateChangeListeners(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class UserUnlockReceiver extends BroadcastReceiver {
        private static AtomicReference<UserUnlockReceiver> INSTANCE = new AtomicReference<>();
        private final Context applicationContext;

        public UserUnlockReceiver(Context context) {
            this.applicationContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureReceiverRegistered(Context context) {
            if (INSTANCE.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                AtomicReference<UserUnlockReceiver> atomicReference = INSTANCE;
                while (!atomicReference.compareAndSet(null, userUnlockReceiver)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.LOCK) {
                try {
                    Iterator<FirebaseApp> it = FirebaseApp.INSTANCES.values().iterator();
                    while (it.hasNext()) {
                        it.next().initializeAllApis();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            unregister();
        }

        public void unregister() {
            this.applicationContext.unregisterReceiver(this);
        }
    }

    public FirebaseApp(Context context, String str, FirebaseOptions firebaseOptions) {
        ll3.v(context);
        this.applicationContext = context;
        ll3.s(str);
        this.name = str;
        ll3.v(firebaseOptions);
        this.options = firebaseOptions;
        StartupTime startupTime = FirebaseInitProvider.getStartupTime();
        FirebaseTrace.pushTrace("Firebase");
        FirebaseTrace.pushTrace("ComponentDiscovery");
        List<Provider<ComponentRegistrar>> discoverLazy = ComponentDiscovery.forContext(context, ComponentDiscoveryService.class).discoverLazy();
        FirebaseTrace.popTrace();
        FirebaseTrace.pushTrace("Runtime");
        ComponentRuntime.Builder processor = ComponentRuntime.builder(UiExecutor.INSTANCE).addLazyComponentRegistrars(discoverLazy).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponentRegistrar(new ExecutorsRegistrar()).addComponent(Component.of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.of(this, (Class<FirebaseApp>) FirebaseApp.class, (Class<? super FirebaseApp>[]) new Class[0])).addComponent(Component.of(firebaseOptions, (Class<FirebaseOptions>) FirebaseOptions.class, (Class<? super FirebaseOptions>[]) new Class[0])).setProcessor(new ComponentMonitor());
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(Component.of(startupTime, (Class<StartupTime>) StartupTime.class, (Class<? super StartupTime>[]) new Class[0]));
        }
        ComponentRuntime build = processor.build();
        this.componentRuntime = build;
        FirebaseTrace.popTrace();
        this.dataCollectionConfigStorage = new Lazy<>((Provider) new jy(2, this, context));
        this.defaultHeartBeatController = build.getProvider(DefaultHeartBeatController.class);
        addBackgroundStateChangeListener(new BackgroundStateChangeListener() { // from class: cm0
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z) {
                FirebaseApp.this.lambda$new$1(z);
            }
        });
        FirebaseTrace.popTrace();
    }

    private void checkNotDeleted() {
        ll3.x(!this.deleted.get(), "FirebaseApp was deleted");
    }

    public static void clearInstancesForTest() {
        synchronized (LOCK) {
            INSTANCES.clear();
        }
    }

    private static List<String> getAllAppNames() {
        ArrayList arrayList = new ArrayList();
        synchronized (LOCK) {
            try {
                Iterator<FirebaseApp> it = INSTANCES.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getName());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<FirebaseApp> getApps(Context context) {
        ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new ArrayList(INSTANCES.values());
        }
        return arrayList;
    }

    public static FirebaseApp getInstance(String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (LOCK) {
            try {
                firebaseApp = INSTANCES.get(normalize(str));
                if (firebaseApp == null) {
                    List<String> allAppNames = getAllAppNames();
                    if (allAppNames.isEmpty()) {
                        str2 = com.google.firebase.encoders.json.BuildConfig.FLAVOR;
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", allAppNames);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
            } finally {
            }
        }
        return firebaseApp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeAllApis() {
        if (!((UserManager) this.applicationContext.getSystemService(UserManager.class)).isUserUnlocked()) {
            Log.i(LOG_TAG, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + getName());
            UserUnlockReceiver.ensureReceiverRegistered(this.applicationContext);
            return;
        }
        Log.i(LOG_TAG, "Device unlocked: initializing all Firebase APIs for app " + getName());
        this.componentRuntime.initializeEagerComponents(isDefaultApp());
        this.defaultHeartBeatController.get().registerHeartBeat();
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions, String str) {
        FirebaseApp firebaseApp;
        GlobalBackgroundStateListener.ensureBackgroundStateListenerRegistered(context);
        String normalize = normalize(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (LOCK) {
            Map<String, FirebaseApp> map = INSTANCES;
            ll3.x(!map.containsKey(normalize), "FirebaseApp name " + normalize + " already exists!");
            ll3.w(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, normalize, firebaseOptions);
            map.put(normalize, firebaseApp);
        }
        firebaseApp.initializeAllApis();
        return firebaseApp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DataCollectionConfigStorage lambda$new$0(Context context) {
        return new DataCollectionConfigStorage(context, getPersistenceKey(), (Publisher) this.componentRuntime.get(Publisher.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(boolean z) {
        if (z) {
            return;
        }
        this.defaultHeartBeatController.get().registerHeartBeat();
    }

    private static String normalize(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBackgroundStateChangeListeners(boolean z) {
        Log.d(LOG_TAG, "Notifying background state change listeners.");
        Iterator<BackgroundStateChangeListener> it = this.backgroundStateChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z);
        }
    }

    private void notifyOnAppDeleted() {
        Iterator<FirebaseAppLifecycleListener> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onDeleted(this.name, this.options);
        }
    }

    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.get() && an.q.m.get()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.backgroundStateChangeListeners.add(backgroundStateChangeListener);
    }

    public void addLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        ll3.v(firebaseAppLifecycleListener);
        this.lifecycleListeners.add(firebaseAppLifecycleListener);
    }

    public void delete() {
        if (this.deleted.compareAndSet(false, true)) {
            synchronized (LOCK) {
                INSTANCES.remove(this.name);
            }
            notifyOnAppDeleted();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseApp) {
            return this.name.equals(((FirebaseApp) obj).getName());
        }
        return false;
    }

    public <T> T get(Class<T> cls) {
        checkNotDeleted();
        return (T) this.componentRuntime.get(cls);
    }

    public Context getApplicationContext() {
        checkNotDeleted();
        return this.applicationContext;
    }

    public String getName() {
        checkNotDeleted();
        return this.name;
    }

    public FirebaseOptions getOptions() {
        checkNotDeleted();
        return this.options;
    }

    public String getPersistenceKey() {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = getName().getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        byte[] bytes2 = getOptions().getApplicationId().getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public void initializeAllComponents() {
        this.componentRuntime.initializeAllComponentsForTests();
    }

    public boolean isDataCollectionDefaultEnabled() {
        checkNotDeleted();
        return this.dataCollectionConfigStorage.get().isEnabled();
    }

    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        this.backgroundStateChangeListeners.remove(backgroundStateChangeListener);
    }

    public void removeLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        ll3.v(firebaseAppLifecycleListener);
        this.lifecycleListeners.remove(firebaseAppLifecycleListener);
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.compareAndSet(!z, z)) {
            boolean z2 = an.q.m.get();
            if (z && z2) {
                notifyBackgroundStateChangeListeners(true);
            } else {
                if (z || !z2) {
                    return;
                }
                notifyBackgroundStateChangeListeners(false);
            }
        }
    }

    public void setDataCollectionDefaultEnabled(Boolean bool) {
        checkNotDeleted();
        this.dataCollectionConfigStorage.get().setEnabled(bool);
    }

    public String toString() {
        tt1 tt1Var = new tt1(this);
        tt1Var.k(this.name, "name");
        tt1Var.k(this.options, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        return tt1Var.toString();
    }

    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z));
    }

    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        byte[] bytes2 = firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
    }

    public static FirebaseApp initializeApp(Context context) {
        synchronized (LOCK) {
            try {
                if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                    return getInstance();
                }
                FirebaseOptions fromResource = FirebaseOptions.fromResource(context);
                if (fromResource == null) {
                    Log.w(LOG_TAG, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return initializeApp(context, fromResource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (LOCK) {
            try {
                firebaseApp = INSTANCES.get(DEFAULT_APP_NAME);
                if (firebaseApp == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + km.f() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseApp;
    }
}
