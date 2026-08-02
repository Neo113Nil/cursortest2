package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqg implements elj {
    public final gzp a;
    public final gzp b;
    private final int c;

    public eqg(gzp gzpVar, gzp gzpVar2) {
        this.c = 1;
        this.a = gzpVar;
        this.b = gzpVar2;
    }

    @Override // defpackage.elj
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.elj
    public final boolean b() {
        return this.c == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eqg)) {
            return false;
        }
        eqg eqgVar = (eqg) obj;
        int i = this.c;
        int i2 = eqgVar.c;
        if (i != 0) {
            return i2 == 1 && this.a.equals(eqgVar.a) && this.b.equals(eqgVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        a.D(this.c);
        return 395873938;
    }

    public final String toString() {
        gzp gzpVar = this.b;
        return "StartupConfigurations{enablement=" + elk.a(this.c) + ", metricExtensionProvider=" + String.valueOf(this.a) + ", customTimestampProvider=" + String.valueOf(gzpVar) + "}";
    }

    public eqg() {
        throw null;
    }

    @Override // defpackage.elj
    public final /* synthetic */ void c() {
    }
}
