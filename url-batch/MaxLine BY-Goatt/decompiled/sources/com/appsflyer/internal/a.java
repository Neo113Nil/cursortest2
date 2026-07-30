package com.appsflyer.internal;

import android.hardware.SensorEvent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Object obj = this.o;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                ((AFa1dSDK) obj2).AFKeystoreWrapper((AFf1pSDK) obj);
                break;
            default:
                ((AFf1dSDK) obj2).AFKeystoreWrapper((SensorEvent) obj);
                break;
        }
    }
}
