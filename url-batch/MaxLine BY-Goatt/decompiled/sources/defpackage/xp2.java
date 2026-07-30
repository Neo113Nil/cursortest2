package defpackage;

import com.facebook.internal.AnalyticsEvents;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xp2 extends ae0 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public xp2(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp2)) {
            return false;
        }
        xp2 xp2Var = (xp2) obj;
        return this.a == xp2Var.a && this.b == xp2Var.b && this.c == xp2Var.c && this.d == xp2Var.d;
    }

    public final int hashCode() {
        return q40.e(this.d, q40.e(this.c, q40.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        int i = this.c;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN));
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
