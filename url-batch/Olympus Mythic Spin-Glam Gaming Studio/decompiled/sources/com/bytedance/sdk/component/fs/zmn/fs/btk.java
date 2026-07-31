package com.bytedance.sdk.component.fs.zmn.fs;

/* loaded from: classes5.dex */
final class btk {
    boolean btk;
    boolean fb;
    int fs;
    btk hhw;
    btk nps;
    final byte[] zmn;
    int zn;

    btk() {
        this.zmn = new byte[8192];
        this.btk = true;
        this.fb = false;
    }

    btk(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.zmn = bArr;
        this.fs = i;
        this.zn = i2;
        this.fb = z;
        this.btk = z2;
    }

    final btk zmn() {
        this.fb = true;
        return new btk(this.zmn, this.fs, this.zn, true, false);
    }

    public final btk fs() {
        btk btkVar = this.hhw;
        btk btkVar2 = btkVar != this ? btkVar : null;
        btk btkVar3 = this.nps;
        if (btkVar3 != null) {
            btkVar3.hhw = btkVar;
        }
        btk btkVar4 = this.hhw;
        if (btkVar4 != null) {
            btkVar4.nps = btkVar3;
        }
        this.hhw = null;
        this.nps = null;
        return btkVar2;
    }

    public final btk zmn(btk btkVar) {
        btkVar.nps = this;
        btkVar.hhw = this.hhw;
        this.hhw.nps = btkVar;
        this.hhw = btkVar;
        return btkVar;
    }
}
