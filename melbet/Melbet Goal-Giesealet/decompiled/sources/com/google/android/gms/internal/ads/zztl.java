package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zztl {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzst zza() throws zztd {
        List zzb2 = zzb("audio/raw", false, false);
        if (zzb2.isEmpty()) {
            return null;
        }
        return (zzst) zzb2.get(0);
    }

    public static synchronized List zzb(String str, boolean z, boolean z2) throws zztd {
        synchronized (zztl.class) {
            zztc zztcVar = new zztc(str, z, z2);
            HashMap hashMap = zzb;
            List list = (List) hashMap.get(zztcVar);
            if (list != null) {
                return list;
            }
            ArrayList zzh = zzh(zztcVar, new zztg(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                zzh.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && zzh.size() == 1 && ((zzst) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzst.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzj(zzh, zzth.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzst) zzh.get(0)).zza)) {
                zzh.add((zzst) zzh.remove(0));
            }
            zzgjz zzq = zzgjz.zzq(zzh);
            hashMap.put(zztcVar, zzq);
            return zzq;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzc(zztb zztbVar, zzu zzuVar, boolean z, boolean z2) throws zztd {
        List zza2 = zztbVar.zza(zzuVar.zzo, z, z2);
        List zzd = zzd(zztbVar, zzuVar, z, z2);
        int i = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        zzgjwVar.zzh(zza2);
        zzgjwVar.zzh(zzd);
        return zzgjwVar.zzi();
    }

    public static List zzd(zztb zztbVar, zzu zzuVar, boolean z, boolean z2) throws zztd {
        String zzg = zzg(zzuVar);
        return zzg == null ? zzgjz.zzi() : zztbVar.zza(zzg, z, z2);
    }

    public static List zze(List list, final zzu zzuVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zztk() { // from class: com.google.android.gms.internal.ads.zztj
            @Override // com.google.android.gms.internal.ads.zztk
            public final /* synthetic */ int zza(Object obj) {
                int i = zztl.zza;
                return ((zzst) obj).zzd(zzu.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String zzg(zzu zzuVar) {
        Pair zze;
        String str = zzuVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (zze = zzdc.zze(zzuVar)) != null) {
            int intValue = ((Integer) zze.first).intValue();
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
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:(1:37))|38|(1:40)(2:83|(1:85)(1:86))|41|(1:43)(2:75|(1:82)(1:81))|(4:(8:(1:46)|47|48|49|50|51|52|53)|51|52|53)|(2:66|(3:69|70|71))|47|48|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c6, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123 A[Catch: Exception -> 0x01c4, TryCatch #3 {Exception -> 0x01c4, blocks: (B:28:0x00eb, B:32:0x0107, B:38:0x011b, B:40:0x0123, B:41:0x0135, B:43:0x0143, B:75:0x0148, B:77:0x0158, B:79:0x0160, B:83:0x0129), top: B:27:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143 A[Catch: Exception -> 0x01c4, TryCatch #3 {Exception -> 0x01c4, blocks: (B:28:0x00eb, B:32:0x0107, B:38:0x011b, B:40:0x0123, B:41:0x0135, B:43:0x0143, B:75:0x0148, B:77:0x0158, B:79:0x0160, B:83:0x0129), top: B:27:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148 A[Catch: Exception -> 0x01c4, TryCatch #3 {Exception -> 0x01c4, blocks: (B:28:0x00eb, B:32:0x0107, B:38:0x011b, B:40:0x0123, B:41:0x0135, B:43:0x0143, B:75:0x0148, B:77:0x0158, B:79:0x0160, B:83:0x0129), top: B:27:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129 A[Catch: Exception -> 0x01c4, TryCatch #3 {Exception -> 0x01c4, blocks: (B:28:0x00eb, B:32:0x0107, B:38:0x011b, B:40:0x0123, B:41:0x0135, B:43:0x0143, B:75:0x0148, B:77:0x0158, B:79:0x0160, B:83:0x0129), top: B:27:0x00eb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzh(zztc zztcVar, zzte zzteVar) throws zztd {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        String str4;
        String str5;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean z2;
        boolean zzi;
        boolean z3;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z4;
        boolean z5;
        zztc zztcVar2 = zztcVar;
        zzte zzteVar2 = zzteVar;
        String str6 = "secure-playback";
        String str7 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str8 = zztcVar2.zza;
            int zza2 = zzteVar2.zza();
            boolean zzc = zzteVar2.zzc();
            int i3 = 0;
            while (i3 < zza2) {
                MediaCodecInfo zzb2 = zzteVar2.zzb(i3);
                if (Build.VERSION.SDK_INT < 29 || !zzb2.isAlias()) {
                    int i4 = zza2;
                    String name = zzb2.getName();
                    if (!zzb2.isEncoder() && (zzc || !name.endsWith(".secure"))) {
                        String[] supportedTypes = zzb2.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                int i6 = i5;
                                str3 = supportedTypes[i6];
                                if (str3.equalsIgnoreCase(str8)) {
                                    break;
                                }
                                i5 = i6 + 1;
                            } else if (str8.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str3 = "video/hevcdv";
                                } else {
                                    if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str3 = "video/dv_hevc";
                                    }
                                    str3 = null;
                                }
                            } else if (str8.equals("video/mv-hevc")) {
                                if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                    if ("c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    }
                                    str3 = null;
                                }
                                str3 = "video/x-mvhevc";
                            } else if (str8.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str3 = "audio/x-lg-alac";
                            } else if (str8.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str3 = "audio/x-lg-flac";
                            } else {
                                if (str8.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str3 = "audio/lg-ac3";
                                }
                                str3 = null;
                            }
                        }
                        if (str3 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = zzb2.getCapabilitiesForType(str3);
                                boolean zzd = zzteVar2.zzd(str7, str3, capabilitiesForType);
                                boolean zze = zzteVar2.zze(str7, str3, capabilitiesForType);
                                str2 = str7;
                                if (zztcVar2.zzc) {
                                    if (!zzd) {
                                        str = str6;
                                        i = i3;
                                        i2 = i4;
                                    }
                                    boolean zzd2 = zzteVar2.zzd(str6, str3, capabilitiesForType);
                                    boolean zze2 = zzteVar2.zze(str6, str3, capabilitiesForType);
                                    z = zztcVar2.zzb;
                                    if (!z) {
                                    }
                                    if (z) {
                                    }
                                    str = str6;
                                    if (Build.VERSION.SDK_INT < 29) {
                                    }
                                    zzi = zzi(zzb2, str8);
                                    z3 = z2;
                                    codecCapabilities2 = codecCapabilities;
                                    if (Build.VERSION.SDK_INT < 29) {
                                    }
                                    if (zzc) {
                                    }
                                    if (!zzc) {
                                    }
                                    z5 = z4;
                                    i = i3;
                                    i2 = i4;
                                    str4 = str3;
                                    str5 = name;
                                    if (!zzc) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 7);
                                        sb.append(str5);
                                        sb.append(".secure");
                                        arrayList.add(zzst.zza(sb.toString(), str8, str4, codecCapabilities2, z3, zzi, z5, false, true));
                                        return arrayList;
                                    }
                                    continue;
                                } else {
                                    if (!zze) {
                                        boolean zzd22 = zzteVar2.zzd(str6, str3, capabilitiesForType);
                                        boolean zze22 = zzteVar2.zze(str6, str3, capabilitiesForType);
                                        z = zztcVar2.zzb;
                                        if (!z || !zze22) {
                                            if (z) {
                                                if (zzd22) {
                                                    zzd22 = true;
                                                }
                                            }
                                            str = str6;
                                            if (Build.VERSION.SDK_INT < 29) {
                                                z2 = zzb2.isHardwareAccelerated();
                                                codecCapabilities = capabilitiesForType;
                                            } else {
                                                codecCapabilities = capabilitiesForType;
                                                z2 = !zzi(zzb2, str8);
                                            }
                                            zzi = zzi(zzb2, str8);
                                            z3 = z2;
                                            codecCapabilities2 = codecCapabilities;
                                            if (Build.VERSION.SDK_INT < 29) {
                                                z4 = zzb2.isVendor();
                                            } else {
                                                String zza3 = zzggj.zza(zzb2.getName());
                                                z4 = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                            }
                                            try {
                                                if (zzc) {
                                                    if (z != zzd22) {
                                                        zzd22 = true;
                                                    }
                                                    i2 = i4;
                                                    boolean z6 = z4;
                                                    i = i3;
                                                    str4 = str3;
                                                    str5 = name;
                                                    arrayList.add(zzst.zza(name, str8, str4, codecCapabilities2, z3, zzi, z6, false, false));
                                                }
                                                arrayList.add(zzst.zza(name, str8, str4, codecCapabilities2, z3, zzi, z6, false, false));
                                            } catch (Exception e) {
                                                e = e;
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 24 + str4.length() + 1);
                                                sb2.append("Failed to query codec ");
                                                sb2.append(str5);
                                                sb2.append(" (");
                                                sb2.append(str4);
                                                sb2.append(")");
                                                zzds.zze("MediaCodecUtil", sb2.toString());
                                                throw e;
                                            }
                                            if (!zzc || z) {
                                                z5 = z4;
                                                i = i3;
                                                i2 = i4;
                                                str4 = str3;
                                                str5 = name;
                                                if (!zzc && zzd22) {
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 7);
                                                    sb3.append(str5);
                                                    sb3.append(".secure");
                                                    arrayList.add(zzst.zza(sb3.toString(), str8, str4, codecCapabilities2, z3, zzi, z5, false, true));
                                                    return arrayList;
                                                }
                                            }
                                            i2 = i4;
                                            boolean z62 = z4;
                                            i = i3;
                                            str4 = str3;
                                            str5 = name;
                                        }
                                    }
                                    str = str6;
                                    i = i3;
                                    i2 = i4;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str4 = str3;
                            }
                        }
                    }
                    str = str6;
                    str2 = str7;
                    i = i3;
                    i2 = i4;
                } else {
                    str = str6;
                    str2 = str7;
                    i2 = zza2;
                    i = i3;
                }
                i3 = i + 1;
                zztcVar2 = zztcVar;
                zza2 = i2;
                str6 = str;
                str7 = str2;
                zzteVar2 = zzteVar;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new zztd(e3, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzar.zza(str)) {
            return true;
        }
        String zza2 = zzggj.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.") || ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google."))) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zztk zztkVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzti
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i = zztl.zza;
                zztk zztkVar2 = zztk.this;
                return zztkVar2.zza(obj2) - zztkVar2.zza(obj);
            }
        });
    }
}
