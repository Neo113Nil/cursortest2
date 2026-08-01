package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class AFj1tSDK extends Observable {
    public final String areAllFieldsValid;
    long component1;
    public final String component3;
    final Runnable getRevenue;
    public final Map<String, Object> getMediationNetwork = new HashMap();
    public AFa1tSDK component4 = AFa1tSDK.NOT_STARTED;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.appsflyer.internal.AFj1tSDK$1, reason: invalid class name */
    public class AnonymousClass1 implements Observer {
        public AnonymousClass1() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1tSDK.this.getRevenue.run();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public enum AFa1tSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFj1tSDK(String str, String str2, Runnable runnable) {
        this.getRevenue = runnable;
        this.component3 = str2;
        this.areAllFieldsValid = str;
    }

    public void AFAdRevenueData() {
        this.getMediationNetwork.put("latency", Long.valueOf(System.currentTimeMillis() - this.component1));
    }

    public final void getMediationNetwork() {
        this.getMediationNetwork.put("source", this.component3);
        this.getMediationNetwork.put(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, this.areAllFieldsValid);
        AFAdRevenueData();
        this.component4 = AFa1tSDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void getMonetizationNetwork(Context context);
}
