package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ViewUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private static final float MIN_SCALE = 0.9f;

    @Nullable
    private float[] expandedCornerRadii;

    @Nullable
    private Rect initialHideFromClipBounds;

    @Nullable
    private Rect initialHideToClipBounds;
    private float initialTouchY;
    private final float maxTranslationY;
    private final float minEdgeGap;

    public MaterialMainContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.minEdgeGap = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.maxTranslationY = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r0 = r13.view.getRootWindowInsets();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float[] calculateExpandedCornerRadii() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || rootWindowInsets == null) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        DisplayMetrics displayMetrics = this.view.getResources().getDisplayMetrics();
        int i8 = displayMetrics.widthPixels;
        int i9 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        this.view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        int roundedCornerRadius = (i10 == 0 && i11 == 0) ? getRoundedCornerRadius(rootWindowInsets, 0) : 0;
        int i12 = width + i10;
        float f8 = roundedCornerRadius;
        float roundedCornerRadius2 = (i12 < i8 || i11 != 0) ? 0 : getRoundedCornerRadius(rootWindowInsets, 1);
        float roundedCornerRadius3 = (i12 < i8 || i11 + height < i9) ? 0 : getRoundedCornerRadius(rootWindowInsets, 2);
        float roundedCornerRadius4 = (i10 != 0 || i11 + height < i9) ? 0 : getRoundedCornerRadius(rootWindowInsets, 3);
        return new float[]{f8, f8, roundedCornerRadius2, roundedCornerRadius2, roundedCornerRadius3, roundedCornerRadius3, roundedCornerRadius4, roundedCornerRadius4};
    }

    @NonNull
    private ValueAnimator createCornerAnimator(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: com.google.android.material.motion.c
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f8, Object obj, Object obj2) {
                Object lambda$createCornerAnimator$0;
                lambda$createCornerAnimator$0 = MaterialMainContainerBackHelper.lambda$createCornerAnimator$0(f8, obj, obj2);
                return lambda$createCornerAnimator$0;
            }
        }, clippableRoundedCornerLayout.getCornerRadii(), getExpandedCornerRadii());
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.motion.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$1(ClippableRoundedCornerLayout.this, valueAnimator);
            }
        });
        return ofObject;
    }

    @NonNull
    private AnimatorSet createResetScaleAndTranslationAnimator(@Nullable final View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialMainContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view2 = view;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    @RequiresApi(31)
    private int getRoundedCornerRadius(WindowInsets windowInsets, int i8) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = windowInsets.getRoundedCorner(i8);
        if (roundedCorner == null) {
            return 0;
        }
        radius = roundedCorner.getRadius();
        return radius;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$createCornerAnimator$0(float f8, Object obj, Object obj2) {
        return lerpCornerRadii((float[]) obj, (float[]) obj2, f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createCornerAnimator$1(ClippableRoundedCornerLayout clippableRoundedCornerLayout, ValueAnimator valueAnimator) {
        clippableRoundedCornerLayout.updateCornerRadii((float[]) valueAnimator.getAnimatedValue());
    }

    private static float[] lerpCornerRadii(float[] fArr, float[] fArr2, float f8) {
        return new float[]{AnimationUtils.lerp(fArr[0], fArr2[0], f8), AnimationUtils.lerp(fArr[1], fArr2[1], f8), AnimationUtils.lerp(fArr[2], fArr2[2], f8), AnimationUtils.lerp(fArr[3], fArr2[3], f8), AnimationUtils.lerp(fArr[4], fArr2[4], f8), AnimationUtils.lerp(fArr[5], fArr2[5], f8), AnimationUtils.lerp(fArr[6], fArr2[6], f8), AnimationUtils.lerp(fArr[7], fArr2[7], f8)};
    }

    private void resetInitialValues() {
        this.initialTouchY = 0.0f;
        this.initialHideToClipBounds = null;
        this.initialHideFromClipBounds = null;
    }

    public void cancelBackProgress(@Nullable View view) {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet createResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view);
        V v7 = this.view;
        if (v7 instanceof ClippableRoundedCornerLayout) {
            createResetScaleAndTranslationAnimator.playTogether(createCornerAnimator((ClippableRoundedCornerLayout) v7));
        }
        createResetScaleAndTranslationAnimator.setDuration(this.cancelDuration);
        createResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    public void clearExpandedCornerRadii() {
        this.expandedCornerRadii = null;
    }

    public void finishBackProgress(long j8, @Nullable View view) {
        AnimatorSet createResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view);
        createResetScaleAndTranslationAnimator.setDuration(j8);
        createResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    @NonNull
    public float[] getExpandedCornerRadii() {
        if (this.expandedCornerRadii == null) {
            this.expandedCornerRadii = calculateExpandedCornerRadii();
        }
        return this.expandedCornerRadii;
    }

    @Nullable
    public Rect getInitialHideFromClipBounds() {
        return this.initialHideFromClipBounds;
    }

    @Nullable
    public Rect getInitialHideToClipBounds() {
        return this.initialHideToClipBounds;
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat, @Nullable View view) {
        super.onStartBackProgress(backEventCompat);
        startBackProgress(backEventCompat.getTouchY(), view);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @Nullable View view, float f8) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, backEventCompat.getTouchY(), f8);
    }

    @VisibleForTesting
    public void startBackProgress(float f8, @Nullable View view) {
        this.initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.view);
        if (view != null) {
            this.initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.view, view);
        }
        this.initialTouchY = f8;
    }

    @VisibleForTesting
    public void updateBackProgress(float f8, boolean z7, float f9, float f10) {
        float interpolateProgress = interpolateProgress(f8);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float lerp = AnimationUtils.lerp(1.0f, MIN_SCALE, interpolateProgress);
        float lerp2 = AnimationUtils.lerp(0.0f, Math.max(0.0f, ((width - (MIN_SCALE * width)) / 2.0f) - this.minEdgeGap), interpolateProgress) * (z7 ? 1 : -1);
        float min = Math.min(Math.max(0.0f, ((height - (lerp * height)) / 2.0f) - this.minEdgeGap), this.maxTranslationY);
        float f11 = f9 - this.initialTouchY;
        float lerp3 = AnimationUtils.lerp(0.0f, min, Math.abs(f11) / height) * Math.signum(f11);
        if (Float.isNaN(lerp) || Float.isNaN(lerp2) || Float.isNaN(lerp3)) {
            return;
        }
        this.view.setScaleX(lerp);
        this.view.setScaleY(lerp);
        this.view.setTranslationX(lerp2);
        this.view.setTranslationY(lerp3);
        V v7 = this.view;
        if (v7 instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) v7).updateCornerRadii(lerpCornerRadii(getExpandedCornerRadii(), f10, interpolateProgress));
        }
    }

    private static float[] lerpCornerRadii(float[] fArr, float f8, float f9) {
        return new float[]{AnimationUtils.lerp(fArr[0], f8, f9), AnimationUtils.lerp(fArr[1], f8, f9), AnimationUtils.lerp(fArr[2], f8, f9), AnimationUtils.lerp(fArr[3], f8, f9), AnimationUtils.lerp(fArr[4], f8, f9), AnimationUtils.lerp(fArr[5], f8, f9), AnimationUtils.lerp(fArr[6], f8, f9), AnimationUtils.lerp(fArr[7], f8, f9)};
    }
}
