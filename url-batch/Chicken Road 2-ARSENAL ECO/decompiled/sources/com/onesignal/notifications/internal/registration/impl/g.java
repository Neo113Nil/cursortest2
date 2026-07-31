package com.onesignal.notifications.internal.registration.impl;

import H5.AbstractC0165z;
import H5.InterfaceC0163x;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class g implements Z2.b, com.onesignal.notifications.internal.registration.impl.c {
    public static final a Companion = new a(null);
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final T1.f _applicationService;
    private final Y1.c _deviceService;
    private com.onesignal.common.threading.d waiter;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC0607c {
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
            return g.this.getHMSTokenTask(null, this);
        }
    }

    public static final class c extends q5.g implements InterfaceC0747p {
        final /* synthetic */ s $pushToken;
        Object L$0;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar, g gVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$pushToken = sVar;
            this.this$0 = gVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new c(this.$pushToken, this.this$0, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            s sVar;
            String str;
            s sVar2;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                sVar = this.$pushToken;
                com.onesignal.common.threading.d dVar = this.this$0.waiter;
                if (dVar == null) {
                    str = null;
                    sVar.f5233f = str;
                    return v.f5219a;
                }
                this.L$0 = sVar;
                this.label = 1;
                Object waitForWake = dVar.waitForWake(this);
                if (waitForWake == enumC0580a) {
                    return enumC0580a;
                }
                sVar2 = sVar;
                obj = waitForWake;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar2 = (s) this.L$0;
                AbstractC0676f.w(obj);
            }
            s sVar3 = sVar2;
            str = (String) obj;
            sVar = sVar3;
            sVar.f5233f = str;
            return v.f5219a;
        }
    }

    public static final class d extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.registerForPush(this);
        }
    }

    public g(Y1.c _deviceService, T1.f _applicationService) {
        i.e(_deviceService, "_deviceService");
        i.e(_applicationService, "_applicationService");
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getHMSTokenTask(Context context, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        s sVar;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                        return new Z2.a(null, w3.f.MISSING_HMS_PUSHKIT_LIBRARY);
                    }
                    this.waiter = new com.onesignal.common.threading.d();
                    String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
                    HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
                    s sVar2 = new s();
                    String token = hmsInstanceId.getToken(string, "HCM");
                    sVar2.f5233f = token;
                    if (!TextUtils.isEmpty(token)) {
                        com.onesignal.debug.internal.logging.b.info$default("Device registered for HMS, push token = " + ((String) sVar2.f5233f), null, 2, null);
                        return new Z2.a((String) sVar2.f5233f, w3.f.SUBSCRIBED);
                    }
                    c cVar = new c(sVar2, this, null);
                    bVar.L$0 = sVar2;
                    bVar.label = 1;
                    if (AbstractC0165z.u(30000L, cVar, bVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    sVar = sVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) bVar.L$0;
                    AbstractC0676f.w(obj);
                }
                if (sVar.f5233f != null) {
                    com.onesignal.debug.internal.logging.b.warn$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
                    return new Z2.a(null, w3.f.HMS_TOKEN_TIMEOUT);
                }
                com.onesignal.debug.internal.logging.b.debug$default("HMS registered with ID:" + ((String) sVar.f5233f), null, 2, null);
                return new Z2.a((String) sVar.f5233f, w3.f.SUBSCRIBED);
            }
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
        if (i7 != 0) {
        }
        if (sVar.f5233f != null) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, InterfaceC0564d interfaceC0564d) {
        com.onesignal.common.threading.d dVar = this.waiter;
        if (dVar != null) {
            dVar.wake(str);
        }
        return v.f5219a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|28|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        com.onesignal.debug.internal.logging.b.error("HMS ApiException getting Huawei push token!", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r5.getStatusCode() == 907135000) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r5 = w3.f.HMS_ARGUMENTS_INVALID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r5 = new Z2.a(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r5 = w3.f.HMS_API_EXCEPTION_OTHER;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // Z2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(InterfaceC0564d interfaceC0564d) {
        d dVar;
        int i7;
        if (interfaceC0564d instanceof d) {
            dVar = (d) interfaceC0564d;
            int i8 = dVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.label = i8 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                Object obj2 = EnumC0580a.f5697f;
                i7 = dVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    Context appContext = this._applicationService.getAppContext();
                    dVar.label = 1;
                    obj = getHMSTokenTask(appContext, dVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                Z2.a aVar = (Z2.a) obj;
                i.b(aVar);
                return aVar;
            }
        }
        dVar = new d(interfaceC0564d);
        Object obj3 = dVar.result;
        Object obj22 = EnumC0580a.f5697f;
        i7 = dVar.label;
        if (i7 != 0) {
        }
        Z2.a aVar2 = (Z2.a) obj3;
        i.b(aVar2);
        return aVar2;
    }
}
