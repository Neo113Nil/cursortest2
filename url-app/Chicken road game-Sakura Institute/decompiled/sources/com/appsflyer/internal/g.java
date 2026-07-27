package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5990e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5991i;

    public /* synthetic */ g(Object obj, int i2, Object obj2) {
        this.f5989d = i2;
        this.f5990e = obj;
        this.f5991i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5989d) {
            case 0:
                AFd1ySDK.AFInAppEventParameterName((AFd1ySDK) this.f5990e, (AFh1xSDK) this.f5991i);
                break;
            case 1:
                ((AFi1dSDK) this.f5990e).AFKeystoreWrapper((SensorEvent) this.f5991i);
                break;
            case 2:
                AFi1jSDK.AFKeystoreWrapper((AFi1jSDK) this.f5990e, (Context) this.f5991i);
                break;
            default:
                ((AFi1nSDK) this.f5990e).valueOf((Context) this.f5991i);
                break;
        }
    }
}
