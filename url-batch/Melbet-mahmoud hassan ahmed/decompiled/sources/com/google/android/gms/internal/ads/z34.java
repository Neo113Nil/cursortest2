package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z34 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14931a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14932b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14933c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f14934d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14935e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14936f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f14937g;

    z34(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        Objects.requireNonNull(str);
        this.f14931a = str;
        this.f14932b = str2;
        this.f14933c = str3;
        this.f14934d = codecCapabilities;
        this.f14935e = z9;
        this.f14936f = z11;
        this.f14937g = dy.h(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z34 c(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        int i7;
        if (codecCapabilities != null && (i7 = n13.f8865a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i7 <= 22) {
                String str4 = n13.f8868d;
                if (!"ODROID-XU3".equals(str4)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z11 = true;
            return new z34(str, str2, str3, codecCapabilities, z6, z7, z8, z11, codecCapabilities == null && n13.f8865a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z10 || (codecCapabilities != null && n13.f8865a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
        }
        z11 = false;
        return new z34(str, str2, str3, codecCapabilities, z6, z7, z8, z11, codecCapabilities == null && n13.f8865a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z10 || (codecCapabilities != null && n13.f8865a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    private static Point h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(n13.K(i7, widthAlignment) * widthAlignment, n13.K(i8, heightAlignment) * heightAlignment);
    }

    private final void i(String str) {
        String str2 = this.f14931a;
        String str3 = this.f14932b;
        String str4 = n13.f8869e;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(str.length() + 20 + length + str3.length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    private static boolean j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        Point h7 = h(videoCapabilities, i7, i8);
        int i9 = h7.x;
        int i10 = h7.y;
        return (d7 == -1.0d || d7 < 1.0d) ? videoCapabilities.isSizeSupported(i9, i10) : videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d7));
    }

    public final Point a(int i7, int i8) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14934d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return h(videoCapabilities, i7, i8);
    }

    public final de3 b(c0 c0Var, c0 c0Var2) {
        int i7 = true != n13.p(c0Var.f3660l, c0Var2.f3660l) ? 8 : 0;
        if (this.f14937g) {
            if (c0Var.f3668t != c0Var2.f3668t) {
                i7 |= 1024;
            }
            if (!this.f14935e && (c0Var.f3665q != c0Var2.f3665q || c0Var.f3666r != c0Var2.f3666r)) {
                i7 |= 512;
            }
            if (!n13.p(c0Var.f3672x, c0Var2.f3672x)) {
                i7 |= 2048;
            }
            String str = this.f14931a;
            if (n13.f8868d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !c0Var.d(c0Var2)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new de3(this.f14931a, c0Var, c0Var2, true != c0Var.d(c0Var2) ? 2 : 3, 0);
            }
        } else {
            if (c0Var.f3673y != c0Var2.f3673y) {
                i7 |= 4096;
            }
            if (c0Var.f3674z != c0Var2.f3674z) {
                i7 |= 8192;
            }
            if (c0Var.A != c0Var2.A) {
                i7 |= 16384;
            }
            if (i7 == 0 && "audio/mp4a-latm".equals(this.f14932b)) {
                Pair<Integer, Integer> b7 = q44.b(c0Var);
                Pair<Integer, Integer> b8 = q44.b(c0Var2);
                if (b7 != null && b8 != null) {
                    int intValue = ((Integer) b7.first).intValue();
                    int intValue2 = ((Integer) b8.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new de3(this.f14931a, c0Var, c0Var2, 3, 0);
                    }
                }
            }
            if (!c0Var.d(c0Var2)) {
                i7 |= 32;
            }
            if ("audio/opus".equals(this.f14932b)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new de3(this.f14931a, c0Var, c0Var2, 1, 0);
            }
        }
        return new de3(this.f14931a, c0Var, c0Var2, 0, i7);
    }

    public final boolean d(c0 c0Var) {
        String sb;
        String sb2;
        int i7;
        String c7;
        String str;
        StringBuilder sb3;
        String str2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str3 = c0Var.f3657i;
        int i8 = 16;
        if (str3 != null && (c7 = dy.c(str3)) != null) {
            if (this.f14932b.equals(c7)) {
                Pair<Integer, Integer> b7 = q44.b(c0Var);
                if (b7 != null) {
                    int intValue = ((Integer) b7.first).intValue();
                    int intValue2 = ((Integer) b7.second).intValue();
                    if (!this.f14937g) {
                        if (intValue == 42) {
                            intValue = 42;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel[] g7 = g();
                    if (n13.f8865a <= 23 && "video/x-vnd.on2.vp9".equals(this.f14932b) && g7.length == 0) {
                        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14934d;
                        int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                        int i9 = intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel.profile = 1;
                        codecProfileLevel.level = i9;
                        g7 = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : g7) {
                        if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                        }
                    }
                    str = c0Var.f3657i;
                    sb3 = new StringBuilder(String.valueOf(str).length() + 22 + c7.length());
                    str2 = "codec.profileLevel, ";
                }
            } else {
                str = c0Var.f3657i;
                sb3 = new StringBuilder(String.valueOf(str).length() + 13 + c7.length());
                str2 = "codec.mime ";
            }
            sb3.append(str2);
            sb3.append(str);
            sb3.append(", ");
            sb3.append(c7);
            i(sb3.toString());
            return false;
        }
        if (this.f14937g) {
            int i10 = c0Var.f3665q;
            if (i10 <= 0 || (i7 = c0Var.f3666r) <= 0) {
                return true;
            }
            if (n13.f8865a >= 21) {
                return f(i10, i7, c0Var.f3667s);
            }
            boolean z6 = i10 * i7 <= q44.a();
            if (!z6) {
                int i11 = c0Var.f3665q;
                int i12 = c0Var.f3666r;
                StringBuilder sb4 = new StringBuilder(40);
                sb4.append("legacyFrameSize, ");
                sb4.append(i11);
                sb4.append("x");
                sb4.append(i12);
                i(sb4.toString());
            }
            return z6;
        }
        int i13 = n13.f8865a;
        if (i13 >= 21) {
            int i14 = c0Var.f3674z;
            if (i14 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f14934d;
                if (codecCapabilities2 == null) {
                    sb2 = "sampleRate.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        sb2 = "sampleRate.aCaps";
                    } else if (!audioCapabilities.isSampleRateSupported(i14)) {
                        StringBuilder sb5 = new StringBuilder(31);
                        sb5.append("sampleRate.support, ");
                        sb5.append(i14);
                        sb2 = sb5.toString();
                    }
                }
                i(sb2);
                return false;
            }
            int i15 = c0Var.f3673y;
            if (i15 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f14934d;
                if (codecCapabilities3 == null) {
                    sb = "channelCount.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        sb = "channelCount.aCaps";
                    } else {
                        String str4 = this.f14931a;
                        String str5 = this.f14932b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i13 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                            if ("audio/ac3".equals(str5)) {
                                i8 = 6;
                            } else if (!"audio/eac3".equals(str5)) {
                                i8 = 30;
                            }
                            StringBuilder sb6 = new StringBuilder(String.valueOf(str4).length() + 59);
                            sb6.append("AssumedMaxChannelAdjustment: ");
                            sb6.append(str4);
                            sb6.append(", [");
                            sb6.append(maxInputChannelCount);
                            sb6.append(" to ");
                            sb6.append(i8);
                            sb6.append("]");
                            Log.w("MediaCodecInfo", sb6.toString());
                            maxInputChannelCount = i8;
                        }
                        if (maxInputChannelCount < i15) {
                            StringBuilder sb7 = new StringBuilder(33);
                            sb7.append("channelCount.support, ");
                            sb7.append(i15);
                            sb = sb7.toString();
                        }
                    }
                }
                i(sb);
                return false;
            }
        }
        return true;
    }

    public final boolean e(c0 c0Var) {
        if (this.f14937g) {
            return this.f14935e;
        }
        Pair<Integer, Integer> b7 = q44.b(c0Var);
        return b7 != null && ((Integer) b7.first).intValue() == 42;
    }

    public final boolean f(int i7, int i8, double d7) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14934d;
        if (codecCapabilities == null) {
            sb = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                sb = "sizeAndRate.vCaps";
            } else {
                if (j(videoCapabilities, i7, i8, d7)) {
                    return true;
                }
                if (i7 < i8 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f14931a) || !"mcv5a".equals(n13.f8866b)) && j(videoCapabilities, i8, i7, d7))) {
                    StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("sizeAndRate.rotated, ");
                    sb2.append(i7);
                    sb2.append("x");
                    sb2.append(i8);
                    sb2.append("x");
                    sb2.append(d7);
                    String sb3 = sb2.toString();
                    String str = this.f14931a;
                    String str2 = this.f14932b;
                    String str3 = n13.f8869e;
                    int length = String.valueOf(str).length();
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 25 + length + str2.length() + String.valueOf(str3).length());
                    sb4.append("AssumedSupport [");
                    sb4.append(sb3);
                    sb4.append("] [");
                    sb4.append(str);
                    sb4.append(", ");
                    sb4.append(str2);
                    sb4.append("] [");
                    sb4.append(str3);
                    sb4.append("]");
                    Log.d("MediaCodecInfo", sb4.toString());
                    return true;
                }
                StringBuilder sb5 = new StringBuilder(69);
                sb5.append("sizeAndRate.support, ");
                sb5.append(i7);
                sb5.append("x");
                sb5.append(i8);
                sb5.append("x");
                sb5.append(d7);
                sb = sb5.toString();
            }
        }
        i(sb);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14934d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final String toString() {
        return this.f14931a;
    }
}
