package com.onesignal.notifications.internal.registration.impl;

import com.amazon.device.messaging.ADM;
import ge.a0;
import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import nd.i;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements kc.b, c {
    private final ea.f _applicationService;
    private com.onesignal.common.threading.d waiter;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.registerForPush(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function2 {
        final /* synthetic */ b0 $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0 b0Var, d dVar, ld.a aVar) {
            super(2, aVar);
            this.$registrationId = b0Var;
            this.this$0 = dVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new b(this.$registrationId, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
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
                b0Var = this.$registrationId;
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

    public d(ea.f fVar) {
        fVar.getClass();
        this._applicationService = fVar;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, ld.a aVar) {
        com.onesignal.common.threading.d dVar = this.waiter;
        if (dVar != null) {
            dVar.wake(str);
        }
        return Unit.f5554a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(ld.a aVar) {
        a aVar2;
        int i3;
        b0 b0Var;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i10 = aVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i10 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = aVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    this.waiter = new com.onesignal.common.threading.d();
                    ADM adm = new ADM(this._applicationService.getAppContext());
                    b0 b0Var2 = new b0();
                    String registrationId = adm.getRegistrationId();
                    b0Var2.f10141d = registrationId;
                    if (registrationId != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("ADM Already registered with ID:" + ((String) b0Var2.f10141d), null, 2, null);
                        return new kc.a((String) b0Var2.f10141d, dd.f.SUBSCRIBED);
                    }
                    adm.startRegister();
                    b bVar = new b(b0Var2, this, null);
                    aVar2.L$0 = b0Var2;
                    aVar2.label = 1;
                    if (a0.C(30000L, bVar, aVar2) == aVar3) {
                        return aVar3;
                    }
                    b0Var = b0Var2;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (b0) aVar2.L$0;
                    cf.c.M(obj);
                }
                if (b0Var.f10141d != null) {
                    com.onesignal.debug.internal.logging.b.error$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
                    return new kc.a(null, dd.f.ERROR);
                }
                com.onesignal.debug.internal.logging.b.error$default("ADM registered with ID:" + ((String) b0Var.f10141d), null, 2, null);
                return new kc.a((String) b0Var.f10141d, dd.f.SUBSCRIBED);
            }
        }
        aVar2 = new a(aVar);
        Object obj2 = aVar2.result;
        md.a aVar32 = md.a.f6622d;
        i3 = aVar2.label;
        if (i3 != 0) {
        }
        if (b0Var.f10141d != null) {
        }
    }
}
