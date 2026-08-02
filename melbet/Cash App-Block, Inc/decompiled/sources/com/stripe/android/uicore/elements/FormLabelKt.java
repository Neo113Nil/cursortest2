package com.stripe.android.uicore.elements;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.material.TextKt;
import androidx.compose.material.Typography;
import androidx.compose.material.TypographyKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import app.cash.badging.backend.FormattedResources;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.cdf.cashtagprovisioning.DeviceType;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoTagPulseShapeResolverKt$WhenMappings;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeThemeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FormLabelKt {
    public static final void FormLabel(int i, int i2, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer;
        Modifier modifier3;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-214069769);
        int i4 = (gapComposer2.changed(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer2.changed(modifier2) ? 32 : 16);
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer = gapComposer2;
            modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            TextKt.m509Text4IGK_g(str, modifier3, ((StripeColors) gapComposer2.consume(StripeThemeKt.LocalColors)).placeholderText, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((Typography) gapComposer2.consume(TypographyKt.LocalTypography)).subtitle1, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0, 65528);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormLabelKt$$ExternalSyntheticLambda0(str, modifier3, i, i2);
        }
    }

    public static final FidesmoScanningPulseShape resolveScanningPulseShape(TagFormFactor tagFormFactor) {
        switch (FidesmoTagPulseShapeResolverKt$WhenMappings.$EnumSwitchMapping$0[tagFormFactor.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
            case 2:
                return FidesmoScanningPulseShape.MINI_CARD;
            case 3:
            case 4:
                return FidesmoScanningPulseShape.STAR;
            case 5:
            case 6:
                return FidesmoScanningPulseShape.HEART;
        }
    }

    public static final TagFormFactor resolveSuccessFormFactor(FidesmoProvisioningPresenter.ActivationPhase activationPhase) {
        String str;
        activationPhase.getClass();
        activationPhase.getClass();
        FidesmoProvisioningPresenter.ActivationPhase.ActivationCompleted activationCompleted = activationPhase instanceof FidesmoProvisioningPresenter.ActivationPhase.ActivationCompleted ? (FidesmoProvisioningPresenter.ActivationPhase.ActivationCompleted) activationPhase : null;
        TagThemeDefinition.TagFormFactor themeFormFactor = (activationCompleted == null || (str = activationCompleted.tagThemeToken) == null) ? null : toThemeFormFactor(str);
        if (themeFormFactor != null) {
            return FormattedResources.toAppTagFormFactor(themeFormFactor);
        }
        return null;
    }

    public static final DeviceType toCdfDeviceType(TagFormFactor tagFormFactor) {
        int ordinal = tagFormFactor.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                    }
                }
                return DeviceType.MINI_CARD;
            }
            return DeviceType.HEART;
        }
        return DeviceType.WAND;
    }

    public static final TagThemeDefinition.TagFormFactor toThemeFormFactor(String str) {
        Object obj;
        EnumEntriesList enumEntriesList = TagThemeDefinition.TagFormFactor.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (true) {
            if (!m.hasNext()) {
                obj = null;
                break;
            }
            obj = m.next();
            if (Intrinsics.areEqual(((TagThemeDefinition.TagFormFactor) obj).name(), str)) {
                break;
            }
        }
        return (TagThemeDefinition.TagFormFactor) obj;
    }

    public static int zzb(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }
}
