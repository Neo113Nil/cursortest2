package com.onesignal.common.threading;

import E7.p;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import O7.T;
import O7.Y;
import T7.o;
import o2.C4830c;
import q7.v;
import v7.C5139j;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends x7.h implements E7.l {
        final /* synthetic */ E7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(E7.l lVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$block = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new a(this.$block, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnDefault", e6);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class b extends x7.h implements p {
        final /* synthetic */ E7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(E7.l lVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$block = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new b(this.$block, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnDefault", e6);
            }
            return v.f40183a;
        }
    }

    /* renamed from: com.onesignal.common.threading.c$c, reason: collision with other inner class name */
    public static final class C0178c extends x7.h implements E7.l {
        final /* synthetic */ E7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0178c(E7.l lVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$block = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new C0178c(this.$block, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnIO", e6);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((C0178c) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class d extends x7.h implements p {
        final /* synthetic */ E7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(E7.l lVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$block = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new d(this.$block, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((d) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in launchOnIO", e6);
            }
            return v.f40183a;
        }
    }

    public static final class e extends x7.h implements E7.l {
        final /* synthetic */ E7.a $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(E7.a aVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$block = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new e(this.$block, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            this.$block.invoke();
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((e) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class f extends x7.h implements E7.l {
        final /* synthetic */ E7.l $block;
        int label;

        public static final class a extends x7.h implements p {
            final /* synthetic */ E7.l $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(E7.l lVar, InterfaceC5133d interfaceC5133d) {
                super(2, interfaceC5133d);
                this.$block = lVar;
            }

            @Override // x7.AbstractC5217a
            public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
                return new a(this.$block, interfaceC5133d);
            }

            @Override // E7.p
            public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
                return ((a) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
            }

            @Override // x7.AbstractC5217a
            public final Object invokeSuspend(Object obj) {
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                int i = this.label;
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                return v.f40183a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(E7.l lVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$block = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new f(this.$block, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    V7.e eVar = F.f2551a;
                    P7.e eVar2 = o.f3162a;
                    a aVar = new a(this.$block, null);
                    this.label = 1;
                    if (AbstractC0399y.y(eVar2, aVar, this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyOnMain", e6);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((f) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class g extends kotlin.jvm.internal.i implements E7.a {
        final /* synthetic */ E7.l $block;

        public static final class a extends x7.h implements p {
            final /* synthetic */ E7.l $block;
            int label;

            /* renamed from: com.onesignal.common.threading.c$g$a$a, reason: collision with other inner class name */
            public static final class C0179a extends x7.h implements p {
                final /* synthetic */ E7.l $block;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0179a(E7.l lVar, InterfaceC5133d interfaceC5133d) {
                    super(2, interfaceC5133d);
                    this.$block = lVar;
                }

                @Override // x7.AbstractC5217a
                public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
                    return new C0179a(this.$block, interfaceC5133d);
                }

                @Override // E7.p
                public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
                    return ((C0179a) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
                }

                @Override // x7.AbstractC5217a
                public final Object invokeSuspend(Object obj) {
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    int i = this.label;
                    if (i == 0) {
                        com.bumptech.glide.f.r(obj);
                        E7.l lVar = this.$block;
                        this.label = 1;
                        if (lVar.invoke(this) == enumC5179a) {
                            return enumC5179a;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.f.r(obj);
                    }
                    return v.f40183a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(E7.l lVar, InterfaceC5133d interfaceC5133d) {
                super(2, interfaceC5133d);
                this.$block = lVar;
            }

            @Override // x7.AbstractC5217a
            public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
                return new a(this.$block, interfaceC5133d);
            }

            @Override // E7.p
            public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
                return ((a) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
            }

            @Override // x7.AbstractC5217a
            public final Object invokeSuspend(Object obj) {
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                int i = this.label;
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    V7.e eVar = F.f2551a;
                    P7.e eVar2 = o.f3162a;
                    C0179a c0179a = new C0179a(this.$block, null);
                    this.label = 1;
                    if (AbstractC0399y.y(eVar2, c0179a, this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                return v.f40183a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(E7.l lVar) {
            super(0);
            this.$block = lVar;
        }

        @Override // E7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11invoke();
            return v.f40183a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m11invoke() {
            try {
                AbstractC0399y.s(C5139j.f41372n, new a(this.$block, null));
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread with switch to main", e6);
            }
        }
    }

    public static final class h extends x7.h implements E7.l {
        final /* synthetic */ E7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(E7.l lVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$block = lVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new h(this.$block, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyOnSerialIO", e6);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((h) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class i extends x7.h implements E7.l {
        final /* synthetic */ E7.l $block;
        final /* synthetic */ E7.a $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(E7.l lVar, E7.a aVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$block = lVar;
            this.$onComplete = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new i(this.$block, this.$onComplete, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                E7.a aVar = this.$onComplete;
                if (aVar != null) {
                    aVar.invoke();
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithCompletion", e6);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((i) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class j extends x7.h implements E7.l {
        final /* synthetic */ E7.l $block;
        final /* synthetic */ E7.a $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(E7.l lVar, E7.a aVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$block = lVar;
            this.$onComplete = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new j(this.$block, this.$onComplete, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                E7.a aVar = this.$onComplete;
                if (aVar != null) {
                    aVar.invoke();
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithCompletion", e6);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((j) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class k extends x7.h implements p {
        final /* synthetic */ E7.l $block;
        final /* synthetic */ E7.a $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(E7.l lVar, E7.a aVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$block = lVar;
            this.$onComplete = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new k(this.$block, this.$onComplete, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((k) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                E7.a aVar = this.$onComplete;
                if (aVar != null) {
                    aVar.invoke();
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithCompletion", e6);
            }
            return v.f40183a;
        }
    }

    public static final class l extends x7.h implements E7.l {
        final /* synthetic */ E7.l $block;
        final /* synthetic */ E7.a $onComplete;
        final /* synthetic */ E7.l $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(E7.l lVar, E7.a aVar, E7.l lVar2, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$block = lVar;
            this.$onComplete = aVar;
            this.$onError = lVar2;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new l(this.$block, this.$onComplete, this.$onError, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                E7.a aVar = this.$onComplete;
                if (aVar != null) {
                    aVar.invoke();
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithErrorHandling", e6);
                E7.l lVar2 = this.$onError;
                if (lVar2 != null) {
                    lVar2.invoke(e6);
                }
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((l) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class m extends x7.h implements E7.l {
        final /* synthetic */ E7.l $block;
        final /* synthetic */ E7.a $onComplete;
        final /* synthetic */ E7.l $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(E7.l lVar, E7.a aVar, E7.l lVar2, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$block = lVar;
            this.$onComplete = aVar;
            this.$onError = lVar2;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new m(this.$block, this.$onComplete, this.$onError, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                E7.a aVar = this.$onComplete;
                if (aVar != null) {
                    aVar.invoke();
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithErrorHandling", e6);
                E7.l lVar2 = this.$onError;
                if (lVar2 != null) {
                    lVar2.invoke(e6);
                }
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((m) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class n extends x7.h implements p {
        final /* synthetic */ E7.l $block;
        final /* synthetic */ E7.a $onComplete;
        final /* synthetic */ E7.l $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(E7.l lVar, E7.a aVar, E7.l lVar2, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$block = lVar;
            this.$onComplete = aVar;
            this.$onError = lVar2;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new n(this.$block, this.$onComplete, this.$onError, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((n) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    E7.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                E7.a aVar = this.$onComplete;
                if (aVar != null) {
                    aVar.invoke();
                }
            } catch (Exception e6) {
                com.onesignal.debug.internal.logging.b.error("Exception in suspendifyWithErrorHandling", e6);
                E7.l lVar2 = this.$onError;
                if (lVar2 != null) {
                    lVar2.invoke(e6);
                }
            }
            return v.f40183a;
        }
    }

    public static final Y launchOnDefault(E7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        return com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading() ? com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new a(block, null)) : AbstractC0399y.o(T.f2572n, F.f2551a, new b(block, null), 2);
    }

    public static final Y launchOnIO(E7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        return com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading() ? com.onesignal.common.threading.b.INSTANCE.launchOnIO(new C0178c(block, null)) : AbstractC0399y.o(T.f2572n, F.f2553c, new d(block, null), 2);
    }

    public static final void runOnSerialIOIfBackgroundThreading(E7.a block) {
        kotlin.jvm.internal.h.e(block, "block");
        if (com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading()) {
            suspendifyOnSerialIO(new e(block, null));
        } else {
            block.invoke();
        }
    }

    public static final void suspendifyOnDefault(E7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        suspendifyWithCompletion(false, block, null);
    }

    public static final void suspendifyOnIO(E7.l block, E7.a aVar) {
        kotlin.jvm.internal.h.e(block, "block");
        suspendifyWithCompletion(true, block, aVar);
    }

    public static /* synthetic */ void suspendifyOnIO$default(E7.l lVar, E7.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        suspendifyOnIO(lVar, aVar);
    }

    public static final void suspendifyOnMain(E7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        if (com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading()) {
            com.onesignal.common.threading.b.INSTANCE.launchOnIO(new f(block, null));
        } else {
            new C4830c(1, new g(block)).start();
        }
    }

    public static final void suspendifyOnSerialIO(E7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        com.onesignal.common.threading.b.INSTANCE.launchOnSerialIO(new h(block, null));
    }

    public static final void suspendifyWithCompletion(boolean z8, E7.l block, E7.a aVar) {
        kotlin.jvm.internal.h.e(block, "block");
        if (!com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading()) {
            AbstractC0399y.o(T.f2572n, z8 ? F.f2553c : F.f2551a, new k(block, aVar, null), 2);
        } else if (z8) {
            com.onesignal.common.threading.b.INSTANCE.launchOnIO(new i(block, aVar, null));
        } else {
            com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new j(block, aVar, null));
        }
    }

    public static /* synthetic */ void suspendifyWithCompletion$default(boolean z8, E7.l lVar, E7.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z8 = true;
        }
        if ((i4 & 4) != 0) {
            aVar = null;
        }
        suspendifyWithCompletion(z8, lVar, aVar);
    }

    public static final void suspendifyWithErrorHandling(boolean z8, E7.l block, E7.l lVar, E7.a aVar) {
        kotlin.jvm.internal.h.e(block, "block");
        if (!com.onesignal.common.threading.d.INSTANCE.getUseBackgroundThreading()) {
            AbstractC0399y.o(T.f2572n, z8 ? F.f2553c : F.f2551a, new n(block, aVar, lVar, null), 2);
        } else if (z8) {
            com.onesignal.common.threading.b.INSTANCE.launchOnIO(new l(block, aVar, lVar, null));
        } else {
            com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new m(block, aVar, lVar, null));
        }
    }

    public static /* synthetic */ void suspendifyWithErrorHandling$default(boolean z8, E7.l lVar, E7.l lVar2, E7.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z8 = true;
        }
        if ((i4 & 4) != 0) {
            lVar2 = null;
        }
        if ((i4 & 8) != 0) {
            aVar = null;
        }
        suspendifyWithErrorHandling(z8, lVar, lVar2, aVar);
    }

    public static final void suspendifyOnIO(E7.l block) {
        kotlin.jvm.internal.h.e(block, "block");
        suspendifyWithCompletion(true, block, null);
    }
}
