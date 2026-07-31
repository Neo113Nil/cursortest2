package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;

@TargetApi(16)
/* loaded from: classes.dex */
public final class xi {

    /* renamed from: a, reason: collision with root package name */
    public final String f14216a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14217b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14218c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14219d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14220e;

    /* renamed from: f, reason: collision with root package name */
    private final MediaCodecInfo.CodecCapabilities f14221f;

    private xi(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7) {
        Objects.requireNonNull(str);
        this.f14216a = str;
        this.f14220e = str2;
        this.f14221f = codecCapabilities;
        boolean z8 = true;
        this.f14217b = !z6 && codecCapabilities != null && zm.f15186a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f14218c = codecCapabilities != null && zm.f15186a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z7 && (codecCapabilities == null || zm.f15186a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z8 = false;
        }
        this.f14219d = z8;
    }

    public static xi a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7) {
        return new xi(str, str2, codecCapabilities, z6, z7);
    }

    public static xi b(String str) {
        return new xi("OMX.google.raw.decoder", null, null, false, false);
    }

    private final void h(String str) {
        String str2 = this.f14216a;
        String str3 = this.f14220e;
        String str4 = zm.f15190e;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 20 + length + length2 + String.valueOf(str4).length());
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

    @TargetApi(21)
    private static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        return (d7 == -1.0d || d7 <= 0.0d) ? videoCapabilities.isSizeSupported(i7, i8) : videoCapabilities.areSizeAndRateSupported(i7, i8, d7);
    }

    @TargetApi(21)
    public final boolean c(int i7) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14221f;
        if (codecCapabilities == null) {
            sb = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                sb = "channelCount.aCaps";
            } else {
                if (audioCapabilities.getMaxInputChannelCount() >= i7) {
                    return true;
                }
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("channelCount.support, ");
                sb2.append(i7);
                sb = sb2.toString();
            }
        }
        h(sb);
        return false;
    }

    @TargetApi(21)
    public final boolean d(int i7) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14221f;
        if (codecCapabilities == null) {
            sb = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                sb = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i7)) {
                    return true;
                }
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("sampleRate.support, ");
                sb2.append(i7);
                sb = sb2.toString();
            }
        }
        h(sb);
        return false;
    }

    public final boolean e(String str) {
        StringBuilder sb;
        String str2;
        if (str == null || this.f14220e == null) {
            return true;
        }
        String trim = str.trim();
        String str3 = (trim.startsWith("avc1") || trim.startsWith("avc3")) ? "video/avc" : (trim.startsWith("hev1") || trim.startsWith("hvc1")) ? "video/hevc" : trim.startsWith("vp9") ? "video/x-vnd.on2.vp9" : trim.startsWith("vp8") ? "video/x-vnd.on2.vp8" : trim.startsWith("mp4a") ? "audio/mp4a-latm" : (trim.startsWith("ac-3") || trim.startsWith("dac3")) ? "audio/ac3" : (trim.startsWith("ec-3") || trim.startsWith("dec3")) ? "audio/eac3" : (trim.startsWith("dtsc") || trim.startsWith("dtse")) ? "audio/vnd.dts" : (trim.startsWith("dtsh") || trim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : trim.startsWith("opus") ? "audio/opus" : trim.startsWith("vorbis") ? "audio/vorbis" : null;
        if (str3 == null) {
            return true;
        }
        if (this.f14220e.equals(str3)) {
            Pair<Integer, Integer> b7 = jj.b(str);
            if (b7 == null) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == ((Integer) b7.first).intValue() && codecProfileLevel.level >= ((Integer) b7.second).intValue()) {
                    return true;
                }
            }
            sb = new StringBuilder(str.length() + 22 + str3.length());
            str2 = "codec.profileLevel, ";
        } else {
            sb = new StringBuilder(str.length() + 13 + str3.length());
            str2 = "codec.mime ";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        h(sb.toString());
        return false;
    }

    @TargetApi(21)
    public final boolean f(int i7, int i8, double d7) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14221f;
        if (codecCapabilities == null) {
            sb = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                sb = "sizeAndRate.vCaps";
            } else {
                if (i(videoCapabilities, i7, i8, d7)) {
                    return true;
                }
                if (i7 < i8 && i(videoCapabilities, i8, i7, d7)) {
                    StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("sizeAndRate.rotated, ");
                    sb2.append(i7);
                    sb2.append("x");
                    sb2.append(i8);
                    sb2.append("x");
                    sb2.append(d7);
                    String sb3 = sb2.toString();
                    String str = this.f14216a;
                    String str2 = this.f14220e;
                    String str3 = zm.f15190e;
                    int length = String.valueOf(str).length();
                    int length2 = String.valueOf(str2).length();
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 25 + length + length2 + String.valueOf(str3).length());
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
        h(sb);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14221f;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
