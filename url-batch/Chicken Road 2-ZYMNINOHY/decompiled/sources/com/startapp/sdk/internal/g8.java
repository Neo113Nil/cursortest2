package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g8 extends x1 {
    public g8(Context context, jg jgVar) {
        super(context, jgVar);
    }

    @Override // com.startapp.sdk.internal.x1
    public final void a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis(MetaData.E().T().k());
            eg egVar = new eg(this.f7851a, this.f7852b);
            this.f7853c.postDelayed(new f8(this, egVar), millis);
            egVar.a();
        } catch (Throwable th) {
            d9.a(th);
            this.f7852b.a(null);
        }
    }
}
