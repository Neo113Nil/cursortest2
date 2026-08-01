package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2079e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2080i;

    public /* synthetic */ g(int i3, Object obj, Object obj2) {
        this.f2078d = i3;
        this.f2079e = obj;
        this.f2080i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2078d) {
            case 0:
                AFb1iSDK.getMonetizationNetwork((AFb1iSDK) this.f2079e, (AFh1qSDK) this.f2080i);
                break;
            case 1:
                ((AFa1ySDK) this.f2079e).getCurrencyIso4217Code((AFh1mSDK) this.f2080i);
                break;
            case 2:
                ((AFj1nSDK) this.f2079e).G_((SensorEvent) this.f2080i);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                AFj1rSDK.getRevenue((AFj1rSDK) this.f2079e, (Context) this.f2080i);
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ((AFj1wSDK) this.f2079e).getRevenue((Context) this.f2080i);
                break;
            default:
                AFj1ySDK.getMonetizationNetwork((AFj1ySDK) this.f2079e, (Context) this.f2080i);
                break;
        }
    }
}
