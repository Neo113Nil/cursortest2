package R0;

import T.D;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f implements D {

    /* renamed from: a, reason: collision with root package name */
    public final float f2311a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2312b;

    /* renamed from: c, reason: collision with root package name */
    public final e f2313c;

    public f(float f4, e eVar, e eVar2) {
        this.f2311a = f4;
        this.f2312b = eVar;
        this.f2313c = eVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f2311a, fVar.f2311a) == 0 && Objects.equals(this.f2312b, fVar.f2312b) && Objects.equals(this.f2313c, fVar.f2313c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f2311a) * 31;
        e eVar = this.f2312b;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        e eVar2 = this.f2313c;
        return hashCode2 + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f2311a + ", field 1=" + this.f2312b + ", field 2=" + this.f2313c;
    }
}
