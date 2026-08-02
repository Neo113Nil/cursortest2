package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eob implements elj {
    private final int a;

    public eob(byte[] bArr) {
        this.a = 2;
    }

    @Override // defpackage.elj
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.elj
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eob)) {
            return false;
        }
        int i = this.a;
        int i2 = ((eob) obj).a;
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.D(i);
        return i ^ (-721379959);
    }

    public final String toString() {
        return "CuiConfigurations{metricExtensionProvider=null, enablement=" + elk.a(this.a) + "}";
    }

    public eob() {
        throw null;
    }

    @Override // defpackage.elj
    public final /* synthetic */ void c() {
    }
}
