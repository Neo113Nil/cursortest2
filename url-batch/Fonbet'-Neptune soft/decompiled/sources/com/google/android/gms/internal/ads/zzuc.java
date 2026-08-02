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

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzuc {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzti zza() throws zztw {
        List zzd = zzd("audio/raw", false, false);
        if (zzd.isEmpty()) {
            return null;
        }
        return (zzti) zzd.get(0);
    }

    public static String zzb(zzz zzzVar) {
        Pair zza2;
        String str = zzzVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (zza2 = zzdk.zza(zzzVar)) != null) {
            int intValue = ((Integer) zza2.first).intValue();
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

    public static List zzc(zztr zztrVar, zzz zzzVar, boolean z, boolean z2) throws zztw {
        String zzb2 = zzb(zzzVar);
        return zzb2 == null ? zzfyq.zzn() : zztrVar.zza(zzb2, z, z2);
    }

    public static synchronized List zzd(String str, boolean z, boolean z2) throws zztw {
        synchronized (zzuc.class) {
            zztv zztvVar = new zztv(str, z, z2);
            HashMap hashMap = zzb;
            List list = (List) hashMap.get(zztvVar);
            if (list != null) {
                return list;
            }
            ArrayList zzg = zzg(zztvVar, new zztz(z, z2, str.equals("video/mv-hevc")));
            if (z && zzg.isEmpty() && Build.VERSION.SDK_INT <= 23) {
                zzg = zzg(zztvVar, new zzty(null));
                if (!zzg.isEmpty()) {
                    zzea.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzti) zzg.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && zzg.size() == 1 && ((zzti) zzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzg.add(zzti.zzd("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzh(zzg, new zzua() { // from class: com.google.android.gms.internal.ads.zztt
                    @Override // com.google.android.gms.internal.ads.zzua
                    public final int zza(Object obj) {
                        int i = zzuc.zza;
                        String str2 = ((zzti) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (Build.VERSION.SDK_INT >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (Build.VERSION.SDK_INT < 32 && zzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzti) zzg.get(0)).zza)) {
                zzg.add((zzti) zzg.remove(0));
            }
            zzfyq zzl = zzfyq.zzl(zzg);
            hashMap.put(zztvVar, zzl);
            return zzl;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zze(zztr zztrVar, zzz zzzVar, boolean z, boolean z2) throws zztw {
        List zza2 = zztrVar.zza(zzzVar.zzo, z, z2);
        List zzc = zzc(zztrVar, zzzVar, z, z2);
        int i = zzfyq.zzd;
        zzfyn zzfynVar = new zzfyn();
        zzfynVar.zzh(zza2);
        zzfynVar.zzh(zzc);
        return zzfynVar.zzi();
    }

    public static List zzf(List list, final zzz zzzVar) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zzua() { // from class: com.google.android.gms.internal.ads.zztu
            @Override // com.google.android.gms.internal.ads.zzua
            public final int zza(Object obj) {
                int i = zzuc.zza;
                return ((zzti) obj).zze(zzz.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bb A[Catch: Exception -> 0x0231, TryCatch #3 {Exception -> 0x0231, blocks: (B:58:0x0163, B:62:0x017e, B:68:0x0191, B:70:0x0197, B:71:0x01a8, B:73:0x01b6, B:113:0x01bb, B:115:0x01cb, B:117:0x01d3, B:121:0x019d), top: B:57:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019d A[Catch: Exception -> 0x0231, TryCatch #3 {Exception -> 0x0231, blocks: (B:58:0x0163, B:62:0x017e, B:68:0x0191, B:70:0x0197, B:71:0x01a8, B:73:0x01b6, B:113:0x01bb, B:115:0x01cb, B:117:0x01d3, B:121:0x019d), top: B:57:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197 A[Catch: Exception -> 0x0231, TryCatch #3 {Exception -> 0x0231, blocks: (B:58:0x0163, B:62:0x017e, B:68:0x0191, B:70:0x0197, B:71:0x01a8, B:73:0x01b6, B:113:0x01bb, B:115:0x01cb, B:117:0x01d3, B:121:0x019d), top: B:57:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b6 A[Catch: Exception -> 0x0231, TryCatch #3 {Exception -> 0x0231, blocks: (B:58:0x0163, B:62:0x017e, B:68:0x0191, B:70:0x0197, B:71:0x01a8, B:73:0x01b6, B:113:0x01bb, B:115:0x01cb, B:117:0x01d3, B:121:0x019d), top: B:57:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzg(zztv zztvVar, zztx zztxVar) throws zztw {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zzd;
        boolean zzc;
        boolean z;
        String str4;
        boolean z2;
        boolean zzi;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean isAlias;
        zztv zztvVar2 = zztvVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zztvVar2.zza;
            boolean zze = zztxVar.zze();
            int i4 = 0;
            for (int zza2 = zztxVar.zza(); i4 < zza2; zza2 = i2) {
                MediaCodecInfo zzb2 = zztxVar.zzb(i4);
                if (Build.VERSION.SDK_INT >= 29) {
                    isAlias = zzb2.isAlias();
                    if (isAlias) {
                        i2 = zza2;
                        i = i4;
                        i4 = i + 1;
                        zztvVar2 = zztvVar;
                    }
                }
                int i5 = zza2;
                String name = zzb2.getName();
                if (!zzb2.isEncoder() && ((zze || !name.endsWith(".secure")) && ((Build.VERSION.SDK_INT >= 24 || ((!"OMX.SEC.aac.dec".equals(name) && !"OMX.Exynos.AAC.Decoder".equals(name)) || !"samsung".equals(Build.MANUFACTURER) || (!Build.DEVICE.startsWith("zeroflte") && !Build.DEVICE.startsWith("zerolte") && !Build.DEVICE.startsWith("zenlte") && !"SC-05G".equals(Build.DEVICE) && !"marinelteatt".equals(Build.DEVICE) && !"404SC".equals(Build.DEVICE) && !"SC-04G".equals(Build.DEVICE) && !"SCV31".equals(Build.DEVICE)))) && (Build.VERSION.SDK_INT > 23 || !"audio/eac3-joc".equals(str5) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))))) {
                    String[] supportedTypes = zzb2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            str = supportedTypes[i6];
                            if (str.equalsIgnoreCase(str5)) {
                                break;
                            }
                            i6++;
                        } else {
                            if (str5.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = "video/dv_hevc";
                                    }
                                    str = null;
                                }
                            } else if (str5.equals("video/mv-hevc")) {
                                if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                    if ("c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    }
                                    str = null;
                                }
                                str = "video/x-mvhevc";
                            } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str = null;
                            }
                            i4 = i + 1;
                            zztvVar2 = zztvVar;
                        }
                    }
                    if (str != null) {
                        try {
                            capabilitiesForType = zzb2.getCapabilitiesForType(str);
                            zzd = zztxVar.zzd("tunneled-playback", str, capabilitiesForType);
                            zzc = zztxVar.zzc("tunneled-playback", str, capabilitiesForType);
                        } catch (Exception e) {
                            e = e;
                            int i7 = i4;
                            str2 = str;
                            i = i7;
                            str3 = name;
                            i2 = i5;
                            i3 = 23;
                        }
                        if (zztvVar2.zzc) {
                            if (!zzd) {
                                i = i4;
                                i2 = i5;
                                i4 = i + 1;
                                zztvVar2 = zztvVar;
                            }
                            boolean zzd2 = zztxVar.zzd("secure-playback", str, capabilitiesForType);
                            boolean zzc2 = zztxVar.zzc("secure-playback", str, capabilitiesForType);
                            z = zztvVar2.zzb;
                            if (!z) {
                            }
                            if (z) {
                            }
                            if (Build.VERSION.SDK_INT < 29) {
                            }
                            zzi = zzi(zzb2, str5);
                            z3 = z2;
                            if (Build.VERSION.SDK_INT < 29) {
                            }
                            if (zze) {
                            }
                            if (!zze) {
                            }
                            int i8 = i4;
                            str2 = str;
                            i = i8;
                            i2 = i5;
                            i3 = 23;
                            z6 = z4;
                            if (!zze) {
                                str3 = name;
                                arrayList.add(zzti.zzd(name + str4, str5, str2, capabilitiesForType, z3, zzi, z6, false, true));
                                break;
                                break;
                            }
                            continue;
                            i4 = i + 1;
                            zztvVar2 = zztvVar;
                        } else {
                            if (!zzc) {
                                boolean zzd22 = zztxVar.zzd("secure-playback", str, capabilitiesForType);
                                boolean zzc22 = zztxVar.zzc("secure-playback", str, capabilitiesForType);
                                z = zztvVar2.zzb;
                                if (!z || !zzc22) {
                                    if (z) {
                                        if (zzd22) {
                                            zzd22 = true;
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT < 29) {
                                        z2 = zzb2.isHardwareAccelerated();
                                        str4 = ".secure";
                                    } else {
                                        str4 = ".secure";
                                        z2 = !zzi(zzb2, str5);
                                    }
                                    zzi = zzi(zzb2, str5);
                                    z3 = z2;
                                    if (Build.VERSION.SDK_INT < 29) {
                                        z4 = zzb2.isVendor();
                                    } else {
                                        String zza3 = zzfuv.zza(zzb2.getName());
                                        z4 = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                    }
                                    if (zze) {
                                        z5 = zzd22;
                                    } else {
                                        if (z != zzd22) {
                                            z5 = true;
                                        }
                                        int i9 = i4;
                                        String str6 = str;
                                        i = i9;
                                        i2 = i5;
                                        arrayList.add(zzti.zzd(name, str5, str6, capabilitiesForType, z3, zzi, z4, false, false));
                                        i4 = i + 1;
                                        zztvVar2 = zztvVar;
                                    }
                                    if (!zze || z) {
                                        int i82 = i4;
                                        str2 = str;
                                        i = i82;
                                        i2 = i5;
                                        i3 = 23;
                                        z6 = z4;
                                        if (!zze && z5) {
                                            try {
                                                str3 = name;
                                                try {
                                                    arrayList.add(zzti.zzd(name + str4, str5, str2, capabilitiesForType, z3, zzi, z6, false, true));
                                                    break;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    if (Build.VERSION.SDK_INT > i3 || arrayList.isEmpty()) {
                                                        zzea.zzc("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                        throw e;
                                                    }
                                                    zzea.zzc("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                                    i4 = i + 1;
                                                    zztvVar2 = zztvVar;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                str3 = name;
                                            }
                                        }
                                        i4 = i + 1;
                                        zztvVar2 = zztvVar;
                                    }
                                    int i92 = i4;
                                    String str62 = str;
                                    i = i92;
                                    i2 = i5;
                                    arrayList.add(zzti.zzd(name, str5, str62, capabilitiesForType, z3, zzi, z4, false, false));
                                    i4 = i + 1;
                                    zztvVar2 = zztvVar;
                                }
                            }
                            i = i4;
                            i2 = i5;
                            i4 = i + 1;
                            zztvVar2 = zztvVar;
                        }
                    }
                }
                i = i4;
                i2 = i5;
                i4 = i + 1;
                zztvVar2 = zztvVar;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new zztw(e4, null);
        }
    }

    private static void zzh(List list, final zzua zzuaVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzts
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zzuc.zza;
                zzua zzuaVar2 = zzua.this;
                return zzuaVar2.zza(obj2) - zzuaVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (zzay.zzh(str)) {
            return true;
        }
        String zza2 = zzfuv.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.") || ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google."))) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}
