package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xd1 extends bk2 {
    public final List c;
    public final long d;
    public final long e;

    public xd1(List list, long j, long j2) {
        this.c = list;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.bk2
    public final Shader b(long j) {
        int i;
        int[] iArr;
        int i2;
        float[] fArr;
        long j2 = this.d;
        char c = ' ';
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i3);
        long j3 = 4294967295L;
        int i4 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i4);
        long j4 = this.e;
        int i5 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i5) == Float.POSITIVE_INFINITY) {
            i5 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i5);
        int i6 = (int) (j4 & 4294967295L);
        if (Float.intBitsToFloat(i6) == Float.POSITIVE_INFINITY) {
            i6 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i6);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.c;
        if (list.size() < 2) {
            lh.e("colors must have length of at least 2 if colorStops is omitted.");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int size = list.size() - 1;
            int i7 = 1;
            i = 0;
            while (i7 < size) {
                char c2 = c;
                long j5 = j3;
                if (aw.d(((aw) list.get(i7)).a) == 0.0f) {
                    i++;
                }
                i7++;
                c = c2;
                j3 = j5;
            }
        }
        char c3 = c;
        long j6 = j3;
        float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> c3));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & j6));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (floatToRawIntBits2 >> c3));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (floatToRawIntBits2 & j6));
        if (Build.VERSION.SDK_INT >= 26) {
            int size2 = list.size();
            iArr = new int[size2];
            for (int i8 = 0; i8 < size2; i8++) {
                iArr[i8] = ap.H(((aw) list.get(i8)).a);
            }
        } else {
            iArr = new int[list.size() + i];
            int size3 = list.size() - 1;
            int size4 = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size4; i10++) {
                long j7 = ((aw) list.get(i10)).a;
                if (aw.d(j7) == 0.0f) {
                    if (i10 == 0) {
                        i2 = i9 + 1;
                        iArr[i9] = ap.H(aw.b(((aw) list.get(1)).a, 0.0f));
                    } else if (i10 == size3) {
                        i2 = i9 + 1;
                        iArr[i9] = ap.H(aw.b(((aw) list.get(i10 - 1)).a, 0.0f));
                    } else {
                        int i11 = i9 + 1;
                        iArr[i9] = ap.H(aw.b(((aw) list.get(i10 - 1)).a, 0.0f));
                        i9 += 2;
                        iArr[i11] = ap.H(aw.b(((aw) list.get(i10 + 1)).a, 0.0f));
                    }
                    i9 = i2;
                } else {
                    iArr[i9] = ap.H(j7);
                    i9++;
                }
            }
        }
        int[] iArr2 = iArr;
        if (i == 0) {
            fArr = null;
        } else {
            float[] fArr2 = new float[list.size() + i];
            fArr2[0] = 0.0f;
            int size5 = list.size() - 1;
            int i12 = 1;
            for (int i13 = 1; i13 < size5; i13++) {
                long j8 = ((aw) list.get(i13)).a;
                float size6 = i13 / (list.size() - 1);
                int i14 = i12 + 1;
                fArr2[i12] = size6;
                if (aw.d(j8) == 0.0f) {
                    i12 += 2;
                    fArr2[i14] = size6;
                } else {
                    i12 = i14;
                }
            }
            fArr2[i12] = 1.0f;
            fArr = fArr2;
        }
        return new LinearGradient(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, iArr2, fArr, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd1)) {
            return false;
        }
        xd1 xd1Var = (xd1) obj;
        return Intrinsics.b(this.c, xd1Var.c) && au1.b(this.d, xd1Var.d) && au1.b(this.e, xd1Var.e);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + in1.h(in1.h(this.c.hashCode() * 961, 31, this.d), 31, this.e);
    }

    public final String toString() {
        String str;
        long j = this.d;
        long j2 = (((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
        String str2 = BuildConfig.FLAVOR;
        if (j2 == 0) {
            str = "start=" + ((Object) au1.i(j)) + ", ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        long j3 = this.e;
        if (((((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) au1.i(j3)) + ", ";
        }
        return "LinearGradient(colors=" + this.c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
