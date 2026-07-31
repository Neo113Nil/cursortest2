package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class ga implements Runnable {
    protected final fa callback;
    protected final Context context;
    protected final Bundle extras;

    public ga(Context context, fa faVar, Bundle bundle) {
        this.context = context;
        this.callback = faVar;
        this.extras = bundle;
    }

    public boolean runSync() {
        return false;
    }
}
