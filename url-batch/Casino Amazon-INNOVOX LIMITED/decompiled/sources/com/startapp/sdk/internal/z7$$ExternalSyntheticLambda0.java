package com.startapp.sdk.internal;

import java.net.HttpURLConnection;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ HttpURLConnection f$0;

    public /* synthetic */ z7$$ExternalSyntheticLambda0(HttpURLConnection httpURLConnection) {
        this.f$0 = httpURLConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.disconnect();
    }
}
