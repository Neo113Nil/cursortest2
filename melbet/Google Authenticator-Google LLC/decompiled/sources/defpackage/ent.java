package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ent implements elj {
    public final String a;
    private final int b;

    public ent(byte[] bArr) {
        this.b = 1;
        this.a = "";
    }

    @Override // defpackage.elj
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.elj
    public final boolean b() {
        return this.b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ent)) {
            return false;
        }
        ent entVar = (ent) obj;
        int i = this.b;
        int i2 = entVar.b;
        if (i != 0) {
            return i2 == 1 && this.a.equals(entVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        a.D(this.b);
        return (this.a.hashCode() ^ (-722379962)) * 1000003;
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=" + elk.a(this.b) + ", reportingProcessShortName=" + this.a + ", metricExtensionProvider=null}";
    }

    public ent() {
        throw null;
    }

    @Override // defpackage.elj
    public final /* synthetic */ void c() {
    }
}
