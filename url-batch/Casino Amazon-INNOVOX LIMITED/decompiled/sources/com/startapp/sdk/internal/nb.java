package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class nb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qb f349a;
    public final /* synthetic */ MetaDataRequest$RequestReason b;
    public final /* synthetic */ boolean c;

    public nb(qb qbVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        this.f349a = qbVar;
        this.b = metaDataRequest$RequestReason;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f349a.a(this.b, this.c);
    }
}
