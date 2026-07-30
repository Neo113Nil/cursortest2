package com.onesignal.common.events;

import X5.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import s6.n;
import u6.C0953e;

/* loaded from: classes.dex */
public class a implements c {
    private Object callback;

    /* renamed from: com.onesignal.common.events.a$a, reason: collision with other inner class name */
    public static final class C0006a extends j implements Function1 {
        final /* synthetic */ Function1<Object, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0006a(Function1<Object, Unit> function1, V5.b bVar) {
            super(1, bVar);
            this.$callback = function1;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return a.this.new C0006a(this.$callback, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((C0006a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            if (a.this.callback != null) {
                Function1<Object, Unit> function1 = this.$callback;
                Object obj2 = a.this.callback;
                Intrinsics.b(obj2);
                function1.invoke(obj2);
            }
            return Unit.f6114a;
        }
    }

    public static final class b extends j implements Function2 {
        final /* synthetic */ Function2<Object, V5.b, Object> $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<Object, ? super V5.b, ? extends Object> function2, a aVar, V5.b bVar) {
            super(2, bVar);
            this.$callback = function2;
            this.this$0 = aVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new b(this.$callback, this.this$0, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                Function2<Object, V5.b, Object> function2 = this.$callback;
                Object obj2 = this.this$0.callback;
                Intrinsics.b(obj2);
                this.label = 1;
                if (function2.invoke(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((b) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public final void fire(Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object obj = this.callback;
        if (obj != null) {
            Intrinsics.b(obj);
            callback.invoke(obj);
        }
    }

    public final void fireOnMain(Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
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

    public final Object suspendingFire(Function2<Object, ? super V5.b, ? extends Object> function2, V5.b bVar) {
        Object obj = this.callback;
        if (obj == null) {
            return Unit.f6114a;
        }
        Intrinsics.b(obj);
        Object invoke = function2.invoke(obj, bVar);
        return invoke == W5.a.f2787d ? invoke : Unit.f6114a;
    }

    public final Object suspendingFireOnMain(Function2<Object, ? super V5.b, ? extends Object> function2, V5.b bVar) {
        if (this.callback == null) {
            return Unit.f6114a;
        }
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(n.f7850a, new b(function2, this, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }
}
