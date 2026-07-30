package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hh1 {
    public final gh1 a;
    public final pl0 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public hh1(gh1 gh1Var, pl0 pl0Var, long j) {
        this.a = gh1Var;
        this.b = pl0Var;
        this.c = j;
        ArrayList arrayList = (ArrayList) pl0Var.e;
        float f = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((qu0) arrayList.get(0)).a.d.c(0);
        if (!arrayList.isEmpty()) {
            qu0 qu0Var = (qu0) CollectionsKt.s(arrayList);
            f = qu0Var.a.d.c(r4.f - 1) + qu0Var.f;
        }
        this.e = f;
        this.f = (ArrayList) pl0Var.d;
    }

    public final int a(int i) {
        pl0 pl0Var = this.b;
        ArrayList arrayList = (ArrayList) pl0Var.e;
        qu0 qu0Var = (qu0) arrayList.get(i >= ((y7) ((o91) pl0Var.c).d).e.length() ? zh.d(arrayList) : i < 0 ? 0 : ca0.k(i, arrayList));
        return qu0Var.a.d.e.getLineForOffset(qu0Var.a(i)) + qu0Var.d;
    }

    public final int b(float f) {
        ArrayList arrayList = (ArrayList) this.b.e;
        int i = 0;
        if (f > 0.0f) {
            if (f < ((qu0) CollectionsKt.s(arrayList)).g) {
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (true) {
                    if (i2 > size) {
                        i = -(i2 + 1);
                        break;
                    }
                    int i3 = (i2 + size) >>> 1;
                    qu0 qu0Var = (qu0) arrayList.get(i3);
                    char c = qu0Var.f > f ? (char) 1 : qu0Var.g <= f ? (char) 65535 : (char) 0;
                    if (c >= 0) {
                        if (c <= 0) {
                            i = i3;
                            break;
                        }
                        size = i3 - 1;
                    } else {
                        i2 = i3 + 1;
                    }
                }
            } else {
                i = arrayList.size() - 1;
            }
        }
        qu0 qu0Var2 = (qu0) arrayList.get(i);
        int i4 = qu0Var2.c;
        int i5 = qu0Var2.d;
        if (i4 - qu0Var2.b == 0) {
            return i5;
        }
        x5 x5Var = qu0Var2.a;
        float f2 = f - qu0Var2.f;
        fh1 fh1Var = x5Var.d;
        return fh1Var.e.getLineForVertical(((int) f2) - fh1Var.g) + i5;
    }

    public final int c(int i) {
        pl0 pl0Var = this.b;
        pl0Var.g(i);
        ArrayList arrayList = (ArrayList) pl0Var.e;
        qu0 qu0Var = (qu0) arrayList.get(ca0.l(i, arrayList));
        x5 x5Var = qu0Var.a;
        return x5Var.d.e.getLineStart(i - qu0Var.d) + qu0Var.b;
    }

    public final float d(int i) {
        pl0 pl0Var = this.b;
        pl0Var.g(i);
        ArrayList arrayList = (ArrayList) pl0Var.e;
        qu0 qu0Var = (qu0) arrayList.get(ca0.l(i, arrayList));
        x5 x5Var = qu0Var.a;
        return x5Var.d.f(i - qu0Var.d) + qu0Var.f;
    }

    public final b31 e(int i) {
        pl0 pl0Var = this.b;
        y7 y7Var = (y7) ((o91) pl0Var.c).d;
        if (i < 0 || i > y7Var.e.length()) {
            StringBuilder n = qy0.n("offset(", i, ") is out of bounds [0, ");
            n.append(y7Var.e.length());
            n.append(']');
            p80.a(n.toString());
        }
        int length = ((y7) ((o91) pl0Var.c).d).e.length();
        ArrayList arrayList = (ArrayList) pl0Var.e;
        qu0 qu0Var = (qu0) arrayList.get(i == length ? zh.d(arrayList) : ca0.k(i, arrayList));
        x5 x5Var = qu0Var.a;
        int a = qu0Var.a(i);
        fh1 fh1Var = x5Var.d;
        return fh1Var.e.getParagraphDirection(fh1Var.e.getLineForOffset(a)) == 1 ? b31.d : b31.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hh1) {
            hh1 hh1Var = (hh1) obj;
            if (Intrinsics.a(this.a, hh1Var.a) && this.b == hh1Var.b && ba0.a(this.c, hh1Var.c) && this.d == hh1Var.d && this.e == hh1Var.e && Intrinsics.a(this.f, hh1Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + qy0.b(this.e, qy0.b(this.d, qy0.e(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) ba0.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
