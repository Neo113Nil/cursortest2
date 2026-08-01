package n0;

import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2785a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2786b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2787c;

    public j(String str, int i, int i4) {
        this.f2785a = str;
        this.f2786b = i;
        this.f2787c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Objects.equals(this.f2785a, jVar.f2785a) && this.f2786b == jVar.f2786b && this.f2787c == jVar.f2787c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f2786b);
        Integer valueOf2 = Integer.valueOf(this.f2787c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.f2785a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f2785a;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb.append(" displayWidth=");
        sb.append(this.f2786b);
        sb.append(" displayHeight=");
        sb.append(this.f2787c);
        sb.append(" physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
        return sb.toString();
    }
}
