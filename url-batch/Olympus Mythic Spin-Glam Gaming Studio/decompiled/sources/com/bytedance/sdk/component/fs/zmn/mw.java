package com.bytedance.sdk.component.fs.zmn;

/* loaded from: classes14.dex */
public class mw {
    public byte[] btk;
    public String fb;
    public zmn hhw;
    public bvs zn;

    public enum zmn {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public mw() {
    }

    public mw(bvs bvsVar, String str, zmn zmnVar) {
        this.zn = bvsVar;
        this.fb = str;
        this.hhw = zmnVar;
    }

    public mw(bvs bvsVar, byte[] bArr, zmn zmnVar) {
        this.zn = bvsVar;
        this.btk = bArr;
        this.hhw = zmnVar;
    }

    public static mw zmn(bvs bvsVar, String str) {
        return new mw(bvsVar, str, zmn.STRING_TYPE);
    }

    public static mw zmn(bvs bvsVar, byte[] bArr) {
        return new mw(bvsVar, bArr, zmn.BYTE_ARRAY_TYPE);
    }
}
