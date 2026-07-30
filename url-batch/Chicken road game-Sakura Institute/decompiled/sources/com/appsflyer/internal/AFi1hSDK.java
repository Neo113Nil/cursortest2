package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes3.dex */
public abstract class AFi1hSDK extends Observable {
    final Runnable AFKeystoreWrapper;
    public final String d;
    long e;
    public final String values;
    public final Map<String, Object> AFInAppEventParameterName = new HashMap();
    public AFa1ySDK unregisterClient = AFa1ySDK.NOT_STARTED;

    public enum AFa1ySDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public abstract void values(Context context);

    public AFi1hSDK(String str, String str2, Runnable runnable) {
        this.AFKeystoreWrapper = runnable;
        this.values = str2;
        this.d = str;
    }

    /* renamed from: com.appsflyer.internal.AFi1hSDK$1, reason: invalid class name */
    final class AnonymousClass1 implements Observer {
        AnonymousClass1() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFi1hSDK.this.AFKeystoreWrapper.run();
        }
    }

    public final void values() {
        this.AFInAppEventParameterName.put("source", this.values);
        this.AFInAppEventParameterName.put("type", this.d);
        this.AFInAppEventParameterName.put("latency", Long.valueOf(System.currentTimeMillis() - this.e));
        this.unregisterClient = AFa1ySDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
