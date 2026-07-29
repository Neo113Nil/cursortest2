package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzch {
    private final List<zzbo> zzaae;
    private final long zzaaf;
    private final long zzaag;
    private final int zzaah;
    private final boolean zzaai;
    private final String zzaaj;
    private final Map<String, String> zzsi;

    public zzch(zzaq zzaqVar, Map<String, String> map, long j, boolean z) {
        this(zzaqVar, map, j, z, 0L, 0, null);
    }

    public zzch(zzaq zzaqVar, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(zzaqVar, map, j, z, j2, i, null);
    }

    public zzch(zzaq zzaqVar, Map<String, String> map, long j, boolean z, long j2, int i, List<zzbo> list) {
        String str;
        String zza;
        String zza2;
        Preconditions.checkNotNull(zzaqVar);
        Preconditions.checkNotNull(map);
        this.zzaag = j;
        this.zzaai = z;
        this.zzaaf = j2;
        this.zzaah = i;
        this.zzaae = list != null ? list : Collections.emptyList();
        if (list != null) {
            for (zzbo zzboVar : list) {
                if ("appendVersion".equals(zzboVar.getId())) {
                    str = zzboVar.getValue();
                    break;
                }
            }
        }
        str = null;
        this.zzaaj = TextUtils.isEmpty(str) ? null : str;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (zzc(entry.getKey()) && (zza2 = zza(zzaqVar, entry.getKey())) != null) {
                hashMap.put(zza2, zzb(zzaqVar, entry.getValue()));
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (!zzc(entry2.getKey()) && (zza = zza(zzaqVar, entry2.getKey())) != null) {
                hashMap.put(zza, zzb(zzaqVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.zzaaj)) {
            zzdd.zzb(hashMap, "_v", this.zzaaj);
            if (this.zzaaj.equals("ma4.0.0") || this.zzaaj.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.zzsi = Collections.unmodifiableMap(hashMap);
    }

    private static String zza(zzaq zzaqVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            zzaqVar.zzc("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    private static String zzb(zzaq zzaqVar, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        String substring = obj2.substring(0, 8192);
        zzaqVar.zzc("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
        return substring;
    }

    private static boolean zzc(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    private final String zzd(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(!str.startsWith("&"), "Short param name required");
        String str3 = this.zzsi.get(str);
        return str3 != null ? str3 : str2;
    }

    public final List<zzbo> getCommands() {
        return this.zzaae;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.zzaag);
        if (this.zzaaf != 0) {
            sb.append(", dbId=");
            sb.append(this.zzaaf);
        }
        if (this.zzaah != 0) {
            sb.append(", appUID=");
            sb.append(this.zzaah);
        }
        ArrayList arrayList = new ArrayList(this.zzsi.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) obj;
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append(this.zzsi.get(str));
        }
        return sb.toString();
    }

    public final Map<String, String> zzcs() {
        return this.zzsi;
    }

    public final int zzel() {
        return this.zzaah;
    }

    public final long zzem() {
        return this.zzaaf;
    }

    public final long zzen() {
        return this.zzaag;
    }

    public final boolean zzeo() {
        return this.zzaai;
    }

    public final long zzep() {
        return zzdd.zzaf(zzd("_s", "0"));
    }

    public final String zzeq() {
        return zzd("_m", "");
    }
}
