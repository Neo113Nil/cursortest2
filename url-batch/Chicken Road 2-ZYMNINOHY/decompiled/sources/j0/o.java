package j0;

import T.C0089g;
import T.C0097o;
import T.F;
import W.AbstractC0108a;
import W.AbstractC0110c;
import W.J;
import a0.C0138d;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f13766a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13767b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13768c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f13769d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13770e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13771f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13772g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13773h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f13774i;

    /* renamed from: j, reason: collision with root package name */
    public int f13775j;

    /* renamed from: k, reason: collision with root package name */
    public int f13776k;

    /* renamed from: l, reason: collision with root package name */
    public float f13777l;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        str.getClass();
        this.f13766a = str;
        this.f13767b = str2;
        this.f13768c = str3;
        this.f13769d = codecCapabilities;
        this.f13772g = z;
        this.f13770e = z6;
        this.f13771f = z7;
        this.f13773h = z8;
        this.f13774i = F.m(str2);
        this.f13777l = -3.4028235E38f;
        this.f13775j = -1;
        this.f13776k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i4, int i5, double d4) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(J.g(i4, widthAlignment) * widthAlignment, J.g(i5, heightAlignment) * heightAlignment);
        int i6 = point.x;
        int i7 = point.y;
        if (d4 == -1.0d || d4 < 1.0d) {
            return videoCapabilities.isSizeSupported(i6, i7);
        }
        double floor = Math.floor(d4);
        if (!videoCapabilities.areSizeAndRateSupported(i6, i7, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i6, i7);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    public static o i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z8;
        boolean z9;
        boolean z10;
        String str6;
        boolean z11 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z12 = z6 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                z7 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z8 = z;
                z9 = z4;
                z10 = z5;
                str4 = str2;
                return new o(str6, str4, str5, codecCapabilities2, z8, z9, z10, z11, z12, z7);
            }
        }
        z7 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z8 = z;
        z9 = z4;
        z10 = z5;
        str6 = str;
        return new o(str6, str4, str5, codecCapabilities2, z8, z9, z10, z11, z12, z7);
    }

    public final C0138d b(C0097o c0097o, C0097o c0097o2) {
        C0097o c0097o3;
        C0097o c0097o4;
        int i4;
        String str = c0097o.n;
        C0089g c0089g = c0097o.f2844D;
        String str2 = c0097o2.n;
        C0089g c0089g2 = c0097o2.f2844D;
        int i5 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f13774i) {
            if (c0097o.z != c0097o2.z) {
                i5 |= 1024;
            }
            boolean z = (c0097o.f2874u == c0097o2.f2874u && c0097o.v == c0097o2.v) ? false : true;
            if (!this.f13770e && z) {
                i5 |= 512;
            }
            if ((!C0089g.e(c0089g) || !C0089g.e(c0089g2)) && !Objects.equals(c0089g, c0089g2)) {
                i5 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f13766a) && !c0097o.b(c0097o2)) {
                i5 |= 2;
            }
            int i6 = c0097o.f2875w;
            if (i6 != -1 && (i4 = c0097o.f2876x) != -1 && i6 == c0097o2.f2875w && i4 == c0097o2.f2876x && z) {
                i5 |= 2;
            }
            if (i5 == 0 && Objects.equals(c0097o2.n, "video/dolby-vision")) {
                Pair c4 = AbstractC0110c.c(c0097o);
                Pair c5 = AbstractC0110c.c(c0097o2);
                if (c4 == null || c5 == null || !((Integer) c4.first).equals(c5.first)) {
                    i5 |= 2;
                }
            }
            if (i5 == 0) {
                return new C0138d(this.f13766a, c0097o, c0097o2, c0097o.b(c0097o2) ? 3 : 2, 0);
            }
            c0097o3 = c0097o;
            c0097o4 = c0097o2;
        } else {
            c0097o3 = c0097o;
            c0097o4 = c0097o2;
            if (c0097o3.f2846F != c0097o4.f2846F) {
                i5 |= 4096;
            }
            if (c0097o3.f2847G != c0097o4.f2847G) {
                i5 |= 8192;
            }
            if (c0097o3.f2848H != c0097o4.f2848H) {
                i5 |= 16384;
            }
            String str3 = this.f13767b;
            if (i5 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair c6 = AbstractC0110c.c(c0097o3);
                Pair c7 = AbstractC0110c.c(c0097o4);
                if (c6 != null && c7 != null) {
                    int intValue = ((Integer) c6.first).intValue();
                    int intValue2 = ((Integer) c7.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C0138d(this.f13766a, c0097o3, c0097o4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && c6.equals(c7)) {
                        return new C0138d(this.f13766a, c0097o3, c0097o4, 3, 0);
                    }
                }
            }
            if (i5 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new C0138d(this.f13766a, c0097o3, c0097o4, 3, 0);
            }
            if (!c0097o3.b(c0097o4)) {
                i5 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i5 |= 2;
            }
            if (i5 == 0) {
                return new C0138d(this.f13766a, c0097o3, c0097o4, 1, 0);
            }
        }
        return new C0138d(this.f13766a, c0097o3, c0097o4, 0, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Context context, C0097o c0097o, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair pair;
        String str;
        Pair c4 = AbstractC0110c.c(c0097o);
        String str2 = c0097o.n;
        String str3 = this.f13768c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String n = F.n(str3);
            if (n.equals("video/mv-hevc")) {
                return true;
            }
            if (n.equals("video/hevc")) {
                HashMap hashMap = w.f13856a;
                List list = c0097o.f2870q;
                int i4 = 0;
                loop0: while (true) {
                    if (i4 >= list.size()) {
                        pair = null;
                        str = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i4);
                    int length = bArr.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        v2.F j4 = I.j();
                        int i5 = 0;
                        while (i5 < bArr.length) {
                            int b4 = X.p.b(bArr, i5, bArr.length, zArr);
                            if (b4 != bArr.length) {
                                j4.b(Integer.valueOf(b4));
                            }
                            i5 = b4 + 3;
                        }
                        a0 f4 = j4.f();
                        for (int i6 = 0; i6 < f4.f15607d; i6++) {
                            if (((Integer) f4.get(i6)).intValue() + 3 < length) {
                                W.t tVar = new W.t(bArr, ((Integer) f4.get(i6)).intValue() + 3, length);
                                A0.c f5 = X.p.f(tVar);
                                if (f5.f9a == 33 && f5.f10b == 0) {
                                    tVar.t(4);
                                    int i7 = tVar.i(3);
                                    tVar.s();
                                    pair = null;
                                    X.i g4 = X.p.g(tVar, true, i7, null);
                                    str = AbstractC0110c.b(g4.f3504a, g4.f3505b, g4.f3506c, g4.f3507d, g4.f3508e, g4.f3509f);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i4++;
                }
                if (str != null) {
                    String trim = str.trim();
                    String str4 = J.f3263a;
                    c4 = AbstractC0110c.d(str, trim.split("\\.", -1), c0097o.f2844D);
                    if (c4 != null) {
                        return true;
                    }
                    int intValue = ((Integer) c4.first).intValue();
                    int intValue2 = ((Integer) c4.second).intValue();
                    boolean equals = "video/dolby-vision".equals(str2);
                    String str5 = this.f13767b;
                    if (equals) {
                        str5.getClass();
                        switch (str5) {
                            case "video/av01":
                            case "video/hevc":
                                intValue = 2;
                                break;
                            case "video/avc":
                                intValue = 8;
                                break;
                        }
                        intValue2 = 0;
                    }
                    if (!this.f13774i && !str5.equals("audio/ac4") && intValue != 42) {
                        return true;
                    }
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13769d;
                    if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str5.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                        int i8 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
                        codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{w.b(1026, i8)} : new MediaCodecInfo.CodecProfileLevel[]{w.b(257, i8), w.b(513, i8), w.b(514, i8), w.b(1026, i8), w.b(1028, i8)};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z)) {
                            if (!"video/hevc".equals(str5) || 2 != intValue) {
                                return true;
                            }
                            String str6 = Build.DEVICE;
                            if (!"sailfish".equals(str6) && !"marlin".equals(str6)) {
                                return true;
                            }
                        }
                    }
                    h("codec.profileLevel, " + c0097o.f2866k + ", " + str3);
                    return false;
                }
                c4 = pair;
            }
        }
        if (c4 != null) {
        }
    }

    public final boolean d(C0097o c0097o) {
        return (Objects.equals(c0097o.n, "audio/flac") && c0097o.f2848H == 22 && Build.VERSION.SDK_INT < 34 && this.f13766a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, C0097o c0097o) {
        int i4;
        String str = c0097o.n;
        String str2 = this.f13767b;
        if ((!str2.equals(str) && !str2.equals(w.c(c0097o))) || !c(context, c0097o, true) || !d(c0097o)) {
            return false;
        }
        if (this.f13774i) {
            int i5 = c0097o.f2874u;
            if (i5 > 0 && (i4 = c0097o.v) > 0) {
                return g(i5, i4, c0097o.f2877y);
            }
        } else {
            int i6 = c0097o.f2847G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13769d;
            if (i6 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i6)) {
                    h("sampleRate.support, " + i6);
                    return false;
                }
            }
            int i7 = c0097o.f2846F;
            if (i7 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i8 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    AbstractC0108a.s("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f13766a + ", [" + maxInputChannelCount + " to " + i8 + "]");
                    maxInputChannelCount = i8;
                }
                if (maxInputChannelCount < i7) {
                    h("channelCount.support, " + i7);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(C0097o c0097o) {
        if (this.f13774i) {
            return this.f13770e;
        }
        Pair c4 = AbstractC0110c.c(c0097o);
        return c4 != null && ((Integer) c4.first).intValue() == 42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r3 = r1.getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r2 != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(int i4, int i5, double d4) {
        char c4;
        Boolean bool;
        List supportedPerformancePoints;
        boolean covers;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13769d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            if (i6 >= 29 && (((bool = U.i.f3046c) == null || !bool.booleanValue()) && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty())) {
                io.flutter.plugin.platform.e.j();
                MediaCodecInfo.VideoCapabilities.PerformancePoint e4 = io.flutter.plugin.platform.e.e(i4, i5, (int) d4);
                int i7 = 0;
                while (true) {
                    if (i7 >= supportedPerformancePoints.size()) {
                        c4 = 1;
                        break;
                    }
                    covers = io.flutter.plugin.platform.e.f(supportedPerformancePoints.get(i7)).covers(e4);
                    if (covers) {
                        c4 = 2;
                        break;
                    }
                    i7++;
                }
                if (c4 == 1 && U.i.f3046c == null) {
                    int p2 = i6 >= 35 ? 2 : O3.l.p(false);
                    int p4 = O3.l.p(true);
                    boolean z = p2 == 0 || (p4 != 0 ? !(p2 == 2 && p4 == 2) : p2 != 2);
                    U.i.f3046c = Boolean.valueOf(z);
                }
                if (c4 != 2) {
                    if (c4 == 1) {
                        h("sizeAndRate.cover, " + i4 + "x" + i5 + "@" + d4);
                        return false;
                    }
                }
                return true;
            }
            c4 = 0;
            if (c4 != 2) {
            }
            return true;
        }
        if (!a(videoCapabilities, i4, i5, d4)) {
            if (i4 < i5) {
                String str = this.f13766a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i5, i4, d4)) {
                    AbstractC0108a.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i4 + "x" + i5 + "@" + d4) + "] [" + str + ", " + this.f13767b + "] [" + J.f3263a + "]");
                    return true;
                }
            }
            h("sizeAndRate.support, " + i4 + "x" + i5 + "@" + d4);
            return false;
        }
        return true;
    }

    public final void h(String str) {
        AbstractC0108a.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f13766a + ", " + this.f13767b + "] [" + J.f3263a + "]");
    }

    public final String toString() {
        return this.f13766a;
    }
}
