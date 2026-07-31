package s2;

import a2.AbstractC1241b;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.InterfaceC3359v0;
import o2.K;
import o2.L;
import q2.EnumC3383a;
import r2.InterfaceC3396f;
import r2.InterfaceC3397g;

/* renamed from: s2.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3418i extends AbstractC3416g {

    /* renamed from: f, reason: collision with root package name */
    private final h2.n f45975f;

    /* renamed from: s2.i$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f45976l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f45977m;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC3397g f45979o;

        /* renamed from: s2.i$a$a, reason: collision with other inner class name */
        static final class C0274a implements InterfaceC3397g {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f45980b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3316J f45981c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3418i f45982d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC3397g f45983e;

            /* renamed from: s2.i$a$a$a, reason: collision with other inner class name */
            static final class C0275a extends kotlin.coroutines.jvm.internal.l implements Function2 {

                /* renamed from: l, reason: collision with root package name */
                int f45984l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ C3418i f45985m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ InterfaceC3397g f45986n;

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ Object f45987o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0275a(C3418i c3418i, InterfaceC3397g interfaceC3397g, Object obj, kotlin.coroutines.d dVar) {
                    super(2, dVar);
                    this.f45985m = c3418i;
                    this.f45986n = interfaceC3397g;
                    this.f45987o = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                    return new C0275a(this.f45985m, this.f45986n, this.f45987o, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object f4 = AbstractC1241b.f();
                    int i4 = this.f45984l;
                    if (i4 == 0) {
                        ResultKt.a(obj);
                        h2.n nVar = this.f45985m.f45975f;
                        InterfaceC3397g interfaceC3397g = this.f45986n;
                        Object obj2 = this.f45987o;
                        this.f45984l = 1;
                        if (nVar.invoke(interfaceC3397g, obj2, this) == f4) {
                            return f4;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                    }
                    return Unit.f41027a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
                    return ((C0275a) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
                }
            }

            /* renamed from: s2.i$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: l, reason: collision with root package name */
                Object f45988l;

                /* renamed from: m, reason: collision with root package name */
                Object f45989m;

                /* renamed from: n, reason: collision with root package name */
                Object f45990n;

                /* renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f45991o;

                /* renamed from: q, reason: collision with root package name */
                int f45993q;

                b(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f45991o = obj;
                    this.f45993q |= Integer.MIN_VALUE;
                    return C0274a.this.emit(null, this);
                }
            }

            C0274a(G g4, InterfaceC3316J interfaceC3316J, C3418i c3418i, InterfaceC3397g interfaceC3397g) {
                this.f45980b = g4;
                this.f45981c = interfaceC3316J;
                this.f45982d = c3418i;
                this.f45983e = interfaceC3397g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // r2.InterfaceC3397g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                b bVar;
                int i4;
                C0274a c0274a;
                InterfaceC3359v0 d4;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i5 = bVar.f45993q;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bVar.f45993q = i5 - Integer.MIN_VALUE;
                        Object obj2 = bVar.f45991o;
                        Object f4 = AbstractC1241b.f();
                        i4 = bVar.f45993q;
                        if (i4 != 0) {
                            ResultKt.a(obj2);
                            InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) this.f45980b.f41132b;
                            if (interfaceC3359v0 != null) {
                                interfaceC3359v0.cancel((CancellationException) new j());
                                bVar.f45988l = this;
                                bVar.f45989m = obj;
                                bVar.f45990n = interfaceC3359v0;
                                bVar.f45993q = 1;
                                if (interfaceC3359v0.join(bVar) == f4) {
                                    return f4;
                                }
                            }
                            c0274a = this;
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = bVar.f45989m;
                            c0274a = (C0274a) bVar.f45988l;
                            ResultKt.a(obj2);
                        }
                        G g4 = c0274a.f45980b;
                        d4 = AbstractC3337k.d(c0274a.f45981c, null, L.f42012e, new C0275a(c0274a.f45982d, c0274a.f45983e, obj, null), 1, null);
                        g4.f41132b = d4;
                        return Unit.f41027a;
                    }
                }
                bVar = new b(dVar);
                Object obj22 = bVar.f45991o;
                Object f42 = AbstractC1241b.f();
                i4 = bVar.f45993q;
                if (i4 != 0) {
                }
                G g42 = c0274a.f45980b;
                d4 = AbstractC3337k.d(c0274a.f45981c, null, L.f42012e, new C0275a(c0274a.f45982d, c0274a.f45983e, obj, null), 1, null);
                g42.f41132b = d4;
                return Unit.f41027a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f45979o = interfaceC3397g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = C3418i.this.new a(this.f45979o, dVar);
            aVar.f45977m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f45976l;
            if (i4 == 0) {
                ResultKt.a(obj);
                InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f45977m;
                G g4 = new G();
                C3418i c3418i = C3418i.this;
                InterfaceC3396f interfaceC3396f = c3418i.f45971e;
                C0274a c0274a = new C0274a(g4, interfaceC3316J, c3418i, this.f45979o);
                this.f45976l = 1;
                if (interfaceC3396f.a(c0274a, this) == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return Unit.f41027a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
            return ((a) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }
    }

    public /* synthetic */ C3418i(h2.n nVar, InterfaceC3396f interfaceC3396f, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, interfaceC3396f, (i5 & 4) != 0 ? kotlin.coroutines.g.f41113b : coroutineContext, (i5 & 8) != 0 ? -2 : i4, (i5 & 16) != 0 ? EnumC3383a.f43420b : enumC3383a);
    }

    @Override // s2.AbstractC3414e
    protected AbstractC3414e j(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        return new C3418i(this.f45975f, this.f45971e, coroutineContext, i4, enumC3383a);
    }

    @Override // s2.AbstractC3416g
    protected Object r(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        Object g4 = K.g(new a(interfaceC3397g, null), dVar);
        return g4 == AbstractC1241b.f() ? g4 : Unit.f41027a;
    }

    public C3418i(h2.n nVar, InterfaceC3396f interfaceC3396f, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        super(interfaceC3396f, coroutineContext, i4, enumC3383a);
        this.f45975f = nVar;
    }
}
