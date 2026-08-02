package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqq {
    public byte a;
    public int b;
    public Object c;

    public eqq() {
        this.c = gyf.a;
    }

    public final eqr a() {
        int i;
        if (this.a == 1 && (i = this.b) != 0) {
            return new eqr(i, (gzp) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final ell b() {
        int i;
        Object obj;
        if (this.a == 1 && (i = this.b) != 0 && (obj = this.c) != null) {
            return new ell(i, (eos) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" chargeCounterEnabled");
        }
        if (this.c == null) {
            sb.append(" metricExtensionProvider");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public eqq(byte[] bArr) {
    }
}
