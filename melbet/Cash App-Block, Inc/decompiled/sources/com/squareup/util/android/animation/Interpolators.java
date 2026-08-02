package com.squareup.util.android.animation;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public abstract class Interpolators {
    public static final AccelerateInterpolator ACCEL = new AccelerateInterpolator();
    public static final AccelerateDecelerateInterpolator ACCEL_DECEL = new AccelerateDecelerateInterpolator();
    public static final DecelerateInterpolator DECEL = new DecelerateInterpolator();

    static {
        new LinearInterpolator();
        new PathInterpolator(0.42f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
        new PathInterpolator(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.58f, 1.0f);
        new PathInterpolator(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        new PathInterpolator(0.42f, RecyclerView.DECELERATION_RATE, 0.58f, 1.0f);
    }
}
