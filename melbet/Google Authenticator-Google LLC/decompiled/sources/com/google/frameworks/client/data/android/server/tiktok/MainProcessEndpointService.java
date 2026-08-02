package com.google.frameworks.client.data.android.server.tiktok;

import android.content.Intent;
import android.os.IBinder;
import defpackage.ifz;
import defpackage.igf;
import defpackage.ixa;
import defpackage.kcf;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MainProcessEndpointService extends igf {
    public ifz a;
    public kcf b;

    @Override // defpackage.aeu, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return this.a.a();
    }

    @Override // defpackage.igf, defpackage.aeu, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a.b(ixa.e(new HashMap()), this.b);
    }
}
