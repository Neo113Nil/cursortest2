package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4327e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4328i;

    public /* synthetic */ g(Object obj, int i2, Object obj2) {
        this.f4326d = i2;
        this.f4327e = obj;
        this.f4328i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4326d) {
            case 0:
                AFb1lSDK.getCurrencyIso4217Code((AFb1lSDK) this.f4327e, (AFh1oSDK) this.f4328i);
                break;
            case 1:
                ((AFa1tSDK) this.f4327e).getMediationNetwork((AFh1sSDK) this.f4328i);
                break;
            case 2:
                ((AFi1aSDK) this.f4327e).AFAdRevenueData((Context) this.f4328i);
                break;
            case 3:
                ((AFi1eSDK) this.f4327e).getRevenue((Context) this.f4328i);
                break;
            case 4:
                AFj1qSDK.AFAdRevenueData((AFj1qSDK) this.f4327e, (Context) this.f4328i);
                break;
            case 5:
                ((AFj1tSDK) this.f4327e).G_((SensorEvent) this.f4328i);
                break;
            default:
                AFj1xSDK.AFAdRevenueData((AFj1xSDK) this.f4327e, (Context) this.f4328i);
                break;
        }
    }
}
