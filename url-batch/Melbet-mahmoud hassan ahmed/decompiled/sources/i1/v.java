package i1;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import c4.w0;
import i1.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.m0;
import r0.s1;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f17005a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<b, List<n>> f17006b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static int f17007c = -1;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f17008a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17009b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f17010c;

        public b(String str, boolean z6, boolean z7) {
            this.f17008a = str;
            this.f17009b = z6;
            this.f17010c = z7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f17008a, bVar.f17008a) && this.f17009b == bVar.f17009b && this.f17010c == bVar.f17010c;
        }

        public int hashCode() {
            return ((((this.f17008a.hashCode() + 31) * 31) + (this.f17009b ? 1231 : 1237)) * 31) + (this.f17010c ? 1231 : 1237);
        }
    }

    public static class c extends Exception {
        private c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private interface d {
        MediaCodecInfo a(int i7);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int c();

        boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean e();
    }

    private static final class e implements d {
        private e() {
        }

        @Override // i1.v.d
        public MediaCodecInfo a(int i7) {
            return MediaCodecList.getCodecInfoAt(i7);
        }

        @Override // i1.v.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // i1.v.d
        public int c() {
            return MediaCodecList.getCodecCount();
        }

        @Override // i1.v.d
        public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // i1.v.d
        public boolean e() {
            return false;
        }
    }

    private static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f17011a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f17012b;

        public f(boolean z6, boolean z7) {
            this.f17011a = (z6 || z7) ? 1 : 0;
        }

        private void f() {
            if (this.f17012b == null) {
                this.f17012b = new MediaCodecList(this.f17011a).getCodecInfos();
            }
        }

        @Override // i1.v.d
        public MediaCodecInfo a(int i7) {
            f();
            return this.f17012b[i7];
        }

        @Override // i1.v.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // i1.v.d
        public int c() {
            f();
            return this.f17012b.length;
        }

        @Override // i1.v.d
        public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // i1.v.d
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface g<T> {
        int a(T t6);
    }

    private static boolean A(MediaCodecInfo mediaCodecInfo) {
        return m0.f19752a >= 29 && B(mediaCodecInfo);
    }

    private static boolean B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo, String str, boolean z6, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z6 && str.endsWith(".secure"))) {
            return false;
        }
        int i7 = m0.f19752a;
        if (i7 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i7 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = m0.f19753b;
            if ("a70".equals(str3) || ("Xiaomi".equals(m0.f19754c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = m0.f19753b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = m0.f19753b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(m0.f19754c))) {
            String str6 = m0.f19753b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i7 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(m0.f19754c)) {
            String str7 = m0.f19753b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i7 <= 19 && m0.f19753b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo, String str) {
        return m0.f19752a >= 29 ? E(mediaCodecInfo) : !F(mediaCodecInfo, str);
    }

    private static boolean E(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        if (m0.f19752a >= 29) {
            return G(mediaCodecInfo);
        }
        if (o2.v.o(str)) {
            return true;
        }
        String e7 = l4.b.e(mediaCodecInfo.getName());
        if (e7.startsWith("arc.")) {
            return false;
        }
        if (e7.startsWith("omx.google.") || e7.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((e7.startsWith("omx.sec.") && e7.contains(".sw.")) || e7.equals("omx.qcom.video.decoder.hevcswvdec") || e7.startsWith("c2.android.") || e7.startsWith("c2.google.")) {
            return true;
        }
        return (e7.startsWith("omx.") || e7.startsWith("c2.")) ? false : true;
    }

    private static boolean G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean H(MediaCodecInfo mediaCodecInfo) {
        if (m0.f19752a >= 29) {
            return I(mediaCodecInfo);
        }
        String e7 = l4.b.e(mediaCodecInfo.getName());
        return (e7.startsWith("omx.google.") || e7.startsWith("c2.android.") || e7.startsWith("c2.google.")) ? false : true;
    }

    private static boolean I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int J(n nVar) {
        String str = nVar.f16949a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (m0.f19752a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int K(n nVar) {
        return nVar.f16949a.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int L(s1 s1Var, n nVar) {
        try {
            return nVar.m(s1Var) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int M(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static int N() {
        if (f17007c == -1) {
            int i7 = 0;
            n r7 = r("video/avc", false, false);
            if (r7 != null) {
                MediaCodecInfo.CodecProfileLevel[] g7 = r7.g();
                int length = g7.length;
                int i8 = 0;
                while (i7 < length) {
                    i8 = Math.max(h(g7[i7].level), i8);
                    i7++;
                }
                i7 = Math.max(i8, m0.f19752a >= 21 ? 345600 : 172800);
            }
            f17007c = i7;
        }
        return f17007c;
    }

    private static int O(int i7) {
        int i8 = 17;
        if (i7 != 17) {
            i8 = 20;
            if (i7 != 20) {
                i8 = 23;
                if (i7 != 23) {
                    i8 = 29;
                    if (i7 != 29) {
                        i8 = 39;
                        if (i7 != 39) {
                            i8 = 42;
                            if (i7 != 42) {
                                switch (i7) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i8;
    }

    private static <T> void P(List<T> list, final g<T> gVar) {
        Collections.sort(list, new Comparator() { // from class: i1.u
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int M;
                M = v.M(v.g.this, obj, obj2);
                return M;
            }
        });
    }

    private static int Q(int i7) {
        if (i7 == 10) {
            return 1;
        }
        if (i7 == 11) {
            return 2;
        }
        if (i7 == 20) {
            return 4;
        }
        if (i7 == 21) {
            return 8;
        }
        if (i7 == 30) {
            return 16;
        }
        if (i7 == 31) {
            return 32;
        }
        if (i7 == 40) {
            return 64;
        }
        if (i7 == 41) {
            return 128;
        }
        if (i7 == 50) {
            return 256;
        }
        if (i7 == 51) {
            return 512;
        }
        switch (i7) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int R(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static void e(String str, List<n> list) {
        if ("audio/raw".equals(str)) {
            if (m0.f19752a < 26 && m0.f19753b.equals("R9") && list.size() == 1 && list.get(0).f16949a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(n.C("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            P(list, new g() { // from class: i1.s
                @Override // i1.v.g
                public final int a(Object obj) {
                    int J;
                    J = v.J((n) obj);
                    return J;
                }
            });
        }
        int i7 = m0.f19752a;
        if (i7 < 21 && list.size() > 1) {
            String str2 = list.get(0).f16949a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                P(list, new g() { // from class: i1.t
                    @Override // i1.v.g
                    public final int a(Object obj) {
                        int K;
                        K = v.K((n) obj);
                        return K;
                    }
                });
            }
        }
        if (i7 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f16949a)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int f(int i7) {
        switch (i7) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case w0.f2149o /* 7 */:
                return 128;
            case w0.f2150p /* 8 */:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i7) {
        switch (i7) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i7) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i7) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i7) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i7) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int h(int i7) {
        if (i7 == 1 || i7 == 2) {
            return 25344;
        }
        switch (i7) {
            case w0.f2150p /* 8 */:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int i(int i7) {
        if (i7 == 66) {
            return 1;
        }
        if (i7 == 77) {
            return 2;
        }
        if (i7 == 88) {
            return 4;
        }
        if (i7 == 100) {
            return 8;
        }
        if (i7 == 110) {
            return 16;
        }
        if (i7 != 122) {
            return i7 != 244 ? -1 : 64;
        }
        return 32;
    }

    private static Integer j(String str) {
        int i7;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                i7 = 16;
                break;
            case "06":
                i7 = 32;
                break;
            case "07":
                i7 = 64;
                break;
            case "08":
                i7 = 128;
                break;
            case "09":
                i7 = 256;
                break;
            case "10":
                i7 = 512;
                break;
            case "11":
                i7 = 1024;
                break;
            case "12":
                i7 = 2048;
                break;
            case "13":
                i7 = 4096;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i7);
    }

    private static Integer k(String str) {
        int i7;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                i7 = 16;
                break;
            case "05":
                i7 = 32;
                break;
            case "06":
                i7 = 64;
                break;
            case "07":
                i7 = 128;
                break;
            case "08":
                i7 = 256;
                break;
            case "09":
                i7 = 512;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i7);
    }

    private static Pair<Integer, Integer> l(String str, String[] strArr) {
        int O;
        if (strArr.length != 3) {
            o2.r.i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(o2.v.h(Integer.parseInt(strArr[1], 16))) && (O = O(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(O), 0);
            }
        } catch (NumberFormatException unused) {
            o2.r.i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static String m(s1 s1Var) {
        Pair<Integer, Integer> q7;
        if ("audio/eac3-joc".equals(s1Var.f20956q)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(s1Var.f20956q) || (q7 = q(s1Var)) == null) {
            return null;
        }
        int intValue = ((Integer) q7.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    private static Pair<Integer, Integer> n(String str, String[] strArr, p2.c cVar) {
        StringBuilder sb;
        int parseInt;
        int parseInt2;
        int parseInt3;
        StringBuilder sb2;
        int i7;
        String sb3;
        if (strArr.length >= 4) {
            try {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
                parseInt3 = Integer.parseInt(strArr[3]);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
            if (parseInt != 0) {
                sb2 = new StringBuilder();
                sb2.append("Unknown AV1 profile: ");
                sb2.append(parseInt);
            } else {
                if (parseInt3 != 8 && parseInt3 != 10) {
                    sb = new StringBuilder();
                    sb.append("Unknown AV1 bit depth: ");
                    sb.append(parseInt3);
                    sb3 = sb.toString();
                    o2.r.i("MediaCodecUtil", sb3);
                    return null;
                }
                int i8 = parseInt3 != 8 ? (cVar == null || !(cVar.f19983i != null || (i7 = cVar.f19982h) == 7 || i7 == 6)) ? 2 : 4096 : 1;
                int f7 = f(parseInt2);
                if (f7 != -1) {
                    return new Pair<>(Integer.valueOf(i8), Integer.valueOf(f7));
                }
                sb2 = new StringBuilder();
                sb2.append("Unknown AV1 level: ");
                sb2.append(parseInt2);
            }
            sb3 = sb2.toString();
            o2.r.i("MediaCodecUtil", sb3);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed AV1 codec string: ");
        sb.append(str);
        sb3 = sb.toString();
        o2.r.i("MediaCodecUtil", sb3);
        return null;
    }

    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        StringBuilder sb;
        int parseInt;
        int i7;
        int i8;
        String str2;
        if (strArr.length >= 2) {
            try {
                if (strArr[1].length() == 6) {
                    i7 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    parseInt = Integer.parseInt(strArr[1].substring(4), 16);
                } else {
                    if (strArr.length < 3) {
                        o2.r.i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                        return null;
                    }
                    int parseInt2 = Integer.parseInt(strArr[1]);
                    parseInt = Integer.parseInt(strArr[2]);
                    i7 = parseInt2;
                }
                i8 = i(i7);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
            if (i8 == -1) {
                str2 = "Unknown AVC profile: " + i7;
                o2.r.i("MediaCodecUtil", str2);
                return null;
            }
            int g7 = g(parseInt);
            if (g7 != -1) {
                return new Pair<>(Integer.valueOf(i8), Integer.valueOf(g7));
            }
            sb = new StringBuilder();
            sb.append("Unknown AVC level: ");
            sb.append(parseInt);
            str2 = sb.toString();
            o2.r.i("MediaCodecUtil", str2);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed AVC codec string: ");
        sb.append(str);
        str2 = sb.toString();
        o2.r.i("MediaCodecUtil", str2);
        return null;
    }

    private static String p(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r3.equals("av01") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> q(s1 s1Var) {
        String str = s1Var.f20953n;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if ("video/dolby-vision".equals(s1Var.f20956q)) {
            return w(s1Var.f20953n, split);
        }
        char c7 = 0;
        String str2 = split[0];
        str2.hashCode();
        switch (str2.hashCode()) {
            case 3004662:
                break;
            case 3006243:
                if (str2.equals("avc1")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 3356560:
                if (str2.equals("mp4a")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case 3624515:
                if (str2.equals("vp09")) {
                    c7 = 6;
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
                return n(s1Var.f20953n, split, s1Var.C);
            case 1:
            case 2:
                return o(s1Var.f20953n, split);
            case 3:
            case 4:
                return x(s1Var.f20953n, split);
            case 5:
                return l(s1Var.f20953n, split);
            case 6:
                return y(s1Var.f20953n, split);
            default:
                return null;
        }
    }

    public static n r(String str, boolean z6, boolean z7) {
        List<n> s7 = s(str, z6, z7);
        if (s7.isEmpty()) {
            return null;
        }
        return s7.get(0);
    }

    public static synchronized List<n> s(String str, boolean z6, boolean z7) {
        synchronized (v.class) {
            b bVar = new b(str, z6, z7);
            HashMap<b, List<n>> hashMap = f17006b;
            List<n> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i7 = m0.f19752a;
            ArrayList<n> t6 = t(bVar, i7 >= 21 ? new f(z6, z7) : new e());
            if (z6 && t6.isEmpty() && 21 <= i7 && i7 <= 23) {
                t6 = t(bVar, new e());
                if (!t6.isEmpty()) {
                    o2.r.i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + t6.get(0).f16949a);
                }
            }
            e(str, t6);
            m4.q t7 = m4.q.t(t6);
            hashMap.put(bVar, t7);
            return t7;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(4:(2:72|73)|53|(9:56|57|58|59|60|61|62|64|65)|9)|32|33|34|36|9) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007f, code lost:
    
        if (r1.f17009b == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101 A[Catch: Exception -> 0x014f, TRY_ENTER, TryCatch #1 {Exception -> 0x014f, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0120, B:10:0x002d, B:13:0x0038, B:39:0x00f9, B:42:0x0101, B:44:0x0107, B:47:0x012a, B:48:0x014d), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<n> t(b bVar, d dVar) {
        String p7;
        String str;
        String str2;
        int i7;
        boolean z6;
        int i8;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean d7;
        boolean b7;
        boolean z7;
        b bVar2 = bVar;
        try {
            ArrayList<n> arrayList = new ArrayList<>();
            String str3 = bVar2.f17008a;
            int c7 = dVar.c();
            boolean e7 = dVar.e();
            int i9 = 0;
            while (i9 < c7) {
                MediaCodecInfo a7 = dVar.a(i9);
                if (!A(a7)) {
                    String name = a7.getName();
                    if (C(a7, name, e7, str3) && (p7 = p(a7, name, str3)) != null) {
                        try {
                            capabilitiesForType = a7.getCapabilitiesForType(p7);
                            d7 = dVar.d("tunneled-playback", p7, capabilitiesForType);
                            b7 = dVar.b("tunneled-playback", p7, capabilitiesForType);
                            z7 = bVar2.f17010c;
                        } catch (Exception e8) {
                            e = e8;
                            str = p7;
                            str2 = name;
                            i7 = i9;
                            z6 = e7;
                            i8 = c7;
                        }
                        if ((z7 || !b7) && (!z7 || d7)) {
                            boolean d8 = dVar.d("secure-playback", p7, capabilitiesForType);
                            boolean b8 = dVar.b("secure-playback", p7, capabilitiesForType);
                            boolean z8 = bVar2.f17009b;
                            if ((z8 || !b8) && (!z8 || d8)) {
                                boolean D = D(a7, str3);
                                boolean F = F(a7, str3);
                                boolean H = H(a7);
                                if (!e7 || bVar2.f17009b != d8) {
                                    if (!e7) {
                                        try {
                                        } catch (Exception e9) {
                                            e = e9;
                                            str = p7;
                                            i7 = i9;
                                            z6 = e7;
                                            i8 = c7;
                                            str2 = name;
                                            if (m0.f19752a > 23) {
                                            }
                                            o2.r.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                    str = p7;
                                    i7 = i9;
                                    z6 = e7;
                                    i8 = c7;
                                    if (!z6 && d8) {
                                        StringBuilder sb = new StringBuilder();
                                        try {
                                            sb.append(name);
                                            sb.append(".secure");
                                            str2 = name;
                                        } catch (Exception e10) {
                                            e = e10;
                                            str2 = name;
                                        }
                                        try {
                                            arrayList.add(n.C(sb.toString(), str3, str, capabilitiesForType, D, F, H, false, true));
                                            return arrayList;
                                        } catch (Exception e11) {
                                            e = e11;
                                            if (m0.f19752a > 23 || arrayList.isEmpty()) {
                                                o2.r.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                            o2.r.c("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                            i9 = i7 + 1;
                                            bVar2 = bVar;
                                            c7 = i8;
                                            e7 = z6;
                                        }
                                    }
                                    i9 = i7 + 1;
                                    bVar2 = bVar;
                                    c7 = i8;
                                    e7 = z6;
                                }
                                str = p7;
                                i7 = i9;
                                z6 = e7;
                                i8 = c7;
                                arrayList.add(n.C(name, str3, p7, capabilitiesForType, D, F, H, false, false));
                                i9 = i7 + 1;
                                bVar2 = bVar;
                                c7 = i8;
                                e7 = z6;
                            }
                        }
                    }
                }
                i7 = i9;
                z6 = e7;
                i8 = c7;
                i9 = i7 + 1;
                bVar2 = bVar;
                c7 = i8;
                e7 = z6;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new c(e12);
        }
    }

    public static List<n> u(List<n> list, final s1 s1Var) {
        ArrayList arrayList = new ArrayList(list);
        P(arrayList, new g() { // from class: i1.r
            @Override // i1.v.g
            public final int a(Object obj) {
                int L;
                L = v.L(s1.this, (n) obj);
                return L;
            }
        });
        return arrayList;
    }

    public static n v() {
        return r("audio/raw", false, false);
    }

    private static Pair<Integer, Integer> w(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        if (strArr.length < 3) {
            sb = new StringBuilder();
        } else {
            Matcher matcher = f17005a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                Integer k7 = k(str);
                if (k7 == null) {
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision profile string: ";
                } else {
                    str = strArr[2];
                    Integer j7 = j(str);
                    if (j7 != null) {
                        return new Pair<>(k7, j7);
                    }
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision level string: ";
                }
                sb.append(str2);
                sb.append(str);
                o2.r.i("MediaCodecUtil", sb.toString());
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed Dolby Vision codec string: ");
        sb.append(str);
        o2.r.i("MediaCodecUtil", sb.toString());
        return null;
    }

    private static Pair<Integer, Integer> x(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        if (strArr.length < 4) {
            sb = new StringBuilder();
        } else {
            int i7 = 1;
            Matcher matcher = f17005a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                if (!"1".equals(str)) {
                    if (!"2".equals(str)) {
                        sb = new StringBuilder();
                        str2 = "Unknown HEVC profile string: ";
                        sb.append(str2);
                        sb.append(str);
                        o2.r.i("MediaCodecUtil", sb.toString());
                        return null;
                    }
                    i7 = 2;
                }
                str = strArr[3];
                Integer z6 = z(str);
                if (z6 != null) {
                    return new Pair<>(Integer.valueOf(i7), z6);
                }
                sb = new StringBuilder();
                str2 = "Unknown HEVC level string: ";
                sb.append(str2);
                sb.append(str);
                o2.r.i("MediaCodecUtil", sb.toString());
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed HEVC codec string: ");
        sb.append(str);
        o2.r.i("MediaCodecUtil", sb.toString());
        return null;
    }

    private static Pair<Integer, Integer> y(String str, String[] strArr) {
        StringBuilder sb;
        int parseInt;
        int parseInt2;
        int R;
        String str2;
        if (strArr.length >= 3) {
            try {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2]);
                R = R(parseInt);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
            if (R == -1) {
                str2 = "Unknown VP9 profile: " + parseInt;
                o2.r.i("MediaCodecUtil", str2);
                return null;
            }
            int Q = Q(parseInt2);
            if (Q != -1) {
                return new Pair<>(Integer.valueOf(R), Integer.valueOf(Q));
            }
            sb = new StringBuilder();
            sb.append("Unknown VP9 level: ");
            sb.append(parseInt2);
            str2 = sb.toString();
            o2.r.i("MediaCodecUtil", str2);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed VP9 codec string: ");
        sb.append(str);
        str2 = sb.toString();
        o2.r.i("MediaCodecUtil", str2);
        return null;
    }

    private static Integer z(String str) {
        int i7;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                i7 = 32;
                break;
            case "H90":
                i7 = 128;
                break;
            case "H93":
                i7 = 512;
                break;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                i7 = 64;
                break;
            case "L93":
                i7 = 256;
                break;
            case "H120":
                i7 = 2048;
                break;
            case "H123":
                i7 = 8192;
                break;
            case "H150":
                i7 = 32768;
                break;
            case "H153":
                i7 = 131072;
                break;
            case "H156":
                i7 = 524288;
                break;
            case "H180":
                i7 = 2097152;
                break;
            case "H183":
                i7 = 8388608;
                break;
            case "H186":
                i7 = 33554432;
                break;
            case "L120":
                i7 = 1024;
                break;
            case "L123":
                i7 = 4096;
                break;
            case "L150":
                i7 = 16384;
                break;
            case "L153":
                i7 = 65536;
                break;
            case "L156":
                i7 = 262144;
                break;
            case "L180":
                i7 = 1048576;
                break;
            case "L183":
                i7 = 4194304;
                break;
            case "L186":
                i7 = 16777216;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i7);
    }
}
