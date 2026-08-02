package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zztc {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x04e9, code lost:
    
        if (r1.equals("L90") != false) goto L315;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zza(zzaf zzafVar) {
        char c;
        int parseInt;
        int parseInt2;
        int i;
        Pair pair;
        int i2;
        Integer num;
        Pair pair2;
        int i3;
        int i4;
        int i5;
        Integer num2;
        Integer num3;
        String str = zzafVar.zzj;
        if (str != null) {
            String[] split = str.split("\\.");
            int i6 = 3;
            int i7 = 2;
            if (!"video/dolby-vision".equals(zzafVar.zzm)) {
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
                        String str3 = zzafVar.zzj;
                        int length = split.length;
                        if (length >= 2) {
                            try {
                                if (split[1].length() != 6) {
                                    if (length < 3) {
                                        zzea.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str3);
                                        break;
                                    } else {
                                        parseInt = Integer.parseInt(split[1]);
                                        parseInt2 = Integer.parseInt(split[2]);
                                    }
                                } else {
                                    parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                    parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                                }
                                if (parseInt == 66) {
                                    i7 = 1;
                                } else if (parseInt != 77) {
                                    i7 = parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : 16 : 8 : 4;
                                }
                                if (i7 == -1) {
                                    zzea.zzf("MediaCodecUtil", "Unknown AVC profile: " + parseInt);
                                    break;
                                } else {
                                    switch (parseInt2) {
                                        case 10:
                                            i = 1;
                                            break;
                                        case 11:
                                            i = 4;
                                            break;
                                        case 12:
                                            i = 8;
                                            break;
                                        case 13:
                                            i = 16;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 20:
                                                    i = 32;
                                                    break;
                                                case 21:
                                                    i = 64;
                                                    break;
                                                case 22:
                                                    i = 128;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 30:
                                                            i = 256;
                                                            break;
                                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                                            i = 512;
                                                            break;
                                                        case 32:
                                                            i = 1024;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 40:
                                                                    i = 2048;
                                                                    break;
                                                                case 41:
                                                                    i = 4096;
                                                                    break;
                                                                case 42:
                                                                    i = 8192;
                                                                    break;
                                                                default:
                                                                    switch (parseInt2) {
                                                                        case 50:
                                                                            i = 16384;
                                                                            break;
                                                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                                            i = 32768;
                                                                            break;
                                                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                                                            i = 65536;
                                                                            break;
                                                                        default:
                                                                            i = -1;
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                    if (i != -1) {
                                        pair = new Pair(Integer.valueOf(i7), Integer.valueOf(i));
                                        return pair;
                                    }
                                    zzea.zzf("MediaCodecUtil", "Unknown AVC level: " + parseInt2);
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                zzea.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str3)));
                                break;
                            }
                        } else {
                            zzea.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str3)));
                            break;
                        }
                    case 2:
                        String str4 = zzafVar.zzj;
                        if (split.length >= 3) {
                            try {
                                int parseInt3 = Integer.parseInt(split[1]);
                                int parseInt4 = Integer.parseInt(split[2]);
                                int i8 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                                if (i8 == -1) {
                                    zzea.zzf("MediaCodecUtil", "Unknown VP9 profile: " + parseInt3);
                                    break;
                                } else {
                                    if (parseInt4 == 10) {
                                        i7 = 1;
                                    } else if (parseInt4 != 11) {
                                        if (parseInt4 == 20) {
                                            i7 = 4;
                                        } else if (parseInt4 == 21) {
                                            i7 = 8;
                                        } else if (parseInt4 == 30) {
                                            i7 = 16;
                                        } else if (parseInt4 == 31) {
                                            i7 = 32;
                                        } else if (parseInt4 == 40) {
                                            i7 = 64;
                                        } else if (parseInt4 == 41) {
                                            i7 = 128;
                                        } else if (parseInt4 == 50) {
                                            i7 = 256;
                                        } else if (parseInt4 != 51) {
                                            switch (parseInt4) {
                                                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                                    i7 = 2048;
                                                    break;
                                                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                                    i7 = 4096;
                                                    break;
                                                case 62:
                                                    i7 = 8192;
                                                    break;
                                                default:
                                                    i7 = -1;
                                                    break;
                                            }
                                        } else {
                                            i7 = 512;
                                        }
                                    }
                                    if (i7 != -1) {
                                        pair = new Pair(Integer.valueOf(i8), Integer.valueOf(i7));
                                        return pair;
                                    }
                                    zzea.zzf("MediaCodecUtil", "Unknown VP9 level: " + parseInt4);
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                zzea.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str4)));
                                break;
                            }
                        } else {
                            zzea.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str4)));
                            break;
                        }
                    case 3:
                    case 4:
                        String str5 = zzafVar.zzj;
                        zzo zzoVar = zzafVar.zzy;
                        if (split.length < 4) {
                            zzea.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str5)));
                            break;
                        } else {
                            Matcher matcher = zzb.matcher(split[1]);
                            if (!matcher.matches()) {
                                zzea.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str5)));
                                break;
                            } else {
                                String group = matcher.group(1);
                                if (!"1".equals(group)) {
                                    if (!"2".equals(group)) {
                                        zzea.zzf("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                                        break;
                                    } else {
                                        i2 = (zzoVar == null || zzoVar.zzd != 6) ? 2 : 4096;
                                    }
                                } else {
                                    i2 = 1;
                                }
                                String str6 = split[3];
                                if (str6 != null) {
                                    switch (str6.hashCode()) {
                                        case 70821:
                                            if (str6.equals("H30")) {
                                                i6 = 13;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 70914:
                                            if (str6.equals("H60")) {
                                                i6 = 14;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 70917:
                                            if (str6.equals("H63")) {
                                                i6 = 15;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 71007:
                                            if (str6.equals("H90")) {
                                                i6 = 16;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 71010:
                                            if (str6.equals("H93")) {
                                                i6 = 17;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 74665:
                                            if (str6.equals("L30")) {
                                                i6 = 0;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 74758:
                                            if (str6.equals("L60")) {
                                                i6 = 1;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 74761:
                                            if (str6.equals("L63")) {
                                                i6 = 2;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 74851:
                                            break;
                                        case 74854:
                                            if (str6.equals("L93")) {
                                                i6 = 4;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2193639:
                                            if (str6.equals("H120")) {
                                                i6 = 18;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2193642:
                                            if (str6.equals("H123")) {
                                                i6 = 19;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2193732:
                                            if (str6.equals("H150")) {
                                                i6 = 20;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2193735:
                                            if (str6.equals("H153")) {
                                                i6 = 21;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2193738:
                                            if (str6.equals("H156")) {
                                                i6 = 22;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2193825:
                                            if (str6.equals("H180")) {
                                                i6 = 23;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2193828:
                                            if (str6.equals("H183")) {
                                                i6 = 24;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2193831:
                                            if (str6.equals("H186")) {
                                                i6 = 25;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2312803:
                                            if (str6.equals("L120")) {
                                                i6 = 5;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2312806:
                                            if (str6.equals("L123")) {
                                                i6 = 6;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2312896:
                                            if (str6.equals("L150")) {
                                                i6 = 7;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2312899:
                                            if (str6.equals("L153")) {
                                                i6 = 8;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2312902:
                                            if (str6.equals("L156")) {
                                                i6 = 9;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2312989:
                                            if (str6.equals("L180")) {
                                                i6 = 10;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2312992:
                                            if (str6.equals("L183")) {
                                                i6 = 11;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 2312995:
                                            if (str6.equals("L186")) {
                                                i6 = 12;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        default:
                                            i6 = -1;
                                            break;
                                    }
                                    switch (i6) {
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
                                        case 8:
                                            num = 65536;
                                            break;
                                        case 9:
                                            num = 262144;
                                            break;
                                        case 10:
                                            num = 1048576;
                                            break;
                                        case 11:
                                            num = 4194304;
                                            break;
                                        case 12:
                                            num = 16777216;
                                            break;
                                        case 13:
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
                                        pair2 = new Pair(Integer.valueOf(i2), num);
                                        return pair2;
                                    }
                                    zzea.zzf("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(str6)));
                                    break;
                                }
                                num = null;
                                if (num == null) {
                                }
                            }
                        }
                        break;
                    case 5:
                        String str7 = zzafVar.zzj;
                        zzo zzoVar2 = zzafVar.zzy;
                        if (split.length >= 4) {
                            try {
                                int parseInt5 = Integer.parseInt(split[1]);
                                int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                                int parseInt7 = Integer.parseInt(split[3]);
                                if (parseInt5 != 0) {
                                    zzea.zzf("MediaCodecUtil", "Unknown AV1 profile: " + parseInt5);
                                    break;
                                } else {
                                    if (parseInt7 == 8) {
                                        i3 = 1;
                                    } else if (parseInt7 != 10) {
                                        zzea.zzf("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt7);
                                        break;
                                    } else {
                                        i3 = (zzoVar2 == null || !(zzoVar2.zze != null || (i5 = zzoVar2.zzd) == 7 || i5 == 6)) ? 2 : 4096;
                                    }
                                    switch (parseInt6) {
                                        case 0:
                                            i4 = 1;
                                            break;
                                        case 1:
                                            i4 = 2;
                                            break;
                                        case 2:
                                            i4 = 4;
                                            break;
                                        case 3:
                                            i4 = 8;
                                            break;
                                        case 4:
                                            i4 = 16;
                                            break;
                                        case 5:
                                            i4 = 32;
                                            break;
                                        case 6:
                                            i4 = 64;
                                            break;
                                        case 7:
                                            i4 = 128;
                                            break;
                                        case 8:
                                            i4 = 256;
                                            break;
                                        case 9:
                                            i4 = 512;
                                            break;
                                        case 10:
                                            i4 = 1024;
                                            break;
                                        case 11:
                                            i4 = 2048;
                                            break;
                                        case 12:
                                            i4 = 4096;
                                            break;
                                        case 13:
                                            i4 = 8192;
                                            break;
                                        case 14:
                                            i4 = 16384;
                                            break;
                                        case 15:
                                            i4 = 32768;
                                            break;
                                        case 16:
                                            i4 = 65536;
                                            break;
                                        case 17:
                                            i4 = 131072;
                                            break;
                                        case 18:
                                            i4 = 262144;
                                            break;
                                        case 19:
                                            i4 = 524288;
                                            break;
                                        case 20:
                                            i4 = 1048576;
                                            break;
                                        case 21:
                                            i4 = 2097152;
                                            break;
                                        case 22:
                                            i4 = 4194304;
                                            break;
                                        case 23:
                                            i4 = 8388608;
                                            break;
                                        default:
                                            i4 = -1;
                                            break;
                                    }
                                    if (i4 != -1) {
                                        return new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
                                    }
                                    zzea.zzf("MediaCodecUtil", "Unknown AV1 level: " + parseInt6);
                                    break;
                                }
                            } catch (NumberFormatException unused3) {
                                zzea.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str7)));
                                break;
                            }
                        } else {
                            zzea.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str7)));
                            break;
                        }
                        break;
                    case 6:
                        String str8 = zzafVar.zzj;
                        if (split.length == 3) {
                            try {
                                if ("audio/mp4a-latm".equals(zzbn.zzd(Integer.parseInt(split[1], 16)))) {
                                    int parseInt8 = Integer.parseInt(split[2]);
                                    if (parseInt8 == 17) {
                                        i6 = 17;
                                    } else if (parseInt8 == 20) {
                                        i6 = 20;
                                    } else if (parseInt8 == 23) {
                                        i6 = 23;
                                    } else if (parseInt8 == 29) {
                                        i6 = 29;
                                    } else if (parseInt8 == 39) {
                                        i6 = 39;
                                    } else if (parseInt8 != 42) {
                                        switch (parseInt8) {
                                            case 1:
                                                i6 = 1;
                                                break;
                                            case 2:
                                                i6 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i6 = 4;
                                                break;
                                            case 5:
                                                i6 = 5;
                                                break;
                                            case 6:
                                                i6 = 6;
                                                break;
                                            default:
                                                i6 = -1;
                                                break;
                                        }
                                    } else {
                                        i6 = 42;
                                    }
                                    if (i6 != -1) {
                                        pair2 = new Pair(Integer.valueOf(i6), 0);
                                        return pair2;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                zzea.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                                break;
                            }
                        } else {
                            zzea.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                            break;
                        }
                        break;
                }
            } else {
                String str9 = zzafVar.zzj;
                if (split.length < 3) {
                    zzea.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str9)));
                } else {
                    Matcher matcher2 = zzb.matcher(split[1]);
                    if (matcher2.matches()) {
                        String group2 = matcher2.group(1);
                        if (group2 != null) {
                            int hashCode = group2.hashCode();
                            if (hashCode != 1567) {
                                switch (hashCode) {
                                    case 1536:
                                        if (group2.equals("00")) {
                                            num2 = 1;
                                            break;
                                        }
                                        break;
                                    case 1537:
                                        if (group2.equals("01")) {
                                            num2 = 2;
                                            break;
                                        }
                                        break;
                                    case 1538:
                                        if (group2.equals("02")) {
                                            num2 = 4;
                                            break;
                                        }
                                        break;
                                    case 1539:
                                        if (group2.equals("03")) {
                                            num2 = 8;
                                            break;
                                        }
                                        break;
                                    case 1540:
                                        if (group2.equals("04")) {
                                            num2 = 16;
                                            break;
                                        }
                                        break;
                                    case 1541:
                                        if (group2.equals("05")) {
                                            num2 = 32;
                                            break;
                                        }
                                        break;
                                    case 1542:
                                        if (group2.equals("06")) {
                                            num2 = 64;
                                            break;
                                        }
                                        break;
                                    case 1543:
                                        if (group2.equals("07")) {
                                            num2 = 128;
                                            break;
                                        }
                                        break;
                                    case 1544:
                                        if (group2.equals("08")) {
                                            num2 = 256;
                                            break;
                                        }
                                        break;
                                    case 1545:
                                        if (group2.equals("09")) {
                                            num2 = 512;
                                            break;
                                        }
                                        break;
                                }
                                if (num2 == null) {
                                    zzea.zzf("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group2)));
                                } else {
                                    String str10 = split[2];
                                    if (str10 != null) {
                                        int hashCode2 = str10.hashCode();
                                        switch (hashCode2) {
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
                                                switch (hashCode2) {
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
                                        zzea.zzf("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str10)));
                                    }
                                    num3 = null;
                                    if (num3 == null) {
                                    }
                                }
                            } else if (group2.equals("10")) {
                                num2 = 1024;
                                if (num2 == null) {
                                }
                            }
                        }
                        num2 = null;
                        if (num2 == null) {
                        }
                    } else {
                        zzea.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str9)));
                    }
                }
            }
        }
        return null;
    }

    public static zzsf zzb() throws zzsw {
        List zze = zze("audio/raw", false, false);
        if (zze.isEmpty()) {
            return null;
        }
        return (zzsf) zze.get(0);
    }

    public static String zzc(zzaf zzafVar) {
        Pair zza2;
        if ("audio/eac3-joc".equals(zzafVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzafVar.zzm) || (zza2 = zza(zzafVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zza2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        if (intValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    public static List zzd(zzsq zzsqVar, zzaf zzafVar, boolean z, boolean z2) throws zzsw {
        String zzc2 = zzc(zzafVar);
        return zzc2 == null ? zzfxr.zzm() : zze(zzc2, z, z2);
    }

    public static synchronized List zze(String str, boolean z, boolean z2) throws zzsw {
        synchronized (zztc.class) {
            zzsu zzsuVar = new zzsu(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzsuVar);
            if (list != null) {
                return list;
            }
            int i = zzet.zza;
            ArrayList zzh = zzh(zzsuVar, new zzta(z, z2));
            if (z && zzh.isEmpty() && zzet.zza <= 23) {
                zzh = zzh(zzsuVar, new zzsz(null));
                if (!zzh.isEmpty()) {
                    zzea.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzsf) zzh.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzet.zza < 26 && zzet.zzb.equals("R9") && zzh.size() == 1 && ((zzsf) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzsf.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, new zztb() { // from class: com.google.android.gms.internal.ads.zzss
                    @Override // com.google.android.gms.internal.ads.zztb
                    public final int zza(Object obj) {
                        int i2 = zztc.zza;
                        String str2 = ((zzsf) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzet.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (zzet.zza < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsf) zzh.get(0)).zza)) {
                zzh.add((zzsf) zzh.remove(0));
            }
            zzfxr zzk = zzfxr.zzk(zzh);
            hashMap.put(zzsuVar, zzk);
            return zzk;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzf(zzsq zzsqVar, zzaf zzafVar, boolean z, boolean z2) throws zzsw {
        List zze = zze(zzafVar.zzm, z, z2);
        List zzd = zzd(zzsqVar, zzafVar, z, z2);
        zzfxo zzfxoVar = new zzfxo();
        zzfxoVar.zzh(zze);
        zzfxoVar.zzh(zzd);
        return zzfxoVar.zzi();
    }

    public static List zzg(List list, final zzaf zzafVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zztb() { // from class: com.google.android.gms.internal.ads.zzst
            @Override // com.google.android.gms.internal.ads.zztb
            public final int zza(Object obj) {
                int i = zztc.zza;
                return ((zzsf) obj).zzd(zzaf.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:129|(1:131)(1:132))|68|(1:70)(2:121|(1:128)(1:127))|(4:(2:115|116)|95|(8:98|99|100|101|102|103|104|106)|11)|74|75|76|77|11) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01bf, code lost:
    
        if (r1.zzb == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01dd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0192 A[Catch: Exception -> 0x021e, TryCatch #1 {Exception -> 0x021e, blocks: (B:57:0x0143, B:61:0x015a, B:65:0x016e, B:67:0x0174, B:68:0x0183, B:70:0x018d, B:72:0x01b7, B:121:0x0192, B:123:0x01a2, B:125:0x01aa, B:129:0x017a), top: B:56:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017a A[Catch: Exception -> 0x021e, TryCatch #1 {Exception -> 0x021e, blocks: (B:57:0x0143, B:61:0x015a, B:65:0x016e, B:67:0x0174, B:68:0x0183, B:70:0x018d, B:72:0x01b7, B:121:0x0192, B:123:0x01a2, B:125:0x01aa, B:129:0x017a), top: B:56:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0174 A[Catch: Exception -> 0x021e, TryCatch #1 {Exception -> 0x021e, blocks: (B:57:0x0143, B:61:0x015a, B:65:0x016e, B:67:0x0174, B:68:0x0183, B:70:0x018d, B:72:0x01b7, B:121:0x0192, B:123:0x01a2, B:125:0x01aa, B:129:0x017a), top: B:56:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d A[Catch: Exception -> 0x021e, TryCatch #1 {Exception -> 0x021e, blocks: (B:57:0x0143, B:61:0x015a, B:65:0x016e, B:67:0x0174, B:68:0x0183, B:70:0x018d, B:72:0x01b7, B:121:0x0192, B:123:0x01a2, B:125:0x01aa, B:129:0x017a), top: B:56:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022d A[Catch: Exception -> 0x027b, TRY_ENTER, TryCatch #4 {Exception -> 0x027b, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0033, B:16:0x0041, B:18:0x0047, B:20:0x004d, B:22:0x0055, B:24:0x005d, B:26:0x0067, B:28:0x0071, B:30:0x007b, B:32:0x0085, B:34:0x008f, B:36:0x0099, B:38:0x00a3, B:40:0x00ad, B:42:0x00b7, B:44:0x00bd, B:46:0x00c5, B:48:0x00cd, B:50:0x00d5, B:81:0x0225, B:84:0x022d, B:86:0x0233, B:89:0x024d, B:90:0x026e, B:52:0x00de, B:141:0x00e1, B:143:0x00e9, B:146:0x00f4, B:148:0x00fc, B:152:0x0107, B:154:0x010f, B:157:0x011a, B:159:0x0122, B:162:0x012d, B:164:0x0135), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024d A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzh(zzsu zzsuVar, zzsx zzsxVar) throws zzsw {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zzd;
        boolean zzc2;
        boolean z;
        boolean zzj;
        boolean z2;
        String str4;
        boolean isHardwareAccelerated;
        boolean isAlias;
        zzsu zzsuVar2 = zzsuVar;
        zzsx zzsxVar2 = zzsxVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zzsuVar2.zza;
            int zza2 = zzsxVar.zza();
            boolean zze = zzsxVar.zze();
            int i3 = 0;
            while (i3 < zza2) {
                MediaCodecInfo zzb2 = zzsxVar2.zzb(i3);
                if (zzet.zza >= 29) {
                    isAlias = zzb2.isAlias();
                }
                String name = zzb2.getName();
                if (!zzb2.isEncoder() && ((zze || !name.endsWith(".secure")) && ((zzet.zza >= 24 || ((!"OMX.SEC.aac.dec".equals(name) && !"OMX.Exynos.AAC.Decoder".equals(name)) || !"samsung".equals(zzet.zzc) || (!zzet.zzb.startsWith("zeroflte") && !zzet.zzb.startsWith("zerolte") && !zzet.zzb.startsWith("zenlte") && !"SC-05G".equals(zzet.zzb) && !"marinelteatt".equals(zzet.zzb) && !"404SC".equals(zzet.zzb) && !"SC-04G".equals(zzet.zzb) && !"SCV31".equals(zzet.zzb)))) && (zzet.zza > 23 || !"audio/eac3-joc".equals(str5) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))))) {
                    String[] supportedTypes = zzb2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            str = supportedTypes[i4];
                            if (str.equalsIgnoreCase(str5)) {
                                break;
                            }
                            i4++;
                        } else if (str5.equals("video/dolby-vision")) {
                            if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                str = "video/hevcdv";
                            } else {
                                if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                    str = "video/dv_hevc";
                                }
                                str = null;
                            }
                        } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                            str = "audio/x-lg-alac";
                        } else if (str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                            str = "audio/x-lg-flac";
                        } else {
                            if (str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                str = "audio/lg-ac3";
                            }
                            str = null;
                        }
                    }
                    if (str != null) {
                        try {
                            capabilitiesForType = zzb2.getCapabilitiesForType(str);
                            zzd = zzsxVar2.zzd("tunneled-playback", str, capabilitiesForType);
                            zzc2 = zzsxVar2.zzc("tunneled-playback", str, capabilitiesForType);
                        } catch (Exception e) {
                            e = e;
                            str2 = name;
                            i = i3;
                            i2 = zza2;
                            str3 = str5;
                        }
                        if (zzsuVar2.zzc) {
                            if (!zzd) {
                            }
                            boolean zzd2 = zzsxVar2.zzd("secure-playback", str, capabilitiesForType);
                            boolean zzc3 = zzsxVar2.zzc("secure-playback", str, capabilitiesForType);
                            if (zzsuVar2.zzb) {
                            }
                        } else if (!zzc2) {
                            boolean zzd22 = zzsxVar2.zzd("secure-playback", str, capabilitiesForType);
                            boolean zzc32 = zzsxVar2.zzc("secure-playback", str, capabilitiesForType);
                            if (zzsuVar2.zzb) {
                                if (!zzc32) {
                                    if (zzet.zza < 29) {
                                        isHardwareAccelerated = zzb2.isHardwareAccelerated();
                                        z = isHardwareAccelerated;
                                    } else {
                                        z = !zzj(zzb2, str5);
                                    }
                                    zzj = zzj(zzb2, str5);
                                    if (zzet.zza < 29) {
                                        z2 = zzb2.isVendor();
                                    } else {
                                        String zza3 = zzfuf.zza(zzb2.getName());
                                        z2 = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                    }
                                    if (zze || zzsuVar2.zzb != zzd22) {
                                        if (!zze) {
                                            try {
                                            } catch (Exception e2) {
                                                e = e2;
                                                str4 = name;
                                                i = i3;
                                                i2 = zza2;
                                                str3 = str5;
                                                str2 = str4;
                                                if (zzet.zza > 23 || arrayList.isEmpty()) {
                                                    zzea.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                zzea.zzc("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i3 = i + 1;
                                                zzsuVar2 = zzsuVar;
                                                str5 = str3;
                                                zza2 = i2;
                                                zzsxVar2 = zzsxVar;
                                            }
                                        }
                                        str4 = name;
                                        i = i3;
                                        i2 = zza2;
                                        str3 = str5;
                                        if (!zze && zzd22) {
                                            StringBuilder sb = new StringBuilder();
                                            try {
                                                sb.append(str4);
                                                sb.append(".secure");
                                                str2 = str4;
                                            } catch (Exception e3) {
                                                e = e3;
                                                str2 = str4;
                                            }
                                            try {
                                                arrayList.add(zzsf.zzc(sb.toString(), str3, str, capabilitiesForType, z, zzj, z2, false, true));
                                                break;
                                            } catch (Exception e4) {
                                                e = e4;
                                                if (zzet.zza > 23) {
                                                }
                                                zzea.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        }
                                        i3 = i + 1;
                                        zzsuVar2 = zzsuVar;
                                        str5 = str3;
                                        zza2 = i2;
                                        zzsxVar2 = zzsxVar;
                                    }
                                    str4 = name;
                                    i = i3;
                                    i2 = zza2;
                                    str3 = str5;
                                    arrayList.add(zzsf.zzc(name, str5, str, capabilitiesForType, z, zzj, z2, false, false));
                                    i3 = i + 1;
                                    zzsuVar2 = zzsuVar;
                                    str5 = str3;
                                    zza2 = i2;
                                    zzsxVar2 = zzsxVar;
                                }
                            } else if (zzd22) {
                                zzd22 = true;
                                if (zzet.zza < 29) {
                                }
                                zzj = zzj(zzb2, str5);
                                if (zzet.zza < 29) {
                                }
                                if (zze) {
                                }
                                if (!zze) {
                                }
                                str4 = name;
                                i = i3;
                                i2 = zza2;
                                str3 = str5;
                                if (!zze) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str4);
                                    sb2.append(".secure");
                                    str2 = str4;
                                    arrayList.add(zzsf.zzc(sb2.toString(), str3, str, capabilitiesForType, z, zzj, z2, false, true));
                                    break;
                                    break;
                                }
                                continue;
                                i3 = i + 1;
                                zzsuVar2 = zzsuVar;
                                str5 = str3;
                                zza2 = i2;
                                zzsxVar2 = zzsxVar;
                            }
                        }
                    }
                }
                i = i3;
                i2 = zza2;
                str3 = str5;
                i3 = i + 1;
                zzsuVar2 = zzsuVar;
                str5 = str3;
                zza2 = i2;
                zzsxVar2 = zzsxVar;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new zzsw(e5, null);
        }
    }

    private static void zzi(List list, final zztb zztbVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzsr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zztc.zza;
                zztb zztbVar2 = zztb.this;
                return zztbVar2.zza(obj2) - zztbVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzet.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (zzbn.zzg(str)) {
            return true;
        }
        String zza2 = zzfuf.zza(mediaCodecInfo.getName());
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
