package O0;

import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f622a;

    /* renamed from: b, reason: collision with root package name */
    public final int f623b;

    /* renamed from: c, reason: collision with root package name */
    public final int f624c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final long f625e;

    /* renamed from: f, reason: collision with root package name */
    public final float f626f;

    /* renamed from: g, reason: collision with root package name */
    public final List f627g;

    public i(int i, int i2, int i3, int i4, long j2, float f2, List list) {
        this.f622a = i;
        this.f623b = i2;
        this.f624c = i3;
        this.d = i4;
        this.f625e = j2;
        this.f626f = f2;
        this.f627g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f622a == iVar.f622a && this.f623b == iVar.f623b && this.f624c == iVar.f624c && this.d == iVar.d && this.f625e == iVar.f625e && Float.compare(this.f626f, iVar.f626f) == 0 && this.f627g.equals(iVar.f627g);
    }

    public final int hashCode() {
        return this.f627g.hashCode() + ((Float.hashCode(this.f626f) + ((Long.hashCode(this.f625e) + ((Integer.hashCode(this.d) + ((Integer.hashCode(this.f624c) + ((Integer.hashCode(this.f623b) + (Integer.hashCode(this.f622a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoutineConfig(id=" + this.f622a + ", nameRes=" + this.f623b + ", descriptionRes=" + this.f624c + ", sessionSeconds=" + this.d + ", exerciseDurationMs=" + this.f625e + ", speed=" + this.f626f + ", exerciseTypes=" + this.f627g + ")";
    }
}
