package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public class ae extends za {
    public ae(Context context, ya yaVar, Bundle bundle) {
        super(context, yaVar, bundle);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!MetaData.E().l0()) {
                this.callback.a();
                return;
            }
            vh vhVar = (vh) com.startapp.sdk.components.a.a(this.context).f3467g.a();
            k8 k8Var = (k8) vhVar.f4619b.a();
            k8Var.f4053a.post(new ph(vhVar));
            d9 d9Var = new d9(e9.f3728i);
            d9Var.f3685j = true;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f3442U.f4601a;
                if (aVar != null) {
                    ((t9) aVar.f3476q.a()).a(d9Var);
                } else {
                    this.callback.a();
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
