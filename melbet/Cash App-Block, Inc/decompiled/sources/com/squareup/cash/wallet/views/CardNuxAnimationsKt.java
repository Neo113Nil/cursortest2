package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.graphics.backend.math.Quat;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public abstract class CardNuxAnimationsKt {
    public static final TweenSpec DEFAULT_REVOLVING_CROSSFADE;
    public static final CubicBezierEasing EXIT_PHASE1_EASING;
    public static final CubicBezierEasing EXIT_PHASE2_EASING;
    public static final Quat MONEY_CARD_INTRO_ROTATION;
    public static final Quat NUX_CARD_ROTATION;

    static {
        Quat quat = Hero3DCardViewKt.FORWARD_RESTING;
        NUX_CARD_ROTATION = quat;
        MONEY_CARD_INTRO_ROTATION = new Quat((float) Math.toRadians(30.0d), Hero3DCardViewKt.X_AXIS).times(quat);
        DEFAULT_REVOLVING_CROSSFADE = AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, null, 4);
        EXIT_PHASE1_EASING = new CubicBezierEasing(0.55f, RecyclerView.DECELERATION_RATE, 0.12f, 1.0f);
        EXIT_PHASE2_EASING = new CubicBezierEasing(0.88f, RecyclerView.DECELERATION_RATE, 0.83f, 0.83f);
    }

    public static final Quat computeCardRotation(Quat quat, float f, float f2, float f3) {
        quat.getClass();
        Quat quat2 = new Quat((float) Math.toRadians(f), Hero3DCardViewKt.X_AXIS);
        return quat.times(quat2).times(new Quat((float) Math.toRadians(f2), Hero3DCardViewKt.Y_AXIS)).times(new Quat((float) Math.toRadians(f3), Hero3DCardViewKt.Z_AXIS));
    }
}
