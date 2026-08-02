package com.startapp.sdk.internal;

import android.content.Intent;

/* loaded from: classes.dex */
public final class na implements wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa f7331a;

    public na(wa waVar) {
        this.f7331a = waVar;
    }

    @Override // com.startapp.sdk.internal.wf
    public final void a(String str) {
        wa waVar = this.f7331a;
        waVar.getClass();
        Intent intent = new Intent("com.startapp.android.ShowDisplayBroadcastListener");
        intent.putExtra("dParam", str);
        wb.a(waVar.f7658a).a(intent);
    }
}
