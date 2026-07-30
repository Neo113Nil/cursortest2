package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzanf implements zzamf {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzand zzh = new zzand(30.0f, 1, 1);

    private static String[] zzc(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfj.zza;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private static zzani zzd(XmlPullParser xmlPullParser, zzani zzaniVar) {
        ?? r6;
        Matcher matcher;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        zzani zzaniVar2 = zzaniVar;
        int i = 0;
        while (i < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            ?? r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r102 = -1;
            r10 = -1;
            r10 = -1;
            ?? r103 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r104 = -1;
            r10 = -1;
            r10 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        r6 = 6;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        r6 = 16;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        r6 = 3;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        r6 = 7;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        r6 = 15;
                        break;
                    }
                    r6 = -1;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        r6 = 12;
                        break;
                    }
                    r6 = -1;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        r6 = 5;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r6 = z;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        r6 = 10;
                        break;
                    }
                    r6 = -1;
                    break;
                case 94842723:
                    if (attributeName.equals(TypedValues.Custom.S_COLOR)) {
                        r6 = 2;
                        break;
                    }
                    r6 = -1;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        r6 = 14;
                        break;
                    }
                    r6 = -1;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        r6 = 9;
                        break;
                    }
                    r6 = -1;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        r6 = 4;
                        break;
                    }
                    r6 = -1;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        r6 = 13;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        r6 = 11;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        r6 = 1;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        r6 = 8;
                        break;
                    }
                    r6 = -1;
                    break;
                default:
                    r6 = -1;
                    break;
            }
            switch (r6) {
                case 0:
                    if (!AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE.equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzs(attributeValue);
                        break;
                    }
                case 1:
                    zzaniVar2 = zze(zzaniVar2);
                    try {
                        zzaniVar2.zzn(zzdp.zza(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        String.valueOf(attributeValue);
                        zzee.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzaniVar2 = zze(zzaniVar2);
                    try {
                        zzaniVar2.zzk(zzdp.zza(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        String.valueOf(attributeValue);
                        zzee.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzaniVar2 = zze(zzaniVar2);
                    zzaniVar2.zzi(attributeValue);
                    break;
                case 4:
                    try {
                        zzaniVar2 = zze(zzaniVar2);
                        String str = zzfj.zza;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(".");
                                throw new zzamb(sb.toString());
                            }
                            matcher = zze.matcher(split[1]);
                            zzee.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(attributeValue).length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new zzamb(sb2.toString());
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        String str2 = group;
                        int hashCode = group.hashCode();
                        if (hashCode == 37) {
                            if (group.equals("%")) {
                                c = 2;
                            }
                            c = 65535;
                        } else if (hashCode != 3240) {
                            if (hashCode == 3592 && group.equals("px")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (group.equals(UserDataStore.EMAIL)) {
                                c = 1;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            zzaniVar2.zzH(1);
                        } else if (c == 1) {
                            zzaniVar2.zzH(2);
                        } else {
                            if (c != 2) {
                                StringBuilder sb3 = new StringBuilder(group.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(group);
                                sb3.append("'.");
                                throw new zzamb(sb3.toString());
                            }
                            zzaniVar2.zzH(3);
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        String str3 = group2;
                        zzaniVar2.zzG(Float.parseFloat(group2));
                        break;
                    } catch (zzamb unused3) {
                        String.valueOf(attributeValue);
                        zzee.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                    break;
                case 5:
                    zzaniVar2 = zze(zzaniVar2);
                    zzaniVar2.zzf("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzaniVar2 = zze(zzaniVar2);
                    zzaniVar2.zzg("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzaniVar2 = zze(zzaniVar2);
                    zzaniVar2.zzz(zzf(attributeValue));
                    break;
                case 8:
                    zzaniVar2 = zze(zzaniVar2);
                    zzaniVar2.zzB(zzf(attributeValue));
                    break;
                case 9:
                    String zza2 = zzgql.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
                            r10 = z;
                        }
                    } else if (zza2.equals("all")) {
                        r10 = 1;
                    }
                    if (r10 == 0) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzD(z);
                        break;
                    } else if (r10 == 1) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzD(true);
                        break;
                    } else {
                        break;
                    }
                    break;
                case 10:
                    String zza3 = zzgql.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                r104 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals("container")) {
                                r104 = z;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                r104 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                r104 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                r104 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                r104 = 3;
                                break;
                            }
                            break;
                    }
                    if (r104 == 0) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzu(1);
                        break;
                    } else if (r104 != 1 && r104 != 2) {
                        if (r104 != 3 && r104 != 4) {
                            if (r104 == 5) {
                                zzaniVar2 = zze(zzaniVar2);
                                zzaniVar2.zzu(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            zzaniVar2 = zze(zzaniVar2);
                            zzaniVar2.zzu(3);
                            break;
                        }
                    } else {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzu(2);
                        break;
                    }
                case 11:
                    String zza4 = zzgql.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            r103 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        r103 = z;
                    }
                    if (r103 == 0) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzw(1);
                        break;
                    } else if (r103 == 1) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzw(2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    String zza5 = zzgql.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                r102 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                r102 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                r102 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                r102 = z;
                                break;
                            }
                            break;
                    }
                    if (r102 == 0) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzc(true);
                        break;
                    } else if (r102 == 1) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zzc(z);
                        break;
                    } else if (r102 == 2) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zze(true);
                        break;
                    } else if (r102 == 3) {
                        zzaniVar2 = zze(zzaniVar2);
                        zzaniVar2.zze(z);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    zzaniVar2 = zze(zzaniVar2);
                    zzaniVar2.zzF(zzanb.zza(attributeValue));
                    break;
                case 14:
                    zzani zze2 = zze(zzaniVar2);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                String str4 = group3;
                                f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e) {
                            String.valueOf(attributeValue);
                            zzee.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        String.valueOf(attributeValue);
                        zzee.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zze2.zzp(f);
                    zzaniVar2 = zze2;
                    break;
                case 15:
                    zzaniVar2 = zze(zzaniVar2);
                    zzaniVar2.zzK(attributeValue);
                    break;
                case 16:
                    zzaniVar2 = zze(zzaniVar2);
                    zzaniVar2.zzM(attributeValue);
                    break;
            }
            i++;
            z = false;
        }
        return zzaniVar2;
    }

    private static zzani zze(zzani zzaniVar) {
        return zzaniVar == null ? new zzani() : zzaniVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zzf(String str) {
        char c;
        String zza2 = zzgql.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (zza2.equals(ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c == 2 || c == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzg(String str, zzand zzandVar) throws zzamb {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
        char c = 2;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d3 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double d4 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d5 = d3 + parseLong3;
            double parseLong4 = matcher.group(5) != null ? Long.parseLong(r13) / zzandVar.zza : 0.0d;
            double d6 = d5 + parseDouble;
            if (matcher.group(6) != null) {
                d4 = (Long.parseLong(r13) / zzandVar.zzb) / zzandVar.zza;
            }
            return (long) ((d6 + parseLong4 + d4) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            String.valueOf(str);
            throw new zzamb("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode == 104) {
            if (group6.equals("h")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 109) {
            if (group6.equals("m")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3494) {
            if (group6.equals("ms")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode != 115) {
            if (hashCode == 116 && group6.equals("t")) {
                c = 5;
            }
            c = 65535;
        }
        if (c == 0) {
            d = 3600.0d;
        } else {
            if (c != 1) {
                if (c == 3) {
                    d2 = 1000.0d;
                } else {
                    if (c != 4) {
                        if (c == 5) {
                            d2 = zzandVar.zzc;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d2 = zzandVar.zza;
                }
                parseDouble2 /= d2;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d = 60.0d;
        }
        parseDouble2 *= d;
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        zzalz.zza(zzb(bArr, i, i2), zzameVar, zzdrVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(8:401|(1:(6:404|405|406|33|(2:374|(1:376)(4:377|378|379|(2:381|(1:383)(2:384|385))(2:386|387)))|35)(1:409))(1:411)|410|405|406|33|(0)|35) */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0308 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ae A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c2 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x047d A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04cc A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06d0 A[Catch: zzamb -> 0x06db, IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #12 {zzamb -> 0x06db, blocks: (B:357:0x06cb, B:359:0x06d0), top: B:356:0x06cb }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x016f A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d3 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_ENTER, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0270 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, LOOP:1: B:73:0x0270->B:87:0x057b, LOOP_START, PHI: r1 r2 r3 r8 r10 r14 r15
      0x0270: PHI (r1v37 java.lang.String) = (r1v12 java.lang.String), (r1v80 java.lang.String) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r2v30 com.google.android.gms.internal.ads.zzand) = (r2v7 com.google.android.gms.internal.ads.zzand), (r2v54 com.google.android.gms.internal.ads.zzand) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r3v20 java.lang.String) = (r3v1 java.lang.String), (r3v29 java.lang.String) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r8v29 java.util.HashMap) = (r8v1 java.util.HashMap), (r8v51 java.util.HashMap) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r10v14 java.lang.String) = (r10v11 java.lang.String), (r10v33 java.lang.String) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r14v21 java.lang.String) = (r14v12 java.lang.String), (r14v28 java.lang.String) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r15v10 java.lang.String) = (r15v8 java.lang.String), (r15v12 java.lang.String) binds: [B:72:0x026e, B:87:0x057b] A[DONT_GENERATE, DONT_INLINE], TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:17:0x0090, B:19:0x0098, B:22:0x00ae, B:23:0x00c9, B:25:0x00d3, B:26:0x00d7, B:28:0x00e3, B:29:0x00e7, B:33:0x0160, B:36:0x01b9, B:39:0x01d3, B:41:0x01d9, B:43:0x01e1, B:45:0x01e9, B:47:0x01f1, B:49:0x01f9, B:51:0x0201, B:53:0x0207, B:55:0x020f, B:57:0x0217, B:59:0x021d, B:61:0x0223, B:63:0x0229, B:65:0x0231, B:68:0x023a, B:70:0x075a, B:71:0x026a, B:73:0x0270, B:75:0x0279, B:77:0x0288, B:79:0x0295, B:81:0x02a9, B:83:0x02af, B:85:0x056f, B:95:0x02b9, B:98:0x02c5, B:102:0x0523, B:104:0x02e3, B:106:0x02eb, B:108:0x02f3, B:110:0x02fb, B:113:0x0308, B:117:0x0321, B:119:0x0327, B:121:0x0337, B:123:0x03a6, B:125:0x03ae, B:127:0x03b4, B:129:0x03bc, B:131:0x03c2, B:135:0x03d5, B:137:0x03db, B:139:0x03eb, B:140:0x0475, B:142:0x047d, B:155:0x04c4, B:157:0x04cc, B:173:0x0516, B:190:0x03fa, B:193:0x03fb, B:194:0x03fc, B:196:0x040b, B:199:0x0413, B:202:0x0424, B:204:0x042a, B:206:0x0438, B:208:0x044f, B:210:0x0450, B:211:0x0451, B:212:0x0461, B:215:0x0341, B:217:0x0342, B:218:0x0343, B:219:0x034b, B:222:0x0355, B:225:0x035e, B:227:0x0364, B:229:0x0372, B:231:0x0387, B:233:0x0388, B:234:0x0389, B:235:0x0391, B:239:0x0531, B:241:0x0540, B:243:0x054b, B:245:0x0551, B:246:0x055d, B:256:0x058d, B:260:0x05b0, B:279:0x0664, B:289:0x0620, B:293:0x0629, B:284:0x06e3, B:300:0x0633, B:303:0x063d, B:308:0x0651, B:310:0x0656, B:312:0x065d, B:338:0x067e, B:342:0x068a, B:345:0x0693, B:351:0x06a8, B:354:0x06bf, B:357:0x06cb, B:359:0x06d0, B:363:0x06af, B:374:0x016f, B:376:0x017b, B:379:0x0184, B:381:0x018a, B:383:0x0198, B:385:0x01a7, B:387:0x01a8, B:388:0x01a9, B:389:0x0100, B:391:0x010c, B:394:0x0116, B:396:0x011c, B:399:0x0127, B:401:0x012d, B:406:0x0144, B:408:0x0158, B:414:0x014e, B:420:0x0153, B:430:0x0703, B:433:0x0713, B:436:0x0717, B:438:0x0721, B:440:0x072b, B:441:0x0736, B:444:0x0733, B:448:0x074b, B:451:0x0753, B:455:0x0774, B:458:0x077a), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r48v1, types: [com.google.android.gms.internal.ads.zzani, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzama zzb(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        String str3;
        ArrayDeque arrayDeque;
        zzand zzandVar;
        zzanj zzanjVar;
        int i3;
        HashMap hashMap;
        zzand zzandVar2;
        zzane zzaneVar;
        int i4;
        ArrayDeque arrayDeque2;
        zzand zzandVar3;
        int i5;
        zzani zzd2;
        String str4;
        long j;
        long j2;
        long j3;
        String[] strArr;
        String str5;
        zzanc zzancVar;
        zzanc zzancVar2;
        long j4;
        long j5;
        long j6;
        Object obj;
        char c;
        zzand zzandVar4;
        String str6;
        String str7;
        String str8;
        String zzc2;
        String str9;
        String str10;
        String str11;
        HashMap hashMap2;
        String str12;
        float f;
        float f2;
        zzang zzangVar;
        float f3;
        String zzc3;
        float f4;
        float f5;
        String zzc4;
        int i6;
        float f6;
        String zzc5;
        int i7;
        char c2;
        char c3;
        String zzc6;
        zzani zzaniVar;
        zzani zzaniVar2;
        float f7;
        String group;
        String group2;
        boolean z;
        String zzc7;
        String str13 = "";
        String str14 = "http://www.w3.org/ns/ttml#parameter";
        String str15 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser newPullParser = this.zzi.newPullParser();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            hashMap4.put("", new zzang("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzand zzandVar5 = zzh;
            zzanj zzanjVar2 = null;
            zzane zzaneVar2 = null;
            zzand zzandVar6 = zzandVar5;
            int i8 = 0;
            int i9 = 15;
            while (eventType != 1) {
                zzanc zzancVar3 = (zzanc) arrayDeque3.peek();
                ?? r48 = obj2;
                if (i8 == 0) {
                    String name = newPullParser.getName();
                    str = str13;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str14, "frameRate");
                            int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str14, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                zzanjVar = zzanjVar2;
                                String str16 = zzfj.zza;
                                i3 = i8;
                                zzgrc.zzb(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f7 = Integer.parseInt(r4[0]) / Integer.parseInt(r4[1]);
                            } else {
                                zzanjVar = zzanjVar2;
                                i3 = i8;
                                f7 = 1.0f;
                            }
                            int i10 = zzandVar5.zzb;
                            String attributeValue3 = newPullParser.getAttributeValue(str14, "subFrameRate");
                            if (attributeValue3 != null) {
                                i10 = Integer.parseInt(attributeValue3);
                            }
                            int i11 = zzandVar5.zzc;
                            zzandVar = zzandVar5;
                            String attributeValue4 = newPullParser.getAttributeValue(str14, "tickRate");
                            if (attributeValue4 != null) {
                                i11 = Integer.parseInt(attributeValue4);
                            }
                            zzand zzandVar7 = new zzand(parseInt * f7, i10, i11);
                            String attributeValue5 = newPullParser.getAttributeValue(str14, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        group = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        str2 = str14;
                                    }
                                    if (group == null) {
                                        throw r48;
                                    }
                                    String str17 = group;
                                    int parseInt2 = Integer.parseInt(group);
                                    str2 = str14;
                                    try {
                                        group2 = matcher.group(2);
                                    } catch (NumberFormatException unused2) {
                                        zzandVar6 = zzandVar7;
                                        zzee.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i9 = 15;
                                        zzc7 = zzfq.zzc(newPullParser, "extent");
                                        if (zzc7 != null) {
                                        }
                                        zzaneVar2 = r48;
                                        zzandVar2 = zzandVar6;
                                        zzaneVar = zzaneVar2;
                                        i4 = i9;
                                        String str18 = "image";
                                        String str19 = "metadata";
                                        String str20 = "region";
                                        arrayDeque2 = arrayDeque3;
                                        String str21 = "head";
                                        if (!name.equals("tt")) {
                                            String name2 = newPullParser.getName();
                                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                                            sb.append(str15);
                                            sb.append(name2);
                                            zzee.zzb("TtmlParser", sb.toString());
                                            zzandVar6 = zzandVar2;
                                            str3 = str15;
                                            zzaneVar2 = zzaneVar;
                                            hashMap = hashMap5;
                                            i9 = i4;
                                            zzanjVar2 = zzanjVar;
                                            arrayDeque = arrayDeque2;
                                            i8 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap5 = hashMap;
                                            str13 = str;
                                            zzandVar5 = zzandVar;
                                            str14 = str2;
                                            obj2 = null;
                                            arrayDeque3 = arrayDeque;
                                            str15 = str3;
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzaneVar2 = zzaneVar;
                                        zzandVar6 = zzandVar3;
                                        i9 = i4;
                                        zzanjVar2 = zzanjVar;
                                        i8 = i3;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        hashMap5 = hashMap;
                                        str13 = str;
                                        zzandVar5 = zzandVar;
                                        str14 = str2;
                                        obj2 = null;
                                        arrayDeque3 = arrayDeque;
                                        str15 = str3;
                                    }
                                    if (group2 == null) {
                                        throw r48;
                                    }
                                    String str22 = group2;
                                    int parseInt3 = Integer.parseInt(group2);
                                    if (parseInt2 == 0) {
                                        z = false;
                                    } else if (parseInt3 != 0) {
                                        zzandVar6 = zzandVar7;
                                        z = true;
                                        zzgrc.zzg(z, "Invalid cell resolution %s %s", parseInt2, parseInt3);
                                        i9 = parseInt3;
                                        zzc7 = zzfq.zzc(newPullParser, "extent");
                                        if (zzc7 != null) {
                                            Matcher matcher2 = zzf.matcher(zzc7);
                                            if (matcher2.matches()) {
                                                try {
                                                    String group3 = matcher2.group(1);
                                                    if (group3 == null) {
                                                        throw r48;
                                                    }
                                                    String str23 = group3;
                                                    int parseInt4 = Integer.parseInt(group3);
                                                    String group4 = matcher2.group(2);
                                                    if (group4 == null) {
                                                        throw r48;
                                                    }
                                                    String str24 = group4;
                                                    zzaneVar2 = new zzane(parseInt4, Integer.parseInt(group4));
                                                } catch (NumberFormatException unused3) {
                                                    zzee.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(zzc7));
                                                }
                                            } else {
                                                zzee.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zzc7));
                                            }
                                        }
                                        zzaneVar2 = r48;
                                    } else {
                                        parseInt3 = 0;
                                        z = false;
                                    }
                                    zzandVar6 = zzandVar7;
                                    zzgrc.zzg(z, "Invalid cell resolution %s %s", parseInt2, parseInt3);
                                    i9 = parseInt3;
                                    zzc7 = zzfq.zzc(newPullParser, "extent");
                                    if (zzc7 != null) {
                                    }
                                    zzaneVar2 = r48;
                                } else {
                                    zzee.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str14;
                            zzandVar6 = zzandVar7;
                            i9 = 15;
                            zzc7 = zzfq.zzc(newPullParser, "extent");
                            if (zzc7 != null) {
                            }
                            zzaneVar2 = r48;
                        } else {
                            str2 = str14;
                            zzandVar = zzandVar5;
                            zzanjVar = zzanjVar2;
                            i3 = i8;
                        }
                        zzandVar2 = zzandVar6;
                        zzaneVar = zzaneVar2;
                        i4 = i9;
                        String str182 = "image";
                        String str192 = "metadata";
                        String str202 = "region";
                        arrayDeque2 = arrayDeque3;
                        String str212 = "head";
                        if (!name.equals("tt") && !name.equals("head") && !name.equals(SDKConstants.PARAM_A2U_BODY) && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE) && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                            String name22 = newPullParser.getName();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(name22).length() + 26);
                            sb2.append(str15);
                            sb2.append(name22);
                            zzee.zzb("TtmlParser", sb2.toString());
                            zzandVar6 = zzandVar2;
                            str3 = str15;
                            zzaneVar2 = zzaneVar;
                            hashMap = hashMap5;
                            i9 = i4;
                            zzanjVar2 = zzanjVar;
                            arrayDeque = arrayDeque2;
                            i8 = 1;
                        }
                        if ("head".equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzfq.zzb(newPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                                    String zzc8 = zzfq.zzc(newPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
                                    zzani zzd3 = zzd(newPullParser, new zzani());
                                    if (zzc8 != null) {
                                        String[] zzc9 = zzc(zzc8);
                                        str3 = str15;
                                        int length = zzc9.length;
                                        zzandVar4 = zzandVar2;
                                        int i12 = 0;
                                        while (i12 < length) {
                                            int i13 = i12;
                                            zzd3.zzr((zzani) hashMap3.get(zzc9[i13]));
                                            i12 = i13 + 1;
                                        }
                                    } else {
                                        zzandVar4 = zzandVar2;
                                        str3 = str15;
                                    }
                                    String zzt = zzd3.zzt();
                                    if (zzt != null) {
                                        hashMap3.put(zzt, zzd3);
                                    }
                                    str8 = str212;
                                    str6 = str192;
                                    str7 = str202;
                                    hashMap = hashMap5;
                                } else {
                                    zzandVar4 = zzandVar2;
                                    str3 = str15;
                                    if (zzfq.zzb(newPullParser, str202)) {
                                        str7 = str202;
                                        String str25 = str212;
                                        String zzc10 = zzfq.zzc(newPullParser, "id");
                                        if (zzc10 == null) {
                                            zzangVar = r48;
                                            str11 = str182;
                                            hashMap2 = hashMap5;
                                            str12 = str192;
                                        } else {
                                            String zzc11 = zzfq.zzc(newPullParser, "origin");
                                            if (zzc11 == null) {
                                                str9 = zzc11;
                                                String zzc12 = zzfq.zzc(newPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
                                                if (zzc12 != null && (zzaniVar2 = (zzani) hashMap3.get(zzc12)) != null) {
                                                    str10 = zzaniVar2.zzL();
                                                    if (str10 == null) {
                                                        hashMap2 = hashMap5;
                                                        Matcher matcher3 = zzb.matcher(str10);
                                                        str11 = str182;
                                                        Matcher matcher4 = zzf.matcher(str10);
                                                        if (matcher3.matches()) {
                                                            str12 = str192;
                                                            try {
                                                                String group5 = matcher3.group(1);
                                                                if (group5 == null) {
                                                                    throw r48;
                                                                }
                                                                String str26 = group5;
                                                                f2 = Float.parseFloat(group5) / 100.0f;
                                                                String group6 = matcher3.group(2);
                                                                if (group6 == null) {
                                                                    throw r48;
                                                                }
                                                                String str27 = group6;
                                                                f = Float.parseFloat(group6) / 100.0f;
                                                            } catch (NumberFormatException unused4) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str10));
                                                            }
                                                        } else {
                                                            str12 = str192;
                                                            if (!matcher4.matches()) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(str10));
                                                            } else if (zzaneVar == null) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(str10));
                                                            } else {
                                                                try {
                                                                    String group7 = matcher4.group(1);
                                                                    if (group7 == null) {
                                                                        throw r48;
                                                                    }
                                                                    String str28 = group7;
                                                                    int parseInt5 = Integer.parseInt(group7);
                                                                    String group8 = matcher4.group(2);
                                                                    if (group8 == null) {
                                                                        throw r48;
                                                                    }
                                                                    String str29 = group8;
                                                                    f = Integer.parseInt(group8) / zzaneVar.zzb;
                                                                    f3 = parseInt5 / zzaneVar.zza;
                                                                    zzc3 = zzfq.zzc(newPullParser, "extent");
                                                                    if (zzc3 == null && (zzc6 = zzfq.zzc(newPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) != null && (zzaniVar = (zzani) hashMap3.get(zzc6)) != null) {
                                                                        zzc3 = zzaniVar.zzN();
                                                                    }
                                                                    if (zzc3 != null) {
                                                                        Matcher matcher5 = zzb.matcher(zzc3);
                                                                        Matcher matcher6 = zzf.matcher(zzc3);
                                                                        if (matcher5.matches()) {
                                                                            try {
                                                                                String group9 = matcher5.group(1);
                                                                                if (group9 == null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str30 = group9;
                                                                                float parseFloat = Float.parseFloat(group9) / 100.0f;
                                                                                String group10 = matcher5.group(2);
                                                                                if (group10 == null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str31 = group10;
                                                                                f4 = parseFloat;
                                                                                f5 = Float.parseFloat(group10) / 100.0f;
                                                                            } catch (NumberFormatException unused5) {
                                                                                String.valueOf(str10);
                                                                                zzee.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str10)));
                                                                            }
                                                                        } else if (!matcher6.matches()) {
                                                                            String.valueOf(str10);
                                                                            zzee.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(str10)));
                                                                        } else if (zzaneVar == null) {
                                                                            String.valueOf(str10);
                                                                            zzee.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(str10)));
                                                                        } else {
                                                                            try {
                                                                                String group11 = matcher6.group(1);
                                                                                if (group11 == null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str32 = group11;
                                                                                int parseInt6 = Integer.parseInt(group11);
                                                                                String group12 = matcher6.group(2);
                                                                                if (group12 == null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str33 = group12;
                                                                                f5 = Integer.parseInt(group12) / zzaneVar.zzb;
                                                                                f4 = parseInt6 / zzaneVar.zza;
                                                                            } catch (NumberFormatException unused6) {
                                                                                String.valueOf(str10);
                                                                                zzee.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str10)));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        f4 = 1.0f;
                                                                        f5 = 1.0f;
                                                                    }
                                                                    zzc4 = zzfq.zzc(newPullParser, "displayAlign");
                                                                    if (zzc4 != null) {
                                                                        String zza2 = zzgql.zza(zzc4);
                                                                        int hashCode = zza2.hashCode();
                                                                        if (hashCode != -1364013995) {
                                                                            if (hashCode == 92734940 && zza2.equals("after")) {
                                                                                c3 = 1;
                                                                                if (c3 != 0) {
                                                                                    f6 = f + (f5 / 2.0f);
                                                                                    i6 = 1;
                                                                                } else if (c3 == 1) {
                                                                                    f6 = f + f5;
                                                                                    i6 = 2;
                                                                                }
                                                                                float f8 = 1.0f / i4;
                                                                                zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                                                                if (zzc5 != null) {
                                                                                    String zza3 = zzgql.zza(zzc5);
                                                                                    int hashCode2 = zza3.hashCode();
                                                                                    if (hashCode2 == 3694) {
                                                                                        if (zza3.equals("tb")) {
                                                                                            c2 = 0;
                                                                                            if (c2 != 0) {
                                                                                            }
                                                                                            i7 = 2;
                                                                                            zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                        }
                                                                                        c2 = 65535;
                                                                                        if (c2 != 0) {
                                                                                        }
                                                                                        i7 = 2;
                                                                                        zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                    } else if (hashCode2 != 3553396) {
                                                                                        if (hashCode2 == 3553576 && zza3.equals("tbrl")) {
                                                                                            c2 = 2;
                                                                                            if (c2 != 0 || c2 == 1) {
                                                                                                i7 = 2;
                                                                                            } else if (c2 == 2) {
                                                                                                i7 = 1;
                                                                                            }
                                                                                            zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                        }
                                                                                        c2 = 65535;
                                                                                        if (c2 != 0) {
                                                                                        }
                                                                                        i7 = 2;
                                                                                        zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                    } else {
                                                                                        if (zza3.equals("tblr")) {
                                                                                            c2 = 1;
                                                                                            if (c2 != 0) {
                                                                                            }
                                                                                            i7 = 2;
                                                                                            zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                        }
                                                                                        c2 = 65535;
                                                                                        if (c2 != 0) {
                                                                                        }
                                                                                        i7 = 2;
                                                                                        zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                                    }
                                                                                }
                                                                                i7 = Integer.MIN_VALUE;
                                                                                zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f8, i7);
                                                                            }
                                                                            c3 = 65535;
                                                                            if (c3 != 0) {
                                                                            }
                                                                            float f82 = 1.0f / i4;
                                                                            zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                                                            if (zzc5 != null) {
                                                                            }
                                                                            i7 = Integer.MIN_VALUE;
                                                                            zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f82, i7);
                                                                        } else {
                                                                            if (zza2.equals("center")) {
                                                                                c3 = 0;
                                                                                if (c3 != 0) {
                                                                                }
                                                                                float f822 = 1.0f / i4;
                                                                                zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                                                                if (zzc5 != null) {
                                                                                }
                                                                                i7 = Integer.MIN_VALUE;
                                                                                zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f822, i7);
                                                                            }
                                                                            c3 = 65535;
                                                                            if (c3 != 0) {
                                                                            }
                                                                            float f8222 = 1.0f / i4;
                                                                            zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                                                            if (zzc5 != null) {
                                                                            }
                                                                            i7 = Integer.MIN_VALUE;
                                                                            zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f8222, i7);
                                                                        }
                                                                    }
                                                                    i6 = 0;
                                                                    f6 = f;
                                                                    float f82222 = 1.0f / i4;
                                                                    zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                                                    if (zzc5 != null) {
                                                                    }
                                                                    i7 = Integer.MIN_VALUE;
                                                                    zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f82222, i7);
                                                                } catch (NumberFormatException unused7) {
                                                                    zzee.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str10));
                                                                }
                                                            }
                                                        }
                                                        zzangVar = r48;
                                                    } else {
                                                        str11 = str182;
                                                        hashMap2 = hashMap5;
                                                        str12 = str192;
                                                        f = 0.0f;
                                                        f2 = 0.0f;
                                                    }
                                                    f3 = f2;
                                                    zzc3 = zzfq.zzc(newPullParser, "extent");
                                                    if (zzc3 == null) {
                                                        zzc3 = zzaniVar.zzN();
                                                    }
                                                    if (zzc3 != null) {
                                                    }
                                                    zzc4 = zzfq.zzc(newPullParser, "displayAlign");
                                                    if (zzc4 != null) {
                                                    }
                                                    i6 = 0;
                                                    f6 = f;
                                                    float f822222 = 1.0f / i4;
                                                    zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                                    if (zzc5 != null) {
                                                    }
                                                    i7 = Integer.MIN_VALUE;
                                                    zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f822222, i7);
                                                }
                                            } else {
                                                str9 = zzc11;
                                            }
                                            str10 = str9;
                                            if (str10 == null) {
                                            }
                                            f3 = f2;
                                            zzc3 = zzfq.zzc(newPullParser, "extent");
                                            if (zzc3 == null) {
                                            }
                                            if (zzc3 != null) {
                                            }
                                            zzc4 = zzfq.zzc(newPullParser, "displayAlign");
                                            if (zzc4 != null) {
                                            }
                                            i6 = 0;
                                            f6 = f;
                                            float f8222222 = 1.0f / i4;
                                            zzc5 = zzfq.zzc(newPullParser, "writingMode");
                                            if (zzc5 != null) {
                                            }
                                            i7 = Integer.MIN_VALUE;
                                            zzangVar = new zzang(zzc10, f3, f6, 0, i6, f4, f5, 1, f8222222, i7);
                                        }
                                        if (zzangVar != null) {
                                            hashMap4.put(zzangVar.zza, zzangVar);
                                        }
                                        str8 = str25;
                                        hashMap = hashMap2;
                                        str182 = str11;
                                        str6 = str12;
                                    } else {
                                        String str34 = str182;
                                        HashMap hashMap6 = hashMap5;
                                        String str35 = str212;
                                        str6 = str192;
                                        str7 = str202;
                                        if (zzfq.zzb(newPullParser, str6)) {
                                            while (true) {
                                                newPullParser.next();
                                                str182 = str34;
                                                if (!zzfq.zzb(newPullParser, str182) || (zzc2 = zzfq.zzc(newPullParser, "id")) == null) {
                                                    hashMap = hashMap6;
                                                } else {
                                                    hashMap = hashMap6;
                                                    hashMap.put(zzc2, newPullParser.nextText());
                                                }
                                                if (!zzfq.zza(newPullParser, str6)) {
                                                    str34 = str182;
                                                    hashMap6 = hashMap;
                                                }
                                            }
                                        } else {
                                            hashMap = hashMap6;
                                            str182 = str34;
                                        }
                                        str8 = str35;
                                    }
                                }
                                if (zzfq.zza(newPullParser, str8)) {
                                    zzandVar3 = zzandVar4;
                                    arrayDeque = arrayDeque2;
                                } else {
                                    str192 = str6;
                                    hashMap5 = hashMap;
                                    str202 = str7;
                                    str15 = str3;
                                    str212 = str8;
                                    zzandVar2 = zzandVar4;
                                }
                            }
                        } else {
                            zzand zzandVar8 = zzandVar2;
                            str3 = str15;
                            hashMap = hashMap5;
                            Object obj3 = "region";
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                zzd2 = zzd(newPullParser, r48);
                                int i14 = 0;
                                str4 = str;
                                j = -9223372036854775807L;
                                j2 = -9223372036854775807L;
                                j3 = -9223372036854775807L;
                                strArr = null;
                                str5 = null;
                                while (i14 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i14);
                                        String attributeValue6 = newPullParser.getAttributeValue(i14);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                obj = obj3;
                                                if (attributeName.equals(obj)) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    obj = obj3;
                                                    c = 2;
                                                    break;
                                                }
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    obj = obj3;
                                                    c = 1;
                                                    break;
                                                }
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    c = 0;
                                                    obj = obj3;
                                                    break;
                                                }
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                                                    obj = obj3;
                                                    c = 3;
                                                    break;
                                                }
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    obj = obj3;
                                                    c = 5;
                                                    break;
                                                }
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                            default:
                                                obj = obj3;
                                                c = 65535;
                                                break;
                                        }
                                        if (c != 0) {
                                            i5 = 1;
                                            if (c == 1) {
                                                zzandVar3 = zzandVar8;
                                                j = zzg(attributeValue6, zzandVar3);
                                            } else if (c != 2) {
                                                if (c == 3) {
                                                    i5 = 1;
                                                    String[] zzc13 = zzc(attributeValue6);
                                                    if (zzc13.length > 0) {
                                                        strArr = zzc13;
                                                    }
                                                } else if (c != 4) {
                                                    if (c == 5) {
                                                        try {
                                                            if (attributeValue6.startsWith("#")) {
                                                                i5 = 1;
                                                                try {
                                                                    str5 = attributeValue6.substring(1);
                                                                } catch (zzamb e) {
                                                                    e = e;
                                                                    zzandVar3 = zzandVar8;
                                                                    arrayDeque = arrayDeque2;
                                                                    zzee.zzd("TtmlParser", "Suppressing parser error", e);
                                                                    i8 = i5;
                                                                    zzaneVar2 = zzaneVar;
                                                                    zzandVar6 = zzandVar3;
                                                                    i9 = i4;
                                                                    zzanjVar2 = zzanjVar;
                                                                    newPullParser.next();
                                                                    eventType = newPullParser.getEventType();
                                                                    hashMap5 = hashMap;
                                                                    str13 = str;
                                                                    zzandVar5 = zzandVar;
                                                                    str14 = str2;
                                                                    obj2 = null;
                                                                    arrayDeque3 = arrayDeque;
                                                                    str15 = str3;
                                                                }
                                                            }
                                                        } catch (zzamb e2) {
                                                            e = e2;
                                                            i5 = 1;
                                                        }
                                                    }
                                                    i5 = 1;
                                                } else {
                                                    i5 = 1;
                                                    if (hashMap4.containsKey(attributeValue6)) {
                                                        str4 = attributeValue6;
                                                    }
                                                }
                                                zzandVar3 = zzandVar8;
                                            } else {
                                                zzandVar3 = zzandVar8;
                                                i5 = 1;
                                                try {
                                                    j3 = zzg(attributeValue6, zzandVar3);
                                                } catch (zzamb e3) {
                                                    e = e3;
                                                    arrayDeque = arrayDeque2;
                                                    zzee.zzd("TtmlParser", "Suppressing parser error", e);
                                                    i8 = i5;
                                                    zzaneVar2 = zzaneVar;
                                                    zzandVar6 = zzandVar3;
                                                    i9 = i4;
                                                    zzanjVar2 = zzanjVar;
                                                    newPullParser.next();
                                                    eventType = newPullParser.getEventType();
                                                    hashMap5 = hashMap;
                                                    str13 = str;
                                                    zzandVar5 = zzandVar;
                                                    str14 = str2;
                                                    obj2 = null;
                                                    arrayDeque3 = arrayDeque;
                                                    str15 = str3;
                                                }
                                            }
                                        } else {
                                            zzandVar3 = zzandVar8;
                                            i5 = 1;
                                            j2 = zzg(attributeValue6, zzandVar3);
                                        }
                                        i14++;
                                        obj3 = obj;
                                        zzandVar8 = zzandVar3;
                                    } catch (zzamb e4) {
                                        e = e4;
                                        zzandVar3 = zzandVar8;
                                        i5 = 1;
                                    }
                                }
                                zzandVar3 = zzandVar8;
                                i5 = 1;
                                if (zzancVar3 != null) {
                                    zzancVar = zzancVar3;
                                    long j7 = zzancVar.zzd;
                                    if (j7 != -9223372036854775807L) {
                                        j2 = j2 != -9223372036854775807L ? j2 + j7 : -9223372036854775807L;
                                        if (j != -9223372036854775807L) {
                                            j += j7;
                                        } else {
                                            zzancVar2 = zzancVar;
                                            j = -9223372036854775807L;
                                        }
                                    }
                                    zzancVar2 = zzancVar;
                                } else {
                                    zzancVar = zzancVar3;
                                    zzancVar2 = null;
                                }
                            } catch (zzamb e5) {
                                e = e5;
                                zzandVar3 = zzandVar8;
                                arrayDeque = arrayDeque2;
                                i5 = 1;
                            }
                            try {
                                if (j == -9223372036854775807L) {
                                    if (j3 != -9223372036854775807L) {
                                        j6 = j2 + j3;
                                    } else {
                                        if (zzancVar2 != null) {
                                            j6 = zzancVar2.zze;
                                            if (j6 != -9223372036854775807L) {
                                            }
                                        }
                                        j5 = j2;
                                        j4 = -9223372036854775807L;
                                        zzanc zzb2 = zzanc.zzb(newPullParser.getName(), j5, j4, zzd2, strArr, str4, str5, zzancVar2);
                                        arrayDeque = arrayDeque2;
                                        arrayDeque.push(zzb2);
                                        if (zzancVar != null) {
                                            zzancVar.zzd(zzb2);
                                        }
                                    }
                                    j4 = j6;
                                } else {
                                    j4 = j;
                                }
                                arrayDeque.push(zzb2);
                                if (zzancVar != null) {
                                }
                            } catch (zzamb e6) {
                                e = e6;
                                zzee.zzd("TtmlParser", "Suppressing parser error", e);
                                i8 = i5;
                                zzaneVar2 = zzaneVar;
                                zzandVar6 = zzandVar3;
                                i9 = i4;
                                zzanjVar2 = zzanjVar;
                                newPullParser.next();
                                eventType = newPullParser.getEventType();
                                hashMap5 = hashMap;
                                str13 = str;
                                zzandVar5 = zzandVar;
                                str14 = str2;
                                obj2 = null;
                                arrayDeque3 = arrayDeque;
                                str15 = str3;
                            }
                            j5 = j2;
                            zzanc zzb22 = zzanc.zzb(newPullParser.getName(), j5, j4, zzd2, strArr, str4, str5, zzancVar2);
                            arrayDeque = arrayDeque2;
                        }
                        zzaneVar2 = zzaneVar;
                        zzandVar6 = zzandVar3;
                        i9 = i4;
                    } else {
                        str2 = str14;
                        str3 = str15;
                        arrayDeque = arrayDeque3;
                        zzandVar = zzandVar5;
                        zzanjVar = zzanjVar2;
                        i3 = i8;
                        hashMap = hashMap5;
                        if (eventType == 4) {
                            if (zzancVar3 == null) {
                                throw null;
                            }
                            zzanc zzancVar4 = zzancVar3;
                            zzancVar3.zzd(zzanc.zza(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                zzanc zzancVar5 = (zzanc) arrayDeque.peek();
                                if (zzancVar5 == null) {
                                    throw null;
                                }
                                zzanc zzancVar6 = zzancVar5;
                                zzanjVar2 = new zzanj(zzancVar5, hashMap3, hashMap4, hashMap);
                            } else {
                                zzanjVar2 = zzanjVar;
                            }
                            arrayDeque.pop();
                            i8 = i3;
                        }
                    }
                    zzanjVar2 = zzanjVar;
                    i8 = i3;
                } else {
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    arrayDeque = arrayDeque3;
                    zzandVar = zzandVar5;
                    zzanjVar = zzanjVar2;
                    i3 = i8;
                    hashMap = hashMap5;
                    if (eventType == 2) {
                        i8 = i3 + 1;
                    } else {
                        if (eventType == 3) {
                            i8 = i3 - 1;
                        }
                        zzanjVar2 = zzanjVar;
                        i8 = i3;
                    }
                    zzanjVar2 = zzanjVar;
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                hashMap5 = hashMap;
                str13 = str;
                zzandVar5 = zzandVar;
                str14 = str2;
                obj2 = null;
                arrayDeque3 = arrayDeque;
                str15 = str3;
            }
            zzanj zzanjVar3 = zzanjVar2;
            if (zzanjVar3 != null) {
                return zzanjVar3;
            }
            throw null;
        } catch (IOException e7) {
            throw new IllegalStateException("Unexpected error when reading input.", e7);
        } catch (XmlPullParserException e8) {
            throw new IllegalStateException("Unable to decode source", e8);
        }
    }

    public zzanf() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
