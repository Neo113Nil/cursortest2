package com.appsflyer;

import com.appsflyer.internal.AFg1hSDK;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFg1hSDK[] f4288e;

    public /* synthetic */ a(AFg1hSDK[] aFg1hSDKArr, int i2) {
        this.f4287d = i2;
        this.f4288e = aFg1hSDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4287d) {
            case 0:
                AFLogger.getMediationNetwork(this.f4288e);
                break;
            default:
                AFLogger.getMonetizationNetwork(this.f4288e);
                break;
        }
    }
}
