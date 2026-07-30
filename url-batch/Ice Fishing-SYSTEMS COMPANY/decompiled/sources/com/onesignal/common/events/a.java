package com.onesignal.common.events;

import E7.l;
import E7.p;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import T7.o;
import V7.e;
import com.bumptech.glide.f;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public class a implements c {
    private Object callback;

    /* renamed from: com.onesignal.common.events.a$a, reason: collision with other inner class name */
    public static final class C0175a extends h implements l {
        final /* synthetic */ l $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0175a(l lVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$callback = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return a.this.new C0175a(this.$callback, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.r(obj);
            if (a.this.callback != null) {
                l lVar = this.$callback;
                Object obj2 = a.this.callback;
                kotlin.jvm.internal.h.b(obj2);
                lVar.invoke(obj2);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((C0175a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class b extends h implements p {
        final /* synthetic */ p $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, a aVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$callback = pVar;
            this.this$0 = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new b(this.$callback, this.this$0, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                f.r(obj);
                p pVar = this.$callback;
                Object obj2 = this.this$0.callback;
                kotlin.jvm.internal.h.b(obj2);
                this.label = 1;
                if (pVar.invoke(obj2, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.r(obj);
            }
            return v.f40183a;
        }
    }

    public final void fire(l callback) {
        kotlin.jvm.internal.h.e(callback, "callback");
        Object obj = this.callback;
        if (obj != null) {
            kotlin.jvm.internal.h.b(obj);
            callback.invoke(obj);
        }
    }

    public final void fireOnMain(l callback) {
        kotlin.jvm.internal.h.e(callback, "callback");
        com.onesignal.common.threading.c.suspendifyOnMain(new C0175a(callback, null));
    }

    @Override // com.onesignal.common.events.c
    public boolean getHasCallback() {
        return this.callback != null;
    }

    @Override // com.onesignal.common.events.c
    public void set(Object obj) {
        this.callback = obj;
    }

    public final Object suspendingFire(p pVar, InterfaceC5133d interfaceC5133d) {
        Object obj = this.callback;
        v vVar = v.f40183a;
        if (obj != null) {
            kotlin.jvm.internal.h.b(obj);
            Object invoke = pVar.invoke(obj, interfaceC5133d);
            if (invoke == EnumC5179a.f41704n) {
                return invoke;
            }
        }
        return vVar;
    }

    public final Object suspendingFireOnMain(p pVar, InterfaceC5133d interfaceC5133d) {
        Object obj = this.callback;
        v vVar = v.f40183a;
        if (obj != null) {
            e eVar = F.f2551a;
            Object y6 = AbstractC0399y.y(o.f3162a, new b(pVar, this, null), interfaceC5133d);
            if (y6 == EnumC5179a.f41704n) {
                return y6;
            }
        }
        return vVar;
    }
}
