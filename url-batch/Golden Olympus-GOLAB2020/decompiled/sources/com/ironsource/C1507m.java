package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1507m implements wv {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f17127a;

    public C1507m(Activity activity) {
        this.f17127a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.wv
    public void a() {
        Activity activity = this.f17127a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
