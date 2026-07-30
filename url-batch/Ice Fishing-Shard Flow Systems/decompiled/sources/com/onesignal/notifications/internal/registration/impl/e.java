package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.common.AndroidUtils;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e implements B3.b, com.onesignal.notifications.internal.registration.impl.c {
    public static final a Companion = new a(null);
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private com.onesignal.core.internal.config.c _configModelStore;
    private final A2.c _deviceService;
    private final com.onesignal.notifications.internal.registration.impl.a _upgradePrompt;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends X5.c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.attemptRegistration(null, 0, this);
        }
    }

    public static final class c extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.internalRegisterForPush(null, this);
        }
    }

    public static final class d extends X5.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.registerInBackground(null, this);
        }
    }

    public e(A2.c _deviceService, com.onesignal.core.internal.config.c _configModelStore, com.onesignal.notifications.internal.registration.impl.a _upgradePrompt) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_upgradePrompt, "_upgradePrompt");
        this._deviceService = _deviceService;
        this._configModelStore = _configModelStore;
        this._upgradePrompt = _upgradePrompt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptRegistration(String str, int i2, V5.b bVar) {
        b bVar2;
        int i5;
        e eVar;
        String rootCauseMessage;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i7 = bVar2.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i7 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar = W5.a.f2787d;
                i5 = bVar2.label;
                if (i5 != 0) {
                    V6.b.P(obj);
                    try {
                        bVar2.L$0 = this;
                        bVar2.I$0 = i2;
                        bVar2.label = 1;
                        obj = getToken(str, bVar2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        eVar = this;
                    } catch (IOException e7) {
                        e = e7;
                        eVar = this;
                        Y3.f pushStatusFromThrowable = eVar.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage)) {
                        }
                        Exception exc = new Exception(e);
                        if (i2 < 4) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        eVar = this;
                        com.onesignal.debug.internal.logging.b.warn("Unknown error getting " + eVar.getProviderName() + " Token", th);
                        return new B3.a(null, Y3.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = bVar2.I$0;
                    eVar = (e) bVar2.L$0;
                    try {
                        V6.b.P(obj);
                    } catch (IOException e8) {
                        e = e8;
                        Y3.f pushStatusFromThrowable2 = eVar.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage) && !"AUTHENTICATION_FAILED".equals(rootCauseMessage)) {
                            com.onesignal.debug.internal.logging.b.warn("Error Getting " + eVar.getProviderName() + " Token", new Exception(e));
                            return new B3.a(null, pushStatusFromThrowable2);
                        }
                        Exception exc2 = new Exception(e);
                        if (i2 < 4) {
                            com.onesignal.debug.internal.logging.b.info("Retry count of 5 exceed! Could not get a " + eVar.getProviderName() + " Token.", exc2);
                        } else {
                            com.onesignal.debug.internal.logging.b.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i2, exc2);
                            if (i2 == 2) {
                                return new B3.a(null, pushStatusFromThrowable2);
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        com.onesignal.debug.internal.logging.b.warn("Unknown error getting " + eVar.getProviderName() + " Token", th);
                        return new B3.a(null, Y3.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                }
                String str2 = (String) obj;
                com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str2, null, 2, null);
                return new B3.a(str2, Y3.f.SUBSCRIBED);
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar2 = W5.a.f2787d;
        i5 = bVar2.label;
        if (i5 != 0) {
        }
        String str22 = (String) obj2;
        com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str22, null, 2, null);
        return new B3.a(str22, Y3.f.SUBSCRIBED);
    }

    public static /* synthetic */ Object fireCallback$suspendImpl(e eVar, String str, V5.b bVar) {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.onesignal.notifications.internal.registration.impl.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.onesignal.notifications.internal.registration.impl.e] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalRegisterForPush(String str, V5.b bVar) {
        c cVar;
        int i2;
        try {
            if (bVar instanceof c) {
                cVar = (c) bVar;
                int i5 = cVar.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i5 - Integer.MIN_VALUE;
                    Object obj = cVar.result;
                    W5.a aVar = W5.a.f2787d;
                    i2 = cVar.label;
                    if (i2 == 0) {
                        if (i2 == 1) {
                            V6.b.P(obj);
                            return (B3.a) obj;
                        }
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        com.onesignal.debug.internal.logging.b.warn$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new B3.a(null, Y3.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    }
                    V6.b.P(obj);
                    try {
                        if (this._deviceService.isGMSInstalledAndEnabled()) {
                            cVar.L$0 = this;
                            cVar.label = 1;
                            obj = registerInBackground(str, cVar);
                            if (obj != aVar) {
                                return (B3.a) obj;
                            }
                        } else {
                            com.onesignal.notifications.internal.registration.impl.a aVar2 = this._upgradePrompt;
                            cVar.L$0 = this;
                            cVar.label = 2;
                            if (aVar2.showUpdateGPSDialog(cVar) != aVar) {
                                com.onesignal.debug.internal.logging.b.warn$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                                return new B3.a(null, Y3.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                            }
                        }
                        return aVar;
                    } catch (Throwable th) {
                        th = th;
                        str = this;
                        com.onesignal.debug.internal.logging.b.warn("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                        return new B3.a(null, Y3.f.FIREBASE_FCM_INIT_ERROR);
                    }
                }
            }
            if (i2 == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        cVar = new c(bVar);
        Object obj2 = cVar.result;
        W5.a aVar3 = W5.a.f2787d;
        i2 = cVar.label;
    }

    private final boolean isValidProjectNumber(String str) {
        try {
            Intrinsics.b(str);
            Float.parseFloat(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final Y3.f pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(th);
        return th instanceof IOException ? Intrinsics.a(rootCauseMessage, "SERVICE_NOT_AVAILABLE") ? Y3.f.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE : Intrinsics.a(rootCauseMessage, "AUTHENTICATION_FAILED") ? Y3.f.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : Y3.f.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER : Y3.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    }

    public static /* synthetic */ Object registerForPush$suspendImpl(e eVar, V5.b bVar) {
        if (!((com.onesignal.core.internal.config.b) eVar._configModelStore.getModel()).isInitializedWithRemote()) {
            return new B3.a(null, Y3.f.FIREBASE_FCM_INIT_ERROR);
        }
        if (!eVar._deviceService.getHasFCMLibrary()) {
            com.onesignal.debug.internal.logging.b.warn$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new B3.a(null, Y3.f.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!eVar.isValidProjectNumber(((com.onesignal.core.internal.config.b) eVar._configModelStore.getModel()).getGoogleProjectNumber())) {
            com.onesignal.debug.internal.logging.b.warn$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new B3.a(null, Y3.f.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = ((com.onesignal.core.internal.config.b) eVar._configModelStore.getModel()).getGoogleProjectNumber();
        Intrinsics.b(googleProjectNumber);
        return eVar.internalRegisterForPush(googleProjectNumber, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (n6.AbstractC0792z.d(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:11:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerInBackground(String str, V5.b bVar) {
        d dVar;
        int i2;
        int i5;
        e eVar;
        int i7;
        e eVar2;
        String str2;
        B3.a aVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i8 = dVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.label = i8 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = dVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    i5 = 0;
                    eVar = this;
                    if (i5 < 5) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i7 = dVar.I$0;
                        str2 = (String) dVar.L$1;
                        eVar2 = (e) dVar.L$0;
                        V6.b.P(obj);
                        i5 = i7 + 1;
                        str = str2;
                        eVar = eVar2;
                        if (i5 < 5) {
                            return new B3.a(null, Y3.f.FIREBASE_FCM_INIT_ERROR);
                        }
                        dVar.L$0 = eVar;
                        dVar.L$1 = str;
                        dVar.I$0 = i5;
                        dVar.label = 1;
                        Object attemptRegistration = eVar.attemptRegistration(str, i5, dVar);
                        if (attemptRegistration != aVar2) {
                            e eVar3 = eVar;
                            str2 = str;
                            i7 = i5;
                            obj = attemptRegistration;
                            eVar2 = eVar3;
                            aVar = (B3.a) obj;
                            if (aVar == null) {
                                return aVar;
                            }
                            long j = (i7 + 1) * REGISTRATION_RETRY_BACKOFF_MS;
                            dVar.L$0 = eVar2;
                            dVar.L$1 = str2;
                            dVar.I$0 = i7;
                            dVar.label = 2;
                        }
                        return aVar2;
                    }
                    i7 = dVar.I$0;
                    str2 = (String) dVar.L$1;
                    eVar2 = (e) dVar.L$0;
                    V6.b.P(obj);
                    aVar = (B3.a) obj;
                    if (aVar == null) {
                    }
                }
            }
        }
        dVar = new d(bVar);
        Object obj2 = dVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = dVar.label;
        if (i2 != 0) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, V5.b bVar) {
        return fireCallback$suspendImpl(this, str, bVar);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, V5.b bVar);

    @Override // B3.b
    public Object registerForPush(V5.b bVar) {
        return registerForPush$suspendImpl(this, bVar);
    }
}
