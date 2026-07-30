package I;

import java.util.Objects;

/* renamed from: I.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1196c;

    public C0113i(String str, int i2, int i5) {
        this.f1194a = str;
        this.f1195b = i2;
        this.f1196c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0113i)) {
            return false;
        }
        C0113i c0113i = (C0113i) obj;
        return Objects.equals(this.f1194a, c0113i.f1194a) && this.f1195b == c0113i.f1195b && this.f1196c == c0113i.f1196c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f1195b);
        Integer valueOf2 = Integer.valueOf(this.f1196c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.f1194a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f1194a;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb.append(" displayWidth=");
        sb.append(this.f1195b);
        sb.append(" displayHeight=");
        sb.append(this.f1196c);
        sb.append(" physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
        return sb.toString();
    }
}
