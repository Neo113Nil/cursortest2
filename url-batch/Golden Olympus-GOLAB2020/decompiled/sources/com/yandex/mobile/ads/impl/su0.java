package com.yandex.mobile.ads.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes3.dex */
public final class su0 {

    /* renamed from: i, reason: collision with root package name */
    private static final tu0 f31946i = hm1.e();

    /* renamed from: a, reason: collision with root package name */
    public final String f31947a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31948b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31949c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f31950d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31951e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31952f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31953g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f31954h;

    su0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z5, boolean z6) {
        this.f31947a = (String) C2253tf.a(str);
        this.f31948b = str2;
        this.f31949c = str3;
        this.f31950d = codecCapabilities;
        this.f31953g = z4;
        this.f31951e = z5;
        this.f31952f = z6;
        this.f31954h = i01.f(str2);
    }

    public final Point a(int i4, int i5) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f31950d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i6 = u82.f32873a;
        return new Point((((i4 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i5 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(yb0 yb0Var) {
        if (this.f31954h) {
            return this.f31951e;
        }
        Pair<Integer, Integer> b4 = av0.b(yb0Var);
        return b4 != null && ((Integer) b4.first).intValue() == 42;
    }

    public final String toString() {
        return this.f31947a;
    }

    public final iy a(yb0 yb0Var, yb0 yb0Var2) {
        yb0 yb0Var3;
        yb0 yb0Var4;
        int i4 = !u82.a(yb0Var.f34991m, yb0Var2.f34991m) ? 8 : 0;
        if (this.f31954h) {
            if (yb0Var.f34999u != yb0Var2.f34999u) {
                i4 |= 1024;
            }
            if (!this.f31951e && (yb0Var.f34996r != yb0Var2.f34996r || yb0Var.f34997s != yb0Var2.f34997s)) {
                i4 |= UserVerificationMethods.USER_VERIFY_NONE;
            }
            if (!u82.a(yb0Var.f35003y, yb0Var2.f35003y)) {
                i4 |= com.ironsource.mediationsdk.metadata.a.f17688n;
            }
            String str = this.f31947a;
            String str2 = u82.f32876d;
            tu0 tu0Var = f31946i;
            if (str2.startsWith(tu0Var.i()) && tu0Var.g().equals(str) && !yb0Var.a(yb0Var2)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new iy(this.f31947a, yb0Var, yb0Var2, yb0Var.a(yb0Var2) ? 3 : 2, 0);
            }
            yb0Var3 = yb0Var;
            yb0Var4 = yb0Var2;
        } else {
            yb0Var3 = yb0Var;
            yb0Var4 = yb0Var2;
            if (yb0Var3.f35004z != yb0Var4.f35004z) {
                i4 |= Base64Utils.IO_BUFFER_SIZE;
            }
            if (yb0Var3.f34973A != yb0Var4.f34973A) {
                i4 |= 8192;
            }
            if (yb0Var3.f34974B != yb0Var4.f34974B) {
                i4 |= 16384;
            }
            if (i4 == 0 && "audio/mp4a-latm".equals(this.f31948b)) {
                Pair<Integer, Integer> b4 = av0.b(yb0Var3);
                Pair<Integer, Integer> b5 = av0.b(yb0Var4);
                if (b4 != null && b5 != null) {
                    int intValue = ((Integer) b4.first).intValue();
                    int intValue2 = ((Integer) b5.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new iy(this.f31947a, yb0Var3, yb0Var4, 3, 0);
                    }
                }
            }
            if (!yb0Var3.a(yb0Var4)) {
                i4 |= 32;
            }
            if ("audio/opus".equals(this.f31948b)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new iy(this.f31947a, yb0Var3, yb0Var4, 1, 0);
            }
        }
        return new iy(this.f31947a, yb0Var3, yb0Var4, 0, i4);
    }

    public final boolean a(yb0 yb0Var) {
        int i4;
        Pair<Integer, Integer> b4;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.f31948b.equals(yb0Var.f34991m) && !this.f31948b.equals(av0.a(yb0Var))) {
            return false;
        }
        int i5 = 16;
        if (yb0Var.f34988j != null && (b4 = av0.b(yb0Var)) != null) {
            int intValue = ((Integer) b4.first).intValue();
            int intValue2 = ((Integer) b4.second).intValue();
            int i6 = 8;
            if ("video/dolby-vision".equals(yb0Var.f34991m)) {
                if ("video/avc".equals(this.f31948b)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(this.f31948b)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (this.f31954h || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f31950d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (u82.f32873a <= 23 && "video/x-vnd.on2.vp9".equals(this.f31948b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f31950d;
                    int intValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i6 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i6 = UserVerificationMethods.USER_VERIFY_NONE;
                    } else if (intValue3 >= 60000000) {
                        i6 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    } else if (intValue3 >= 30000000) {
                        i6 = UserVerificationMethods.USER_VERIFY_PATTERN;
                    } else if (intValue3 >= 18000000) {
                        i6 = 64;
                    } else if (intValue3 >= 12000000) {
                        i6 = 32;
                    } else if (intValue3 >= 7200000) {
                        i6 = 16;
                    } else if (intValue3 < 3600000) {
                        i6 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i6;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && codecProfileLevel2.level >= intValue2) {
                        if ("video/hevc".equals(this.f31948b) && 2 == intValue) {
                            tu0 tu0Var = f31946i;
                            String j4 = tu0Var.j();
                            String str = u82.f32874b;
                            if (!j4.equals(str) && !tu0Var.a().equals(str)) {
                            }
                        }
                    }
                }
                a("codec.profileLevel, " + yb0Var.f34988j + ", " + this.f31949c);
                return false;
            }
        }
        if (this.f31954h) {
            int i7 = yb0Var.f34996r;
            if (i7 <= 0 || (i4 = yb0Var.f34997s) <= 0) {
                return true;
            }
            if (u82.f32873a >= 21) {
                return a(i7, i4, yb0Var.f34998t);
            }
            boolean z4 = i7 * i4 <= av0.a();
            if (!z4) {
                a("legacyFrameSize, " + yb0Var.f34996r + "x" + yb0Var.f34997s);
            }
            return z4;
        }
        int i8 = u82.f32873a;
        if (i8 >= 21) {
            int i9 = yb0Var.f34973A;
            if (i9 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f31950d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        a("sampleRate.aCaps");
                    } else if (!audioCapabilities.isSampleRateSupported(i9)) {
                        a(C1877de.a("sampleRate.support, ", i9));
                    }
                }
                return false;
            }
            int i10 = yb0Var.f35004z;
            if (i10 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.f31950d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        a("channelCount.aCaps");
                    } else {
                        String str2 = this.f31947a;
                        String str3 = this.f31948b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i8 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str3) && !"audio/3gpp".equals(str3) && !"audio/amr-wb".equals(str3) && !"audio/mp4a-latm".equals(str3) && !"audio/vorbis".equals(str3) && !"audio/opus".equals(str3) && !"audio/raw".equals(str3) && !"audio/flac".equals(str3) && !"audio/g711-alaw".equals(str3) && !"audio/g711-mlaw".equals(str3) && !"audio/gsm".equals(str3))) {
                            if ("audio/ac3".equals(str3)) {
                                i5 = 6;
                            } else if (!"audio/eac3".equals(str3)) {
                                i5 = 30;
                            }
                            ms0.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str2 + ", [" + maxInputChannelCount + " to " + i5 + b9.i.f15552e);
                            maxInputChannelCount = i5;
                        }
                        if (maxInputChannelCount < i10) {
                            a(C1877de.a("channelCount.support, ", i10));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean a(int i4, int i5, double d4) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f31950d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i6 = u82.f32873a;
        Point point = new Point((((i4 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i5 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i7 = point.x;
        int i8 = point.y;
        if (d4 != -1.0d && d4 >= 1.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i7, i8, Math.floor(d4));
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i7, i8);
        }
        if (!isSizeSupported) {
            if (i4 < i5) {
                String str = this.f31947a;
                tu0 tu0Var = f31946i;
                if (!tu0Var.h().equals(str) || !tu0Var.b().equals(u82.f32874b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i5 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i4 + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i9 = point2.x;
                    int i10 = point2.y;
                    if (d4 != -1.0d && d4 >= 1.0d) {
                        isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d4));
                    } else {
                        isSizeSupported2 = videoCapabilities.isSizeSupported(i9, i10);
                    }
                    if (isSizeSupported2) {
                        ms0.a("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i4 + "x" + i5 + "x" + d4) + "] [" + this.f31947a + ", " + this.f31948b + "] [" + u82.f32877e + b9.i.f15552e);
                    }
                }
            }
            a("sizeAndRate.support, " + i4 + "x" + i5 + "x" + d4);
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r1.c().equals(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1.f().equals(r4) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static su0 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean z8;
        int i4;
        boolean z9 = false;
        if (codecCapabilities != null && (i4 = u82.f32873a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i4 <= 22) {
                tu0 tu0Var = f31946i;
                String d4 = tu0Var.d();
                String str4 = u82.f32876d;
                if (!d4.equals(str4)) {
                }
                if (!tu0Var.e().equals(str)) {
                }
            }
            z8 = false;
            z9 = true;
            if (codecCapabilities != null && u82.f32873a >= 21) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            return new su0(str, str2, str3, codecCapabilities, z4, z9, (!z7 || (codecCapabilities != null && u82.f32873a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) ? true : z8);
        }
        z8 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new su0(str, str2, str3, codecCapabilities, z4, z9, (!z7 || (codecCapabilities != null && u82.f32873a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) ? true : z8);
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (u82.f32873a >= 29 && "video/x-vnd.on2.vp9".equals(this.f31948b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f31950d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(String str) {
        ms0.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f31947a + ", " + this.f31948b + "] [" + u82.f32877e + b9.i.f15552e);
    }
}
