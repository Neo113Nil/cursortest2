package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzth {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zztb {
        int i;
        int i2 = zzd;
        if (i2 == -1) {
            zzsn zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzh()) {
                    int i4 = codecProfileLevel.level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                }
                i2 = Math.max(i3, zzfs.zza >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            zzd = i2;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bf A[Catch: NumberFormatException -> 0x02d0, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x02d0, blocks: (B:122:0x0269, B:124:0x027b, B:135:0x0297, B:138:0x02bf), top: B:121:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0794  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zzb(zzam zzamVar) {
        char c;
        int i;
        int parseInt;
        int parseInt2;
        int i2;
        int i3;
        int i4;
        int i5;
        char c2;
        Integer num;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        char c3;
        Integer num2;
        Integer num3;
        String str = zzamVar.zzj;
        if (str != null) {
            String[] split = str.split("\\.");
            int i11 = 8;
            int i12 = 2;
            if (!"video/dolby-vision".equals(zzamVar.zzm)) {
                String str2 = split[0];
                switch (str2.hashCode()) {
                    case 3004662:
                        if (str2.equals("av01")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3006243:
                        if (str2.equals("avc1")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3006244:
                        if (str2.equals("avc2")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3199032:
                        if (str2.equals("hev1")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3214780:
                        if (str2.equals("hvc1")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3356560:
                        if (str2.equals("mp4a")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3624515:
                        if (str2.equals("vp09")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                        String str3 = zzamVar.zzj;
                        int length = split.length;
                        if (length >= 2) {
                            try {
                                if (split[1].length() != 6) {
                                    i = 16;
                                    if (length < 3) {
                                        zzez.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str3);
                                        break;
                                    } else {
                                        parseInt = Integer.parseInt(split[1]);
                                        parseInt2 = Integer.parseInt(split[2]);
                                    }
                                } else {
                                    i = 16;
                                    parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                    parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                                }
                                if (parseInt == 66) {
                                    i12 = 1;
                                } else if (parseInt != 77) {
                                    if (parseInt != 88) {
                                        if (parseInt == 100) {
                                            i2 = -1;
                                            i12 = 8;
                                        } else if (parseInt == 110) {
                                            i12 = i;
                                        } else if (parseInt == 122) {
                                            i12 = 32;
                                        } else if (parseInt != 244) {
                                            i2 = -1;
                                            i12 = -1;
                                        } else {
                                            i12 = 64;
                                        }
                                        if (i12 != i2) {
                                            zzez.zzf("MediaCodecUtil", "Unknown AVC profile: " + parseInt);
                                            break;
                                        } else {
                                            switch (parseInt2) {
                                                case 10:
                                                    i3 = 1;
                                                    break;
                                                case 11:
                                                    i3 = 4;
                                                    break;
                                                case 12:
                                                    i3 = 8;
                                                    break;
                                                case 13:
                                                    i3 = i;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 20:
                                                            i3 = 32;
                                                            break;
                                                        case 21:
                                                            i3 = 64;
                                                            break;
                                                        case 22:
                                                            i3 = 128;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 30:
                                                                    i3 = 256;
                                                                    break;
                                                                case 31:
                                                                    i3 = 512;
                                                                    break;
                                                                case 32:
                                                                    i3 = 1024;
                                                                    break;
                                                                default:
                                                                    switch (parseInt2) {
                                                                        case 40:
                                                                            i3 = 2048;
                                                                            break;
                                                                        case 41:
                                                                            i3 = 4096;
                                                                            break;
                                                                        case 42:
                                                                            i3 = 8192;
                                                                            break;
                                                                        default:
                                                                            switch (parseInt2) {
                                                                                case 50:
                                                                                    i3 = 16384;
                                                                                    break;
                                                                                case 51:
                                                                                    i3 = 32768;
                                                                                    break;
                                                                                case 52:
                                                                                    i3 = 65536;
                                                                                    break;
                                                                                default:
                                                                                    i3 = -1;
                                                                                    break;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                            if (i3 != -1) {
                                                return new Pair(Integer.valueOf(i12), Integer.valueOf(i3));
                                            }
                                            zzez.zzf("MediaCodecUtil", "Unknown AVC level: " + parseInt2);
                                            break;
                                        }
                                    } else {
                                        i12 = 4;
                                    }
                                }
                                i2 = -1;
                                if (i12 != i2) {
                                }
                            } catch (NumberFormatException unused) {
                                zzez.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str3)));
                                break;
                            }
                        } else {
                            zzez.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str3)));
                            break;
                        }
                    case 2:
                        String str4 = zzamVar.zzj;
                        if (split.length >= 3) {
                            try {
                                int parseInt3 = Integer.parseInt(split[1]);
                                int parseInt4 = Integer.parseInt(split[2]);
                                int i13 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                                if (i13 == -1) {
                                    zzez.zzf("MediaCodecUtil", "Unknown VP9 profile: " + parseInt3);
                                    break;
                                } else {
                                    if (parseInt4 == 10) {
                                        i11 = 1;
                                    } else if (parseInt4 == 11) {
                                        i11 = 2;
                                    } else if (parseInt4 == 20) {
                                        i11 = 4;
                                    } else if (parseInt4 != 21) {
                                        if (parseInt4 == 30) {
                                            i4 = -1;
                                            i11 = 16;
                                        } else if (parseInt4 == 31) {
                                            i11 = 32;
                                        } else if (parseInt4 == 40) {
                                            i11 = 64;
                                        } else if (parseInt4 == 41) {
                                            i11 = 128;
                                        } else if (parseInt4 == 50) {
                                            i11 = 256;
                                        } else if (parseInt4 != 51) {
                                            switch (parseInt4) {
                                                case 60:
                                                    i11 = 2048;
                                                    break;
                                                case 61:
                                                    i11 = 4096;
                                                    break;
                                                case 62:
                                                    i11 = 8192;
                                                    break;
                                                default:
                                                    i4 = -1;
                                                    i11 = -1;
                                                    break;
                                            }
                                        } else {
                                            i11 = 512;
                                        }
                                        if (i11 == i4) {
                                            return new Pair(Integer.valueOf(i13), Integer.valueOf(i11));
                                        }
                                        zzez.zzf("MediaCodecUtil", "Unknown VP9 level: " + parseInt4);
                                        break;
                                    }
                                    i4 = -1;
                                    if (i11 == i4) {
                                    }
                                }
                            } catch (NumberFormatException unused2) {
                                zzez.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str4)));
                                break;
                            }
                        } else {
                            zzez.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str4)));
                            break;
                        }
                    case 3:
                    case 4:
                        String str5 = zzamVar.zzj;
                        zzs zzsVar = zzamVar.zzy;
                        if (split.length < 4) {
                            zzez.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str5)));
                            break;
                        } else {
                            Matcher matcher = zzb.matcher(split[1]);
                            if (!matcher.matches()) {
                                zzez.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str5)));
                                break;
                            } else {
                                String group = matcher.group(1);
                                if (!"1".equals(group)) {
                                    if (!ExifInterface.GPS_MEASUREMENT_2D.equals(group)) {
                                        zzez.zzf("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                                        break;
                                    } else {
                                        i5 = (zzsVar == null || zzsVar.zzf != 6) ? 2 : 4096;
                                    }
                                } else {
                                    i5 = 1;
                                }
                                String str6 = split[3];
                                if (str6 != null) {
                                    switch (str6.hashCode()) {
                                        case 70821:
                                            if (str6.equals("H30")) {
                                                c2 = '\r';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 70914:
                                            if (str6.equals("H60")) {
                                                c2 = 14;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 70917:
                                            if (str6.equals("H63")) {
                                                c2 = 15;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 71007:
                                            if (str6.equals("H90")) {
                                                c2 = 16;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 71010:
                                            if (str6.equals("H93")) {
                                                c2 = 17;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 74665:
                                            if (str6.equals("L30")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 74758:
                                            if (str6.equals("L60")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 74761:
                                            if (str6.equals("L63")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 74851:
                                            if (str6.equals("L90")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 74854:
                                            if (str6.equals("L93")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193639:
                                            if (str6.equals("H120")) {
                                                c2 = 18;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193642:
                                            if (str6.equals("H123")) {
                                                c2 = 19;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193732:
                                            if (str6.equals("H150")) {
                                                c2 = 20;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193735:
                                            if (str6.equals("H153")) {
                                                c2 = 21;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193738:
                                            if (str6.equals("H156")) {
                                                c2 = 22;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193825:
                                            if (str6.equals("H180")) {
                                                c2 = 23;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193828:
                                            if (str6.equals("H183")) {
                                                c2 = 24;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193831:
                                            if (str6.equals("H186")) {
                                                c2 = 25;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312803:
                                            if (str6.equals("L120")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312806:
                                            if (str6.equals("L123")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312896:
                                            if (str6.equals("L150")) {
                                                c2 = 7;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312899:
                                            if (str6.equals("L153")) {
                                                c2 = '\b';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312902:
                                            if (str6.equals("L156")) {
                                                c2 = '\t';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312989:
                                            if (str6.equals("L180")) {
                                                c2 = '\n';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312992:
                                            if (str6.equals("L183")) {
                                                c2 = 11;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312995:
                                            if (str6.equals("L186")) {
                                                c2 = '\f';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            num = 1;
                                            break;
                                        case 1:
                                            num = 4;
                                            break;
                                        case 2:
                                            num = 16;
                                            break;
                                        case 3:
                                            num = 64;
                                            break;
                                        case 4:
                                            num = 256;
                                            break;
                                        case 5:
                                            num = 1024;
                                            break;
                                        case 6:
                                            num = 4096;
                                            break;
                                        case 7:
                                            num = 16384;
                                            break;
                                        case '\b':
                                            num = 65536;
                                            break;
                                        case '\t':
                                            num = 262144;
                                            break;
                                        case '\n':
                                            num = 1048576;
                                            break;
                                        case 11:
                                            num = 4194304;
                                            break;
                                        case '\f':
                                            num = 16777216;
                                            break;
                                        case '\r':
                                            num = 2;
                                            break;
                                        case 14:
                                            num = 8;
                                            break;
                                        case 15:
                                            num = 32;
                                            break;
                                        case 16:
                                            num = 128;
                                            break;
                                        case 17:
                                            num = 512;
                                            break;
                                        case 18:
                                            num = 2048;
                                            break;
                                        case 19:
                                            num = 8192;
                                            break;
                                        case 20:
                                            num = 32768;
                                            break;
                                        case 21:
                                            num = 131072;
                                            break;
                                        case 22:
                                            num = 524288;
                                            break;
                                        case 23:
                                            num = 2097152;
                                            break;
                                        case 24:
                                            num = 8388608;
                                            break;
                                        case 25:
                                            num = 33554432;
                                            break;
                                    }
                                    if (num == null) {
                                        return new Pair(Integer.valueOf(i5), num);
                                    }
                                    zzez.zzf("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(str6)));
                                    break;
                                }
                                num = null;
                                if (num == null) {
                                }
                            }
                        }
                        break;
                    case 5:
                        String str7 = zzamVar.zzj;
                        zzs zzsVar2 = zzamVar.zzy;
                        if (split.length >= 4) {
                            try {
                                int parseInt5 = Integer.parseInt(split[1]);
                                int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                                int parseInt7 = Integer.parseInt(split[3]);
                                if (parseInt5 != 0) {
                                    zzez.zzf("MediaCodecUtil", "Unknown AV1 profile: " + parseInt5);
                                    break;
                                } else {
                                    if (parseInt7 == 8) {
                                        i6 = 1;
                                    } else if (parseInt7 != 10) {
                                        zzez.zzf("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt7);
                                        break;
                                    } else {
                                        i6 = (zzsVar2 == null || !(zzsVar2.zzg != null || (i8 = zzsVar2.zzf) == 7 || i8 == 6)) ? 2 : 4096;
                                    }
                                    switch (parseInt6) {
                                        case 0:
                                            i12 = 1;
                                            i7 = -1;
                                            break;
                                        case 1:
                                            i7 = -1;
                                            break;
                                        case 2:
                                            i12 = 4;
                                            i7 = -1;
                                            break;
                                        case 3:
                                            i12 = 8;
                                            i7 = -1;
                                            break;
                                        case 4:
                                            i7 = -1;
                                            i12 = 16;
                                            break;
                                        case 5:
                                            i12 = 32;
                                            i7 = -1;
                                            break;
                                        case 6:
                                            i7 = -1;
                                            i12 = 64;
                                            break;
                                        case 7:
                                            i12 = 128;
                                            i7 = -1;
                                            break;
                                        case 8:
                                            i7 = -1;
                                            i12 = 256;
                                            break;
                                        case 9:
                                            i12 = 512;
                                            i7 = -1;
                                            break;
                                        case 10:
                                            i7 = -1;
                                            i12 = 1024;
                                            break;
                                        case 11:
                                            i7 = -1;
                                            i12 = 2048;
                                            break;
                                        case 12:
                                            i7 = -1;
                                            i12 = 4096;
                                            break;
                                        case 13:
                                            i12 = 8192;
                                            i7 = -1;
                                            break;
                                        case 14:
                                            i12 = 16384;
                                            i7 = -1;
                                            break;
                                        case 15:
                                            i12 = 32768;
                                            i7 = -1;
                                            break;
                                        case 16:
                                            i12 = 65536;
                                            i7 = -1;
                                            break;
                                        case 17:
                                            i12 = 131072;
                                            i7 = -1;
                                            break;
                                        case 18:
                                            i12 = 262144;
                                            i7 = -1;
                                            break;
                                        case 19:
                                            i12 = 524288;
                                            i7 = -1;
                                            break;
                                        case 20:
                                            i12 = 1048576;
                                            i7 = -1;
                                            break;
                                        case 21:
                                            i12 = 2097152;
                                            i7 = -1;
                                            break;
                                        case 22:
                                            i12 = 4194304;
                                            i7 = -1;
                                            break;
                                        case 23:
                                            i12 = 8388608;
                                            i7 = -1;
                                            break;
                                        default:
                                            i7 = -1;
                                            i12 = -1;
                                            break;
                                    }
                                    if (i12 != i7) {
                                        return new Pair(Integer.valueOf(i6), Integer.valueOf(i12));
                                    }
                                    zzez.zzf("MediaCodecUtil", "Unknown AV1 level: " + parseInt6);
                                    break;
                                }
                            } catch (NumberFormatException unused3) {
                                zzez.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str7)));
                                break;
                            }
                        } else {
                            zzez.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str7)));
                            break;
                        }
                        break;
                    case 6:
                        String str8 = zzamVar.zzj;
                        if (split.length == 3) {
                            try {
                                if ("audio/mp4a-latm".equals(zzce.zzd(Integer.parseInt(split[1], 16)))) {
                                    int parseInt8 = Integer.parseInt(split[2]);
                                    if (parseInt8 == 17) {
                                        i9 = 17;
                                    } else if (parseInt8 == 20) {
                                        i9 = 20;
                                    } else if (parseInt8 == 23) {
                                        i9 = 23;
                                    } else if (parseInt8 == 29) {
                                        i9 = 29;
                                    } else if (parseInt8 == 39) {
                                        i9 = 39;
                                    } else if (parseInt8 != 42) {
                                        switch (parseInt8) {
                                            case 1:
                                                i9 = 1;
                                                break;
                                            case 2:
                                                i9 = 2;
                                                break;
                                            case 3:
                                                i9 = 3;
                                                break;
                                            case 4:
                                                i9 = 4;
                                                break;
                                            case 5:
                                                i10 = -1;
                                                i9 = 5;
                                                break;
                                            case 6:
                                                i10 = -1;
                                                i9 = 6;
                                                break;
                                            default:
                                                i10 = -1;
                                                i9 = -1;
                                                break;
                                        }
                                        if (i9 != i10) {
                                            return new Pair(Integer.valueOf(i9), 0);
                                        }
                                    } else {
                                        i9 = 42;
                                    }
                                    i10 = -1;
                                    if (i9 != i10) {
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                zzez.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                                break;
                            }
                        } else {
                            zzez.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                            break;
                        }
                        break;
                }
            } else {
                String str9 = zzamVar.zzj;
                if (split.length < 3) {
                    zzez.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str9)));
                } else {
                    Matcher matcher2 = zzb.matcher(split[1]);
                    if (matcher2.matches()) {
                        String group2 = matcher2.group(1);
                        if (group2 != null) {
                            switch (group2.hashCode()) {
                                case 1536:
                                    if (group2.equals("00")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1537:
                                    if (group2.equals("01")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1538:
                                    if (group2.equals("02")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1539:
                                    if (group2.equals("03")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1540:
                                    if (group2.equals("04")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1541:
                                    if (group2.equals("05")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1542:
                                    if (group2.equals("06")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1543:
                                    if (group2.equals("07")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1544:
                                    if (group2.equals("08")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1545:
                                    if (group2.equals("09")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    num2 = 1;
                                    break;
                                case 1:
                                    num2 = 2;
                                    break;
                                case 2:
                                    num2 = 4;
                                    break;
                                case 3:
                                    num2 = 8;
                                    break;
                                case 4:
                                    num2 = 16;
                                    break;
                                case 5:
                                    num2 = 32;
                                    break;
                                case 6:
                                    num2 = 64;
                                    break;
                                case 7:
                                    num2 = 128;
                                    break;
                                case '\b':
                                    num2 = 256;
                                    break;
                                case '\t':
                                    num2 = 512;
                                    break;
                            }
                            if (num2 != null) {
                                zzez.zzf("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group2)));
                            } else {
                                String str10 = split[2];
                                if (str10 != null) {
                                    int hashCode = str10.hashCode();
                                    switch (hashCode) {
                                        case 1537:
                                            if (str10.equals("01")) {
                                                num3 = 1;
                                                break;
                                            }
                                            break;
                                        case 1538:
                                            if (str10.equals("02")) {
                                                num3 = 2;
                                                break;
                                            }
                                            break;
                                        case 1539:
                                            if (str10.equals("03")) {
                                                num3 = 4;
                                                break;
                                            }
                                            break;
                                        case 1540:
                                            if (str10.equals("04")) {
                                                num3 = 8;
                                                break;
                                            }
                                            break;
                                        case 1541:
                                            if (str10.equals("05")) {
                                                num3 = 16;
                                                break;
                                            }
                                            break;
                                        case 1542:
                                            if (str10.equals("06")) {
                                                num3 = 32;
                                                break;
                                            }
                                            break;
                                        case 1543:
                                            if (str10.equals("07")) {
                                                num3 = 64;
                                                break;
                                            }
                                            break;
                                        case 1544:
                                            if (str10.equals("08")) {
                                                num3 = 128;
                                                break;
                                            }
                                            break;
                                        case 1545:
                                            if (str10.equals("09")) {
                                                num3 = 256;
                                                break;
                                            }
                                            break;
                                        default:
                                            switch (hashCode) {
                                                case 1567:
                                                    if (str10.equals("10")) {
                                                        num3 = 512;
                                                        break;
                                                    }
                                                    break;
                                                case 1568:
                                                    if (str10.equals("11")) {
                                                        num3 = 1024;
                                                        break;
                                                    }
                                                    break;
                                                case 1569:
                                                    if (str10.equals("12")) {
                                                        num3 = 2048;
                                                        break;
                                                    }
                                                    break;
                                                case 1570:
                                                    if (str10.equals("13")) {
                                                        num3 = 4096;
                                                        break;
                                                    }
                                                    break;
                                            }
                                    }
                                    if (num3 == null) {
                                        return new Pair(num2, num3);
                                    }
                                    zzez.zzf("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str10)));
                                }
                                num3 = null;
                                if (num3 == null) {
                                }
                            }
                        }
                        num2 = null;
                        if (num2 != null) {
                        }
                    } else {
                        zzez.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str9)));
                    }
                }
            }
        }
        return null;
    }

    public static zzsn zzc(String str, boolean z, boolean z2) throws zztb {
        List zzg = zzg(str, false, false);
        if (zzg.isEmpty()) {
            return null;
        }
        return (zzsn) zzg.get(0);
    }

    public static zzsn zzd() throws zztb {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzam zzamVar) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzamVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzamVar.zzm) || (zzb2 = zzb(zzamVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List zzf(zzsu zzsuVar, zzam zzamVar, boolean z, boolean z2) throws zztb {
        String zze = zze(zzamVar);
        return zze == null ? zzfwu.zzl() : zzg(zze, z, z2);
    }

    public static synchronized List zzg(String str, boolean z, boolean z2) throws zztb {
        int i;
        synchronized (zzth.class) {
            zzsz zzszVar = new zzsz(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzszVar);
            if (list != null) {
                return list;
            }
            ArrayList zzj = zzj(zzszVar, zzfs.zza >= 21 ? new zztf(z, z2) : new zzte(null));
            if (z && zzj.isEmpty() && (i = zzfs.zza) >= 21 && i <= 23) {
                zzj = zzj(zzszVar, new zzte(null));
                if (!zzj.isEmpty()) {
                    zzez.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzsn) zzj.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzfs.zza < 26 && zzfs.zzb.equals("R9") && zzj.size() == 1 && ((zzsn) zzj.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzj.add(zzsn.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzk(zzj, new zztg() { // from class: com.google.android.gms.internal.ads.zzsw
                    @Override // com.google.android.gms.internal.ads.zztg
                    public final int zza(Object obj) {
                        int i2 = zzth.zza;
                        String str2 = ((zzsn) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzfs.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (zzfs.zza < 21 && zzj.size() > 1) {
                String str2 = ((zzsn) zzj.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                    zzk(zzj, new zztg() { // from class: com.google.android.gms.internal.ads.zzsx
                        @Override // com.google.android.gms.internal.ads.zztg
                        public final int zza(Object obj) {
                            int i2 = zzth.zza;
                            return ((zzsn) obj).zza.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (zzfs.zza < 32 && zzj.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsn) zzj.get(0)).zza)) {
                zzj.add((zzsn) zzj.remove(0));
            }
            zzfwu zzj2 = zzfwu.zzj(zzj);
            hashMap.put(zzszVar, zzj2);
            return zzj2;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzh(zzsu zzsuVar, zzam zzamVar, boolean z, boolean z2) throws zztb {
        List zzg = zzg(zzamVar.zzm, z, z2);
        List zzf = zzf(zzsuVar, zzamVar, z, z2);
        zzfwr zzfwrVar = new zzfwr();
        zzfwrVar.zzh(zzg);
        zzfwrVar.zzh(zzf);
        return zzfwrVar.zzi();
    }

    public static List zzi(List list, final zzam zzamVar) {
        ArrayList arrayList = new ArrayList(list);
        zzk(arrayList, new zztg() { // from class: com.google.android.gms.internal.ads.zzsy
            @Override // com.google.android.gms.internal.ads.zztg
            public final int zza(Object obj) {
                int i = zzth.zza;
                return ((zzsn) obj).zzd(zzam.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:102|103|(1:105)(2:166|(1:168)(1:169))|106|(1:108)(2:158|(1:165)(1:164))|(4:(2:152|153)|132|(8:135|136|137|138|139|140|141|143)|11)|112|113|114|115|11) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0279, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027a, code lost:
    
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x025b, code lost:
    
        if (r1.zzb == false) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020c A[Catch: Exception -> 0x02b9, TryCatch #2 {Exception -> 0x02b9, blocks: (B:95:0x01da, B:99:0x01f1, B:103:0x0206, B:105:0x020c, B:106:0x021d, B:108:0x0227, B:110:0x0253, B:158:0x022c, B:160:0x023c, B:162:0x0244, B:166:0x0212), top: B:94:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0227 A[Catch: Exception -> 0x02b9, TryCatch #2 {Exception -> 0x02b9, blocks: (B:95:0x01da, B:99:0x01f1, B:103:0x0206, B:105:0x020c, B:106:0x021d, B:108:0x0227, B:110:0x0253, B:158:0x022c, B:160:0x023c, B:162:0x0244, B:166:0x0212), top: B:94:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c8 A[Catch: Exception -> 0x0316, TRY_ENTER, TryCatch #4 {Exception -> 0x0316, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0034, B:16:0x0042, B:18:0x0048, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0066, B:28:0x006e, B:30:0x0076, B:32:0x007e, B:35:0x0086, B:37:0x008e, B:39:0x0096, B:41:0x009e, B:43:0x00a8, B:45:0x00b2, B:47:0x00bc, B:49:0x00c6, B:51:0x00d0, B:53:0x00da, B:55:0x00e4, B:57:0x00ee, B:60:0x00f6, B:62:0x00fe, B:64:0x0106, B:66:0x0110, B:68:0x011a, B:70:0x0122, B:72:0x012c, B:74:0x0136, B:76:0x013a, B:78:0x0142, B:80:0x014a, B:82:0x0150, B:84:0x0158, B:86:0x0160, B:88:0x0169, B:118:0x02c0, B:121:0x02c8, B:123:0x02ce, B:126:0x02e8, B:127:0x0309, B:90:0x0173, B:178:0x0178, B:180:0x0180, B:183:0x018b, B:185:0x0193, B:189:0x019e, B:191:0x01a6, B:194:0x01b1, B:196:0x01b9, B:199:0x01c4, B:201:0x01cc), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022c A[Catch: Exception -> 0x02b9, TryCatch #2 {Exception -> 0x02b9, blocks: (B:95:0x01da, B:99:0x01f1, B:103:0x0206, B:105:0x020c, B:106:0x021d, B:108:0x0227, B:110:0x0253, B:158:0x022c, B:160:0x023c, B:162:0x0244, B:166:0x0212), top: B:94:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0212 A[Catch: Exception -> 0x02b9, TryCatch #2 {Exception -> 0x02b9, blocks: (B:95:0x01da, B:99:0x01f1, B:103:0x0206, B:105:0x020c, B:106:0x021d, B:108:0x0227, B:110:0x0253, B:158:0x022c, B:160:0x023c, B:162:0x0244, B:166:0x0212), top: B:94:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzj(zzsz zzszVar, zztc zztcVar) throws zztb {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        String str4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zzd2;
        boolean zzc2;
        boolean isHardwareAccelerated;
        boolean zzl;
        boolean z;
        String str5;
        zzsz zzszVar2 = zzszVar;
        zztc zztcVar2 = zztcVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = zzszVar2.zza;
            int zza2 = zztcVar.zza();
            boolean zze = zztcVar.zze();
            int i3 = 0;
            while (i3 < zza2) {
                MediaCodecInfo zzb2 = zztcVar2.zzb(i3);
                if (zzfs.zza < 29 || !zzb2.isAlias()) {
                    String name = zzb2.getName();
                    if (!zzb2.isEncoder() && ((zze || !name.endsWith(".secure")) && ((zzfs.zza >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((zzfs.zza >= 24 || ((!"OMX.SEC.aac.dec".equals(name) && !"OMX.Exynos.AAC.Decoder".equals(name)) || !"samsung".equals(zzfs.zzc) || (!zzfs.zzb.startsWith("zeroflte") && !zzfs.zzb.startsWith("zerolte") && !zzfs.zzb.startsWith("zenlte") && !"SC-05G".equals(zzfs.zzb) && !"marinelteatt".equals(zzfs.zzb) && !"404SC".equals(zzfs.zzb) && !"SC-04G".equals(zzfs.zzb) && !"SCV31".equals(zzfs.zzb)))) && ((zzfs.zza > 19 || !"OMX.SEC.vp8.dec".equals(name) || !"samsung".equals(zzfs.zzc) || (!zzfs.zzb.startsWith("d2") && !zzfs.zzb.startsWith("serrano") && !zzfs.zzb.startsWith("jflte") && !zzfs.zzb.startsWith("santos") && !zzfs.zzb.startsWith("t0"))) && ((zzfs.zza > 19 || !zzfs.zzb.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) && (zzfs.zza > 23 || !"audio/eac3-joc".equals(str6) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)))))))) {
                        String[] supportedTypes = zzb2.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                str = supportedTypes[i4];
                                if (str.equalsIgnoreCase(str6)) {
                                    break;
                                }
                                i4++;
                            } else if (str6.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = "video/dv_hevc";
                                    }
                                    str2 = null;
                                }
                            } else if (str6.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str6.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str6.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str2 = null;
                            }
                        }
                        str2 = str;
                        if (str2 != null) {
                            try {
                                capabilitiesForType = zzb2.getCapabilitiesForType(str2);
                                zzd2 = zztcVar2.zzd("tunneled-playback", str2, capabilitiesForType);
                                zzc2 = zztcVar2.zzc("tunneled-playback", str2, capabilitiesForType);
                            } catch (Exception e) {
                                e = e;
                                str3 = name;
                                i = i3;
                                i2 = zza2;
                                str4 = str6;
                            }
                            if (zzszVar2.zzc) {
                                if (!zzd2) {
                                }
                                boolean zzd3 = zztcVar2.zzd("secure-playback", str2, capabilitiesForType);
                                boolean zzc3 = zztcVar2.zzc("secure-playback", str2, capabilitiesForType);
                                if (zzszVar2.zzb) {
                                }
                            } else if (!zzc2) {
                                boolean zzd32 = zztcVar2.zzd("secure-playback", str2, capabilitiesForType);
                                boolean zzc32 = zztcVar2.zzc("secure-playback", str2, capabilitiesForType);
                                if (zzszVar2.zzb) {
                                    if (!zzc32) {
                                        isHardwareAccelerated = zzfs.zza < 29 ? zzb2.isHardwareAccelerated() : !zzl(zzb2, str6);
                                        zzl = zzl(zzb2, str6);
                                        if (zzfs.zza < 29) {
                                            z = zzb2.isVendor();
                                        } else {
                                            String zza3 = zzftf.zza(zzb2.getName());
                                            z = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                        }
                                        if (zze || zzszVar2.zzb != zzd32) {
                                            if (!zze) {
                                                try {
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    i = i3;
                                                    i2 = zza2;
                                                    str4 = str6;
                                                    str3 = name;
                                                    if (zzfs.zza > 23 || arrayList.isEmpty()) {
                                                        zzez.zzc("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                        throw e;
                                                    }
                                                    zzez.zzc("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                                    i3 = i + 1;
                                                    zzszVar2 = zzszVar;
                                                    str6 = str4;
                                                    zza2 = i2;
                                                    zztcVar2 = zztcVar;
                                                }
                                            }
                                            str5 = name;
                                            i = i3;
                                            i2 = zza2;
                                            str4 = str6;
                                            if (!zze && zzd32) {
                                                StringBuilder sb = new StringBuilder();
                                                try {
                                                    sb.append(str5);
                                                    sb.append(".secure");
                                                    str3 = str5;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    str3 = str5;
                                                }
                                                try {
                                                    arrayList.add(zzsn.zzc(sb.toString(), str4, str2, capabilitiesForType, isHardwareAccelerated, zzl, z, false, true));
                                                    break;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    if (zzfs.zza > 23) {
                                                    }
                                                    zzez.zzc("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                    throw e;
                                                }
                                            }
                                            i3 = i + 1;
                                            zzszVar2 = zzszVar;
                                            str6 = str4;
                                            zza2 = i2;
                                            zztcVar2 = zztcVar;
                                        }
                                        str5 = name;
                                        i = i3;
                                        i2 = zza2;
                                        str4 = str6;
                                        arrayList.add(zzsn.zzc(name, str6, str2, capabilitiesForType, isHardwareAccelerated, zzl, z, false, false));
                                        i3 = i + 1;
                                        zzszVar2 = zzszVar;
                                        str6 = str4;
                                        zza2 = i2;
                                        zztcVar2 = zztcVar;
                                    }
                                } else if (zzd32) {
                                    zzd32 = true;
                                    if (zzfs.zza < 29) {
                                    }
                                    zzl = zzl(zzb2, str6);
                                    if (zzfs.zza < 29) {
                                    }
                                    if (zze) {
                                    }
                                    if (!zze) {
                                    }
                                    str5 = name;
                                    i = i3;
                                    i2 = zza2;
                                    str4 = str6;
                                    if (!zze) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str5);
                                        sb2.append(".secure");
                                        str3 = str5;
                                        arrayList.add(zzsn.zzc(sb2.toString(), str4, str2, capabilitiesForType, isHardwareAccelerated, zzl, z, false, true));
                                        break;
                                        break;
                                    }
                                    continue;
                                    i3 = i + 1;
                                    zzszVar2 = zzszVar;
                                    str6 = str4;
                                    zza2 = i2;
                                    zztcVar2 = zztcVar;
                                }
                            }
                        }
                    }
                }
                i = i3;
                i2 = zza2;
                str4 = str6;
                i3 = i + 1;
                zzszVar2 = zzszVar;
                str6 = str4;
                zza2 = i2;
                zztcVar2 = zztcVar;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new zztb(e5, null);
        }
    }

    private static void zzk(List list, final zztg zztgVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzsv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zzth.zza;
                zztg zztgVar2 = zztg.this;
                return zztgVar2.zza(obj2) - zztgVar2.zza(obj);
            }
        });
    }

    private static boolean zzl(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzfs.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzce.zzf(str)) {
            return true;
        }
        String zza2 = zzftf.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}
