package com.withpersona.sdk2.inquiry.device;

import android.os.Build;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.protos.cash.genericelements.ui.Button$TextButtonElement;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class EmulatorDeviceUtilsKt {
    public static final void GenericButton(GenericBaseViewModel.ButtonViewModel buttonViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        MooncakePillButton.Style style;
        boolean z;
        buttonViewModel.getClass();
        Button$TextButtonElement.Size size = buttonViewModel.size;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1706472039);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(buttonViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        boolean z2 = true;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Button$TextButtonElement.Size size2 = Button$TextButtonElement.Size.WIDE;
            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
            if (size == size2) {
                modifier2 = SizeKt.fillMaxWidth(modifier2, 1.0f);
            }
            Modifier then = modifier.then(modifier2);
            String str = buttonViewModel.text;
            int ordinal = buttonViewModel.f1135type.ordinal();
            if (ordinal == 0) {
                style = MooncakePillButton.Style.PRIMARY;
            } else if (ordinal == 1) {
                style = MooncakePillButton.Style.SECONDARY;
            } else if (ordinal == 2) {
                style = MooncakePillButton.Style.TERTIARY;
            } else {
                if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                style = MooncakePillButton.Style.OUTLINE;
            }
            int ordinal2 = size.ordinal();
            MooncakePillButton.Size size3 = ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? MooncakePillButton.Size.MEDIUM : MooncakePillButton.Size.SMALL : MooncakePillButton.Size.MEDIUM : MooncakePillButton.Size.LARGE;
            int ordinal3 = buttonViewModel.state.ordinal();
            if (ordinal3 == 0 || ordinal3 != 2) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = buttonViewModel.event;
            gapComposer2.startReplaceGroup(757892555);
            String clickableLabel = zzbk.toClickableLabel(genericTreeElementsViewEvent, gapComposer2);
            gapComposer2.end(false);
            boolean changedInstance = gapComposer2.changedInstance(buttonViewModel) | ((i2 & 896) == 256 ? z : false);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(20, buttonViewModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            KeypadKt.m3640ButtonGFipHI0(str, (Function0) rememberedValue, then, clickableLabel, size3, style, null, z2, 0, null, null, gapComposer, 0, 0, 3904);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(buttonViewModel, modifier, function1, i, 25);
        }
    }

    public static String getStatusCodeString(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return Boxes$$ExternalSyntheticOutline1.m(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static final boolean isDeviceEmulator() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = Build.BRAND;
        if (str7 != null && (str = Build.DEVICE) != null && (str2 = Build.FINGERPRINT) != null && (str3 = Build.HARDWARE) != null && (str4 = Build.MODEL) != null && (str5 = Build.MANUFACTURER) != null && (str6 = Build.PRODUCT) != null) {
            boolean z = new File("/storage/emulated/0/Android/data/com.android.ld.appstore/files").exists() || new File("/storage/emulated/0/Android/data/com.android.ld.appstore/cache").exists();
            if ((!StringsKt__StringsJVMKt.startsWith(str7, "generic", false) || !StringsKt__StringsJVMKt.startsWith(str, "generic", false)) && !StringsKt__StringsJVMKt.startsWith(str2, "generic", false) && !StringsKt__StringsJVMKt.startsWith(str2, "unknown", false) && !StringsKt.contains((CharSequence) str3, (CharSequence) "goldfish", false) && !StringsKt.contains((CharSequence) str3, (CharSequence) "ranchu", false) && !StringsKt.contains((CharSequence) str4, (CharSequence) "google_sdk", false) && !StringsKt.contains((CharSequence) str4, (CharSequence) "Emulator", false) && !StringsKt.contains((CharSequence) str4, (CharSequence) "Android SDK built for x86", false) && !StringsKt.contains((CharSequence) str5, (CharSequence) "Genymotion", false) && !StringsKt.contains((CharSequence) str6, (CharSequence) "sdk_google", false) && !StringsKt.contains((CharSequence) str6, (CharSequence) "google_sdk", false) && !StringsKt.contains((CharSequence) str6, (CharSequence) "sdk", false) && !StringsKt.contains((CharSequence) str6, (CharSequence) "sdk_x86", false) && !StringsKt.contains((CharSequence) str6, (CharSequence) "sdk_gphone64_arm64", false) && !StringsKt.contains((CharSequence) str6, (CharSequence) "vbox86p", false) && !StringsKt.contains((CharSequence) str6, (CharSequence) "emulator", false) && !StringsKt.contains((CharSequence) str6, (CharSequence) "simulator", false) && !z) {
                return false;
            }
        }
        return true;
    }
}
