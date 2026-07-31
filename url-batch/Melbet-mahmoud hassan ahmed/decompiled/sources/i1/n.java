package i1;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import o2.m0;
import r0.s1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f16949a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16950b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16951c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f16952d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16953e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16954f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16955g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16956h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16957i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f16958j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f16959k;

    n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f16949a = (String) o2.a.e(str);
        this.f16950b = str2;
        this.f16951c = str3;
        this.f16952d = codecCapabilities;
        this.f16956h = z6;
        this.f16957i = z7;
        this.f16958j = z8;
        this.f16953e = z9;
        this.f16954f = z10;
        this.f16955g = z11;
        this.f16959k = o2.v.s(str2);
    }

    private static boolean A(String str, int i7) {
        if ("video/hevc".equals(str) && 2 == i7) {
            String str2 = m0.f19753b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean B(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(m0.f19753b)) ? false : true;
    }

    public static n C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        return new n(str, str2, str3, codecCapabilities, z6, z7, z8, (z9 || codecCapabilities == null || !h(codecCapabilities) || z(str)) ? false : true, codecCapabilities != null && s(codecCapabilities), z10 || (codecCapabilities != null && q(codecCapabilities)));
    }

    private static int a(String str, String str2, int i7) {
        if (i7 > 1 || ((m0.f19752a >= 26 && i7 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i7;
        }
        int i8 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        o2.r.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i7 + " to " + i8 + "]");
        return i8;
    }

    private static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(m0.l(i7, widthAlignment) * widthAlignment, m0.l(i8, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        Point c7 = c(videoCapabilities, i7, i8);
        int i9 = c7.x;
        int i10 = c7.y;
        return (d7 == -1.0d || d7 < 1.0d) ? videoCapabilities.isSizeSupported(i9, i10) : videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d7));
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i7 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i7;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f19752a >= 19 && i(codecCapabilities);
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean l(s1 s1Var) {
        Pair<Integer, Integer> q7;
        if (s1Var.f20953n == null || (q7 = v.q(s1Var)) == null) {
            return true;
        }
        int intValue = ((Integer) q7.first).intValue();
        int intValue2 = ((Integer) q7.second).intValue();
        if ("video/dolby-vision".equals(s1Var.f20956q)) {
            if (!"video/avc".equals(this.f16950b)) {
                intValue = "video/hevc".equals(this.f16950b) ? 2 : 8;
            }
            intValue2 = 0;
        }
        if (!this.f16959k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g7 = g();
        if (m0.f19752a <= 23 && "video/x-vnd.on2.vp9".equals(this.f16950b) && g7.length == 0) {
            g7 = f(this.f16952d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g7) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2 && !A(this.f16950b, intValue)) {
                return true;
            }
        }
        w("codec.profileLevel, " + s1Var.f20953n + ", " + this.f16951c);
        return false;
    }

    private boolean o(s1 s1Var) {
        return this.f16950b.equals(s1Var.f20956q) || this.f16950b.equals(v.m(s1Var));
    }

    private static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f19752a >= 21 && r(codecCapabilities);
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f19752a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void v(String str) {
        o2.r.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f16949a + ", " + this.f16950b + "] [" + m0.f19756e + "]");
    }

    private void w(String str) {
        o2.r.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f16949a + ", " + this.f16950b + "] [" + m0.f19756e + "]");
    }

    private static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean y(String str) {
        return m0.f19755d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean z(String str) {
        if (m0.f19752a <= 22) {
            String str2 = m0.f19755d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public Point b(int i7, int i8) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16952d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i7, i8);
    }

    public u0.i e(s1 s1Var, s1 s1Var2) {
        int i7 = !m0.c(s1Var.f20956q, s1Var2.f20956q) ? 8 : 0;
        if (this.f16959k) {
            if (s1Var.f20964y != s1Var2.f20964y) {
                i7 |= 1024;
            }
            if (!this.f16953e && (s1Var.f20961v != s1Var2.f20961v || s1Var.f20962w != s1Var2.f20962w)) {
                i7 |= 512;
            }
            if (!m0.c(s1Var.C, s1Var2.C)) {
                i7 |= 2048;
            }
            if (y(this.f16949a) && !s1Var.g(s1Var2)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new u0.i(this.f16949a, s1Var, s1Var2, s1Var.g(s1Var2) ? 3 : 2, 0);
            }
        } else {
            if (s1Var.D != s1Var2.D) {
                i7 |= 4096;
            }
            if (s1Var.E != s1Var2.E) {
                i7 |= 8192;
            }
            if (s1Var.F != s1Var2.F) {
                i7 |= 16384;
            }
            if (i7 == 0 && "audio/mp4a-latm".equals(this.f16950b)) {
                Pair<Integer, Integer> q7 = v.q(s1Var);
                Pair<Integer, Integer> q8 = v.q(s1Var2);
                if (q7 != null && q8 != null) {
                    int intValue = ((Integer) q7.first).intValue();
                    int intValue2 = ((Integer) q8.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new u0.i(this.f16949a, s1Var, s1Var2, 3, 0);
                    }
                }
            }
            if (!s1Var.g(s1Var2)) {
                i7 |= 32;
            }
            if (x(this.f16950b)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new u0.i(this.f16949a, s1Var, s1Var2, 1, 0);
            }
        }
        return new u0.i(this.f16949a, s1Var, s1Var2, 0, i7);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16952d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i7) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16952d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else {
                if (a(this.f16949a, this.f16950b, audioCapabilities.getMaxInputChannelCount()) >= i7) {
                    return true;
                }
                str = "channelCount.support, " + i7;
            }
        }
        w(str);
        return false;
    }

    public boolean k(int i7) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16952d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i7)) {
                    return true;
                }
                str = "sampleRate.support, " + i7;
            }
        }
        w(str);
        return false;
    }

    public boolean m(s1 s1Var) {
        int i7;
        if (!o(s1Var) || !l(s1Var)) {
            return false;
        }
        if (!this.f16959k) {
            if (m0.f19752a >= 21) {
                int i8 = s1Var.E;
                if (i8 != -1 && !k(i8)) {
                    return false;
                }
                int i9 = s1Var.D;
                if (i9 != -1 && !j(i9)) {
                    return false;
                }
            }
            return true;
        }
        int i10 = s1Var.f20961v;
        if (i10 <= 0 || (i7 = s1Var.f20962w) <= 0) {
            return true;
        }
        if (m0.f19752a >= 21) {
            return u(i10, i7, s1Var.f20963x);
        }
        boolean z6 = i10 * i7 <= v.N();
        if (!z6) {
            w("legacyFrameSize, " + s1Var.f20961v + "x" + s1Var.f20962w);
        }
        return z6;
    }

    public boolean n() {
        if (m0.f19752a >= 29 && "video/x-vnd.on2.vp9".equals(this.f16950b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean p(s1 s1Var) {
        if (this.f16959k) {
            return this.f16953e;
        }
        Pair<Integer, Integer> q7 = v.q(s1Var);
        return q7 != null && ((Integer) q7.first).intValue() == 42;
    }

    public String toString() {
        return this.f16949a;
    }

    public boolean u(int i7, int i8, double d7) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16952d;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else {
                if (d(videoCapabilities, i7, i8, d7)) {
                    return true;
                }
                if (i7 < i8 && B(this.f16949a) && d(videoCapabilities, i8, i7, d7)) {
                    v("sizeAndRate.rotated, " + i7 + "x" + i8 + "x" + d7);
                    return true;
                }
                str = "sizeAndRate.support, " + i7 + "x" + i8 + "x" + d7;
            }
        }
        w(str);
        return false;
    }
}
