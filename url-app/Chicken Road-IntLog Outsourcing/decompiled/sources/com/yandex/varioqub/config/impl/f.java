package com.yandex.varioqub.config.impl;

import android.util.Log;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;

/* loaded from: classes.dex */
public final class f implements AdapterIdentifiersCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5415a;

    public f(g gVar) {
        this.f5415a = gVar;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(String str) {
        this.f5415a.f5417b.countDown();
        this.f5415a.getClass();
        boolean z = C.f5392a;
        if (z && z) {
            Log.e("Varioqub/Varioqub/IdentifierProvider", str, null);
        }
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(String str) {
        this.f5415a.getClass();
        String str2 = "received userId from adapter - " + str;
        if (C.f5392a) {
            Log.d("Varioqub/IdentifierProvider", str2);
        }
        g gVar = this.f5415a;
        gVar.f5418c = str;
        gVar.f5417b.countDown();
    }
}
