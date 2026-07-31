package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class rd extends ga {
    protected static final String LOG_TAG = "rd";

    public rd(Context context, fa faVar, Bundle bundle) {
        super(context, faVar, bundle);
    }

    private void sendMetaDataRequest(Context context) {
        AdPreferences adPreferences = new AdPreferences();
        new qd(this, context, com.startapp.sdk.components.a.a(context).K, adPreferences, context, adPreferences).b();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            eh ehVar = (eh) com.startapp.sdk.components.a.a(this.context).f.a();
            v7 v7Var = (v7) ehVar.b.a();
            v7Var.f464a.post(new yg(ehVar));
            MetaData.c(this.context);
            if (MetaData.A().g0()) {
                sendMetaDataRequest(this.context);
            } else {
                this.callback.a();
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
