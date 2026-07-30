package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nn0 extends e6tOsSdd2EFb {
    public final int OPXfSBeufaJ8;
    public final tmVwIGCQF4zR rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    public nn0(tmVwIGCQF4zR tmvwigcqf4zr, int i, int i2) {
        this.rtx2ld2ELZv4 = tmvwigcqf4zr;
        this.OPXfSBeufaJ8 = i;
        sj0.r3s1LDPKFs1S(i, i2, tmvwigcqf4zr.PxuCJdSBwIXG());
        this.wdg6QnbFHrFF = i2 - i;
    }

    @Override // defpackage.QrzZRwfaDlRX
    public final int PxuCJdSBwIXG() {
        return this.wdg6QnbFHrFF;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sj0.x50lh2ztY7Y5(i, this.wdg6QnbFHrFF);
        return this.rtx2ld2ELZv4.get(this.OPXfSBeufaJ8 + i);
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public final List subList(int i, int i2) {
        sj0.r3s1LDPKFs1S(i, i2, this.wdg6QnbFHrFF);
        int i3 = this.OPXfSBeufaJ8;
        return new nn0(this.rtx2ld2ELZv4, i + i3, i3 + i2);
    }
}
