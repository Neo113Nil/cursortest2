package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epy {
    public int a;
    public gzp b = gyf.a;
    public byte c;
    public int d;
    private hel e;

    public final epz a() {
        int i;
        if (this.e == null) {
            int i2 = hel.d;
            this.e = his.a;
        }
        if (this.c == 3 && (i = this.d) != 0) {
            return new epz(i, this.a, this.b, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
