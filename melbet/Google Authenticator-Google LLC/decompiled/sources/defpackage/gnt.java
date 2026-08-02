package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gnt {
    public final String a;
    public final gzp b;
    public final her c;
    public final boolean d;
    public final boolean e;
    public final gzp f;
    public final gzp g;
    public final int h;
    private final gzp i;

    public gnt(String str, gzp gzpVar, her herVar, boolean z, boolean z2, gzp gzpVar2, gzp gzpVar3, gzp gzpVar4) {
        this.a = str;
        this.b = gzpVar;
        this.c = herVar;
        this.d = true;
        this.e = true;
        this.i = gzpVar2;
        this.h = 1;
        this.f = gzpVar3;
        this.g = gzpVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnt) {
            gnt gntVar = (gnt) obj;
            if (this.a.equals(gntVar.a) && this.b.equals(gntVar.b) && hnu.B(this.c, gntVar.c) && this.d == gntVar.d && this.e == gntVar.e && this.i.equals(gntVar.i)) {
                int i = this.h;
                int i2 = gntVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.f.equals(gntVar.f) && this.g.equals(gntVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode();
        a.D(this.h);
        return (((((((((((hashCode * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ 2040732332) * 1000003) ^ 1) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        int i = this.h;
        gzp gzpVar = this.i;
        her herVar = this.c;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(herVar);
        String valueOf3 = String.valueOf(gzpVar);
        String str = i != 1 ? "null" : "SYSTEM_DEFAULT_THEME";
        boolean z = this.e;
        boolean z2 = this.d;
        String str2 = this.a;
        gzp gzpVar2 = this.f;
        gzp gzpVar3 = this.g;
        return "FeedbackOptions{categoryTag=" + str2 + ", description=" + valueOf + ", psd=" + valueOf2 + ", psdAllowPii=" + z2 + ", includeScreenshot=" + z + ", customScreenshot=" + valueOf3 + ", colorTheme=" + str + ", configuratorTriggerId=" + String.valueOf(gzpVar2) + ", logOptions=" + String.valueOf(gzpVar3) + "}";
    }

    public gnt() {
        throw null;
    }
}
