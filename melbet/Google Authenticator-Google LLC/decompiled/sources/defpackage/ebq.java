package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebq {
    public boolean a;
    public byte b;

    public final ebr a() {
        if (this.b == 3) {
            return new ebr(this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" showSwitchProfileAction");
        }
        if ((this.b & 2) == 0) {
            sb.append(" disableDecorationFeatures");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
