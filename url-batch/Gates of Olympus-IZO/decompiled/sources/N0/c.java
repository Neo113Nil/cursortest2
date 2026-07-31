package N0;

import Z1.i;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f2852a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f2853b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f2852a = fArr;
        this.f2853b = fArr2;
    }

    @Override // N0.a
    public final float a(float f3) {
        return F0.a.d(f3, this.f2853b, this.f2852a);
    }

    @Override // N0.a
    public final float b(float f3) {
        return F0.a.d(f3, this.f2852a, this.f2853b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f2852a, cVar.f2852a) && Arrays.equals(this.f2853b, cVar.f2853b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2853b) + (Arrays.hashCode(this.f2852a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f2852a);
        i.e(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f2853b);
        i.e(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
