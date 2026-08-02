package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dix {
    public final Context a;
    public final gzp b;
    private final gzp c;
    private final gzp d;

    public dix(Context context, gzp gzpVar, gzp gzpVar2, gzp gzpVar3) {
        this.a = context;
        this.c = gzpVar;
        this.d = gzpVar2;
        this.b = gzpVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dix) {
            dix dixVar = (dix) obj;
            if (this.a.equals(dixVar.a) && this.c.equals(dixVar.c) && this.d.equals(dixVar.d) && this.b.equals(dixVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003)) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        gzp gzpVar = this.b;
        gzp gzpVar2 = this.d;
        gzp gzpVar3 = this.c;
        return "CollectionBasisContext{context=" + String.valueOf(this.a) + ", accountNames=" + String.valueOf(gzpVar3) + ", stacktrace=" + String.valueOf(gzpVar2) + ", googlerOverridesCheckbox=false, executor=" + String.valueOf(gzpVar) + "}";
    }

    public dix() {
        throw null;
    }
}
