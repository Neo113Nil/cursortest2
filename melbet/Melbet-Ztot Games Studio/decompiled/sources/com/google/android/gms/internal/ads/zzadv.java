package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzadv {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzbk zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = zzet.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzea.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafj.zzb(new zzek(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzea.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzaha(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbk(arrayList);
    }

    public static zzads zzc(zzek zzekVar, boolean z, boolean z2) throws zzbo {
        if (z) {
            zzd(3, zzekVar, false);
        }
        String zzA = zzekVar.zzA((int) zzekVar.zzs(), zzfuj.zzc);
        int length = zzA.length();
        long zzs = zzekVar.zzs();
        String[] strArr = new String[(int) zzs];
        int i = length + 15;
        for (int i2 = 0; i2 < zzs; i2++) {
            String zzA2 = zzekVar.zzA((int) zzekVar.zzs(), zzfuj.zzc);
            strArr[i2] = zzA2;
            i = i + 4 + zzA2.length();
        }
        if (z2 && (zzekVar.zzm() & 1) == 0) {
            throw zzbo.zza("framing bit expected to be set", null);
        }
        return new zzads(zzA, strArr, i + 1);
    }

    public static boolean zzd(int i, zzek zzekVar, boolean z) throws zzbo {
        if (zzekVar.zzb() < 7) {
            if (z) {
                return false;
            }
            throw zzbo.zza("too short header: " + zzekVar.zzb(), null);
        }
        if (zzekVar.zzm() != i) {
            if (z) {
                return false;
            }
            throw zzbo.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzekVar.zzm() == 118 && zzekVar.zzm() == 111 && zzekVar.zzm() == 114 && zzekVar.zzm() == 98 && zzekVar.zzm() == 105 && zzekVar.zzm() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzbo.zza("expected characters 'vorbis'", null);
    }
}
