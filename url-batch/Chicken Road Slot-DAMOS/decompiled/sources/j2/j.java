package j2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import s.h0;
import s.p0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements u, Iterable, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final h0 f4975d;

    /* renamed from: e, reason: collision with root package name */
    public s.t f4976e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4977i;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4978r;

    public j() {
        long[] jArr = p0.f8356a;
        this.f4975d = new h0();
    }

    @Override // j2.u
    public final void b(t tVar, Object obj) {
        boolean z10 = obj instanceof a;
        h0 h0Var = this.f4975d;
        if (z10 && h0Var.c(tVar)) {
            Object g = h0Var.g(tVar);
            g.getClass();
            a aVar = (a) g;
            a aVar2 = (a) obj;
            String str = aVar2.f4928a;
            if (str == null) {
                str = aVar.f4928a;
            }
            hd.c cVar = aVar2.f4929b;
            if (cVar == null) {
                cVar = aVar.f4929b;
            }
            h0Var.m(tVar, new a(str, cVar));
        } else {
            h0Var.m(tVar, obj);
        }
        tVar.getClass();
    }

    public final j c() {
        j jVar = new j();
        jVar.f4977i = this.f4977i;
        jVar.f4978r = this.f4978r;
        h0 h0Var = jVar.f4975d;
        h0Var.getClass();
        h0 h0Var2 = this.f4975d;
        h0Var2.getClass();
        Object[] objArr = h0Var2.f8313b;
        Object[] objArr2 = h0Var2.f8314c;
        long[] jArr = h0Var2.f8312a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i3 << 3) + i11;
                            h0Var.m(objArr[i12], objArr2[i12]);
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return jVar;
    }

    public final Object e(t tVar) {
        Object g = this.f4975d.g(tVar);
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Key not present: " + tVar + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.a(this.f4975d, jVar.f4975d) && this.f4977i == jVar.f4977i && this.f4978r == jVar.f4978r;
    }

    public final void f(j jVar) {
        h0 h0Var = jVar.f4975d;
        Object[] objArr = h0Var.f8313b;
        Object[] objArr2 = h0Var.f8314c;
        long[] jArr = h0Var.f8312a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i3 << 3) + i11;
                        Object obj = objArr[i12];
                        Object obj2 = objArr2[i12];
                        t tVar = (t) obj;
                        h0 h0Var2 = this.f4975d;
                        Object g = h0Var2.g(tVar);
                        tVar.getClass();
                        Object invoke = tVar.f5021b.invoke(g, obj2);
                        if (invoke != null) {
                            h0Var2.m(tVar, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4978r) + n0.l.d(this.f4975d.hashCode() * 31, 31, this.f4977i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        s.t tVar = this.f4976e;
        if (tVar == null) {
            h0 h0Var = this.f4975d;
            h0Var.getClass();
            s.t tVar2 = new s.t(h0Var);
            this.f4976e = tVar2;
            tVar = tVar2;
        }
        return ((s.g) tVar.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f4977i) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f4978r) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        h0 h0Var = this.f4975d;
        Object[] objArr = h0Var.f8313b;
        Object[] objArr2 = h0Var.f8314c;
        long[] jArr = h0Var.f8312a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i3 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            sb2.append(str);
                            sb2.append(((t) obj).f5020a);
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return d2.h0.t(this) + "{ " + ((Object) sb2) + " }";
    }
}
