package com.withpersona.sdk2.inquiry.nfc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.compose.AsyncImageKt;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.IconViewModel;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* loaded from: classes4.dex */
public abstract class NfcTrackingEventsHolder {
    public static TrackingEventsLogger trackingEventsLogger;

    public static final void GenericImage(IconViewModel.ImageViewModel imageViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        imageViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1641480385);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(imageViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m285size3ABfNKs = imageViewModel.size != IconViewModel.ImageViewModel.Size.STATIC ? SizeKt.m285size3ABfNKs(modifier, r12.value) : SizeKt.wrapContentSize$default(modifier, null, 3);
            String themedUrl = ComposeUtilsKt.getThemedUrl(imageViewModel.image, gapComposer);
            BlendModeColorFilter blendModeColorFilter = null;
            String str = imageViewModel.contentDescription;
            Color composeColor = ComposeUtilsKt.toComposeColor(imageViewModel.color, gapComposer);
            if (composeColor != null) {
                long j = composeColor.value;
                blendModeColorFilter = new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5)));
            }
            AsyncImageKt.m1438AsyncImage10Xjiaw(themedUrl, str, m285size3ABfNKs, null, null, blendModeColorFilter, gapComposer, 0, 1784);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(imageViewModel, modifier, i, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatorSet createCircularReveal(CircularRevealWidget circularRevealWidget, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(circularRevealWidget, CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL, new CircularRevealWidget.RevealInfo(f, f2, f3));
        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
        if (revealInfo == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Caller must set a non-null RevealInfo before calling this.");
            return null;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) circularRevealWidget, (int) f, (int) f2, revealInfo.radius, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }
}
