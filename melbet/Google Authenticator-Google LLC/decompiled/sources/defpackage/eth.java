package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eth {
    public final Context a;
    public final hac b;

    public eth(Context context, hac hacVar) {
        this.a = context;
        this.b = hacVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eth) {
            eth ethVar = (eth) obj;
            if (this.a.equals(ethVar.a) && this.b.equals(ethVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        hac hacVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + hacVar.toString() + "}";
    }

    public eth() {
        throw null;
    }
}
