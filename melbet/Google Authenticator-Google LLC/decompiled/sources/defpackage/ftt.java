package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ftt {
    public static final hkh a = hkh.l("com/google/apps/tiktok/account/api/controller/Config");
    public final boolean b;
    public final hel c;

    public ftt(boolean z, hel helVar) {
        this.b = z;
        this.c = helVar;
    }

    public static ggb a() {
        ggb ggbVar = new ggb();
        ggbVar.g(false);
        ggbVar.f(fyk.class);
        return ggbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ftt) {
            ftt fttVar = (ftt) obj;
            if (this.b == fttVar.b && hnu.H(this.c, fttVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ (((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003)) * (-721379959);
    }

    public final String toString() {
        return "Config{canSwitchAccounts=" + this.b + ", initialSelectors=" + String.valueOf(this.c) + ", overrideRequirements=null, updateInitialSelectionContext=null}";
    }

    public ftt() {
        throw null;
    }
}
