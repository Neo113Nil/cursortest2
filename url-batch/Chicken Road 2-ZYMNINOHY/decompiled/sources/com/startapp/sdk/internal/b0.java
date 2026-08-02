package com.startapp.sdk.internal;

import android.view.View;

/* loaded from: classes.dex */
public final class b0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f6690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.adinformation.a f6691b;

    public b0(com.startapp.sdk.adsbase.adinformation.a aVar, q qVar) {
        this.f6691b = aVar;
        this.f6690a = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = this.f6690a;
        com.startapp.sdk.adsbase.adinformation.a aVar = this.f6691b;
        qVar.a(aVar.f6348e, aVar.f6349f);
    }
}
