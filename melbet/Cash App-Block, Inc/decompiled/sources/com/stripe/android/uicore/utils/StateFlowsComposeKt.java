package com.stripe.android.uicore.utils;

import android.content.Context;
import android.os.Vibrator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.R;
import com.squareup.cash.fidesmo.views.haptic.ProvisioningHaptics;
import com.squareup.cash.filament.util.IblLoaderKt;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.BitmapUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public abstract class StateFlowsComposeKt {
    public static final MutableState collectAsState(StateFlow stateFlow, Composer composer) {
        stateFlow.getClass();
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(stateFlow);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            gapComposer.updateRememberedValue(null);
            rememberedValue = null;
        }
        AssertionError assertionError = (AssertionError) rememberedValue;
        boolean changed2 = gapComposer.changed(stateFlow);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new HCaptcha$$ExternalSyntheticLambda0(stateFlow, 26);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Function0 function0 = (Function0) rememberedValue2;
        boolean changedInstance = gapComposer.changedInstance(emptyCoroutineContext) | gapComposer.changedInstance(stateFlow) | gapComposer.changedInstance(assertionError);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new FlowKt__LimitKt$transformWhile$1(emptyCoroutineContext, stateFlow, assertionError, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Function2 function2 = (Function2) rememberedValue3;
        boolean changed3 = gapComposer.changed(stateFlow);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(function0.invoke());
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState = (MutableState) rememberedValue4;
        boolean changedInstance2 = gapComposer.changedInstance(function2) | gapComposer.changed(mutableState);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new StateFlowsComposeKt$produceState$1$1(function2, mutableState, continuation, 0);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, stateFlow, (Function2) rememberedValue5);
        return mutableState;
    }

    public static final ProvisioningHaptics rememberProvisioningHaptics(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            Vibrator vibrator = (Vibrator) context.getSystemService(Vibrator.class);
            if (vibrator == null) {
                rememberedValue = null;
            } else {
                BinaryBitmap binaryBitmap = new BinaryBitmap(vibrator);
                rememberedValue = new ProvisioningHaptics(binaryBitmap, binaryBitmap.loadFromResource(context, R.raw.haptic_nfc_connect_pop), binaryBitmap.loadFromResource(context, R.raw.haptic_hold_ramp), binaryBitmap.loadFromResource(context, R.raw.haptic_hold_confirmed), binaryBitmap.loadFromResource(context, R.raw.haptic_provisioning_active), binaryBitmap.loadFromResource(context, R.raw.haptic_provisioning_success), binaryBitmap.loadFromResource(context, R.raw.haptic_provisioning_failure), binaryBitmap.loadFromResource(context, R.raw.haptic_nfc_disconnect));
            }
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (ProvisioningHaptics) rememberedValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        zze(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int zza = IblLoaderKt.zza(obj);
        int i2 = zza & i;
        int zzc = zzc(i2, obj3);
        if (zzc != 0) {
            int i3 = ~i;
            int i4 = zza & i3;
            int i5 = -1;
            while (true) {
                int i6 = zzc - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !BitmapUtils.zza(obj, objArr[i6]) || (objArr2 != null && !BitmapUtils.zza(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    zzc = i8;
                }
            }
        }
        return -1;
    }

    public static int zzc(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object zzd(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static void zze(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
