package com.yandex.varioqub.config.impl;

import android.util.Log;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;

/* loaded from: classes.dex */
public final class e implements AdapterIdentifiersCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5414a;

    public e(g gVar) {
        this.f5414a = gVar;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(String str) {
        this.f5414a.getClass();
        boolean z = C.f5392a;
        if (z && z) {
            Log.e("Varioqub/Varioqub/IdentifierProvider", str, null);
        }
        l.a(3);
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(String str) {
        this.f5414a.getClass();
        String str2 = "received deviceId from adapter - " + str;
        if (C.f5392a) {
            Log.d("Varioqub/IdentifierProvider", str2);
        }
        this.f5414a.f5419d = str;
        l.a(3);
    }
}
