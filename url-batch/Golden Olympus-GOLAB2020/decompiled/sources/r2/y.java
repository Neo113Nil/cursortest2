package r2;

import a2.AbstractC1241b;
import java.util.Arrays;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3349q;
import o2.C3345o;
import o2.InterfaceC3320b0;
import o2.InterfaceC3359v0;
import q2.EnumC3383a;
import s2.AbstractC3411b;
import s2.AbstractC3412c;
import s2.AbstractC3413d;

/* loaded from: classes3.dex */
public class y extends AbstractC3411b implements t, InterfaceC3396f, s2.p {

    /* renamed from: f, reason: collision with root package name */
    private final int f43621f;

    /* renamed from: g, reason: collision with root package name */
    private final int f43622g;

    /* renamed from: h, reason: collision with root package name */
    private final EnumC3383a f43623h;

    /* renamed from: i, reason: collision with root package name */
    private Object[] f43624i;

    /* renamed from: j, reason: collision with root package name */
    private long f43625j;

    /* renamed from: k, reason: collision with root package name */
    private long f43626k;

    /* renamed from: l, reason: collision with root package name */
    private int f43627l;

    /* renamed from: m, reason: collision with root package name */
    private int f43628m;

    private static final class a implements InterfaceC3320b0 {

        /* renamed from: b, reason: collision with root package name */
        public final y f43629b;

        /* renamed from: c, reason: collision with root package name */
        public long f43630c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f43631d;

        /* renamed from: e, reason: collision with root package name */
        public final kotlin.coroutines.d f43632e;

        public a(y yVar, long j4, Object obj, kotlin.coroutines.d dVar) {
            this.f43629b = yVar;
            this.f43630c = j4;
            this.f43631d = obj;
            this.f43632e = dVar;
        }

        @Override // o2.InterfaceC3320b0
        public void dispose() {
            this.f43629b.z(this);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43633a;

        static {
            int[] iArr = new int[EnumC3383a.values().length];
            try {
                iArr[EnumC3383a.f43420b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3383a.f43422d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3383a.f43421c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43633a = iArr;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f43634l;

        /* renamed from: m, reason: collision with root package name */
        Object f43635m;

        /* renamed from: n, reason: collision with root package name */
        Object f43636n;

        /* renamed from: o, reason: collision with root package name */
        Object f43637o;

        /* renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f43638p;

        /* renamed from: r, reason: collision with root package name */
        int f43640r;

        c(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43638p = obj;
            this.f43640r |= Integer.MIN_VALUE;
            return y.B(y.this, null, this);
        }
    }

    public y(int i4, int i5, EnumC3383a enumC3383a) {
        this.f43621f = i4;
        this.f43622g = i5;
        this.f43623h = enumC3383a;
    }

    private final void A() {
        Object f4;
        if (this.f43622g != 0 || this.f43628m > 1) {
            Object[] objArr = this.f43624i;
            Intrinsics.checkNotNull(objArr);
            while (this.f43628m > 0) {
                f4 = z.f(objArr, (L() + Q()) - 1);
                if (f4 != z.f43641a) {
                    return;
                }
                this.f43628m--;
                z.g(objArr, L() + Q(), null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        o2.AbstractC3367z0.j(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        r0.f43634l = r5;
        r0.f43635m = r2;
        r0.f43636n = r9;
        r0.f43637o = r8;
        r0.f43640r = 3;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r2.emit(r10, r0) != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003b, B:18:0x0092, B:20:0x009a, B:29:0x00ad, B:30:0x00b0, B:36:0x005d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[EDGE_INSN: B:27:0x00ab->B:28:0x00ab BREAK  A[LOOP:0: B:18:0x0092->B:26:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r5v1, types: [s2.b] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, r2.y] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [r2.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [s2.d] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, r2.A] */
    /* JADX WARN: Type inference failed for: r9v9, types: [r2.A] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00be -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object B(y yVar, InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        c cVar;
        int i4;
        ?? r5;
        InterfaceC3397g interfaceC3397g2;
        InterfaceC3359v0 interfaceC3359v0;
        InterfaceC3359v0 interfaceC3359v02;
        InterfaceC3397g interfaceC3397g3;
        Object V3;
        C3388A c3388a;
        try {
            try {
                if (dVar instanceof c) {
                    cVar = (c) dVar;
                    int i5 = cVar.f43640r;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        cVar.f43640r = i5 - Integer.MIN_VALUE;
                        Object obj = cVar.f43638p;
                        Object f4 = AbstractC1241b.f();
                        i4 = cVar.f43640r;
                        if (i4 != 0) {
                            ResultKt.a(obj);
                            interfaceC3397g2 = interfaceC3397g;
                            interfaceC3397g = (C3388A) yVar.i();
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    interfaceC3359v02 = (InterfaceC3359v0) cVar.f43637o;
                                    C3388A c3388a2 = (C3388A) cVar.f43636n;
                                    interfaceC3397g3 = (InterfaceC3397g) cVar.f43635m;
                                    y yVar2 = (y) cVar.f43634l;
                                    ResultKt.a(obj);
                                    r5 = yVar2;
                                    interfaceC3397g = c3388a2;
                                    while (true) {
                                        V3 = r5.V(interfaceC3397g);
                                        if (V3 != z.f43641a) {
                                        }
                                    }
                                    return f4;
                                }
                                if (i4 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC3359v02 = (InterfaceC3359v0) cVar.f43637o;
                                C3388A c3388a3 = (C3388A) cVar.f43636n;
                                interfaceC3397g3 = (InterfaceC3397g) cVar.f43635m;
                                y yVar3 = (y) cVar.f43634l;
                                ResultKt.a(obj);
                                y yVar4 = yVar3;
                                C3388A c3388a4 = c3388a3;
                                interfaceC3397g2 = interfaceC3397g3;
                                interfaceC3359v0 = interfaceC3359v02;
                                yVar = yVar4;
                                c3388a = c3388a4;
                                r5 = yVar;
                                interfaceC3359v02 = interfaceC3359v0;
                                interfaceC3397g3 = interfaceC3397g2;
                                interfaceC3397g = c3388a;
                                while (true) {
                                    V3 = r5.V(interfaceC3397g);
                                    if (V3 != z.f43641a) {
                                        break;
                                    }
                                    cVar.f43634l = r5;
                                    cVar.f43635m = interfaceC3397g3;
                                    cVar.f43636n = interfaceC3397g;
                                    cVar.f43637o = interfaceC3359v02;
                                    cVar.f43640r = 2;
                                    if (r5.y(interfaceC3397g, cVar) == f4) {
                                        break;
                                    }
                                }
                                return f4;
                            }
                            interfaceC3397g = (C3388A) cVar.f43636n;
                            InterfaceC3397g interfaceC3397g4 = (InterfaceC3397g) cVar.f43635m;
                            y yVar5 = (y) cVar.f43634l;
                            try {
                                ResultKt.a(obj);
                                interfaceC3397g2 = interfaceC3397g4;
                                yVar = yVar5;
                                interfaceC3397g = interfaceC3397g;
                            } catch (Throwable th) {
                                th = th;
                                r5 = yVar5;
                                r5.l(interfaceC3397g);
                                throw th;
                            }
                        }
                        interfaceC3359v0 = (InterfaceC3359v0) cVar.getContext().get(InterfaceC3359v0.f42105N2);
                        c3388a = interfaceC3397g;
                        r5 = yVar;
                        interfaceC3359v02 = interfaceC3359v0;
                        interfaceC3397g3 = interfaceC3397g2;
                        interfaceC3397g = c3388a;
                        while (true) {
                            V3 = r5.V(interfaceC3397g);
                            if (V3 != z.f43641a) {
                            }
                        }
                        return f4;
                    }
                }
                interfaceC3359v0 = (InterfaceC3359v0) cVar.getContext().get(InterfaceC3359v0.f42105N2);
                c3388a = interfaceC3397g;
                r5 = yVar;
                interfaceC3359v02 = interfaceC3359v0;
                interfaceC3397g3 = interfaceC3397g2;
                interfaceC3397g = c3388a;
                while (true) {
                    V3 = r5.V(interfaceC3397g);
                    if (V3 != z.f43641a) {
                    }
                }
                return f4;
            } catch (Throwable th2) {
                r5 = yVar;
                th = th2;
                r5.l(interfaceC3397g);
                throw th;
            }
            if (i4 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        cVar = yVar.new c(dVar);
        Object obj2 = cVar.f43638p;
        Object f42 = AbstractC1241b.f();
        i4 = cVar.f43640r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = ((s2.AbstractC3411b) r8).f45956b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void C(long j4) {
        int i4;
        AbstractC3413d[] abstractC3413dArr;
        i4 = ((AbstractC3411b) this).f45957c;
        if (i4 != 0 && abstractC3413dArr != null) {
            for (AbstractC3413d abstractC3413d : abstractC3413dArr) {
                if (abstractC3413d != null) {
                    C3388A c3388a = (C3388A) abstractC3413d;
                    long j5 = c3388a.f43496a;
                    if (j5 >= 0 && j5 < j4) {
                        c3388a.f43496a = j4;
                    }
                }
            }
        }
        this.f43626k = j4;
    }

    private final void F() {
        Object[] objArr = this.f43624i;
        Intrinsics.checkNotNull(objArr);
        z.g(objArr, L(), null);
        this.f43627l--;
        long L3 = L() + 1;
        if (this.f43625j < L3) {
            this.f43625j = L3;
        }
        if (this.f43626k < L3) {
            C(L3);
        }
    }

    static /* synthetic */ Object G(y yVar, Object obj, kotlin.coroutines.d dVar) {
        if (yVar.d(obj)) {
            return Unit.f41027a;
        }
        Object H3 = yVar.H(obj, dVar);
        return H3 == AbstractC1241b.f() ? H3 : Unit.f41027a;
    }

    private final Object H(Object obj, kotlin.coroutines.d dVar) {
        Throwable th;
        kotlin.coroutines.d[] J3;
        a aVar;
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        kotlin.coroutines.d[] dVarArr = AbstractC3412c.f45960a;
        synchronized (this) {
            try {
                if (S(obj)) {
                    try {
                        Result.Companion companion = Result.Companion;
                        c3345o.resumeWith(Result.m243constructorimpl(Unit.f41027a));
                        J3 = J(dVarArr);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        aVar = new a(this, L() + Q(), obj, c3345o);
                        I(aVar);
                        this.f43628m++;
                        if (this.f43622g == 0) {
                            dVarArr = J(dVarArr);
                        }
                        J3 = dVarArr;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    AbstractC3349q.a(c3345o, aVar);
                }
                for (kotlin.coroutines.d dVar2 : J3) {
                    if (dVar2 != null) {
                        Result.Companion companion2 = Result.Companion;
                        dVar2.resumeWith(Result.m243constructorimpl(Unit.f41027a));
                    }
                }
                Object y4 = c3345o.y();
                if (y4 == AbstractC1241b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return y4 == AbstractC1241b.f() ? y4 : Unit.f41027a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(Object obj) {
        int Q3 = Q();
        Object[] objArr = this.f43624i;
        if (objArr == null) {
            objArr = R(null, 0, 2);
        } else if (Q3 >= objArr.length) {
            objArr = R(objArr, Q3, objArr.length * 2);
        }
        z.g(objArr, L() + Q3, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r1 = ((s2.AbstractC3411b) r10).f45956b;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.coroutines.d[] J(kotlin.coroutines.d[] dVarArr) {
        int i4;
        AbstractC3413d[] abstractC3413dArr;
        C3388A c3388a;
        kotlin.coroutines.d dVar;
        int length = dVarArr.length;
        i4 = ((AbstractC3411b) this).f45957c;
        if (i4 != 0 && abstractC3413dArr != null) {
            int length2 = abstractC3413dArr.length;
            int i5 = 0;
            dVarArr = dVarArr;
            while (i5 < length2) {
                AbstractC3413d abstractC3413d = abstractC3413dArr[i5];
                if (abstractC3413d != null && (dVar = (c3388a = (C3388A) abstractC3413d).f43497b) != null && U(c3388a) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = dVar;
                    c3388a.f43497b = null;
                    length++;
                }
                i5++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    private final long K() {
        return L() + this.f43627l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long L() {
        return Math.min(this.f43626k, this.f43625j);
    }

    private final Object N(long j4) {
        Object f4;
        Object[] objArr = this.f43624i;
        Intrinsics.checkNotNull(objArr);
        f4 = z.f(objArr, j4);
        return f4 instanceof a ? ((a) f4).f43631d : f4;
    }

    private final long O() {
        return L() + this.f43627l + this.f43628m;
    }

    private final int P() {
        return (int) ((L() + this.f43627l) - this.f43625j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q() {
        return this.f43627l + this.f43628m;
    }

    private final Object[] R(Object[] objArr, int i4, int i5) {
        Object f4;
        if (i5 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i5];
        this.f43624i = objArr2;
        if (objArr != null) {
            long L3 = L();
            for (int i6 = 0; i6 < i4; i6++) {
                long j4 = i6 + L3;
                f4 = z.f(objArr, j4);
                z.g(objArr2, j4, f4);
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S(Object obj) {
        if (m() == 0) {
            return T(obj);
        }
        if (this.f43627l >= this.f43622g && this.f43626k <= this.f43625j) {
            int i4 = b.f43633a[this.f43623h.ordinal()];
            if (i4 == 1) {
                return false;
            }
            if (i4 == 2) {
                return true;
            }
        }
        I(obj);
        int i5 = this.f43627l + 1;
        this.f43627l = i5;
        if (i5 > this.f43622g) {
            F();
        }
        if (P() > this.f43621f) {
            W(this.f43625j + 1, this.f43626k, K(), O());
        }
        return true;
    }

    private final boolean T(Object obj) {
        if (this.f43621f == 0) {
            return true;
        }
        I(obj);
        int i4 = this.f43627l + 1;
        this.f43627l = i4;
        if (i4 > this.f43621f) {
            F();
        }
        this.f43626k = L() + this.f43627l;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long U(C3388A c3388a) {
        long j4 = c3388a.f43496a;
        if (j4 >= K() && (this.f43622g > 0 || j4 > L() || this.f43628m == 0)) {
            return -1L;
        }
        return j4;
    }

    private final Object V(C3388A c3388a) {
        Object obj;
        kotlin.coroutines.d[] dVarArr = AbstractC3412c.f45960a;
        synchronized (this) {
            try {
                long U3 = U(c3388a);
                if (U3 < 0) {
                    obj = z.f43641a;
                } else {
                    long j4 = c3388a.f43496a;
                    Object N3 = N(U3);
                    c3388a.f43496a = U3 + 1;
                    dVarArr = X(j4);
                    obj = N3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.d dVar : dVarArr) {
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m243constructorimpl(Unit.f41027a));
            }
        }
        return obj;
    }

    private final void W(long j4, long j5, long j6, long j7) {
        long min = Math.min(j5, j4);
        for (long L3 = L(); L3 < min; L3++) {
            Object[] objArr = this.f43624i;
            Intrinsics.checkNotNull(objArr);
            z.g(objArr, L3, null);
        }
        this.f43625j = j4;
        this.f43626k = j5;
        this.f43627l = (int) (j6 - min);
        this.f43628m = (int) (j7 - j6);
    }

    private final Object y(C3388A c3388a, kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        synchronized (this) {
            try {
                if (U(c3388a) < 0) {
                    c3388a.f43497b = c3345o;
                } else {
                    Result.Companion companion = Result.Companion;
                    c3345o.resumeWith(Result.m243constructorimpl(Unit.f41027a));
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == AbstractC1241b.f() ? y4 : Unit.f41027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(a aVar) {
        Object f4;
        synchronized (this) {
            if (aVar.f43630c < L()) {
                return;
            }
            Object[] objArr = this.f43624i;
            Intrinsics.checkNotNull(objArr);
            f4 = z.f(objArr, aVar.f43630c);
            if (f4 != aVar) {
                return;
            }
            z.g(objArr, aVar.f43630c, z.f43641a);
            A();
            Unit unit = Unit.f41027a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s2.AbstractC3411b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C3388A j() {
        return new C3388A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s2.AbstractC3411b
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C3388A[] k(int i4) {
        return new C3388A[i4];
    }

    protected final Object M() {
        Object f4;
        Object[] objArr = this.f43624i;
        Intrinsics.checkNotNull(objArr);
        f4 = z.f(objArr, (this.f43625j + P()) - 1);
        return f4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r5 = ((s2.AbstractC3411b) r21).f45956b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.coroutines.d[] X(long j4) {
        int i4;
        long j5;
        long j6;
        long j7;
        Object f4;
        Object f5;
        AbstractC3413d[] abstractC3413dArr;
        if (j4 > this.f43626k) {
            return AbstractC3412c.f45960a;
        }
        long L3 = L();
        long j8 = this.f43627l + L3;
        if (this.f43622g == 0 && this.f43628m > 0) {
            j8++;
        }
        i4 = ((AbstractC3411b) this).f45957c;
        if (i4 != 0 && abstractC3413dArr != null) {
            for (AbstractC3413d abstractC3413d : abstractC3413dArr) {
                if (abstractC3413d != null) {
                    long j9 = ((C3388A) abstractC3413d).f43496a;
                    if (j9 >= 0 && j9 < j8) {
                        j8 = j9;
                    }
                }
            }
        }
        if (j8 <= this.f43626k) {
            return AbstractC3412c.f45960a;
        }
        long K3 = K();
        int min = m() > 0 ? Math.min(this.f43628m, this.f43622g - ((int) (K3 - j8))) : this.f43628m;
        kotlin.coroutines.d[] dVarArr = AbstractC3412c.f45960a;
        long j10 = this.f43628m + K3;
        if (min > 0) {
            dVarArr = new kotlin.coroutines.d[min];
            Object[] objArr = this.f43624i;
            Intrinsics.checkNotNull(objArr);
            j7 = 1;
            long j11 = K3;
            int i5 = 0;
            while (true) {
                if (K3 >= j10) {
                    j5 = L3;
                    j6 = j8;
                    K3 = j11;
                    break;
                }
                f5 = z.f(objArr, K3);
                j5 = L3;
                t2.G g4 = z.f43641a;
                if (f5 != g4) {
                    Intrinsics.checkNotNull(f5, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) f5;
                    int i6 = i5 + 1;
                    j6 = j8;
                    dVarArr[i5] = aVar.f43632e;
                    z.g(objArr, K3, g4);
                    z.g(objArr, j11, aVar.f43631d);
                    long j12 = j11 + 1;
                    if (i6 >= min) {
                        K3 = j12;
                        break;
                    }
                    i5 = i6;
                    j11 = j12;
                } else {
                    j6 = j8;
                }
                K3++;
                L3 = j5;
                j8 = j6;
            }
        } else {
            j5 = L3;
            j6 = j8;
            j7 = 1;
        }
        kotlin.coroutines.d[] dVarArr2 = dVarArr;
        int i7 = (int) (K3 - j5);
        long j13 = m() == 0 ? K3 : j6;
        long max = Math.max(this.f43625j, K3 - Math.min(this.f43621f, i7));
        if (this.f43622g == 0 && max < j10) {
            Object[] objArr2 = this.f43624i;
            Intrinsics.checkNotNull(objArr2);
            f4 = z.f(objArr2, max);
            if (Intrinsics.areEqual(f4, z.f43641a)) {
                K3 += j7;
                max += j7;
            }
        }
        W(max, j13, K3, j10);
        A();
        return !(dVarArr2.length == 0) ? J(dVarArr2) : dVarArr2;
    }

    public final long Y() {
        long j4 = this.f43625j;
        if (j4 < this.f43626k) {
            this.f43626k = j4;
        }
        return j4;
    }

    @Override // r2.x, r2.InterfaceC3396f
    public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        return B(this, interfaceC3397g, dVar);
    }

    @Override // r2.t
    public void c() {
        synchronized (this) {
            try {
                try {
                    W(K(), this.f43626k, K(), O());
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // r2.t
    public boolean d(Object obj) {
        int i4;
        boolean z4;
        kotlin.coroutines.d[] dVarArr = AbstractC3412c.f45960a;
        synchronized (this) {
            if (S(obj)) {
                dVarArr = J(dVarArr);
                z4 = true;
            } else {
                z4 = false;
            }
        }
        for (kotlin.coroutines.d dVar : dVarArr) {
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m243constructorimpl(Unit.f41027a));
            }
        }
        return z4;
    }

    @Override // r2.t, r2.InterfaceC3397g
    public Object emit(Object obj, kotlin.coroutines.d dVar) {
        return G(this, obj, dVar);
    }

    @Override // s2.p
    public InterfaceC3396f f(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        return z.e(this, coroutineContext, i4, enumC3383a);
    }
}
