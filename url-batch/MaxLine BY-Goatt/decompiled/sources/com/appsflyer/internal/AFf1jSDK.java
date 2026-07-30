package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class AFf1jSDK extends Observable {
    public final String AFInAppEventParameterName;
    final Runnable AFInAppEventType;
    long AFLogger;
    public final String afInfoLog;
    public final Map<String, Object> AFKeystoreWrapper = new HashMap();
    public AFa1vSDK afRDLog = AFa1vSDK.NOT_STARTED;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFf1jSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements Observer {
        public AnonymousClass5() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFf1jSDK.this.AFInAppEventType.run();
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum AFa1vSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFf1jSDK(String str, String str2, Runnable runnable) {
        this.AFInAppEventType = runnable;
        this.AFInAppEventParameterName = str2;
        this.afInfoLog = str;
    }

    public final void AFInAppEventType() {
        this.AFKeystoreWrapper.put("source", this.AFInAppEventParameterName);
        this.AFKeystoreWrapper.put("type", this.afInfoLog);
        this.AFKeystoreWrapper.put("latency", Long.valueOf(System.currentTimeMillis() - this.AFLogger));
        this.afRDLog = AFa1vSDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void AFKeystoreWrapper(Context context);
}
