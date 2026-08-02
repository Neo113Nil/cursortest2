package com.stripe.android.uicore.elements;

import androidx.compose.material.TextKt;
import androidx.compose.material.Typography;
import androidx.compose.material.TypographyKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.fidesmo.views.FidesmoScanningProgressKt$rememberScanningProgressPercent$1$1;
import com.squareup.cash.fidesmo.views.ScanningProgressSegment;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeThemeKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes8.dex */
public abstract class PlaceHolderKt {
    public static final void Placeholder(int i, Composer composer, Modifier modifier, String str, boolean z) {
        GapComposer gapComposer;
        Modifier modifier2;
        boolean z2;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-891239469);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | 432;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            long j = ((StripeColors) gapComposer2.consume(StripeThemeKt.LocalColors)).placeholderText;
            gapComposer2.startReplaceGroup(-1782629800);
            gapComposer2.end(false);
            TextStyle textStyle = ((Typography) gapComposer2.consume(TypographyKt.LocalTypography)).subtitle1;
            int i3 = i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            TextKt.m509Text4IGK_g(str, companion, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, gapComposer, i3, 0, 65528);
            modifier2 = companion;
            z2 = true;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new H6TextKt$$ExternalSyntheticLambda0(str, modifier2, z2, i, 4);
        }
    }

    public static final int rememberScanningProgressPercent(Integer num, Integer num2, Composer composer) {
        boolean changed = ((GapComposer) composer).changed(num) | ((GapComposer) composer).changed(num2);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            if (num == null || num2 == null || num2.intValue() <= 0) {
                rememberedValue = null;
            } else {
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                if (intValue2 <= 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("totalSteps must be positive.");
                    return 0;
                }
                int coerceIn = RangesKt___RangesKt.coerceIn(intValue, 1, intValue2);
                int i = (coerceIn * 100) / intValue2;
                rememberedValue = new ScanningProgressSegment(i, Math.max(i, coerceIn != intValue2 ? (((coerceIn + 1) * 100) / intValue2) - 1 : 100));
            }
            gapComposer.updateRememberedValue(rememberedValue);
        }
        ScanningProgressSegment scanningProgressSegment = (ScanningProgressSegment) rememberedValue;
        boolean changed2 = gapComposer.changed(num2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue2;
        boolean changed3 = gapComposer.changed(scanningProgressSegment) | gapComposer.changed(parcelableSnapshotMutableIntState);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new FidesmoScanningProgressKt$rememberScanningProgressPercent$1$1(scanningProgressSegment, parcelableSnapshotMutableIntState, null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, scanningProgressSegment, (Function2) rememberedValue3);
        if (scanningProgressSegment != null) {
            return RangesKt___RangesKt.coerceIn(parcelableSnapshotMutableIntState.getIntValue(), 0, scanningProgressSegment.endInclusive);
        }
        return 0;
    }

    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("<", str2, " threw ");
                    m3m.append(e.getClass().getName());
                    m3m.append(">");
                    sb = m3m.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
