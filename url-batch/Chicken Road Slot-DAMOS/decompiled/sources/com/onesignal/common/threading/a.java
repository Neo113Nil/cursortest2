package com.onesignal.common.threading;

import ge.a0;
import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nd.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();
    private static final x mainScope = a0.b(a0.t("OSPrimaryCoroutineScope"));

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.common.threading.a$a, reason: collision with other inner class name */
    public static final class C0005a extends i implements Function2 {
        final /* synthetic */ Function1<ld.a, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0005a(Function1<? super ld.a, ? extends Object> function1, ld.a aVar) {
            super(2, aVar);
            this.$block = function1;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new C0005a(this.$block, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((C0005a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                Function1<ld.a, Object> function1 = this.$block;
                this.label = 1;
                if (function1.invoke(this) == aVar) {
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

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function2 {
        int label;

        public b(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label == 0) {
                cf.c.M(obj);
                return Unit.f5554a;
            }
            i0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    private a() {
    }

    public final void execute(Function1<? super ld.a, ? extends Object> function1) {
        function1.getClass();
        a0.s(mainScope, null, new C0005a(function1, null), 3);
    }

    public final Object waitForIdle(ld.a aVar) {
        Object w6 = a0.s(mainScope, null, new b(null), 3).w(aVar);
        return w6 == md.a.f6622d ? w6 : Unit.f5554a;
    }
}
