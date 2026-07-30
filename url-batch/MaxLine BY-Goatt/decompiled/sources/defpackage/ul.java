package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ul extends g50 {
    public final Context a;
    public final dq2 b;
    public final dq2 c;
    public final String d;

    public ul(Context context, dq2 dq2Var, dq2 dq2Var2, String str) {
        if (context == null) {
            ch2.l("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (dq2Var == null) {
            ch2.l("Null wallClock");
            throw null;
        }
        this.b = dq2Var;
        if (dq2Var2 == null) {
            ch2.l("Null monotonicClock");
            throw null;
        }
        this.c = dq2Var2;
        if (str != null) {
            this.d = str;
        } else {
            ch2.l("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g50) {
            ul ulVar = (ul) ((g50) obj);
            if (this.a.equals(ulVar.a) && this.b.equals(ulVar.b) && this.c.equals(ulVar.c) && this.d.equals(ulVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return q40.p(sb, this.d, "}");
    }
}
