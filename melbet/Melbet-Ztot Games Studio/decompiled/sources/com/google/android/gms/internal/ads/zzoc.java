package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.io.path.DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzoc {
    public static zzof zza(AudioManager audioManager, zzh zzhVar) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzhVar.zza().zza);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(zzgap.zzg(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile m1589m = DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m1589m(directProfilesForAttributes.get(i));
            encapsulationType = m1589m.getEncapsulationType();
            if (encapsulationType != 1) {
                format = m1589m.getFormat();
                if (zzet.zzK(format) || zzof.zzb.containsKey(Integer.valueOf(format))) {
                    Integer valueOf = Integer.valueOf(format);
                    if (hashMap.containsKey(valueOf)) {
                        Set set = (Set) hashMap.get(valueOf);
                        set.getClass();
                        channelMasks2 = m1589m.getChannelMasks();
                        set.addAll(zzgap.zzg(channelMasks2));
                    } else {
                        channelMasks = m1589m.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(zzgap.zzg(channelMasks)));
                    }
                }
            }
        }
        zzfxo zzfxoVar = new zzfxo();
        for (Map.Entry entry : hashMap.entrySet()) {
            zzfxoVar.zzf(new zzod(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzof(zzfxoVar.zzi());
    }

    public static zzon zzb(AudioManager audioManager, zzh zzhVar) {
        List audioDevicesForAttributes;
        if (audioManager == null) {
            throw null;
        }
        audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzhVar.zza().zza);
        if (!audioDevicesForAttributes.isEmpty()) {
            return new zzon(DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m(audioDevicesForAttributes.get(0)));
        }
        return null;
    }
}
