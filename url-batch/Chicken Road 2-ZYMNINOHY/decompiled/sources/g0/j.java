package g0;

import T.C0097o;
import T.U;
import W.AbstractC0108a;
import W.J;
import Y.A;
import android.net.Uri;
import android.util.Pair;
import h0.C0447c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import q0.C1360b;
import v2.G;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final C0435c f8845a;

    /* renamed from: b, reason: collision with root package name */
    public final Y.h f8846b;

    /* renamed from: c, reason: collision with root package name */
    public final Y.h f8847c;

    /* renamed from: d, reason: collision with root package name */
    public final e0.t f8848d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f8849e;

    /* renamed from: f, reason: collision with root package name */
    public final C0097o[] f8850f;

    /* renamed from: g, reason: collision with root package name */
    public final C0447c f8851g;

    /* renamed from: h, reason: collision with root package name */
    public final U f8852h;

    /* renamed from: i, reason: collision with root package name */
    public final List f8853i;

    /* renamed from: k, reason: collision with root package name */
    public final b0.i f8855k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8856l;
    public C1360b n;
    public Uri o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f8858p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8859q;

    /* renamed from: r, reason: collision with root package name */
    public t0.t f8860r;

    /* renamed from: j, reason: collision with root package name */
    public final e0.t f8854j = new e0.t(4);

    /* renamed from: m, reason: collision with root package name */
    public byte[] f8857m = J.f3264b;

    /* renamed from: s, reason: collision with root package name */
    public long f8861s = -9223372036854775807L;

    public j(C0435c c0435c, C0447c c0447c, Uri[] uriArr, C0097o[] c0097oArr, e0.t tVar, A a3, e0.t tVar2, List list, b0.i iVar) {
        this.f8845a = c0435c;
        this.f8851g = c0447c;
        this.f8849e = uriArr;
        this.f8850f = c0097oArr;
        this.f8848d = tVar2;
        this.f8853i = list;
        this.f8855k = iVar;
        Y.h f4 = ((Y.g) tVar.f8416a).f();
        this.f8846b = f4;
        if (a3 != null) {
            f4.y(a3);
        }
        this.f8847c = ((Y.g) tVar.f8416a).f();
        this.f8852h = new U("", c0097oArr);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < uriArr.length; i4++) {
            if ((c0097oArr[i4].f2861f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        U u4 = this.f8852h;
        int[] F4 = O3.d.F(arrayList);
        h hVar = new h(u4, F4);
        hVar.f8840g = hVar.b(u4.f2708d[F4[0]]);
        this.f8860r = hVar;
    }

    public static i d(h0.l lVar, long j4, int i4) {
        long j5 = lVar.f9137k;
        I i5 = lVar.f9143s;
        int i6 = (int) (j4 - j5);
        I i7 = lVar.f9142r;
        if (i6 == i7.size()) {
            if (i4 == -1) {
                i4 = 0;
            }
            if (i4 < i5.size()) {
                return new i((h0.j) i5.get(i4), j4, i4);
            }
            return null;
        }
        h0.i iVar = (h0.i) i7.get(i6);
        if (i4 == -1) {
            return new i(iVar, j4, -1);
        }
        if (i4 < iVar.f9113m.size()) {
            return new i((h0.j) iVar.f9113m.get(i4), j4, i4);
        }
        int i8 = i6 + 1;
        if (i8 < i7.size()) {
            return new i((h0.j) i7.get(i8), j4 + 1, -1);
        }
        if (i5.isEmpty()) {
            return null;
        }
        return new i((h0.j) i5.get(0), j4 + 1, 0);
    }

    public final r0.n[] a(k kVar, long j4) {
        List list;
        j jVar = this;
        k kVar2 = kVar;
        int a3 = kVar2 == null ? -1 : jVar.f8852h.a(kVar2.f15141d);
        int length = jVar.f8860r.length();
        r0.n[] nVarArr = new r0.n[length];
        boolean z = false;
        int i4 = 0;
        while (i4 < length) {
            int h2 = jVar.f8860r.h(i4);
            Uri uri = jVar.f8849e[h2];
            C0447c c0447c = jVar.f8851g;
            if (c0447c.c(uri)) {
                h0.l a4 = c0447c.a(z, uri);
                a4.getClass();
                long j5 = a4.f9134h - c0447c.n;
                Pair c4 = jVar.c(kVar2, h2 != a3 ? true : z, a4, j5, j4);
                long longValue = ((Long) c4.first).longValue();
                int intValue = ((Integer) c4.second).intValue();
                long j6 = a4.f9137k;
                I i5 = a4.f9143s;
                I i6 = a4.f9142r;
                int i7 = (int) (longValue - j6);
                if (i7 < 0 || i6.size() < i7) {
                    G g4 = I.f15571b;
                    list = a0.f15605e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i7 < i6.size()) {
                        if (intValue != -1) {
                            h0.i iVar = (h0.i) i6.get(i7);
                            if (intValue == 0) {
                                arrayList.add(iVar);
                            } else if (intValue < iVar.f9113m.size()) {
                                I i8 = iVar.f9113m;
                                arrayList.addAll(i8.subList(intValue, i8.size()));
                            }
                            i7++;
                        }
                        arrayList.addAll(i6.subList(i7, i6.size()));
                        intValue = 0;
                    }
                    if (a4.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i5.size()) {
                            arrayList.addAll(i5.subList(intValue, i5.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
                nVarArr[i4] = new g(list, j5);
            } else {
                nVarArr[i4] = r0.n.f15184w0;
            }
            i4++;
            jVar = this;
            kVar2 = kVar;
            z = false;
        }
        return nVarArr;
    }

    public final int b(k kVar) {
        int i4 = kVar.o;
        if (i4 == -1) {
            return 1;
        }
        h0.l a3 = this.f8851g.a(false, this.f8849e[this.f8852h.a(kVar.f15141d)]);
        a3.getClass();
        I i5 = a3.f9142r;
        int i6 = (int) (kVar.f15183j - a3.f9137k);
        if (i6 < 0) {
            return 1;
        }
        I i7 = i6 < i5.size() ? ((h0.i) i5.get(i6)).f9113m : a3.f9143s;
        if (i4 >= i7.size()) {
            return 2;
        }
        h0.g gVar = (h0.g) i7.get(i4);
        if (gVar.f9108m) {
            return 0;
        }
        return Objects.equals(Uri.parse(AbstractC0108a.p(a3.f9165a, gVar.f9114a)), kVar.f15139b.f3701a) ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da A[EDGE_INSN: B:58:0x00da->B:60:0x00da BREAK  A[LOOP:0: B:44:0x00ae->B:48:0x00d7], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(k kVar, boolean z, h0.l lVar, long j4, long j5) {
        I i4;
        int i5;
        boolean z4 = true;
        if (kVar != null) {
            long j6 = kVar.f15183j;
            int i6 = kVar.o;
            if (!z) {
                if (!kVar.f8870H) {
                    return new Pair(Long.valueOf(j6), Integer.valueOf(i6));
                }
                if (i6 == -1) {
                    j6 = kVar.a();
                }
                return new Pair(Long.valueOf(j6), Integer.valueOf(i6 != -1 ? i6 + 1 : -1));
            }
        }
        long j7 = lVar.f9145u;
        long j8 = lVar.f9137k;
        I i7 = lVar.f9143s;
        I i8 = lVar.f9142r;
        long j9 = j4 + j7;
        long j10 = (kVar == null || this.f8859q) ? j5 : kVar.f15144g;
        if (!lVar.o && j10 >= j9) {
            return new Pair(Long.valueOf(j8 + i8.size()), -1);
        }
        long j11 = j10 - j4;
        Long valueOf = Long.valueOf(j11);
        C0447c c0447c = this.f8851g;
        if (c0447c.f9066m && kVar != null) {
            z4 = false;
        }
        int d4 = J.d(i8, valueOf, z4);
        long j12 = d4 + j8;
        if (!c0447c.f9066m) {
            return new Pair(Long.valueOf(j12), -1);
        }
        if (d4 >= 0) {
            if (!i8.isEmpty()) {
                h0.i iVar = (h0.i) i8.get(d4);
                if (j11 < iVar.f9118e + iVar.f9116c) {
                    i4 = iVar.f9113m;
                    i5 = 0;
                    while (true) {
                        if (i5 < i4.size()) {
                            break;
                        }
                        h0.g gVar = (h0.g) i4.get(i5);
                        if (j11 >= gVar.f9118e + gVar.f9116c) {
                            i5++;
                        } else if (gVar.f9107l) {
                            j12 += (i4 != i7 || i8.isEmpty()) ? 0L : 1L;
                            r3 = i5;
                        }
                    }
                }
            }
            i4 = i7;
            i5 = 0;
            while (true) {
                if (i5 < i4.size()) {
                }
                i5++;
            }
        }
        return new Pair(Long.valueOf(j12), Integer.valueOf(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e e(Uri uri, int i4, boolean z) {
        if (uri == null) {
            return null;
        }
        e0.t tVar = this.f8854j;
        byte[] bArr = (byte[]) ((C0436d) tVar.f8416a).remove(uri);
        if (bArr != null) {
            return null;
        }
        Y.k kVar = new Y.k(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        C0097o c0097o = this.f8850f[i4];
        int m4 = this.f8860r.m();
        Object q4 = this.f8860r.q();
        byte[] bArr2 = this.f8857m;
        e eVar = new e(this.f8847c, kVar, 3, c0097o, m4, q4, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = J.f3264b;
        }
        eVar.f8832j = bArr2;
        return eVar;
    }
}
