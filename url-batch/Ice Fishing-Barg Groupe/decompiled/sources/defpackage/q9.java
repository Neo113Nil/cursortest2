package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q9 implements jg0 {
    public final Object OPXfSBeufaJ8 = new Object();
    public volatile rv rtx2ld2ELZv4;
    public final i2 wdg6QnbFHrFF;

    public q9(i2 i2Var) {
        this.wdg6QnbFHrFF = i2Var;
    }

    @Override // defpackage.jg0
    public final Object Y1f8riQaR6yg() {
        if (this.rtx2ld2ELZv4 == null) {
            synchronized (this.OPXfSBeufaJ8) {
                try {
                    if (this.rtx2ld2ELZv4 == null) {
                        this.rtx2ld2ELZv4 = new rv(new q3((Context) this.wdg6QnbFHrFF.OPXfSBeufaJ8, (byte) 0));
                    }
                } finally {
                }
            }
        }
        return this.rtx2ld2ELZv4;
    }
}
