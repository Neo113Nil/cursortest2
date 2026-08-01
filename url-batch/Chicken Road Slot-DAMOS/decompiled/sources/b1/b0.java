package b1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n0.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f945a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f947c;

    /* renamed from: h, reason: collision with root package name */
    public h f951h;

    /* renamed from: i, reason: collision with root package name */
    public a0 f952i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f946b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final y f948d = new y(0, this);

    /* renamed from: e, reason: collision with root package name */
    public final a1.d f949e = new a1.d(2, this);

    /* renamed from: f, reason: collision with root package name */
    public final o0.e f950f = new o0.e(new a0[16]);
    public final Object g = new Object();
    public long j = -1;

    public b0(Function1 function1) {
        this.f945a = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:8:0x0011, B:11:0x007a, B:13:0x0082, B:15:0x0092, B:17:0x0087, B:20:0x0022, B:23:0x002e, B:25:0x0043, B:27:0x0051, B:29:0x005b, B:31:0x0066, B:38:0x0073, B:41:0x0098), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i3;
        synchronized (this.g) {
            try {
                o0.e eVar = this.f950f;
                int i10 = eVar.f7319i;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    Object[] objArr = eVar.f7317d;
                    if (i11 < i10) {
                        a0 a0Var = (a0) objArr[i11];
                        s.c0 c0Var = (s.c0) a0Var.f937f.k(obj);
                        if (c0Var != null) {
                            Object[] objArr2 = c0Var.f8278b;
                            int[] iArr = c0Var.f8279c;
                            long[] jArr = c0Var.f8277a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i13 = 0;
                                while (true) {
                                    long j = jArr[i13];
                                    i3 = i11;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                                        for (int i15 = 0; i15 < i14; i15++) {
                                            if ((j & 255) < 128) {
                                                int i16 = (i13 << 3) + i15;
                                                Object obj2 = objArr2[i16];
                                                int i17 = iArr[i16];
                                                a0Var.c(obj, obj2);
                                            }
                                            j >>= 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length) {
                                        break;
                                    }
                                    i13++;
                                    i11 = i3;
                                }
                                if (a0Var.f937f.j()) {
                                    i12++;
                                } else if (i12 > 0) {
                                    Object[] objArr3 = eVar.f7317d;
                                    objArr3[i3 - i12] = objArr3[i3];
                                }
                                i11 = i3 + 1;
                            }
                        }
                        i3 = i11;
                        if (a0Var.f937f.j()) {
                        }
                        i11 = i3 + 1;
                    } else {
                        int i18 = i10 - i12;
                        Arrays.fill(objArr, i18, i10, (Object) null);
                        eVar.f7319i = i18;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        boolean z10;
        Set set;
        Set set2;
        synchronized (this.g) {
            z10 = this.f947c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = this.f946b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        n0.m.b("Unexpected notification");
                        throw new hd.d();
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z11;
            }
            synchronized (this.g) {
                o0.e eVar = this.f950f;
                Object[] objArr = eVar.f7317d;
                int i3 = eVar.f7319i;
                for (int i10 = 0; i10 < i3; i10++) {
                    z11 = ((a0) objArr[i10]).a(set) || z11;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, Function1 function1, Function0 function0) {
        ?? r62;
        Object obj2;
        a0 a0Var;
        boolean z10;
        a0 a0Var2;
        long j;
        long j3;
        a0 a0Var3;
        i k0Var;
        long j10;
        s.c0 c0Var;
        int i3;
        long j11;
        s.c0 c0Var2;
        long b10 = x0.i.b();
        synchronized (this.g) {
            r62 = this.f950f;
            Object[] objArr = r62.f7317d;
            int i10 = r62.f7319i;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i11];
                if (((a0) obj2).f932a == function1) {
                    break;
                } else {
                    i11++;
                }
            }
            a0Var = (a0) obj2;
            z10 = true;
            if (a0Var == null) {
                function1.getClass();
                wd.g0.c(1, function1);
                a0Var = new a0(function1);
                r62.b(a0Var);
            }
            a0Var2 = this.f952i;
            j = this.j;
        }
        long j12 = r62;
        if (j != -1) {
            j12 = r62;
            if (j != b10) {
                n1.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + b10 + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                j12 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.g) {
                try {
                    this.f952i = a0Var;
                    this.j = b10;
                } catch (Throwable th) {
                    th = th;
                    j3 = j12;
                }
            }
            a1.d dVar = this.f949e;
            Object obj3 = a0Var.f933b;
            s.c0 c0Var3 = a0Var.f934c;
            int i12 = a0Var.f935d;
            a0Var.f933b = obj;
            a0Var.f934c = (s.c0) a0Var.f937f.g(obj);
            if (a0Var.f935d == -1) {
                a0Var.f935d = Long.hashCode(r.j().g());
            }
            z zVar = a0Var.f939i;
            o0.e n10 = n0.h.n();
            try {
                n10.b(zVar);
                if (dVar == null) {
                    function0.invoke();
                    a0Var3 = a0Var;
                } else {
                    i iVar = (i) r.f1029b.get();
                    if (iVar instanceof k0) {
                        a0Var3 = a0Var;
                        if (((k0) iVar).f1001t == x0.i.b()) {
                            Function1 function12 = ((k0) iVar).f999r;
                            Function1 function13 = ((k0) iVar).f1000s;
                            try {
                                ((k0) iVar).f999r = r.k(dVar, function12, true);
                                ((k0) iVar).f1000s = function13;
                                function0.invoke();
                                ((k0) iVar).f999r = function12;
                                ((k0) iVar).f1000s = function13;
                            } catch (Throwable th2) {
                                ((k0) iVar).f999r = function12;
                                ((k0) iVar).f1000s = function13;
                                throw th2;
                            }
                        }
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (iVar == null || (iVar instanceof d)) {
                        k0Var = new k0(iVar instanceof d ? (d) iVar : null, dVar, null, true, false);
                    } else {
                        k0Var = iVar.u(dVar);
                    }
                    try {
                        i j13 = k0Var.j();
                        try {
                            function0.invoke();
                            i.q(j13);
                            k0Var.c();
                        } catch (Throwable th3) {
                            try {
                                i.q(j13);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    k0Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    n10.l(n10.f7319i - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                n10.l(n10.f7319i - 1);
                a0 a0Var4 = a0Var3;
                Object obj4 = a0Var4.f933b;
                obj4.getClass();
                int i13 = a0Var4.f935d;
                s.c0 c0Var4 = a0Var4.f934c;
                if (c0Var4 != null) {
                    try {
                        long[] jArr = c0Var4.f8277a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j14 = jArr[i14];
                                boolean z11 = z10;
                                s.c0 c0Var5 = c0Var4;
                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    int i16 = 0;
                                    while (i16 < i15) {
                                        if ((j14 & 255) < 128) {
                                            i3 = i16;
                                            int i17 = (i14 << 3) + i3;
                                            j11 = j14;
                                            c0Var2 = c0Var5;
                                            Object obj5 = c0Var2.f8278b[i17];
                                            j10 = j;
                                            try {
                                                boolean z12 = c0Var2.f8279c[i17] != i13 ? z11 : false;
                                                if (z12) {
                                                    a0Var4.c(obj4, obj5);
                                                }
                                                if (z12) {
                                                    c0Var2.e(i17);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j3 = j10;
                                                synchronized (this.g) {
                                                }
                                            }
                                        } else {
                                            i3 = i16;
                                            j11 = j14;
                                            c0Var2 = c0Var5;
                                            j10 = j;
                                        }
                                        i16 = i3 + 1;
                                        long j15 = j10;
                                        c0Var5 = c0Var2;
                                        j14 = j11 >> 8;
                                        j = j15;
                                    }
                                    c0Var = c0Var5;
                                    j10 = j;
                                    if (i15 != 8) {
                                        break;
                                    }
                                } else {
                                    c0Var = c0Var5;
                                    j10 = j;
                                }
                                if (i14 == length) {
                                    break;
                                }
                                i14++;
                                c0Var4 = c0Var;
                                z10 = z11;
                                j = j10;
                            }
                            a0Var4.f933b = obj3;
                            a0Var4.f934c = c0Var3;
                            a0Var4.f935d = i12;
                            synchronized (this.g) {
                                this.f952i = a0Var2;
                                this.j = j10;
                            }
                            return;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j10 = j;
                        j3 = j10;
                        synchronized (this.g) {
                            this.f952i = a0Var2;
                            this.j = j3;
                        }
                        throw th;
                    }
                }
                j10 = j;
                a0Var4.f933b = obj3;
                a0Var4.f934c = c0Var3;
                a0Var4.f935d = i12;
                synchronized (this.g) {
                }
            } catch (Throwable th9) {
                th = th9;
                n10.l(n10.f7319i - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j3 = j;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void d() {
        y yVar = this.f948d;
        r.e(r.f1028a);
        synchronized (r.f1030c) {
            r.f1034h = CollectionsKt.F(r.f1034h, yVar);
        }
        this.f951h = new h(0, yVar);
    }
}
