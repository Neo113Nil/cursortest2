package y2;

import java.util.Arrays;
import s7.c0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f10578a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f10579b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            a1.e("Array lengths must match and be nonzero");
            throw null;
        }
        this.f10578a = fArr;
        this.f10579b = fArr2;
    }

    @Override // y2.a
    public final float a(float f3) {
        return c0.e(f3, this.f10579b, this.f10578a);
    }

    @Override // y2.a
    public final float b(float f3) {
        return c0.e(f3, this.f10578a, this.f10579b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f10578a, cVar.f10578a) && Arrays.equals(this.f10579b, cVar.f10579b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10579b) + (Arrays.hashCode(this.f10578a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f10578a);
        arrays.getClass();
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f10579b);
        arrays2.getClass();
        sb2.append(arrays2);
        sb2.append('}');
        return sb2.toString();
    }
}
