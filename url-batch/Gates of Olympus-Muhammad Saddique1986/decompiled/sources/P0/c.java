package P0;

import A1.i;
import f2.j;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3917a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f3918b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f3917a = fArr;
        this.f3918b = fArr2;
    }

    @Override // P0.a
    public final float a(float f3) {
        return i.c(f3, this.f3918b, this.f3917a);
    }

    @Override // P0.a
    public final float b(float f3) {
        return i.c(f3, this.f3917a, this.f3918b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f3917a, cVar.f3917a) && Arrays.equals(this.f3918b, cVar.f3918b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3918b) + (Arrays.hashCode(this.f3917a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f3917a);
        j.e(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f3918b);
        j.e(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
