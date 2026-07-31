package f1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f2686a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2687b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2688c;

    public m(int i, long j7) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            a.d();
            porterDuffColorFilter = a.c(p.u(j7), p.r(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(p.u(j7), p.x(i));
        }
        this.f2686a = porterDuffColorFilter;
        this.f2687b = j7;
        this.f2688c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.c(this.f2687b, mVar.f2687b) && this.f2688c == mVar.f2688c;
    }

    public final int hashCode() {
        int i = s.i;
        return Integer.hashCode(this.f2688c) + (Long.hashCode(this.f2687b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        a0.q.o(this.f2687b, sb, ", blendMode=");
        sb.append((Object) p.y(this.f2688c));
        sb.append(')');
        return sb.toString();
    }
}
