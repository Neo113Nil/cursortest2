package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* loaded from: classes.dex */
public final class fc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic f6912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MetaDataRequest$RequestReason f6913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6914c;

    public fc(ic icVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        this.f6912a = icVar;
        this.f6913b = metaDataRequest$RequestReason;
        this.f6914c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6912a.a(this.f6913b, this.f6914c);
    }
}
