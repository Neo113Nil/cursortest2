package com.onesignal.common.events;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import M5.o;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public class a implements c {
    private Object callback;

    /* renamed from: com.onesignal.common.events.a$a, reason: collision with other inner class name */
    public static final class C0006a extends g implements InterfaceC0743l {
        final /* synthetic */ InterfaceC0743l $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0006a(InterfaceC0743l interfaceC0743l, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$callback = interfaceC0743l;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new C0006a(this.$callback, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            if (a.this.callback != null) {
                InterfaceC0743l interfaceC0743l = this.$callback;
                Object obj2 = a.this.callback;
                i.b(obj2);
                interfaceC0743l.invoke(obj2);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((C0006a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class b extends g implements InterfaceC0747p {
        final /* synthetic */ InterfaceC0747p $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0747p interfaceC0747p, a aVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$callback = interfaceC0747p;
            this.this$0 = aVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new b(this.$callback, this.this$0, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                InterfaceC0747p interfaceC0747p = this.$callback;
                Object obj2 = this.this$0.callback;
                i.b(obj2);
                this.label = 1;
                if (interfaceC0747p.invoke(obj2, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }
    }

    public final void fire(InterfaceC0743l callback) {
        i.e(callback, "callback");
        Object obj = this.callback;
        if (obj != null) {
            i.b(obj);
            callback.invoke(obj);
        }
    }

    public final void fireOnMain(InterfaceC0743l callback) {
        i.e(callback, "callback");
        com.onesignal.common.threading.b.suspendifyOnMain(new C0006a(callback, null));
    }

    @Override // com.onesignal.common.events.c
    public boolean getHasCallback() {
        return this.callback != null;
    }

    @Override // com.onesignal.common.events.c
    public void set(Object obj) {
        this.callback = obj;
    }

    public final Object suspendingFire(InterfaceC0747p interfaceC0747p, InterfaceC0564d interfaceC0564d) {
        Object obj = this.callback;
        v vVar = v.f5219a;
        if (obj != null) {
            i.b(obj);
            Object invoke = interfaceC0747p.invoke(obj, interfaceC0564d);
            if (invoke == EnumC0580a.f5697f) {
                return invoke;
            }
        }
        return vVar;
    }

    public final Object suspendingFireOnMain(InterfaceC0747p interfaceC0747p, InterfaceC0564d interfaceC0564d) {
        if (this.callback != null) {
            O5.d dVar = F.f1027a;
            Object t6 = AbstractC0165z.t(o.f1618a, new b(interfaceC0747p, this, null), interfaceC0564d);
            if (t6 == EnumC0580a.f5697f) {
                return t6;
            }
        }
        return v.f5219a;
    }
}
