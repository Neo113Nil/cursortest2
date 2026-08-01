package com.onesignal.common.threading;

import ge.a0;
import ge.k0;
import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import le.o;
import nd.i;
import ne.e;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends i implements Function2 {
        final /* synthetic */ Function1<ld.a, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super ld.a, ? extends Object> function1, ld.a aVar) {
            super(2, aVar);
            this.$block = function1;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new a(this.$block, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
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

    public static final void suspendifyBlocking(Function1<? super ld.a, ? extends Object> function1) {
        function1.getClass();
        a0.w(g.f5592d, new a(function1, null));
    }

    public static final void suspendifyOnMain(Function1<? super ld.a, ? extends Object> function1) {
        function1.getClass();
        cf.c.L(null, 0, new C0006b(function1), 31);
    }

    public static final void suspendifyOnThread(String str, int i3, Function1<? super ld.a, ? extends Object> function1) {
        str.getClass();
        function1.getClass();
        cf.c.L(str, i3, new d(str, function1), 7);
    }

    public static /* synthetic */ void suspendifyOnThread$default(int i3, Function1 function1, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i3 = -1;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        suspendifyOnThread(i3, (Function1<? super ld.a, ? extends Object>) function1, (Function0<Unit>) function0);
    }

    public static /* synthetic */ void suspendifyOnThread$default(int i3, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i3 = -1;
        }
        suspendifyOnThread(i3, function1);
    }

    public static /* synthetic */ void suspendifyOnThread$default(String str, int i3, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = -1;
        }
        suspendifyOnThread(str, i3, (Function1<? super ld.a, ? extends Object>) function1);
    }

    public static final void suspendifyOnThread(int i3, Function1<? super ld.a, ? extends Object> function1, Function0<Unit> function0) {
        function1.getClass();
        cf.c.L(null, i3, new c(function0, function1), 15);
    }

    public static final void suspendifyOnThread(int i3, Function1<? super ld.a, ? extends Object> function1) {
        function1.getClass();
        suspendifyOnThread(i3, function1, (Function0<Unit>) null);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.common.threading.b$b, reason: collision with other inner class name */
    public static final class C0006b extends p implements Function0 {
        final /* synthetic */ Function1<ld.a, Object> $block;

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.common.threading.b$b$a */
        public static final class a extends i implements Function2 {
            final /* synthetic */ Function1<ld.a, Object> $block;
            int label;

            /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
            /* renamed from: com.onesignal.common.threading.b$b$a$a, reason: collision with other inner class name */
            public static final class C0007a extends i implements Function2 {
                final /* synthetic */ Function1<ld.a, Object> $block;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0007a(Function1<? super ld.a, ? extends Object> function1, ld.a aVar) {
                    super(2, aVar);
                    this.$block = function1;
                }

                @Override // nd.a
                public final ld.a create(Object obj, ld.a aVar) {
                    return new C0007a(this.$block, aVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(x xVar, ld.a aVar) {
                    return ((C0007a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super ld.a, ? extends Object> function1, ld.a aVar) {
                super(2, aVar);
                this.$block = function1;
            }

            @Override // nd.a
            public final ld.a create(Object obj, ld.a aVar) {
                return new a(this.$block, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, ld.a aVar) {
                return ((a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
            }

            @Override // nd.a
            public final Object invokeSuspend(Object obj) {
                md.a aVar = md.a.f6622d;
                int i3 = this.label;
                if (i3 == 0) {
                    cf.c.M(obj);
                    e eVar = k0.f4372a;
                    he.d dVar = o.f5995a;
                    C0007a c0007a = new C0007a(this.$block, null);
                    this.label = 1;
                    if (a0.B(dVar, c0007a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0006b(Function1<? super ld.a, ? extends Object> function1) {
            super(0);
            this.$block = function1;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m0invoke() {
            try {
                a0.w(g.f5592d, new a(this.$block, null));
            } catch (Exception e2) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread with switch to main", e2);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m0invoke();
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function0 {
        final /* synthetic */ Function1<ld.a, Object> $block;
        final /* synthetic */ Function0<Unit> $onComplete;

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends i implements Function2 {
            final /* synthetic */ Function1<ld.a, Object> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super ld.a, ? extends Object> function1, ld.a aVar) {
                super(2, aVar);
                this.$block = function1;
            }

            @Override // nd.a
            public final ld.a create(Object obj, ld.a aVar) {
                return new a(this.$block, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, ld.a aVar) {
                return ((a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<Unit> function0, Function1<? super ld.a, ? extends Object> function1) {
            super(0);
            this.$onComplete = function0;
            this.$block = function1;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            try {
                a0.w(g.f5592d, new a(this.$block, null));
                Function0<Unit> function0 = this.$onComplete;
                if (function0 != null) {
                    function0.invoke();
                }
            } catch (Exception e2) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread", e2);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends p implements Function0 {
        final /* synthetic */ Function1<ld.a, Object> $block;
        final /* synthetic */ String $name;

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends i implements Function2 {
            final /* synthetic */ Function1<ld.a, Object> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super ld.a, ? extends Object> function1, ld.a aVar) {
                super(2, aVar);
                this.$block = function1;
            }

            @Override // nd.a
            public final ld.a create(Object obj, ld.a aVar) {
                return new a(this.$block, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, ld.a aVar) {
                return ((a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Function1<? super ld.a, ? extends Object> function1) {
            super(0);
            this.$name = str;
            this.$block = function1;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            try {
                a0.w(g.f5592d, new a(this.$block, null));
            } catch (Exception e2) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread '" + this.$name + '\'', e2);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return Unit.f5554a;
        }
    }
}
