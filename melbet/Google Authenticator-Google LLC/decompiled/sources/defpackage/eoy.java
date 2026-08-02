package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eoy implements elj {
    private final int a;
    private final int b;

    public eoy(byte[] bArr) {
        this.b = 2;
        this.a = 10;
    }

    @Override // defpackage.elj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.elj
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eoy)) {
            return false;
        }
        eoy eoyVar = (eoy) obj;
        int i = this.b;
        int i2 = eoyVar.b;
        if (i != 0) {
            return i == i2 && this.a == eoyVar.a;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.D(i);
        return ((this.a ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + elk.a(this.b) + ", rateLimitPerSecond=" + this.a + ", perfettoMustBeExplicitlyTriggered=false}";
    }

    public eoy() {
        throw null;
    }

    @Override // defpackage.elj
    public final /* synthetic */ void c() {
    }
}
