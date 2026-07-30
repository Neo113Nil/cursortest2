package com.baidu.ar;

import com.baidu.ar.cloud.ICloudIRResult;

/* loaded from: classes.dex */
public class h2 implements ICloudIRResult {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2354a;

    /* renamed from: b, reason: collision with root package name */
    public String f2355b;

    /* renamed from: c, reason: collision with root package name */
    public int f2356c;

    /* renamed from: d, reason: collision with root package name */
    public String f2357d;

    @Override // com.baidu.ar.cloud.ICloudIRResult
    public String getARKey() {
        return this.f2355b;
    }

    @Override // com.baidu.ar.cloud.ICloudIRResult
    public int getARType() {
        return this.f2356c;
    }

    @Override // com.baidu.ar.cloud.ICloudIRResult
    public String getMessage() {
        return this.f2357d;
    }

    @Override // com.baidu.ar.cloud.ICloudIRResult
    public boolean isSuccess() {
        return this.f2354a;
    }
}
