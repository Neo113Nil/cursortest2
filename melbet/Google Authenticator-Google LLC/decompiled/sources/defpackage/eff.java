package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eff {
    public final String h;
    public String a = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    private final int i = 1;

    public eff(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eff)) {
            return false;
        }
        eff effVar = (eff) obj;
        if (!ksp.b(this.a, effVar.a) || this.b != effVar.b || this.c != effVar.c || this.d != effVar.d || this.e != effVar.e || this.f != effVar.f || this.g != effVar.g || !ksp.b(this.h, effVar.h)) {
            return false;
        }
        int i = effVar.i;
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h.hashCode();
        a.I(1);
        return (hashCode * 31) + 1;
    }

    public final String toString() {
        return "BentoUnboundFlowCrashFields(hostActivityOrFragmentName=" + this.a + ", onAttachCalledCount=" + this.b + ", onCreateCalledCount=" + this.c + ", onViewCreatedCalledCount=" + this.d + ", onConfigChangedCalledCount=" + this.e + ", onDetachCalledCount=" + this.f + ", bentoIntentLauncherBinderBindCalledCount=" + this.g + ", packageName=" + this.h + ", bentoIntentLauncherSource=" + ((Object) dih.Q(1)) + ")";
    }
}
