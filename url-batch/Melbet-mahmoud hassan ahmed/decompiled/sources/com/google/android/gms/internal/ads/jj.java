package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes.dex */
public final class jj {

    /* renamed from: d, reason: collision with root package name */
    private static final SparseIntArray f7142d;

    /* renamed from: e, reason: collision with root package name */
    private static final SparseIntArray f7143e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, Integer> f7144f;

    /* renamed from: a, reason: collision with root package name */
    private static final xi f7139a = xi.b("OMX.google.raw.decoder");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f7140b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<cj, List<xi>> f7141c = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static int f7145g = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7142d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f7143e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f7144f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    public static int a() {
        if (f7145g == -1) {
            int i7 = 0;
            xi c7 = c("video/avc", false);
            if (c7 != null) {
                MediaCodecInfo.CodecProfileLevel[] g7 = c7.g();
                int length = g7.length;
                int i8 = 0;
                while (i7 < length) {
                    int i9 = g7[i7].level;
                    int i10 = 9437184;
                    if (i9 != 1 && i9 != 2) {
                        switch (i9) {
                            case c4.w0.f2150p /* 8 */:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    i8 = Math.max(i10, i8);
                    i7++;
                }
                i7 = Math.max(i8, zm.f15186a >= 21 ? 345600 : 172800);
            }
            f7145g = i7;
        }
        return f7145g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair<Integer, Integer> b(String str) {
        char c7;
        String valueOf;
        String str2;
        String str3;
        String str4;
        Integer valueOf2;
        int parseInt;
        String[] split = str.split("\\.");
        String str5 = split[0];
        int i7 = 2;
        switch (str5.hashCode()) {
            case 3006243:
                if (str5.equals("avc1")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 3006244:
                if (str5.equals("avc2")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 3199032:
                if (str5.equals("hev1")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 3214780:
                if (str5.equals("hvc1")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        if (c7 == 0 || c7 == 1) {
            if (split.length < 4) {
                if (str.length() == 0) {
                    str3 = new String("Ignoring malformed HEVC codec string: ");
                    Log.w("MediaCodecUtil", str3);
                    return null;
                }
                str3 = "Ignoring malformed HEVC codec string: ".concat(str);
                Log.w("MediaCodecUtil", str3);
                return null;
            }
            Matcher matcher = f7140b.matcher(split[1]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                if ("1".equals(group)) {
                    i7 = 1;
                } else if (!"2".equals(group)) {
                    valueOf = String.valueOf(group);
                    str2 = "Unknown HEVC profile string: ";
                    if (valueOf.length() == 0) {
                        str3 = new String("Unknown HEVC profile string: ");
                    }
                    str3 = str2.concat(valueOf);
                }
                Integer num = f7144f.get(split[3]);
                if (num != null) {
                    return new Pair<>(Integer.valueOf(i7), num);
                }
                valueOf = String.valueOf(matcher.group(1));
                str2 = "Unknown HEVC level string: ";
                if (valueOf.length() == 0) {
                    str3 = new String("Unknown HEVC level string: ");
                }
                str3 = str2.concat(valueOf);
            } else {
                if (str.length() == 0) {
                    str3 = new String("Ignoring malformed HEVC codec string: ");
                }
                str3 = "Ignoring malformed HEVC codec string: ".concat(str);
            }
            Log.w("MediaCodecUtil", str3);
            return null;
        }
        if (c7 != 2 && c7 != 3) {
            return null;
        }
        int length = split.length;
        if (length < 2) {
            if (str.length() == 0) {
                str4 = new String("Ignoring malformed AVC codec string: ");
                Log.w("MediaCodecUtil", str4);
                return null;
            }
            str4 = "Ignoring malformed AVC codec string: ".concat(str);
            Log.w("MediaCodecUtil", str4);
            return null;
        }
        try {
            if (split[1].length() == 6) {
                valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                parseInt = Integer.parseInt(split[1].substring(4), 16);
            } else {
                if (length < 3) {
                    Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                valueOf2 = Integer.valueOf(Integer.parseInt(split[1]));
                parseInt = Integer.parseInt(split[2]);
            }
            return new Pair<>(Integer.valueOf(f7142d.get(valueOf2.intValue())), Integer.valueOf(f7143e.get(Integer.valueOf(parseInt).intValue())));
        } catch (NumberFormatException unused) {
            if (str.length() == 0) {
                str4 = new String("Ignoring malformed AVC codec string: ");
            }
        }
    }

    public static xi c(String str, boolean z6) {
        List<xi> d7 = d(str, z6);
        if (d7.isEmpty()) {
            return null;
        }
        return d7.get(0);
    }

    public static synchronized List<xi> d(String str, boolean z6) {
        synchronized (jj.class) {
            cj cjVar = new cj(str, z6);
            HashMap<cj, List<xi>> hashMap = f7141c;
            List<xi> list = hashMap.get(cjVar);
            if (list != null) {
                return list;
            }
            int i7 = zm.f15186a;
            List<xi> e7 = e(cjVar, i7 >= 21 ? new ij(z6) : new hj(null));
            if (z6 && e7.isEmpty() && i7 >= 21 && i7 <= 23) {
                e7 = e(cjVar, new hj(null));
                if (!e7.isEmpty()) {
                    String str2 = e7.get(0).f14216a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<xi> unmodifiableList = Collections.unmodifiableList(e7);
            hashMap.put(cjVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01be A[Catch: Exception -> 0x01b9, TryCatch #2 {Exception -> 0x01b9, blocks: (B:175:0x0195, B:177:0x019f, B:179:0x01a7, B:181:0x01af, B:140:0x01be, B:163:0x01c7), top: B:174:0x0195 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<xi> e(cj cjVar, fj fjVar) {
        int i7;
        int i8;
        MediaCodecInfo mediaCodecInfo;
        boolean z6;
        fj fjVar2 = fjVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str = cjVar.f3849a;
            int zza = fjVar.zza();
            boolean g7 = fjVar.g();
            int i9 = 0;
            while (i9 < zza) {
                MediaCodecInfo F = fjVar2.F(i9);
                String name = F.getName();
                if (!F.isEncoder() && ((g7 || !name.endsWith(".secure")) && (((i7 = zm.f15186a) >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((i7 >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && (i7 >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(name) || !"a70".equals(zm.f15187b)))))) {
                    if (i7 == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
                        String str2 = zm.f15187b;
                        if ("dlxu".equals(str2)) {
                            continue;
                        } else if ("protou".equals(str2)) {
                            continue;
                        } else if ("ville".equals(str2)) {
                            continue;
                        } else if ("villeplus".equals(str2)) {
                            continue;
                        } else if ("villec2".equals(str2)) {
                            continue;
                        } else if (str2.startsWith("gee")) {
                            continue;
                        } else if ("C6602".equals(str2)) {
                            continue;
                        } else if ("C6603".equals(str2)) {
                            continue;
                        } else if ("C6606".equals(str2)) {
                            continue;
                        } else if ("C6616".equals(str2)) {
                            continue;
                        } else if ("L36h".equals(str2)) {
                            continue;
                        } else if ("SO-02E".equals(str2)) {
                            continue;
                        }
                    }
                    if (i7 == 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
                        String str3 = zm.f15187b;
                        if ("C1504".equals(str3)) {
                            continue;
                        } else if ("C1505".equals(str3)) {
                            continue;
                        } else if ("C1604".equals(str3)) {
                            continue;
                        } else if ("C1605".equals(str3)) {
                            continue;
                        }
                    }
                    if (i7 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(zm.f15188c)) {
                        String str4 = zm.f15187b;
                        if (str4.startsWith("d2")) {
                            continue;
                        } else if (str4.startsWith("serrano")) {
                            continue;
                        } else if (str4.startsWith("jflte")) {
                            continue;
                        } else if (str4.startsWith("santos")) {
                            continue;
                        } else if (str4.startsWith("t0")) {
                            continue;
                        }
                    }
                    if (i7 > 19 || !zm.f15187b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) {
                        String[] supportedTypes = F.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i10 = 0;
                        while (i10 < length) {
                            String str5 = supportedTypes[i10];
                            if (str5.equalsIgnoreCase(str)) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = F.getCapabilitiesForType(str5);
                                    boolean G = fjVar2.G(str, capabilitiesForType);
                                    i8 = zza;
                                    mediaCodecInfo = F;
                                    if (zm.f15186a <= 22) {
                                        try {
                                            String str6 = zm.f15189d;
                                            if ((str6.equals("ODROID-XU3") || str6.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                                z6 = true;
                                                try {
                                                    if (g7) {
                                                        if (cjVar.f3850b == G) {
                                                        }
                                                        arrayList.add(xi.a(name, str, capabilitiesForType, z6, false));
                                                    }
                                                    arrayList.add(xi.a(name, str, capabilitiesForType, z6, false));
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    if (zm.f15186a <= 23) {
                                                    }
                                                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + str5.length());
                                                    sb.append("Failed to query codec ");
                                                    sb.append(name);
                                                    sb.append(" (");
                                                    sb.append(str5);
                                                    sb.append(")");
                                                    Log.e("MediaCodecUtil", sb.toString());
                                                    throw e;
                                                }
                                                if (!g7 || cjVar.f3850b) {
                                                    if (!g7 && G) {
                                                        arrayList.add(xi.a(String.valueOf(name).concat(".secure"), str, capabilitiesForType, z6, true));
                                                        return arrayList;
                                                    }
                                                }
                                            }
                                        } catch (Exception e8) {
                                            e = e8;
                                            if (zm.f15186a <= 23 || arrayList.isEmpty()) {
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 25 + str5.length());
                                                sb2.append("Failed to query codec ");
                                                sb2.append(name);
                                                sb2.append(" (");
                                                sb2.append(str5);
                                                sb2.append(")");
                                                Log.e("MediaCodecUtil", sb2.toString());
                                                throw e;
                                            }
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 46);
                                            sb3.append("Skipping codec ");
                                            sb3.append(name);
                                            sb3.append(" (failed to query capabilities)");
                                            Log.e("MediaCodecUtil", sb3.toString());
                                            i10++;
                                            fjVar2 = fjVar;
                                            zza = i8;
                                            F = mediaCodecInfo;
                                        }
                                    }
                                    z6 = false;
                                    if (g7) {
                                    }
                                    if (!g7) {
                                    }
                                    if (!g7) {
                                        arrayList.add(xi.a(String.valueOf(name).concat(".secure"), str, capabilitiesForType, z6, true));
                                        return arrayList;
                                    }
                                    continue;
                                } catch (Exception e9) {
                                    e = e9;
                                    i8 = zza;
                                    mediaCodecInfo = F;
                                }
                            } else {
                                i8 = zza;
                                mediaCodecInfo = F;
                            }
                            i10++;
                            fjVar2 = fjVar;
                            zza = i8;
                            F = mediaCodecInfo;
                        }
                    }
                }
                i9++;
                fjVar2 = fjVar;
                zza = zza;
            }
            return arrayList;
        } catch (Exception e10) {
            throw new ej(e10, null);
        }
    }
}
