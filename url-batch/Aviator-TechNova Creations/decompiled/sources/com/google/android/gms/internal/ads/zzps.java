package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzps {
    static final zzgui zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzps zza = new zzps(zzguf.zzj(zzpr.zza));
    private static final zzguf zzc = zzguf.zzl(2, 5, 6);

    static {
        zzguh zzguhVar = new zzguh();
        zzguhVar.zza(5, 6);
        zzguhVar.zza(17, 6);
        zzguhVar.zza(7, 6);
        zzguhVar.zza(30, 10);
        zzguhVar.zza(18, 6);
        zzguhVar.zza(6, 8);
        zzguhVar.zza(8, 8);
        zzguhVar.zza(14, 8);
        zzb = zzguhVar.zzc();
    }

    private zzps(List list) {
        for (int i = 0; i < list.size(); i++) {
            zzpr zzprVar = (zzpr) list.get(i);
            this.zzd.put(zzprVar.zzb, zzprVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzd.size(); i3++) {
            i2 = Math.max(i2, ((zzpr) this.zzd.valueAt(i3)).zzc);
        }
        this.zze = i2;
    }

    static zzps zza(Context context, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo);
    }

    static zzps zzb(Context context, Intent intent, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        AudioManager zza2 = zzcj.zza(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List<AudioDeviceInfo> audioDevicesForAttributes = zza2.getAudioDevicesForAttributes(zzdVar.zza());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        if (Build.VERSION.SDK_INT >= 33 && (zzfj.zzM(context) || zzfj.zzN(context))) {
            List<AudioProfile> directProfilesForAttributes = zza2.getDirectProfilesForAttributes(zzdVar.zza());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(zzgxz.zzg(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile audioProfile = directProfilesForAttributes.get(i);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (zzfj.zzA(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            set.addAll(zzgxz.zzg(audioProfile.getChannelMasks()));
                        } else {
                            hashMap.put(valueOf, new HashSet(zzgxz.zzg(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            int i2 = zzguf.zzd;
            zzguc zzgucVar = new zzguc();
            for (Map.Entry entry : hashMap.entrySet()) {
                zzgucVar.zzf(new zzpr(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzps(zzgucVar.zzi());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? zza2.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        zzguo zzguoVar = new zzguo();
        zzguoVar.zzg(8, 7);
        if (Build.VERSION.SDK_INT >= 31) {
            zzguoVar.zzg(26, 27);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            zzguoVar.zzf((Object) 30);
        }
        zzgup zzi = zzguoVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (zzi.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return zza;
            }
        }
        zzguo zzguoVar2 = new zzguo();
        zzguoVar2.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzfj.zzM(context) || zzfj.zzN(context))) {
            int i3 = zzguf.zzd;
            zzguc zzgucVar2 = new zzguc();
            zzgwt it = zzb.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (Build.VERSION.SDK_INT >= zzfj.zzC(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzdVar.zza())) {
                    zzgucVar2.zzf(Integer.valueOf(intValue));
                }
            }
            zzgucVar2.zzf((Object) 2);
            zzguoVar2.zzh(zzgucVar2.zzi());
            return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zze()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzguoVar2.zzh(zzc);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzguoVar2.zzh(zzgxz.zzg(intArrayExtra));
        }
        return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    static Uri zzc() {
        if (zze()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zze() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    private static zzguf zzf(int[] iArr, int i) {
        int i2 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            zzgucVar.zzf(new zzpr(i3, i));
        }
        return zzgucVar.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r1.contentEquals(r3) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzps)) {
            return false;
        }
        zzps zzpsVar = (zzps) obj;
        SparseArray sparseArray = this.zzd;
        SparseArray<?> sparseArray2 = zzpsVar.zzd;
        String str = zzfj.zza;
        if (Build.VERSION.SDK_INT < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                        break;
                    }
                }
                if (this.zze == zzpsVar.zze) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = zzfj.zza;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return this.zze + (i * 31);
    }

    public final String toString() {
        String obj = this.zzd.toString();
        int i = this.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50 + obj.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        if (r7 != 5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        if (com.google.android.gms.internal.ads.zzfj.zza(r9.zzd, 30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zzd(zzv zzvVar, zzd zzdVar) {
        SparseArray sparseArray;
        int zzB;
        String str = zzvVar.zzo;
        str.getClass();
        int zzg = zzas.zzg(str, zzvVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(zzg))) {
            return null;
        }
        int i = 6;
        if (zzg == 18) {
            if (zzfj.zza(this.zzd, 18)) {
                zzg = 18;
            } else {
                zzg = 6;
                sparseArray = this.zzd;
                if (!zzfj.zza(sparseArray, zzg)) {
                    return null;
                }
                zzpr zzprVar = (zzpr) sparseArray.get(zzg);
                zzprVar.getClass();
                int i2 = zzvVar.zzG;
                if (i2 == -1 || zzg == 18) {
                    int i3 = zzvVar.zzH;
                    if (i3 == -1) {
                        i3 = 48000;
                    }
                    i2 = zzprVar.zzb(i3, zzdVar);
                } else if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                    if (!zzprVar.zza(i2)) {
                        return null;
                    }
                } else if (i2 > 10) {
                    return null;
                }
                if (Build.VERSION.SDK_INT <= 28) {
                    if (i2 == 7) {
                        i = 8;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                        }
                    }
                    if (Build.VERSION.SDK_INT <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
                        i = 2;
                    }
                    zzB = zzfj.zzB(i);
                    if (zzB == 0) {
                        return Pair.create(Integer.valueOf(zzg), Integer.valueOf(zzB));
                    }
                    return null;
                }
                i = i2;
                if (Build.VERSION.SDK_INT <= 26) {
                    i = 2;
                }
                zzB = zzfj.zzB(i);
                if (zzB == 0) {
                }
            }
        }
        if (zzg == 8) {
            if (zzfj.zza(this.zzd, 8)) {
                zzg = 8;
            }
            zzg = 7;
            sparseArray = this.zzd;
            if (!zzfj.zza(sparseArray, zzg)) {
            }
        }
        if (zzg == 30) {
        }
        sparseArray = this.zzd;
        if (!zzfj.zza(sparseArray, zzg)) {
        }
    }
}
