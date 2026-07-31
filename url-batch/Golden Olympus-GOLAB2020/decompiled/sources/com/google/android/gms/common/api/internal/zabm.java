package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
final class zabm implements Runnable {
    final /* synthetic */ zabn zaa;

    zabm(zabn zabnVar) {
        this.zaa = zabnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        Api.Client client2;
        zabo zaboVar = this.zaa.zaa;
        client = zaboVar.zac;
        client2 = zaboVar.zac;
        client.disconnect(client2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
