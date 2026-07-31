package com.appsflyer.internal;

import android.content.Context;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes3.dex */
public abstract class AFi1pSDK extends Observable {
    final Runnable AFInAppEventParameterName;
    public final String AFInAppEventType;
    long AFLogger;
    public final String unregisterClient;
    public final Map<String, Object> values = new HashMap();
    public AFa1tSDK registerClient = AFa1tSDK.NOT_STARTED;

    public enum AFa1tSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public abstract void AFInAppEventType(Context context);

    public AFi1pSDK(String str, String str2, Runnable runnable) {
        this.AFInAppEventParameterName = runnable;
        this.AFInAppEventType = str2;
        this.unregisterClient = str;
    }

    /* renamed from: com.appsflyer.internal.AFi1pSDK$2, reason: invalid class name */
    final class AnonymousClass2 implements Observer {
        AnonymousClass2() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFi1pSDK.this.AFInAppEventParameterName.run();
        }
    }

    public final void AFKeystoreWrapper() {
        this.values.put("source", this.AFInAppEventType);
        this.values.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, this.unregisterClient);
        this.values.put("latency", Long.valueOf(System.currentTimeMillis() - this.AFLogger));
        this.registerClient = AFa1tSDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
