package com.startapp.sdk.internal;

import android.view.MotionEvent;
import com.startapp.sdk.ads.list3d.List3DView;

/* loaded from: classes.dex */
public final class nb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f4199a;

    public nb(List3DView list3DView) {
        this.f4199a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4199a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 2, 0.0f, -20.0f, 0));
        this.f4199a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0f, -20.0f, 0));
    }
}
