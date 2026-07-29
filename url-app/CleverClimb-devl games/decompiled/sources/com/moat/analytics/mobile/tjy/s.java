package com.moat.analytics.mobile.tjy;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f7298a;

    s(n nVar) {
        this.f7298a = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new t(this));
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }
}
