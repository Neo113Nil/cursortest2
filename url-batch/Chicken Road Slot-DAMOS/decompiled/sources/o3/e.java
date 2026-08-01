package o3;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f7387a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7388b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7389c;

    public e(String str, int i3, int i10) {
        this.f7387a = str;
        this.f7388b = i3;
        this.f7389c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7387a.equals(eVar.f7387a) && this.f7388b == eVar.f7388b && this.f7389c == eVar.f7389c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f7388b);
        Integer valueOf2 = Integer.valueOf(this.f7389c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.f7387a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.f7387a.hashCode()) + " displayWidth=" + this.f7388b + " displayHeight=" + this.f7389c + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
