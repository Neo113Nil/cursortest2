package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.core.view.InputDeviceCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzst {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    public static zzst zza(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str6;
        boolean z10 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z11 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z12 = z5 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface") || Build.MANUFACTURER.equals("Xiaomi") || Build.MANUFACTURER.equals("OPPO") || Build.MANUFACTURER.equals("realme") || Build.MANUFACTURER.equals("motorola") || Build.MANUFACTURER.equals("LENOVO")) {
            str4 = str;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z6 = z;
            z7 = z2;
            z8 = z3;
            z9 = false;
            str6 = str2;
        } else {
            str6 = str2;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z6 = z;
            z7 = z2;
            z8 = z3;
            z9 = true;
            str4 = str;
        }
        return new zzst(str4, str6, str5, codecCapabilities2, z6, z7, z8, z10, z11, z12, z9);
    }

    private final boolean zzj(zzu zzuVar) {
        String str = this.zzb;
        return str.equals(zzuVar.zzo) || str.equals(zztl.zzg(zzuVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r1.equals("video/hevc") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r1.equals("video/av01") != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzk(zzu zzuVar, boolean z) {
        int i;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int i2 = zztl.zza;
        Pair zze = zzdc.zze(zzuVar);
        String str = zzuVar.zzo;
        if (str != null && str.equals("video/mv-hevc")) {
            String zzi = zzar.zzi(this.zzc);
            if (!zzi.equals("video/mv-hevc")) {
                if (zzi.equals("video/hevc")) {
                    String zzj = zzfl.zzj(zzuVar.zzr);
                    if (zzj == null) {
                        zze = null;
                    } else {
                        String trim = zzj.trim();
                        String str2 = zzeo.zza;
                        zze = zzdc.zzf(zzj, trim.split("\\.", -1), zzuVar.zzE);
                    }
                }
            }
            return true;
        }
        if (zze != null) {
            int intValue = ((Integer) zze.first).intValue();
            int intValue2 = ((Integer) zze.second).intValue();
            int i3 = 8;
            if ("video/dolby-vision".equals(str)) {
                String str3 = this.zzb;
                int hashCode = str3.hashCode();
                if (hashCode != -1662735862) {
                    if (hashCode != -1662541442) {
                        if (hashCode == 1331836730 && str3.equals("video/avc")) {
                            intValue = 8;
                            intValue2 = 0;
                        }
                    }
                }
            }
            if (!this.zzi && !this.zzb.equals("audio/ac4")) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzb = zzb();
            String str4 = this.zzb;
            if (str4.equals("audio/ac4") && zzb.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                    i3 = 16;
                }
                zzb = new MediaCodecInfo.CodecProfileLevel[]{zztl.zzf(257, i3), zztl.zzf(InputDeviceCompat.SOURCE_DPAD, i3), zztl.zzf(514, i3), zztl.zzf(1026, i3), zztl.zzf(1028, i3)};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzb) {
                i = (codecProfileLevel.profile != intValue || (codecProfileLevel.level < intValue2 && z) || ("video/hevc".equals(str4) && intValue == 2 && ("sailfish".equals(Build.DEVICE) || "marlin".equals(Build.DEVICE)))) ? i + 1 : 0;
            }
            String str5 = zzuVar.zzk;
            String str6 = this.zzc;
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 22 + str6.length());
            sb.append("codec.profileLevel, ");
            sb.append(str5);
            sb.append(", ");
            sb.append(str6);
            zzm(sb.toString());
            return false;
        }
        return true;
    }

    private final boolean zzl(zzu zzuVar) {
        return (Objects.equals(zzuVar.zzo, "audio/flac") && zzuVar.zzI == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzeo.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str2);
        sb.append("]");
        zzds.zza("MediaCodecInfo", sb.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzo = zzo(videoCapabilities, i, i2);
        int i3 = zzo.x;
        int i4 = zzo.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzeo.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecCapabilities.profileLevels;
    }

    public final boolean zzc(zzu zzuVar) throws zztd {
        int i;
        if (!zzj(zzuVar) || !zzk(zzuVar, true) || !zzl(zzuVar)) {
            return false;
        }
        if (this.zzi) {
            int i2 = zzuVar.zzv;
            if (i2 <= 0 || (i = zzuVar.zzw) <= 0) {
                return true;
            }
            return zzg(i2, i, zzuVar.zzz);
        }
        int i3 = zzuVar.zzH;
        if (i3 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                sb.append("sampleRate.support, ");
                sb.append(i3);
                zzm(sb.toString());
                return false;
            }
        }
        int i4 = zzuVar.zzG;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(maxInputChannelCount).length() + 4 + String.valueOf(i5).length() + 1);
                sb2.append("AssumedMaxChannelAdjustment: ");
                sb2.append(str);
                sb2.append(", [");
                sb2.append(maxInputChannelCount);
                sb2.append(" to ");
                sb2.append(i5);
                sb2.append("]");
                zzds.zzc("MediaCodecInfo", sb2.toString());
                maxInputChannelCount = i5;
            }
            if (maxInputChannelCount < i4) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 22);
                sb3.append("channelCount.support, ");
                sb3.append(i4);
                zzm(sb3.toString());
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzu zzuVar) {
        return zzj(zzuVar) && zzk(zzuVar, false) && zzl(zzuVar);
    }

    public final boolean zze(zzu zzuVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i = zztl.zza;
        Pair zze = zzdc.zze(zzuVar);
        return zze != null && ((Integer) zze.first).intValue() == 42;
    }

    public final zzhs zzf(zzu zzuVar, zzu zzuVar2) {
        zzu zzuVar3;
        zzu zzuVar4;
        int i;
        int i2 = true != Objects.equals(zzuVar.zzo, zzuVar2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzuVar.zzA != zzuVar2.zzA) {
                i2 |= 1024;
            }
            boolean z = (zzuVar.zzv == zzuVar2.zzv && zzuVar.zzw == zzuVar2.zzw) ? false : true;
            if (!this.zze && z) {
                i2 |= 512;
            }
            zzh zzhVar = zzuVar.zzE;
            if ((!zzh.zza(zzhVar) || !zzh.zza(zzuVar2.zzE)) && !Objects.equals(zzhVar, zzuVar2.zzE)) {
                i2 |= 2048;
            }
            String str = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzuVar.zzd(zzuVar2)) {
                i2 |= 2;
            }
            int i3 = zzuVar.zzx;
            if (i3 != -1 && (i = zzuVar.zzy) != -1 && i3 == zzuVar2.zzx && i == zzuVar2.zzy && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzhs(str, zzuVar, zzuVar2, true != zzuVar.zzd(zzuVar2) ? 2 : 3, 0);
            }
            zzuVar3 = zzuVar;
            zzuVar4 = zzuVar2;
        } else {
            zzuVar3 = zzuVar;
            zzuVar4 = zzuVar2;
            if (zzuVar3.zzG != zzuVar4.zzG) {
                i2 |= 4096;
            }
            if (zzuVar3.zzH != zzuVar4.zzH) {
                i2 |= 8192;
            }
            if (zzuVar3.zzI != zzuVar4.zzI) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i4 = zztl.zza;
                Pair zze = zzdc.zze(zzuVar3);
                Pair zze2 = zzdc.zze(zzuVar4);
                if (zze != null && zze2 != null) {
                    int intValue = ((Integer) zze.first).intValue();
                    int intValue2 = ((Integer) zze2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzhs(this.zza, zzuVar3, zzuVar4, 3, 0);
                    }
                }
            }
            if (!zzuVar3.zzd(zzuVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzhs(this.zza, zzuVar3, zzuVar4, 1, 0);
            }
        }
        return new zzhs(this.zza, zzuVar3, zzuVar4, 0, i2);
    }

    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzm("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzm("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int zza = zzsv.zza(videoCapabilities, i, i2, d);
            if (zza != 2) {
                if (zza == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
                    sb.append("sizeAndRate.cover, ");
                    sb.append(i);
                    sb.append("x");
                    sb.append(i2);
                    sb.append("@");
                    sb.append(d);
                    zzm(sb.toString());
                    return false;
                }
            }
            return true;
        }
        if (!zzn(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.zza;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && zzn(videoCapabilities, i2, i, d)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 22 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
                    sb2.append("sizeAndRate.rotated, ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    sb2.append("@");
                    sb2.append(d);
                    String sb3 = sb2.toString();
                    String str2 = this.zzb;
                    int length = str.length();
                    String str3 = zzeo.zza;
                    int length2 = String.valueOf(str2).length();
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                    sb4.append("AssumedSupport [");
                    sb4.append(sb3);
                    sb4.append("] [");
                    sb4.append(str);
                    sb4.append(", ");
                    sb4.append(str2);
                    sb4.append("] [");
                    sb4.append(str3);
                    sb4.append("]");
                    zzds.zza("MediaCodecInfo", sb4.toString());
                }
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(i).length() + 22 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
            sb5.append("sizeAndRate.support, ");
            sb5.append(i);
            sb5.append("x");
            sb5.append(i2);
            sb5.append("@");
            sb5.append(d);
            zzm(sb5.toString());
            return false;
        }
        return true;
    }

    public final float zzh(int i, int i2) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f = this.zzl;
        if (f != -3.4028235E38f && this.zzj == i && this.zzk == i2) {
            return f;
        }
        float f2 = 1024.0f;
        if (!zzg(i, i2, 1024.0d)) {
            float f3 = 0.0f;
            while (true) {
                float f4 = f2 - f3;
                if (Math.abs(f4) <= 5.0f) {
                    break;
                }
                float f5 = (f4 / 2.0f) + f3;
                boolean zzg = zzg(i, i2, f5);
                if (true == zzg) {
                    f3 = f5;
                }
                if (true != zzg) {
                    f2 = f5;
                }
            }
            f2 = f3;
        }
        this.zzl = f2;
        this.zzj = i;
        this.zzk = i2;
        return f2;
    }

    public final Point zzi(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i, i2);
    }

    zzst(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = z7;
        this.zzi = zzar.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }
}
