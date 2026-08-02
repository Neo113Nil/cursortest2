package com.startapp.sdk.internal;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class qa implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa f7492a;

    public qa(wa waVar) {
        this.f7492a = waVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f7492a.f7834y = true;
        return false;
    }
}
