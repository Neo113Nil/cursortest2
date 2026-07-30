package defpackage;

import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v22 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public v22(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v22)) {
            return false;
        }
        v22 v22Var = (v22) obj;
        return s22.a(this.a, v22Var.a) && this.b == v22Var.b && au1.b(this.c, v22Var.c) && au1.b(this.d, v22Var.d) && this.e == v22Var.e && Float.compare(this.f, v22Var.f) == 0 && this.g == v22Var.g && this.h == v22Var.h && this.i.equals(v22Var.i) && au1.b(this.j, v22Var.j) && au1.b(this.k, v22Var.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + in1.h((this.i.hashCode() + in1.i(q40.e(this.g, q40.d(this.f, in1.i(in1.h(in1.h(in1.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) s22.b(this.a));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((Object) au1.i(this.c));
        sb.append(", position=");
        sb.append((Object) au1.i(this.d));
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.g;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) au1.i(this.j));
        sb.append(", originalEventPosition=");
        sb.append((Object) au1.i(this.k));
        sb.append(')');
        return sb.toString();
    }
}
