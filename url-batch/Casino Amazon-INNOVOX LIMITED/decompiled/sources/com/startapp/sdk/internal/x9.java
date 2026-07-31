package com.startapp.sdk.internal;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class x9 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da f494a;

    public x9(da daVar) {
        this.f494a = daVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f494a.y = true;
        return false;
    }
}
