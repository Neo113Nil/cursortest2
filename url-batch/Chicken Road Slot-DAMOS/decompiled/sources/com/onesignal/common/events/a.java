package com.onesignal.common.events;

import ge.a0;
import ge.k0;
import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import le.o;
import nd.i;
import ne.e;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class a implements c {
    private Object callback;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.common.events.a$a, reason: collision with other inner class name */
    public static final class C0003a extends i implements Function1 {
        final /* synthetic */ Function1<Object, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0003a(Function1<Object, Unit> function1, ld.a aVar) {
            super(1, aVar);
            this.$callback = function1;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return a.this.new C0003a(this.$callback, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((C0003a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            if (a.this.callback != null) {
                Function1<Object, Unit> function1 = this.$callback;
                Object obj2 = a.this.callback;
                obj2.getClass();
                function1.invoke(obj2);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function2 {
        final /* synthetic */ Function2<Object, ld.a, Object> $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<Object, ? super ld.a, ? extends Object> function2, a aVar, ld.a aVar2) {
            super(2, aVar2);
            this.$callback = function2;
            this.this$0 = aVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new b(this.$callback, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                Function2<Object, ld.a, Object> function2 = this.$callback;
                Object obj2 = this.this$0.callback;
                obj2.getClass();
                this.label = 1;
                if (function2.invoke(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    public final void fire(Function1<Object, Unit> function1) {
        function1.getClass();
        Object obj = this.callback;
        if (obj != null) {
            obj.getClass();
            function1.invoke(obj);
        }
    }

    public final void fireOnMain(Function1<Object, Unit> function1) {
        function1.getClass();
        com.onesignal.common.threading.b.suspendifyOnMain(new C0003a(function1, null));
    }

    @Override // com.onesignal.common.events.c
    public boolean getHasCallback() {
        return this.callback != null;
    }

    @Override // com.onesignal.common.events.c
    public void set(Object obj) {
        this.callback = obj;
    }

    public final Object suspendingFire(Function2<Object, ? super ld.a, ? extends Object> function2, ld.a aVar) {
        Object obj = this.callback;
        if (obj == null) {
            return Unit.f5554a;
        }
        obj.getClass();
        Object invoke = function2.invoke(obj, aVar);
        return invoke == md.a.f6622d ? invoke : Unit.f5554a;
    }

    public final Object suspendingFireOnMain(Function2<Object, ? super ld.a, ? extends Object> function2, ld.a aVar) {
        if (this.callback == null) {
            return Unit.f5554a;
        }
        e eVar = k0.f4372a;
        Object B = a0.B(o.f5995a, new b(function2, this, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }
}
