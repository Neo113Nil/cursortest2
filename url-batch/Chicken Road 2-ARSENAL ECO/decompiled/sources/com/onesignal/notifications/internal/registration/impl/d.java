package com.onesignal.notifications.internal.registration.impl;

import H5.AbstractC0165z;
import H5.InterfaceC0163x;
import com.amazon.device.messaging.ADM;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class d implements Z2.b, c {
    private final T1.f _applicationService;
    private com.onesignal.common.threading.d waiter;

    public static final class a extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.registerForPush(this);
        }
    }

    public static final class b extends q5.g implements InterfaceC0747p {
        final /* synthetic */ s $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar, d dVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$registrationId = sVar;
            this.this$0 = dVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new b(this.$registrationId, this.this$0, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
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
                sVar = this.$registrationId;
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

    public d(T1.f _applicationService) {
        i.e(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, InterfaceC0564d interfaceC0564d) {
        com.onesignal.common.threading.d dVar = this.waiter;
        if (dVar != null) {
            dVar.wake(str);
        }
        return v.f5219a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Z2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(InterfaceC0564d interfaceC0564d) {
        a aVar;
        int i7;
        s sVar;
        if (interfaceC0564d instanceof a) {
            aVar = (a) interfaceC0564d;
            int i8 = aVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.label = i8 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = aVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    this.waiter = new com.onesignal.common.threading.d();
                    ADM adm = new ADM(this._applicationService.getAppContext());
                    s sVar2 = new s();
                    String registrationId = adm.getRegistrationId();
                    sVar2.f5233f = registrationId;
                    if (registrationId != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("ADM Already registered with ID:" + ((String) sVar2.f5233f), null, 2, null);
                        return new Z2.a((String) sVar2.f5233f, w3.f.SUBSCRIBED);
                    }
                    adm.startRegister();
                    b bVar = new b(sVar2, this, null);
                    aVar.L$0 = sVar2;
                    aVar.label = 1;
                    if (AbstractC0165z.u(30000L, bVar, aVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    sVar = sVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) aVar.L$0;
                    AbstractC0676f.w(obj);
                }
                if (sVar.f5233f != null) {
                    com.onesignal.debug.internal.logging.b.info$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
                    return new Z2.a(null, w3.f.ERROR);
                }
                com.onesignal.debug.internal.logging.b.debug$default("ADM registered with ID:" + ((String) sVar.f5233f), null, 2, null);
                return new Z2.a((String) sVar.f5233f, w3.f.SUBSCRIBED);
            }
        }
        aVar = new a(interfaceC0564d);
        Object obj2 = aVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = aVar.label;
        if (i7 != 0) {
        }
        if (sVar.f5233f != null) {
        }
    }
}
