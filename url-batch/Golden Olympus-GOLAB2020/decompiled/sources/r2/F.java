package r2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class F implements D {

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f43511l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f43512m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ G f43513n;

        /* renamed from: r2.F$a$a, reason: collision with other inner class name */
        static final class C0248a implements InterfaceC3397g {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.D f43514b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3397g f43515c;

            /* renamed from: r2.F$a$a$a, reason: collision with other inner class name */
            static final class C0249a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: l, reason: collision with root package name */
                /* synthetic */ Object f43516l;

                /* renamed from: n, reason: collision with root package name */
                int f43518n;

                C0249a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f43516l = obj;
                    this.f43518n |= Integer.MIN_VALUE;
                    return C0248a.this.a(0, this);
                }
            }

            C0248a(kotlin.jvm.internal.D d4, InterfaceC3397g interfaceC3397g) {
                this.f43514b = d4;
                this.f43515c = interfaceC3397g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object a(int i4, kotlin.coroutines.d dVar) {
                C0249a c0249a;
                int i5;
                if (dVar instanceof C0249a) {
                    c0249a = (C0249a) dVar;
                    int i6 = c0249a.f43518n;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0249a.f43518n = i6 - Integer.MIN_VALUE;
                        Object obj = c0249a.f43516l;
                        Object f4 = AbstractC1241b.f();
                        i5 = c0249a.f43518n;
                        if (i5 != 0) {
                            ResultKt.a(obj);
                            if (i4 > 0) {
                                kotlin.jvm.internal.D d4 = this.f43514b;
                                if (!d4.f41129b) {
                                    d4.f41129b = true;
                                    InterfaceC3397g interfaceC3397g = this.f43515c;
                                    EnumC3389B enumC3389B = EnumC3389B.f43498b;
                                    c0249a.f43518n = 1;
                                    if (interfaceC3397g.emit(enumC3389B, c0249a) == f4) {
                                        return f4;
                                    }
                                }
                            }
                            return Unit.f41027a;
                        }
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                        return Unit.f41027a;
                    }
                }
                c0249a = new C0249a(dVar);
                Object obj2 = c0249a.f43516l;
                Object f42 = AbstractC1241b.f();
                i5 = c0249a.f43518n;
                if (i5 != 0) {
                }
                return Unit.f41027a;
            }

            @Override // r2.InterfaceC3397g
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(G g4, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f43513n = g4;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
            return ((a) create(interfaceC3397g, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f43513n, dVar);
            aVar.f43512m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f43511l;
            if (i4 == 0) {
                ResultKt.a(obj);
                InterfaceC3397g interfaceC3397g = (InterfaceC3397g) this.f43512m;
                kotlin.jvm.internal.D d4 = new kotlin.jvm.internal.D();
                G g4 = this.f43513n;
                C0248a c0248a = new C0248a(d4, interfaceC3397g);
                this.f43511l = 1;
                if (g4.a(c0248a, this) == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            throw new W1.f();
        }
    }

    @Override // r2.D
    public InterfaceC3396f a(G g4) {
        return AbstractC3398h.o(new a(g4, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
