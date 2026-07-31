package com.chartboost.sdk.impl;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends GestureDetector.SimpleOnGestureListener {
    public final float a;
    public final Function2 b;
    public boolean c;

    public n(float f, Function2 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.a = f;
        this.b = onClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.c = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        this.c = ((float) Math.hypot((double) f, (double) f2)) > this.a;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.c) {
            return false;
        }
        this.b.invoke(Float.valueOf(e.getX()), Float.valueOf(e.getY()));
        return true;
    }

    public /* synthetic */ n(float f, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 10.0f : f, function2);
    }
}
