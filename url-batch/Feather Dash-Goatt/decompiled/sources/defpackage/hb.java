package defpackage;

import android.content.Context;
import com.appsflyer.internal.l;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hb extends zn {
    public final Context a;
    public final me1 b;
    public final me1 c;
    public final String d;

    public hb(Context context, me1 me1Var, me1 me1Var2, String str) {
        if (context == null) {
            l.b("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (me1Var == null) {
            l.b("Null wallClock");
            throw null;
        }
        this.b = me1Var;
        if (me1Var2 == null) {
            l.b("Null monotonicClock");
            throw null;
        }
        this.c = me1Var2;
        if (str != null) {
            this.d = str;
        } else {
            l.b("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zn) {
            hb hbVar = (hb) ((zn) obj);
            if (this.a.equals(hbVar.a) && this.b.equals(hbVar.b) && this.c.equals(hbVar.c) && this.d.equals(hbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.d + "}";
    }
}
