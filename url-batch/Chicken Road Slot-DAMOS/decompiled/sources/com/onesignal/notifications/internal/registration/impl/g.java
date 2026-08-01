package com.onesignal.notifications.internal.registration.impl;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import ge.a0;
import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.i;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements kc.b, com.onesignal.notifications.internal.registration.impl.c {
    public static final a Companion = new a(null);
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final ea.f _applicationService;
    private final ja.c _deviceService;
    private com.onesignal.common.threading.d waiter;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
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
            return g.this.getHMSTokenTask(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends i implements Function2 {
        final /* synthetic */ b0 $pushToken;
        Object L$0;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b0 b0Var, g gVar, ld.a aVar) {
            super(2, aVar);
            this.$pushToken = b0Var;
            this.this$0 = gVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new c(this.$pushToken, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var;
            String str;
            b0 b0Var2;
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                b0Var = this.$pushToken;
                com.onesignal.common.threading.d dVar = this.this$0.waiter;
                if (dVar == null) {
                    str = null;
                    b0Var.f10141d = str;
                    return Unit.f5554a;
                }
                this.L$0 = b0Var;
                this.label = 1;
                Object waitForWake = dVar.waitForWake(this);
                if (waitForWake == aVar) {
                    return aVar;
                }
                b0Var2 = b0Var;
                obj = waitForWake;
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var2 = (b0) this.L$0;
                cf.c.M(obj);
            }
            b0 b0Var3 = b0Var2;
            str = (String) obj;
            b0Var = b0Var3;
            b0Var.f10141d = str;
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.registerForPush(this);
        }
    }

    public g(ja.c cVar, ea.f fVar) {
        cVar.getClass();
        fVar.getClass();
        this._deviceService = cVar;
        this._applicationService = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getHMSTokenTask(Context context, ld.a aVar) {
        b bVar;
        int i3;
        b0 b0Var;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = bVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                        return new kc.a(null, dd.f.MISSING_HMS_PUSHKIT_LIBRARY);
                    }
                    this.waiter = new com.onesignal.common.threading.d();
                    String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
                    HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
                    b0 b0Var2 = new b0();
                    String token = hmsInstanceId.getToken(string, "HCM");
                    b0Var2.f10141d = token;
                    if (!TextUtils.isEmpty(token)) {
                        com.onesignal.debug.internal.logging.b.info$default("Device registered for HMS, push token = " + ((String) b0Var2.f10141d), null, 2, null);
                        return new kc.a((String) b0Var2.f10141d, dd.f.SUBSCRIBED);
                    }
                    c cVar = new c(b0Var2, this, null);
                    bVar.L$0 = b0Var2;
                    bVar.label = 1;
                    if (a0.C(30000L, cVar, bVar) == aVar2) {
                        return aVar2;
                    }
                    b0Var = b0Var2;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (b0) bVar.L$0;
                    cf.c.M(obj);
                }
                if (b0Var.f10141d != null) {
                    com.onesignal.debug.internal.logging.b.error$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
                    return new kc.a(null, dd.f.HMS_TOKEN_TIMEOUT);
                }
                com.onesignal.debug.internal.logging.b.error$default("HMS registered with ID:" + ((String) b0Var.f10141d), null, 2, null);
                return new kc.a((String) b0Var.f10141d, dd.f.SUBSCRIBED);
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        if (b0Var.f10141d != null) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, ld.a aVar) {
        com.onesignal.common.threading.d dVar = this.waiter;
        if (dVar != null) {
            dVar.wake(str);
        }
        return Unit.f5554a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|28|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        com.onesignal.debug.internal.logging.b.error("HMS ApiException getting Huawei push token!", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r5.getStatusCode() == 907135000) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r5 = dd.f.HMS_ARGUMENTS_INVALID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r5 = new kc.a(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r5 = dd.f.HMS_API_EXCEPTION_OTHER;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(ld.a aVar) {
        d dVar;
        int i3;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                Object obj2 = md.a.f6622d;
                i3 = dVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    Context appContext = this._applicationService.getAppContext();
                    dVar.label = 1;
                    obj = getHMSTokenTask(appContext, dVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                kc.a aVar2 = (kc.a) obj;
                aVar2.getClass();
                return aVar2;
            }
        }
        dVar = new d(aVar);
        Object obj3 = dVar.result;
        Object obj22 = md.a.f6622d;
        i3 = dVar.label;
        if (i3 != 0) {
        }
        kc.a aVar22 = (kc.a) obj3;
        aVar22.getClass();
        return aVar22;
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
