package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecq {
    public final Drawable a;
    public final int b;
    public final String c;
    public final int d;
    public final View.OnClickListener e;
    private final int f;
    private final gzp g;

    public ecq(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, gzp gzpVar) {
        this.f = i;
        this.a = drawable;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = onClickListener;
        this.g = gzpVar;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecq) {
            ecq ecqVar = (ecq) obj;
            if (this.f == ecqVar.f && ((drawable = this.a) != null ? drawable.equals(ecqVar.a) : ecqVar.a == null) && this.b == ecqVar.b && this.c.equals(ecqVar.c) && this.d == ecqVar.d && this.e.equals(ecqVar.e) && this.g.equals(ecqVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        return ((this.e.hashCode() ^ (((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.f ^ 1000003) * 1000003)) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        gzp gzpVar = this.g;
        View.OnClickListener onClickListener = this.e;
        return "SimpleActionSpec{id=" + this.f + ", icon=" + String.valueOf(this.a) + ", iconResId=" + this.b + ", label=" + this.c + ", veId=" + this.d + ", onClickListener=" + String.valueOf(onClickListener) + ", availabilityChecker=" + String.valueOf(gzpVar) + "}";
    }

    public ecq() {
        throw null;
    }
}
