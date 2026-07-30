package defpackage;

import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t22 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final ArrayList k;
    public final long l;
    public boolean m;
    public boolean n;
    public t22 o;

    public t22(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.l = 0L;
        this.m = z3;
        this.n = z3;
    }

    public final void a() {
        t22 t22Var = this.o;
        if (t22Var == null) {
            this.m = true;
            this.n = true;
        } else if (t22Var != null) {
            t22Var.a();
        }
    }

    public final boolean b() {
        t22 t22Var = this.o;
        return t22Var != null ? t22Var.b() : this.m || this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) s22.b(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append((Object) au1.i(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append((Object) au1.i(this.g));
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i = this.i;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.k;
        if (obj == null) {
            obj = ah0.m;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) au1.i(this.j));
        sb.append(')');
        return sb.toString();
    }

    public t22(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.k = arrayList;
        this.l = j7;
    }
}
