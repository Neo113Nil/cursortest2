package com.facebook.ads.internal.p.a;

/* loaded from: classes.dex */
public class k extends l {
    public k(String str, p pVar) {
        super(str, null);
        this.f5301b = j.POST;
        this.f5300a = str;
        this.f5302c = "application/x-www-form-urlencoded;charset=UTF-8";
        if (pVar != null) {
            this.f5303d = pVar.b();
        }
    }

    public k(String str, p pVar, String str2, byte[] bArr) {
        super(str, pVar);
        this.f5301b = j.POST;
        this.f5302c = str2;
        this.f5303d = bArr;
    }
}
