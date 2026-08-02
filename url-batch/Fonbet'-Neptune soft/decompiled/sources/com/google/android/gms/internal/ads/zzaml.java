package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzaml {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static SpannedString zza(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            int i2 = i + 1;
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i2);
                int indexOf2 = str2.indexOf(32, i2);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i2, indexOf);
                    int hashCode = substring.hashCode();
                    if (hashCode == 3309) {
                        if (substring.equals("gt")) {
                            spannableStringBuilder.append(Typography.greater);
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        zzea.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else if (hashCode == 3464) {
                        if (substring.equals("lt")) {
                            spannableStringBuilder.append(Typography.less);
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        zzea.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else if (hashCode != 96708) {
                        if (hashCode == 3374865 && substring.equals("nbsp")) {
                            spannableStringBuilder.append(' ');
                            if (indexOf == indexOf2) {
                                spannableStringBuilder.append((CharSequence) " ");
                            }
                            i = indexOf + 1;
                        }
                        zzea.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else {
                        if (substring.equals("amp")) {
                            spannableStringBuilder.append(Typography.amp);
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        zzea.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    }
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
            } else if (i2 < str2.length()) {
                char charAt2 = str2.charAt(i2);
                int indexOf3 = str2.indexOf(62, i2);
                i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                int i3 = i2 - 2;
                boolean z = str2.charAt(i3) == '/';
                int i4 = i + (charAt2 == '/' ? 2 : 1);
                if (!z) {
                    i3 = i2 - 1;
                }
                String substring2 = str2.substring(i4, i3);
                if (!substring2.trim().isEmpty()) {
                    String trim = substring2.trim();
                    zzdd.zzd(true ^ trim.isEmpty());
                    String str3 = zzex.zza;
                    String str4 = trim.split("[ \\.]", 2)[0];
                    int hashCode2 = str4.hashCode();
                    if (hashCode2 == 98 ? str4.equals("b") : !(hashCode2 == 99 ? !str4.equals("c") : hashCode2 == 105 ? !str4.equals("i") : hashCode2 == 3650 ? !str4.equals("rt") : hashCode2 == 3314158 ? !str4.equals("lang") : hashCode2 == 3511770 ? !str4.equals("ruby") : hashCode2 == 117 ? !str4.equals("u") : hashCode2 != 118 || !str4.equals("v"))) {
                        if (charAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                zzamh zzamhVar = (zzamh) arrayDeque.pop();
                                zzg(str, zzamhVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new zzamg(zzamhVar, spannableStringBuilder.length(), null));
                                }
                                if (zzamhVar.zza.equals(str4)) {
                                    break;
                                }
                            }
                        } else if (!z) {
                            arrayDeque.push(zzamh.zza(substring2, spannableStringBuilder.length()));
                        }
                    }
                }
            }
            i = i2;
        }
        while (!arrayDeque.isEmpty()) {
            zzg(str, (zzamh) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzg(str, zzamh.zzb(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    static zzcs zzb(String str) {
        zzamj zzamjVar = new zzamj();
        zzh(str, zzamjVar);
        return zzamjVar.zza();
    }

    public static zzame zzc(zzen zzenVar, List list) {
        String zzz = zzenVar.zzz(StandardCharsets.UTF_8);
        if (zzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzz);
            if (matcher.matches()) {
                return zze(null, matcher, zzenVar, list);
            }
            String zzz2 = zzenVar.zzz(StandardCharsets.UTF_8);
            if (zzz2 != null) {
                Matcher matcher2 = pattern.matcher(zzz2);
                if (matcher2.matches()) {
                    return zze(zzz.trim(), matcher2, zzenVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzamh zzamhVar) {
        List zzf = zzf(list, str, zzamhVar);
        for (int i = 0; i < zzf.size(); i++) {
            zzamd zzamdVar = ((zzami) zzf.get(i)).zzb;
            if (zzamdVar.zze() != -1) {
                return zzamdVar.zze();
            }
        }
        return -1;
    }

    private static zzame zze(String str, Matcher matcher, zzen zzenVar, List list) {
        zzamj zzamjVar = new zzamj();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            String str2 = group;
            zzamjVar.zza = zzamn.zzb(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            String str3 = group2;
            zzamjVar.zzb = zzamn.zzb(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zzh(group3, zzamjVar);
            StringBuilder sb = new StringBuilder();
            String zzz = zzenVar.zzz(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(zzz)) {
                if (sb.length() > 0) {
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb.append(zzz.trim());
                zzz = zzenVar.zzz(StandardCharsets.UTF_8);
            }
            zzamjVar.zzc = zza(str, sb.toString(), list);
            return new zzame(zzamjVar.zza().zzq(), zzamjVar.zza, zzamjVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzea.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzamh zzamhVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzamd zzamdVar = (zzamd) list.get(i);
            int zzf = zzamdVar.zzf(str, zzamhVar.zza, zzamhVar.zzd, zzamhVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzami(zzf, zzamdVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(String str, zzamh zzamhVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        Comparator comparator;
        zzamh zzamhVar2;
        zzamh zzamhVar3;
        zzamh zzamhVar4;
        int i;
        int i2 = zzamhVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzamhVar.zza;
        int hashCode = str2.hashCode();
        int i3 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int zzd2 = zzd(list2, str, zzamhVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        comparator = zzamg.zza;
                        Collections.sort(arrayList, comparator);
                        int i4 = i2;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < arrayList.size()) {
                            zzamhVar2 = ((zzamg) arrayList.get(i5)).zzb;
                            if ("rt".equals(zzamhVar2.zza)) {
                                zzamg zzamgVar = (zzamg) arrayList.get(i5);
                                zzamhVar3 = zzamgVar.zzb;
                                int zzd3 = zzd(list2, str, zzamhVar3);
                                if (zzd3 == i3) {
                                    zzd3 = zzd2 != i3 ? zzd2 : 1;
                                }
                                zzamhVar4 = zzamgVar.zzb;
                                int i7 = zzamhVar4.zzb - i6;
                                i = zzamgVar.zzc;
                                int i8 = i - i6;
                                CharSequence subSequence = spannableStringBuilder.subSequence(i7, i8);
                                spannableStringBuilder.delete(i7, i8);
                                spannableStringBuilder.setSpan(new zzcz(subSequence.toString(), zzd3), i4, i7, 33);
                                i6 += subSequence.length();
                                i4 = i7;
                            }
                            i5++;
                            i3 = -1;
                        }
                    } else if (hashCode != 98) {
                        if (hashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : zzamhVar.zzd) {
                                Map map = zzc;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i2, length, 33);
                                } else {
                                    Map map2 = zzd;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i2, length, 33);
                                    }
                                }
                            }
                        } else if (hashCode != 117) {
                            if (hashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new zzdc(zzamhVar.zzc), i2, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List zzf = zzf(list2, str, zzamhVar);
        for (int i9 = 0; i9 < zzf.size(); i9++) {
            zzamd zzamdVar = ((zzami) zzf.get(i9)).zzb;
            if (zzamdVar != null) {
                if (zzamdVar.zzg() != -1) {
                    zzda.zzb(spannableStringBuilder, new StyleSpan(zzamdVar.zzg()), i2, length, 33);
                }
                if (zzamdVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                }
                if (zzamdVar.zzy()) {
                    zzda.zzb(spannableStringBuilder, new ForegroundColorSpan(zzamdVar.zzc()), i2, length, 33);
                }
                if (zzamdVar.zzx()) {
                    zzda.zzb(spannableStringBuilder, new BackgroundColorSpan(zzamdVar.zzb()), i2, length, 33);
                }
                if (zzamdVar.zzr() != null) {
                    zzda.zzb(spannableStringBuilder, new TypefaceSpan(zzamdVar.zzr()), i2, length, 33);
                }
                int zzd4 = zzamdVar.zzd();
                if (zzd4 == 1) {
                    zzda.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzamdVar.zza(), true), i2, length, 33);
                } else if (zzd4 == 2) {
                    zzda.zzb(spannableStringBuilder, new RelativeSizeSpan(zzamdVar.zza()), i2, length, 33);
                } else if (zzd4 == 3) {
                    zzda.zzb(spannableStringBuilder, new RelativeSizeSpan(zzamdVar.zza() / 100.0f), i2, length, 33);
                }
                if (zzamdVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzcy(), i2, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0097, code lost:
    
        if (r6.equals("rl") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0180, code lost:
    
        if (r7.equals("middle") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0189, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0187, code lost:
    
        if (r7.equals("center") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011c, code lost:
    
        if (r6.equals("start") != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013f, code lost:
    
        if (r6.equals("middle") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0146, code lost:
    
        if (r6.equals("center") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ca, code lost:
    
        if (r7.equals("start") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d1, code lost:
    
        if (r7.equals("end") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e3, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d8, code lost:
    
        if (r7.equals("middle") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e1, code lost:
    
        if (r7.equals("line-right") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e9, code lost:
    
        if (r7.equals("center") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f2, code lost:
    
        if (r7.equals("line-left") != false) goto L55;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzh(String str, zzamj zzamjVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                int i2 = Integer.MIN_VALUE;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    i2 = 2;
                                    break;
                                }
                                zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    i2 = 0;
                                    break;
                                }
                                zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                                break;
                            default:
                                zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                                break;
                        }
                        zzamjVar.zzg = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzamjVar.zze = zzamn.zza(group2);
                        zzamjVar.zzf = 0;
                    } else {
                        zzamjVar.zze = Integer.parseInt(group2);
                        zzamjVar.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            break;
                        case -1074341483:
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                i = 3;
                                break;
                            }
                            zzea.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i = 2;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                i = 4;
                                break;
                            }
                            zzea.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i = 2;
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                i = 5;
                                break;
                            }
                            zzea.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i = 2;
                            break;
                        case 109757538:
                            break;
                        default:
                            zzea.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i = 2;
                            break;
                    }
                    zzamjVar.zzd = i;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                break;
                            case -1364013995:
                                break;
                            case -1276788989:
                                break;
                            case -1074341483:
                                break;
                            case 100571:
                                break;
                            case 109757538:
                                break;
                            default:
                                zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring2)));
                                i = Integer.MIN_VALUE;
                                break;
                        }
                        zzamjVar.zzi = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzamjVar.zzh = zzamn.zza(group2);
                } else if ("size".equals(group)) {
                    zzamjVar.zzj = zzamn.zza(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642) {
                        }
                        zzea.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i = Integer.MIN_VALUE;
                    } else {
                        if (group2.equals("lr")) {
                            i = 2;
                        }
                        zzea.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i = Integer.MIN_VALUE;
                    }
                    zzamjVar.zzk = i;
                } else {
                    zzea.zzf("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                zzea.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
