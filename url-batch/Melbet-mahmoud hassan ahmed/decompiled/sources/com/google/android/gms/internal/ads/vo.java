package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* loaded from: classes.dex */
final class vo implements ValueCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wo f13465a;

    vo(wo woVar) {
        this.f13465a = woVar;
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onReceiveValue(String str) {
        wo woVar = this.f13465a;
        woVar.f13893j.d(woVar.f13890g, woVar.f13891h, str, woVar.f13892i);
    }
}
