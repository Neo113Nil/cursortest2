package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.resources.R$styleable;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class GovernmentIdKt {
    public static final SandboxFlags_Factory INSTANCE = new SandboxFlags_Factory(12);

    public static final GradientDrawable createIdFrameWithAttributes(Context context, int i) {
        float dimension = context.getResources().getDimension(R.dimen.pi2_overlay_corner_radius);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.pi2_overlay_stroke_width);
        int color = context.getColor(R.color.pi2_overlay_stroke_color);
        Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context, i);
        if (resourceIdFromAttr$default != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceIdFromAttr$default.intValue(), R$styleable.Pi2IdFrame);
            dimension = obtainStyledAttributes.getDimension(0, dimension);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
            color = obtainStyledAttributes.getColor(1, color);
            obtainStyledAttributes.recycle();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(dimensionPixelSize, color);
        return gradientDrawable;
    }

    public static final IdClass getIdClass(CaptureConfig captureConfig) {
        captureConfig.getClass();
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return IdClass.Unknown;
        }
        if (captureConfig instanceof CaptureConfig.IdCaptureConfig) {
            return ((CaptureConfig.IdCaptureConfig) captureConfig).id.f1453type;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final String getIdClassKey(CaptureConfig captureConfig) {
        captureConfig.getClass();
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return "auto-classification";
        }
        if (captureConfig instanceof CaptureConfig.IdCaptureConfig) {
            return ((CaptureConfig.IdCaptureConfig) captureConfig).id.idClassKey;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static String getName(Screen screen) {
        if ((screen instanceof Screen.CameraScreen) || (screen instanceof Screen.ReviewScreen)) {
            return "camera_screen";
        }
        if ((screen instanceof Screen.AutoClassificationSelectCountryAndIdClassScreen) || (screen instanceof Screen.ChooseCaptureMethodScreen) || (screen instanceof Screen.ErrorScreen) || (screen instanceof Screen.InstructionsScreen) || (screen instanceof Screen.ReviewSelectedImageScreen) || (screen instanceof Screen.SubmittingScreen)) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final IdConfig.IdSideConfig getSideConfig(CaptureConfig captureConfig, IdConfig.Side side) {
        captureConfig.getClass();
        side.getClass();
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return ((CaptureConfig.AutoClassifyConfig) captureConfig).config.idSideConfig;
        }
        if (captureConfig instanceof CaptureConfig.IdCaptureConfig) {
            return ((CaptureConfig.IdCaptureConfig) captureConfig).id.getSideConfig(side);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final OverlayAssets idFrameAssetsFor(Context context, Screen.Overlay overlay, IdConfig.Side side) {
        int i;
        int i2;
        int i3;
        context.getClass();
        overlay.getClass();
        side.getClass();
        Screen.Overlay.Passport passport = Screen.Overlay.Passport.INSTANCE;
        boolean equals = overlay.equals(passport);
        Screen.Overlay.Rectangle rectangle = Screen.Overlay.Rectangle.INSTANCE;
        Screen.Overlay.GenericFront genericFront = Screen.Overlay.GenericFront.INSTANCE;
        Screen.Overlay.CornersOnly cornersOnly = Screen.Overlay.CornersOnly.INSTANCE;
        Screen.Overlay.Barcode barcode = Screen.Overlay.Barcode.INSTANCE;
        if (equals) {
            i = R.raw.pi2_mrz_intro_lottie;
        } else {
            if (!overlay.equals(barcode)) {
                if (!overlay.equals(cornersOnly) && !(overlay instanceof Screen.Overlay.Custom) && !overlay.equals(genericFront) && !overlay.equals(rectangle)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (side != IdConfig.Side.Back) {
                    i = R.raw.pi2_id_front_processing_lottie;
                }
            }
            i = R.raw.pi2_barcode_intro_lottie;
        }
        if (overlay.equals(passport)) {
            i2 = R.drawable.pi2_governmentid_passport_idguide;
        } else if (overlay.equals(barcode)) {
            i2 = R.drawable.pi2_governmentid_barcode_idguide;
        } else if (overlay.equals(rectangle)) {
            i2 = R.drawable.pi2_governmentid_blank;
        } else if (overlay.equals(cornersOnly)) {
            i2 = R.drawable.pi2_governmentid_corners_only;
        } else {
            if (!(overlay instanceof Screen.Overlay.Custom) && !overlay.equals(genericFront)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            i2 = R.drawable.pi2_governmentid_face_with_text;
        }
        if (overlay.equals(passport)) {
            i3 = R.attr.personaIdFrameMrzGuideAssets;
        } else if (overlay.equals(barcode)) {
            i3 = R.attr.personaIdFrameBarcodeGuideAssets;
        } else {
            if (!overlay.equals(cornersOnly) && !(overlay instanceof Screen.Overlay.Custom) && !overlay.equals(genericFront) && !overlay.equals(rectangle)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            i3 = R.attr.personaIdFrameFrontGuideAssets;
        }
        Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context, i3);
        if (resourceIdFromAttr$default != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceIdFromAttr$default.intValue(), R$styleable.Pi2IdFrameGuideAssets);
            i = obtainStyledAttributes.getResourceId(0, i);
            i2 = obtainStyledAttributes.getResourceId(1, i2);
            obtainStyledAttributes.recycle();
        }
        return new OverlayAssets(i, i2);
    }

    public static boolean isSameScreenAs(Screen screen, Screen screen2) {
        if (screen2 == null) {
            return false;
        }
        if (screen.getClass().equals(screen2.getClass())) {
            return true;
        }
        if (getName(screen) == null || getName(screen2) == null) {
            return false;
        }
        return Intrinsics.areEqual(getName(screen), getName(screen2));
    }

    public static final GovIdCaptureMethod toGovIdCaptureMethod(GovernmentId.CaptureMethod captureMethod) {
        captureMethod.getClass();
        int ordinal = captureMethod.ordinal();
        if (ordinal == 0) {
            return GovIdCaptureMethod.AUTO;
        }
        if (ordinal == 1) {
            return GovIdCaptureMethod.MANUAL;
        }
        if (ordinal == 2) {
            return GovIdCaptureMethod.VIDEO_UPLOAD;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
