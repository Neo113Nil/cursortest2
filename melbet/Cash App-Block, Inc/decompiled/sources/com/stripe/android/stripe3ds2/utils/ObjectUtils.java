package com.stripe.android.stripe3ds2.utils;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.tracing.Trace;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdz;
import com.squareup.cash.featureflags.FeatureFlagManager;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public abstract class ObjectUtils {
    public static final MutableState collectExperimentAsState(FeatureFlagManager featureFlagManager, AbstractApplier abstractApplier, Composer composer) {
        abstractApplier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Trace.valuesStateExperiment(featureFlagManager, abstractApplier);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
    }

    public static final int hash(Object... objArr) {
        return Objects.hash(Arrays.copyOf(objArr, objArr.length));
    }

    public abstract zzdz.zzd zza(zzdz zzdzVar);

    public abstract zzdz.zzj zzb(zzdz zzdzVar);

    public abstract void zzc(zzdz.zzj zzjVar, zzdz.zzj zzjVar2);

    public abstract void zzd(zzdz.zzj zzjVar, Thread thread);

    public abstract boolean zze(zzdz zzdzVar, zzdz.zzd zzdVar, zzdz.zzd zzdVar2);

    public abstract boolean zzf(zzdz zzdzVar, Object obj, Object obj2);

    public abstract boolean zzg(zzdz zzdzVar, zzdz.zzj zzjVar, zzdz.zzj zzjVar2);
}
