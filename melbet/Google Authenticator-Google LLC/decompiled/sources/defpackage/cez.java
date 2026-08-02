package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cez {
    public final Context a;
    public final cgw b;
    public final cgw c;
    private final String d;

    public cez(Context context, cgw cgwVar, cgw cgwVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        this.b = cgwVar;
        this.c = cgwVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cez) {
            cez cezVar = (cez) obj;
            if (this.a.equals(cezVar.a) && this.b.equals(cezVar.b) && this.c.equals(cezVar.c) && this.d.equals(cezVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        cgw cgwVar = this.c;
        cgw cgwVar2 = this.b;
        return "CreationContext{applicationContext=" + this.a.toString() + ", wallClock=" + cgwVar2.toString() + ", monotonicClock=" + cgwVar.toString() + ", backendName=" + this.d + "}";
    }

    public cez() {
        throw null;
    }
}
