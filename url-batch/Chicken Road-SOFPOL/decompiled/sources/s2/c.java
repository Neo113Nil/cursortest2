package s2;

import java.util.Arrays;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f6694a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f6695b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f6694a = fArr;
        this.f6695b = fArr2;
    }

    @Override // s2.a
    public final float a(float f6) {
        return p.b.a(f6, this.f6695b, this.f6694a);
    }

    @Override // s2.a
    public final float b(float f6) {
        return p.b.a(f6, this.f6694a, this.f6695b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f6694a, cVar.f6694a) && Arrays.equals(this.f6695b, cVar.f6695b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6695b) + (Arrays.hashCode(this.f6694a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f6694a);
        i.d(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f6695b);
        i.d(arrays2, "toString(...)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
