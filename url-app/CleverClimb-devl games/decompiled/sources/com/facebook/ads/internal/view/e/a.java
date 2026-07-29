package com.facebook.ads.internal.view.e;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final d f5638a;

    public a(Handler handler, d dVar) {
        super(handler);
        this.f5638a = dVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        this.f5638a.e();
    }
}
