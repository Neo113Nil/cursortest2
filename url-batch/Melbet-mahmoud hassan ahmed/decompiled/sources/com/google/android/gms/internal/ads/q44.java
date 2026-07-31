package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class q44 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f10575a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<i44, List<z34>> f10576b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static int f10577c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f10578d = 0;

    public static int a() {
        int i7;
        if (f10577c == -1) {
            int i8 = 0;
            z34 c7 = c("video/avc", false, false);
            if (c7 != null) {
                MediaCodecInfo.CodecProfileLevel[] g7 = c7.g();
                int length = g7.length;
                int i9 = 0;
                while (i8 < length) {
                    int i10 = g7[i8].level;
                    if (i10 != 1 && i10 != 2) {
                        switch (i10) {
                            case c4.w0.f2150p /* 8 */:
                            case 16:
                            case 32:
                                i7 = 101376;
                                break;
                            case 64:
                                i7 = 202752;
                                break;
                            case 128:
                            case 256:
                                i7 = 414720;
                                break;
                            case 512:
                                i7 = 921600;
                                break;
                            case 1024:
                                i7 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i7 = 2097152;
                                break;
                            case 8192:
                                i7 = 2228224;
                                break;
                            case 16384:
                                i7 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i7 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i7 = 35651584;
                                break;
                            default:
                                i7 = -1;
                                break;
                        }
                    } else {
                        i7 = 25344;
                    }
                    i9 = Math.max(i7, i9);
                    i8++;
                }
                i8 = Math.max(i9, n13.f8865a >= 21 ? 345600 : 172800);
            }
            f10577c = i8;
        }
        return f10577c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e9 A[Catch: NumberFormatException -> 0x02f9, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x02f9, blocks: (B:140:0x028e, B:142:0x02a0, B:153:0x02bc, B:156:0x02e9), top: B:139:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0713  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> b(c0 c0Var) {
        char c7;
        String valueOf;
        String str;
        String str2;
        int parseInt;
        int parseInt2;
        int i7;
        int i8;
        String valueOf2;
        String str3;
        String str4;
        int i9;
        String valueOf3;
        String str5;
        String str6;
        int i10;
        char c8;
        Integer num;
        int i11;
        String valueOf4;
        String str7;
        String str8;
        int i12;
        int i13;
        StringBuilder sb;
        int i14;
        String valueOf5;
        String str9;
        String str10;
        int i15;
        int i16;
        char c9;
        Integer num2;
        Integer num3;
        int i17;
        String valueOf6;
        String str11;
        String str12;
        String str13 = c0Var.f3657i;
        if (str13 == null) {
            return null;
        }
        String[] split = str13.split("\\.");
        int i18 = 2;
        int i19 = 1;
        if ("video/dolby-vision".equals(c0Var.f3660l)) {
            String str14 = c0Var.f3657i;
            if (split.length < 3) {
                valueOf6 = String.valueOf(str14);
                str11 = "Ignoring malformed Dolby Vision codec string: ";
                if (valueOf6.length() == 0) {
                    str12 = new String("Ignoring malformed Dolby Vision codec string: ");
                    Log.w("MediaCodecUtil", str12);
                    return null;
                }
                str12 = str11.concat(valueOf6);
                Log.w("MediaCodecUtil", str12);
                return null;
            }
            Matcher matcher = f10575a.matcher(split[1]);
            if (!matcher.matches()) {
                valueOf6 = String.valueOf(str14);
                str11 = "Ignoring malformed Dolby Vision codec string: ";
                if (valueOf6.length() == 0) {
                    str12 = new String("Ignoring malformed Dolby Vision codec string: ");
                    Log.w("MediaCodecUtil", str12);
                    return null;
                }
                str12 = str11.concat(valueOf6);
                Log.w("MediaCodecUtil", str12);
                return null;
            }
            String group = matcher.group(1);
            if (group != null) {
                switch (group.hashCode()) {
                    case 1536:
                        if (group.equals("00")) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1537:
                        if (group.equals("01")) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            c9 = 4;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            c9 = 5;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            c9 = 6;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            c9 = 7;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            c9 = '\b';
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            c9 = '\t';
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                switch (c9) {
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
                    case c4.w0.f2149o /* 7 */:
                        num2 = 128;
                        break;
                    case c4.w0.f2150p /* 8 */:
                        num2 = 256;
                        break;
                    case '\t':
                        num2 = 512;
                        break;
                }
                if (num2 != null) {
                    valueOf6 = String.valueOf(group);
                    str11 = "Unknown Dolby Vision profile string: ";
                    if (valueOf6.length() == 0) {
                        str12 = new String("Unknown Dolby Vision profile string: ");
                        Log.w("MediaCodecUtil", str12);
                        return null;
                    }
                    str12 = str11.concat(valueOf6);
                    Log.w("MediaCodecUtil", str12);
                    return null;
                }
                String str15 = split[2];
                if (str15 != null) {
                    int hashCode = str15.hashCode();
                    switch (hashCode) {
                        case 1537:
                            if (str15.equals("01")) {
                                num3 = 1;
                                break;
                            }
                            break;
                        case 1538:
                            if (str15.equals("02")) {
                                num3 = 2;
                                break;
                            }
                            break;
                        case 1539:
                            if (str15.equals("03")) {
                                num3 = 4;
                                break;
                            }
                            break;
                        case 1540:
                            if (str15.equals("04")) {
                                num3 = 8;
                                break;
                            }
                            break;
                        case 1541:
                            if (str15.equals("05")) {
                                num3 = 16;
                                break;
                            }
                            break;
                        case 1542:
                            if (str15.equals("06")) {
                                num3 = 32;
                                break;
                            }
                            break;
                        case 1543:
                            if (str15.equals("07")) {
                                num3 = 64;
                                break;
                            }
                            break;
                        case 1544:
                            if (str15.equals("08")) {
                                num3 = 128;
                                break;
                            }
                            break;
                        case 1545:
                            if (str15.equals("09")) {
                                num3 = 256;
                                break;
                            }
                            break;
                        default:
                            switch (hashCode) {
                                case 1567:
                                    if (str15.equals("10")) {
                                        num3 = 512;
                                        break;
                                    }
                                    break;
                                case 1568:
                                    if (str15.equals("11")) {
                                        i17 = 1024;
                                        num3 = Integer.valueOf(i17);
                                        break;
                                    }
                                    break;
                                case 1569:
                                    if (str15.equals("12")) {
                                        i17 = 2048;
                                        num3 = Integer.valueOf(i17);
                                        break;
                                    }
                                    break;
                                case 1570:
                                    if (str15.equals("13")) {
                                        num3 = 4096;
                                        break;
                                    }
                                    break;
                            }
                    }
                    if (num3 == null) {
                        return new Pair<>(num2, num3);
                    }
                    valueOf6 = String.valueOf(str15);
                    str11 = "Unknown Dolby Vision level string: ";
                    if (valueOf6.length() == 0) {
                        str12 = new String("Unknown Dolby Vision level string: ");
                        Log.w("MediaCodecUtil", str12);
                        return null;
                    }
                    str12 = str11.concat(valueOf6);
                    Log.w("MediaCodecUtil", str12);
                    return null;
                }
                num3 = null;
                if (num3 == null) {
                }
            }
            num2 = null;
            if (num2 != null) {
            }
        } else {
            String str16 = split[0];
            switch (str16.hashCode()) {
                case 3004662:
                    if (str16.equals("av01")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3006243:
                    if (str16.equals("avc1")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3006244:
                    if (str16.equals("avc2")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3199032:
                    if (str16.equals("hev1")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3214780:
                    if (str16.equals("hvc1")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3356560:
                    if (str16.equals("mp4a")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3624515:
                    if (str16.equals("vp09")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                case 1:
                    String str17 = c0Var.f3657i;
                    int length = split.length;
                    if (length < 2) {
                        valueOf = String.valueOf(str17);
                        str = "Ignoring malformed AVC codec string: ";
                        if (valueOf.length() == 0) {
                            str2 = new String("Ignoring malformed AVC codec string: ");
                            Log.w("MediaCodecUtil", str2);
                            return null;
                        }
                        str2 = str.concat(valueOf);
                        Log.w("MediaCodecUtil", str2);
                        return null;
                    }
                    try {
                    } catch (NumberFormatException unused) {
                        valueOf = String.valueOf(str17);
                        str = "Ignoring malformed AVC codec string: ";
                        if (valueOf.length() == 0) {
                            str2 = new String("Ignoring malformed AVC codec string: ");
                        }
                    }
                    if (split[1].length() == 6) {
                        parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                        parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                    } else {
                        if (length < 3) {
                            String valueOf7 = String.valueOf(str17);
                            Log.w("MediaCodecUtil", valueOf7.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf7) : new String("Ignoring malformed AVC codec string: "));
                            return null;
                        }
                        parseInt = Integer.parseInt(split[1]);
                        parseInt2 = Integer.parseInt(split[2]);
                    }
                    if (parseInt == 66) {
                        i7 = -1;
                        i18 = 1;
                    } else if (parseInt == 77) {
                        i7 = -1;
                    } else if (parseInt == 88) {
                        i7 = -1;
                        i18 = 4;
                    } else if (parseInt == 100) {
                        i7 = -1;
                        i18 = 8;
                    } else if (parseInt == 110) {
                        i7 = -1;
                        i18 = 16;
                    } else if (parseInt == 122) {
                        i7 = -1;
                        i18 = 32;
                    } else if (parseInt != 244) {
                        i7 = -1;
                        i18 = -1;
                    } else {
                        i7 = -1;
                        i18 = 64;
                    }
                    if (i18 == i7) {
                        StringBuilder sb2 = new StringBuilder(32);
                        sb2.append("Unknown AVC profile: ");
                        sb2.append(parseInt);
                        str2 = sb2.toString();
                    } else {
                        switch (parseInt2) {
                            case 10:
                                i8 = 1;
                                break;
                            case 11:
                                i8 = 4;
                                break;
                            case 12:
                                i8 = 8;
                                break;
                            case 13:
                                i8 = 16;
                                break;
                            default:
                                switch (parseInt2) {
                                    case 20:
                                        i8 = 32;
                                        break;
                                    case 21:
                                        i8 = 64;
                                        break;
                                    case 22:
                                        i8 = 128;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 30:
                                                i8 = 256;
                                                break;
                                            case 31:
                                                i8 = 512;
                                                break;
                                            case 32:
                                                i8 = 1024;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case 40:
                                                        i8 = 2048;
                                                        break;
                                                    case 41:
                                                        i8 = 4096;
                                                        break;
                                                    case 42:
                                                        i8 = 8192;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 50:
                                                                i8 = 16384;
                                                                break;
                                                            case 51:
                                                                i8 = 32768;
                                                                break;
                                                            case 52:
                                                                i8 = 65536;
                                                                break;
                                                            default:
                                                                i8 = -1;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                        if (i8 != -1) {
                            return new Pair<>(Integer.valueOf(i18), Integer.valueOf(i8));
                        }
                        StringBuilder sb3 = new StringBuilder(30);
                        sb3.append("Unknown AVC level: ");
                        sb3.append(parseInt2);
                        str2 = sb3.toString();
                    }
                    Log.w("MediaCodecUtil", str2);
                    return null;
                case 2:
                    String str18 = c0Var.f3657i;
                    if (split.length < 3) {
                        valueOf2 = String.valueOf(str18);
                        str3 = "Ignoring malformed VP9 codec string: ";
                        if (valueOf2.length() == 0) {
                            str4 = new String("Ignoring malformed VP9 codec string: ");
                            Log.w("MediaCodecUtil", str4);
                            return null;
                        }
                        str4 = str3.concat(valueOf2);
                        Log.w("MediaCodecUtil", str4);
                        return null;
                    }
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2]);
                        int i20 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i20 == -1) {
                            StringBuilder sb4 = new StringBuilder(32);
                            sb4.append("Unknown VP9 profile: ");
                            sb4.append(parseInt3);
                            str4 = sb4.toString();
                        } else {
                            if (parseInt4 != 10) {
                                if (parseInt4 == 11) {
                                    i9 = -1;
                                    i19 = 2;
                                } else if (parseInt4 == 20) {
                                    i9 = -1;
                                    i19 = 4;
                                } else if (parseInt4 == 21) {
                                    i9 = -1;
                                    i19 = 8;
                                } else if (parseInt4 == 30) {
                                    i9 = -1;
                                    i19 = 16;
                                } else if (parseInt4 == 31) {
                                    i9 = -1;
                                    i19 = 32;
                                } else if (parseInt4 == 40) {
                                    i9 = -1;
                                    i19 = 64;
                                } else if (parseInt4 == 41) {
                                    i9 = -1;
                                    i19 = 128;
                                } else if (parseInt4 == 50) {
                                    i9 = -1;
                                    i19 = 256;
                                } else if (parseInt4 != 51) {
                                    switch (parseInt4) {
                                        case 60:
                                            i9 = -1;
                                            i19 = 2048;
                                            break;
                                        case 61:
                                            i9 = -1;
                                            i19 = 4096;
                                            break;
                                        case 62:
                                            i19 = 8192;
                                            break;
                                        default:
                                            i9 = -1;
                                            i19 = -1;
                                            break;
                                    }
                                } else {
                                    i9 = -1;
                                    i19 = 512;
                                }
                                if (i19 == i9) {
                                    return new Pair<>(Integer.valueOf(i20), Integer.valueOf(i19));
                                }
                                StringBuilder sb5 = new StringBuilder(30);
                                sb5.append("Unknown VP9 level: ");
                                sb5.append(parseInt4);
                                str4 = sb5.toString();
                            }
                            i9 = -1;
                            if (i19 == i9) {
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        valueOf2 = String.valueOf(str18);
                        str3 = "Ignoring malformed VP9 codec string: ";
                        if (valueOf2.length() == 0) {
                            str4 = new String("Ignoring malformed VP9 codec string: ");
                        }
                    }
                    Log.w("MediaCodecUtil", str4);
                    return null;
                case 3:
                case 4:
                    String str19 = c0Var.f3657i;
                    if (split.length < 4) {
                        valueOf3 = String.valueOf(str19);
                        str5 = "Ignoring malformed HEVC codec string: ";
                        if (valueOf3.length() == 0) {
                            str6 = new String("Ignoring malformed HEVC codec string: ");
                            Log.w("MediaCodecUtil", str6);
                            return null;
                        }
                        str6 = str5.concat(valueOf3);
                        Log.w("MediaCodecUtil", str6);
                        return null;
                    }
                    Matcher matcher2 = f10575a.matcher(split[1]);
                    if (!matcher2.matches()) {
                        valueOf3 = String.valueOf(str19);
                        str5 = "Ignoring malformed HEVC codec string: ";
                        if (valueOf3.length() == 0) {
                            str6 = new String("Ignoring malformed HEVC codec string: ");
                            Log.w("MediaCodecUtil", str6);
                            return null;
                        }
                        str6 = str5.concat(valueOf3);
                        Log.w("MediaCodecUtil", str6);
                        return null;
                    }
                    String group2 = matcher2.group(1);
                    if ("1".equals(group2)) {
                        i10 = 1;
                    } else {
                        if (!"2".equals(group2)) {
                            valueOf3 = String.valueOf(group2);
                            str5 = "Unknown HEVC profile string: ";
                            if (valueOf3.length() == 0) {
                                str6 = new String("Unknown HEVC profile string: ");
                                Log.w("MediaCodecUtil", str6);
                                return null;
                            }
                            str6 = str5.concat(valueOf3);
                            Log.w("MediaCodecUtil", str6);
                            return null;
                        }
                        i10 = 2;
                    }
                    String str20 = split[3];
                    if (str20 != null) {
                        switch (str20.hashCode()) {
                            case 70821:
                                if (str20.equals("H30")) {
                                    c8 = '\r';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 70914:
                                if (str20.equals("H60")) {
                                    c8 = 14;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 70917:
                                if (str20.equals("H63")) {
                                    c8 = 15;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 71007:
                                if (str20.equals("H90")) {
                                    c8 = 16;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 71010:
                                if (str20.equals("H93")) {
                                    c8 = 17;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 74665:
                                if (str20.equals("L30")) {
                                    c8 = 0;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 74758:
                                if (str20.equals("L60")) {
                                    c8 = 1;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 74761:
                                if (str20.equals("L63")) {
                                    c8 = 2;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 74851:
                                if (str20.equals("L90")) {
                                    c8 = 3;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 74854:
                                if (str20.equals("L93")) {
                                    c8 = 4;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2193639:
                                if (str20.equals("H120")) {
                                    c8 = 18;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2193642:
                                if (str20.equals("H123")) {
                                    c8 = 19;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2193732:
                                if (str20.equals("H150")) {
                                    c8 = 20;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2193735:
                                if (str20.equals("H153")) {
                                    c8 = 21;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2193738:
                                if (str20.equals("H156")) {
                                    c8 = 22;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2193825:
                                if (str20.equals("H180")) {
                                    c8 = 23;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2193828:
                                if (str20.equals("H183")) {
                                    c8 = 24;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2193831:
                                if (str20.equals("H186")) {
                                    c8 = 25;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2312803:
                                if (str20.equals("L120")) {
                                    c8 = 5;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2312806:
                                if (str20.equals("L123")) {
                                    c8 = 6;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2312896:
                                if (str20.equals("L150")) {
                                    c8 = 7;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2312899:
                                if (str20.equals("L153")) {
                                    c8 = '\b';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2312902:
                                if (str20.equals("L156")) {
                                    c8 = '\t';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2312989:
                                if (str20.equals("L180")) {
                                    c8 = '\n';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2312992:
                                if (str20.equals("L183")) {
                                    c8 = 11;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2312995:
                                if (str20.equals("L186")) {
                                    c8 = '\f';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            default:
                                c8 = 65535;
                                break;
                        }
                        switch (c8) {
                            case 0:
                                num = 1;
                                break;
                            case 1:
                                num = 4;
                                break;
                            case 2:
                                i11 = 16;
                                num = Integer.valueOf(i11);
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
                            case c4.w0.f2149o /* 7 */:
                                i11 = 16384;
                                num = Integer.valueOf(i11);
                                break;
                            case c4.w0.f2150p /* 8 */:
                                i11 = 65536;
                                num = Integer.valueOf(i11);
                                break;
                            case '\t':
                                i11 = 262144;
                                num = Integer.valueOf(i11);
                                break;
                            case '\n':
                                i11 = 1048576;
                                num = Integer.valueOf(i11);
                                break;
                            case 11:
                                i11 = 4194304;
                                num = Integer.valueOf(i11);
                                break;
                            case '\f':
                                i11 = 16777216;
                                num = Integer.valueOf(i11);
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
                                i11 = 2048;
                                num = Integer.valueOf(i11);
                                break;
                            case 19:
                                i11 = 8192;
                                num = Integer.valueOf(i11);
                                break;
                            case 20:
                                i11 = 32768;
                                num = Integer.valueOf(i11);
                                break;
                            case 21:
                                i11 = 131072;
                                num = Integer.valueOf(i11);
                                break;
                            case 22:
                                i11 = 524288;
                                num = Integer.valueOf(i11);
                                break;
                            case 23:
                                i11 = 2097152;
                                num = Integer.valueOf(i11);
                                break;
                            case 24:
                                i11 = 8388608;
                                num = Integer.valueOf(i11);
                                break;
                            case 25:
                                i11 = 33554432;
                                num = Integer.valueOf(i11);
                                break;
                        }
                        if (num == null) {
                            return new Pair<>(Integer.valueOf(i10), num);
                        }
                        valueOf3 = String.valueOf(str20);
                        str5 = "Unknown HEVC level string: ";
                        if (valueOf3.length() == 0) {
                            str6 = new String("Unknown HEVC level string: ");
                            Log.w("MediaCodecUtil", str6);
                            return null;
                        }
                        str6 = str5.concat(valueOf3);
                        Log.w("MediaCodecUtil", str6);
                        return null;
                    }
                    num = null;
                    if (num == null) {
                    }
                case 5:
                    String str21 = c0Var.f3657i;
                    p14 p14Var = c0Var.f3672x;
                    if (split.length < 4) {
                        valueOf4 = String.valueOf(str21);
                        str7 = "Ignoring malformed AV1 codec string: ";
                        if (valueOf4.length() == 0) {
                            str8 = new String("Ignoring malformed AV1 codec string: ");
                            Log.w("MediaCodecUtil", str8);
                            return null;
                        }
                        str8 = str7.concat(valueOf4);
                        Log.w("MediaCodecUtil", str8);
                        return null;
                    }
                    try {
                        int parseInt5 = Integer.parseInt(split[1]);
                        int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt7 = Integer.parseInt(split[3]);
                        if (parseInt5 != 0) {
                            sb = new StringBuilder(32);
                            sb.append("Unknown AV1 profile: ");
                            sb.append(parseInt5);
                        } else {
                            if (parseInt7 == 8) {
                                i12 = 1;
                            } else if (parseInt7 != 10) {
                                sb = new StringBuilder(34);
                                sb.append("Unknown AV1 bit depth: ");
                                sb.append(parseInt7);
                            } else {
                                i12 = (p14Var == null || !(p14Var.f9998d != null || (i14 = p14Var.f9997c) == 7 || i14 == 6)) ? 2 : 4096;
                            }
                            switch (parseInt6) {
                                case 0:
                                    i13 = 1;
                                    break;
                                case 1:
                                    i13 = 2;
                                    break;
                                case 2:
                                    i13 = 4;
                                    break;
                                case 3:
                                    i13 = 8;
                                    break;
                                case 4:
                                    i13 = 16;
                                    break;
                                case 5:
                                    i13 = 32;
                                    break;
                                case 6:
                                    i13 = 64;
                                    break;
                                case c4.w0.f2149o /* 7 */:
                                    i13 = 128;
                                    break;
                                case c4.w0.f2150p /* 8 */:
                                    i13 = 256;
                                    break;
                                case 9:
                                    i13 = 512;
                                    break;
                                case 10:
                                    i13 = 1024;
                                    break;
                                case 11:
                                    i13 = 2048;
                                    break;
                                case 12:
                                    i13 = 4096;
                                    break;
                                case 13:
                                    i13 = 8192;
                                    break;
                                case 14:
                                    i13 = 16384;
                                    break;
                                case 15:
                                    i13 = 32768;
                                    break;
                                case 16:
                                    i13 = 65536;
                                    break;
                                case 17:
                                    i13 = 131072;
                                    break;
                                case 18:
                                    i13 = 262144;
                                    break;
                                case 19:
                                    i13 = 524288;
                                    break;
                                case 20:
                                    i13 = 1048576;
                                    break;
                                case 21:
                                    i13 = 2097152;
                                    break;
                                case 22:
                                    i13 = 4194304;
                                    break;
                                case 23:
                                    i13 = 8388608;
                                    break;
                                default:
                                    i13 = -1;
                                    break;
                            }
                            if (i13 != -1) {
                                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i13));
                            }
                            sb = new StringBuilder(30);
                            sb.append("Unknown AV1 level: ");
                            sb.append(parseInt6);
                        }
                        str8 = sb.toString();
                    } catch (NumberFormatException unused3) {
                        valueOf4 = String.valueOf(str21);
                        str7 = "Ignoring malformed AV1 codec string: ";
                        if (valueOf4.length() == 0) {
                            str8 = new String("Ignoring malformed AV1 codec string: ");
                        }
                    }
                    Log.w("MediaCodecUtil", str8);
                    return null;
                case 6:
                    String str22 = c0Var.f3657i;
                    if (split.length != 3) {
                        valueOf5 = String.valueOf(str22);
                        str9 = "Ignoring malformed MP4A codec string: ";
                        if (valueOf5.length() == 0) {
                            str10 = new String("Ignoring malformed MP4A codec string: ");
                            Log.w("MediaCodecUtil", str10);
                            return null;
                        }
                        str10 = str9.concat(valueOf5);
                        Log.w("MediaCodecUtil", str10);
                        return null;
                    }
                    try {
                        if ("audio/mp4a-latm".equals(dy.d(Integer.parseInt(split[1], 16)))) {
                            int parseInt8 = Integer.parseInt(split[2]);
                            if (parseInt8 != 17) {
                                if (parseInt8 == 20) {
                                    i16 = -1;
                                    i15 = 20;
                                } else if (parseInt8 == 23) {
                                    i15 = 23;
                                } else if (parseInt8 == 29) {
                                    i15 = 29;
                                } else if (parseInt8 == 39) {
                                    i15 = 39;
                                } else if (parseInt8 != 42) {
                                    switch (parseInt8) {
                                        case 1:
                                            i16 = -1;
                                            i15 = 1;
                                            break;
                                        case 2:
                                            i16 = -1;
                                            i15 = 2;
                                            break;
                                        case 3:
                                            i16 = -1;
                                            i15 = 3;
                                            break;
                                        case 4:
                                            i16 = -1;
                                            i15 = 4;
                                            break;
                                        case 5:
                                            i16 = -1;
                                            i15 = 5;
                                            break;
                                        case 6:
                                            i16 = -1;
                                            i15 = 6;
                                            break;
                                        default:
                                            i16 = -1;
                                            i15 = -1;
                                            break;
                                    }
                                } else {
                                    i15 = 42;
                                }
                                if (i15 != i16) {
                                    return new Pair<>(Integer.valueOf(i15), 0);
                                }
                            } else {
                                i15 = 17;
                            }
                            i16 = -1;
                            if (i15 != i16) {
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        valueOf5 = String.valueOf(str22);
                        str9 = "Ignoring malformed MP4A codec string: ";
                        if (valueOf5.length() == 0) {
                            str10 = new String("Ignoring malformed MP4A codec string: ");
                        }
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    public static z34 c(String str, boolean z6, boolean z7) {
        List<z34> e7 = e(str, false, false);
        if (e7.isEmpty()) {
            return null;
        }
        return e7.get(0);
    }

    public static z34 d() {
        return c("audio/raw", false, false);
    }

    public static synchronized List<z34> e(String str, boolean z6, boolean z7) {
        synchronized (q44.class) {
            i44 i44Var = new i44(str, z6, z7);
            HashMap<i44, List<z34>> hashMap = f10576b;
            List<z34> list = hashMap.get(i44Var);
            if (list != null) {
                return list;
            }
            int i7 = n13.f8865a;
            ArrayList<z34> g7 = g(i44Var, i7 >= 21 ? new o44(z6, z7) : new n44(null));
            if (z6 && g7.isEmpty() && i7 >= 21 && i7 <= 23) {
                g7 = g(i44Var, new n44(null));
                if (!g7.isEmpty()) {
                    String str2 = g7.get(0).f14931a;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (i7 < 26 && n13.f8866b.equals("R9") && g7.size() == 1 && g7.get(0).f14931a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    g7.add(z34.c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                h(g7, new p44() { // from class: com.google.android.gms.internal.ads.f44
                    @Override // com.google.android.gms.internal.ads.p44
                    public final int c(Object obj) {
                        int i8 = q44.f10578d;
                        String str3 = ((z34) obj).f14931a;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (n13.f8865a >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (i7 < 21 && g7.size() > 1) {
                String str3 = g7.get(0).f14931a;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    h(g7, new p44() { // from class: com.google.android.gms.internal.ads.g44
                        @Override // com.google.android.gms.internal.ads.p44
                        public final int c(Object obj) {
                            int i8 = q44.f10578d;
                            return ((z34) obj).f14931a.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (i7 < 32 && g7.size() > 1 && "OMX.qti.audio.decoder.flac".equals(g7.get(0).f14931a)) {
                g7.add(g7.remove(0));
            }
            List<z34> unmodifiableList = Collections.unmodifiableList(g7);
            hashMap.put(i44Var, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static List<z34> f(List<z34> list, final c0 c0Var) {
        ArrayList arrayList = new ArrayList(list);
        h(arrayList, new p44() { // from class: com.google.android.gms.internal.ads.e44
            @Override // com.google.android.gms.internal.ads.p44
            public final int c(Object obj) {
                c0 c0Var2 = c0.this;
                z34 z34Var = (z34) obj;
                int i7 = q44.f10578d;
                try {
                    return !z34Var.d(c0Var2) ? 0 : 1;
                } catch (k44 unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x019b, code lost:
    
        if ("SCV31".equals(r5) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d9, code lost:
    
        if (r8.startsWith("t0") == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        if (r11.startsWith("HM") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010f, code lost:
    
        if ("SO-02E".equals(r11) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013b, code lost:
    
        if ("C1605".equals(r10) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0292 A[Catch: Exception -> 0x031c, TryCatch #0 {Exception -> 0x031c, blocks: (B:139:0x0261, B:143:0x0278, B:147:0x028c, B:149:0x0292, B:150:0x02a0, B:152:0x02a8, B:154:0x02d2, B:176:0x02d8, B:187:0x02ad, B:189:0x02bd, B:191:0x02c5, B:195:0x0297), top: B:138:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a8 A[Catch: Exception -> 0x031c, TryCatch #0 {Exception -> 0x031c, blocks: (B:139:0x0261, B:143:0x0278, B:147:0x028c, B:149:0x0292, B:150:0x02a0, B:152:0x02a8, B:154:0x02d2, B:176:0x02d8, B:187:0x02ad, B:189:0x02bd, B:191:0x02c5, B:195:0x0297), top: B:138:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ad A[Catch: Exception -> 0x031c, TryCatch #0 {Exception -> 0x031c, blocks: (B:139:0x0261, B:143:0x0278, B:147:0x028c, B:149:0x0292, B:150:0x02a0, B:152:0x02a8, B:154:0x02d2, B:176:0x02d8, B:187:0x02ad, B:189:0x02bd, B:191:0x02c5, B:195:0x0297), top: B:138:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0297 A[Catch: Exception -> 0x031c, TryCatch #0 {Exception -> 0x031c, blocks: (B:139:0x0261, B:143:0x0278, B:147:0x028c, B:149:0x0292, B:150:0x02a0, B:152:0x02a8, B:154:0x02d2, B:176:0x02d8, B:187:0x02ad, B:189:0x02bd, B:191:0x02c5, B:195:0x0297), top: B:138:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<z34> g(i44 i44Var, l44 l44Var) {
        String str;
        String str2;
        String str3;
        int i7;
        int i8;
        String str4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean a7;
        boolean c7;
        int i9;
        boolean isHardwareAccelerated;
        boolean i10;
        boolean z6;
        l44 l44Var2 = l44Var;
        try {
            ArrayList<z34> arrayList = new ArrayList<>();
            String str5 = i44Var.f6535a;
            int zza = l44Var.zza();
            boolean b7 = l44Var.b();
            int i11 = 0;
            while (i11 < zza) {
                MediaCodecInfo F = l44Var2.F(i11);
                int i12 = n13.f8865a;
                if (i12 < 29 || !F.isAlias()) {
                    String name = F.getName();
                    if (!F.isEncoder() && ((b7 || !name.endsWith(".secure")) && (i12 >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))))) {
                        if (i12 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(name)) {
                            String str6 = n13.f8866b;
                            if (!"a70".equals(str6)) {
                                if ("Xiaomi".equals(n13.f8867c)) {
                                }
                            }
                        }
                        if (i12 == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
                            String str7 = n13.f8866b;
                            if (!"dlxu".equals(str7)) {
                                if (!"protou".equals(str7)) {
                                    if (!"ville".equals(str7)) {
                                        if (!"villeplus".equals(str7)) {
                                            if (!"villec2".equals(str7)) {
                                                if (!str7.startsWith("gee")) {
                                                    if (!"C6602".equals(str7)) {
                                                        if (!"C6603".equals(str7)) {
                                                            if (!"C6606".equals(str7)) {
                                                                if (!"C6616".equals(str7)) {
                                                                    if (!"L36h".equals(str7)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i12 == 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
                            String str8 = n13.f8866b;
                            if (!"C1504".equals(str8)) {
                                if (!"C1505".equals(str8)) {
                                    if (!"C1604".equals(str8)) {
                                    }
                                }
                            }
                        }
                        if (i12 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(n13.f8867c))) {
                            String str9 = n13.f8866b;
                            if (!str9.startsWith("zeroflte")) {
                                if (!str9.startsWith("zerolte")) {
                                    if (!str9.startsWith("zenlte")) {
                                        if (!"SC-05G".equals(str9)) {
                                            if (!"marinelteatt".equals(str9)) {
                                                if (!"404SC".equals(str9)) {
                                                    if (!"SC-04G".equals(str9)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i12 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(n13.f8867c)) {
                            String str10 = n13.f8866b;
                            if (!str10.startsWith("d2")) {
                                if (!str10.startsWith("serrano")) {
                                    if (!str10.startsWith("jflte")) {
                                        if (!str10.startsWith("santos")) {
                                        }
                                    }
                                }
                            }
                        }
                        if ((i12 > 19 || !n13.f8866b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) && (!"audio/eac3-joc".equals(str5) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))) {
                            String[] supportedTypes = F.getSupportedTypes();
                            int length = supportedTypes.length;
                            int i13 = 0;
                            while (true) {
                                if (i13 < length) {
                                    str = supportedTypes[i13];
                                    if (str.equalsIgnoreCase(str5)) {
                                        break;
                                    }
                                    i13++;
                                } else if (str5.equals("video/dolby-vision")) {
                                    if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        str = "video/hevcdv";
                                    } else {
                                        if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                            str = "video/dv_hevc";
                                        }
                                        str2 = null;
                                    }
                                } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                    str = "audio/x-lg-alac";
                                } else {
                                    if (str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                        str = "audio/x-lg-flac";
                                    }
                                    str2 = null;
                                }
                            }
                            str2 = str;
                            if (str2 != null) {
                                try {
                                    capabilitiesForType = F.getCapabilitiesForType(str2);
                                    a7 = l44Var2.a("tunneled-playback", str2, capabilitiesForType);
                                    c7 = l44Var2.c("tunneled-playback", str2, capabilitiesForType);
                                } catch (Exception e7) {
                                    e = e7;
                                    str3 = name;
                                    i7 = i11;
                                    i8 = zza;
                                    str4 = str5;
                                }
                                if (i44Var.f6537c) {
                                    if (!a7) {
                                    }
                                    boolean a8 = l44Var2.a("secure-playback", str2, capabilitiesForType);
                                    boolean c8 = l44Var2.c("secure-playback", str2, capabilitiesForType);
                                    if (i44Var.f6536b) {
                                    }
                                    i11 = i7 + 1;
                                    str5 = str4;
                                    zza = i8;
                                    l44Var2 = l44Var;
                                } else if (!c7) {
                                    boolean a82 = l44Var2.a("secure-playback", str2, capabilitiesForType);
                                    boolean c82 = l44Var2.c("secure-playback", str2, capabilitiesForType);
                                    if (i44Var.f6536b) {
                                        if (!c82) {
                                            i9 = n13.f8865a;
                                            isHardwareAccelerated = i9 < 29 ? F.isHardwareAccelerated() : !i(F);
                                            i10 = i(F);
                                            if (i9 < 29) {
                                                z6 = F.isVendor();
                                            } else {
                                                String a9 = w33.a(F.getName());
                                                z6 = (a9.startsWith("omx.google.") || a9.startsWith("c2.android.") || a9.startsWith("c2.google.")) ? false : true;
                                            }
                                            if ((b7 || i44Var.f6536b != a82) && (b7 || i44Var.f6536b)) {
                                                str3 = name;
                                                i7 = i11;
                                                i8 = zza;
                                                str4 = str5;
                                                if (!b7 && a82) {
                                                    arrayList.add(z34.c(String.valueOf(str3).concat(".secure"), str4, str2, capabilitiesForType, isHardwareAccelerated, i10, z6, false, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                str3 = name;
                                                i7 = i11;
                                                i8 = zza;
                                                str4 = str5;
                                                try {
                                                    arrayList.add(z34.c(name, str5, str2, capabilitiesForType, isHardwareAccelerated, i10, z6, false, false));
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    if (n13.f8865a > 23 || arrayList.isEmpty()) {
                                                        String str11 = str3;
                                                        StringBuilder sb = new StringBuilder(String.valueOf(str11).length() + 25 + str2.length());
                                                        sb.append("Failed to query codec ");
                                                        sb.append(str11);
                                                        sb.append(" (");
                                                        sb.append(str2);
                                                        sb.append(")");
                                                        Log.e("MediaCodecUtil", sb.toString());
                                                        throw e;
                                                    }
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 46);
                                                    sb2.append("Skipping codec ");
                                                    sb2.append(str3);
                                                    sb2.append(" (failed to query capabilities)");
                                                    Log.e("MediaCodecUtil", sb2.toString());
                                                    i11 = i7 + 1;
                                                    str5 = str4;
                                                    zza = i8;
                                                    l44Var2 = l44Var;
                                                }
                                            }
                                        }
                                    } else if (a82) {
                                        a82 = true;
                                        i9 = n13.f8865a;
                                        if (i9 < 29) {
                                        }
                                        i10 = i(F);
                                        if (i9 < 29) {
                                        }
                                        if (b7) {
                                        }
                                        str3 = name;
                                        i7 = i11;
                                        i8 = zza;
                                        str4 = str5;
                                        if (!b7) {
                                            arrayList.add(z34.c(String.valueOf(str3).concat(".secure"), str4, str2, capabilitiesForType, isHardwareAccelerated, i10, z6, false, true));
                                            return arrayList;
                                        }
                                        continue;
                                    }
                                    i11 = i7 + 1;
                                    str5 = str4;
                                    zza = i8;
                                    l44Var2 = l44Var;
                                }
                            }
                        }
                    }
                }
                i7 = i11;
                i8 = zza;
                str4 = str5;
                i11 = i7 + 1;
                str5 = str4;
                zza = i8;
                l44Var2 = l44Var;
            }
            return arrayList;
        } catch (Exception e9) {
            throw new k44(e9, null);
        }
    }

    private static <T> void h(List<T> list, final p44<T> p44Var) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.h44
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                p44 p44Var2 = p44.this;
                int i7 = q44.f10578d;
                return p44Var2.c(obj2) - p44Var2.c(obj);
            }
        });
    }

    private static boolean i(MediaCodecInfo mediaCodecInfo) {
        if (n13.f8865a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String a7 = w33.a(mediaCodecInfo.getName());
        if (a7.startsWith("arc.")) {
            return false;
        }
        return a7.startsWith("omx.google.") || a7.startsWith("omx.ffmpeg.") || (a7.startsWith("omx.sec.") && a7.contains(".sw.")) || a7.equals("omx.qcom.video.decoder.hevcswvdec") || a7.startsWith("c2.android.") || a7.startsWith("c2.google.") || !(a7.startsWith("omx.") || a7.startsWith("c2."));
    }
}
