package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzsn {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public static zzsn zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (codecCapabilities != null) {
            int i = zzfs.zza;
            if (codecCapabilities.isFeatureSupported("adaptive-playback") && (zzfs.zza > 22 || ((!"ODROID-XU3".equals(zzfs.zzd) && !"Nexus 10".equals(zzfs.zzd)) || (!"OMX.Exynos.AVC.Decoder".equals(str) && !"OMX.Exynos.AVC.Decoder.secure".equals(str))))) {
                z6 = true;
                return new zzsn(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && zzfs.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && zzfs.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
            }
        }
        z6 = false;
        return new zzsn(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && zzfs.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && zzfs.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = zzfs.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        zzez.zzb("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + zzfs.zze + "]");
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzi = zzi(videoCapabilities, i, i2);
        int i3 = zzi.x;
        int i4 = zzi.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private final boolean zzl(zzam zzamVar, boolean z) {
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zzb = zzth.zzb(zzamVar);
        if (zzb != null) {
            int intValue = ((Integer) zzb.first).intValue();
            int intValue2 = ((Integer) zzb.second).intValue();
            int i2 = 8;
            if ("video/dolby-vision".equals(zzamVar.zzm)) {
                if ("video/avc".equals(this.zzb)) {
                    intValue = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.zzh) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
            if (zzfs.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i2 = 1024;
                } else if (intValue3 >= 120000000) {
                    i2 = 512;
                } else if (intValue3 >= 60000000) {
                    i2 = 256;
                } else if (intValue3 >= 30000000) {
                    i2 = 128;
                } else if (intValue3 >= 18000000) {
                    i2 = 64;
                } else if (intValue3 >= 12000000) {
                    i2 = 32;
                } else if (intValue3 >= 7200000) {
                    i2 = 16;
                } else if (intValue3 < 3600000) {
                    i2 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i2;
                zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
                i = (codecProfileLevel2.profile != intValue || (codecProfileLevel2.level < intValue2 && z) || ("video/hevc".equals(this.zzb) && intValue == 2 && ("sailfish".equals(zzfs.zzb) || "marlin".equals(zzfs.zzb)))) ? i + 1 : 0;
            }
            zzj("codec.profileLevel, " + zzamVar.zzj + ", " + this.zzc);
            return false;
        }
        return true;
    }

    private final boolean zzm(zzam zzamVar) {
        return this.zzb.equals(zzamVar.zzm) || this.zzb.equals(zzth.zze(zzamVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    public final zzim zzb(zzam zzamVar, zzam zzamVar2) {
        int i = true != zzfs.zzF(zzamVar.zzm, zzamVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzamVar.zzu != zzamVar2.zzu) {
                i |= 1024;
            }
            if (!this.zze && (zzamVar.zzr != zzamVar2.zzr || zzamVar.zzs != zzamVar2.zzs)) {
                i |= 512;
            }
            if (!zzfs.zzF(zzamVar.zzy, zzamVar2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzfs.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzamVar.zzd(zzamVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzim(this.zza, zzamVar, zzamVar2, true != zzamVar.zzd(zzamVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzamVar.zzz != zzamVar2.zzz) {
                i |= 4096;
            }
            if (zzamVar.zzA != zzamVar2.zzA) {
                i |= 8192;
            }
            if (zzamVar.zzB != zzamVar2.zzB) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb = zzth.zzb(zzamVar);
                Pair zzb2 = zzth.zzb(zzamVar2);
                if (zzb != null && zzb2 != null) {
                    int intValue = ((Integer) zzb.first).intValue();
                    int intValue2 = ((Integer) zzb2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzim(this.zza, zzamVar, zzamVar2, 3, 0);
                    }
                }
            }
            if (!zzamVar.zzd(zzamVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzim(this.zza, zzamVar, zzamVar2, 1, 0);
            }
        }
        return new zzim(this.zza, zzamVar, zzamVar2, 0, i);
    }

    public final boolean zzd(zzam zzamVar) {
        return zzm(zzamVar) && zzl(zzamVar, false);
    }

    public final boolean zze(zzam zzamVar) throws zztb {
        if (!zzm(zzamVar) || !zzl(zzamVar, true)) {
            return false;
        }
        if (this.zzh) {
            if (zzamVar.zzr <= 0 || zzamVar.zzs <= 0) {
                return true;
            }
            if (zzfs.zza >= 21) {
                return zzg(zzamVar.zzr, zzamVar.zzs, zzamVar.zzt);
            }
            boolean z = zzamVar.zzr * zzamVar.zzs <= zzth.zza();
            if (!z) {
                zzj("legacyFrameSize, " + zzamVar.zzr + "x" + zzamVar.zzs);
            }
            return z;
        }
        if (zzfs.zza >= 21) {
            int i = zzamVar.zzA;
            if (i != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities == null) {
                    zzj("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzj("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i)) {
                    zzj("sampleRate.support, " + i);
                    return false;
                }
            }
            int i2 = zzamVar.zzz;
            if (i2 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzj("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        zzj("channelCount.aCaps");
                    } else {
                        String str = this.zza;
                        String str2 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((zzfs.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            int i3 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                            zzez.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i3 + "]");
                            maxInputChannelCount = i3;
                        }
                        if (maxInputChannelCount < i2) {
                            zzj("channelCount.support, " + i2);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zzf(zzam zzamVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb = zzth.zzb(zzamVar);
        return zzb != null && ((Integer) zzb.first).intValue() == 42;
    }

    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzfs.zza >= 29) {
            int zza = zzsm.zza(videoCapabilities, i, i2, d);
            if (zza != 2) {
                if (zza == 1) {
                    zzj("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                    return false;
                }
            }
            return true;
        }
        if (!zzk(videoCapabilities, i, i2, d)) {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzfs.zzb)) || !zzk(videoCapabilities, i2, i, d))) {
                zzj("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            zzez.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + this.zza + ", " + this.zzb + "] [" + zzfs.zze + "]");
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    zzsn(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzce.zzg(str2);
    }
}
