package com.onesignal.common.threading;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import H5.X;
import M5.o;
import k5.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public abstract class b {

    public static final class a extends q5.g implements InterfaceC0743l {
        final /* synthetic */ InterfaceC0743l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0743l interfaceC0743l, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$block = interfaceC0743l;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new a(this.$block, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    InterfaceC0743l interfaceC0743l = this.$block;
                    this.label = 1;
                    if (interfaceC0743l.invoke(this) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
            } catch (Exception e4) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnDefault", e4);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    /* renamed from: com.onesignal.common.threading.b$b, reason: collision with other inner class name */
    public static final class C0011b extends q5.g implements InterfaceC0743l {
        final /* synthetic */ InterfaceC0743l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0011b(InterfaceC0743l interfaceC0743l, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$block = interfaceC0743l;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new C0011b(this.$block, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    InterfaceC0743l interfaceC0743l = this.$block;
                    this.label = 1;
                    if (interfaceC0743l.invoke(this) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
            } catch (Exception e4) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnIO", e4);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((C0011b) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class c extends q5.g implements InterfaceC0743l {
        final /* synthetic */ InterfaceC0732a $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0732a interfaceC0732a, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$block = interfaceC0732a;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new c(this.$block, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            this.$block.invoke();
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class d extends q5.g implements InterfaceC0743l {
        final /* synthetic */ InterfaceC0743l $block;
        int label;

        public static final class a extends q5.g implements InterfaceC0747p {
            final /* synthetic */ InterfaceC0743l $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC0743l interfaceC0743l, InterfaceC0564d interfaceC0564d) {
                super(2, interfaceC0564d);
                this.$block = interfaceC0743l;
            }

            @Override // q5.AbstractC0605a
            public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
                return new a(this.$block, interfaceC0564d);
            }

            @Override // x5.InterfaceC0747p
            public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
                return ((a) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
            }

            @Override // q5.AbstractC0605a
            public final Object invokeSuspend(Object obj) {
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                int i7 = this.label;
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    InterfaceC0743l interfaceC0743l = this.$block;
                    this.label = 1;
                    if (interfaceC0743l.invoke(this) == enumC0580a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC0743l interfaceC0743l, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$block = interfaceC0743l;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new d(this.$block, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    O5.d dVar = F.f1027a;
                    I5.e eVar = o.f1618a;
                    a aVar = new a(this.$block, null);
                    this.label = 1;
                    if (AbstractC0165z.t(eVar, aVar, this) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
            } catch (Exception e4) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyOnMain", e4);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((d) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class e extends q5.g implements InterfaceC0743l {
        final /* synthetic */ InterfaceC0743l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0743l interfaceC0743l, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$block = interfaceC0743l;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new e(this.$block, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    InterfaceC0743l interfaceC0743l = this.$block;
                    this.label = 1;
                    if (interfaceC0743l.invoke(this) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
            } catch (Exception e4) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyOnSerialIO", e4);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((e) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class f extends q5.g implements InterfaceC0743l {
        final /* synthetic */ InterfaceC0743l $block;
        final /* synthetic */ InterfaceC0732a $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC0743l interfaceC0743l, InterfaceC0732a interfaceC0732a, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$block = interfaceC0743l;
            this.$onComplete = interfaceC0732a;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new f(this.$block, this.$onComplete, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    InterfaceC0743l interfaceC0743l = this.$block;
                    this.label = 1;
                    if (interfaceC0743l.invoke(this) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                InterfaceC0732a interfaceC0732a = this.$onComplete;
                if (interfaceC0732a != null) {
                    interfaceC0732a.invoke();
                }
            } catch (Exception e4) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithCompletion", e4);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((f) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public /* synthetic */ class g extends kotlin.jvm.internal.h implements InterfaceC0743l {
        public g(Object obj) {
            super(1, obj, com.onesignal.common.threading.a.class, "launchOnIO", "launchOnIO(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", 0);
        }

        @Override // x5.InterfaceC0743l
        public final X invoke(InterfaceC0743l p02) {
            kotlin.jvm.internal.i.e(p02, "p0");
            return ((com.onesignal.common.threading.a) this.receiver).launchOnIO(p02);
        }
    }

    public /* synthetic */ class h extends kotlin.jvm.internal.h implements InterfaceC0743l {
        public h(Object obj) {
            super(1, obj, com.onesignal.common.threading.a.class, "launchOnDefault", "launchOnDefault(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", 0);
        }

        @Override // x5.InterfaceC0743l
        public final X invoke(InterfaceC0743l p02) {
            kotlin.jvm.internal.i.e(p02, "p0");
            return ((com.onesignal.common.threading.a) this.receiver).launchOnDefault(p02);
        }
    }

    public static final class i extends q5.g implements InterfaceC0743l {
        final /* synthetic */ InterfaceC0743l $block;
        final /* synthetic */ InterfaceC0732a $onComplete;
        final /* synthetic */ InterfaceC0743l $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC0743l interfaceC0743l, InterfaceC0732a interfaceC0732a, InterfaceC0743l interfaceC0743l2, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$block = interfaceC0743l;
            this.$onComplete = interfaceC0732a;
            this.$onError = interfaceC0743l2;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new i(this.$block, this.$onComplete, this.$onError, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    InterfaceC0743l interfaceC0743l = this.$block;
                    this.label = 1;
                    if (interfaceC0743l.invoke(this) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                InterfaceC0732a interfaceC0732a = this.$onComplete;
                if (interfaceC0732a != null) {
                    interfaceC0732a.invoke();
                }
            } catch (Exception e4) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithErrorHandling", e4);
                InterfaceC0743l interfaceC0743l2 = this.$onError;
                if (interfaceC0743l2 != null) {
                    interfaceC0743l2.invoke(e4);
                }
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((i) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public /* synthetic */ class j extends kotlin.jvm.internal.h implements InterfaceC0743l {
        public j(Object obj) {
            super(1, obj, com.onesignal.common.threading.a.class, "launchOnIO", "launchOnIO(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", 0);
        }

        @Override // x5.InterfaceC0743l
        public final X invoke(InterfaceC0743l p02) {
            kotlin.jvm.internal.i.e(p02, "p0");
            return ((com.onesignal.common.threading.a) this.receiver).launchOnIO(p02);
        }
    }

    public /* synthetic */ class k extends kotlin.jvm.internal.h implements InterfaceC0743l {
        public k(Object obj) {
            super(1, obj, com.onesignal.common.threading.a.class, "launchOnDefault", "launchOnDefault(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", 0);
        }

        @Override // x5.InterfaceC0743l
        public final X invoke(InterfaceC0743l p02) {
            kotlin.jvm.internal.i.e(p02, "p0");
            return ((com.onesignal.common.threading.a) this.receiver).launchOnDefault(p02);
        }
    }

    public static final X launchOnDefault(InterfaceC0743l block) {
        kotlin.jvm.internal.i.e(block, "block");
        return com.onesignal.common.threading.a.INSTANCE.launchOnDefault(new a(block, null));
    }

    public static final X launchOnIO(InterfaceC0743l block) {
        kotlin.jvm.internal.i.e(block, "block");
        return com.onesignal.common.threading.a.INSTANCE.launchOnIO(new C0011b(block, null));
    }

    public static final void runOnSerialIO(InterfaceC0732a block) {
        kotlin.jvm.internal.i.e(block, "block");
        suspendifyOnSerialIO(new c(block, null));
    }

    public static final void suspendifyOnDefault(InterfaceC0743l block) {
        kotlin.jvm.internal.i.e(block, "block");
        suspendifyWithCompletion(false, block, null);
    }

    public static final void suspendifyOnIO(InterfaceC0743l block, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(block, "block");
        suspendifyWithCompletion(true, block, interfaceC0732a);
    }

    public static /* synthetic */ void suspendifyOnIO$default(InterfaceC0743l interfaceC0743l, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        suspendifyOnIO(interfaceC0743l, interfaceC0732a);
    }

    public static final void suspendifyOnMain(InterfaceC0743l block) {
        kotlin.jvm.internal.i.e(block, "block");
        com.onesignal.common.threading.a.INSTANCE.launchOnIO(new d(block, null));
    }

    public static final void suspendifyOnSerialIO(InterfaceC0743l block) {
        kotlin.jvm.internal.i.e(block, "block");
        com.onesignal.common.threading.a.INSTANCE.launchOnSerialIO(new e(block, null));
    }

    public static final void suspendifyWithCompletion(boolean z5, InterfaceC0743l block, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(block, "block");
        (z5 ? new g(com.onesignal.common.threading.a.INSTANCE) : new h(com.onesignal.common.threading.a.INSTANCE)).invoke(new f(block, interfaceC0732a, null));
    }

    public static /* synthetic */ void suspendifyWithCompletion$default(boolean z5, InterfaceC0743l interfaceC0743l, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = true;
        }
        if ((i7 & 4) != 0) {
            interfaceC0732a = null;
        }
        suspendifyWithCompletion(z5, interfaceC0743l, interfaceC0732a);
    }

    public static final void suspendifyWithErrorHandling(boolean z5, InterfaceC0743l block, InterfaceC0743l interfaceC0743l, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(block, "block");
        (z5 ? new j(com.onesignal.common.threading.a.INSTANCE) : new k(com.onesignal.common.threading.a.INSTANCE)).invoke(new i(block, interfaceC0732a, interfaceC0743l, null));
    }

    public static /* synthetic */ void suspendifyWithErrorHandling$default(boolean z5, InterfaceC0743l interfaceC0743l, InterfaceC0743l interfaceC0743l2, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = true;
        }
        if ((i7 & 4) != 0) {
            interfaceC0743l2 = null;
        }
        if ((i7 & 8) != 0) {
            interfaceC0732a = null;
        }
        suspendifyWithErrorHandling(z5, interfaceC0743l, interfaceC0743l2, interfaceC0732a);
    }

    public static final void suspendifyOnIO(InterfaceC0743l block) {
        kotlin.jvm.internal.i.e(block, "block");
        suspendifyWithCompletion(true, block, null);
    }
}
