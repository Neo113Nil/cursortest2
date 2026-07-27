package com.appsflyer;

import com.appsflyer.internal.AFg1fSDK;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFg1fSDK[] f5845e;

    public /* synthetic */ a(AFg1fSDK[] aFg1fSDKArr, int i2) {
        this.f5844d = i2;
        this.f5845e = aFg1fSDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5844d) {
            case 0:
                AFLogger.valueOf(this.f5845e);
                break;
            default:
                AFLogger.AFInAppEventType(this.f5845e);
                break;
        }
    }
}
