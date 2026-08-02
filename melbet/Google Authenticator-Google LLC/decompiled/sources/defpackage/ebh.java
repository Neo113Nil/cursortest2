package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebh {
    public Drawable a;
    private int b;
    private boolean c;
    private final gzp d = gyf.a;
    private byte e;

    public final ebi a() {
        if (this.e == 3) {
            ebi ebiVar = new ebi(this.a, this.b, this.c, this.d);
            int i = ebiVar.b;
            hoq.I((i != -1) ^ (ebiVar.a != null), "Either icon id or icon drawable must be specified");
            return ebiVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" iconResId");
        }
        if ((this.e & 2) == 0) {
            sb.append(" useTint");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = i;
        this.e = (byte) (this.e | 1);
    }

    public final void c(boolean z) {
        this.c = z;
        this.e = (byte) (this.e | 2);
    }
}
