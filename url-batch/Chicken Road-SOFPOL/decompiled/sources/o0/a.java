package o0;

import d6.l;
import java.util.NoSuchElementException;
import o.e0;
import o.j0;
import o.p0;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f5571a;

    public static final Object a(j0 j0Var) {
        Object g3 = j0Var.g(null);
        if (g3 == null) {
            return null;
        }
        if (!(g3 instanceof e0)) {
            j0Var.k(null);
            return g3;
        }
        e0 e0Var = (e0) g3;
        if (e0Var.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = e0Var.f5443b - 1;
        Object e8 = e0Var.e(i);
        e0Var.j(i);
        i.c(e8, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (e0Var.g()) {
            j0Var.k(null);
        }
        if (e0Var.f5443b == 1) {
            j0Var.m(null, e0Var.d());
        }
        return e8;
    }

    public static final e0 b(j0 j0Var) {
        if (j0Var.i()) {
            e0 e0Var = p0.f5519b;
            i.c(e0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return e0Var;
        }
        e0 e0Var2 = new e0();
        Object[] objArr = j0Var.f5484c;
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
                            Object obj = objArr[(i << 3) + i9];
                            if (obj instanceof e0) {
                                e0 e0Var3 = (e0) obj;
                                if (!e0Var3.g()) {
                                    int i10 = e0Var2.f5443b + e0Var3.f5443b;
                                    Object[] objArr2 = e0Var2.f5442a;
                                    if (objArr2.length < i10) {
                                        e0Var2.l(i10, objArr2);
                                    }
                                    l.H(e0Var3.f5442a, e0Var2.f5442a, e0Var2.f5443b, 0, e0Var3.f5443b);
                                    e0Var2.f5443b += e0Var3.f5443b;
                                }
                            } else {
                                i.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                e0Var2.a(obj);
                            }
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
        return e0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return i.a(this.f5571a, ((a) obj).f5571a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5571a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f5571a + ')';
    }
}
