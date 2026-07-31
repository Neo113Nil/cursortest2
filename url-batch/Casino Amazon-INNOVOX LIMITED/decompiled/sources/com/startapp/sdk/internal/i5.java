package com.startapp.sdk.internal;

import android.content.Context;
import java.io.File;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class i5 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f272a;
    public final /* synthetic */ com.startapp.sdk.components.a b;

    public i5(com.startapp.sdk.components.a aVar, Context context) {
        this.b = aVar;
        this.f272a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new hc(this.b.D, new File(this.f272a.getCacheDir(), "StartApp-68962b1486d766d9"), new h5());
    }
}
