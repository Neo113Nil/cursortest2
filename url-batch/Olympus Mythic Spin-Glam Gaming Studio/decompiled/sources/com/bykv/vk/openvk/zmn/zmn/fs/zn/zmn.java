package com.bykv.vk.openvk.zmn.zmn.fs.zn;

import com.bykv.vk.openvk.zmn.zmn.fs.zn.zn;

/* loaded from: classes4.dex */
public abstract class zmn implements zn {
    private zn.hhw btk;
    private zn.zmn fb;
    private zn.btk fs;
    private zn.nps hhw;
    private zn.InterfaceC0100zn nps;
    private zn.fb zg;
    protected boolean zmn = false;
    private zn.fs zn;

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public final void zmn(zn.btk btkVar) {
        this.fs = btkVar;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public final void zmn(zn.fs fsVar) {
        this.zn = fsVar;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public final void zmn(zn.zmn zmnVar) {
        this.fb = zmnVar;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public final void zmn(zn.hhw hhwVar) {
        this.btk = hhwVar;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public final void zmn(zn.InterfaceC0100zn interfaceC0100zn) {
        this.nps = interfaceC0100zn;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public final void zmn(zn.fb fbVar) {
        this.zg = fbVar;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public final void zmn(zn.nps npsVar) {
        this.hhw = npsVar;
    }

    public void zmn() {
        this.fs = null;
        this.fb = null;
        this.zn = null;
        this.btk = null;
        this.hhw = null;
        this.nps = null;
        this.zg = null;
    }

    protected final void fs() {
        try {
            zn.btk btkVar = this.fs;
            if (btkVar != null) {
                btkVar.fs(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void zn() {
        try {
            zn.fs fsVar = this.zn;
            if (fsVar != null) {
                fsVar.zmn(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void zmn(int i) {
        try {
            zn.zmn zmnVar = this.fb;
            if (zmnVar != null) {
                zmnVar.zmn(this, i);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void fb() {
        try {
            zn.hhw hhwVar = this.btk;
            if (hhwVar != null) {
                hhwVar.zn(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void zmn(int i, int i2, int i3, int i4) {
        try {
            zn.nps npsVar = this.hhw;
            if (npsVar != null) {
                npsVar.zmn(this, i, i2, i3, i4);
            }
        } catch (Throwable unused) {
        }
    }

    protected final boolean zmn(int i, int i2) {
        try {
            zn.InterfaceC0100zn interfaceC0100zn = this.nps;
            if (interfaceC0100zn != null) {
                if (interfaceC0100zn.zmn(this, i, i2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    protected final boolean fs(int i, int i2) {
        try {
            zn.fb fbVar = this.zg;
            if (fbVar != null) {
                if (fbVar.fs(this, i, i2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void zmn(boolean z) {
        this.zmn = z;
    }
}
