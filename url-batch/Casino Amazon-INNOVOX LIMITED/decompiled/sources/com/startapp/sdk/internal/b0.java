package com.startapp.sdk.internal;

import android.view.View;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f175a;
    public final /* synthetic */ com.startapp.sdk.adsbase.adinformation.a b;

    public b0(com.startapp.sdk.adsbase.adinformation.a aVar, q qVar) {
        this.b = aVar;
        this.f175a = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = this.f175a;
        com.startapp.sdk.adsbase.adinformation.a aVar = this.b;
        qVar.a(aVar.e, aVar.f);
    }
}
