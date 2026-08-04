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
import com.facebook.common.callercontext.ContextChain;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
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

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzalm {
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

    public static zzalg zza(zzef zzefVar, List list) {
        String zzN = zzefVar.zzN(StandardCharsets.UTF_8);
        if (zzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzefVar, list);
            }
            String zzN2 = zzefVar.zzN(StandardCharsets.UTF_8);
            if (zzN2 != null) {
                Matcher matcher2 = pattern.matcher(zzN2);
                if (matcher2.matches()) {
                    return zzd(zzN.trim(), matcher2, zzefVar, list);
                }
            }
        }
        return null;
    }

    static zzck zzb(String str) {
        zzall zzallVar = new zzall();
        zze(str, zzallVar);
        return zzallVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static SpannedString zzc(String str, String str2, List list) {
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
                        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 33);
                        sb.append("ignoring unsupported entity: '&");
                        sb.append(substring);
                        sb.append(";'");
                        zzds.zzc("WebvttCueParser", sb.toString());
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
                        StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 33);
                        sb2.append("ignoring unsupported entity: '&");
                        sb2.append(substring);
                        sb2.append(";'");
                        zzds.zzc("WebvttCueParser", sb2.toString());
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
                        StringBuilder sb22 = new StringBuilder(String.valueOf(substring).length() + 33);
                        sb22.append("ignoring unsupported entity: '&");
                        sb22.append(substring);
                        sb22.append(";'");
                        zzds.zzc("WebvttCueParser", sb22.toString());
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
                        StringBuilder sb222 = new StringBuilder(String.valueOf(substring).length() + 33);
                        sb222.append("ignoring unsupported entity: '&");
                        sb222.append(substring);
                        sb222.append(";'");
                        zzds.zzc("WebvttCueParser", sb222.toString());
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
                    zzghc.zza(true ^ trim.isEmpty());
                    String str3 = zzeo.zza;
                    String str4 = trim.split("[ \\.]", 2)[0];
                    int hashCode2 = str4.hashCode();
                    if (hashCode2 == 98 ? str4.equals("b") : !(hashCode2 == 99 ? !str4.equals("c") : hashCode2 == 105 ? !str4.equals(ContextChain.TAG_INFRA) : hashCode2 == 3650 ? !str4.equals("rt") : hashCode2 == 3314158 ? !str4.equals("lang") : hashCode2 == 3511770 ? !str4.equals("ruby") : hashCode2 == 117 ? !str4.equals("u") : hashCode2 != 118 || !str4.equals("v"))) {
                        if (charAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                zzalj zzaljVar = (zzalj) arrayDeque.pop();
                                zzf(str, zzaljVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new zzali(zzaljVar, spannableStringBuilder.length(), null));
                                }
                                if (zzaljVar.zza.equals(str4)) {
                                    break;
                                }
                            }
                        } else if (!z) {
                            arrayDeque.push(zzalj.zza(substring2, spannableStringBuilder.length()));
                        }
                    }
                }
            }
            i = i2;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzalj) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzalj.zzb(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static zzalg zzd(String str, Matcher matcher, zzef zzefVar, List list) {
        zzall zzallVar = new zzall();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            String str2 = group;
            zzallVar.zza = zzalo.zza(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            String str3 = group2;
            zzallVar.zzb = zzalo.zza(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zze(group3, zzallVar);
            StringBuilder sb = new StringBuilder();
            String zzN = zzefVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(zzN)) {
                if (sb.length() > 0) {
                    sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                sb.append(zzN.trim());
                zzN = zzefVar.zzN(StandardCharsets.UTF_8);
            }
            zzallVar.zzc = zzc(str, sb.toString(), list);
            return new zzalg(zzallVar.zza().zzr(), zzallVar.zza, zzallVar.zzb);
        } catch (IllegalArgumentException unused) {
            String group4 = matcher.group();
            String.valueOf(group4);
            zzds.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(group4)));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x007c, code lost:
    
        if (r8.equals("middle") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0083, code lost:
    
        if (r8.equals("center") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0193, code lost:
    
        if (r9.equals("middle") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019c, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x019a, code lost:
    
        if (r9.equals("center") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0120, code lost:
    
        if (r9.equals(com.facebook.react.uimanager.ViewProps.START) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014b, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
    
        if (r9.equals(com.facebook.react.uimanager.ViewProps.END) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0139, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012e, code lost:
    
        if (r9.equals("middle") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0141, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0137, code lost:
    
        if (r9.equals("line-right") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        if (r9.equals("center") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0149, code lost:
    
        if (r9.equals("line-left") != false) goto L78;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zze(String str, zzall zzallVar) {
        int i;
        int i2;
        int i3;
        int i4;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
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
                                if (substring.equals(ViewProps.END)) {
                                    i4 = 2;
                                    break;
                                }
                                String.valueOf(substring);
                                zzds.zzc("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                                i4 = Integer.MIN_VALUE;
                                break;
                            case 109757538:
                                if (substring.equals(ViewProps.START)) {
                                    i4 = 0;
                                    break;
                                }
                                String.valueOf(substring);
                                zzds.zzc("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                                i4 = Integer.MIN_VALUE;
                                break;
                            default:
                                String.valueOf(substring);
                                zzds.zzc("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                                i4 = Integer.MIN_VALUE;
                                break;
                        }
                        zzallVar.zzg = i4;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzallVar.zze = zzalo.zzb(group2);
                        zzallVar.zzf = 0;
                    } else {
                        zzallVar.zze = Integer.parseInt(group2);
                        zzallVar.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            break;
                        case -1074341483:
                            break;
                        case 100571:
                            if (group2.equals(ViewProps.END)) {
                                i = 3;
                                break;
                            }
                            zzds.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i = 2;
                            break;
                        case 3317767:
                            if (group2.equals(ViewProps.LEFT)) {
                                i = 4;
                                break;
                            }
                            zzds.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i = 2;
                            break;
                        case 108511772:
                            if (group2.equals(ViewProps.RIGHT)) {
                                i = 5;
                                break;
                            }
                            zzds.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i = 2;
                            break;
                        case 109757538:
                            if (group2.equals(ViewProps.START)) {
                                i = 1;
                                break;
                            }
                            zzds.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i = 2;
                            break;
                        default:
                            zzds.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i = 2;
                            break;
                    }
                    zzallVar.zzd = i;
                } else if (ViewProps.POSITION.equals(group)) {
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
                                String.valueOf(substring2);
                                zzds.zzc("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring2)));
                                i3 = Integer.MIN_VALUE;
                                break;
                        }
                        zzallVar.zzi = i3;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzallVar.zzh = zzalo.zzb(group2);
                } else if ("size".equals(group)) {
                    zzallVar.zzj = zzalo.zzb(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            i2 = 1;
                        }
                        zzds.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i2 = Integer.MIN_VALUE;
                    } else {
                        if (group2.equals("lr")) {
                            i2 = 2;
                        }
                        zzds.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i2 = Integer.MIN_VALUE;
                    }
                    zzallVar.zzk = i2;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    zzds.zzc("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String group3 = matcher.group();
                String.valueOf(group3);
                zzds.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(group3)));
            }
        }
    }

    private static void zzf(String str, zzalj zzaljVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        Comparator comparator;
        int i = zzaljVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaljVar.zza;
        int hashCode = str2.hashCode();
        int i2 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int zzg = zzg(list2, str, zzaljVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        comparator = zzali.zza;
                        Collections.sort(arrayList, comparator);
                        int i3 = i;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < arrayList.size()) {
                            if ("rt".equals(((zzali) arrayList.get(i4)).zzc().zza)) {
                                zzali zzaliVar = (zzali) arrayList.get(i4);
                                int zzg2 = zzg(list2, str, zzaliVar.zzc());
                                if (zzg2 == i2) {
                                    zzg2 = zzg != i2 ? zzg : 1;
                                }
                                int i6 = zzaliVar.zzc().zzb - i5;
                                int zzd2 = zzaliVar.zzd() - i5;
                                CharSequence subSequence = spannableStringBuilder.subSequence(i6, zzd2);
                                spannableStringBuilder.delete(i6, zzd2);
                                spannableStringBuilder.setSpan(new zzcq(subSequence.toString(), zzg2), i3, i6, 33);
                                i5 += subSequence.length();
                                i3 = i6;
                            }
                            i4++;
                            i2 = -1;
                        }
                    } else if (hashCode != 98) {
                        if (hashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : zzaljVar.zzd) {
                                Map map = zzc;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                                } else {
                                    Map map2 = zzd;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                                    }
                                }
                            }
                        } else if (hashCode != 117) {
                            if (hashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new zzct(zzaljVar.zzc), i, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals(ContextChain.TAG_INFRA)) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List zzh = zzh(list2, str, zzaljVar);
        for (int i7 = 0; i7 < zzh.size(); i7++) {
            zzalf zzalfVar = ((zzalk) zzh.get(i7)).zzb;
            if (zzalfVar != null) {
                if (zzalfVar.zzf() != -1) {
                    zzcr.zza(spannableStringBuilder, new StyleSpan(zzalfVar.zzf()), i, length, 33);
                }
                if (zzalfVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (zzalfVar.zzo()) {
                    zzcr.zza(spannableStringBuilder, new ForegroundColorSpan(zzalfVar.zzm()), i, length, 33);
                }
                if (zzalfVar.zzr()) {
                    zzcr.zza(spannableStringBuilder, new BackgroundColorSpan(zzalfVar.zzp()), i, length, 33);
                }
                if (zzalfVar.zzk() != null) {
                    zzcr.zza(spannableStringBuilder, new TypefaceSpan(zzalfVar.zzk()), i, length, 33);
                }
                int zzu = zzalfVar.zzu();
                if (zzu == 1) {
                    zzcr.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzalfVar.zzv(), true), i, length, 33);
                } else if (zzu == 2) {
                    zzcr.zza(spannableStringBuilder, new RelativeSizeSpan(zzalfVar.zzv()), i, length, 33);
                } else if (zzu == 3) {
                    zzcr.zza(spannableStringBuilder, new RelativeSizeSpan(zzalfVar.zzv() / 100.0f), i, length, 33);
                }
                if (zzalfVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzcp(), i, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, String str, zzalj zzaljVar) {
        List zzh = zzh(list, str, zzaljVar);
        for (int i = 0; i < zzh.size(); i++) {
            zzalf zzalfVar = ((zzalk) zzh.get(i)).zzb;
            if (zzalfVar.zzx() != -1) {
                return zzalfVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzalj zzaljVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzalf zzalfVar = (zzalf) list.get(i);
            int zze = zzalfVar.zze(str, zzaljVar.zza, zzaljVar.zzd, zzaljVar.zzc);
            if (zze > 0) {
                arrayList.add(new zzalk(zze, zzalfVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
