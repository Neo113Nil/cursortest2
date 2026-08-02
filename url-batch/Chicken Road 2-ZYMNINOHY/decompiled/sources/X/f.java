package X;

import T.D;
import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class f implements D {

    /* renamed from: a, reason: collision with root package name */
    public final float f3497a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3498b;

    public f(float f4, float f5) {
        AbstractC0124a.g("Invalid latitude or longitude", f4 >= -90.0f && f4 <= 90.0f && f5 >= -180.0f && f5 <= 180.0f);
        this.f3497a = f4;
        this.f3498b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f3497a == fVar.f3497a && this.f3498b == fVar.f3498b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f3498b).hashCode() + ((Float.valueOf(this.f3497a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f3497a + ", longitude=" + this.f3498b;
    }
}
