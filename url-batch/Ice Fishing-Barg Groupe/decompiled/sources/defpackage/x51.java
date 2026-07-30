package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x51 implements Closeable {
    public final boolean OPXfSBeufaJ8;
    public Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final yf wdg6QnbFHrFF;
    public Closeable x50lh2ztY7Y5;

    public x51(int i, boolean z) {
        this.rtx2ld2ELZv4 = i;
        switch (i) {
            case 1:
                this.OPXfSBeufaJ8 = z;
                this.wdg6QnbFHrFF = new yf();
                break;
            default:
                this.OPXfSBeufaJ8 = z;
                yf yfVar = new yf();
                this.wdg6QnbFHrFF = yfVar;
                Deflater deflater = new Deflater(-1, true);
                this.dgRBjINgWbAK = deflater;
                this.x50lh2ztY7Y5 = new qx(yfVar, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                ((qx) this.x50lh2ztY7Y5).close();
                break;
            default:
                xo0 xo0Var = (xo0) this.x50lh2ztY7Y5;
                if (xo0Var != null) {
                    xo0Var.close();
                }
                this.x50lh2ztY7Y5 = null;
                this.dgRBjINgWbAK = null;
                break;
        }
    }
}
