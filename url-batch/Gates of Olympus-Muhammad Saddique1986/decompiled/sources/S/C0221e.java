package S;

import I.C0143d;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import j.AbstractC0523E;
import j.C0519A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: S.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0221e extends i {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f4200n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0424c f4201e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0424c f4202f;

    /* renamed from: g, reason: collision with root package name */
    public int f4203g;

    /* renamed from: h, reason: collision with root package name */
    public C0519A f4204h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f4205i;

    /* renamed from: j, reason: collision with root package name */
    public n f4206j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f4207k;

    /* renamed from: l, reason: collision with root package name */
    public int f4208l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4209m;

    public C0221e(int i3, n nVar, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2) {
        super(i3, nVar);
        this.f4201e = interfaceC0424c;
        this.f4202f = interfaceC0424c2;
        this.f4206j = n.f4232h;
        this.f4207k = f4200n;
        this.f4208l = 1;
    }

    public void A(C0519A c0519a) {
        this.f4204h = c0519a;
    }

    public C0221e B(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2) {
        f fVar;
        if (this.f4218c) {
            C0143d.S("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f4209m && this.f4219d < 0) {
            C0143d.T("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = p.f4241b;
        synchronized (obj) {
            int i3 = p.f4243d;
            p.f4243d = i3 + 1;
            p.f4242c = p.f4242c.j(i3);
            n e3 = e();
            r(e3.j(i3));
            fVar = new f(i3, p.e(e3, d() + 1, i3), p.l(interfaceC0424c, f(), true), p.b(interfaceC0424c2, i()), this);
        }
        if (!this.f4209m && !this.f4218c) {
            int d3 = d();
            synchronized (obj) {
                int i4 = p.f4243d;
                p.f4243d = i4 + 1;
                q(i4);
                p.f4242c = p.f4242c.j(d());
            }
            r(p.e(e(), d3 + 1, d()));
        }
        return fVar;
    }

    @Override // S.i
    public final void b() {
        p.f4242c = p.f4242c.c(d()).b(this.f4206j);
    }

    @Override // S.i
    public void c() {
        if (this.f4218c) {
            return;
        }
        this.f4218c = true;
        synchronized (p.f4241b) {
            int i3 = this.f4219d;
            if (i3 >= 0) {
                p.u(i3);
                this.f4219d = -1;
            }
        }
        l();
    }

    @Override // S.i
    public boolean g() {
        return false;
    }

    @Override // S.i
    public int h() {
        return this.f4203g;
    }

    @Override // S.i
    public InterfaceC0424c i() {
        return this.f4202f;
    }

    @Override // S.i
    public void k() {
        this.f4208l++;
    }

    @Override // S.i
    public void l() {
        int i3 = this.f4208l;
        if (!(i3 > 0)) {
            C0143d.S("no pending nested snapshots");
            throw null;
        }
        int i4 = i3 - 1;
        this.f4208l = i4;
        if (i4 != 0 || this.f4209m) {
            return;
        }
        C0519A w2 = w();
        if (w2 != null) {
            if (this.f4209m) {
                C0143d.T("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int d3 = d();
            Object[] objArr = w2.f6248b;
            long[] jArr = w2.f6247a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j3 = jArr[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j3) < 128) {
                                for (A c2 = ((y) objArr[(i5 << 3) + i7]).c(); c2 != null; c2 = c2.f4175b) {
                                    int i8 = c2.f4174a;
                                    if (i8 != d3) {
                                        Iterable iterable = this.f4206j;
                                        Integer valueOf = Integer.valueOf(i8);
                                        f2.j.f(iterable, "<this>");
                                        if (!(iterable instanceof Collection ? ((Collection) iterable).contains(valueOf) : S1.l.M0(iterable, valueOf) >= 0)) {
                                        }
                                    }
                                    c2.f4174a = 0;
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        a();
    }

    @Override // S.i
    public void m() {
        if (this.f4209m || this.f4218c) {
            return;
        }
        u();
    }

    @Override // S.i
    public void n(y yVar) {
        C0519A w2 = w();
        if (w2 == null) {
            int i3 = AbstractC0523E.f6255a;
            w2 = new C0519A();
            A(w2);
        }
        w2.a(yVar);
    }

    @Override // S.i
    public final void o() {
        int length = this.f4207k.length;
        for (int i3 = 0; i3 < length; i3++) {
            p.u(this.f4207k[i3]);
        }
        int i4 = this.f4219d;
        if (i4 >= 0) {
            p.u(i4);
            this.f4219d = -1;
        }
    }

    @Override // S.i
    public void s(int i3) {
        this.f4203g = i3;
    }

    @Override // S.i
    public i t(InterfaceC0424c interfaceC0424c) {
        g gVar;
        if (this.f4218c) {
            C0143d.S("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f4209m && this.f4219d < 0) {
            C0143d.T("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int d3 = d();
        z(d());
        Object obj = p.f4241b;
        synchronized (obj) {
            int i3 = p.f4243d;
            p.f4243d = i3 + 1;
            p.f4242c = p.f4242c.j(i3);
            gVar = new g(i3, p.e(e(), d3 + 1, i3), p.l(interfaceC0424c, f(), true), this);
        }
        if (!this.f4209m && !this.f4218c) {
            int d4 = d();
            synchronized (obj) {
                int i4 = p.f4243d;
                p.f4243d = i4 + 1;
                q(i4);
                p.f4242c = p.f4242c.j(d());
            }
            r(p.e(e(), d4 + 1, d()));
        }
        return gVar;
    }

    public final void u() {
        z(d());
        if (this.f4209m || this.f4218c) {
            return;
        }
        int d3 = d();
        synchronized (p.f4241b) {
            int i3 = p.f4243d;
            p.f4243d = i3 + 1;
            q(i3);
            p.f4242c = p.f4242c.j(d());
        }
        r(p.e(e(), d3 + 1, d()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[LOOP:1: B:31:0x00bd->B:32:0x00bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u v() {
        HashMap hashMap;
        C0519A c0519a;
        S1.u uVar;
        int size;
        int i3;
        C0519A w2 = w();
        if (w2 != null) {
            AtomicReference atomicReference = p.f4248i;
            hashMap = p.c((C0221e) atomicReference.get(), this, p.f4242c.c(((C0220d) atomicReference.get()).f4217b));
        } else {
            hashMap = null;
        }
        S1.u uVar2 = S1.u.f4320d;
        synchronized (p.f4241b) {
            try {
                p.d(this);
                if (w2 != null && w2.f6250d != 0) {
                    C0220d c0220d = (C0220d) p.f4248i.get();
                    u y3 = y(p.f4243d, hashMap, p.f4242c.c(c0220d.f4217b));
                    if (!y3.equals(k.f4220b)) {
                        return y3;
                    }
                    b();
                    p.v(c0220d, o.f4238g);
                    c0519a = c0220d.f4204h;
                    A(null);
                    c0220d.f4204h = null;
                    uVar = p.f4246g;
                    this.f4209m = true;
                    if (c0519a != null) {
                        K.f fVar = new K.f(c0519a);
                        if (!c0519a.g()) {
                            int size2 = uVar.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                ((InterfaceC0426e) uVar.get(i4)).h(fVar, this);
                            }
                        }
                    }
                    if (w2 != null && w2.h()) {
                        K.f fVar2 = new K.f(w2);
                        size = uVar.size();
                        for (i3 = 0; i3 < size; i3++) {
                            ((InterfaceC0426e) uVar.get(i3)).h(fVar2, this);
                        }
                    }
                    synchronized (p.f4241b) {
                        try {
                            o();
                            p.g();
                            if (c0519a != null) {
                                Object[] objArr = c0519a.f6248b;
                                long[] jArr = c0519a.f6247a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j3 = jArr[i5];
                                        long[] jArr2 = jArr;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                                            for (int i7 = 0; i7 < i6; i7++) {
                                                if ((j3 & 255) < 128) {
                                                    p.q((y) objArr[(i5 << 3) + i7]);
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i6 != 8) {
                                                break;
                                            }
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                        jArr = jArr2;
                                    }
                                }
                            }
                            if (w2 != null) {
                                Object[] objArr2 = w2.f6248b;
                                long[] jArr3 = w2.f6247a;
                                int length2 = jArr3.length - 2;
                                if (length2 >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j4 = jArr3[i8];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j4 & 255) < 128) {
                                                    p.q((y) objArr2[(i8 << 3) + i10]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i9 != 8) {
                                                break;
                                            }
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                            }
                            ArrayList arrayList = this.f4205i;
                            if (arrayList != null) {
                                int size3 = arrayList.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    p.q((y) arrayList.get(i11));
                                }
                            }
                            this.f4205i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return k.f4220b;
                }
                b();
                C0220d c0220d2 = (C0220d) p.f4248i.get();
                p.v(c0220d2, o.f4238g);
                c0519a = c0220d2.f4204h;
                if (c0519a == null || !c0519a.h()) {
                    c0519a = null;
                    uVar = uVar2;
                } else {
                    uVar = p.f4246g;
                }
                this.f4209m = true;
                if (c0519a != null) {
                }
                if (w2 != null) {
                    K.f fVar22 = new K.f(w2);
                    size = uVar.size();
                    while (i3 < size) {
                    }
                }
                synchronized (p.f4241b) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C0519A w() {
        return this.f4204h;
    }

    @Override // S.i
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public InterfaceC0424c f() {
        return this.f4201e;
    }

    public final u y(int i3, HashMap hashMap, n nVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        n nVar2;
        Object[] objArr;
        long[] jArr;
        n nVar3;
        Object[] objArr2;
        long[] jArr2;
        int i4;
        A s3;
        A b3;
        n i5 = e().j(d()).i(this.f4206j);
        C0519A w2 = w();
        f2.j.c(w2);
        Object[] objArr3 = w2.f6248b;
        long[] jArr3 = w2.f6247a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            arrayList4 = null;
            arrayList3 = null;
            while (true) {
                long j3 = jArr3[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j3 & 255) < 128) {
                            y yVar = (y) objArr3[(i6 << 3) + i9];
                            A c2 = yVar.c();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            A s4 = p.s(c2, i3, nVar);
                            if (s4 == null || (s3 = p.s(c2, d(), i5)) == null) {
                                nVar3 = i5;
                            } else {
                                nVar3 = i5;
                                if (s3.f4174a != 1 && !s4.equals(s3)) {
                                    A s5 = p.s(c2, d(), e());
                                    if (s5 == null) {
                                        p.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (b3 = (A) hashMap.get(s4)) == null) {
                                        b3 = yVar.b(s3, s4, s5);
                                    }
                                    if (b3 == null) {
                                        return new j();
                                    }
                                    if (!b3.equals(s5)) {
                                        if (b3.equals(s4)) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(new R1.i(yVar, s4.b()));
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(yVar);
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(!b3.equals(s3) ? new R1.i(yVar, b3) : new R1.i(yVar, s3.b()));
                                        }
                                    }
                                }
                            }
                            i4 = 8;
                        } else {
                            nVar3 = i5;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i4 = i7;
                        }
                        j3 >>= i4;
                        i9++;
                        i7 = i4;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        i5 = nVar3;
                    }
                    nVar2 = i5;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i8 != i7) {
                        break;
                    }
                } else {
                    nVar2 = i5;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i6 == length) {
                    arrayList2 = arrayList4;
                    arrayList = arrayList3;
                    break;
                }
                i6++;
                objArr3 = objArr;
                jArr3 = jArr;
                i5 = nVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        arrayList4 = arrayList2;
        if (arrayList4 != null) {
            u();
            int size = arrayList4.size();
            for (int i10 = 0; i10 < size; i10++) {
                R1.i iVar = (R1.i) arrayList4.get(i10);
                y yVar2 = (y) iVar.f4150d;
                A a3 = (A) iVar.f4151e;
                a3.f4174a = d();
                synchronized (p.f4241b) {
                    a3.f4175b = yVar2.c();
                    yVar2.d(a3);
                }
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                w2.j((y) arrayList3.get(i11));
            }
            ArrayList arrayList5 = this.f4205i;
            if (arrayList5 != null) {
                arrayList3 = S1.l.U0(arrayList5, arrayList3);
            }
            this.f4205i = arrayList3;
        }
        return k.f4220b;
    }

    public final void z(int i3) {
        synchronized (p.f4241b) {
            this.f4206j = this.f4206j.j(i3);
        }
    }
}
