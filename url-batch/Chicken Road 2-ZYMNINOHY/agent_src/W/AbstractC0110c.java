package W;

import E.AbstractC0005f;
import T.C0089g;
import T.C0097o;
import android.util.Pair;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: W.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0110c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3295a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3296b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3297c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i4, int i5, int i6) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static String b(int i4, boolean z, int i5, int i6, int[] iArr, int i7) {
        Object[] objArr = {f3296b[i4], Integer.valueOf(i5), Integer.valueOf(i6), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i7)};
        String str = J.f3263a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i8 = 0; i8 < length; i8++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i8])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair c(C0097o c0097o) {
        char c4;
        int i4;
        int i5;
        int i6;
        int i7;
        int parseInt;
        int parseInt2;
        int i8;
        int i9;
        int i10;
        char c5;
        int i11;
        Integer num;
        char c6;
        Integer num2;
        char c7;
        char c8;
        Integer num3 = 1;
        String str = c0097o.f2866k;
        String str2 = c0097o.f2866k;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (!"video/dolby-vision".equals(c0097o.n)) {
            String str3 = split[0];
            str3.getClass();
            switch (str3.hashCode()) {
                case 2986313:
                    if (str3.equals("ac-4")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3001066:
                    if (str3.equals("apv1")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3004662:
                    if (str3.equals("av01")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3224753:
                    if (str3.equals("iamf")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3475740:
                    if (str3.equals("s263")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            int i12 = 8192;
            switch (c4) {
                case 0:
                    if (split.length != 4) {
                        AbstractC0005f.y("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2]);
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 == 0) {
                                if (parseInt4 == 0) {
                                    i4 = 257;
                                }
                                i4 = -1;
                            } else if (parseInt3 != 1) {
                                if (parseInt3 == 2) {
                                    if (parseInt4 == 1) {
                                        i4 = 1026;
                                    } else if (parseInt4 == 2) {
                                        i4 = 1028;
                                    }
                                }
                                i4 = -1;
                            } else if (parseInt4 == 0) {
                                i4 = 513;
                            } else {
                                if (parseInt4 == 1) {
                                    i4 = 514;
                                }
                                i4 = -1;
                            }
                            if (i4 != -1) {
                                int i13 = parseInt5 != 0 ? parseInt5 != 1 ? parseInt5 != 2 ? parseInt5 != 3 ? parseInt5 != 4 ? -1 : 16 : 8 : 4 : 2 : 1;
                                if (i13 != -1) {
                                    break;
                                } else {
                                    AbstractC0005f.u(parseInt5, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                AbstractC0108a.s("CodecSpecificDataUtil", "Unknown AC-4 profile: " + parseInt3 + "." + parseInt4);
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            AbstractC0005f.y("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 1:
                    if (split.length < 4) {
                        AbstractC0005f.y("Ignoring malformed APV codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt6 = Integer.parseInt(split[1].substring(4));
                            int parseInt7 = Integer.parseInt(split[2].substring(4));
                            int parseInt8 = Integer.parseInt(split[3].substring(4));
                            if (parseInt6 != 33) {
                                if (parseInt6 != 44) {
                                    AbstractC0005f.u(parseInt6, "Ignoring invalid APV profile: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                i12 = 1;
                            }
                            int i14 = (parseInt7 / 30) * 2;
                            if (parseInt7 % 30 == 0) {
                                i14--;
                            }
                            break;
                        } catch (NumberFormatException e4) {
                            AbstractC0108a.t("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str2, e4);
                            return null;
                        }
                    }
                case 2:
                    C0089g c0089g = c0097o.f2844D;
                    if (split.length < 4) {
                        AbstractC0005f.y("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt9 = Integer.parseInt(split[1]);
                            int parseInt10 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt11 = Integer.parseInt(split[3]);
                            if (parseInt9 == 0) {
                                if (parseInt11 != 8 && parseInt11 != 10) {
                                    AbstractC0005f.u(parseInt11, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                    break;
                                } else {
                                    int i15 = parseInt11 == 8 ? 1 : (c0089g == null || !(c0089g.f2788d != null || (i5 = c0089g.f2787c) == 7 || i5 == 6)) ? 2 : 4096;
                                    switch (parseInt10) {
                                        case 0:
                                            i6 = -1;
                                            i7 = 1;
                                            break;
                                        case 1:
                                            i6 = -1;
                                            i7 = 2;
                                            break;
                                        case 2:
                                            i6 = -1;
                                            i7 = 4;
                                            break;
                                        case 3:
                                            i7 = 8;
                                            i6 = -1;
                                            break;
                                        case 4:
                                            i7 = 16;
                                            i6 = -1;
                                            break;
                                        case 5:
                                            i7 = 32;
                                            i6 = -1;
                                            break;
                                        case 6:
                                            i7 = 64;
                                            i6 = -1;
                                            break;
                                        case 7:
                                            i7 = 128;
                                            i6 = -1;
                                            break;
                                        case 8:
                                            i7 = 256;
                                            i6 = -1;
                                            break;
                                        case 9:
                                            i7 = 512;
                                            i6 = -1;
                                            break;
                                        case 10:
                                            i7 = 1024;
                                            i6 = -1;
                                            break;
                                        case 11:
                                            i7 = 2048;
                                            i6 = -1;
                                            break;
                                        case 12:
                                            i7 = 4096;
                                            i6 = -1;
                                            break;
                                        case 13:
                                            i7 = 8192;
                                            i6 = -1;
                                            break;
                                        case 14:
                                            i7 = 16384;
                                            i6 = -1;
                                            break;
                                        case 15:
                                            i7 = 32768;
                                            i6 = -1;
                                            break;
                                        case 16:
                                            i7 = 65536;
                                            i6 = -1;
                                            break;
                                        case 17:
                                            i7 = 131072;
                                            i6 = -1;
                                            break;
                                        case 18:
                                            i7 = 262144;
                                            i6 = -1;
                                            break;
                                        case C0583e9.f11743C /* 19 */:
                                            i7 = 524288;
                                            i6 = -1;
                                            break;
                                        case C0583e9.f11744D /* 20 */:
                                            i7 = 1048576;
                                            i6 = -1;
                                            break;
                                        case 21:
                                            i7 = 2097152;
                                            i6 = -1;
                                            break;
                                        case Build.API_LEVELS.API_22 /* 22 */:
                                            i7 = 4194304;
                                            i6 = -1;
                                            break;
                                        case Build.API_LEVELS.API_23 /* 23 */:
                                            i7 = 8388608;
                                            i6 = -1;
                                            break;
                                        default:
                                            i6 = -1;
                                            i7 = -1;
                                            break;
                                    }
                                    if (i7 != i6) {
                                        break;
                                    } else {
                                        AbstractC0005f.u(parseInt10, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0005f.u(parseInt9, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            AbstractC0005f.y("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                    break;
                case 3:
                case 4:
                    if (split.length < 2) {
                        AbstractC0005f.y("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            if (split[1].length() != 6) {
                                if (split.length < 3) {
                                    AbstractC0108a.s("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
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
                                i8 = -1;
                                i9 = 1;
                            } else if (parseInt == 77) {
                                i8 = -1;
                                i9 = 2;
                            } else if (parseInt != 88) {
                                if (parseInt == 100) {
                                    i9 = 8;
                                } else if (parseInt == 110) {
                                    i9 = 16;
                                } else if (parseInt == 122) {
                                    i9 = 32;
                                } else if (parseInt != 244) {
                                    i8 = -1;
                                    i9 = -1;
                                } else {
                                    i9 = 64;
                                }
                                i8 = -1;
                            } else {
                                i8 = -1;
                                i9 = 4;
                            }
                            if (i9 != i8) {
                                switch (parseInt2) {
                                    case 10:
                                        i10 = 1;
                                        break;
                                    case 11:
                                        i10 = 4;
                                        break;
                                    case 12:
                                        i10 = 8;
                                        break;
                                    case 13:
                                        i10 = 16;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case C0583e9.f11744D /* 20 */:
                                                i10 = 32;
                                                break;
                                            case 21:
                                                i10 = 64;
                                                break;
                                            case Build.API_LEVELS.API_22 /* 22 */:
                                                i10 = 128;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case Build.API_LEVELS.API_30 /* 30 */:
                                                        i10 = 256;
                                                        break;
                                                    case Build.API_LEVELS.API_31 /* 31 */:
                                                        i10 = 512;
                                                        break;
                                                    case Build.API_LEVELS.API_32 /* 32 */:
                                                        i10 = 1024;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case C0583e9.L /* 40 */:
                                                                i10 = 2048;
                                                                break;
                                                            case 41:
                                                                i10 = 4096;
                                                                break;
                                                            case C0583e9.f11752M /* 42 */:
                                                                i10 = 8192;
                                                                break;
                                                            default:
                                                                switch (parseInt2) {
                                                                    case 50:
                                                                        i10 = 16384;
                                                                        break;
                                                                    case 51:
                                                                        i10 = 32768;
                                                                        break;
                                                                    case 52:
                                                                        i10 = 65536;
                                                                        break;
                                                                    default:
                                                                        i10 = -1;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                                if (i10 != -1) {
                                    break;
                                } else {
                                    AbstractC0005f.u(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                AbstractC0005f.u(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused3) {
                            AbstractC0005f.y("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 7:
                    if (split.length < 4) {
                        AbstractC0005f.y("Ignoring malformed IAMF codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt12 = 1 << (Integer.parseInt(split[1]) + 16);
                            String str4 = split[3];
                            str4.getClass();
                            switch (str4.hashCode()) {
                                case 2464863:
                                    if (str4.equals("Opus")) {
                                        c5 = 0;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 3114792:
                                    if (str4.equals("fLaC")) {
                                        c5 = 1;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 3238865:
                                    if (str4.equals("ipcm")) {
                                        c5 = 2;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 3356560:
                                    if (str4.equals("mp4a")) {
                                        c5 = 3;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                default:
                                    c5 = 65535;
                                    break;
                            }
                            switch (c5) {
                                case 0:
                                    i11 = 1;
                                    break;
                                case 1:
                                    i11 = 4;
                                    break;
                                case 2:
                                    i11 = 8;
                                    break;
                                case 3:
                                    i11 = 2;
                                    break;
                                default:
                                    AbstractC0108a.s("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + split[3]);
                                    break;
                            }
                            break;
                        } catch (NumberFormatException e5) {
                            AbstractC0108a.t("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + split[1], e5);
                            return null;
                        }
                    }
                case '\b':
                    if (split.length == 3) {
                        try {
                            if ("audio/mp4a-latm".equals(T.F.e(Integer.parseInt(split[1], 16)))) {
                                int parseInt13 = Integer.parseInt(split[2]);
                                int i16 = 17;
                                if (parseInt13 != 17) {
                                    i16 = 20;
                                    if (parseInt13 != 20) {
                                        i16 = 23;
                                        if (parseInt13 != 23) {
                                            i16 = 29;
                                            if (parseInt13 != 29) {
                                                i16 = 39;
                                                if (parseInt13 != 39) {
                                                    i16 = 42;
                                                    if (parseInt13 != 42) {
                                                        switch (parseInt13) {
                                                            case 1:
                                                                i16 = 1;
                                                                break;
                                                            case 2:
                                                                i16 = 2;
                                                                break;
                                                            case 3:
                                                                i16 = 3;
                                                                break;
                                                            case 4:
                                                                i16 = 4;
                                                                break;
                                                            case 5:
                                                                i16 = 5;
                                                                break;
                                                            case 6:
                                                                i16 = 6;
                                                                break;
                                                            default:
                                                                i16 = -1;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (i16 != -1) {
                                    break;
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            AbstractC0005f.y("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        AbstractC0005f.y("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                    break;
                case '\t':
                    Pair pair = new Pair(num3, num3);
                    if (split.length < 3) {
                        AbstractC0005f.y("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            break;
                        } catch (NumberFormatException unused5) {
                            AbstractC0005f.y("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                            return pair;
                        }
                    }
                case '\n':
                    if (split.length < 3) {
                        AbstractC0005f.y("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt14 = Integer.parseInt(split[1]);
                            int parseInt15 = Integer.parseInt(split[2]);
                            int i17 = parseInt14 != 0 ? parseInt14 != 1 ? parseInt14 != 2 ? parseInt14 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i17 != -1) {
                                if (parseInt15 == 10) {
                                    i12 = 1;
                                } else if (parseInt15 == 11) {
                                    i12 = 2;
                                } else if (parseInt15 == 20) {
                                    i12 = 4;
                                } else if (parseInt15 == 21) {
                                    i12 = 8;
                                } else if (parseInt15 == 30) {
                                    i12 = 16;
                                } else if (parseInt15 == 31) {
                                    i12 = 32;
                                } else if (parseInt15 == 40) {
                                    i12 = 64;
                                } else if (parseInt15 == 41) {
                                    i12 = 128;
                                } else if (parseInt15 == 50) {
                                    i12 = 256;
                                } else if (parseInt15 != 51) {
                                    switch (parseInt15) {
                                        case 60:
                                            i12 = 2048;
                                            break;
                                        case 61:
                                            i12 = 4096;
                                            break;
                                        case 62:
                                            break;
                                        default:
                                            i12 = -1;
                                            break;
                                    }
                                } else {
                                    i12 = 512;
                                }
                                if (i12 != -1) {
                                    break;
                                } else {
                                    AbstractC0005f.u(parseInt15, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                AbstractC0005f.u(parseInt14, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused6) {
                            AbstractC0005f.y("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
            }
            return null;
        }
        if (split.length < 3) {
            AbstractC0005f.y("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f3297c.matcher(split[1]);
        if (!matcher.matches()) {
            AbstractC0005f.y("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        if (group == null) {
            num = 16;
        } else {
            switch (group.hashCode()) {
                case 1536:
                    num = 16;
                    if (group.equals("00")) {
                        c6 = 0;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1537:
                    if (group.equals("01")) {
                        num = 16;
                        c6 = 1;
                        break;
                    }
                    num = 16;
                    c6 = 65535;
                    break;
                case 1538:
                    if (group.equals("02")) {
                        num = 16;
                        c6 = 2;
                        break;
                    }
                    num = 16;
                    c6 = 65535;
                    break;
                case 1539:
                    if (group.equals("03")) {
                        num = 16;
                        c6 = 3;
                        break;
                    }
                    num = 16;
                    c6 = 65535;
                    break;
                case 1540:
                    if (group.equals("04")) {
                        num = 16;
                        c6 = 4;
                        break;
                    }
                    num = 16;
                    c6 = 65535;
                    break;
                case 1541:
                    if (group.equals("05")) {
                        num = 16;
                        c6 = 5;
                        break;
                    }
                    num = 16;
                    c6 = 65535;
                    break;
                case 1542:
                    if (group.equals("06")) {
                        num = 16;
                        c6 = 6;
                        break;
                    }
                    num = 16;
                    c6 = 65535;
                    break;
                case 1543:
                    if (group.equals("07")) {
                        num = 16;
                        c6 = 7;
                        break;
                    }
                    num = 16;
                    c6 = 65535;
                    break;
                case 1544:
                    if (group.equals("08")) {
                        num = 16;
                        c6 = '\b';
                        break;
                    }
                    num = 16;
                    c6 = 65535;
                    break;
                case 1545:
                    if (group.equals("09")) {
                        num = 16;
                        c6 = '\t';
                        break;
                    }
                    num = 16;
                    c6 = 65535;
                    break;
                case 1567:
                    if (group.equals("10")) {
                        num = 16;
                        c6 = '\n';
                        break;
                    }
                    num = 16;
                    c6 = 65535;
                    break;
                default:
                    num = 16;
                    c6 = 65535;
                    break;
            }
            switch (c6) {
                case 0:
                    num2 = num3;
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
                    num2 = num;
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
                case '\n':
                    num2 = 1024;
                    break;
            }
            if (num2 != null) {
                AbstractC0005f.y("Unknown Dolby Vision profile string: ", group, "CodecSpecificDataUtil");
                return null;
            }
            String str5 = split[2];
            if (str5 != null) {
                switch (str5.hashCode()) {
                    case 1537:
                        if (str5.equals("01")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1538:
                        if (str5.equals("02")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1539:
                        if (str5.equals("03")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1540:
                        if (str5.equals("04")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1541:
                        if (str5.equals("05")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1542:
                        if (str5.equals("06")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1543:
                        if (str5.equals("07")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1544:
                        if (str5.equals("08")) {
                            c7 = 7;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1545:
                        if (str5.equals("09")) {
                            c7 = '\b';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1567:
                        if (str5.equals("10")) {
                            c7 = '\t';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1568:
                        if (str5.equals("11")) {
                            c7 = '\n';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1569:
                        if (str5.equals("12")) {
                            c8 = 11;
                            c7 = c8;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1570:
                        if (str5.equals("13")) {
                            c8 = '\f';
                            c7 = c8;
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = 4;
                        break;
                    case 3:
                        num3 = 8;
                        break;
                    case 4:
                        num3 = num;
                        break;
                    case 5:
                        num3 = 32;
                        break;
                    case 6:
                        num3 = 64;
                        break;
                    case 7:
                        num3 = 128;
                        break;
                    case '\b':
                        num3 = 256;
                        break;
                    case '\t':
                        num3 = 512;
                        break;
                    case '\n':
                        num3 = 1024;
                        break;
                    case 11:
                        num3 = 2048;
                        break;
                    case '\f':
                        num3 = 4096;
                        break;
                }
                if (num3 == null) {
                    return new Pair(num2, num3);
                }
                AbstractC0005f.y("Unknown Dolby Vision level string: ", str5, "CodecSpecificDataUtil");
                return null;
            }
            num3 = null;
            if (num3 == null) {
            }
        }
        num2 = null;
        if (num2 != null) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0167, code lost:
    
        if (r12.equals("L60") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair d(String str, String[] strArr, C0089g c0089g) {
        int i4;
        Integer num;
        if (strArr.length < 4) {
            AbstractC0005f.y("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f3297c.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC0005f.y("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        char c4 = 6;
        if ("1".equals(group)) {
            i4 = 1;
        } else if ("2".equals(group)) {
            i4 = (c0089g == null || c0089g.f2787c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                AbstractC0005f.y("Unknown HEVC profile string: ", group, "CodecSpecificDataUtil");
                return null;
            }
            i4 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 74758:
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c4 = '\r';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c4 = 15;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c4 = 16;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c4 = 17;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c4 = 18;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        c4 = 19;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c4 = 20;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c4 = 21;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c4 = 22;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c4 = 23;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c4 = 24;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c4 = 25;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    num = 2;
                    break;
                case 1:
                    num = 8;
                    break;
                case 2:
                    num = 32;
                    break;
                case 3:
                    num = 128;
                    break;
                case 4:
                    num = 512;
                    break;
                case 5:
                    num = 1;
                    break;
                case 6:
                    num = 4;
                    break;
                case 7:
                    num = 16;
                    break;
                case '\b':
                    num = 64;
                    break;
                case '\t':
                    num = 256;
                    break;
                case '\n':
                    num = 2048;
                    break;
                case 11:
                    num = 8192;
                    break;
                case '\f':
                    num = 32768;
                    break;
                case '\r':
                    num = 131072;
                    break;
                case 14:
                    num = 524288;
                    break;
                case 15:
                    num = 2097152;
                    break;
                case 16:
                    num = 8388608;
                    break;
                case 17:
                    num = 33554432;
                    break;
                case 18:
                    num = 1024;
                    break;
                case C0583e9.f11743C /* 19 */:
                    num = 4096;
                    break;
                case C0583e9.f11744D /* 20 */:
                    num = 16384;
                    break;
                case 21:
                    num = 65536;
                    break;
                case Build.API_LEVELS.API_22 /* 22 */:
                    num = 262144;
                    break;
                case Build.API_LEVELS.API_23 /* 23 */:
                    num = 1048576;
                    break;
                case 24:
                    num = 4194304;
                    break;
                case 25:
                    num = 16777216;
                    break;
            }
            if (num == null) {
                return new Pair(Integer.valueOf(i4), num);
            }
            AbstractC0005f.y("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        num = null;
        if (num == null) {
        }
    }
}
