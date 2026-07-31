package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class bd extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cd f184a;

    public bd(cd cdVar) {
        this.f184a = cdVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        List list;
        network.getClass();
        cd cdVar = this.f184a;
        synchronized (cdVar.b) {
            list = CollectionsKt.toList(cdVar.c);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zc) it.next()).a();
        }
    }
}
