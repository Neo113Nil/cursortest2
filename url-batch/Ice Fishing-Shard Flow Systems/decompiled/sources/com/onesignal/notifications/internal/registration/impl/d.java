package com.onesignal.notifications.internal.registration.impl;

import X5.j;
import com.amazon.device.messaging.ADM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class d implements B3.b, c {
    private final v2.f _applicationService;
    private com.onesignal.common.threading.e waiter;

    public static final class a extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.registerForPush(this);
        }
    }

    public static final class b extends j implements Function2 {
        final /* synthetic */ D $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D d7, d dVar, V5.b bVar) {
            super(2, bVar);
            this.$registrationId = d7;
            this.this$0 = dVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new b(this.$registrationId, this.this$0, bVar);
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
                d7 = this.$registrationId;
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
            return ((b) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public d(v2.f _applicationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, V5.b bVar) {
        com.onesignal.common.threading.e eVar = this.waiter;
        if (eVar != null) {
            eVar.wake(str);
        }
        return Unit.f6114a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // B3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(V5.b bVar) {
        a aVar;
        int i2;
        D d7;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i5 = aVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.label = i5 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = aVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    this.waiter = new com.onesignal.common.threading.e();
                    ADM adm = new ADM(this._applicationService.getAppContext());
                    D d8 = new D();
                    String registrationId = adm.getRegistrationId();
                    d8.f6152d = registrationId;
                    if (registrationId != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("ADM Already registered with ID:" + ((String) d8.f6152d), null, 2, null);
                        return new B3.a((String) d8.f6152d, Y3.f.SUBSCRIBED);
                    }
                    adm.startRegister();
                    b bVar2 = new b(d8, this, null);
                    aVar.L$0 = d8;
                    aVar.label = 1;
                    if (AbstractC0792z.u(30000L, bVar2, aVar) == aVar2) {
                        return aVar2;
                    }
                    d7 = d8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d7 = (D) aVar.L$0;
                    V6.b.P(obj);
                }
                if (d7.f6152d != null) {
                    com.onesignal.debug.internal.logging.b.info$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
                    return new B3.a(null, Y3.f.ERROR);
                }
                com.onesignal.debug.internal.logging.b.debug$default("ADM registered with ID:" + ((String) d7.f6152d), null, 2, null);
                return new B3.a((String) d7.f6152d, Y3.f.SUBSCRIBED);
            }
        }
        aVar = new a(bVar);
        Object obj2 = aVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = aVar.label;
        if (i2 != 0) {
        }
        if (d7.f6152d != null) {
        }
    }
}
