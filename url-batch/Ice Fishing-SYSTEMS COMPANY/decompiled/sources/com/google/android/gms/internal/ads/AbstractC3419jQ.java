package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3419jQ {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f32115a = new HashMap();

    public static synchronized List a(String str, boolean z8, boolean z9) {
        synchronized (AbstractC3419jQ.class) {
            try {
                C3204fQ c3204fQ = new C3204fQ(str, z8, z9);
                HashMap hashMap = f32115a;
                List list = (List) hashMap.get(c3204fQ);
                if (list != null) {
                    return list;
                }
                ArrayList e6 = e(c3204fQ, new G1.a(z8, z9, str.equals("video/mv-hevc")));
                if (z8) {
                    e6.isEmpty();
                }
                if (com.anythink.basead.exoplayer.k.o.f8622w.equals(str)) {
                    if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && e6.size() == 1 && ((C2986bQ) e6.get(0)).f29490a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        e6.add(C2986bQ.a("OMX.google.raw.decoder", com.anythink.basead.exoplayer.k.o.f8622w, com.anythink.basead.exoplayer.k.o.f8622w, null, false, false));
                    }
                    Collections.sort(e6, new C3313hQ(C3796qP.f33721A));
                }
                if (Build.VERSION.SDK_INT < 32 && e6.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C2986bQ) e6.get(0)).f29490a)) {
                    e6.add((C2986bQ) e6.remove(0));
                }
                UB n9 = UB.n(e6);
                hashMap.put(c3204fQ, n9);
                return n9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3675oC b(C3796qP c3796qP, TP tp, boolean z8, boolean z9) {
        Iterable a9;
        String str = tp.f27776o;
        c3796qP.getClass();
        List a10 = a(str, z8, z9);
        String d2 = d(tp);
        if (d2 == null) {
            a9 = C3675oC.f33115x;
        } else {
            c3796qP.getClass();
            a9 = a(d2, z8, z9);
        }
        SB sb = UB.f27942u;
        RB rb = new RB(4);
        rb.b(a10);
        rb.b(a9);
        return rb.f();
    }

    public static MediaCodecInfo.CodecProfileLevel c(int i, int i4) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i4;
        return codecProfileLevel;
    }

    public static String d(TP tp) {
        C3810qm c4;
        boolean z8;
        String str = tp.f27776o;
        if (com.anythink.basead.exoplayer.k.o.f8578B.equals(str)) {
            return com.anythink.basead.exoplayer.k.o.f8577A;
        }
        if (com.anythink.basead.exoplayer.k.o.f8581E.equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return com.anythink.basead.exoplayer.k.o.f8580D;
        }
        if ("video/dolby-vision".equals(str) && (c4 = AbstractC4295zm.c(tp)) != null && (z8 = c4.f33873b)) {
            PA.T(z8);
            int i = c4.f33872a;
            if (i == 16 || i == 256) {
                return com.anythink.basead.exoplayer.k.o.i;
            }
            if (i == 512) {
                return com.anythink.basead.exoplayer.k.o.f8608h;
            }
            if (i == 1024) {
                C2980bK c2980bK = tp.f27752E;
                if (c2980bK != null && c2980bK.f29472c == 6 && c2980bK.f29471b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return com.anythink.basead.exoplayer.k.o.i;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:34:0x010f, B:38:0x011e, B:44:0x0137, B:46:0x013f, B:47:0x0153, B:49:0x015c, B:63:0x0160, B:65:0x0170, B:67:0x0178, B:68:0x0148), top: B:33:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:34:0x010f, B:38:0x011e, B:44:0x0137, B:46:0x013f, B:47:0x0153, B:49:0x015c, B:63:0x0160, B:65:0x0170, B:67:0x0178, B:68:0x0148), top: B:33:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160 A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:34:0x010f, B:38:0x011e, B:44:0x0137, B:46:0x013f, B:47:0x0153, B:49:0x015c, B:63:0x0160, B:65:0x0170, B:67:0x0178, B:68:0x0148), top: B:33:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148 A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:34:0x010f, B:38:0x011e, B:44:0x0137, B:46:0x013f, B:47:0x0153, B:49:0x015c, B:63:0x0160, B:65:0x0170, B:67:0x0178, B:68:0x0148), top: B:33:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(C3204fQ c3204fQ, G1.a aVar) {
        String str;
        int i;
        String str2;
        String str3;
        boolean z8;
        boolean z9;
        int i4;
        boolean isAlias;
        C3204fQ c3204fQ2 = c3204fQ;
        G1.a aVar2 = aVar;
        String str4 = "secure-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = c3204fQ2.f30702a;
            MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) aVar2.f1195v;
            int i9 = aVar2.f1194u;
            if (mediaCodecInfoArr == null) {
                aVar2.f1195v = new MediaCodecList(i9).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) aVar2.f1195v).length;
            int i10 = 0;
            while (i10 < length) {
                if (((MediaCodecInfo[]) aVar2.f1195v) == null) {
                    aVar2.f1195v = new MediaCodecList(i9).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) aVar2.f1195v)[i10];
                if (Build.VERSION.SDK_INT >= 29) {
                    isAlias = mediaCodecInfo.isAlias();
                    if (isAlias) {
                        str = str4;
                        i = i10;
                        i10 = i + 1;
                        c3204fQ2 = c3204fQ;
                        aVar2 = aVar;
                        str4 = str;
                    }
                }
                int i11 = i10;
                String name = mediaCodecInfo.getName();
                if (!mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    int length2 = supportedTypes.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            int i13 = i12;
                            str2 = supportedTypes[i13];
                            if (str2.equalsIgnoreCase(str5)) {
                                break;
                            }
                            i12 = i13 + 1;
                        } else {
                            if (str5.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str2 = "video/hevcdv";
                                } else {
                                    if (!"OMX.RTK.video.decoder".equals(name)) {
                                        if ("OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        }
                                        str2 = null;
                                    }
                                    str2 = "video/dv_hevc";
                                }
                            } else if (str5.equals("video/mv-hevc")) {
                                if ("c2.qti.mvhevc.decoder".equals(name) || "c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    str2 = "video/x-mvhevc";
                                }
                                str2 = null;
                            } else if (str5.equals(com.anythink.basead.exoplayer.k.o.f8587L) && "OMX.lge.alac.decoder".equals(name)) {
                                str2 = "audio/x-lg-alac";
                            } else if (str5.equals(com.anythink.basead.exoplayer.k.o.f8586K) && "OMX.lge.flac.decoder".equals(name)) {
                                str2 = "audio/x-lg-flac";
                            } else {
                                if (str5.equals(com.anythink.basead.exoplayer.k.o.f8625z) && "OMX.lge.ac3.decoder".equals(name)) {
                                    str2 = "audio/lg-ac3";
                                }
                                str2 = null;
                            }
                            i10 = i + 1;
                            c3204fQ2 = c3204fQ;
                            aVar2 = aVar;
                            str4 = str;
                        }
                    }
                    if (str2 != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str2);
                            boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            String str6 = str2;
                            try {
                                if (c3204fQ2.f30704c) {
                                    if (!isFeatureSupported) {
                                        str = str4;
                                        i = i11;
                                    }
                                    boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported(str4);
                                    boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired(str4);
                                    z8 = c3204fQ2.f30703b;
                                    if (!z8) {
                                    }
                                    if (z8) {
                                    }
                                    i4 = Build.VERSION.SDK_INT;
                                    str = str4;
                                    if (i4 < 29) {
                                    }
                                    f(mediaCodecInfo, str5);
                                    boolean z10 = r2;
                                    if (i4 < 29) {
                                    }
                                    if (z8 == z9) {
                                    }
                                    i = i11;
                                } else {
                                    if (!isFeatureRequired) {
                                        boolean isFeatureSupported22 = capabilitiesForType.isFeatureSupported(str4);
                                        boolean isFeatureRequired22 = capabilitiesForType.isFeatureRequired(str4);
                                        z8 = c3204fQ2.f30703b;
                                        if (!z8 || !isFeatureRequired22) {
                                            if (z8) {
                                                z9 = isFeatureSupported22;
                                            } else if (isFeatureSupported22) {
                                                z9 = true;
                                            }
                                            i4 = Build.VERSION.SDK_INT;
                                            str = str4;
                                            boolean isHardwareAccelerated = i4 < 29 ? mediaCodecInfo.isHardwareAccelerated() : !f(mediaCodecInfo, str5);
                                            f(mediaCodecInfo, str5);
                                            boolean z102 = isHardwareAccelerated;
                                            if (i4 < 29) {
                                                mediaCodecInfo.isVendor();
                                            } else {
                                                String f6 = AbstractC3035cL.f(mediaCodecInfo.getName());
                                                if (!f6.startsWith("omx.google.") && !f6.startsWith("c2.android.")) {
                                                    f6.startsWith("c2.google.");
                                                }
                                            }
                                            if (z8 == z9) {
                                                i = i11;
                                                str3 = str6;
                                                try {
                                                    arrayList.add(C2986bQ.a(name, str5, str3, capabilitiesForType, z102, false));
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 24 + str3.length() + 1);
                                                    sb.append("Failed to query codec ");
                                                    sb.append(name);
                                                    sb.append(" (");
                                                    sb.append(str3);
                                                    sb.append(")");
                                                    AbstractC3217fl.T("MediaCodecUtil", sb.toString());
                                                    throw e;
                                                }
                                            }
                                            i = i11;
                                        }
                                    }
                                    str = str4;
                                    i = i11;
                                }
                                i10 = i + 1;
                                c3204fQ2 = c3204fQ;
                                aVar2 = aVar;
                                str4 = str;
                            } catch (Exception e9) {
                                e = e9;
                                str3 = str6;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            str3 = str2;
                        }
                    }
                }
                str = str4;
                i = i11;
                i10 = i + 1;
                c3204fQ2 = c3204fQ;
                aVar2 = aVar;
                str4 = str;
            }
            return arrayList;
        } catch (Exception e11) {
            throw new C3259gQ("Failed to query underlying media codecs", e11);
        }
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (K4.a(str)) {
            return true;
        }
        String f6 = AbstractC3035cL.f(mediaCodecInfo.getName());
        if (f6.startsWith("arc.")) {
            return false;
        }
        if (f6.startsWith("omx.google.") || f6.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((f6.startsWith("omx.sec.") && f6.contains(".sw.")) || f6.equals("omx.qcom.video.decoder.hevcswvdec") || f6.startsWith("c2.android.") || f6.startsWith("c2.google.")) {
            return true;
        }
        return (f6.startsWith("omx.") || f6.startsWith("c2.")) ? false : true;
    }
}
