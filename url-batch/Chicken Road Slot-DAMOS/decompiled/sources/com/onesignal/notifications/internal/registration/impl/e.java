package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.common.AndroidUtils;
import java.io.IOException;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e implements kc.b, com.onesignal.notifications.internal.registration.impl.c {
    public static final a Companion = new a(null);
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private com.onesignal.core.internal.config.b _configModelStore;
    private final ja.c _deviceService;
    private final com.onesignal.notifications.internal.registration.impl.a _upgradePrompt;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.attemptRegistration(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.internalRegisterForPush(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.registerInBackground(null, this);
        }
    }

    public e(ja.c cVar, com.onesignal.core.internal.config.b bVar, com.onesignal.notifications.internal.registration.impl.a aVar) {
        cVar.getClass();
        bVar.getClass();
        aVar.getClass();
        this._deviceService = cVar;
        this._configModelStore = bVar;
        this._upgradePrompt = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptRegistration(String str, int i3, ld.a aVar) {
        b bVar;
        int i10;
        e eVar;
        String rootCauseMessage;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar2 = md.a.f6622d;
                i10 = bVar.label;
                if (i10 != 0) {
                    cf.c.M(obj);
                    try {
                        bVar.L$0 = this;
                        bVar.I$0 = i3;
                        bVar.label = 1;
                        obj = getToken(str, bVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        eVar = this;
                    } catch (IOException e2) {
                        e = e2;
                        eVar = this;
                        dd.f pushStatusFromThrowable = eVar.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage)) {
                        }
                        Exception exc = new Exception(e);
                        if (i3 < 4) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        eVar = this;
                        com.onesignal.debug.internal.logging.b.error("Unknown error getting " + eVar.getProviderName() + " Token", th);
                        return new kc.a(null, dd.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                } else {
                    if (i10 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = bVar.I$0;
                    eVar = (e) bVar.L$0;
                    try {
                        cf.c.M(obj);
                    } catch (IOException e9) {
                        e = e9;
                        dd.f pushStatusFromThrowable2 = eVar.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage) && !"AUTHENTICATION_FAILED".equals(rootCauseMessage)) {
                            com.onesignal.debug.internal.logging.b.error("Error Getting " + eVar.getProviderName() + " Token", new Exception(e));
                            return new kc.a(null, pushStatusFromThrowable2);
                        }
                        Exception exc2 = new Exception(e);
                        if (i3 < 4) {
                            com.onesignal.debug.internal.logging.b.error("Retry count of 5 exceed! Could not get a " + eVar.getProviderName() + " Token.", exc2);
                        } else {
                            com.onesignal.debug.internal.logging.b.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i3, exc2);
                            if (i3 == 2) {
                                return new kc.a(null, pushStatusFromThrowable2);
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        com.onesignal.debug.internal.logging.b.error("Unknown error getting " + eVar.getProviderName() + " Token", th);
                        return new kc.a(null, dd.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                }
                String str2 = (String) obj;
                com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str2, null, 2, null);
                return new kc.a(str2, dd.f.SUBSCRIBED);
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar22 = md.a.f6622d;
        i10 = bVar.label;
        if (i10 != 0) {
        }
        String str22 = (String) obj2;
        com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str22, null, 2, null);
        return new kc.a(str22, dd.f.SUBSCRIBED);
    }

    public static /* synthetic */ Object fireCallback$suspendImpl(e eVar, String str, ld.a aVar) {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.onesignal.notifications.internal.registration.impl.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.onesignal.notifications.internal.registration.impl.e] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalRegisterForPush(String str, ld.a aVar) {
        c cVar;
        int i3;
        try {
            if (aVar instanceof c) {
                cVar = (c) aVar;
                int i10 = cVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i10 - Integer.MIN_VALUE;
                    Object obj = cVar.result;
                    md.a aVar2 = md.a.f6622d;
                    i3 = cVar.label;
                    if (i3 == 0) {
                        if (i3 == 1) {
                            cf.c.M(obj);
                            return (kc.a) obj;
                        }
                        if (i3 != 2) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                        com.onesignal.debug.internal.logging.b.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new kc.a(null, dd.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    }
                    cf.c.M(obj);
                    try {
                        if (this._deviceService.isGMSInstalledAndEnabled()) {
                            cVar.L$0 = this;
                            cVar.label = 1;
                            obj = registerInBackground(str, cVar);
                            if (obj != aVar2) {
                                return (kc.a) obj;
                            }
                        } else {
                            com.onesignal.notifications.internal.registration.impl.a aVar3 = this._upgradePrompt;
                            cVar.L$0 = this;
                            cVar.label = 2;
                            if (aVar3.showUpdateGPSDialog(cVar) != aVar2) {
                                com.onesignal.debug.internal.logging.b.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                                return new kc.a(null, dd.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                            }
                        }
                        return aVar2;
                    } catch (Throwable th) {
                        th = th;
                        str = this;
                        com.onesignal.debug.internal.logging.b.error("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                        return new kc.a(null, dd.f.FIREBASE_FCM_INIT_ERROR);
                    }
                }
            }
            if (i3 == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        cVar = new c(aVar);
        Object obj2 = cVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = cVar.label;
    }

    private final boolean isValidProjectNumber(String str) {
        try {
            str.getClass();
            Float.parseFloat(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final dd.f pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(th);
        return th instanceof IOException ? Intrinsics.a(rootCauseMessage, "SERVICE_NOT_AVAILABLE") ? dd.f.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE : Intrinsics.a(rootCauseMessage, "AUTHENTICATION_FAILED") ? dd.f.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : dd.f.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER : dd.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    }

    public static /* synthetic */ Object registerForPush$suspendImpl(e eVar, ld.a aVar) {
        if (!((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).isInitializedWithRemote()) {
            return new kc.a(null, dd.f.FIREBASE_FCM_INIT_ERROR);
        }
        if (!eVar._deviceService.getHasFCMLibrary()) {
            com.onesignal.debug.internal.logging.b.fatal$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new kc.a(null, dd.f.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!eVar.isValidProjectNumber(((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).getGoogleProjectNumber())) {
            com.onesignal.debug.internal.logging.b.error$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new kc.a(null, dd.f.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = ((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).getGoogleProjectNumber();
        googleProjectNumber.getClass();
        return eVar.internalRegisterForPush(googleProjectNumber, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (ge.a0.i(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:11:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerInBackground(String str, ld.a aVar) {
        d dVar;
        int i3;
        int i10;
        e eVar;
        int i11;
        e eVar2;
        String str2;
        kc.a aVar2;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i12 = dVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.label = i12 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                md.a aVar3 = md.a.f6622d;
                i3 = dVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    i10 = 0;
                    eVar = this;
                    if (i10 < 5) {
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i11 = dVar.I$0;
                        str2 = (String) dVar.L$1;
                        eVar2 = (e) dVar.L$0;
                        cf.c.M(obj);
                        i10 = i11 + 1;
                        str = str2;
                        eVar = eVar2;
                        if (i10 < 5) {
                            return new kc.a(null, dd.f.FIREBASE_FCM_INIT_ERROR);
                        }
                        dVar.L$0 = eVar;
                        dVar.L$1 = str;
                        dVar.I$0 = i10;
                        dVar.label = 1;
                        Object attemptRegistration = eVar.attemptRegistration(str, i10, dVar);
                        if (attemptRegistration != aVar3) {
                            e eVar3 = eVar;
                            str2 = str;
                            i11 = i10;
                            obj = attemptRegistration;
                            eVar2 = eVar3;
                            aVar2 = (kc.a) obj;
                            if (aVar2 == null) {
                                return aVar2;
                            }
                            long j = (i11 + 1) * REGISTRATION_RETRY_BACKOFF_MS;
                            dVar.L$0 = eVar2;
                            dVar.L$1 = str2;
                            dVar.I$0 = i11;
                            dVar.label = 2;
                        }
                        return aVar3;
                    }
                    i11 = dVar.I$0;
                    str2 = (String) dVar.L$1;
                    eVar2 = (e) dVar.L$0;
                    cf.c.M(obj);
                    aVar2 = (kc.a) obj;
                    if (aVar2 == null) {
                    }
                }
            }
        }
        dVar = new d(aVar);
        Object obj2 = dVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = dVar.label;
        if (i3 != 0) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, ld.a aVar) {
        return fireCallback$suspendImpl(this, str, aVar);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, ld.a aVar);

    @Override // kc.b
    public Object registerForPush(ld.a aVar) {
        return registerForPush$suspendImpl(this, aVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
