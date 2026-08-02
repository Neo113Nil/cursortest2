package N0;

import T.D;

/* loaded from: classes.dex */
public final class c implements D {

    /* renamed from: a, reason: collision with root package name */
    public final float f1800a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1801b;

    public c(float f4, int i4) {
        this.f1800a = f4;
        this.f1801b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f1800a == cVar.f1800a && this.f1801b == cVar.f1801b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f1800a).hashCode() + 527) * 31) + this.f1801b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f1800a + ", svcTemporalLayerCount=" + this.f1801b;
    }
}
