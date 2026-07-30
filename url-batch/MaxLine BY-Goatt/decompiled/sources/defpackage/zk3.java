package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zk3 {
    public final Context a;
    public final pq2 b;

    public zk3(Context context, pq2 pq2Var) {
        this.a = context;
        this.b = pq2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zk3)) {
            return false;
        }
        zk3 zk3Var = (zk3) obj;
        return this.a.equals(zk3Var.a) && this.b.equals(zk3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        sb.append("FlagsContext{context=");
        sb.append(obj);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
