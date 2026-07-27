package N0;

import H1.f;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3616a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f3617b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f3616a = fArr;
        this.f3617b = fArr2;
    }

    @Override // N0.a
    public final float a(float f4) {
        return f.g(f4, this.f3617b, this.f3616a);
    }

    @Override // N0.a
    public final float b(float f4) {
        return f.g(f4, this.f3616a, this.f3617b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f3616a, cVar.f3616a) && Arrays.equals(this.f3617b, cVar.f3617b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3617b) + (Arrays.hashCode(this.f3616a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f3616a);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f3617b);
        Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
