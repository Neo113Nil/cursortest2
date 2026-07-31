package com.startapp.sdk.internal;

import android.content.Intent;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class u9 implements ef {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da f451a;

    public u9(da daVar) {
        this.f451a = daVar;
    }

    @Override // com.startapp.sdk.internal.ef
    public final void a(String str) {
        da daVar = this.f451a;
        Intent intent = new Intent("com.startapp.android.ShowDisplayBroadcastListener");
        intent.putExtra("dParam", str);
        db.a(daVar.f248a).a(intent);
    }
}
