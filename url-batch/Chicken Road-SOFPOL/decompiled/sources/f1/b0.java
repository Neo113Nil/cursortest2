package f1;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 extends p {

    /* renamed from: e, reason: collision with root package name */
    public b1.b f2625e;

    /* renamed from: f, reason: collision with root package name */
    public long f2626f = 9205357640488583168L;

    /* renamed from: g, reason: collision with root package name */
    public final List f2627g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2628h;
    public final long i;

    public b0(List list, long j7, long j8) {
        this.f2627g = list;
        this.f2628h = j7;
        this.i = j8;
    }

    public final Shader B(long j7) {
        int i;
        int[] iArr;
        int i8;
        float[] fArr;
        long j8 = this.f2628h;
        char c8 = ' ';
        int i9 = (int) (j8 >> 32);
        if (Float.intBitsToFloat(i9) == Float.POSITIVE_INFINITY) {
            i9 = (int) (j7 >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i9);
        long j9 = 4294967295L;
        int i10 = (int) (j8 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j7 & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i10);
        long j10 = this.i;
        int i11 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j7 >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i11);
        int i12 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j7 & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i12);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.f2627g;
        if (list.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int t3 = s6.a.t(list);
            i = 0;
            int i13 = 1;
            while (i13 < t3) {
                char c9 = c8;
                long j11 = j9;
                if (s.d(((s) list.get(i13)).f2705a) == 0.0f) {
                    i++;
                }
                i13++;
                c8 = c9;
                j9 = j11;
            }
        }
        char c10 = c8;
        long j12 = j9;
        float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> c10));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & j12));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (floatToRawIntBits2 >> c10));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (floatToRawIntBits2 & j12));
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            iArr = new int[size];
            for (int i14 = 0; i14 < size; i14++) {
                iArr[i14] = p.u(((s) list.get(i14)).f2705a);
            }
        } else {
            iArr = new int[list.size() + i];
            int t7 = s6.a.t(list);
            int size2 = list.size();
            int i15 = 0;
            for (int i16 = 0; i16 < size2; i16++) {
                long j13 = ((s) list.get(i16)).f2705a;
                if (s.d(j13) == 0.0f) {
                    if (i16 == 0) {
                        i8 = i15 + 1;
                        iArr[i15] = p.u(s.b(((s) list.get(1)).f2705a, 0.0f));
                    } else if (i16 == t7) {
                        i8 = i15 + 1;
                        iArr[i15] = p.u(s.b(((s) list.get(i16 - 1)).f2705a, 0.0f));
                    } else {
                        int i17 = i15 + 1;
                        iArr[i15] = p.u(s.b(((s) list.get(i16 - 1)).f2705a, 0.0f));
                        i15 += 2;
                        iArr[i17] = p.u(s.b(((s) list.get(i16 + 1)).f2705a, 0.0f));
                    }
                    i15 = i8;
                } else {
                    iArr[i15] = p.u(j13);
                    i15++;
                }
            }
        }
        int[] iArr2 = iArr;
        if (i == 0) {
            fArr = null;
        } else {
            fArr = new float[list.size() + i];
            fArr[0] = 0.0f;
            int t8 = s6.a.t(list);
            int i18 = 1;
            for (int i19 = 1; i19 < t8; i19++) {
                long j14 = ((s) list.get(i19)).f2705a;
                float t9 = i19 / s6.a.t(list);
                int i20 = i18 + 1;
                fArr[i18] = t9;
                if (s.d(j14) == 0.0f) {
                    i18 += 2;
                    fArr[i20] = t9;
                } else {
                    i18 = i20;
                }
            }
            fArr[i18] = 1.0f;
        }
        return new LinearGradient(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, iArr2, fArr, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f2627g.equals(b0Var.f2627g) && e1.b.b(this.f2628h, b0Var.f2628h) && e1.b.b(this.i, b0Var.i);
    }

    @Override // f1.p
    public final void g(float f6, long j7, h hVar) {
        Paint paint = (Paint) hVar.f2660b;
        b1.b bVar = this.f2625e;
        if (bVar == null || !e1.e.a(this.f2626f, j7)) {
            if (e1.e.c(j7)) {
                this.f2625e = null;
                this.f2626f = 9205357640488583168L;
                bVar = null;
            } else {
                bVar = this.f2625e;
                if (bVar == null) {
                    bVar = new b1.b(7, false);
                    this.f2625e = bVar;
                }
                bVar.f1050e = B(j7);
                this.f2625e = bVar;
                this.f2626f = j7;
            }
        }
        long b8 = p.b(paint.getColor());
        long j8 = s.f2698b;
        if (!s.c(b8, j8)) {
            hVar.e(j8);
        }
        if (!q6.i.a((Shader) hVar.f2661c, bVar != null ? (Shader) bVar.f1050e : null)) {
            hVar.g(bVar != null ? (Shader) bVar.f1050e : null);
        }
        if (paint.getAlpha() / 255.0f == f6) {
            return;
        }
        hVar.c(f6);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + a0.q.c(a0.q.c(this.f2627g.hashCode() * 961, 31, this.f2628h), 31, this.i);
    }

    public final String toString() {
        String str;
        long j7 = this.f2628h;
        String str2 = "";
        if (((((j7 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) e1.b.g(j7)) + ", ";
        } else {
            str = "";
        }
        long j8 = this.i;
        if (((((j8 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) e1.b.g(j8)) + ", ";
        }
        return "LinearGradient(colors=" + this.f2627g + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
