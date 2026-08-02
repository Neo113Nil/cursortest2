package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public class fe extends za {
    protected static final String LOG_TAG = "fe";

    public fe(Context context, ya yaVar, Bundle bundle) {
        super(context, yaVar, bundle);
    }

    private void sendMetaDataRequest(Context context) {
        AdPreferences adPreferences = new AdPreferences();
        new ee(this, context, com.startapp.sdk.components.a.a(context).f6551K, adPreferences, context, adPreferences).b();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            vh vhVar = (vh) com.startapp.sdk.components.a.a(this.context).f6566g.a();
            k8 k8Var = (k8) vhVar.f7761b.a();
            k8Var.f7181a.post(new ph(vhVar));
            MetaData.c(this.context);
            if (MetaData.E().m0()) {
                sendMetaDataRequest(this.context);
            } else {
                this.callback.a();
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
