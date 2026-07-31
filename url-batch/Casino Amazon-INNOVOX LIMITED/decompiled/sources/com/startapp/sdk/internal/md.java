package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class md extends ga {
    public md(Context context, fa faVar, Bundle bundle) {
        super(context, faVar, bundle);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!MetaData.A().f0()) {
                this.callback.a();
                return;
            }
            eh ehVar = (eh) com.startapp.sdk.components.a.a(this.context).f.a();
            v7 v7Var = (v7) ehVar.b.a();
            v7Var.f464a.post(new yg(ehVar));
            n8 n8Var = new n8(o8.i);
            n8Var.j = true;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.T.f374a;
                if (aVar != null) {
                    ((d9) aVar.p.a()).a(n8Var);
                } else {
                    this.callback.a();
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
