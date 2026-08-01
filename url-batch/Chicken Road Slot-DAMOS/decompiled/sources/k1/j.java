package k1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f5329a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5330b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5331c;

    public j(int i3, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            a.d();
            porterDuffColorFilter = a.c(v.r(j), v.q(i3));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(v.r(j), v.t(i3));
        }
        this.f5329a = porterDuffColorFilter;
        this.f5330b = j;
        this.f5331c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p.c(this.f5330b, jVar.f5330b) && this.f5331c == jVar.f5331c;
    }

    public final int hashCode() {
        int i3 = p.f5341h;
        hd.z zVar = hd.a0.f4495e;
        return Integer.hashCode(this.f5331c) + (Long.hashCode(this.f5330b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        v4.a.t(this.f5330b, sb2, ", blendMode=");
        sb2.append((Object) v.u(this.f5331c));
        sb2.append(')');
        return sb2.toString();
    }
}
