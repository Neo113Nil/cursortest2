package com.google.firebase.messaging;

import com.google.firebase.messaging.WithinAppServiceConnection;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ i(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                ((SharedPreferencesQueue) obj).syncState();
                break;
            default:
                ((WithinAppServiceConnection.BindRequest) obj).lambda$arrangeTimeout$0();
                break;
        }
    }
}
