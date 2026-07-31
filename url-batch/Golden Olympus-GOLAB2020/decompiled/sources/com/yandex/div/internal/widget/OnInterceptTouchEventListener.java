package com.yandex.div.internal.widget;

import android.view.MotionEvent;
import android.view.ViewGroup;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface OnInterceptTouchEventListener {
    boolean onInterceptTouchEvent(@NotNull ViewGroup viewGroup, @NotNull MotionEvent motionEvent);
}
