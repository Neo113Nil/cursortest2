package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes.dex */
public abstract class AFj1zSDK extends Observable {
    public final String AFAdRevenueData;
    long areAllFieldsValid;
    public final String component4;
    final Runnable getRevenue;
    public final Map<String, Object> getCurrencyIso4217Code = new HashMap();
    public AFa1ySDK component2 = AFa1ySDK.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.AFj1zSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Observer {
        public AnonymousClass3() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1zSDK.this.getRevenue.run();
        }
    }

    public enum AFa1ySDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFj1zSDK(String str, String str2, Runnable runnable) {
        this.getRevenue = runnable;
        this.AFAdRevenueData = str2;
        this.component4 = str;
    }

    public final void getCurrencyIso4217Code() {
        this.getCurrencyIso4217Code.put("source", this.AFAdRevenueData);
        this.getCurrencyIso4217Code.put(com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_KEY, this.component4);
        getRevenue();
        this.component2 = AFa1ySDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void getMonetizationNetwork(Context context);

    public void getRevenue() {
        this.getCurrencyIso4217Code.put("latency", Long.valueOf(System.currentTimeMillis() - this.areAllFieldsValid));
    }
}
