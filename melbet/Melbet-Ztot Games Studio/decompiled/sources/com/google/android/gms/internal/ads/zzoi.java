package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzoi extends AudioDeviceCallback {
    final /* synthetic */ zzom zza;

    /* synthetic */ zzoi(zzom zzomVar, zzoh zzohVar) {
        this.zza = zzomVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Context context;
        zzh zzhVar;
        zzon zzonVar;
        zzom zzomVar = this.zza;
        context = zzomVar.zza;
        zzhVar = zzomVar.zzh;
        zzonVar = zzomVar.zzg;
        this.zza.zzj(zzof.zzc(context, zzhVar, zzonVar));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzon zzonVar;
        Context context;
        zzh zzhVar;
        zzon zzonVar2;
        zzonVar = this.zza.zzg;
        int i = zzet.zza;
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (zzet.zzG(audioDeviceInfoArr[i2], zzonVar)) {
                this.zza.zzg = null;
                break;
            }
            i2++;
        }
        zzom zzomVar = this.zza;
        context = zzomVar.zza;
        zzhVar = zzomVar.zzh;
        zzonVar2 = zzomVar.zzg;
        zzomVar.zzj(zzof.zzc(context, zzhVar, zzonVar2));
    }
}
