package com.bytedance.sdk.component.icD.pvs.icD;

/* compiled from: Segment.java */
/* loaded from: classes.dex */
final class NB {
    boolean Jd;
    boolean NB;
    int icD;
    final byte[] pvs;
    NB sUS;
    int vG;
    NB yiw;

    NB() {
        this.pvs = new byte[8192];
        this.NB = true;
        this.Jd = false;
    }

    NB(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.pvs = bArr;
        this.icD = i;
        this.vG = i2;
        this.Jd = z;
        this.NB = z2;
    }

    final NB pvs() {
        this.Jd = true;
        return new NB(this.pvs, this.icD, this.vG, true, false);
    }

    public final NB icD() {
        NB nb = this.sUS;
        NB nb2 = nb != this ? nb : null;
        NB nb3 = this.yiw;
        if (nb3 != null) {
            nb3.sUS = nb;
        }
        NB nb4 = this.sUS;
        if (nb4 != null) {
            nb4.yiw = nb3;
        }
        this.sUS = null;
        this.yiw = null;
        return nb2;
    }

    public final NB pvs(NB nb) {
        nb.yiw = this;
        nb.sUS = this.sUS;
        this.sUS.yiw = nb;
        this.sUS = nb;
        return nb;
    }
}
