package com.bykv.vk.openvk.component.video.pvs.Jd;

import com.bykv.vk.openvk.component.video.pvs.Jd.vG;

/* compiled from: AbstractMediaPlayer.java */
/* loaded from: classes.dex */
public abstract class pvs implements vG {
    private vG.pvs Jd;
    private vG.sUS NB;
    private vG.NB icD;
    protected boolean pvs = false;
    private vG.yiw sUS;
    private vG.Jd so;
    private vG.icD vG;
    private vG.InterfaceC0019vG yiw;

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public final void pvs(vG.NB nb) {
        this.icD = nb;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public final void pvs(vG.icD icd) {
        this.vG = icd;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public final void pvs(vG.pvs pvsVar) {
        this.Jd = pvsVar;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public final void pvs(vG.sUS sus) {
        this.NB = sus;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public final void pvs(vG.InterfaceC0019vG interfaceC0019vG) {
        this.yiw = interfaceC0019vG;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public final void pvs(vG.Jd jd) {
        this.so = jd;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public final void pvs(vG.yiw yiwVar) {
        this.sUS = yiwVar;
    }

    public void pvs() {
        this.icD = null;
        this.Jd = null;
        this.vG = null;
        this.NB = null;
        this.sUS = null;
        this.yiw = null;
        this.so = null;
    }

    protected final void icD() {
        try {
            vG.NB nb = this.icD;
            if (nb != null) {
                nb.icD(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void vG() {
        try {
            vG.icD icd = this.vG;
            if (icd != null) {
                icd.pvs(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void pvs(int i) {
        try {
            vG.pvs pvsVar = this.Jd;
            if (pvsVar != null) {
                pvsVar.pvs(this, i);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void Jd() {
        try {
            vG.sUS sus = this.NB;
            if (sus != null) {
                sus.vG(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void pvs(int i, int i2, int i3, int i4) {
        try {
            vG.yiw yiwVar = this.sUS;
            if (yiwVar != null) {
                yiwVar.pvs(this, i, i2, i3, i4);
            }
        } catch (Throwable unused) {
        }
    }

    protected final boolean pvs(int i, int i2) {
        try {
            vG.InterfaceC0019vG interfaceC0019vG = this.yiw;
            if (interfaceC0019vG != null) {
                if (interfaceC0019vG.pvs(this, i, i2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    protected final boolean icD(int i, int i2) {
        try {
            vG.Jd jd = this.so;
            if (jd != null) {
                if (jd.icD(this, i, i2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void pvs(boolean z) {
        this.pvs = z;
    }
}
