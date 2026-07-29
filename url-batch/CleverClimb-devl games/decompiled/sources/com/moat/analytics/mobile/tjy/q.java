package com.moat.analytics.mobile.tjy;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f7296a;

    q(n nVar) {
        this.f7296a = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new r(this));
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }
}
