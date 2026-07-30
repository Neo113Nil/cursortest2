package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jq1 implements o01 {
    public static final hq1 Companion = new hq1();
    public static final jq1 gPXPFXrUH4XX = new jq1();
    public int OPXfSBeufaJ8;
    public int rtx2ld2ELZv4;
    public Handler x50lh2ztY7Y5;
    public boolean wdg6QnbFHrFF = true;
    public boolean dgRBjINgWbAK = true;
    public final s01 cpQdD2nAriOS = new s01(this, true);
    public final BRwzKIf41E4i r3s1LDPKFs1S = new BRwzKIf41E4i(7, this);
    public final i2 QrzZRwfaDlRX = new i2(24, this);

    public final void PxuCJdSBwIXG() {
        int i = this.OPXfSBeufaJ8 + 1;
        this.OPXfSBeufaJ8 = i;
        if (i == 1) {
            if (this.wdg6QnbFHrFF) {
                this.cpQdD2nAriOS.Y1f8riQaR6yg(e01.ON_RESUME);
                this.wdg6QnbFHrFF = false;
            } else {
                Handler handler = this.x50lh2ztY7Y5;
                handler.getClass();
                handler.removeCallbacks(this.r3s1LDPKFs1S);
            }
        }
    }

    @Override // defpackage.o01
    public final s01 rtx2ld2ELZv4() {
        return this.cpQdD2nAriOS;
    }
}
