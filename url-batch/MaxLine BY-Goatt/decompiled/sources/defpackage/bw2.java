package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bw2 {
    public final aw2 a;
    public final sm1 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public bw2(aw2 aw2Var, sm1 sm1Var, long j) {
        this.a = aw2Var;
        this.b = sm1Var;
        this.c = j;
        ArrayList arrayList = sm1Var.h;
        float f = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((az1) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            az1 az1Var = (az1) zv.B(arrayList);
            f = az1Var.a.d.d(r4.g - 1) + az1Var.f;
        }
        this.e = f;
        this.f = sm1Var.g;
    }

    public final k92 a(int i) {
        sm1 sm1Var = this.b;
        sm1Var.i(i);
        int length = ((yd) sm1Var.a.o).n.length();
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(i == length ? qv.f(arrayList) : s03.m(i, arrayList));
        return az1Var.a.d.f.isRtlCharAt(az1Var.d(i)) ? k92.n : k92.m;
    }

    public final w72 b(int i) {
        float i2;
        float i3;
        float h;
        float h2;
        sm1 sm1Var = this.b;
        sm1Var.h(i);
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(s03.m(i, arrayList));
        ja jaVar = az1Var.a;
        int d = az1Var.d(i);
        CharSequence charSequence = jaVar.e;
        if (d < 0 || d >= charSequence.length()) {
            StringBuilder n = in1.n(d, "offset(", ") is out of bounds [0,");
            n.append(charSequence.length());
            n.append(')');
            i21.a(n.toString());
        }
        zv2 zv2Var = jaVar.d;
        Layout layout = zv2Var.f;
        int lineForOffset = layout.getLineForOffset(d);
        float g = zv2Var.g(lineForOffset);
        float e = zv2Var.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                h = zv2Var.i(d, false);
                h2 = zv2Var.i(d + 1, true);
            } else if (isRtlCharAt) {
                h = zv2Var.h(d, false);
                h2 = zv2Var.h(d + 1, true);
            } else {
                i2 = zv2Var.i(d, false);
                i3 = zv2Var.i(d + 1, true);
            }
            float f = h;
            i2 = h2;
            i3 = f;
        } else {
            i2 = zv2Var.h(d, false);
            i3 = zv2Var.h(d + 1, true);
        }
        RectF rectF = new RectF(i2, g, i3, e);
        return az1Var.a(new w72(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final w72 c(int i) {
        sm1 sm1Var = this.b;
        sm1Var.i(i);
        int length = ((yd) sm1Var.a.o).n.length();
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(i == length ? qv.f(arrayList) : s03.m(i, arrayList));
        ja jaVar = az1Var.a;
        int d = az1Var.d(i);
        CharSequence charSequence = jaVar.e;
        zv2 zv2Var = jaVar.d;
        if (d < 0 || d > charSequence.length()) {
            StringBuilder n = in1.n(d, "offset(", ") is out of bounds [0,");
            n.append(charSequence.length());
            n.append(']');
            i21.a(n.toString());
        }
        float h = zv2Var.h(d, false);
        int lineForOffset = zv2Var.f.getLineForOffset(d);
        return az1Var.a(new w72(h, zv2Var.g(lineForOffset), h, zv2Var.e(lineForOffset)));
    }

    public final int d(int i, boolean z) {
        int f;
        sm1 sm1Var = this.b;
        sm1Var.j(i);
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(s03.n(i, arrayList));
        ja jaVar = az1Var.a;
        int i2 = i - az1Var.d;
        zv2 zv2Var = jaVar.d;
        if (z) {
            Layout layout = zv2Var.f;
            wt2 wt2Var = ew2.a;
            if (layout.getEllipsisCount(i2) <= 0 || zv2Var.b != TextUtils.TruncateAt.END) {
                fy c = zv2Var.c();
                Layout layout2 = (Layout) c.p;
                f = c.l(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            f = zv2Var.f(i2);
        }
        return f + az1Var.b;
    }

    public final int e(int i) {
        sm1 sm1Var = this.b;
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(i >= ((yd) sm1Var.a.o).n.length() ? qv.f(arrayList) : i < 0 ? 0 : s03.m(i, arrayList));
        return az1Var.a.d.f.getLineForOffset(az1Var.d(i)) + az1Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bw2) {
            bw2 bw2Var = (bw2) obj;
            if (Intrinsics.b(this.a, bw2Var.a) && this.b == bw2Var.b && x31.a(this.c, bw2Var.c) && this.d == bw2Var.d && this.e == bw2Var.e && Intrinsics.b(this.f, bw2Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        sm1 sm1Var = this.b;
        sm1Var.j(i);
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(s03.n(i, arrayList));
        ja jaVar = az1Var.a;
        int i2 = i - az1Var.d;
        zv2 zv2Var = jaVar.d;
        return zv2Var.f.getLineLeft(i2) + (i2 == zv2Var.g + (-1) ? zv2Var.j : 0.0f);
    }

    public final float g(int i) {
        sm1 sm1Var = this.b;
        sm1Var.j(i);
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(s03.n(i, arrayList));
        ja jaVar = az1Var.a;
        int i2 = i - az1Var.d;
        zv2 zv2Var = jaVar.d;
        return zv2Var.f.getLineRight(i2) + (i2 == zv2Var.g + (-1) ? zv2Var.k : 0.0f);
    }

    public final int h(int i) {
        sm1 sm1Var = this.b;
        sm1Var.j(i);
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(s03.n(i, arrayList));
        ja jaVar = az1Var.a;
        return jaVar.d.f.getLineStart(i - az1Var.d) + az1Var.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + q40.d(this.e, q40.d(this.d, in1.h((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final k92 i(int i) {
        sm1 sm1Var = this.b;
        sm1Var.i(i);
        int length = ((yd) sm1Var.a.o).n.length();
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(i == length ? qv.f(arrayList) : s03.m(i, arrayList));
        ja jaVar = az1Var.a;
        int d = az1Var.d(i);
        zv2 zv2Var = jaVar.d;
        return zv2Var.f.getParagraphDirection(zv2Var.f.getLineForOffset(d)) == 1 ? k92.m : k92.n;
    }

    public final oa j(final int i, final int i2) {
        sm1 sm1Var = this.b;
        yd ydVar = (yd) sm1Var.a.o;
        if (i < 0 || i > i2 || i2 > ydVar.n.length()) {
            i21.a("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + ydVar.n.length() + "), or start > end!");
        }
        if (i == i2) {
            return qa.a();
        }
        final oa a = qa.a();
        s03.p(sm1Var.h, th2.a(i, i2), new Function1() { // from class: rm1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                az1 az1Var = (az1) obj;
                ja jaVar = az1Var.a;
                int d = az1Var.d(i);
                int d2 = az1Var.d(i2);
                CharSequence charSequence = jaVar.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    i21.a("start(" + d + ") or end(" + d2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                zv2 zv2Var = jaVar.d;
                zv2Var.f.getSelectionPath(d, d2, path);
                int i3 = zv2Var.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                float f = az1Var.f;
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                oa.this.a.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                return Unit.a;
            }
        });
        return a;
    }

    public final long k(int i) {
        int n;
        int i2;
        int k;
        sm1 sm1Var = this.b;
        sm1Var.i(i);
        int length = ((yd) sm1Var.a.o).n.length();
        ArrayList arrayList = sm1Var.h;
        az1 az1Var = (az1) arrayList.get(i == length ? qv.f(arrayList) : s03.m(i, arrayList));
        ja jaVar = az1Var.a;
        int d = az1Var.d(i);
        sg j = jaVar.d.j();
        if (j.i(j.n(d))) {
            j.b(d);
            n = d;
            while (n != -1 && (!j.i(n) || j.e(n))) {
                n = j.n(n);
            }
        } else {
            j.b(d);
            n = j.h(d) ? (!j.f(d) || j.d(d)) ? j.n(d) : d : j.d(d) ? j.n(d) : -1;
        }
        if (n == -1) {
            n = d;
        }
        if (j.e(j.k(d))) {
            j.b(d);
            i2 = d;
            while (i2 != -1 && (j.i(i2) || !j.e(i2))) {
                i2 = j.k(i2);
            }
        } else {
            j.b(d);
            if (j.d(d)) {
                if (!j.f(d) || j.h(d)) {
                    k = j.k(d);
                    i2 = k;
                } else {
                    i2 = d;
                }
            } else if (j.h(d)) {
                k = j.k(d);
                i2 = k;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            d = i2;
        }
        return az1Var.b(false, th2.a(n, d));
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) x31.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
