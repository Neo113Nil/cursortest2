package com.baidu.ar;

import com.baidu.ar.recg.IOnDeviceIRResult;

/* loaded from: classes.dex */
public class va implements IOnDeviceIRResult {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3456a;

    /* renamed from: b, reason: collision with root package name */
    public String f3457b;

    /* renamed from: c, reason: collision with root package name */
    public int f3458c;

    /* renamed from: d, reason: collision with root package name */
    public String f3459d;

    @Override // com.baidu.ar.recg.IOnDeviceIRResult
    public String getARKey() {
        return this.f3457b;
    }

    @Override // com.baidu.ar.recg.IOnDeviceIRResult
    public int getARType() {
        return this.f3458c;
    }

    @Override // com.baidu.ar.recg.IOnDeviceIRResult
    public String getMessage() {
        return this.f3459d;
    }

    @Override // com.baidu.ar.recg.IOnDeviceIRResult
    public boolean isSuccess() {
        return this.f3456a;
    }
}
