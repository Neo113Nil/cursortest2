package com.startapp.sdk.internal;

import android.view.MotionEvent;
import com.startapp.sdk.ads.list3d.List3DView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ua implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f452a;

    public ua(List3DView list3DView) {
        this.f452a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f452a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 2, 0.0f, -20.0f, 0));
        this.f452a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0f, -20.0f, 0));
    }
}
