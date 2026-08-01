package com.appsflyer;

import com.appsflyer.internal.AFh1ySDK;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFh1ySDK[] f2043e;

    public /* synthetic */ a(AFh1ySDK[] aFh1ySDKArr, int i3) {
        this.f2042d = i3;
        this.f2043e = aFh1ySDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2042d) {
            case 0:
                AFLogger.getMediationNetwork(this.f2043e);
                break;
            default:
                AFLogger.getCurrencyIso4217Code(this.f2043e);
                break;
        }
    }
}
