package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class co implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View.OnClickListener f24271a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24272b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24273c;

    /* renamed from: d, reason: collision with root package name */
    private float f24274d;

    /* renamed from: e, reason: collision with root package name */
    private float f24275e;

    public co(@NotNull Context context, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f24271a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f24272b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f24271a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int i4 = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i4 == 0) {
            this.f24274d = x4;
            this.f24275e = y4;
            this.f24273c = true;
            return false;
        }
        if (i4 == 1) {
            if (this.f24273c) {
                this.f24271a.onClick(view);
            }
            return true;
        }
        if (i4 != 2) {
            if (i4 == 3) {
                this.f24273c = false;
                return false;
            }
        } else if (this.f24273c) {
            int i5 = (int) (x4 - this.f24274d);
            int i6 = (int) (y4 - this.f24275e);
            if ((i6 * i6) + (i5 * i5) > this.f24272b) {
                this.f24273c = false;
            }
        }
        return false;
    }
}
