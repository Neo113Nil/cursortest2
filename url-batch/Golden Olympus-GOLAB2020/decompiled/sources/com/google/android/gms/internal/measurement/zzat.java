package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzcz(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c4;
        int i4;
        int i5;
        int i6;
        int i7;
        zzg zzgVar2;
        int i8;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                if (str.equals(str4)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -1776922004:
                str5 = "charAt";
                if (str.equals("toString")) {
                    c4 = 14;
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c4 = 65535;
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c4 = '\f';
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c4 = 65535;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    c4 = 0;
                    break;
                }
                str4 = str2;
                c4 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    c4 = 1;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c4 = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case -906336856:
                if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                    c4 = 7;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c4 = 11;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c4 = 4;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c4 = 15;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c4 = 16;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 103668165:
                if (str.equals("match")) {
                    c4 = 5;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c4 = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 109648666:
                if (str.equals("split")) {
                    c4 = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c4 = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c4 = 6;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    c4 = 3;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                c4 = 65535;
                break;
        }
        String str6 = StringUtils.UNDEFINED;
        switch (c4) {
            case 0:
                zzh.zzj(str5, 1, list);
                int zza = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                String str7 = this.zza;
                return (zza < 0 || zza >= str7.length()) ? zzap.zzm : new zzat(String.valueOf(str7.charAt(zza)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.zza);
                for (int i9 = 0; i9 < list.size(); i9++) {
                    sb.append(zzgVar.zzb((zzap) list.get(i9)).zzi());
                }
                return new zzat(sb.toString());
            case 2:
                zzh.zzh(str4, 1, list);
                String str8 = this.zza;
                zzap zzb = zzgVar.zzb((zzap) list.get(0));
                if ("length".equals(zzb.zzi())) {
                    return zzap.zzk;
                }
                double doubleValue = zzb.zzh().doubleValue();
                return (doubleValue != Math.floor(doubleValue) || (i4 = (int) doubleValue) < 0 || i4 >= str8.length()) ? zzap.zzl : zzap.zzk;
            case 3:
                zzh.zzj("indexOf", 2, list);
                String str9 = this.zza;
                if (list.size() > 0) {
                    str6 = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                return new zzah(Double.valueOf(str9.indexOf(str6, (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
            case 4:
                zzh.zzj("lastIndexOf", 2, list);
                String str10 = this.zza;
                if (list.size() > 0) {
                    str6 = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                String str11 = str6;
                return new zzah(Double.valueOf(str10.lastIndexOf(str11, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zza(r3)))));
            case 5:
                zzh.zzj("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                return matcher.find() ? new zzae(Arrays.asList(new zzat(matcher.group()))) : zzap.zzg;
            case 6:
                zzh.zzj("replace", 2, list);
                zzap zzapVar = zzap.zzf;
                if (!list.isEmpty()) {
                    str6 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVar = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                String str12 = str6;
                String str13 = this.zza;
                int indexOf = str13.indexOf(str12);
                if (indexOf < 0) {
                    return this;
                }
                if (zzapVar instanceof zzai) {
                    i5 = 0;
                    zzapVar = ((zzai) zzapVar).zza(zzgVar, Arrays.asList(new zzat(str12), new zzah(Double.valueOf(indexOf)), this));
                } else {
                    i5 = 0;
                }
                return new zzat(str13.substring(i5, indexOf) + zzapVar.zzi() + str13.substring(indexOf + str12.length()));
            case 7:
                zzh.zzj(FirebaseAnalytics.Event.SEARCH, 1, list);
                if (!list.isEmpty()) {
                    str6 = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                return Pattern.compile(str6).matcher(this.zza).find() ? new zzah(Double.valueOf(r0.start())) : new zzah(Double.valueOf(-1.0d));
            case '\b':
                zzh.zzj("slice", 2, list);
                String str14 = this.zza;
                double zza2 = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                double max = zza2 < 0.0d ? Math.max(str14.length() + zza2, 0.0d) : Math.min(zza2, str14.length());
                double zza3 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str14.length());
                double max2 = zza3 < 0.0d ? Math.max(str14.length() + zza3, 0.0d) : Math.min(zza3, str14.length());
                int i10 = (int) max;
                return new zzat(str14.substring(i10, Math.max(0, ((int) max2) - i10) + i10));
            case '\t':
                zzh.zzj("split", 2, list);
                String str15 = this.zza;
                if (str15.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String zzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    long zzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                    if (zzd == 0) {
                        return new zzae();
                    }
                    String[] split = str15.split(Pattern.quote(zzi), ((int) zzd) + 1);
                    int length = split.length;
                    if (!zzi.isEmpty() || length <= 0) {
                        i6 = length;
                        i7 = 0;
                    } else {
                        boolean isEmpty = split[0].isEmpty();
                        i6 = length - 1;
                        i7 = isEmpty;
                        if (!split[i6].isEmpty()) {
                            i6 = length;
                            i7 = isEmpty;
                        }
                    }
                    if (length > zzd) {
                        i6--;
                    }
                    while (i7 < i6) {
                        arrayList.add(new zzat(split[i7]));
                        i7++;
                    }
                }
                return new zzae(arrayList);
            case '\n':
                zzh.zzj("substring", 2, list);
                String str16 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    i8 = 0;
                } else {
                    zzgVar2 = zzgVar;
                    i8 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                }
                int zza4 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str16.length();
                int min = Math.min(Math.max(i8, 0), str16.length());
                int min2 = Math.min(Math.max(zza4, 0), str16.length());
                return new zzat(str16.substring(Math.min(min, min2), Math.max(min, min2)));
            case 11:
                zzh.zzh("toLocaleUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase());
            case '\f':
                zzh.zzh("toLocaleLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase());
            case '\r':
                zzh.zzh("toLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zzh("toString", 0, list);
                return this;
            case 15:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
