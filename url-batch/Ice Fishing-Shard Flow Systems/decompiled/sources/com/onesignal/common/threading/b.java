package com.onesignal.common.threading;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.AbstractC0768a;
import n6.AbstractC0792z;
import n6.EnumC0790x;
import n6.F;
import n6.InterfaceC0789w;
import n6.X;
import n6.g0;
import n6.l0;
import n6.r;
import o6.C0809e;
import u6.C0953e;
import u6.ExecutorC0952d;

/* loaded from: classes.dex */
public abstract class b {

    public static final class a extends X5.j implements Function1 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
            super(1, bVar);
            this.$block = function1;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new a(this.$block, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnDefault", e7);
            }
            return Unit.f6114a;
        }
    }

    /* renamed from: com.onesignal.common.threading.b$b, reason: collision with other inner class name */
    public static final class C0009b extends X5.j implements Function2 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0009b(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
            super(2, bVar);
            this.$block = function1;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new C0009b(this.$block, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnDefault", e7);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0009b) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class c extends X5.j implements Function1 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
            super(1, bVar);
            this.$block = function1;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new c(this.$block, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnIO", e7);
            }
            return Unit.f6114a;
        }
    }

    public static final class d extends X5.j implements Function2 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
            super(2, bVar);
            this.$block = function1;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new d(this.$block, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnIO", e7);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((d) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class e extends X5.j implements Function1 {
        final /* synthetic */ Function0<Unit> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0<Unit> function0, V5.b bVar) {
            super(1, bVar);
            this.$block = function0;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new e(this.$block, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            this.$block.invoke();
            return Unit.f6114a;
        }
    }

    public static final class f extends X5.j implements Function1 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        int label;

        public static final class a extends X5.j implements Function2 {
            final /* synthetic */ Function1<V5.b, Object> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
                super(2, bVar);
                this.$block = function1;
            }

            @Override // X5.a
            public final V5.b create(Object obj, V5.b bVar) {
                return new a(this.$block, bVar);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                W5.a aVar = W5.a.f2787d;
                int i2 = this.label;
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
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
                return ((a) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
            super(1, bVar);
            this.$block = function1;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new f(this.$block, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    C0953e c0953e = F.f7011a;
                    C0809e c0809e = s6.n.f7850a;
                    a aVar2 = new a(this.$block, null);
                    this.label = 1;
                    if (AbstractC0792z.t(c0809e, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyOnMain", e7);
            }
            return Unit.f6114a;
        }
    }

    public static final class g extends p implements Function0 {
        final /* synthetic */ Function1<V5.b, Object> $block;

        public static final class a extends X5.j implements Function2 {
            final /* synthetic */ Function1<V5.b, Object> $block;
            int label;

            /* renamed from: com.onesignal.common.threading.b$g$a$a, reason: collision with other inner class name */
            public static final class C0010a extends X5.j implements Function2 {
                final /* synthetic */ Function1<V5.b, Object> $block;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0010a(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
                    super(2, bVar);
                    this.$block = function1;
                }

                @Override // X5.a
                public final V5.b create(Object obj, V5.b bVar) {
                    return new C0010a(this.$block, bVar);
                }

                @Override // X5.a
                public final Object invokeSuspend(Object obj) {
                    W5.a aVar = W5.a.f2787d;
                    int i2 = this.label;
                    if (i2 == 0) {
                        V6.b.P(obj);
                        Function1<V5.b, Object> function1 = this.$block;
                        this.label = 1;
                        if (function1.invoke(this) == aVar) {
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
                    return ((C0010a) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
                super(2, bVar);
                this.$block = function1;
            }

            @Override // X5.a
            public final V5.b create(Object obj, V5.b bVar) {
                return new a(this.$block, bVar);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                W5.a aVar = W5.a.f2787d;
                int i2 = this.label;
                if (i2 == 0) {
                    V6.b.P(obj);
                    C0953e c0953e = F.f7011a;
                    C0809e c0809e = s6.n.f7850a;
                    C0010a c0010a = new C0010a(this.$block, null);
                    this.label = 1;
                    if (AbstractC0792z.t(c0809e, c0010a, this) == aVar) {
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
                return ((a) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super V5.b, ? extends Object> function1) {
            super(0);
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return Unit.f6114a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            try {
                AbstractC0792z.o(kotlin.coroutines.g.f6146d, new a(this.$block, null));
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread with switch to main", e7);
            }
        }
    }

    public static final class h extends X5.j implements Function1 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function1<? super V5.b, ? extends Object> function1, V5.b bVar) {
            super(1, bVar);
            this.$block = function1;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new h(this.$block, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((h) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyOnSerialIO", e7);
            }
            return Unit.f6114a;
        }
    }

    public static final class i extends X5.j implements Function1 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        final /* synthetic */ Function0<Unit> $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function1<? super V5.b, ? extends Object> function1, Function0<Unit> function0, V5.b bVar) {
            super(1, bVar);
            this.$block = function1;
            this.$onComplete = function0;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new i(this.$block, this.$onComplete, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((i) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                Function0<Unit> function0 = this.$onComplete;
                if (function0 != null) {
                    function0.invoke();
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithCompletion", e7);
            }
            return Unit.f6114a;
        }
    }

    public static final class j extends X5.j implements Function1 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        final /* synthetic */ Function0<Unit> $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super V5.b, ? extends Object> function1, Function0<Unit> function0, V5.b bVar) {
            super(1, bVar);
            this.$block = function1;
            this.$onComplete = function0;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new j(this.$block, this.$onComplete, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((j) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                Function0<Unit> function0 = this.$onComplete;
                if (function0 != null) {
                    function0.invoke();
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithCompletion", e7);
            }
            return Unit.f6114a;
        }
    }

    public static final class k extends X5.j implements Function2 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        final /* synthetic */ Function0<Unit> $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Function1<? super V5.b, ? extends Object> function1, Function0<Unit> function0, V5.b bVar) {
            super(2, bVar);
            this.$block = function1;
            this.$onComplete = function0;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new k(this.$block, this.$onComplete, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                Function0<Unit> function0 = this.$onComplete;
                if (function0 != null) {
                    function0.invoke();
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithCompletion", e7);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((k) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class l extends X5.j implements Function1 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ Function1<Exception, Unit> $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Function1<? super V5.b, ? extends Object> function1, Function0<Unit> function0, Function1<? super Exception, Unit> function12, V5.b bVar) {
            super(1, bVar);
            this.$block = function1;
            this.$onComplete = function0;
            this.$onError = function12;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new l(this.$block, this.$onComplete, this.$onError, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                Function0<Unit> function0 = this.$onComplete;
                if (function0 != null) {
                    function0.invoke();
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithErrorHandling", e7);
                Function1<Exception, Unit> function12 = this.$onError;
                if (function12 != null) {
                    function12.invoke(e7);
                }
            }
            return Unit.f6114a;
        }
    }

    public static final class m extends X5.j implements Function1 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ Function1<Exception, Unit> $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(Function1<? super V5.b, ? extends Object> function1, Function0<Unit> function0, Function1<? super Exception, Unit> function12, V5.b bVar) {
            super(1, bVar);
            this.$block = function1;
            this.$onComplete = function0;
            this.$onError = function12;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new m(this.$block, this.$onComplete, this.$onError, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((m) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                Function0<Unit> function0 = this.$onComplete;
                if (function0 != null) {
                    function0.invoke();
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithErrorHandling", e7);
                Function1<Exception, Unit> function12 = this.$onError;
                if (function12 != null) {
                    function12.invoke(e7);
                }
            }
            return Unit.f6114a;
        }
    }

    public static final class n extends X5.j implements Function2 {
        final /* synthetic */ Function1<V5.b, Object> $block;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ Function1<Exception, Unit> $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(Function1<? super V5.b, ? extends Object> function1, Function0<Unit> function0, Function1<? super Exception, Unit> function12, V5.b bVar) {
            super(2, bVar);
            this.$block = function1;
            this.$onComplete = function0;
            this.$onError = function12;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new n(this.$block, this.$onComplete, this.$onError, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    Function1<V5.b, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                Function0<Unit> function0 = this.$onComplete;
                if (function0 != null) {
                    function0.invoke();
                }
            } catch (Exception e7) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithErrorHandling", e7);
                Function1<Exception, Unit> function12 = this.$onError;
                if (function12 != null) {
                    function12.invoke(e7);
                }
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((n) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final X launchOnDefault(Function1<? super V5.b, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (com.onesignal.common.threading.c.INSTANCE.getUseBackgroundThreading()) {
            return com.onesignal.common.threading.a.INSTANCE.launchOnDefault(new a(block, null));
        }
        CoroutineContext coroutineContext = F.f7011a;
        C0009b c0009b = new C0009b(block, null);
        EnumC0790x enumC0790x = EnumC0790x.f7091l;
        if ((2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f6146d;
        }
        if ((2 & 2) != 0) {
            enumC0790x = EnumC0790x.f7088d;
        }
        CoroutineContext a7 = r.a(kotlin.coroutines.g.f6146d, coroutineContext, true);
        C0953e c0953e = F.f7011a;
        if (a7 != c0953e && a7.g(kotlin.coroutines.d.f6145f) == null) {
            a7 = a7.j(c0953e);
        }
        AbstractC0768a g0Var = enumC0790x == EnumC0790x.f7089e ? new g0(a7, c0009b) : new l0(a7, true);
        g0Var.Y(enumC0790x, g0Var, c0009b);
        return g0Var;
    }

    public static final X launchOnIO(Function1<? super V5.b, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (com.onesignal.common.threading.c.INSTANCE.getUseBackgroundThreading()) {
            return com.onesignal.common.threading.a.INSTANCE.launchOnIO(new c(block, null));
        }
        C0953e c0953e = F.f7011a;
        CoroutineContext coroutineContext = ExecutorC0952d.f8106i;
        d dVar = new d(block, null);
        EnumC0790x enumC0790x = EnumC0790x.f7091l;
        if ((2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f6146d;
        }
        if ((2 & 2) != 0) {
            enumC0790x = EnumC0790x.f7088d;
        }
        CoroutineContext a7 = r.a(kotlin.coroutines.g.f6146d, coroutineContext, true);
        C0953e c0953e2 = F.f7011a;
        if (a7 != c0953e2 && a7.g(kotlin.coroutines.d.f6145f) == null) {
            a7 = a7.j(c0953e2);
        }
        AbstractC0768a g0Var = enumC0790x == EnumC0790x.f7089e ? new g0(a7, dVar) : new l0(a7, true);
        g0Var.Y(enumC0790x, g0Var, dVar);
        return g0Var;
    }

    public static final void runOnSerialIOIfBackgroundThreading(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (com.onesignal.common.threading.c.INSTANCE.getUseBackgroundThreading()) {
            suspendifyOnSerialIO(new e(block, null));
        } else {
            block.invoke();
        }
    }

    public static final void suspendifyOnDefault(Function1<? super V5.b, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        suspendifyWithCompletion(false, block, null);
    }

    public static final void suspendifyOnIO(Function1<? super V5.b, ? extends Object> block, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(block, "block");
        suspendifyWithCompletion(true, block, function0);
    }

    public static /* synthetic */ void suspendifyOnIO$default(Function1 function1, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        suspendifyOnIO(function1, function0);
    }

    public static final void suspendifyOnMain(Function1<? super V5.b, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (com.onesignal.common.threading.c.INSTANCE.getUseBackgroundThreading()) {
            com.onesignal.common.threading.a.INSTANCE.launchOnIO(new f(block, null));
        } else {
            O6.g.a0(new g(block));
        }
    }

    public static final void suspendifyOnSerialIO(Function1<? super V5.b, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        com.onesignal.common.threading.a.INSTANCE.launchOnSerialIO(new h(block, null));
    }

    public static final void suspendifyWithCompletion(boolean z7, Function1<? super V5.b, ? extends Object> block, Function0<Unit> function0) {
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(block, "block");
        if (com.onesignal.common.threading.c.INSTANCE.getUseBackgroundThreading()) {
            if (z7) {
                com.onesignal.common.threading.a.INSTANCE.launchOnIO(new i(block, function0, null));
                return;
            } else {
                com.onesignal.common.threading.a.INSTANCE.launchOnDefault(new j(block, function0, null));
                return;
            }
        }
        if (z7) {
            C0953e c0953e = F.f7011a;
            coroutineContext = ExecutorC0952d.f8106i;
        } else {
            coroutineContext = F.f7011a;
        }
        k kVar = new k(block, function0, null);
        EnumC0790x enumC0790x = EnumC0790x.f7091l;
        if ((2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f6146d;
        }
        if ((2 & 2) != 0) {
            enumC0790x = EnumC0790x.f7088d;
        }
        CoroutineContext a7 = r.a(kotlin.coroutines.g.f6146d, coroutineContext, true);
        C0953e c0953e2 = F.f7011a;
        if (a7 != c0953e2 && a7.g(kotlin.coroutines.d.f6145f) == null) {
            a7 = a7.j(c0953e2);
        }
        AbstractC0768a g0Var = enumC0790x == EnumC0790x.f7089e ? new g0(a7, kVar) : new l0(a7, true);
        g0Var.Y(enumC0790x, g0Var, kVar);
    }

    public static /* synthetic */ void suspendifyWithCompletion$default(boolean z7, Function1 function1, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z7 = true;
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        suspendifyWithCompletion(z7, function1, function0);
    }

    public static final void suspendifyWithErrorHandling(boolean z7, Function1<? super V5.b, ? extends Object> block, Function1<? super Exception, Unit> function1, Function0<Unit> function0) {
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(block, "block");
        if (com.onesignal.common.threading.c.INSTANCE.getUseBackgroundThreading()) {
            if (z7) {
                com.onesignal.common.threading.a.INSTANCE.launchOnIO(new l(block, function0, function1, null));
                return;
            } else {
                com.onesignal.common.threading.a.INSTANCE.launchOnDefault(new m(block, function0, function1, null));
                return;
            }
        }
        if (z7) {
            C0953e c0953e = F.f7011a;
            coroutineContext = ExecutorC0952d.f8106i;
        } else {
            coroutineContext = F.f7011a;
        }
        n nVar = new n(block, function0, function1, null);
        EnumC0790x enumC0790x = EnumC0790x.f7091l;
        if ((2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f6146d;
        }
        if ((2 & 2) != 0) {
            enumC0790x = EnumC0790x.f7088d;
        }
        CoroutineContext a7 = r.a(kotlin.coroutines.g.f6146d, coroutineContext, true);
        C0953e c0953e2 = F.f7011a;
        if (a7 != c0953e2 && a7.g(kotlin.coroutines.d.f6145f) == null) {
            a7 = a7.j(c0953e2);
        }
        AbstractC0768a g0Var = enumC0790x == EnumC0790x.f7089e ? new g0(a7, nVar) : new l0(a7, true);
        g0Var.Y(enumC0790x, g0Var, nVar);
    }

    public static /* synthetic */ void suspendifyWithErrorHandling$default(boolean z7, Function1 function1, Function1 function12, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z7 = true;
        }
        if ((i2 & 4) != 0) {
            function12 = null;
        }
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        suspendifyWithErrorHandling(z7, function1, function12, function0);
    }

    public static final void suspendifyOnIO(Function1<? super V5.b, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        suspendifyWithCompletion(true, block, null);
    }
}
