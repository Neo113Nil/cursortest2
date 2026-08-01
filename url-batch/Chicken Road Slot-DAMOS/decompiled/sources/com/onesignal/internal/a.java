package com.onesignal.internal;

import android.content.Context;
import android.os.Build;
import ba.d;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.h;
import com.onesignal.core.CoreModule;
import com.onesignal.session.SessionModule;
import com.onesignal.user.UserModule;
import dd.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import na.e;
import na.f;
import nd.i;
import org.json.JSONObject;
import qb.n;
import sc.c;
import wa.j;
import wd.b0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements v9.a, ba.b {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private com.onesignal.core.internal.config.a configModel;
    private boolean isInitialized;
    private final List<String> listOfModules;
    private f operationRepo;
    private final d services;
    private c sessionModel;
    private final String sdkVersion = h.INSTANCE.getSdkVersion();
    private final ua.a debug = new va.a();
    private final Object initLock = new Object();
    private final Object loginLock = new Object();

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function1 {
        final /* synthetic */ b0 $currentIdentityExternalId;
        final /* synthetic */ b0 $currentIdentityOneSignalId;
        final /* synthetic */ String $externalId;
        final /* synthetic */ b0 $newIdentityOneSignalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0 b0Var, String str, b0 b0Var2, b0 b0Var3, ld.a aVar) {
            super(1, aVar);
            this.$newIdentityOneSignalId = b0Var;
            this.$externalId = str;
            this.$currentIdentityExternalId = b0Var2;
            this.$currentIdentityOneSignalId = b0Var3;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return a.this.new b(this.$newIdentityOneSignalId, this.$externalId, this.$currentIdentityExternalId, this.$currentIdentityOneSignalId, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                f fVar = a.this.operationRepo;
                fVar.getClass();
                com.onesignal.core.internal.config.a aVar2 = a.this.configModel;
                aVar2.getClass();
                zc.f fVar2 = new zc.f(aVar2.getAppId(), (String) this.$newIdentityOneSignalId.f10141d, this.$externalId, this.$currentIdentityExternalId.f10141d == null ? (String) this.$currentIdentityOneSignalId.f10141d : null);
                this.label = 1;
                obj = e.enqueueAndWait$default(fVar, fVar2, false, this, 2, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Could not login user");
            }
            return Unit.f5554a;
        }
    }

    public a() {
        List<String> f3 = y.f("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = f3;
        ba.c cVar = new ba.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = f3.iterator();
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(it.next()).newInstance();
                newInstance.getClass();
                arrayList.add((aa.a) newInstance);
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((aa.a) obj).register(cVar);
        }
        this.services = cVar.build();
    }

    private final void createAndSwitchToNewUser(boolean z10, Function2<? super yc.a, ? super com.onesignal.user.internal.properties.a, Unit> function2) {
        Object obj;
        String createLocalId;
        String str;
        dd.f fVar;
        com.onesignal.debug.internal.logging.b.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String createLocalId2 = com.onesignal.common.d.INSTANCE.createLocalId();
        yc.a aVar = new yc.a();
        aVar.setOnesignalId(createLocalId2);
        com.onesignal.user.internal.properties.a aVar2 = new com.onesignal.user.internal.properties.a();
        aVar2.setOnesignalId(createLocalId2);
        if (function2 != null) {
            function2.invoke(aVar, aVar2);
        }
        ArrayList arrayList = new ArrayList();
        dd.e subscriptionModelStore = getSubscriptionModelStore();
        subscriptionModelStore.getClass();
        Iterator<T> it = subscriptionModelStore.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String id2 = ((dd.d) obj).getId();
            com.onesignal.core.internal.config.a aVar3 = this.configModel;
            aVar3.getClass();
            if (Intrinsics.a(id2, aVar3.getPushSubscriptionId())) {
                break;
            }
        }
        dd.d dVar = (dd.d) obj;
        dd.d dVar2 = new dd.d();
        if (dVar == null || (createLocalId = dVar.getId()) == null) {
            createLocalId = com.onesignal.common.d.INSTANCE.createLocalId();
        }
        dVar2.setId(createLocalId);
        dVar2.setType(g.PUSH);
        dVar2.setOptedIn(dVar != null ? dVar.getOptedIn() : true);
        if (dVar == null || (str = dVar.getAddress()) == null) {
            str = "";
        }
        dVar2.setAddress(str);
        if (dVar == null || (fVar = dVar.getStatus()) == null) {
            fVar = dd.f.NO_PERMISSION;
        }
        dVar2.setStatus(fVar);
        dVar2.setSdk(h.INSTANCE.getSdkVersion());
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        dVar2.setDeviceOS(str2);
        String carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(((ea.f) this.services.getService(ea.f.class)).getAppContext());
        if (carrierName == null) {
            carrierName = "";
        }
        dVar2.setCarrier(carrierName);
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(((ea.f) this.services.getService(ea.f.class)).getAppContext());
        dVar2.setAppVersion(appVersion != null ? appVersion : "");
        com.onesignal.core.internal.config.a aVar4 = this.configModel;
        aVar4.getClass();
        aVar4.setPushSubscriptionId(dVar2.getId());
        arrayList.add(dVar2);
        dd.e subscriptionModelStore2 = getSubscriptionModelStore();
        subscriptionModelStore2.getClass();
        subscriptionModelStore2.clear("NO_PROPOGATE");
        yc.b identityModelStore = getIdentityModelStore();
        identityModelStore.getClass();
        com.onesignal.common.modeling.e.replace$default(identityModelStore, aVar, null, 2, null);
        com.onesignal.user.internal.properties.b propertiesModelStore = getPropertiesModelStore();
        propertiesModelStore.getClass();
        com.onesignal.common.modeling.e.replace$default(propertiesModelStore, aVar2, null, 2, null);
        if (z10) {
            dd.e subscriptionModelStore3 = getSubscriptionModelStore();
            subscriptionModelStore3.getClass();
            subscriptionModelStore3.replaceAll(arrayList, "NO_PROPOGATE");
        } else {
            dd.e subscriptionModelStore4 = getSubscriptionModelStore();
            subscriptionModelStore4.getClass();
            com.onesignal.common.modeling.b.replaceAll$default(subscriptionModelStore4, arrayList, null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createAndSwitchToNewUser$default(a aVar, boolean z10, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z10 = false;
        }
        if ((i3 & 2) != 0) {
            function2 = null;
        }
        aVar.createAndSwitchToNewUser(z10, function2);
    }

    private final yc.b getIdentityModelStore() {
        return (yc.b) this.services.getService(yc.b.class);
    }

    private final String getLegacyAppId() {
        return qa.a.getString$default(getPreferencesService(), "OneSignal", "GT_APP_ID", null, 4, null);
    }

    private final qa.b getPreferencesService() {
        return (qa.b) this.services.getService(qa.b.class);
    }

    private final com.onesignal.user.internal.properties.b getPropertiesModelStore() {
        return (com.onesignal.user.internal.properties.b) this.services.getService(com.onesignal.user.internal.properties.b.class);
    }

    private final dd.e getSubscriptionModelStore() {
        return (dd.e) this.services.getService(dd.e.class);
    }

    @Override // ba.b
    public <T> List<T> getAllServices(Class<T> cls) {
        cls.getClass();
        return this.services.getAllServices(cls);
    }

    public boolean getConsentGiven() {
        Boolean consentGiven;
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return (aVar == null || (consentGiven = aVar.getConsentGiven()) == null) ? Intrinsics.a(this._consentGiven, Boolean.TRUE) : consentGiven.booleanValue();
    }

    public boolean getConsentRequired() {
        Boolean consentRequired;
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return (aVar == null || (consentRequired = aVar.getConsentRequired()) == null) ? Intrinsics.a(this._consentRequired, Boolean.TRUE) : consentRequired.booleanValue();
    }

    public ua.a getDebug() {
        return this.debug;
    }

    public boolean getDisableGMSMissingPrompt() {
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return aVar != null ? aVar.getDisableGMSMissingPrompt() : Intrinsics.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    public j getInAppMessages() {
        if (isInitialized()) {
            return (j) this.services.getService(j.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public ib.a getLocation() {
        if (isInitialized()) {
            return (ib.a) this.services.getService(ib.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // v9.a
    public n getNotifications() {
        if (isInitialized()) {
            return (n) this.services.getService(n.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // ba.b
    public <T> T getService(Class<T> cls) {
        cls.getClass();
        return (T) this.services.getService(cls);
    }

    @Override // ba.b
    public <T> T getServiceOrNull(Class<T> cls) {
        cls.getClass();
        return (T) this.services.getServiceOrNull(cls);
    }

    public nc.a getSession() {
        if (isInitialized()) {
            return (nc.a) this.services.getService(nc.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public tc.a getUser() {
        if (isInitialized()) {
            return (tc.a) this.services.getService(tc.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // ba.b
    public <T> boolean hasService(Class<T> cls) {
        cls.getClass();
        return this.services.hasService(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r5.getAppId(), r23) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0229, code lost:
    
        if (r3.intValue() != r10) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x022d, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021a, code lost:
    
        if (r3.intValue() != r10) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:4:0x0032, B:6:0x0039, B:10:0x0043, B:12:0x004e, B:15:0x0055, B:17:0x00a9, B:19:0x00b6, B:21:0x00bc, B:24:0x00c3, B:26:0x00d7, B:28:0x00e4, B:30:0x00f4, B:32:0x00fc, B:34:0x0100, B:35:0x010d, B:37:0x0111, B:38:0x011e, B:40:0x0122, B:41:0x0133, B:43:0x013f, B:46:0x0155, B:47:0x02eb, B:50:0x0177, B:52:0x018e, B:53:0x01d7, B:55:0x01f5, B:58:0x021c, B:62:0x022e, B:65:0x023b, B:67:0x0240, B:70:0x024e, B:71:0x0257, B:74:0x0280, B:77:0x0299, B:78:0x02b3, B:80:0x0252, B:81:0x0225, B:84:0x0216), top: B:3:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:4:0x0032, B:6:0x0039, B:10:0x0043, B:12:0x004e, B:15:0x0055, B:17:0x00a9, B:19:0x00b6, B:21:0x00bc, B:24:0x00c3, B:26:0x00d7, B:28:0x00e4, B:30:0x00f4, B:32:0x00fc, B:34:0x0100, B:35:0x010d, B:37:0x0111, B:38:0x011e, B:40:0x0122, B:41:0x0133, B:43:0x013f, B:46:0x0155, B:47:0x02eb, B:50:0x0177, B:52:0x018e, B:53:0x01d7, B:55:0x01f5, B:58:0x021c, B:62:0x022e, B:65:0x023b, B:67:0x0240, B:70:0x024e, B:71:0x0257, B:74:0x0280, B:77:0x0299, B:78:0x02b3, B:80:0x0252, B:81:0x0225, B:84:0x0216), top: B:3:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:4:0x0032, B:6:0x0039, B:10:0x0043, B:12:0x004e, B:15:0x0055, B:17:0x00a9, B:19:0x00b6, B:21:0x00bc, B:24:0x00c3, B:26:0x00d7, B:28:0x00e4, B:30:0x00f4, B:32:0x00fc, B:34:0x0100, B:35:0x010d, B:37:0x0111, B:38:0x011e, B:40:0x0122, B:41:0x0133, B:43:0x013f, B:46:0x0155, B:47:0x02eb, B:50:0x0177, B:52:0x018e, B:53:0x01d7, B:55:0x01f5, B:58:0x021c, B:62:0x022e, B:65:0x023b, B:67:0x0240, B:70:0x024e, B:71:0x0257, B:74:0x0280, B:77:0x0299, B:78:0x02b3, B:80:0x0252, B:81:0x0225, B:84:0x0216), top: B:3:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:4:0x0032, B:6:0x0039, B:10:0x0043, B:12:0x004e, B:15:0x0055, B:17:0x00a9, B:19:0x00b6, B:21:0x00bc, B:24:0x00c3, B:26:0x00d7, B:28:0x00e4, B:30:0x00f4, B:32:0x00fc, B:34:0x0100, B:35:0x010d, B:37:0x0111, B:38:0x011e, B:40:0x0122, B:41:0x0133, B:43:0x013f, B:46:0x0155, B:47:0x02eb, B:50:0x0177, B:52:0x018e, B:53:0x01d7, B:55:0x01f5, B:58:0x021c, B:62:0x022e, B:65:0x023b, B:67:0x0240, B:70:0x024e, B:71:0x0257, B:74:0x0280, B:77:0x0299, B:78:0x02b3, B:80:0x0252, B:81:0x0225, B:84:0x0216), top: B:3:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:4:0x0032, B:6:0x0039, B:10:0x0043, B:12:0x004e, B:15:0x0055, B:17:0x00a9, B:19:0x00b6, B:21:0x00bc, B:24:0x00c3, B:26:0x00d7, B:28:0x00e4, B:30:0x00f4, B:32:0x00fc, B:34:0x0100, B:35:0x010d, B:37:0x0111, B:38:0x011e, B:40:0x0122, B:41:0x0133, B:43:0x013f, B:46:0x0155, B:47:0x02eb, B:50:0x0177, B:52:0x018e, B:53:0x01d7, B:55:0x01f5, B:58:0x021c, B:62:0x022e, B:65:0x023b, B:67:0x0240, B:70:0x024e, B:71:0x0257, B:74:0x0280, B:77:0x0299, B:78:0x02b3, B:80:0x0252, B:81:0x0225, B:84:0x0216), top: B:3:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:4:0x0032, B:6:0x0039, B:10:0x0043, B:12:0x004e, B:15:0x0055, B:17:0x00a9, B:19:0x00b6, B:21:0x00bc, B:24:0x00c3, B:26:0x00d7, B:28:0x00e4, B:30:0x00f4, B:32:0x00fc, B:34:0x0100, B:35:0x010d, B:37:0x0111, B:38:0x011e, B:40:0x0122, B:41:0x0133, B:43:0x013f, B:46:0x0155, B:47:0x02eb, B:50:0x0177, B:52:0x018e, B:53:0x01d7, B:55:0x01f5, B:58:0x021c, B:62:0x022e, B:65:0x023b, B:67:0x0240, B:70:0x024e, B:71:0x0257, B:74:0x0280, B:77:0x0299, B:78:0x02b3, B:80:0x0252, B:81:0x0225, B:84:0x0216), top: B:3:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d7 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:4:0x0032, B:6:0x0039, B:10:0x0043, B:12:0x004e, B:15:0x0055, B:17:0x00a9, B:19:0x00b6, B:21:0x00bc, B:24:0x00c3, B:26:0x00d7, B:28:0x00e4, B:30:0x00f4, B:32:0x00fc, B:34:0x0100, B:35:0x010d, B:37:0x0111, B:38:0x011e, B:40:0x0122, B:41:0x0133, B:43:0x013f, B:46:0x0155, B:47:0x02eb, B:50:0x0177, B:52:0x018e, B:53:0x01d7, B:55:0x01f5, B:58:0x021c, B:62:0x022e, B:65:0x023b, B:67:0x0240, B:70:0x024e, B:71:0x0257, B:74:0x0280, B:77:0x0299, B:78:0x02b3, B:80:0x0252, B:81:0x0225, B:84:0x0216), top: B:3:0x0032 }] */
    @Override // v9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean initWithContext(Context context, String str) {
        boolean z10;
        String string$default;
        boolean z11;
        context.getClass();
        ua.c cVar = ua.c.DEBUG;
        com.onesignal.debug.internal.logging.b.log(cVar, "initWithContext(context: " + context + ", appId: " + str + ')');
        synchronized (this.initLock) {
            if (isInitialized()) {
                com.onesignal.debug.internal.logging.b.log(cVar, "initWithContext: SDK already initialized");
                return true;
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            if (!androidUtils.isAndroidUserUnlocked(context)) {
                com.onesignal.debug.internal.logging.b.warn$default("initWithContext called when device storage is locked, no user data is accessible!", null, 2, null);
                return false;
            }
            com.onesignal.debug.internal.logging.b.log(cVar, "initWithContext: SDK initializing");
            qa.c.INSTANCE.ensureNoObfuscatedPrefStore(context);
            ea.f fVar = (ea.f) this.services.getService(ea.f.class);
            fVar.getClass();
            ((com.onesignal.core.internal.application.impl.a) fVar).start(context);
            com.onesignal.debug.internal.logging.b.INSTANCE.setApplicationService(fVar);
            this.configModel = (com.onesignal.core.internal.config.a) ((com.onesignal.core.internal.config.b) this.services.getService(com.onesignal.core.internal.config.b.class)).getModel();
            this.sessionModel = (c) ((sc.d) this.services.getService(sc.d.class)).getModel();
            this.operationRepo = (f) this.services.getService(f.class);
            if (str == null) {
                com.onesignal.core.internal.config.a aVar = this.configModel;
                aVar.getClass();
                if (!aVar.hasProperty("appId")) {
                    String legacyAppId = getLegacyAppId();
                    if (legacyAppId == null) {
                        com.onesignal.debug.internal.logging.b.warn$default("initWithContext called without providing appId, and no appId has been established!", null, 2, null);
                        return false;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("initWithContext: using cached legacy appId ".concat(legacyAppId), null, 2, null);
                    com.onesignal.core.internal.config.a aVar2 = this.configModel;
                    aVar2.getClass();
                    aVar2.setAppId(legacyAppId);
                    z10 = true;
                    if (str != null) {
                        com.onesignal.core.internal.config.a aVar3 = this.configModel;
                        aVar3.getClass();
                        if (aVar3.hasProperty("appId")) {
                            com.onesignal.core.internal.config.a aVar4 = this.configModel;
                            aVar4.getClass();
                        }
                        z10 = true;
                        com.onesignal.core.internal.config.a aVar5 = this.configModel;
                        aVar5.getClass();
                        aVar5.setAppId(str);
                    }
                    if (this._consentRequired != null) {
                        com.onesignal.core.internal.config.a aVar6 = this.configModel;
                        aVar6.getClass();
                        Boolean bool = this._consentRequired;
                        bool.getClass();
                        aVar6.setConsentRequired(bool);
                    }
                    if (this._consentGiven != null) {
                        com.onesignal.core.internal.config.a aVar7 = this.configModel;
                        aVar7.getClass();
                        Boolean bool2 = this._consentGiven;
                        bool2.getClass();
                        aVar7.setConsentGiven(bool2);
                    }
                    if (this._disableGMSMissingPrompt != null) {
                        com.onesignal.core.internal.config.a aVar8 = this.configModel;
                        aVar8.getClass();
                        Boolean bool3 = this._disableGMSMissingPrompt;
                        bool3.getClass();
                        aVar8.setDisableGMSMissingPrompt(bool3.booleanValue());
                    }
                    ra.c cVar2 = new ra.c(this.services);
                    cVar2.bootstrap();
                    if (!z10) {
                        yc.b identityModelStore = getIdentityModelStore();
                        identityModelStore.getClass();
                        if (((yc.a) identityModelStore.getModel()).hasProperty("onesignal_id")) {
                            StringBuilder sb2 = new StringBuilder("initWithContext: using cached user ");
                            yc.b identityModelStore2 = getIdentityModelStore();
                            identityModelStore2.getClass();
                            sb2.append(((yc.a) identityModelStore2.getModel()).getOnesignalId());
                            com.onesignal.debug.internal.logging.b.debug$default(sb2.toString(), null, 2, null);
                            cVar2.scheduleStart();
                            setInitialized(true);
                            return true;
                        }
                    }
                    qa.b preferencesService = getPreferencesService();
                    preferencesService.getClass();
                    string$default = qa.a.getString$default(preferencesService, "OneSignal", "GT_PLAYER_ID", null, 4, null);
                    if (string$default != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
                        createAndSwitchToNewUser$default(this, false, null, 3, null);
                        f fVar2 = this.operationRepo;
                        fVar2.getClass();
                        com.onesignal.core.internal.config.a aVar9 = this.configModel;
                        aVar9.getClass();
                        String appId = aVar9.getAppId();
                        yc.b identityModelStore3 = getIdentityModelStore();
                        identityModelStore3.getClass();
                        String onesignalId = ((yc.a) identityModelStore3.getModel()).getOnesignalId();
                        yc.b identityModelStore4 = getIdentityModelStore();
                        identityModelStore4.getClass();
                        e.enqueue$default(fVar2, new zc.f(appId, onesignalId, ((yc.a) identityModelStore4.getModel()).getExternalId(), null, 8, null), false, 2, null);
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating user linked to subscription ".concat(string$default), null, 2, null);
                        qa.b preferencesService2 = getPreferencesService();
                        preferencesService2.getClass();
                        String string$default2 = qa.a.getString$default(preferencesService2, "OneSignal", "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
                        if (string$default2 != null) {
                            JSONObject jSONObject = new JSONObject(string$default2);
                            Integer safeInt = com.onesignal.common.e.safeInt(jSONObject, "notification_types");
                            dd.d dVar = new dd.d();
                            dVar.setId(string$default);
                            dVar.setType(g.PUSH);
                            dd.f fVar3 = dd.f.NO_PERMISSION;
                            int value = fVar3.getValue();
                            if (safeInt != null) {
                            }
                            int value2 = dd.f.UNSUBSCRIBE.getValue();
                            if (safeInt != null) {
                            }
                            boolean z12 = true;
                            dVar.setOptedIn(z12);
                            String safeString = com.onesignal.common.e.safeString(jSONObject, "identifier");
                            if (safeString == null) {
                                safeString = "";
                            }
                            dVar.setAddress(safeString);
                            if (safeInt != null) {
                                dd.f fromInt = dd.f.Companion.fromInt(safeInt.intValue());
                                if (fromInt != null) {
                                    fVar3 = fromInt;
                                }
                                dVar.setStatus(fVar3);
                            } else {
                                dVar.setStatus(dd.f.SUBSCRIBED);
                            }
                            dVar.setSdk(h.INSTANCE.getSdkVersion());
                            String str2 = Build.VERSION.RELEASE;
                            str2.getClass();
                            dVar.setDeviceOS(str2);
                            String carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(((ea.f) this.services.getService(ea.f.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            dVar.setCarrier(carrierName);
                            String appVersion = androidUtils.getAppVersion(((ea.f) this.services.getService(ea.f.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            dVar.setAppVersion(appVersion);
                            com.onesignal.core.internal.config.a aVar10 = this.configModel;
                            aVar10.getClass();
                            aVar10.setPushSubscriptionId(string$default);
                            dd.e subscriptionModelStore = getSubscriptionModelStore();
                            subscriptionModelStore.getClass();
                            subscriptionModelStore.add(dVar, "NO_PROPOGATE");
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        createAndSwitchToNewUser$default(this, z11, null, 2, null);
                        f fVar4 = this.operationRepo;
                        fVar4.getClass();
                        com.onesignal.core.internal.config.a aVar11 = this.configModel;
                        aVar11.getClass();
                        String appId2 = aVar11.getAppId();
                        yc.b identityModelStore5 = getIdentityModelStore();
                        identityModelStore5.getClass();
                        e.enqueue$default(fVar4, new zc.e(appId2, ((yc.a) identityModelStore5.getModel()).getOnesignalId(), string$default), false, 2, null);
                        qa.b preferencesService3 = getPreferencesService();
                        preferencesService3.getClass();
                        preferencesService3.saveString("OneSignal", "GT_PLAYER_ID", null);
                    }
                    cVar2.scheduleStart();
                    setInitialized(true);
                    return true;
                }
            }
            z10 = false;
            if (str != null) {
            }
            if (this._consentRequired != null) {
            }
            if (this._consentGiven != null) {
            }
            if (this._disableGMSMissingPrompt != null) {
            }
            ra.c cVar22 = new ra.c(this.services);
            cVar22.bootstrap();
            if (!z10) {
            }
            qa.b preferencesService4 = getPreferencesService();
            preferencesService4.getClass();
            string$default = qa.a.getString$default(preferencesService4, "OneSignal", "GT_PLAYER_ID", null, 4, null);
            if (string$default != null) {
            }
            cVar22.scheduleStart();
            setInitialized(true);
            return true;
        }
    }

    public boolean isInitialized() {
        return this.isInitialized;
    }

    @Override // v9.a
    public void login(String str, String str2) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "login(externalId: " + str + ", jwtBearerToken: " + str2 + ')');
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before 'login'");
        }
        b0 b0Var = new b0();
        b0 b0Var2 = new b0();
        b0 b0Var3 = new b0();
        b0Var3.f10141d = "";
        synchronized (this.loginLock) {
            yc.b identityModelStore = getIdentityModelStore();
            identityModelStore.getClass();
            b0Var.f10141d = ((yc.a) identityModelStore.getModel()).getExternalId();
            yc.b identityModelStore2 = getIdentityModelStore();
            identityModelStore2.getClass();
            b0Var2.f10141d = ((yc.a) identityModelStore2.getModel()).getOnesignalId();
            if (Intrinsics.a(b0Var.f10141d, str)) {
                return;
            }
            createAndSwitchToNewUser$default(this, false, new C0039a(str), 1, null);
            yc.b identityModelStore3 = getIdentityModelStore();
            identityModelStore3.getClass();
            b0Var3.f10141d = ((yc.a) identityModelStore3.getModel()).getOnesignalId();
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(b0Var3, str, b0Var, b0Var2, null), 1, null);
        }
    }

    public void logout() {
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "logout()");
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before 'logout'");
        }
        synchronized (this.loginLock) {
            yc.b identityModelStore = getIdentityModelStore();
            identityModelStore.getClass();
            if (((yc.a) identityModelStore.getModel()).getExternalId() == null) {
                return;
            }
            createAndSwitchToNewUser$default(this, false, null, 3, null);
            f fVar = this.operationRepo;
            fVar.getClass();
            com.onesignal.core.internal.config.a aVar = this.configModel;
            aVar.getClass();
            String appId = aVar.getAppId();
            yc.b identityModelStore2 = getIdentityModelStore();
            identityModelStore2.getClass();
            String onesignalId = ((yc.a) identityModelStore2.getModel()).getOnesignalId();
            yc.b identityModelStore3 = getIdentityModelStore();
            identityModelStore3.getClass();
            e.enqueue$default(fVar, new zc.f(appId, onesignalId, ((yc.a) identityModelStore3.getModel()).getExternalId(), null, 8, null), false, 2, null);
        }
    }

    public void setConsentGiven(boolean z10) {
        f fVar;
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z10);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar != null) {
            aVar.setConsentGiven(Boolean.valueOf(z10));
        }
        if (Intrinsics.a(bool, Boolean.valueOf(z10)) || !z10 || (fVar = this.operationRepo) == null) {
            return;
        }
        fVar.forceExecuteOperations();
    }

    public void setConsentRequired(boolean z10) {
        this._consentRequired = Boolean.valueOf(z10);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setConsentRequired(Boolean.valueOf(z10));
    }

    public void setDisableGMSMissingPrompt(boolean z10) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z10);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setDisableGMSMissingPrompt(z10);
    }

    public void setInitialized(boolean z10) {
        this.isInitialized = z10;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.internal.a$a, reason: collision with other inner class name */
    public static final class C0039a extends p implements Function2 {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0039a(String str) {
            super(2);
            this.$externalId = str;
        }

        public final void invoke(yc.a aVar, com.onesignal.user.internal.properties.a aVar2) {
            aVar.getClass();
            aVar2.getClass();
            aVar.setExternalId(this.$externalId);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((yc.a) obj, (com.onesignal.user.internal.properties.a) obj2);
            return Unit.f5554a;
        }
    }

    @Override // v9.a
    public void login(String str) {
        str.getClass();
        login(str, null);
    }
}
