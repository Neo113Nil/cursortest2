package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.common.AndroidUtils;
import java.io.IOException;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class e implements Z2.b, com.onesignal.notifications.internal.registration.impl.c {
    public static final a Companion = new a(null);
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private com.onesignal.core.internal.config.c _configModelStore;
    private final Y1.c _deviceService;
    private final com.onesignal.notifications.internal.registration.impl.a _upgradePrompt;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC0607c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.attemptRegistration(null, 0, this);
        }
    }

    public static final class c extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.internalRegisterForPush(null, this);
        }
    }

    public static final class d extends AbstractC0607c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.registerInBackground(null, this);
        }
    }

    public e(Y1.c _deviceService, com.onesignal.core.internal.config.c _configModelStore, com.onesignal.notifications.internal.registration.impl.a _upgradePrompt) {
        i.e(_deviceService, "_deviceService");
        i.e(_configModelStore, "_configModelStore");
        i.e(_upgradePrompt, "_upgradePrompt");
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
    public final Object attemptRegistration(String str, int i7, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i8;
        e eVar;
        String rootCauseMessage;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i9 = bVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.label = i9 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i8 = bVar.label;
                if (i8 != 0) {
                    AbstractC0676f.w(obj);
                    try {
                        bVar.L$0 = this;
                        bVar.I$0 = i7;
                        bVar.label = 1;
                        obj = getToken(str, bVar);
                        if (obj == enumC0580a) {
                            return enumC0580a;
                        }
                        eVar = this;
                    } catch (IOException e4) {
                        e = e4;
                        eVar = this;
                        w3.f pushStatusFromThrowable = eVar.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage)) {
                        }
                        Exception exc = new Exception(e);
                        if (i7 < 4) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        eVar = this;
                        com.onesignal.debug.internal.logging.b.warn("Unknown error getting " + eVar.getProviderName() + " Token", th);
                        return new Z2.a(null, w3.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = bVar.I$0;
                    eVar = (e) bVar.L$0;
                    try {
                        AbstractC0676f.w(obj);
                    } catch (IOException e7) {
                        e = e7;
                        w3.f pushStatusFromThrowable2 = eVar.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage) && !"AUTHENTICATION_FAILED".equals(rootCauseMessage)) {
                            com.onesignal.debug.internal.logging.b.warn("Error Getting " + eVar.getProviderName() + " Token", new Exception(e));
                            return new Z2.a(null, pushStatusFromThrowable2);
                        }
                        Exception exc2 = new Exception(e);
                        if (i7 < 4) {
                            com.onesignal.debug.internal.logging.b.info("Retry count of 5 exceed! Could not get a " + eVar.getProviderName() + " Token.", exc2);
                        } else {
                            com.onesignal.debug.internal.logging.b.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i7, exc2);
                            if (i7 == 2) {
                                return new Z2.a(null, pushStatusFromThrowable2);
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        com.onesignal.debug.internal.logging.b.warn("Unknown error getting " + eVar.getProviderName() + " Token", th);
                        return new Z2.a(null, w3.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                }
                String str2 = (String) obj;
                com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str2, null, 2, null);
                return new Z2.a(str2, w3.f.SUBSCRIBED);
            }
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i8 = bVar.label;
        if (i8 != 0) {
        }
        String str22 = (String) obj2;
        com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str22, null, 2, null);
        return new Z2.a(str22, w3.f.SUBSCRIBED);
    }

    public static /* synthetic */ Object fireCallback$suspendImpl(e eVar, String str, InterfaceC0564d interfaceC0564d) {
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
    public final Object internalRegisterForPush(String str, InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        try {
            if (interfaceC0564d instanceof c) {
                cVar = (c) interfaceC0564d;
                int i8 = cVar.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i8 - Integer.MIN_VALUE;
                    Object obj = cVar.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = cVar.label;
                    if (i7 == 0) {
                        if (i7 == 1) {
                            AbstractC0676f.w(obj);
                            return (Z2.a) obj;
                        }
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        com.onesignal.debug.internal.logging.b.warn$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new Z2.a(null, w3.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    }
                    AbstractC0676f.w(obj);
                    try {
                        if (this._deviceService.isGMSInstalledAndEnabled()) {
                            cVar.L$0 = this;
                            cVar.label = 1;
                            obj = registerInBackground(str, cVar);
                            if (obj != enumC0580a) {
                                return (Z2.a) obj;
                            }
                        } else {
                            com.onesignal.notifications.internal.registration.impl.a aVar = this._upgradePrompt;
                            cVar.L$0 = this;
                            cVar.label = 2;
                            if (aVar.showUpdateGPSDialog(cVar) != enumC0580a) {
                                com.onesignal.debug.internal.logging.b.warn$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                                return new Z2.a(null, w3.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                            }
                        }
                        return enumC0580a;
                    } catch (Throwable th) {
                        th = th;
                        str = this;
                        com.onesignal.debug.internal.logging.b.warn("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                        return new Z2.a(null, w3.f.FIREBASE_FCM_INIT_ERROR);
                    }
                }
            }
            if (i7 == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        cVar = new c(interfaceC0564d);
        Object obj2 = cVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar.label;
    }

    private final boolean isValidProjectNumber(String str) {
        try {
            i.b(str);
            Float.parseFloat(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final w3.f pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(th);
        return th instanceof IOException ? i.a(rootCauseMessage, "SERVICE_NOT_AVAILABLE") ? w3.f.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE : i.a(rootCauseMessage, "AUTHENTICATION_FAILED") ? w3.f.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : w3.f.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER : w3.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    }

    public static /* synthetic */ Object registerForPush$suspendImpl(e eVar, InterfaceC0564d interfaceC0564d) {
        if (!((com.onesignal.core.internal.config.b) eVar._configModelStore.getModel()).isInitializedWithRemote()) {
            return new Z2.a(null, w3.f.FIREBASE_FCM_INIT_ERROR);
        }
        if (!eVar._deviceService.getHasFCMLibrary()) {
            com.onesignal.debug.internal.logging.b.warn$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new Z2.a(null, w3.f.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!eVar.isValidProjectNumber(((com.onesignal.core.internal.config.b) eVar._configModelStore.getModel()).getGoogleProjectNumber())) {
            com.onesignal.debug.internal.logging.b.warn$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new Z2.a(null, w3.f.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = ((com.onesignal.core.internal.config.b) eVar._configModelStore.getModel()).getGoogleProjectNumber();
        i.b(googleProjectNumber);
        return eVar.internalRegisterForPush(googleProjectNumber, interfaceC0564d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (H5.AbstractC0165z.d(r6, r0) == r1) goto L28;
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
    public final Object registerInBackground(String str, InterfaceC0564d interfaceC0564d) {
        d dVar;
        int i7;
        int i8;
        e eVar;
        int i9;
        e eVar2;
        String str2;
        Z2.a aVar;
        if (interfaceC0564d instanceof d) {
            dVar = (d) interfaceC0564d;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = dVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    i8 = 0;
                    eVar = this;
                    if (i8 < REGISTRATION_RETRY_COUNT) {
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i9 = dVar.I$0;
                        str2 = (String) dVar.L$1;
                        eVar2 = (e) dVar.L$0;
                        AbstractC0676f.w(obj);
                        i8 = i9 + 1;
                        str = str2;
                        eVar = eVar2;
                        if (i8 < REGISTRATION_RETRY_COUNT) {
                            return new Z2.a(null, w3.f.FIREBASE_FCM_INIT_ERROR);
                        }
                        dVar.L$0 = eVar;
                        dVar.L$1 = str;
                        dVar.I$0 = i8;
                        dVar.label = 1;
                        Object attemptRegistration = eVar.attemptRegistration(str, i8, dVar);
                        if (attemptRegistration != enumC0580a) {
                            e eVar3 = eVar;
                            str2 = str;
                            i9 = i8;
                            obj = attemptRegistration;
                            eVar2 = eVar3;
                            aVar = (Z2.a) obj;
                            if (aVar == null) {
                                return aVar;
                            }
                            long j4 = (i9 + 1) * REGISTRATION_RETRY_BACKOFF_MS;
                            dVar.L$0 = eVar2;
                            dVar.L$1 = str2;
                            dVar.I$0 = i9;
                            dVar.label = 2;
                        }
                        return enumC0580a;
                    }
                    i9 = dVar.I$0;
                    str2 = (String) dVar.L$1;
                    eVar2 = (e) dVar.L$0;
                    AbstractC0676f.w(obj);
                    aVar = (Z2.a) obj;
                    if (aVar == null) {
                    }
                }
            }
        }
        dVar = new d(interfaceC0564d);
        Object obj2 = dVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = dVar.label;
        if (i7 != 0) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, InterfaceC0564d interfaceC0564d) {
        return fireCallback$suspendImpl(this, str, interfaceC0564d);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, InterfaceC0564d interfaceC0564d);

    @Override // Z2.b
    public Object registerForPush(InterfaceC0564d interfaceC0564d) {
        return registerForPush$suspendImpl(this, interfaceC0564d);
    }
}
