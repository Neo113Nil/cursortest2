package Q;

import G.C0192d;
import i.AbstractC0665F;
import i.C0661B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1405I;

/* renamed from: Q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0269e extends AbstractC0274j {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f3835n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f3836e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f3837f;

    /* renamed from: g, reason: collision with root package name */
    public int f3838g;

    /* renamed from: h, reason: collision with root package name */
    public C0661B f3839h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3840i;

    /* renamed from: j, reason: collision with root package name */
    public o f3841j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f3842k;

    /* renamed from: l, reason: collision with root package name */
    public int f3843l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3844m;

    public C0269e(int i2, o oVar, Function1 function1, Function1 function12) {
        super(i2, oVar);
        this.f3836e = function1;
        this.f3837f = function12;
        this.f3841j = o.f3869k;
        this.f3842k = f3835n;
        this.f3843l = 1;
    }

    public void A(C0661B c0661b) {
        this.f3839h = c0661b;
    }

    public C0269e B(Function1 function1, Function1 function12) {
        C0270f c0270f;
        if (this.f3855c) {
            C0192d.S("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f3844m && this.f3856d < 0) {
            C0192d.T("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = q.f3878b;
        synchronized (obj) {
            int i2 = q.f3880d;
            q.f3880d = i2 + 1;
            q.f3879c = q.f3879c.B(i2);
            o e4 = e();
            r(e4.B(i2));
            c0270f = new C0270f(i2, q.e(e4, d() + 1, i2), q.l(function1, f(), true), q.b(function12, i()), this);
        }
        if (!this.f3844m && !this.f3855c) {
            int d4 = d();
            synchronized (obj) {
                int i4 = q.f3880d;
                q.f3880d = i4 + 1;
                q(i4);
                q.f3879c = q.f3879c.B(d());
                Unit unit = Unit.f7487a;
            }
            r(q.e(e(), d4 + 1, d()));
        }
        return c0270f;
    }

    @Override // Q.AbstractC0274j
    public final void b() {
        q.f3879c = q.f3879c.h(d()).e(this.f3841j);
    }

    @Override // Q.AbstractC0274j
    public void c() {
        if (this.f3855c) {
            return;
        }
        super.c();
        l();
    }

    @Override // Q.AbstractC0274j
    public boolean g() {
        return false;
    }

    @Override // Q.AbstractC0274j
    public int h() {
        return this.f3838g;
    }

    @Override // Q.AbstractC0274j
    public Function1 i() {
        return this.f3837f;
    }

    @Override // Q.AbstractC0274j
    public void k() {
        this.f3843l++;
    }

    @Override // Q.AbstractC0274j
    public void l() {
        int i2 = this.f3843l;
        if (!(i2 > 0)) {
            C0192d.S("no pending nested snapshots");
            throw null;
        }
        int i4 = i2 - 1;
        this.f3843l = i4;
        if (i4 != 0 || this.f3844m) {
            return;
        }
        C0661B w4 = w();
        if (w4 != null) {
            if (this.f3844m) {
                C0192d.T("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int d4 = d();
            Object[] objArr = w4.f6885b;
            long[] jArr = w4.f6884a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j4 = jArr[i5];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j4) < 128) {
                                for (F h4 = ((D) objArr[(i5 << 3) + i7]).h(); h4 != null; h4 = h4.f3810b) {
                                    int i8 = h4.f3809a;
                                    if (i8 == d4 || C1403G.o(this.f3841j, Integer.valueOf(i8))) {
                                        h4.f3809a = 0;
                                    }
                                }
                            }
                            j4 >>= 8;
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

    @Override // Q.AbstractC0274j
    public void m() {
        if (this.f3844m || this.f3855c) {
            return;
        }
        u();
    }

    @Override // Q.AbstractC0274j
    public void n(D d4) {
        C0661B w4 = w();
        if (w4 == null) {
            int i2 = AbstractC0665F.f6892a;
            w4 = new C0661B();
            A(w4);
        }
        w4.a(d4);
    }

    @Override // Q.AbstractC0274j
    public final void o() {
        int length = this.f3842k.length;
        for (int i2 = 0; i2 < length; i2++) {
            q.u(this.f3842k[i2]);
        }
        int i4 = this.f3856d;
        if (i4 >= 0) {
            q.u(i4);
            this.f3856d = -1;
        }
    }

    @Override // Q.AbstractC0274j
    public void s(int i2) {
        this.f3838g = i2;
    }

    @Override // Q.AbstractC0274j
    public AbstractC0274j t(Function1 function1) {
        C0271g c0271g;
        if (this.f3855c) {
            C0192d.S("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f3844m && this.f3856d < 0) {
            C0192d.T("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int d4 = d();
        z(d());
        Object obj = q.f3878b;
        synchronized (obj) {
            int i2 = q.f3880d;
            q.f3880d = i2 + 1;
            q.f3879c = q.f3879c.B(i2);
            c0271g = new C0271g(i2, q.e(e(), d4 + 1, i2), q.l(function1, f(), true), this);
        }
        if (!this.f3844m && !this.f3855c) {
            int d5 = d();
            synchronized (obj) {
                int i4 = q.f3880d;
                q.f3880d = i4 + 1;
                q(i4);
                q.f3879c = q.f3879c.B(d());
                Unit unit = Unit.f7487a;
            }
            r(q.e(e(), d5 + 1, d()));
        }
        return c0271g;
    }

    public final void u() {
        z(d());
        Unit unit = Unit.f7487a;
        if (this.f3844m || this.f3855c) {
            return;
        }
        int d4 = d();
        synchronized (q.f3878b) {
            int i2 = q.f3880d;
            q.f3880d = i2 + 1;
            q(i2);
            q.f3879c = q.f3879c.B(d());
        }
        r(q.e(e(), d4 + 1, d()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0 A[LOOP:1: B:32:0x00be->B:33:0x00c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w v() {
        HashMap hashMap;
        C0661B c0661b;
        C1405I c1405i;
        int i2;
        int size;
        int i4;
        C0661B w4 = w();
        if (w4 != null) {
            AtomicReference atomicReference = q.f3885i;
            hashMap = q.c((C0269e) atomicReference.get(), this, q.f3879c.h(((C0268d) atomicReference.get()).f3854b));
        } else {
            hashMap = null;
        }
        C1405I c1405i2 = C1405I.f11931d;
        synchronized (q.f3878b) {
            try {
                q.d(this);
                if (w4 != null && w4.f6887d != 0) {
                    C0268d c0268d = (C0268d) q.f3885i.get();
                    w y4 = y(q.f3880d, hashMap, q.f3879c.h(c0268d.f3854b));
                    if (!y4.equals(l.f3857c)) {
                        return y4;
                    }
                    b();
                    q.v(c0268d, p.f3875i);
                    c0661b = c0268d.f3839h;
                    A(null);
                    c0268d.f3839h = null;
                    c1405i = q.f3883g;
                    Unit unit = Unit.f7487a;
                    this.f3844m = true;
                    if (c0661b != null) {
                        I.f fVar = new I.f(c0661b);
                        if (!c0661b.g()) {
                            int size2 = c1405i.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                ((Function2) c1405i.get(i5)).h(fVar, this);
                            }
                        }
                    }
                    if (w4 != null && w4.h()) {
                        I.f fVar2 = new I.f(w4);
                        size = c1405i.size();
                        for (i4 = 0; i4 < size; i4++) {
                            ((Function2) c1405i.get(i4)).h(fVar2, this);
                        }
                    }
                    synchronized (q.f3878b) {
                        try {
                            o();
                            q.g();
                            if (c0661b != null) {
                                try {
                                    Object[] objArr = c0661b.f6885b;
                                    long[] jArr = c0661b.f6884a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i6 = 0;
                                        while (true) {
                                            long j4 = jArr[i6];
                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                                for (int i8 = 0; i8 < i7; i8++) {
                                                    if ((j4 & 255) < 128) {
                                                        q.q((D) objArr[(i6 << 3) + i8]);
                                                    }
                                                    j4 >>= 8;
                                                }
                                                if (i7 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i6 == length) {
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            if (w4 != null) {
                                Object[] objArr2 = w4.f6885b;
                                long[] jArr2 = w4.f6884a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j5 = jArr2[i9];
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((j5 & 255) < 128) {
                                                    q.q((D) objArr2[(i9 << 3) + i11]);
                                                }
                                                j5 >>= 8;
                                            }
                                            i2 = 1;
                                            if (i10 != 8) {
                                                break;
                                            }
                                        } else {
                                            i2 = 1;
                                        }
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9 += i2;
                                    }
                                }
                            }
                            ArrayList arrayList = this.f3840i;
                            if (arrayList != null) {
                                int size3 = arrayList.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    q.q((D) arrayList.get(i12));
                                }
                            }
                            this.f3840i = null;
                            Unit unit2 = Unit.f7487a;
                            return l.f3857c;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                b();
                C0268d c0268d2 = (C0268d) q.f3885i.get();
                q.v(c0268d2, p.f3875i);
                c0661b = c0268d2.f3839h;
                if (c0661b == null || !c0661b.h()) {
                    c0661b = null;
                    c1405i = c1405i2;
                } else {
                    c1405i = q.f3883g;
                }
                Unit unit3 = Unit.f7487a;
                this.f3844m = true;
                if (c0661b != null) {
                }
                if (w4 != null) {
                    I.f fVar22 = new I.f(w4);
                    size = c1405i.size();
                    while (i4 < size) {
                    }
                }
                synchronized (q.f3878b) {
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public C0661B w() {
        return this.f3839h;
    }

    @Override // Q.AbstractC0274j
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Function1 f() {
        return this.f3836e;
    }

    public final w y(int i2, HashMap hashMap, o oVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        o oVar2;
        Object[] objArr;
        long[] jArr;
        int i4;
        o oVar3;
        Object[] objArr2;
        long[] jArr2;
        int i5;
        F s4;
        F s5;
        o w4 = e().B(d()).w(this.f3841j);
        C0661B w5 = w();
        Intrinsics.c(w5);
        Object[] objArr3 = w5.f6885b;
        long[] jArr3 = w5.f6884a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j4 = jArr3[i6];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j4 & 255) < 128) {
                            D d4 = (D) objArr3[(i6 << 3) + i9];
                            F h4 = d4.h();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            F s6 = q.s(h4, i2, oVar);
                            if (s6 == null || (s4 = q.s(h4, d(), w4)) == null) {
                                oVar3 = w4;
                            } else {
                                oVar3 = w4;
                                if (s4.f3809a != 1 && !s6.equals(s4)) {
                                    F s7 = q.s(h4, d(), e());
                                    if (s7 == null) {
                                        q.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (s5 = (F) hashMap.get(s6)) == null) {
                                        s5 = d4.s(s4, s6, s7);
                                    }
                                    if (s5 == null) {
                                        return new k();
                                    }
                                    if (!s5.equals(s7)) {
                                        if (s5.equals(s6)) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(new Pair(d4, s6.b()));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(d4);
                                        } else {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(!s5.equals(s4) ? new Pair(d4, s5) : new Pair(d4, s4.b()));
                                        }
                                    }
                                }
                            }
                            i5 = 8;
                        } else {
                            oVar3 = w4;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i5 = i7;
                        }
                        j4 >>= i5;
                        i9++;
                        i7 = i5;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        w4 = oVar3;
                    }
                    oVar2 = w4;
                    objArr = objArr3;
                    jArr = jArr3;
                    i4 = 1;
                    if (i8 != i7) {
                        break;
                    }
                } else {
                    oVar2 = w4;
                    objArr = objArr3;
                    jArr = jArr3;
                    i4 = 1;
                }
                if (i6 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i6 += i4;
                objArr3 = objArr;
                jArr3 = jArr;
                w4 = oVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            u();
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                Pair pair = (Pair) arrayList3.get(i10);
                D d5 = (D) pair.f7485d;
                F f4 = (F) pair.f7486e;
                f4.f3809a = d();
                synchronized (q.f3878b) {
                    f4.f3810b = d5.h();
                    d5.e(f4);
                    Unit unit = Unit.f7487a;
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                w5.j((D) arrayList2.get(i11));
            }
            ArrayList arrayList4 = this.f3840i;
            if (arrayList4 != null) {
                arrayList2 = C1403G.B(arrayList4, arrayList2);
            }
            this.f3840i = arrayList2;
        }
        return l.f3857c;
    }

    public final void z(int i2) {
        synchronized (q.f3878b) {
            this.f3841j = this.f3841j.B(i2);
            Unit unit = Unit.f7487a;
        }
    }
}
