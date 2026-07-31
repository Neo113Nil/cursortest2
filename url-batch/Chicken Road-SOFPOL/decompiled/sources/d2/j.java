package d2;

import java.util.Iterator;
import o.j0;
import o.r0;
import x1.g0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements Iterable, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final j0 f2150d;

    /* renamed from: e, reason: collision with root package name */
    public o.u f2151e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2152f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2153g;

    public j() {
        long[] jArr = r0.f5528a;
        this.f2150d = new j0();
    }

    public final j a() {
        j jVar = new j();
        jVar.f2152f = this.f2152f;
        jVar.f2153g = this.f2153g;
        j0 j0Var = jVar.f2150d;
        j0Var.getClass();
        j0 j0Var2 = this.f2150d;
        q6.i.e(j0Var2, "from");
        Object[] objArr = j0Var2.f5483b;
        Object[] objArr2 = j0Var2.f5484c;
        long[] jArr = j0Var2.f5482a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128) {
                            int i10 = (i << 3) + i9;
                            j0Var.m(objArr[i10], objArr2[i10]);
                        }
                        j7 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return jVar;
    }

    public final Object b(v vVar) {
        Object g3 = this.f2150d.g(vVar);
        if (g3 != null) {
            return g3;
        }
        throw new IllegalStateException("Key not present: " + vVar + " - consider getOrElse or getOrNull");
    }

    public final void c(j jVar) {
        j0 j0Var = jVar.f2150d;
        Object[] objArr = j0Var.f5483b;
        Object[] objArr2 = j0Var.f5484c;
        long[] jArr = j0Var.f5482a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj = objArr[i10];
                        Object obj2 = objArr2[i10];
                        v vVar = (v) obj;
                        j0 j0Var2 = this.f2150d;
                        Object g3 = j0Var2.g(vVar);
                        q6.i.c(vVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object g7 = vVar.f2217b.g(g3, obj2);
                        if (g7 != null) {
                            j0Var2.m(vVar, g7);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void e(v vVar, Object obj) {
        boolean z3 = obj instanceof a;
        j0 j0Var = this.f2150d;
        if (z3 && j0Var.c(vVar)) {
            Object g3 = j0Var.g(vVar);
            q6.i.c(g3, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) g3;
            a aVar2 = (a) obj;
            String str = aVar2.f2108a;
            if (str == null) {
                str = aVar.f2108a;
            }
            c6.c cVar = aVar2.f2109b;
            if (cVar == null) {
                cVar = aVar.f2109b;
            }
            j0Var.m(vVar, new a(str, cVar));
        } else {
            j0Var.m(vVar, obj);
        }
        vVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return q6.i.a(this.f2150d, jVar.f2150d) && this.f2152f == jVar.f2152f && this.f2153g == jVar.f2153g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2153g) + a0.q.d(this.f2150d.hashCode() * 31, 31, this.f2152f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        o.u uVar = this.f2151e;
        if (uVar == null) {
            j0 j0Var = this.f2150d;
            j0Var.getClass();
            o.u uVar2 = new o.u(j0Var);
            this.f2151e = uVar2;
            uVar = uVar2;
        }
        return ((o.h) uVar.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f2152f) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f2153g) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        j0 j0Var = this.f2150d;
        Object[] objArr = j0Var.f5483b;
        Object[] objArr2 = j0Var.f5484c;
        long[] jArr = j0Var.f5482a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128) {
                            int i10 = (i << 3) + i9;
                            Object obj = objArr[i10];
                            Object obj2 = objArr2[i10];
                            sb.append(str);
                            sb.append(((v) obj).f2216a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j7 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return g0.s(this) + "{ " + ((Object) sb) + " }";
    }
}
