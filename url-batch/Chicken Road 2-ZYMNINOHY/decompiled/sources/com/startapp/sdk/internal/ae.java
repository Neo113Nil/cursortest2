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
            vh vhVar = (vh) com.startapp.sdk.components.a.a(this.context).f6566g.a();
            k8 k8Var = (k8) vhVar.f7761b.a();
            k8Var.f7181a.post(new ph(vhVar));
            d9 d9Var = new d9(e9.f6843i);
            d9Var.f6798j = true;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f6540U.f7743a;
                if (aVar != null) {
                    ((t9) aVar.f6574q.a()).a(d9Var);
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
