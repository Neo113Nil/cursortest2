package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class t60 extends ju {
    public static final /* synthetic */ int cpQdD2nAriOS = 0;
    public boolean dgRBjINgWbAK;
    public long wdg6QnbFHrFF;
    public da x50lh2ztY7Y5;

    public final boolean IXK6ba3ucyzm() {
        da daVar = this.x50lh2ztY7Y5;
        if (daVar == null) {
            return false;
        }
        g00 g00Var = (g00) (daVar.isEmpty() ? null : daVar.removeFirst());
        if (g00Var == null) {
            return false;
        }
        g00Var.run();
        return true;
    }

    public abstract long nxJAScVArhE9();

    public abstract void shutdown();

    public final void wLFCmsViZrNT(g00 g00Var) {
        da daVar = this.x50lh2ztY7Y5;
        if (daVar == null) {
            daVar = new da();
            this.x50lh2ztY7Y5 = daVar;
        }
        daVar.addLast(g00Var);
    }

    public final void xbgXKYA2cIfu(boolean z) {
        this.wdg6QnbFHrFF = (z ? 4294967296L : 1L) + this.wdg6QnbFHrFF;
        if (z) {
            return;
        }
        this.dgRBjINgWbAK = true;
    }

    public final void zf8DYfih6EZu(boolean z) {
        long j = this.wdg6QnbFHrFF - (z ? 4294967296L : 1L);
        this.wdg6QnbFHrFF = j;
        if (j <= 0 && this.dgRBjINgWbAK) {
            shutdown();
        }
    }
}
