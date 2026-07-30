package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzanc {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzani zzf;
    public final String zzg;
    public final String zzh;
    public final zzanc zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    public static zzanc zza(String str) {
        return new zzanc(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static zzanc zzb(String str, long j, long j2, zzani zzaniVar, String[] strArr, String str2, String str3, zzanc zzancVar) {
        return new zzanc(str, null, j, j2, zzaniVar, strArr, str2, str3, zzancVar);
    }

    private final void zzi(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        if (z || equals || ("div".equals(str) && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzanc zzancVar = (zzanc) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                zzancVar.zzi(treeSet, z2);
            }
        }
    }

    private final void zzj(long j, String str, List list) {
        String str2;
        String str3 = this.zzg;
        boolean equals = "".equals(str3);
        boolean zzc = zzc(j);
        if (true != equals) {
            str = str3;
        }
        if (zzc && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zzf(); i++) {
            zze(i).zzj(j, str, list);
        }
    }

    private final void zzk(long j, boolean z, String str, Map map) {
        long j2;
        boolean z2;
        HashMap hashMap = this.zzk;
        hashMap.clear();
        HashMap hashMap2 = this.zzl;
        hashMap2.clear();
        String str2 = this.zza;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z) {
            SpannableStringBuilder zzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            zzl.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence zzb = ((zzcw) entry.getValue()).zzb();
                zzb.getClass();
                hashMap.put(str6, Integer.valueOf(zzb.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i = 0; i < zzf(); i++) {
                zzanc zze = zze(i);
                if (z || equals) {
                    j2 = j;
                    z2 = true;
                } else {
                    j2 = j;
                    z2 = false;
                }
                zze.zzk(j2, z2, str4, map);
            }
            if (equals) {
                SpannableStringBuilder zzl2 = zzl(str4, map);
                int length = zzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (zzl2.charAt(length) == ' ');
                if (length >= 0 && zzl2.charAt(length) != '\n') {
                    zzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence zzb2 = ((zzcw) entry2.getValue()).zzb();
                zzb2.getClass();
                hashMap2.put(str7, Integer.valueOf(zzb2.length()));
            }
        }
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcw zzcwVar = new zzcw();
            zzcwVar.zza(new SpannableStringBuilder());
            map.put(str, zzcwVar);
        }
        CharSequence zzb = ((zzcw) map.get(str)).zzb();
        zzb.getClass();
        return (SpannableStringBuilder) zzb;
    }

    private final void zzm(long j, Map map, Map map2, String str, Map map3) {
        Iterator it;
        zzanc zzancVar;
        zzani zza;
        boolean z;
        int i;
        Map map4 = map;
        if (zzc(j)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap = this.zzk;
                int intValue = hashMap.containsKey(str4) ? ((Integer) hashMap.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    zzcw zzcwVar = (zzcw) map3.get(str4);
                    zzcwVar.getClass();
                    zzang zzangVar = (zzang) map2.get(str3);
                    zzangVar.getClass();
                    int i2 = zzangVar.zzj;
                    zzani zza2 = zzanh.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcwVar.zzb();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcwVar.zza(spannableStringBuilder);
                    }
                    if (zza2 != null) {
                        zzanc zzancVar2 = this.zzi;
                        if (zza2.zza() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza2.zza()), intValue, intValue2, 33);
                        }
                        if (zza2.zzb()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzd()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzl()) {
                            zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zza2.zzj()), intValue, intValue2, 33);
                        }
                        if (zza2.zzo()) {
                            zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zza2.zzm()), intValue, intValue2, 33);
                        }
                        if (zza2.zzh() != null) {
                            zzdd.zza(spannableStringBuilder, new TypefaceSpan(zza2.zzh()), intValue, intValue2, 33);
                        }
                        if (zza2.zzE() != null) {
                            zzanb zzE = zza2.zzE();
                            zzE.getClass();
                            int i3 = zzE.zza;
                            it = it2;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = zzE.zzb;
                            }
                            int i4 = zzE.zzc;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            zzdd.zza(spannableStringBuilder, new zzde(i3, i, i4), intValue, intValue2, 33);
                        } else {
                            it = it2;
                        }
                        int zzv = zza2.zzv();
                        if (zzv == 2) {
                            while (true) {
                                if (zzancVar2 == null) {
                                    zzancVar2 = null;
                                    break;
                                }
                                zzani zza3 = zzanh.zza(zzancVar2.zzf, zzancVar2.zzj, map4);
                                if (zza3 != null && zza3.zzv() == 1) {
                                    break;
                                } else {
                                    zzancVar2 = zzancVar2.zzi;
                                }
                            }
                            if (zzancVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzancVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzancVar = null;
                                        break;
                                    }
                                    zzanc zzancVar3 = (zzanc) arrayDeque.pop();
                                    zzani zza4 = zzanh.zza(zzancVar3.zzf, zzancVar3.zzj, map4);
                                    if (zza4 != null && zza4.zzv() == 3) {
                                        zzancVar = zzancVar3;
                                        break;
                                    }
                                    for (int zzf = zzancVar3.zzf() - 1; zzf >= 0; zzf--) {
                                        arrayDeque.push(zzancVar3.zze(zzf));
                                    }
                                }
                                if (zzancVar != null) {
                                    if (zzancVar.zzf() != 1 || zzancVar.zze(0).zzb == null) {
                                        zzee.zzb("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzancVar.zze(0).zzb;
                                        String str6 = zzfj.zza;
                                        zzani zza5 = zzanh.zza(zzancVar.zzf, zzancVar.zzj, map4);
                                        int zzx = zza5 != null ? zza5.zzx() : -1;
                                        if (zzx == -1 && (zza = zzanh.zza(zzancVar2.zzf, zzancVar2.zzj, map4)) != null) {
                                            zzx = zza.zzx();
                                        }
                                        spannableStringBuilder.setSpan(new zzdc(str5, zzx), intValue, intValue2, 33);
                                    }
                                }
                            }
                        } else if (zzv == 3 || zzv == 4) {
                            spannableStringBuilder.setSpan(new zzana(), intValue, intValue2, 33);
                        }
                        if (zza2.zzC()) {
                            zzdd.zza(spannableStringBuilder, new zzdb(), intValue, intValue2, 33);
                        }
                        int zzI = zza2.zzI();
                        if (zzI != 1) {
                            if (zzI == 2) {
                                zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zza2.zzJ()), intValue, intValue2, 33);
                            } else if (zzI == 3) {
                                zzdd.zzb(spannableStringBuilder, zza2.zzJ() / 100.0f, intValue, intValue2, 33);
                            }
                            z = true;
                        } else {
                            z = true;
                            zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zza2.zzJ(), true), intValue, intValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zza2.zzq() != Float.MAX_VALUE) {
                                zzcwVar.zzp((zza2.zzq() * (-90.0f)) / 100.0f);
                            }
                            if (zza2.zzy() != null) {
                                zzcwVar.zzd(zza2.zzy());
                            }
                            if (zza2.zzA() != null) {
                                zzcwVar.zze(zza2.zzA());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            int i5 = 0;
            while (i5 < zzf()) {
                zze(i5).zzm(j, map4, map2, str3, map3);
                i5++;
                map4 = map;
            }
        }
    }

    public final boolean zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.zze) {
            return j2 <= j && j < this.zze;
        }
        return true;
    }

    public final void zzd(zzanc zzancVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzancVar);
    }

    public final zzanc zze(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzanc) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public final List zzh(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j, false, str, treeMap);
        zzm(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzang zzangVar = (zzang) map2.get(pair.first);
                zzangVar.getClass();
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(decodeByteArray);
                zzcwVar.zzi(zzangVar.zzb);
                zzcwVar.zzj(0);
                zzcwVar.zzf(zzangVar.zzc, 0);
                zzcwVar.zzg(zzangVar.zze);
                zzcwVar.zzm(zzangVar.zzf);
                zzcwVar.zzn(zzangVar.zzg);
                zzcwVar.zzo(zzangVar.zzj);
                arrayList2.add(zzcwVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzang zzangVar2 = (zzang) map2.get(entry.getKey());
            zzangVar2.getClass();
            zzcw zzcwVar2 = (zzcw) entry.getValue();
            CharSequence zzb = zzcwVar2.zzb();
            zzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzb;
            for (zzana zzanaVar : (zzana[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzana.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzanaVar), spannableStringBuilder.getSpanEnd(zzanaVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcwVar2.zzf(zzangVar2.zzc, zzangVar2.zzd);
            zzcwVar2.zzg(zzangVar2.zze);
            zzcwVar2.zzi(zzangVar2.zzb);
            zzcwVar2.zzm(zzangVar2.zzf);
            zzcwVar2.zzl(zzangVar2.zzi, zzangVar2.zzh);
            zzcwVar2.zzo(zzangVar2.zzj);
            arrayList2.add(zzcwVar2.zzr());
        }
        return arrayList2;
    }

    private zzanc(String str, String str2, long j, long j2, zzani zzaniVar, String[] strArr, String str3, String str4, zzanc zzancVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaniVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzancVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }
}
