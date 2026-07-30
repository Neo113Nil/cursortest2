package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mo {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public mo(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            no.e();
            porterDuffColorFilter = no.a(ap.H(j), x6.v(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(ap.H(j), x6.w(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo)) {
            return false;
        }
        mo moVar = (mo) obj;
        return aw.c(this.b, moVar.b) && this.c == moVar.c;
    }

    public final int hashCode() {
        int i = aw.h;
        q13.a aVar = q13.m;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        in1.o(this.b, sb, ", blendMode=");
        sb.append((Object) o70.O(this.c));
        sb.append(')');
        return sb.toString();
    }
}
