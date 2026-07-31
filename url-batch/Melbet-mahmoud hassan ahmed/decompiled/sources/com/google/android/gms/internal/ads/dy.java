package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class dy {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList<fw> f4376a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f4377b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (g(str)) {
            return 1;
        }
        if (h(str)) {
            return 2;
        }
        if ("text".equals(i(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(i(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f4376a.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str2 = f4376a.get(i7).f5253a;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    static cx b(String str) {
        Matcher matcher = f4377b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        String group2 = matcher.group(2);
        try {
            return new cx(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String c(String str) {
        cx b7;
        String a7 = w33.a(str.trim());
        if (a7.startsWith("avc1") || a7.startsWith("avc3")) {
            return "video/avc";
        }
        if (a7.startsWith("hev1") || a7.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (a7.startsWith("dvav") || a7.startsWith("dva1") || a7.startsWith("dvhe") || a7.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (a7.startsWith("av01")) {
            return "video/av01";
        }
        if (a7.startsWith("vp9") || a7.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (a7.startsWith("vp8") || a7.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        String str2 = null;
        if (a7.startsWith("mp4a")) {
            if (a7.startsWith("mp4a.") && (b7 = b(a7)) != null) {
                str2 = d(b7.f3970a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (a7.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (a7.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (a7.startsWith("ac-3") || a7.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (a7.startsWith("ec-3") || a7.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (a7.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (a7.startsWith("ac-4") || a7.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (a7.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (a7.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (a7.startsWith("dtsh") || a7.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (a7.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (a7.startsWith("opus")) {
            return "audio/opus";
        }
        if (a7.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (a7.startsWith("flac")) {
            return "audio/flac";
        }
        if (a7.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (a7.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (a7.contains("cea708")) {
            return "application/cea-708";
        }
        if (a7.contains("eia608") || a7.contains("cea608")) {
            return "application/cea-608";
        }
        int size = f4376a.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str3 = f4376a.get(i7).f5254b;
            if (a7.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    public static String d(int i7) {
        if (i7 == 32) {
            return "video/mp4v-es";
        }
        if (i7 == 33) {
            return "video/avc";
        }
        if (i7 == 35) {
            return "video/hevc";
        }
        if (i7 == 64) {
            return "audio/mp4a-latm";
        }
        if (i7 == 163) {
            return "video/wvc1";
        }
        if (i7 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i7 == 165) {
            return "audio/ac3";
        }
        if (i7 == 166) {
            return "audio/eac3";
        }
        switch (i7) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i7) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String e(String str) {
        char c7;
        int hashCode = str.hashCode();
        if (hashCode == -1007807498) {
            if (str.equals("audio/x-flac")) {
                c7 = 0;
            }
            c7 = 65535;
        } else if (hashCode != -586683234) {
            if (hashCode == 187090231 && str.equals("audio/mp3")) {
                c7 = 1;
            }
            c7 = 65535;
        } else {
            if (str.equals("audio/x-wav")) {
                c7 = 2;
            }
            c7 = 65535;
        }
        return c7 != 0 ? c7 != 1 ? c7 != 2 ? str : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean f(String str, String str2) {
        char c7;
        cx b7;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c7 = '\n';
                    break;
                }
                c7 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case '\n':
                if (str2 != null && (b7 = b(str2)) != null) {
                    int i7 = b7.f3971b;
                    char c8 = i7 != 2 ? i7 != 5 ? i7 != 29 ? i7 != 42 ? i7 != 22 ? i7 != 23 ? (char) 0 : (char) 15 : (char) 0 : (char) 16 : '\f' : (char) 11 : '\n';
                    if (c8 == 0 || c8 == 16) {
                    }
                }
                break;
        }
        return false;
    }

    public static boolean g(String str) {
        return "audio".equals(i(str));
    }

    public static boolean h(String str) {
        return "video".equals(i(str));
    }

    private static String i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
