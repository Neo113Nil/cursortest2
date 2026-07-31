package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class hh extends GestureDetector.SimpleOnGestureListener {
    public final GestureDetector a;
    public boolean b;

    public hh(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.b = true;
        return super.onSingleTapUp(e);
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.a.onTouchEvent(event);
    }

    public final void b() {
        this.b = false;
    }
}
