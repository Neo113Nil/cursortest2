package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* loaded from: classes.dex */
public final class fc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic f3794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MetaDataRequest$RequestReason f3795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3796c;

    public fc(ic icVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        this.f3794a = icVar;
        this.f3795b = metaDataRequest$RequestReason;
        this.f3796c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3794a.a(this.f3795b, this.f3796c);
    }
}
