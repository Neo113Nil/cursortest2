package com.onesignal.notifications.internal.registration.impl;

import X5.j;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class g implements B3.b, com.onesignal.notifications.internal.registration.impl.c {
    public static final a Companion = new a(null);
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final v2.f _applicationService;
    private final A2.c _deviceService;
    private com.onesignal.common.threading.e waiter;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends X5.c {
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
            return g.this.getHMSTokenTask(null, this);
        }
    }

    public static final class c extends j implements Function2 {
        final /* synthetic */ D $pushToken;
        Object L$0;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(D d7, g gVar, V5.b bVar) {
            super(2, bVar);
            this.$pushToken = d7;
            this.this$0 = gVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new c(this.$pushToken, this.this$0, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            D d7;
            String str;
            D d8;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                d7 = this.$pushToken;
                com.onesignal.common.threading.e eVar = this.this$0.waiter;
                if (eVar == null) {
                    str = null;
                    d7.f6152d = str;
                    return Unit.f6114a;
                }
                this.L$0 = d7;
                this.label = 1;
                Object waitForWake = eVar.waitForWake(this);
                if (waitForWake == aVar) {
                    return aVar;
                }
                d8 = d7;
                obj = waitForWake;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d8 = (D) this.L$0;
                V6.b.P(obj);
            }
            D d9 = d8;
            str = (String) obj;
            d7 = d9;
            d7.f6152d = str;
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((c) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class d extends X5.c {
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.registerForPush(this);
        }
    }

    public g(A2.c _deviceService, v2.f _applicationService) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
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
    public final Object getHMSTokenTask(Context context, V5.b bVar) {
        b bVar2;
        int i2;
        D d7;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar = W5.a.f2787d;
                i2 = bVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                        return new B3.a(null, Y3.f.MISSING_HMS_PUSHKIT_LIBRARY);
                    }
                    this.waiter = new com.onesignal.common.threading.e();
                    String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
                    HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
                    D d8 = new D();
                    String token = hmsInstanceId.getToken(string, "HCM");
                    d8.f6152d = token;
                    if (!TextUtils.isEmpty(token)) {
                        com.onesignal.debug.internal.logging.b.info$default("Device registered for HMS, push token = " + ((String) d8.f6152d), null, 2, null);
                        return new B3.a((String) d8.f6152d, Y3.f.SUBSCRIBED);
                    }
                    c cVar = new c(d8, this, null);
                    bVar2.L$0 = d8;
                    bVar2.label = 1;
                    if (AbstractC0792z.u(30000L, cVar, bVar2) == aVar) {
                        return aVar;
                    }
                    d7 = d8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d7 = (D) bVar2.L$0;
                    V6.b.P(obj);
                }
                if (d7.f6152d != null) {
                    com.onesignal.debug.internal.logging.b.warn$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
                    return new B3.a(null, Y3.f.HMS_TOKEN_TIMEOUT);
                }
                com.onesignal.debug.internal.logging.b.debug$default("HMS registered with ID:" + ((String) d7.f6152d), null, 2, null);
                return new B3.a((String) d7.f6152d, Y3.f.SUBSCRIBED);
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = bVar2.label;
        if (i2 != 0) {
        }
        if (d7.f6152d != null) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, V5.b bVar) {
        com.onesignal.common.threading.e eVar = this.waiter;
        if (eVar != null) {
            eVar.wake(str);
        }
        return Unit.f6114a;
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
    
        r5 = Y3.f.HMS_ARGUMENTS_INVALID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r5 = new B3.a(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r5 = Y3.f.HMS_API_EXCEPTION_OTHER;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // B3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(V5.b bVar) {
        d dVar;
        int i2;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i5 = dVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar.label = i5 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                Object obj2 = W5.a.f2787d;
                i2 = dVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    Context appContext = this._applicationService.getAppContext();
                    dVar.label = 1;
                    obj = getHMSTokenTask(appContext, dVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                B3.a aVar = (B3.a) obj;
                Intrinsics.b(aVar);
                return aVar;
            }
        }
        dVar = new d(bVar);
        Object obj3 = dVar.result;
        Object obj22 = W5.a.f2787d;
        i2 = dVar.label;
        if (i2 != 0) {
        }
        B3.a aVar2 = (B3.a) obj3;
        Intrinsics.b(aVar2);
        return aVar2;
    }
}
