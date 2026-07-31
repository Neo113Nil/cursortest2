package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class r7 extends t1 {
    public r7(Context context, sf sfVar) {
        super(context, sfVar);
    }

    @Override // com.startapp.sdk.internal.t1
    public final void a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis(MetaData.A().O().k());
            nf nfVar = new nf(this.f430a, this.b);
            this.c.postDelayed(new q7(this, nfVar), millis);
            nfVar.a();
        } catch (Throwable th) {
            n8.a(th);
            this.b.a(null);
        }
    }
}
