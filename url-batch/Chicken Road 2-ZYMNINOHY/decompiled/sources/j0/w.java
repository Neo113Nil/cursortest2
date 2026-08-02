package j0;

import E1.P;
import T.C0097o;
import W.AbstractC0108a;
import W.AbstractC0110c;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import v2.F;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f13856a = new HashMap();

    public static void a(ArrayList arrayList, String str) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).f13766a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new s(new j()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).f13766a)) {
            return;
        }
        arrayList.add((o) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i4, int i5) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i4;
        codecProfileLevel.level = i5;
        return codecProfileLevel;
    }

    public static String c(C0097o c0097o) {
        Pair c4;
        String str = c0097o.n;
        String str2 = c0097o.n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (c4 = AbstractC0110c.c(c0097o)) != null) {
            int intValue = ((Integer) c4.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
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

    public static synchronized List e(String str, boolean z, boolean z4) {
        synchronized (w.class) {
            try {
                t tVar = new t(str, z, z4);
                HashMap hashMap = f13856a;
                List list = (List) hashMap.get(tVar);
                if (list != null) {
                    return list;
                }
                ArrayList f4 = f(tVar, new P(z, z4, str.equals("video/mv-hevc")));
                if (z) {
                    f4.isEmpty();
                }
                a(f4, str);
                I k4 = I.k(f4);
                hashMap.put(tVar, k4);
                return k4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList f(t tVar, P p2) {
        int i4;
        String d4;
        String str;
        boolean isAlias;
        t tVar2 = tVar;
        int i5 = p2.f518b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = tVar2.f13853a;
            boolean z = tVar2.f13854b;
            if (((MediaCodecInfo[]) p2.f519c) == null) {
                p2.f519c = new MediaCodecList(i5).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) p2.f519c).length;
            int i6 = 0;
            while (i6 < length) {
                if (((MediaCodecInfo[]) p2.f519c) == null) {
                    p2.f519c = new MediaCodecList(i5).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) p2.f519c)[i6];
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 29) {
                    isAlias = mediaCodecInfo.isAlias();
                    if (isAlias) {
                        i4 = i6;
                        i6 = i4 + 1;
                        tVar2 = tVar;
                    }
                }
                int i8 = i6;
                String name = mediaCodecInfo.getName();
                if (!mediaCodecInfo.isEncoder() && (d4 = d(mediaCodecInfo, name, str2)) != null) {
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(d4);
                        boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                        boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                        boolean z4 = tVar2.f13855c;
                        if ((z4 || !isFeatureRequired) && (!z4 || isFeatureSupported)) {
                            boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                            boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                            if ((z || !isFeatureRequired2) && (!z || isFeatureSupported2)) {
                                boolean z5 = true;
                                boolean isHardwareAccelerated = i7 >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !h(mediaCodecInfo, str2);
                                i4 = i8;
                                boolean h2 = h(mediaCodecInfo, str2);
                                boolean z6 = isHardwareAccelerated;
                                if (i7 >= 29) {
                                    z5 = mediaCodecInfo.isVendor();
                                } else {
                                    String D3 = U.i.D(mediaCodecInfo.getName());
                                    if (D3.startsWith("omx.google.") || D3.startsWith("c2.android.") || D3.startsWith("c2.google.")) {
                                        z5 = false;
                                    }
                                }
                                if (z != isFeatureSupported2) {
                                    continue;
                                } else {
                                    str = d4;
                                    try {
                                        arrayList.add(o.i(name, str2, str, capabilitiesForType, z6, h2, z5, false));
                                    } catch (Exception e4) {
                                        e = e4;
                                        AbstractC0108a.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                        throw e;
                                    }
                                }
                                i6 = i4 + 1;
                                tVar2 = tVar;
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        str = d4;
                    }
                }
                i4 = i8;
                i6 = i4 + 1;
                tVar2 = tVar;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new u("Failed to query underlying media codecs", e6);
        }
    }

    public static a0 g(j jVar, C0097o c0097o, boolean z, boolean z4) {
        List b4 = jVar.b(c0097o.n, z, z4);
        String c4 = c(c0097o);
        List b5 = c4 == null ? a0.f15605e : jVar.b(c4, z, z4);
        F j4 = I.j();
        j4.c(b4);
        j4.c(b5);
        return j4.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (T.F.i(str)) {
            return true;
        }
        String D3 = U.i.D(mediaCodecInfo.getName());
        if (D3.startsWith("arc.")) {
            return false;
        }
        if (D3.startsWith("omx.google.") || D3.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((D3.startsWith("omx.sec.") && D3.contains(".sw.")) || D3.equals("omx.qcom.video.decoder.hevcswvdec") || D3.startsWith("c2.android.") || D3.startsWith("c2.google.")) {
            return true;
        }
        return (D3.startsWith("omx.") || D3.startsWith("c2.")) ? false : true;
    }
}
