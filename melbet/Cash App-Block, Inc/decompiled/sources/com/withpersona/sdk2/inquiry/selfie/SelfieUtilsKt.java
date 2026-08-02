package com.withpersona.sdk2.inquiry.selfie;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public abstract class SelfieUtilsKt {
    public static final void CompactCardWidget(final GenericComponentViewModel.CompactCardViewModel compactCardViewModel, final Function1 function1, Composer composer, int i) {
        int i2;
        String clickableLabel;
        compactCardViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1960698530);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(compactCardViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            SizeKt.fillMaxWidth(modifier, 1.0f);
            if (compactCardViewModel.showDropShadow) {
                modifier = KeypadKt.m3658mooncakeShadowWMci_g0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f), 23);
            }
            int i5 = i2 & 112;
            boolean changedInstance = gapComposer.changedInstance(compactCardViewModel) | (i5 == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function0() { // from class: com.squareup.cash.genericelements.components.components.CompactCardWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = r3;
                        Function1 function12 = function1;
                        GenericComponentViewModel.CompactCardViewModel compactCardViewModel2 = compactCardViewModel;
                        switch (i6) {
                            case 0:
                                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = compactCardViewModel2.viewAnalyticsEvent;
                                if (viewAnalyticsEvent != null) {
                                    function12.invoke(viewAnalyticsEvent);
                                }
                                break;
                            default:
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent = compactCardViewModel2.event;
                                if (genericTreeElementsViewEvent != null) {
                                    function12.invoke(genericTreeElementsViewEvent);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(modifier, (Function0) rememberedValue);
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = compactCardViewModel.event;
            if (genericTreeElementsViewEvent == null) {
                gapComposer.startReplaceGroup(385766321);
                gapComposer.end(false);
                clickableLabel = null;
            } else {
                gapComposer.startReplaceGroup(1259370064);
                clickableLabel = zzbk.toClickableLabel(genericTreeElementsViewEvent, gapComposer);
                gapComposer.end(false);
            }
            long backgroundColor = zzai.getBackgroundColor(compactCardViewModel.backgroundColor, gapComposer);
            int i6 = (gapComposer.changedInstance(compactCardViewModel) ? 1 : 0) | (i5 == 32 ? 1 : 0);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (i6 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.genericelements.components.components.CompactCardWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i4;
                        Function1 function12 = function1;
                        GenericComponentViewModel.CompactCardViewModel compactCardViewModel2 = compactCardViewModel;
                        switch (i62) {
                            case 0:
                                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = compactCardViewModel2.viewAnalyticsEvent;
                                if (viewAnalyticsEvent != null) {
                                    function12.invoke(viewAnalyticsEvent);
                                }
                                break;
                            default:
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent2 = compactCardViewModel2.event;
                                if (genericTreeElementsViewEvent2 != null) {
                                    function12.invoke(genericTreeElementsViewEvent2);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            KeypadKt.m3641CardIkByU14(onVisible$default, null, backgroundColor, false, (Function0) rememberedValue2, clickableLabel, null, Expect_jvmKt.rememberComposableLambda(-1170470758, new MoneyTabBookletKt$$ExternalSyntheticLambda4(i3, (Object) compactCardViewModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(compactCardViewModel, function1, i, 25);
        }
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable createTintableMutatedDrawableIfNeeded$1(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static int[] getCheckedState(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static ColorStateList getColorStateListOrNull(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    public static final String toHintMessage(SelfieError selfieError, SelfieWorkflow.Input.Strings strings, Selfie.Pose pose) {
        selfieError.getClass();
        strings.getClass();
        pose.getClass();
        switch (selfieError.ordinal()) {
            case 0:
                return strings.selfieHintCenterFace;
            case 1:
                return strings.selfieHintFaceTooClose;
            case 2:
                return strings.selfieHintFaceTooFar;
            case 3:
                return strings.selfieHintMultipleFaces;
            case 4:
                return strings.selfieHintFaceIncomplete;
            case 5:
                return strings.selfieHintCenterFace;
            case 6:
                int ordinal = pose.ordinal();
                if (ordinal == 0) {
                    return strings.selfieHintPoseNotCentered;
                }
                if (ordinal == 1 || ordinal == 2) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 7:
                return strings.selfieHintCenterFace;
            case 8:
                return strings.selfieHintCenterFace;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
