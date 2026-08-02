package com.stripe.android.uicore.elements;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.material.TextKt;
import androidx.compose.material.Typography;
import androidx.compose.material.TypographyKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.fidesmo.api.FidesmoAnimationDebugOverrides;
import com.squareup.cash.fidesmo.api.NoOpFidesmoAnimationDebugOverrides;
import com.squareup.cash.fidesmo.real.SharedPreferencesFidesmoAnimationDebugOverrides;
import com.squareup.ecr.BuildConfig;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeThemeKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class H6TextKt {
    public static final void H6Text(int i, Composer composer, Modifier modifier, String str, boolean z) {
        GapComposer gapComposer;
        boolean z2;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1144298551);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer = gapComposer2;
            TextKt.m509Text4IGK_g(str, modifier, ((StripeColors) gapComposer2.consume(StripeThemeKt.LocalColors)).subtitle, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer2.consume(TypographyKt.LocalTypography)).h6, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, new PlatformTextStyle(true), null, 0, 16252927), gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0, 65528);
            z2 = true;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new H6TextKt$$ExternalSyntheticLambda0(str, modifier, z2, i, 0);
        }
    }

    public static FidesmoAnimationDebugOverrides provideFidesmoAnimationDebugOverrides(Context context, boolean z) {
        if (!z) {
            return NoOpFidesmoAnimationDebugOverrides.INSTANCE;
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(BuildConfig.BUILD_TYPE, 0);
        sharedPreferences.getClass();
        return new SharedPreferencesFidesmoAnimationDebugOverrides(sharedPreferences);
    }

    public static String zza(zzdf zzdfVar) {
        StringBuilder sb = new StringBuilder(zzdfVar.zzd());
        for (int i = 0; i < zzdfVar.zzd(); i++) {
            byte zza = zzdfVar.zza(i);
            if (zza == 34) {
                sb.append("\\\"");
            } else if (zza == 39) {
                sb.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zza < 32 || zza > 126) {
                            sb.append('\\');
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            sb.append((char) ((zza & 7) + 48));
                            break;
                        } else {
                            sb.append((char) zza);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
