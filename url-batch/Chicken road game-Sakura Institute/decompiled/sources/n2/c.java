package n2;

import j4.i;
import java.util.Arrays;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f6502a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f6503b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f6502a = fArr;
        this.f6503b = fArr2;
    }

    @Override // n2.a
    public final float a(float f9) {
        return i.d(f9, this.f6503b, this.f6502a);
    }

    @Override // n2.a
    public final float b(float f9) {
        return i.d(f9, this.f6502a, this.f6503b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f6502a, cVar.f6502a) && Arrays.equals(this.f6503b, cVar.f6503b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6503b) + (Arrays.hashCode(this.f6502a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f6502a);
        k.e(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f6503b);
        k.e(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
