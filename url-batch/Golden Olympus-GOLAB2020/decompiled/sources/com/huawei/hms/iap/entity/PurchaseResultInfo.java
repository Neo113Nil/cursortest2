package com.huawei.hms.iap.entity;

/* loaded from: classes.dex */
public class PurchaseResultInfo {

    /* renamed from: a, reason: collision with root package name */
    private int f14250a;

    /* renamed from: b, reason: collision with root package name */
    private String f14251b;

    /* renamed from: c, reason: collision with root package name */
    private String f14252c;

    /* renamed from: d, reason: collision with root package name */
    private String f14253d;

    /* renamed from: e, reason: collision with root package name */
    private String f14254e;

    public String getErrMsg() {
        return this.f14253d;
    }

    public String getInAppDataSignature() {
        return this.f14252c;
    }

    public String getInAppPurchaseData() {
        return this.f14251b;
    }

    public int getReturnCode() {
        return this.f14250a;
    }

    public String getSignatureAlgorithm() {
        return this.f14254e;
    }

    public void setErrMsg(String str) {
        this.f14253d = str;
    }

    public void setInAppDataSignature(String str) {
        this.f14252c = str;
    }

    public void setInAppPurchaseData(String str) {
        this.f14251b = str;
    }

    public void setReturnCode(int i4) {
        this.f14250a = i4;
    }

    public void setSignatureAlgorithm(String str) {
        this.f14254e = str;
    }
}
