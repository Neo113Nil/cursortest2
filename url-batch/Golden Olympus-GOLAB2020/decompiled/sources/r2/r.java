package r2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import o2.InterfaceC3316J;
import o2.InterfaceC3359v0;
import o2.L;
import q2.EnumC3383a;
import r2.D;
import s2.AbstractC3414e;

/* loaded from: classes3.dex */
abstract /* synthetic */ class r {

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f43597l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ D f43598m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC3396f f43599n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ t f43600o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Object f43601p;

        /* renamed from: r2.r$a$a, reason: collision with other inner class name */
        static final class C0252a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f43602l;

            /* renamed from: m, reason: collision with root package name */
            /* synthetic */ int f43603m;

            C0252a(kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            public final Object a(int i4, kotlin.coroutines.d dVar) {
                return ((C0252a) create(Integer.valueOf(i4), dVar)).invokeSuspend(Unit.f41027a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                C0252a c0252a = new C0252a(dVar);
                c0252a.f43603m = ((Number) obj).intValue();
                return c0252a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (kotlin.coroutines.d) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC1241b.f();
                if (this.f43602l != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f43603m > 0);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f43604l;

            /* renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f43605m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ InterfaceC3396f f43606n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ t f43607o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ Object f43608p;

            /* renamed from: r2.r$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0253a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f43609a;

                static {
                    int[] iArr = new int[EnumC3389B.values().length];
                    try {
                        iArr[EnumC3389B.f43498b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC3389B.f43499c.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC3389B.f43500d.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f43609a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC3396f interfaceC3396f, t tVar, Object obj, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f43606n = interfaceC3396f;
                this.f43607o = tVar;
                this.f43608p = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(EnumC3389B enumC3389B, kotlin.coroutines.d dVar) {
                return ((b) create(enumC3389B, dVar)).invokeSuspend(Unit.f41027a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                b bVar = new b(this.f43606n, this.f43607o, this.f43608p, dVar);
                bVar.f43605m = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object f4 = AbstractC1241b.f();
                int i4 = this.f43604l;
                if (i4 == 0) {
                    ResultKt.a(obj);
                    int i5 = C0253a.f43609a[((EnumC3389B) this.f43605m).ordinal()];
                    if (i5 == 1) {
                        InterfaceC3396f interfaceC3396f = this.f43606n;
                        t tVar = this.f43607o;
                        this.f43604l = 1;
                        if (interfaceC3396f.a(tVar, this) == f4) {
                            return f4;
                        }
                    } else if (i5 == 3) {
                        Object obj2 = this.f43608p;
                        if (obj2 == z.f43641a) {
                            this.f43607o.c();
                        } else {
                            this.f43607o.d(obj2);
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return Unit.f41027a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D d4, InterfaceC3396f interfaceC3396f, t tVar, Object obj, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f43598m = d4;
            this.f43599n = interfaceC3396f;
            this.f43600o = tVar;
            this.f43601p = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new a(this.f43598m, this.f43599n, this.f43600o, this.f43601p, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
        
            if (r8.a(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        
            if (r8.a(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        
            if (r2.AbstractC3398h.n(r8, r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        
            if (r2.AbstractC3398h.f(r8, r1, r7) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f43597l;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        ResultKt.a(obj);
                        InterfaceC3396f interfaceC3396f = this.f43599n;
                        t tVar = this.f43600o;
                        this.f43597l = 3;
                    } else if (i4 != 3 && i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.a(obj);
                return Unit.f41027a;
            }
            ResultKt.a(obj);
            D d4 = this.f43598m;
            D.a aVar = D.f43507a;
            if (d4 == aVar.a()) {
                InterfaceC3396f interfaceC3396f2 = this.f43599n;
                t tVar2 = this.f43600o;
                this.f43597l = 1;
            } else if (this.f43598m == aVar.b()) {
                G e4 = this.f43600o.e();
                C0252a c0252a = new C0252a(null);
                this.f43597l = 2;
            } else {
                InterfaceC3396f g4 = AbstractC3398h.g(this.f43598m.a(this.f43600o.e()));
                b bVar = new b(this.f43599n, this.f43600o, this.f43601p, null);
                this.f43597l = 4;
            }
            return f4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
            return ((a) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }
    }

    public static final G a(u uVar) {
        return new v(uVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final C3390C b(InterfaceC3396f interfaceC3396f, int i4) {
        AbstractC3414e abstractC3414e;
        InterfaceC3396f k4;
        int d4 = kotlin.ranges.g.d(i4, q2.d.f43474O2.a()) - i4;
        if (!(interfaceC3396f instanceof AbstractC3414e) || (k4 = (abstractC3414e = (AbstractC3414e) interfaceC3396f).k()) == null) {
            return new C3390C(interfaceC3396f, d4, EnumC3383a.f43420b, kotlin.coroutines.g.f41113b);
        }
        int i5 = abstractC3414e.f45962c;
        if (i5 != -3 && i5 != -2 && i5 != 0) {
            d4 = i5;
        } else if (abstractC3414e.f45963d != EnumC3383a.f43420b) {
            if (i4 == 0) {
                d4 = 1;
            }
            d4 = 0;
        }
        return new C3390C(k4, d4, abstractC3414e.f45963d, abstractC3414e.f45961b);
    }

    private static final InterfaceC3359v0 c(InterfaceC3316J interfaceC3316J, CoroutineContext coroutineContext, InterfaceC3396f interfaceC3396f, t tVar, D d4, Object obj) {
        return AbstractC3333i.c(interfaceC3316J, coroutineContext, Intrinsics.areEqual(d4, D.f43507a.a()) ? L.f42009b : L.f42012e, new a(d4, interfaceC3396f, tVar, obj, null));
    }

    public static final G d(InterfaceC3396f interfaceC3396f, InterfaceC3316J interfaceC3316J, D d4, Object obj) {
        C3390C b4 = b(interfaceC3396f, 1);
        u a4 = I.a(obj);
        return new v(a4, c(interfaceC3316J, b4.f43506d, b4.f43503a, a4, d4, obj));
    }
}
