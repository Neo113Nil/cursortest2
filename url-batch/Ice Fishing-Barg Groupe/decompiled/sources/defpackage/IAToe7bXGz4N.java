package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class IAToe7bXGz4N extends e6tOsSdd2EFb implements RandomAccess {
    public final int OPXfSBeufaJ8;
    public final e6tOsSdd2EFb rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    public IAToe7bXGz4N(e6tOsSdd2EFb e6tossdd2efb, int i, int i2) {
        this.rtx2ld2ELZv4 = e6tossdd2efb;
        this.OPXfSBeufaJ8 = i;
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int PxuCJdSBwIXG = e6tossdd2efb.PxuCJdSBwIXG();
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.TSizfFm2Yiuu(i, i2, PxuCJdSBwIXG);
        this.wdg6QnbFHrFF = i2 - i;
    }

    @Override // defpackage.QrzZRwfaDlRX
    public final int PxuCJdSBwIXG() {
        return this.wdg6QnbFHrFF;
    }

    @Override // java.util.List
    public final Object get(int i) {
        e6tOsSdd2EFb.Companion.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, this.wdg6QnbFHrFF);
        return this.rtx2ld2ELZv4.get(this.OPXfSBeufaJ8 + i);
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public final List subList(int i, int i2) {
        e6tOsSdd2EFb.Companion.getClass();
        S2OOm9zPNm0h.TSizfFm2Yiuu(i, i2, this.wdg6QnbFHrFF);
        int i3 = this.OPXfSBeufaJ8;
        return new IAToe7bXGz4N(this.rtx2ld2ELZv4, i + i3, i3 + i2);
    }
}
