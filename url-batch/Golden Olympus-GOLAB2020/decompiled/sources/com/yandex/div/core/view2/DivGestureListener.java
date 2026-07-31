package com.yandex.div.core.view2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivGestureListener extends GestureDetector.SimpleOnGestureListener {
    private final boolean awaitLongClick;

    @Nullable
    private Function0<Unit> onDoubleTapListener;

    @Nullable
    private Function0<Unit> onSingleTapListener;

    public DivGestureListener(boolean z4) {
        this.awaitLongClick = z4;
    }

    @Nullable
    public final Function0<Unit> getOnDoubleTapListener() {
        return this.onDoubleTapListener;
    }

    @Nullable
    public final Function0<Unit> getOnSingleTapListener() {
        return this.onSingleTapListener;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@NotNull MotionEvent e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        Function0<Unit> function0 = this.onDoubleTapListener;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@NotNull MotionEvent e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.awaitLongClick) {
            return false;
        }
        return (this.onDoubleTapListener == null && this.onSingleTapListener == null) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(@NotNull MotionEvent e4) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.onDoubleTapListener == null || (function0 = this.onSingleTapListener) == null) {
            return false;
        }
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@NotNull MotionEvent e4) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.onDoubleTapListener != null || (function0 = this.onSingleTapListener) == null) {
            return false;
        }
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    public final void setOnDoubleTapListener(@Nullable Function0<Unit> function0) {
        this.onDoubleTapListener = function0;
    }

    public final void setOnSingleTapListener(@Nullable Function0<Unit> function0) {
        this.onSingleTapListener = function0;
    }
}
