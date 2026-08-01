package com.bytedance.sdk.component.icD.pvs;

/* compiled from: RequestBody.java */
/* loaded from: classes.dex */
public class IP {
    public String Jd;
    public byte[] NB;
    public pvs sUS;
    public Mxy vG;

    /* compiled from: RequestBody.java */
    public enum pvs {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public IP() {
    }

    public String pvs() {
        return this.Jd;
    }

    public IP(Mxy mxy, String str, pvs pvsVar) {
        this.vG = mxy;
        this.Jd = str;
        this.sUS = pvsVar;
    }

    public IP(Mxy mxy, byte[] bArr, pvs pvsVar) {
        this.vG = mxy;
        this.NB = bArr;
        this.sUS = pvsVar;
    }

    public static IP pvs(Mxy mxy, String str) {
        return new IP(mxy, str, pvs.STRING_TYPE);
    }

    public static IP pvs(Mxy mxy, byte[] bArr) {
        return new IP(mxy, bArr, pvs.BYTE_ARRAY_TYPE);
    }
}
