package com.google.android.gms.internal.measurement;

import androidx.collection.SieveCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
public final class zzas implements zzaq, Iterable<zzaq> {
    private final String zza;

    public final int hashCode() {
        return this.zza.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        zzas zzasVar;
        String zzf;
        String zzf2;
        double min;
        double min2;
        int i2;
        int length;
        zzh zzhVar2;
        String zzf3;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
        } else {
            str2 = "hasOwnProperty";
            if (!"trim".equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1789698943:
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                if (str.equals(str3)) {
                    c = 0;
                    break;
                }
                break;
            case -1776922004:
                str4 = "charAt";
                if (str.equals("toString")) {
                    str3 = str2;
                    c = 1;
                    str5 = "toString";
                    break;
                }
                str3 = str2;
                str5 = "toString";
            case -1464939364:
                str4 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    str3 = str2;
                    c = 2;
                    str5 = "toString";
                    break;
                }
                str3 = str2;
                str5 = "toString";
            case -1361633751:
                str4 = "charAt";
                if (str.equals(str4)) {
                    str3 = str2;
                    c = 3;
                    str5 = "toString";
                    break;
                }
                str3 = str2;
                str5 = "toString";
            case -1354795244:
                if (str.equals("concat")) {
                    c = 4;
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = 5;
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case -906336856:
                if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                    c = 6;
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c = 7;
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = '\b';
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = '\t';
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case 3568674:
                if (str.equals("trim")) {
                    c = '\n';
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    c = 11;
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = '\f';
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    c = '\r';
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c = 14;
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c = 15;
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 16;
                }
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
            default:
                str3 = str2;
                str4 = "charAt";
                str5 = "toString";
                break;
        }
        switch (c) {
            case 0:
                zzg.zza(str3, 1, list);
                String str6 = this.zza;
                zzaq zza = zzhVar.zza(list.get(0));
                if ("length".equals(zza.zzf())) {
                    return zzag.zzh;
                }
                double doubleValue = zza.zze().doubleValue();
                if (doubleValue == Math.floor(doubleValue) && (i = (int) doubleValue) >= 0 && i < str6.length()) {
                    return zzag.zzh;
                }
                return zzag.zzi;
            case 1:
                zzg.zza(str5, 0, list);
                return this;
            case 2:
                zzg.zza("toLocaleLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase());
            case 3:
                zzg.zzc(str4, 1, list);
                int zza2 = !list.isEmpty() ? (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue()) : 0;
                String str7 = this.zza;
                if (zza2 < 0 || zza2 >= str7.length()) {
                    return zzaq.zzj;
                }
                return new zzas(String.valueOf(str7.charAt(zza2)));
            case 4:
                zzasVar = this;
                if (!list.isEmpty()) {
                    StringBuilder sb = new StringBuilder(zzasVar.zza);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        sb.append(zzhVar.zza(list.get(i3)).zzf());
                    }
                    return new zzas(sb.toString());
                }
                return zzasVar;
            case 5:
                zzg.zza("toLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            case 6:
                zzg.zzc(FirebaseAnalytics.Event.SEARCH, 1, list);
                if (!list.isEmpty()) {
                    zzf = zzhVar.zza(list.get(0)).zzf();
                } else {
                    zzf = zzaq.zzc.zzf();
                }
                if (Pattern.compile(zzf).matcher(this.zza).find()) {
                    return new zzai(Double.valueOf(r0.start()));
                }
                return new zzai(Double.valueOf(-1.0d));
            case 7:
                zzg.zza("toLocaleUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase());
            case '\b':
                zzg.zzc("lastIndexOf", 2, list);
                String str8 = this.zza;
                if (list.size() <= 0) {
                    zzf2 = zzaq.zzc.zzf();
                } else {
                    zzf2 = zzhVar.zza(list.get(0)).zzf();
                }
                return new zzai(Double.valueOf(str8.lastIndexOf(zzf2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzhVar.zza(list.get(1)).zze().doubleValue()) ? Double.POSITIVE_INFINITY : zzg.zza(r2)))));
            case '\t':
                zzg.zza("toUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            case '\n':
                zzg.zza("toUpperCase", 0, list);
                return new zzas(this.zza.trim());
            case 11:
                zzg.zzc("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzhVar.zza(list.get(0)).zzf()).matcher(this.zza);
                if (matcher.find()) {
                    return new zzaf(new zzas(matcher.group()));
                }
                return zzaq.zzd;
            case '\f':
                zzg.zzc("slice", 2, list);
                String str9 = this.zza;
                double zza3 = zzg.zza(!list.isEmpty() ? zzhVar.zza(list.get(0)).zze().doubleValue() : 0.0d);
                if (zza3 < 0.0d) {
                    min = Math.max(str9.length() + zza3, 0.0d);
                } else {
                    min = Math.min(zza3, str9.length());
                }
                int i4 = (int) min;
                double zza4 = zzg.zza(list.size() > 1 ? zzhVar.zza(list.get(1)).zze().doubleValue() : str9.length());
                if (zza4 < 0.0d) {
                    min2 = Math.max(str9.length() + zza4, 0.0d);
                } else {
                    min2 = Math.min(zza4, str9.length());
                }
                return new zzas(str9.substring(i4, Math.max(0, ((int) min2) - i4) + i4));
            case '\r':
                zzg.zzc("split", 2, list);
                String str10 = this.zza;
                if (str10.length() == 0) {
                    return new zzaf(this);
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String zzf4 = zzhVar.zza(list.get(0)).zzf();
                    long zzc = list.size() > 1 ? zzg.zzc(zzhVar.zza(list.get(1)).zze().doubleValue()) : SieveCacheKt.NodeLinkMask;
                    if (zzc == 0) {
                        return new zzaf();
                    }
                    String[] split = str10.split(Pattern.quote(zzf4), ((int) zzc) + 1);
                    int length2 = split.length;
                    if (!zzf4.isEmpty() || split.length <= 0) {
                        i2 = 0;
                    } else {
                        boolean isEmpty = split[0].isEmpty();
                        i2 = isEmpty;
                        if (split[split.length - 1].isEmpty()) {
                            length2 = split.length - 1;
                            i2 = isEmpty;
                        }
                    }
                    if (split.length > zzc) {
                        length2--;
                    }
                    while (i2 < length2) {
                        arrayList.add(new zzas(split[i2]));
                        i2++;
                    }
                }
                return new zzaf(arrayList);
            case 14:
                zzg.zzc("substring", 2, list);
                String str11 = this.zza;
                int zza5 = !list.isEmpty() ? (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue()) : 0;
                if (list.size() > 1) {
                    length = (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
                } else {
                    length = str11.length();
                }
                int min3 = Math.min(Math.max(zza5, 0), str11.length());
                int min4 = Math.min(Math.max(length, 0), str11.length());
                return new zzas(str11.substring(Math.min(min3, min4), Math.max(min3, min4)));
            case 15:
                zzasVar = this;
                zzg.zzc("replace", 2, list);
                String zzf5 = zzaq.zzc.zzf();
                zzaq zzaqVar = zzaq.zzc;
                if (!list.isEmpty()) {
                    zzf5 = zzhVar.zza(list.get(0)).zzf();
                    if (list.size() > 1) {
                        zzaqVar = zzhVar.zza(list.get(1));
                    }
                }
                String str12 = zzasVar.zza;
                int indexOf = str12.indexOf(zzf5);
                if (indexOf >= 0) {
                    if (zzaqVar instanceof zzal) {
                        zzaqVar = ((zzal) zzaqVar).zza(zzhVar, Arrays.asList(new zzas(zzf5), new zzai(Double.valueOf(indexOf)), zzasVar));
                    }
                    return new zzas(str12.substring(0, indexOf) + zzaqVar.zzf() + str12.substring(indexOf + zzf5.length()));
                }
                return zzasVar;
            case 16:
                zzg.zzc("indexOf", 2, list);
                String str13 = this.zza;
                if (list.size() <= 0) {
                    zzf3 = zzaq.zzc.zzf();
                    zzhVar2 = zzhVar;
                } else {
                    zzhVar2 = zzhVar;
                    zzf3 = zzhVar2.zza(list.get(0)).zzf();
                }
                return new zzai(Double.valueOf(str13.indexOf(zzf3, (int) zzg.zza(list.size() >= 2 ? zzhVar2.zza(list.get(1)).zze().doubleValue() : 0.0d))));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }
}
