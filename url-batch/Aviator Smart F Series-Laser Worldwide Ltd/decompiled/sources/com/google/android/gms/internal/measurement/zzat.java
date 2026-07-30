package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
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
    /* JADX WARN: Removed duplicated region for block: B:114:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x033e  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        char c8;
        String str8;
        zzat zzatVar;
        zzap zzatVar2;
        int i8;
        zzap zzahVar;
        int i9;
        int i10;
        zzg zzgVar2;
        int i11;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str)) {
            str2 = "toLocaleUpperCase";
            str3 = "toUpperCase";
        } else {
            str3 = "toUpperCase";
            str2 = "toLocaleUpperCase";
            if (!str3.equals(str) && !str2.equals(str)) {
                str4 = "hasOwnProperty";
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        if (str.equals(str6)) {
                            c8 = 2;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case -1776922004:
                        str5 = "charAt";
                        str7 = "toString";
                        if (str.equals(str7)) {
                            c8 = 14;
                            str6 = str4;
                            break;
                        } else {
                            str6 = str4;
                            c8 = 65535;
                            break;
                        }
                    case -1464939364:
                        str5 = "charAt";
                        if (str.equals("toLocaleLowerCase")) {
                            c8 = '\f';
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case -1361633751:
                        str5 = "charAt";
                        if (str.equals(str5)) {
                            str6 = str4;
                            str7 = "toString";
                            c8 = 0;
                            break;
                        }
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            c8 = 1;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c8 = '\r';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case -906336856:
                        if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                            c8 = 7;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c8 = 11;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c8 = 4;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case -399551817:
                        if (str.equals(str3)) {
                            c8 = 15;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case 3568674:
                        if (str.equals("trim")) {
                            c8 = 16;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c8 = 5;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c8 = '\b';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c8 = '\t';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c8 = '\n';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c8 = 6;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            c8 = 3;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                    default:
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c8 = 65535;
                        break;
                }
                str8 = "undefined";
                double d8 = i.DOUBLE_EPSILON;
                switch (c8) {
                    case 0:
                        zzh.zzj(str5, 1, list);
                        int zza = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                        String str9 = this.zza;
                        return (zza < 0 || zza >= str9.length()) ? zzap.zzm : new zzat(String.valueOf(str9.charAt(zza)));
                    case 1:
                        zzatVar = this;
                        if (!list.isEmpty()) {
                            StringBuilder sb = new StringBuilder(zzatVar.zza);
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                sb.append(zzgVar.zzb((zzap) list.get(i12)).zzi());
                            }
                            zzatVar2 = new zzat(sb.toString());
                            return zzatVar2;
                        }
                        return zzatVar;
                    case 2:
                        zzatVar = this;
                        zzh.zzh(str6, 1, list);
                        String str10 = zzatVar.zza;
                        zzap zzb = zzgVar.zzb((zzap) list.get(0));
                        if (SessionDescription.ATTR_LENGTH.equals(zzb.zzi())) {
                            zzatVar2 = zzap.zzk;
                        } else {
                            double doubleValue = zzb.zzh().doubleValue();
                            zzatVar2 = (doubleValue != Math.floor(doubleValue) || (i8 = (int) doubleValue) < 0 || i8 >= str10.length()) ? zzap.zzl : zzap.zzk;
                        }
                        return zzatVar2;
                    case 3:
                        zzatVar = this;
                        zzh.zzj("indexOf", 2, list);
                        String str11 = zzatVar.zza;
                        String zzi = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                        if (list.size() >= 2) {
                            d8 = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                        }
                        zzahVar = new zzah(Double.valueOf(str11.indexOf(zzi, (int) zzh.zza(d8))));
                        return zzahVar;
                    case 4:
                        zzatVar = this;
                        zzh.zzj("lastIndexOf", 2, list);
                        String str12 = zzatVar.zza;
                        String zzi2 = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                        zzahVar = new zzah(Double.valueOf(str12.lastIndexOf(zzi2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zza(r0)))));
                        return zzahVar;
                    case 5:
                        zzatVar = this;
                        zzh.zzj("match", 1, list);
                        Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(zzatVar.zza);
                        if (matcher.find()) {
                            zzahVar = new zzae(Arrays.asList(new zzat(matcher.group())));
                            return zzahVar;
                        }
                        zzatVar2 = zzap.zzg;
                        return zzatVar2;
                    case 6:
                        zzatVar = this;
                        zzh.zzj("replace", 2, list);
                        zzap zzapVar = zzap.zzf;
                        if (!list.isEmpty()) {
                            str8 = zzgVar.zzb((zzap) list.get(0)).zzi();
                            if (list.size() > 1) {
                                zzapVar = zzgVar.zzb((zzap) list.get(1));
                            }
                        }
                        String str13 = str8;
                        String str14 = zzatVar.zza;
                        int indexOf = str14.indexOf(str13);
                        if (indexOf >= 0) {
                            if (zzapVar instanceof zzai) {
                                zzapVar = ((zzai) zzapVar).zza(zzgVar, Arrays.asList(new zzat(str13), new zzah(Double.valueOf(indexOf)), zzatVar));
                            }
                            zzahVar = new zzat(str14.substring(0, indexOf) + zzapVar.zzi() + str14.substring(indexOf + str13.length()));
                            return zzahVar;
                        }
                        return zzatVar;
                    case 7:
                        zzatVar = this;
                        zzh.zzj(FirebaseAnalytics.Event.SEARCH, 1, list);
                        if (Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(zzatVar.zza).find()) {
                            zzahVar = new zzah(Double.valueOf(r0.start()));
                            return zzahVar;
                        }
                        zzatVar2 = new zzah(Double.valueOf(-1.0d));
                        return zzatVar2;
                    case '\b':
                        zzatVar = this;
                        zzh.zzj("slice", 2, list);
                        String str15 = zzatVar.zza;
                        double zza2 = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                        double max = zza2 < i.DOUBLE_EPSILON ? Math.max(str15.length() + zza2, i.DOUBLE_EPSILON) : Math.min(zza2, str15.length());
                        double zza3 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str15.length());
                        int i13 = (int) max;
                        zzahVar = new zzat(str15.substring(i13, Math.max(0, ((int) (zza3 < i.DOUBLE_EPSILON ? Math.max(str15.length() + zza3, i.DOUBLE_EPSILON) : Math.min(zza3, str15.length()))) - i13) + i13));
                        return zzahVar;
                    case '\t':
                        zzatVar = this;
                        zzh.zzj("split", 2, list);
                        String str16 = zzatVar.zza;
                        if (str16.length() == 0) {
                            zzatVar2 = new zzae(Arrays.asList(zzatVar));
                        } else {
                            ArrayList arrayList = new ArrayList();
                            if (list.isEmpty()) {
                                arrayList.add(zzatVar);
                            } else {
                                String zzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                                long zzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                                if (zzd == 0) {
                                    zzatVar2 = new zzae();
                                } else {
                                    String[] split = str16.split(Pattern.quote(zzi3), ((int) zzd) + 1);
                                    int length = split.length;
                                    if (!zzi3.isEmpty() || length <= 0) {
                                        i9 = length;
                                        i10 = 0;
                                    } else {
                                        boolean isEmpty = split[0].isEmpty();
                                        i9 = length - 1;
                                        i10 = isEmpty;
                                        if (!split[i9].isEmpty()) {
                                            i9 = length;
                                            i10 = isEmpty;
                                        }
                                    }
                                    if (length > zzd) {
                                        i9--;
                                    }
                                    while (i10 < i9) {
                                        arrayList.add(new zzat(split[i10]));
                                        i10++;
                                    }
                                }
                            }
                            zzatVar2 = new zzae(arrayList);
                        }
                        return zzatVar2;
                    case '\n':
                        zzatVar = this;
                        zzh.zzj("substring", 2, list);
                        String str17 = zzatVar.zza;
                        if (list.isEmpty()) {
                            zzgVar2 = zzgVar;
                            i11 = 0;
                        } else {
                            zzgVar2 = zzgVar;
                            i11 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                        }
                        int zza4 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str17.length();
                        int min = Math.min(Math.max(i11, 0), str17.length());
                        int min2 = Math.min(Math.max(zza4, 0), str17.length());
                        zzahVar = new zzat(str17.substring(Math.min(min, min2), Math.max(min, min2)));
                        return zzahVar;
                    case 11:
                        zzatVar = this;
                        zzh.zzh(str2, 0, list);
                        zzahVar = new zzat(zzatVar.zza.toUpperCase());
                        return zzahVar;
                    case '\f':
                        zzatVar = this;
                        zzh.zzh("toLocaleLowerCase", 0, list);
                        zzahVar = new zzat(zzatVar.zza.toLowerCase());
                        return zzahVar;
                    case '\r':
                        zzatVar = this;
                        zzh.zzh("toLowerCase", 0, list);
                        zzahVar = new zzat(zzatVar.zza.toLowerCase(Locale.ENGLISH));
                        return zzahVar;
                    case 14:
                        zzatVar = this;
                        zzh.zzh(str7, 0, list);
                        return zzatVar;
                    case 15:
                        zzatVar = this;
                        zzh.zzh(str3, 0, list);
                        zzahVar = new zzat(zzatVar.zza.toUpperCase(Locale.ENGLISH));
                        return zzahVar;
                    case 16:
                        zzh.zzh(str3, 0, list);
                        zzatVar = this;
                        zzahVar = new zzat(zzatVar.zza.trim());
                        return zzahVar;
                    default:
                        throw new IllegalArgumentException("Command not supported");
                }
            }
        }
        str4 = "hasOwnProperty";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        str8 = "undefined";
        double d82 = i.DOUBLE_EPSILON;
        switch (c8) {
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
        if (this.zza.isEmpty()) {
            return Double.valueOf(i.DOUBLE_EPSILON);
        }
        try {
            return Double.valueOf(this.zza);
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
