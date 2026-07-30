package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Store;
import com.google.firebase.platforminfo.UserAgentPublisher;
import defpackage.cv;
import defpackage.fm0;
import defpackage.gm0;
import defpackage.iy;
import defpackage.jt2;
import defpackage.kt2;
import defpackage.lh;
import defpackage.ll3;
import defpackage.mi2;
import defpackage.nz2;
import defpackage.th;
import defpackage.wo1;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static Store store;
    static ScheduledExecutorService syncExecutor;
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final FirebaseApp firebaseApp;
    private final GmsRpc gmsRpc;
    private final FirebaseInstanceIdInternal iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final jt2 topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = 28800;
    static Provider<nz2> transportFactory = new iy(6);

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public class AutoInit {
        private static final String AUTO_INIT_PREF = "auto_init";
        private static final String FCM_PREFERENCES = "com.google.firebase.messaging";
        private static final String MANIFEST_METADATA_AUTO_INIT_ENABLED = "firebase_messaging_auto_init_enabled";
        private Boolean autoInitEnabled;
        private EventHandler<DataCollectionDefaultChange> dataCollectionDefaultChangeEventHandler;
        private boolean initialized;
        private final Subscriber subscriber;

        public AutoInit(Subscriber subscriber) {
            this.subscriber = subscriber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$initialize$0(Event event) {
            if (isEnabled()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        private Boolean readEnabled() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseMessaging.this.firebaseApp.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(AUTO_INIT_PREF)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(AUTO_INIT_PREF, false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(MANIFEST_METADATA_AUTO_INIT_ENABLED)) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(MANIFEST_METADATA_AUTO_INIT_ENABLED));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void initialize() {
            try {
                if (this.initialized) {
                    return;
                }
                Boolean readEnabled = readEnabled();
                this.autoInitEnabled = readEnabled;
                if (readEnabled == null) {
                    EventHandler<DataCollectionDefaultChange> eventHandler = new EventHandler() { // from class: com.google.firebase.messaging.e
                        @Override // com.google.firebase.events.EventHandler
                        public final void handle(Event event) {
                            FirebaseMessaging.AutoInit.this.lambda$initialize$0(event);
                        }
                    };
                    this.dataCollectionDefaultChangeEventHandler = eventHandler;
                    this.subscriber.subscribe(DataCollectionDefaultChange.class, eventHandler);
                }
                this.initialized = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean isEnabled() {
            Boolean bool;
            try {
                initialize();
                bool = this.autoInitEnabled;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.isDataCollectionDefaultEnabled();
        }

        public synchronized void setEnabled(boolean z) {
            try {
                initialize();
                EventHandler<DataCollectionDefaultChange> eventHandler = this.dataCollectionDefaultChangeEventHandler;
                if (eventHandler != null) {
                    this.subscriber.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                    this.dataCollectionDefaultChangeEventHandler = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean(AUTO_INIT_PREF, z);
                edit.apply();
                if (z) {
                    FirebaseMessaging.this.startSyncIfNecessary();
                }
                this.autoInitEnabled = Boolean.valueOf(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<nz2> provider, Subscriber subscriber, Metadata metadata, GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) {
        final int i = 0;
        this.syncScheduledOrRunning = false;
        transportFactory = provider;
        this.firebaseApp = firebaseApp;
        this.iid = firebaseInstanceIdInternal;
        this.autoInit = new AutoInit(subscriber);
        Context applicationContext = firebaseApp.getApplicationContext();
        this.context = applicationContext;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.lifecycleCallbacks = fcmLifecycleCallbacks;
        this.metadata = metadata;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            Log.w("FirebaseMessaging", "Context " + applicationContext2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new gm0(this, i));
        }
        executor2.execute(new Runnable(this) { // from class: hm0
            public final /* synthetic */ FirebaseMessaging n;

            {
                this.n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                FirebaseMessaging firebaseMessaging = this.n;
                switch (i2) {
                    case 0:
                        firebaseMessaging.lambda$new$2();
                        break;
                    default:
                        firebaseMessaging.lambda$new$4();
                        break;
                }
            }
        });
        jt2 createInstance = TopicsSubscriber.createInstance(this, metadata, gmsRpc, applicationContext, FcmExecutors.newTopicsSyncExecutor());
        this.topicsSubscriberTask = createInstance;
        createInstance.e(executor2, new c(i, this));
        final int i2 = 1;
        executor2.execute(new Runnable(this) { // from class: hm0
            public final /* synthetic */ FirebaseMessaging n;

            {
                this.n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                FirebaseMessaging firebaseMessaging = this.n;
                switch (i22) {
                    case 0:
                        firebaseMessaging.lambda$new$2();
                        break;
                    default:
                        firebaseMessaging.lambda$new$4();
                        break;
                }
            }
        });
    }

    public static synchronized void clearStoreForTest() {
        synchronized (FirebaseMessaging.class) {
            store = null;
        }
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = new iy(5);
    }

    public static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
            ll3.w(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    private static synchronized Store getStore(Context context) {
        Store store2;
        synchronized (FirebaseMessaging.class) {
            try {
                if (store == null) {
                    store = new Store(context);
                }
                store2 = store;
            } catch (Throwable th) {
                throw th;
            }
        }
        return store2;
    }

    private String getSubtype() {
        return FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName()) ? "" : this.firebaseApp.getPersistenceKey();
    }

    public static nz2 getTransportFactory() {
        return transportFactory.get();
    }

    private void handleProxiedNotificationData() {
        this.gmsRpc.getProxyNotificationData().e(this.initExecutor, new gm0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initializeProxyNotifications, reason: merged with bridge method [inline-methods] */
    public void lambda$new$4() {
        ProxyNotificationInitializer.initialize(this.context);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeOnTokenRefresh, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(String str) {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.firebaseApp.getName());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jt2 lambda$blockingGetToken$13(String str, Store.Token token, String str2) {
        getStore(this.context).saveToken(getSubtype(), str, str2, this.metadata.getAppVersionCode());
        if (token == null || !str2.equals(token.token)) {
            lambda$new$1(str2);
        }
        return mi2.j(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jt2 lambda$blockingGetToken$14(String str, Store.Token token) {
        return this.gmsRpc.getToken().o(this.fileExecutor, new d(this, str, token));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ nz2 lambda$clearTransportFactoryForTest$12() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$deleteToken$8(kt2 kt2Var) {
        try {
            this.iid.deleteToken(Metadata.getDefaultSenderId(this.firebaseApp), INSTANCE_ID_SCOPE);
            kt2Var.a(null);
        } catch (Exception e) {
            kt2Var.a.p(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$deleteToken$9(kt2 kt2Var) {
        try {
            mi2.d(this.gmsRpc.deleteToken());
            getStore(this.context).deleteToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
            kt2Var.a(null);
        } catch (Exception e) {
            kt2Var.a.p(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getToken$7(kt2 kt2Var) {
        try {
            kt2Var.a(blockingGetToken());
        } catch (Exception e) {
            kt2Var.a.p(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleProxiedNotificationData$5(cv cvVar) {
        if (cvVar != null) {
            MessagingAnalytics.logNotificationReceived(cvVar.m);
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(TopicsSubscriber topicsSubscriber) {
        if (isAutoInitEnabled()) {
            topicsSubscriber.startTopicsSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setNotificationDelegationEnabled$6(Void r2) {
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ nz2 lambda$static$0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ jt2 lambda$subscribeToTopic$10(String str, TopicsSubscriber topicsSubscriber) {
        return topicsSubscriber.subscribeToTopic(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ jt2 lambda$unsubscribeFromTopic$11(String str, TopicsSubscriber topicsSubscriber) {
        return topicsSubscriber.unsubscribeFromTopic(str);
    }

    private boolean shouldRetainProxyNotifications() {
        ProxyNotificationInitializer.initialize(this.context);
        if (!ProxyNotificationInitializer.isProxyNotificationEnabled(this.context)) {
            return false;
        }
        if (this.firebaseApp.get(AnalyticsConnector.class) != null) {
            return true;
        }
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled() && transportFactory != null;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(MAX_DELAY_SEC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) mi2.d(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.token;
        }
        String defaultSenderId = Metadata.getDefaultSenderId(this.firebaseApp);
        try {
            return (String) mi2.d(this.requestDeduplicator.getOrStartGetTokenRequest(defaultSenderId, new d(this, defaultSenderId, tokenWithoutTriggeringSync)));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public jt2 deleteToken() {
        if (this.iid != null) {
            kt2 kt2Var = new kt2();
            this.initExecutor.execute(new fm0(this, kt2Var, 2));
            return kt2Var.a;
        }
        if (getTokenWithoutTriggeringSync() == null) {
            return mi2.j(null);
        }
        kt2 kt2Var2 = new kt2();
        FcmExecutors.newNetworkIOExecutor().execute(new fm0(this, kt2Var2, 0));
        return kt2Var2.a;
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new wo1("TAG"));
                }
                syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public jt2 getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        kt2 kt2Var = new kt2();
        this.initExecutor.execute(new fm0(this, kt2Var, 1));
        return kt2Var.a;
    }

    public Store.Token getTokenWithoutTriggeringSync() {
        return getStore(this.context).getToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
    }

    public jt2 getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    public boolean isNotificationDelegationEnabled() {
        return ProxyNotificationInitializer.isProxyNotificationEnabled(this.context);
    }

    @Deprecated
    public void send(RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.getTo())) {
            lh.e("Missing 'to'");
            return;
        }
        Intent intent = new Intent(SEND_INTENT_ACTION);
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra(EXTRA_DUMMY_P_INTENT, PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
        intent.setPackage(GMS_PACKAGE);
        remoteMessage.populateSendMessageIntent(intent);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z) {
        this.autoInit.setEnabled(z);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        MessagingAnalytics.setDeliveryMetricsExportToBigQuery(z);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    public jt2 setNotificationDelegationEnabled(boolean z) {
        int i = 1;
        return ProxyNotificationInitializer.setEnableProxyNotification(this.initExecutor, this.context, z).e(new th(i), new gm0(this, i));
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public jt2 subscribeToTopic(String str) {
        return this.topicsSubscriberTask.n(new b(str, 0));
    }

    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(Store.Token token) {
        return token == null || token.needsRefresh(this.metadata.getAppVersionCode());
    }

    public jt2 unsubscribeFromTopic(String str) {
        return this.topicsSubscriberTask.n(new b(str, 1));
    }

    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(FirebaseApp.getInstance());
        }
        return firebaseMessaging;
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<nz2> provider3, Subscriber subscriber, Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, provider3, subscriber, metadata, new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), FcmExecutors.newTaskExecutor(), FcmExecutors.newInitExecutor(), FcmExecutors.newFileIOExecutor());
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<nz2> provider3, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, provider3, subscriber, new Metadata(firebaseApp.getApplicationContext()));
    }
}
