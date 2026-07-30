package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.bQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2986bQ {

    /* renamed from: a, reason: collision with root package name */
    public final String f29490a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29491b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29492c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f29493d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29494e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29495f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f29496g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f29497h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f29498j;

    /* renamed from: k, reason: collision with root package name */
    public int f29499k;

    /* renamed from: l, reason: collision with root package name */
    public float f29500l;

    public C2986bQ(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9, boolean z10, boolean z11) {
        str.getClass();
        this.f29490a = str;
        this.f29491b = str2;
        this.f29492c = str3;
        this.f29493d = codecCapabilities;
        this.f29496g = z8;
        this.f29494e = z9;
        this.f29495f = z10;
        this.f29497h = z11;
        this.i = K4.b(str2);
        this.f29500l = -3.4028235E38f;
        this.f29498j = -1;
        this.f29499k = -1;
    }

    public static C2986bQ a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9) {
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z10;
        boolean z11;
        String str6;
        boolean z12 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z13 = z9 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                str6 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z10 = z8;
                z11 = true;
                str4 = str;
                return new C2986bQ(str4, str6, str5, codecCapabilities2, z10, z12, z13, z11);
            }
        }
        str4 = str;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z10 = z8;
        z11 = false;
        str6 = str2;
        return new C2986bQ(str4, str6, str5, codecCapabilities2, z10, z12, z13, z11);
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4, double d2) {
        Point j9 = j(videoCapabilities, i, i4);
        int i9 = j9.x;
        int i10 = j9.y;
        if (d2 == -1.0d || d2 < 1.0d) {
            return videoCapabilities.isSizeSupported(i9, i10);
        }
        double floor = Math.floor(d2);
        if (!videoCapabilities.areSizeAndRateSupported(i9, i10, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i9, i10);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = AbstractC3548lu.f32613a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i4 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(Context context, TP tp) {
        int i;
        String str = tp.f27776o;
        String str2 = this.f29491b;
        if (!(str2.equals(str) || str2.equals(AbstractC3419jQ.d(tp))) || !f(context, tp, true) || !g(tp)) {
            return false;
        }
        if (this.i) {
            int i4 = tp.f27783v;
            if (i4 > 0 && (i = tp.f27784w) > 0) {
                return e(i4, i, tp.f27787z);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f29493d;
            int i9 = tp.f27756I;
            if (i9 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i9)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 20);
                    sb.append("sampleRate.support, ");
                    sb.append(i9);
                    h(sb.toString());
                    return false;
                }
            }
            int i10 = tp.f27754G;
            if (i10 != -1) {
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
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !com.anythink.basead.exoplayer.k.o.f8619t.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8585I.equals(str2) && !com.anythink.basead.exoplayer.k.o.J.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8617r.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8583G.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8584H.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8622w.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8586K.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8623x.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8624y.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8588M.equals(str2))) {
                    int i11 = com.anythink.basead.exoplayer.k.o.f8625z.equals(str2) ? 6 : com.anythink.basead.exoplayer.k.o.f8577A.equals(str2) ? 16 : 30;
                    String str3 = this.f29490a;
                    StringBuilder sb2 = new StringBuilder(AbstractC5051n.a(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i11)));
                    sb2.append("AssumedMaxChannelAdjustment: ");
                    sb2.append(str3);
                    sb2.append(", [");
                    sb2.append(maxInputChannelCount);
                    sb2.append(" to ");
                    sb2.append(i11);
                    sb2.append("]");
                    AbstractC3217fl.I(com.anythink.basead.exoplayer.f.a.f7353a, sb2.toString());
                    maxInputChannelCount = i11;
                }
                if (maxInputChannelCount < i10) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 22);
                    sb3.append("channelCount.support, ");
                    sb3.append(i10);
                    h(sb3.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(TP tp) {
        boolean z8;
        if (this.i) {
            return this.f29494e;
        }
        C3810qm c4 = AbstractC4295zm.c(tp);
        if (c4 == null || !(z8 = c4.f33873b)) {
            return false;
        }
        PA.T(z8);
        return c4.f33872a == 42;
    }

    public final MN d(TP tp, TP tp2) {
        TP tp3;
        TP tp4;
        int i;
        String str = tp.f27776o;
        String str2 = tp2.f27776o;
        int i4 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (tp.f27748A != tp2.f27748A) {
                i4 |= 1024;
            }
            boolean z8 = (tp.f27783v == tp2.f27783v && tp.f27784w == tp2.f27784w) ? false : true;
            if (!this.f29494e && z8) {
                i4 |= 512;
            }
            C2980bK c2980bK = tp.f27752E;
            boolean a9 = C2980bK.a(c2980bK);
            C2980bK c2980bK2 = tp2.f27752E;
            if ((!a9 || !C2980bK.a(c2980bK2)) && !Objects.equals(c2980bK, c2980bK2)) {
                i4 |= 2048;
            }
            boolean startsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.f29490a;
            if (startsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !tp.b(tp2)) {
                i4 |= 2;
            }
            int i9 = tp.f27785x;
            if (i9 != -1 && (i = tp.f27786y) != -1 && i9 == tp2.f27785x && i == tp2.f27786y && z8) {
                i4 |= 2;
            }
            if (i4 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair b9 = AbstractC4295zm.b(tp);
                Pair b10 = AbstractC4295zm.b(tp2);
                if (b9 == null || b10 == null || !((Integer) b9.first).equals(b10.first)) {
                    i4 = 2;
                }
            }
            if (i4 == 0) {
                return new MN(str3, tp, tp2, true == tp.b(tp2) ? 3 : 2, 0);
            }
            tp3 = tp;
            tp4 = tp2;
        } else {
            tp3 = tp;
            tp4 = tp2;
            if (tp3.f27754G != tp4.f27754G) {
                i4 |= 4096;
            }
            if (tp3.f27756I != tp4.f27756I) {
                i4 |= 8192;
            }
            if (tp3.J != tp4.J) {
                i4 |= 16384;
            }
            String str4 = this.f29491b;
            if (i4 == 0 && (str4.equals(com.anythink.basead.exoplayer.k.o.f8617r) || str4.equals("audio/ac4"))) {
                Pair b11 = AbstractC4295zm.b(tp3);
                Pair b12 = AbstractC4295zm.b(tp4);
                if (b11 != null && b12 != null) {
                    int intValue = ((Integer) b11.first).intValue();
                    int intValue2 = ((Integer) b12.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new MN(this.f29490a, tp3, tp4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && b11.equals(b12)) {
                        return new MN(this.f29490a, tp3, tp4, 3, 0);
                    }
                }
            }
            if (i4 == 0 && (str4.equals(com.anythink.basead.exoplayer.k.o.f8578B) || str4.equals(com.anythink.basead.exoplayer.k.o.f8577A))) {
                return new MN(this.f29490a, tp3, tp4, 3, 0);
            }
            if (!tp3.b(tp4)) {
                i4 |= 32;
            }
            if (com.anythink.basead.exoplayer.k.o.f8584H.equals(str4)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new MN(this.f29490a, tp3, tp4, 1, 0);
            }
        }
        return new MN(this.f29490a, tp3, tp4, 0, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r5 = r1.getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i, int i4, double d2) {
        char c4;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z8;
        boolean covers;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f29493d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            if (i9 >= 29 && (((bool = YD.f28812a) == null || !bool.booleanValue()) && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty())) {
                MediaCodecInfo.VideoCapabilities.PerformancePoint d3 = R2.a.d(i, i4, (int) d2);
                int i10 = 0;
                while (true) {
                    if (i10 >= supportedPerformancePoints.size()) {
                        c4 = 1;
                        break;
                    }
                    covers = R2.a.e(supportedPerformancePoints.get(i10)).covers(d3);
                    if (covers) {
                        c4 = 2;
                        break;
                    }
                    i10++;
                }
                if (c4 == 1 && YD.f28812a == null) {
                    if (i9 < 37) {
                        int g9 = C3686oN.g(true);
                        if (i9 < 35 ? C3686oN.g(false) != 2 || g9 == 1 : g9 == 1) {
                            z8 = true;
                            YD.f28812a = Boolean.valueOf(z8);
                        }
                    }
                    z8 = false;
                    YD.f28812a = Boolean.valueOf(z8);
                }
                if (c4 != 2) {
                    if (c4 == 1) {
                        StringBuilder sb = new StringBuilder(AbstractC5051n.a(String.valueOf(i).length() + 20, 1, String.valueOf(i4)) + String.valueOf(d2).length());
                        AbstractC5051n.i(sb, "sizeAndRate.cover, ", i, "x", i4);
                        sb.append("@");
                        sb.append(d2);
                        h(sb.toString());
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
        if (!i(videoCapabilities, i, i4, d2)) {
            if (i < i4) {
                String str = this.f29490a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && i(videoCapabilities, i4, i, d2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + CL.b(i, 22) + 1 + String.valueOf(d2).length());
                    AbstractC5051n.i(sb2, "sizeAndRate.rotated, ", i, "x", i4);
                    sb2.append("@");
                    sb2.append(d2);
                    String sb3 = sb2.toString();
                    int length = str.length();
                    String str2 = AbstractC3548lu.f32613a;
                    String str3 = this.f29491b;
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 19 + length + 2 + String.valueOf(str3).length() + 3 + String.valueOf(str2).length() + 1);
                    sb4.append("AssumedSupport [");
                    sb4.append(sb3);
                    sb4.append("] [");
                    sb4.append(str);
                    AbstractC5051n.j(sb4, ", ", str3, "] [", str2);
                    sb4.append("]");
                    AbstractC3217fl.o(com.anythink.basead.exoplayer.f.a.f7353a, sb4.toString());
                    return true;
                }
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(i4).length() + CL.b(i, 22) + 1 + String.valueOf(d2).length());
            AbstractC5051n.i(sb5, "sizeAndRate.support, ", i, "x", i4);
            sb5.append("@");
            sb5.append(d2);
            h(sb5.toString());
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Context context, TP tp, boolean z8) {
        int i;
        int i4;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        C3810qm c4 = AbstractC4295zm.c(tp);
        String str = this.f29492c;
        char c9 = 65535;
        String str2 = tp.f27776o;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String h9 = K4.h(str);
            if (!h9.equals("video/mv-hevc")) {
                if (h9.equals(com.anythink.basead.exoplayer.k.o.i)) {
                    HashMap hashMap = AbstractC3419jQ.f32115a;
                    String W8 = PA.W(tp.f27779r);
                    if (W8 == null) {
                        c4 = null;
                    } else {
                        String trim = W8.trim();
                        String str3 = AbstractC3548lu.f32613a;
                        c4 = AbstractC4295zm.d(W8, trim.split("\\.", -1), tp.f27752E);
                    }
                }
            }
            return true;
        }
        if (c4 != null) {
            boolean z9 = c4.f33873b;
            if (!z9) {
                return false;
            }
            PA.T(z9);
            PA.T(z9);
            boolean equals = "video/dolby-vision".equals(str2);
            String str4 = this.f29491b;
            int i9 = 8;
            if (equals) {
                int hashCode = str4.hashCode();
                if (hashCode != -1662735862) {
                    if (hashCode != -1662541442) {
                        if (hashCode == 1331836730 && str4.equals(com.anythink.basead.exoplayer.k.o.f8608h)) {
                            c9 = 0;
                        }
                    } else if (str4.equals(com.anythink.basead.exoplayer.k.o.i)) {
                        c9 = 1;
                    }
                } else if (str4.equals("video/av01")) {
                    c9 = 2;
                }
                if (c9 == 0) {
                    i4 = 0;
                    i = 8;
                } else if (c9 == 1 || c9 == 2) {
                    i4 = 0;
                    i = 2;
                }
                if (!this.i || str4.equals("audio/ac4") || i == 42) {
                    codecCapabilities = this.f29493d;
                    if (codecCapabilities != null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                        if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                            i9 = 16;
                        }
                        codecProfileLevelArr = !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{AbstractC3419jQ.c(1026, i9)} : new MediaCodecInfo.CodecProfileLevel[]{AbstractC3419jQ.c(257, i9), AbstractC3419jQ.c(513, i9), AbstractC3419jQ.c(514, i9), AbstractC3419jQ.c(1026, i9), AbstractC3419jQ.c(1028, i9)};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (codecProfileLevel.profile == i && (codecProfileLevel.level >= i4 || !z8)) {
                            if (com.anythink.basead.exoplayer.k.o.i.equals(str4) && i == 2) {
                                String str5 = Build.DEVICE;
                                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                                }
                            }
                        }
                    }
                    String str6 = tp.f27772k;
                    h(com.anythink.basead.b.c.i.q(new StringBuilder(str.length() + String.valueOf(str6).length() + 22), "codec.profileLevel, ", str6, ", ", str));
                    return false;
                }
            }
            i = c4.f33872a;
            i4 = c4.f33874c;
            if (!this.i) {
            }
            codecCapabilities = this.f29493d;
            if (codecCapabilities != null) {
            }
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            if (str4.equals("audio/ac4")) {
                if (codecCapabilities != null) {
                    i9 = 16;
                }
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                }
            }
            while (r5 < r13) {
            }
            String str62 = tp.f27772k;
            h(com.anythink.basead.b.c.i.q(new StringBuilder(str.length() + String.valueOf(str62).length() + 22), "codec.profileLevel, ", str62, ", ", str));
            return false;
        }
        return true;
    }

    public final boolean g(TP tp) {
        return (Objects.equals(tp.f27776o, com.anythink.basead.exoplayer.k.o.f8586K) && tp.J == 22 && Build.VERSION.SDK_INT < 34 && this.f29490a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void h(String str) {
        String str2 = AbstractC3548lu.f32613a;
        String str3 = this.f29491b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.f29490a;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        AbstractC5051n.j(sb, "NoSupport [", str, "] [", str4);
        AbstractC5051n.j(sb, ", ", str3, "] [", str2);
        sb.append("]");
        AbstractC3217fl.o(com.anythink.basead.exoplayer.f.a.f7353a, sb.toString());
    }

    public final String toString() {
        return this.f29490a;
    }
}
