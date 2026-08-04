package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.window.reflection.WindowExtensionsConstants;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.util.UriUtil;
import com.facebook.react.uimanager.ViewProps;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzakv implements zzajv {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzakt zzh = new zzakt(30.0f, 1, 1);

    private static String[] zzc(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzeo.zza;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0295, code lost:
    
        if (r3.equals("text") != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a9, code lost:
    
        r0 = zze(r0);
        r0.zzu(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x029e, code lost:
    
        if (r3.equals(com.facebook.hermes.intl.Constants.SENSITIVITY_BASE) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02da, code lost:
    
        r0 = zze(r0);
        r0.zzu(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a7, code lost:
    
        if (r3.equals("textContainer") != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d8, code lost:
    
        if (r3.equals("baseContainer") != false) goto L126;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132 A[Catch: zzajr -> 0x01a2, TryCatch #0 {zzajr -> 0x01a2, blocks: (B:33:0x00b8, B:35:0x00d4, B:36:0x00ea, B:38:0x00f0, B:40:0x00f6, B:49:0x0111, B:50:0x012c, B:52:0x0132, B:54:0x013e, B:57:0x013f, B:58:0x015c, B:62:0x011d, B:66:0x0129, B:69:0x015d, B:71:0x015e, B:72:0x017f, B:74:0x00dd, B:76:0x0180, B:77:0x01a1), top: B:32:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzaky zzd(XmlPullParser xmlPullParser, zzaky zzakyVar) {
        Matcher matcher;
        String group;
        int attributeCount = xmlPullParser.getAttributeCount();
        zzaky zzakyVar2 = zzakyVar;
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(ViewProps.FONT_STYLE)) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzg("italic".equalsIgnoreCase(attributeValue));
                        continue;
                    }
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzM(attributeValue);
                    } else {
                        continue;
                    }
                case -1224696685:
                    if (attributeName.equals(ViewProps.FONT_FAMILY)) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzi(attributeValue);
                    } else {
                        continue;
                    }
                case -1065511464:
                    if (attributeName.equals(ViewProps.TEXT_ALIGN)) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzz(zzf(attributeValue));
                    } else {
                        continue;
                    }
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzK(attributeValue);
                    } else {
                        continue;
                    }
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        String zza2 = zzggj.zza(attributeValue);
                        switch (zza2.hashCode()) {
                            case -1461280213:
                                if (zza2.equals("nounderline")) {
                                    zzakyVar2 = zze(zzakyVar2);
                                    zzakyVar2.zze(false);
                                    break;
                                }
                                break;
                            case -1026963764:
                                if (zza2.equals("underline")) {
                                    zzakyVar2 = zze(zzakyVar2);
                                    zzakyVar2.zze(true);
                                    break;
                                }
                                break;
                            case 913457136:
                                if (zza2.equals("nolinethrough")) {
                                    zzakyVar2 = zze(zzakyVar2);
                                    zzakyVar2.zzc(false);
                                    break;
                                }
                                break;
                            case 1679736913:
                                if (zza2.equals("linethrough")) {
                                    zzakyVar2 = zze(zzakyVar2);
                                    zzakyVar2.zzc(true);
                                    break;
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals(ViewProps.FONT_WEIGHT)) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzf("bold".equalsIgnoreCase(attributeValue));
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && "style".equals(xmlPullParser.getName())) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzs(attributeValue);
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        String zza3 = zzggj.zza(attributeValue);
                        switch (zza3.hashCode()) {
                            case -618561360:
                                break;
                            case -410956671:
                                if (zza3.equals("container")) {
                                    zzakyVar2 = zze(zzakyVar2);
                                    zzakyVar2.zzu(1);
                                    break;
                                }
                                break;
                            case -250518009:
                                if (zza3.equals("delimiter")) {
                                    zzakyVar2 = zze(zzakyVar2);
                                    zzakyVar2.zzu(4);
                                    break;
                                }
                                break;
                            case -136074796:
                                break;
                            case 3016401:
                                break;
                            case 3556653:
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        zzakyVar2 = zze(zzakyVar2);
                        try {
                            zzakyVar2.zzk(zzdd.zza(attributeValue));
                            break;
                        } catch (IllegalArgumentException unused) {
                            String.valueOf(attributeValue);
                            zzds.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                            break;
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        zzaky zze2 = zze(zzakyVar2);
                        Matcher matcher2 = zza.matcher(attributeValue);
                        float f = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(1);
                                if (group2 == null) {
                                    throw null;
                                    break;
                                } else {
                                    String str = group2;
                                    f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group2)));
                                }
                            } catch (NumberFormatException e) {
                                String.valueOf(attributeValue);
                                zzds.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                            }
                        } else {
                            String.valueOf(attributeValue);
                            zzds.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                        }
                        zze2.zzp(f);
                        zzakyVar2 = zze2;
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String zza4 = zzggj.zza(attributeValue);
                        int hashCode = zza4.hashCode();
                        if (hashCode == 96673) {
                            if (zza4.equals("all")) {
                                zzakyVar2 = zze(zzakyVar2);
                                zzakyVar2.zzD(true);
                                break;
                            }
                        } else if (hashCode == 3387192 && zza4.equals(ViewProps.NONE)) {
                            zzakyVar2 = zze(zzakyVar2);
                            zzakyVar2.zzD(false);
                        }
                    }
                    break;
                case 365601008:
                    if (attributeName.equals(ViewProps.FONT_SIZE)) {
                        try {
                            zzakyVar2 = zze(zzakyVar2);
                            String str2 = zzeo.zza;
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
                                    throw new zzajr(sb.toString());
                                }
                                matcher = zze.matcher(split[1]);
                                zzds.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(attributeValue).length() + 36);
                                sb2.append("Invalid expression for fontSize: '");
                                sb2.append(attributeValue);
                                sb2.append("'.");
                                throw new zzajr(sb2.toString());
                            }
                            String group3 = matcher.group(3);
                            if (group3 == null) {
                                throw null;
                            }
                            String str3 = group3;
                            int hashCode2 = group3.hashCode();
                            if (hashCode2 != 37) {
                                if (hashCode2 != 3240) {
                                    if (hashCode2 == 3592 && group3.equals("px")) {
                                        zzakyVar2.zzH(1);
                                        group = matcher.group(1);
                                        if (group == null) {
                                            throw null;
                                        }
                                        String str4 = group;
                                        zzakyVar2.zzG(Float.parseFloat(group));
                                        break;
                                    }
                                    StringBuilder sb3 = new StringBuilder(group3.length() + 30);
                                    sb3.append("Invalid unit for fontSize: '");
                                    sb3.append(group3);
                                    sb3.append("'.");
                                    throw new zzajr(sb3.toString());
                                }
                                if (!group3.equals("em")) {
                                    StringBuilder sb32 = new StringBuilder(group3.length() + 30);
                                    sb32.append("Invalid unit for fontSize: '");
                                    sb32.append(group3);
                                    sb32.append("'.");
                                    throw new zzajr(sb32.toString());
                                }
                                zzakyVar2.zzH(2);
                                group = matcher.group(1);
                                if (group == null) {
                                }
                            } else {
                                if (!group3.equals("%")) {
                                    StringBuilder sb322 = new StringBuilder(group3.length() + 30);
                                    sb322.append("Invalid unit for fontSize: '");
                                    sb322.append(group3);
                                    sb322.append("'.");
                                    throw new zzajr(sb322.toString());
                                }
                                zzakyVar2.zzH(3);
                                group = matcher.group(1);
                                if (group == null) {
                                }
                            }
                        } catch (zzajr unused2) {
                            String.valueOf(attributeValue);
                            zzds.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                            break;
                        }
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzF(zzakr.zza(attributeValue));
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String zza5 = zzggj.zza(attributeValue);
                        int hashCode3 = zza5.hashCode();
                        if (hashCode3 != -1392885889) {
                            if (hashCode3 == 92734940 && zza5.equals("after")) {
                                zzakyVar2 = zze(zzakyVar2);
                                zzakyVar2.zzw(2);
                                break;
                            }
                        } else if (zza5.equals("before")) {
                            zzakyVar2 = zze(zzakyVar2);
                            zzakyVar2.zzw(1);
                            break;
                        }
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals(ViewProps.BACKGROUND_COLOR)) {
                        zzakyVar2 = zze(zzakyVar2);
                        try {
                            zzakyVar2.zzn(zzdd.zza(attributeValue));
                            break;
                        } catch (IllegalArgumentException unused3) {
                            String.valueOf(attributeValue);
                            zzds.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                            break;
                        }
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        zzakyVar2 = zze(zzakyVar2);
                        zzakyVar2.zzB(zzf(attributeValue));
                        break;
                    }
                    break;
            }
        }
        return zzakyVar2;
    }

    private static zzaky zze(zzaky zzakyVar) {
        return zzakyVar == null ? new zzaky() : zzakyVar;
    }

    private static Layout.Alignment zzf(String str) {
        String zza2 = zzggj.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!zza2.equals(ViewProps.END)) {
                    return null;
                }
                break;
            case 3317767:
                if (!zza2.equals(ViewProps.LEFT)) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!zza2.equals(ViewProps.RIGHT)) {
                    return null;
                }
                break;
            case 109757538:
                if (!zza2.equals(ViewProps.START)) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static long zzg(String str, zzakt zzaktVar) throws zzajr {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
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
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d4 = d3 + parseLong3;
            return (long) ((d4 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r12) / zzaktVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r12) / zzaktVar.zzb) / zzaktVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            String.valueOf(str);
            throw new zzajr("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                d = zzaktVar.zza;
                parseDouble2 /= d;
            }
            return (long) (parseDouble2 * 1000000.0d);
        }
        if (hashCode != 104) {
            if (hashCode != 109) {
                if (hashCode != 3494) {
                    if (hashCode == 115) {
                        group6.equals("s");
                    } else if (hashCode == 116 && group6.equals("t")) {
                        d = zzaktVar.zzc;
                        parseDouble2 /= d;
                    }
                } else if (group6.equals("ms")) {
                    d = 1000.0d;
                    parseDouble2 /= d;
                }
            } else if (group6.equals("m")) {
                d2 = 60.0d;
                parseDouble2 *= d2;
            }
        } else if (group6.equals("h")) {
            d2 = 3600.0d;
            parseDouble2 *= d2;
        }
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i2, zzaju zzajuVar, zzdf zzdfVar) {
        zzajp.zza(zzb(bArr, i, i2), zzajuVar, zzdfVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:240|(2:241|242)|(3:244|245|71)|289|290|(3:292|(4:294|(1:296)(1:320)|297|(1:299)(1:300))|321)(1:322)|301|(2:303|(1:305)(7:(2:307|(1:309))|310|311|312|313|314|(1:316)))|319|311|312|313|314|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:352|(1:(6:355|356|357|33|(2:325|(1:327)(4:328|329|330|(2:332|(1:334)(2:335|336))(2:337|338)))|35)(1:360))(1:362)|361|356|357|33|(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04ea, code lost:
    
        if (r0.equals("tblr") != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04f5, code lost:
    
        r40 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04f3, code lost:
    
        if (r0.equals("tb") != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06aa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:245:0x05a1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030a A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:17:0x0092, B:19:0x009c, B:22:0x00b2, B:23:0x00cd, B:25:0x00d7, B:26:0x00db, B:28:0x00e7, B:29:0x00eb, B:33:0x0164, B:36:0x01bd, B:39:0x01d7, B:41:0x01dd, B:43:0x01e5, B:45:0x01ed, B:47:0x01f5, B:49:0x01fd, B:51:0x0205, B:53:0x020b, B:55:0x0213, B:57:0x021b, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:68:0x023e, B:71:0x072a, B:72:0x026b, B:74:0x0271, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02b2, B:87:0x0558, B:97:0x02bb, B:100:0x02c7, B:104:0x0509, B:107:0x02e5, B:109:0x02ed, B:111:0x02f5, B:113:0x02fd, B:116:0x030a, B:120:0x0323, B:122:0x0329, B:124:0x0339, B:125:0x03aa, B:127:0x03b0, B:129:0x03b6, B:131:0x03be, B:133:0x03c4, B:137:0x03d7, B:139:0x03dd, B:141:0x03ed, B:142:0x0477, B:144:0x047f, B:153:0x04ba, B:155:0x04c2, B:165:0x04fc, B:177:0x03fc, B:180:0x03fd, B:181:0x03fe, B:183:0x040d, B:186:0x0415, B:189:0x0426, B:191:0x042c, B:193:0x043a, B:195:0x0451, B:197:0x0452, B:198:0x0453, B:199:0x0463, B:202:0x0345, B:204:0x0346, B:205:0x0347, B:206:0x034f, B:209:0x0359, B:212:0x0362, B:214:0x0368, B:216:0x0376, B:218:0x038b, B:220:0x038c, B:221:0x038d, B:222:0x0395, B:226:0x051c, B:228:0x0529, B:230:0x0534, B:232:0x053a, B:233:0x0546, B:242:0x0572, B:244:0x0595, B:248:0x063e, B:260:0x05bc, B:263:0x05c5, B:254:0x06b1, B:271:0x05dc, B:277:0x05f8, B:280:0x060e, B:283:0x0622, B:286:0x0636, B:292:0x064f, B:296:0x065b, B:299:0x0664, B:305:0x0679, B:307:0x067e, B:311:0x068e, B:314:0x069a, B:316:0x069f, B:325:0x0171, B:327:0x017d, B:330:0x0186, B:332:0x018c, B:334:0x019a, B:336:0x01a9, B:338:0x01aa, B:339:0x01ab, B:340:0x0104, B:342:0x0110, B:345:0x011a, B:347:0x0120, B:350:0x012b, B:352:0x0131, B:357:0x0148, B:359:0x015c, B:365:0x0152, B:371:0x0157, B:381:0x06d3, B:384:0x06e3, B:387:0x06e7, B:389:0x06f1, B:391:0x06fb, B:392:0x0706, B:395:0x0703, B:399:0x071b, B:404:0x0723, B:408:0x0744, B:411:0x074a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c4 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:17:0x0092, B:19:0x009c, B:22:0x00b2, B:23:0x00cd, B:25:0x00d7, B:26:0x00db, B:28:0x00e7, B:29:0x00eb, B:33:0x0164, B:36:0x01bd, B:39:0x01d7, B:41:0x01dd, B:43:0x01e5, B:45:0x01ed, B:47:0x01f5, B:49:0x01fd, B:51:0x0205, B:53:0x020b, B:55:0x0213, B:57:0x021b, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:68:0x023e, B:71:0x072a, B:72:0x026b, B:74:0x0271, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02b2, B:87:0x0558, B:97:0x02bb, B:100:0x02c7, B:104:0x0509, B:107:0x02e5, B:109:0x02ed, B:111:0x02f5, B:113:0x02fd, B:116:0x030a, B:120:0x0323, B:122:0x0329, B:124:0x0339, B:125:0x03aa, B:127:0x03b0, B:129:0x03b6, B:131:0x03be, B:133:0x03c4, B:137:0x03d7, B:139:0x03dd, B:141:0x03ed, B:142:0x0477, B:144:0x047f, B:153:0x04ba, B:155:0x04c2, B:165:0x04fc, B:177:0x03fc, B:180:0x03fd, B:181:0x03fe, B:183:0x040d, B:186:0x0415, B:189:0x0426, B:191:0x042c, B:193:0x043a, B:195:0x0451, B:197:0x0452, B:198:0x0453, B:199:0x0463, B:202:0x0345, B:204:0x0346, B:205:0x0347, B:206:0x034f, B:209:0x0359, B:212:0x0362, B:214:0x0368, B:216:0x0376, B:218:0x038b, B:220:0x038c, B:221:0x038d, B:222:0x0395, B:226:0x051c, B:228:0x0529, B:230:0x0534, B:232:0x053a, B:233:0x0546, B:242:0x0572, B:244:0x0595, B:248:0x063e, B:260:0x05bc, B:263:0x05c5, B:254:0x06b1, B:271:0x05dc, B:277:0x05f8, B:280:0x060e, B:283:0x0622, B:286:0x0636, B:292:0x064f, B:296:0x065b, B:299:0x0664, B:305:0x0679, B:307:0x067e, B:311:0x068e, B:314:0x069a, B:316:0x069f, B:325:0x0171, B:327:0x017d, B:330:0x0186, B:332:0x018c, B:334:0x019a, B:336:0x01a9, B:338:0x01aa, B:339:0x01ab, B:340:0x0104, B:342:0x0110, B:345:0x011a, B:347:0x0120, B:350:0x012b, B:352:0x0131, B:357:0x0148, B:359:0x015c, B:365:0x0152, B:371:0x0157, B:381:0x06d3, B:384:0x06e3, B:387:0x06e7, B:389:0x06f1, B:391:0x06fb, B:392:0x0706, B:395:0x0703, B:399:0x071b, B:404:0x0723, B:408:0x0744, B:411:0x074a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x047f A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:17:0x0092, B:19:0x009c, B:22:0x00b2, B:23:0x00cd, B:25:0x00d7, B:26:0x00db, B:28:0x00e7, B:29:0x00eb, B:33:0x0164, B:36:0x01bd, B:39:0x01d7, B:41:0x01dd, B:43:0x01e5, B:45:0x01ed, B:47:0x01f5, B:49:0x01fd, B:51:0x0205, B:53:0x020b, B:55:0x0213, B:57:0x021b, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:68:0x023e, B:71:0x072a, B:72:0x026b, B:74:0x0271, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02b2, B:87:0x0558, B:97:0x02bb, B:100:0x02c7, B:104:0x0509, B:107:0x02e5, B:109:0x02ed, B:111:0x02f5, B:113:0x02fd, B:116:0x030a, B:120:0x0323, B:122:0x0329, B:124:0x0339, B:125:0x03aa, B:127:0x03b0, B:129:0x03b6, B:131:0x03be, B:133:0x03c4, B:137:0x03d7, B:139:0x03dd, B:141:0x03ed, B:142:0x0477, B:144:0x047f, B:153:0x04ba, B:155:0x04c2, B:165:0x04fc, B:177:0x03fc, B:180:0x03fd, B:181:0x03fe, B:183:0x040d, B:186:0x0415, B:189:0x0426, B:191:0x042c, B:193:0x043a, B:195:0x0451, B:197:0x0452, B:198:0x0453, B:199:0x0463, B:202:0x0345, B:204:0x0346, B:205:0x0347, B:206:0x034f, B:209:0x0359, B:212:0x0362, B:214:0x0368, B:216:0x0376, B:218:0x038b, B:220:0x038c, B:221:0x038d, B:222:0x0395, B:226:0x051c, B:228:0x0529, B:230:0x0534, B:232:0x053a, B:233:0x0546, B:242:0x0572, B:244:0x0595, B:248:0x063e, B:260:0x05bc, B:263:0x05c5, B:254:0x06b1, B:271:0x05dc, B:277:0x05f8, B:280:0x060e, B:283:0x0622, B:286:0x0636, B:292:0x064f, B:296:0x065b, B:299:0x0664, B:305:0x0679, B:307:0x067e, B:311:0x068e, B:314:0x069a, B:316:0x069f, B:325:0x0171, B:327:0x017d, B:330:0x0186, B:332:0x018c, B:334:0x019a, B:336:0x01a9, B:338:0x01aa, B:339:0x01ab, B:340:0x0104, B:342:0x0110, B:345:0x011a, B:347:0x0120, B:350:0x012b, B:352:0x0131, B:357:0x0148, B:359:0x015c, B:365:0x0152, B:371:0x0157, B:381:0x06d3, B:384:0x06e3, B:387:0x06e7, B:389:0x06f1, B:391:0x06fb, B:392:0x0706, B:395:0x0703, B:399:0x071b, B:404:0x0723, B:408:0x0744, B:411:0x074a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c2 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:17:0x0092, B:19:0x009c, B:22:0x00b2, B:23:0x00cd, B:25:0x00d7, B:26:0x00db, B:28:0x00e7, B:29:0x00eb, B:33:0x0164, B:36:0x01bd, B:39:0x01d7, B:41:0x01dd, B:43:0x01e5, B:45:0x01ed, B:47:0x01f5, B:49:0x01fd, B:51:0x0205, B:53:0x020b, B:55:0x0213, B:57:0x021b, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:68:0x023e, B:71:0x072a, B:72:0x026b, B:74:0x0271, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02b2, B:87:0x0558, B:97:0x02bb, B:100:0x02c7, B:104:0x0509, B:107:0x02e5, B:109:0x02ed, B:111:0x02f5, B:113:0x02fd, B:116:0x030a, B:120:0x0323, B:122:0x0329, B:124:0x0339, B:125:0x03aa, B:127:0x03b0, B:129:0x03b6, B:131:0x03be, B:133:0x03c4, B:137:0x03d7, B:139:0x03dd, B:141:0x03ed, B:142:0x0477, B:144:0x047f, B:153:0x04ba, B:155:0x04c2, B:165:0x04fc, B:177:0x03fc, B:180:0x03fd, B:181:0x03fe, B:183:0x040d, B:186:0x0415, B:189:0x0426, B:191:0x042c, B:193:0x043a, B:195:0x0451, B:197:0x0452, B:198:0x0453, B:199:0x0463, B:202:0x0345, B:204:0x0346, B:205:0x0347, B:206:0x034f, B:209:0x0359, B:212:0x0362, B:214:0x0368, B:216:0x0376, B:218:0x038b, B:220:0x038c, B:221:0x038d, B:222:0x0395, B:226:0x051c, B:228:0x0529, B:230:0x0534, B:232:0x053a, B:233:0x0546, B:242:0x0572, B:244:0x0595, B:248:0x063e, B:260:0x05bc, B:263:0x05c5, B:254:0x06b1, B:271:0x05dc, B:277:0x05f8, B:280:0x060e, B:283:0x0622, B:286:0x0636, B:292:0x064f, B:296:0x065b, B:299:0x0664, B:305:0x0679, B:307:0x067e, B:311:0x068e, B:314:0x069a, B:316:0x069f, B:325:0x0171, B:327:0x017d, B:330:0x0186, B:332:0x018c, B:334:0x019a, B:336:0x01a9, B:338:0x01aa, B:339:0x01ab, B:340:0x0104, B:342:0x0110, B:345:0x011a, B:347:0x0120, B:350:0x012b, B:352:0x0131, B:357:0x0148, B:359:0x015c, B:365:0x0152, B:371:0x0157, B:381:0x06d3, B:384:0x06e3, B:387:0x06e7, B:389:0x06f1, B:391:0x06fb, B:392:0x0706, B:395:0x0703, B:399:0x071b, B:404:0x0723, B:408:0x0744, B:411:0x074a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x069f A[Catch: zzajr -> 0x06aa, IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #9 {zzajr -> 0x06aa, blocks: (B:314:0x069a, B:316:0x069f), top: B:313:0x069a }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0171 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:17:0x0092, B:19:0x009c, B:22:0x00b2, B:23:0x00cd, B:25:0x00d7, B:26:0x00db, B:28:0x00e7, B:29:0x00eb, B:33:0x0164, B:36:0x01bd, B:39:0x01d7, B:41:0x01dd, B:43:0x01e5, B:45:0x01ed, B:47:0x01f5, B:49:0x01fd, B:51:0x0205, B:53:0x020b, B:55:0x0213, B:57:0x021b, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:68:0x023e, B:71:0x072a, B:72:0x026b, B:74:0x0271, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02b2, B:87:0x0558, B:97:0x02bb, B:100:0x02c7, B:104:0x0509, B:107:0x02e5, B:109:0x02ed, B:111:0x02f5, B:113:0x02fd, B:116:0x030a, B:120:0x0323, B:122:0x0329, B:124:0x0339, B:125:0x03aa, B:127:0x03b0, B:129:0x03b6, B:131:0x03be, B:133:0x03c4, B:137:0x03d7, B:139:0x03dd, B:141:0x03ed, B:142:0x0477, B:144:0x047f, B:153:0x04ba, B:155:0x04c2, B:165:0x04fc, B:177:0x03fc, B:180:0x03fd, B:181:0x03fe, B:183:0x040d, B:186:0x0415, B:189:0x0426, B:191:0x042c, B:193:0x043a, B:195:0x0451, B:197:0x0452, B:198:0x0453, B:199:0x0463, B:202:0x0345, B:204:0x0346, B:205:0x0347, B:206:0x034f, B:209:0x0359, B:212:0x0362, B:214:0x0368, B:216:0x0376, B:218:0x038b, B:220:0x038c, B:221:0x038d, B:222:0x0395, B:226:0x051c, B:228:0x0529, B:230:0x0534, B:232:0x053a, B:233:0x0546, B:242:0x0572, B:244:0x0595, B:248:0x063e, B:260:0x05bc, B:263:0x05c5, B:254:0x06b1, B:271:0x05dc, B:277:0x05f8, B:280:0x060e, B:283:0x0622, B:286:0x0636, B:292:0x064f, B:296:0x065b, B:299:0x0664, B:305:0x0679, B:307:0x067e, B:311:0x068e, B:314:0x069a, B:316:0x069f, B:325:0x0171, B:327:0x017d, B:330:0x0186, B:332:0x018c, B:334:0x019a, B:336:0x01a9, B:338:0x01aa, B:339:0x01ab, B:340:0x0104, B:342:0x0110, B:345:0x011a, B:347:0x0120, B:350:0x012b, B:352:0x0131, B:357:0x0148, B:359:0x015c, B:365:0x0152, B:371:0x0157, B:381:0x06d3, B:384:0x06e3, B:387:0x06e7, B:389:0x06f1, B:391:0x06fb, B:392:0x0706, B:395:0x0703, B:399:0x071b, B:404:0x0723, B:408:0x0744, B:411:0x074a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d7 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_ENTER, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:17:0x0092, B:19:0x009c, B:22:0x00b2, B:23:0x00cd, B:25:0x00d7, B:26:0x00db, B:28:0x00e7, B:29:0x00eb, B:33:0x0164, B:36:0x01bd, B:39:0x01d7, B:41:0x01dd, B:43:0x01e5, B:45:0x01ed, B:47:0x01f5, B:49:0x01fd, B:51:0x0205, B:53:0x020b, B:55:0x0213, B:57:0x021b, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:68:0x023e, B:71:0x072a, B:72:0x026b, B:74:0x0271, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02b2, B:87:0x0558, B:97:0x02bb, B:100:0x02c7, B:104:0x0509, B:107:0x02e5, B:109:0x02ed, B:111:0x02f5, B:113:0x02fd, B:116:0x030a, B:120:0x0323, B:122:0x0329, B:124:0x0339, B:125:0x03aa, B:127:0x03b0, B:129:0x03b6, B:131:0x03be, B:133:0x03c4, B:137:0x03d7, B:139:0x03dd, B:141:0x03ed, B:142:0x0477, B:144:0x047f, B:153:0x04ba, B:155:0x04c2, B:165:0x04fc, B:177:0x03fc, B:180:0x03fd, B:181:0x03fe, B:183:0x040d, B:186:0x0415, B:189:0x0426, B:191:0x042c, B:193:0x043a, B:195:0x0451, B:197:0x0452, B:198:0x0453, B:199:0x0463, B:202:0x0345, B:204:0x0346, B:205:0x0347, B:206:0x034f, B:209:0x0359, B:212:0x0362, B:214:0x0368, B:216:0x0376, B:218:0x038b, B:220:0x038c, B:221:0x038d, B:222:0x0395, B:226:0x051c, B:228:0x0529, B:230:0x0534, B:232:0x053a, B:233:0x0546, B:242:0x0572, B:244:0x0595, B:248:0x063e, B:260:0x05bc, B:263:0x05c5, B:254:0x06b1, B:271:0x05dc, B:277:0x05f8, B:280:0x060e, B:283:0x0622, B:286:0x0636, B:292:0x064f, B:296:0x065b, B:299:0x0664, B:305:0x0679, B:307:0x067e, B:311:0x068e, B:314:0x069a, B:316:0x069f, B:325:0x0171, B:327:0x017d, B:330:0x0186, B:332:0x018c, B:334:0x019a, B:336:0x01a9, B:338:0x01aa, B:339:0x01ab, B:340:0x0104, B:342:0x0110, B:345:0x011a, B:347:0x0120, B:350:0x012b, B:352:0x0131, B:357:0x0148, B:359:0x015c, B:365:0x0152, B:371:0x0157, B:381:0x06d3, B:384:0x06e3, B:387:0x06e7, B:389:0x06f1, B:391:0x06fb, B:392:0x0706, B:395:0x0703, B:399:0x071b, B:404:0x0723, B:408:0x0744, B:411:0x074a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0271 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, LOOP:1: B:74:0x0271->B:89:0x0564, LOOP_START, PHI: r1 r3 r7 r8 r13 r14 r15
      0x0271: PHI (r1v20 java.lang.String) = (r1v11 java.lang.String), (r1v55 java.lang.String) binds: [B:73:0x026f, B:89:0x0564] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r3v27 java.lang.String) = (r3v1 java.lang.String), (r3v51 java.lang.String) binds: [B:73:0x026f, B:89:0x0564] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r7v6 java.util.HashMap) = (r7v1 java.util.HashMap), (r7v35 java.util.HashMap) binds: [B:73:0x026f, B:89:0x0564] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r8v14 java.util.HashMap) = (r8v1 java.util.HashMap), (r8v30 java.util.HashMap) binds: [B:73:0x026f, B:89:0x0564] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r13v11 java.lang.String) = (r13v8 java.lang.String), (r13v33 java.lang.String) binds: [B:73:0x026f, B:89:0x0564] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r14v26 java.lang.String) = (r14v12 java.lang.String), (r14v29 java.lang.String) binds: [B:73:0x026f, B:89:0x0564] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r15v10 java.lang.String) = (r15v9 java.lang.String), (r15v14 java.lang.String) binds: [B:73:0x026f, B:89:0x0564] A[DONT_GENERATE, DONT_INLINE], TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:17:0x0092, B:19:0x009c, B:22:0x00b2, B:23:0x00cd, B:25:0x00d7, B:26:0x00db, B:28:0x00e7, B:29:0x00eb, B:33:0x0164, B:36:0x01bd, B:39:0x01d7, B:41:0x01dd, B:43:0x01e5, B:45:0x01ed, B:47:0x01f5, B:49:0x01fd, B:51:0x0205, B:53:0x020b, B:55:0x0213, B:57:0x021b, B:59:0x0221, B:61:0x0227, B:63:0x022d, B:65:0x0235, B:68:0x023e, B:71:0x072a, B:72:0x026b, B:74:0x0271, B:76:0x027a, B:78:0x0289, B:80:0x0296, B:82:0x02ac, B:84:0x02b2, B:87:0x0558, B:97:0x02bb, B:100:0x02c7, B:104:0x0509, B:107:0x02e5, B:109:0x02ed, B:111:0x02f5, B:113:0x02fd, B:116:0x030a, B:120:0x0323, B:122:0x0329, B:124:0x0339, B:125:0x03aa, B:127:0x03b0, B:129:0x03b6, B:131:0x03be, B:133:0x03c4, B:137:0x03d7, B:139:0x03dd, B:141:0x03ed, B:142:0x0477, B:144:0x047f, B:153:0x04ba, B:155:0x04c2, B:165:0x04fc, B:177:0x03fc, B:180:0x03fd, B:181:0x03fe, B:183:0x040d, B:186:0x0415, B:189:0x0426, B:191:0x042c, B:193:0x043a, B:195:0x0451, B:197:0x0452, B:198:0x0453, B:199:0x0463, B:202:0x0345, B:204:0x0346, B:205:0x0347, B:206:0x034f, B:209:0x0359, B:212:0x0362, B:214:0x0368, B:216:0x0376, B:218:0x038b, B:220:0x038c, B:221:0x038d, B:222:0x0395, B:226:0x051c, B:228:0x0529, B:230:0x0534, B:232:0x053a, B:233:0x0546, B:242:0x0572, B:244:0x0595, B:248:0x063e, B:260:0x05bc, B:263:0x05c5, B:254:0x06b1, B:271:0x05dc, B:277:0x05f8, B:280:0x060e, B:283:0x0622, B:286:0x0636, B:292:0x064f, B:296:0x065b, B:299:0x0664, B:305:0x0679, B:307:0x067e, B:311:0x068e, B:314:0x069a, B:316:0x069f, B:325:0x0171, B:327:0x017d, B:330:0x0186, B:332:0x018c, B:334:0x019a, B:336:0x01a9, B:338:0x01aa, B:339:0x01ab, B:340:0x0104, B:342:0x0110, B:345:0x011a, B:347:0x0120, B:350:0x012b, B:352:0x0131, B:357:0x0148, B:359:0x015c, B:365:0x0152, B:371:0x0157, B:381:0x06d3, B:384:0x06e3, B:387:0x06e7, B:389:0x06f1, B:391:0x06fb, B:392:0x0706, B:395:0x0703, B:399:0x071b, B:404:0x0723, B:408:0x0744, B:411:0x074a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0564 A[LOOP:1: B:74:0x0271->B:89:0x0564, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x055e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.google.android.gms.internal.ads.zzaky, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzajq zzb(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        String str3;
        HashMap hashMap;
        ArrayDeque arrayDeque;
        zzakt zzaktVar;
        zzakz zzakzVar;
        int i3;
        ArrayDeque arrayDeque2;
        zzaku zzakuVar;
        int i4;
        zzakt zzaktVar2;
        int attributeCount;
        zzaky zzd2;
        int i5;
        String str4;
        long j;
        long j2;
        long j3;
        String[] strArr;
        String str5;
        zzaks zzaksVar;
        zzaks zzaksVar2;
        long j4;
        long j5;
        Object obj;
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
        zzakw zzakwVar;
        String zzc3;
        float f3;
        float f4;
        String zzc4;
        int i6;
        float f5;
        String zzc5;
        int i7;
        String zzc6;
        zzaky zzakyVar;
        zzaky zzakyVar2;
        String str13;
        float f6;
        String group;
        String group2;
        boolean z;
        String zzc7;
        String str14 = "";
        String str15 = "http://www.w3.org/ns/ttml#parameter";
        String str16 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser newPullParser = this.zzi.newPullParser();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            hashMap4.put("", new zzakw("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzakt zzaktVar3 = zzh;
            zzakz zzakzVar2 = null;
            zzaku zzakuVar2 = null;
            zzakt zzaktVar4 = zzaktVar3;
            int i8 = 0;
            int i9 = 15;
            while (eventType != 1) {
                zzaks zzaksVar3 = (zzaks) arrayDeque3.peek();
                ?? r47 = obj2;
                if (i8 == 0) {
                    String name = newPullParser.getName();
                    str = str14;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str15, "frameRate");
                            int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            zzakzVar = zzakzVar2;
                            String attributeValue2 = newPullParser.getAttributeValue(str15, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                i3 = i8;
                                String str17 = zzeo.zza;
                                arrayDeque2 = arrayDeque3;
                                zzghc.zzb(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f6 = Integer.parseInt(r10[0]) / Integer.parseInt(r10[1]);
                            } else {
                                arrayDeque2 = arrayDeque3;
                                i3 = i8;
                                f6 = 1.0f;
                            }
                            int i10 = zzaktVar3.zzb;
                            String attributeValue3 = newPullParser.getAttributeValue(str15, "subFrameRate");
                            if (attributeValue3 != null) {
                                i10 = Integer.parseInt(attributeValue3);
                            }
                            int i11 = zzaktVar3.zzc;
                            zzaktVar = zzaktVar3;
                            String attributeValue4 = newPullParser.getAttributeValue(str15, "tickRate");
                            if (attributeValue4 != null) {
                                i11 = Integer.parseInt(attributeValue4);
                            }
                            zzakt zzaktVar5 = new zzakt(parseInt * f6, i10, i11);
                            String attributeValue5 = newPullParser.getAttributeValue(str15, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        group = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        str2 = str15;
                                    }
                                    if (group == null) {
                                        throw r47;
                                    }
                                    String str18 = group;
                                    int parseInt2 = Integer.parseInt(group);
                                    str2 = str15;
                                    try {
                                        group2 = matcher.group(2);
                                    } catch (NumberFormatException unused2) {
                                        zzaktVar4 = zzaktVar5;
                                        zzds.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i9 = 15;
                                        zzc7 = zzep.zzc(newPullParser, "extent");
                                        if (zzc7 != null) {
                                        }
                                        zzakuVar2 = r47;
                                        zzakuVar = zzakuVar2;
                                        i4 = i9;
                                        String str19 = "image";
                                        String str20 = "metadata";
                                        String str21 = "region";
                                        String str22 = "head";
                                        zzaktVar4 = zzaktVar4;
                                        if (!name.equals("tt")) {
                                            String name2 = newPullParser.getName();
                                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                                            sb.append(str16);
                                            sb.append(name2);
                                            zzds.zzb("TtmlParser", sb.toString());
                                            str3 = str16;
                                            hashMap = hashMap5;
                                            zzakuVar2 = zzakuVar;
                                            i9 = i4;
                                            zzakzVar2 = zzakzVar;
                                            arrayDeque = arrayDeque2;
                                            i8 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            arrayDeque3 = arrayDeque;
                                            hashMap5 = hashMap;
                                            str14 = str;
                                            zzaktVar3 = zzaktVar;
                                            str15 = str2;
                                            str16 = str3;
                                            obj2 = null;
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzaktVar4 = zzaktVar2;
                                        zzakuVar2 = zzakuVar;
                                        i9 = i4;
                                        zzakzVar2 = zzakzVar;
                                        i8 = i3;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap5 = hashMap;
                                        str14 = str;
                                        zzaktVar3 = zzaktVar;
                                        str15 = str2;
                                        str16 = str3;
                                        obj2 = null;
                                    }
                                    if (group2 == null) {
                                        throw r47;
                                    }
                                    String str23 = group2;
                                    int parseInt3 = Integer.parseInt(group2);
                                    if (parseInt2 == 0) {
                                        z = false;
                                    } else if (parseInt3 != 0) {
                                        zzaktVar4 = zzaktVar5;
                                        z = true;
                                        zzghc.zzg(z, "Invalid cell resolution %s %s", parseInt2, parseInt3);
                                        i9 = parseInt3;
                                        zzc7 = zzep.zzc(newPullParser, "extent");
                                        if (zzc7 != null) {
                                            Matcher matcher2 = zzf.matcher(zzc7);
                                            if (matcher2.matches()) {
                                                try {
                                                    String group3 = matcher2.group(1);
                                                    if (group3 == null) {
                                                        throw r47;
                                                    }
                                                    String str24 = group3;
                                                    int parseInt4 = Integer.parseInt(group3);
                                                    String group4 = matcher2.group(2);
                                                    if (group4 == null) {
                                                        throw r47;
                                                    }
                                                    String str25 = group4;
                                                    zzakuVar2 = new zzaku(parseInt4, Integer.parseInt(group4));
                                                } catch (NumberFormatException unused3) {
                                                    zzds.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(zzc7));
                                                }
                                            } else {
                                                zzds.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zzc7));
                                            }
                                        }
                                        zzakuVar2 = r47;
                                    } else {
                                        parseInt3 = 0;
                                        z = false;
                                    }
                                    zzaktVar4 = zzaktVar5;
                                    zzghc.zzg(z, "Invalid cell resolution %s %s", parseInt2, parseInt3);
                                    i9 = parseInt3;
                                    zzc7 = zzep.zzc(newPullParser, "extent");
                                    if (zzc7 != null) {
                                    }
                                    zzakuVar2 = r47;
                                } else {
                                    zzds.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str15;
                            zzaktVar4 = zzaktVar5;
                            i9 = 15;
                            zzc7 = zzep.zzc(newPullParser, "extent");
                            if (zzc7 != null) {
                            }
                            zzakuVar2 = r47;
                        } else {
                            str2 = str15;
                            arrayDeque2 = arrayDeque3;
                            zzaktVar = zzaktVar3;
                            zzakzVar = zzakzVar2;
                            i3 = i8;
                        }
                        zzakuVar = zzakuVar2;
                        i4 = i9;
                        String str192 = "image";
                        String str202 = "metadata";
                        String str212 = "region";
                        String str222 = "head";
                        zzaktVar4 = zzaktVar4;
                        if (!name.equals("tt") && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals(ContextChain.TAG_PRODUCT) && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals(WindowExtensionsConstants.LAYOUT_PACKAGE) && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals(UriUtil.DATA_SCHEME) && !name.equals("information")) {
                            String name22 = newPullParser.getName();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(name22).length() + 26);
                            sb2.append(str16);
                            sb2.append(name22);
                            zzds.zzb("TtmlParser", sb2.toString());
                            str3 = str16;
                            hashMap = hashMap5;
                            zzakuVar2 = zzakuVar;
                            i9 = i4;
                            zzakzVar2 = zzakzVar;
                            arrayDeque = arrayDeque2;
                            i8 = 1;
                            newPullParser.next();
                            eventType = newPullParser.getEventType();
                            arrayDeque3 = arrayDeque;
                            hashMap5 = hashMap;
                            str14 = str;
                            zzaktVar3 = zzaktVar;
                            str15 = str2;
                            str16 = str3;
                            obj2 = null;
                        }
                        if ("head".equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzep.zzb(newPullParser, "style")) {
                                    String zzc8 = zzep.zzc(newPullParser, "style");
                                    zzaky zzd3 = zzd(newPullParser, new zzaky());
                                    if (zzc8 != null) {
                                        String[] zzc9 = zzc(zzc8);
                                        str3 = str16;
                                        str6 = str222;
                                        int i12 = 0;
                                        for (int length = zzc9.length; i12 < length; length = length) {
                                            zzd3.zzr((zzaky) hashMap3.get(zzc9[i12]));
                                            i12++;
                                        }
                                    } else {
                                        str3 = str16;
                                        str6 = str222;
                                    }
                                    String zzt = zzd3.zzt();
                                    if (zzt != null) {
                                        hashMap3.put(zzt, zzd3);
                                    }
                                    hashMap = hashMap5;
                                    str7 = str202;
                                    str8 = str212;
                                } else {
                                    str3 = str16;
                                    str6 = str222;
                                    if (zzep.zzb(newPullParser, str212)) {
                                        str8 = str212;
                                        HashMap hashMap6 = hashMap5;
                                        String zzc10 = zzep.zzc(newPullParser, "id");
                                        if (zzc10 == null) {
                                            zzakwVar = r47;
                                            str11 = str192;
                                            hashMap2 = hashMap4;
                                            str12 = str202;
                                        } else {
                                            String zzc11 = zzep.zzc(newPullParser, "origin");
                                            if (zzc11 == null) {
                                                str9 = zzc11;
                                                String zzc12 = zzep.zzc(newPullParser, "style");
                                                if (zzc12 != null && (zzakyVar2 = (zzaky) hashMap3.get(zzc12)) != null) {
                                                    str10 = zzakyVar2.zzL();
                                                    if (str10 == null) {
                                                        str11 = str192;
                                                        Matcher matcher3 = zzb.matcher(str10);
                                                        str12 = str202;
                                                        Matcher matcher4 = zzf.matcher(str10);
                                                        if (matcher3.matches()) {
                                                            hashMap2 = hashMap4;
                                                            try {
                                                                String group5 = matcher3.group(1);
                                                                if (group5 == null) {
                                                                    throw r47;
                                                                }
                                                                String str26 = group5;
                                                                float parseFloat = Float.parseFloat(group5) / 100.0f;
                                                                String group6 = matcher3.group(2);
                                                                if (group6 == null) {
                                                                    throw r47;
                                                                }
                                                                String str27 = group6;
                                                                f = Float.parseFloat(group6) / 100.0f;
                                                                f2 = parseFloat;
                                                            } catch (NumberFormatException unused4) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str10));
                                                            }
                                                        } else {
                                                            hashMap2 = hashMap4;
                                                            if (!matcher4.matches()) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(str10));
                                                            } else if (zzakuVar == null) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(str10));
                                                            } else {
                                                                try {
                                                                    String group7 = matcher4.group(1);
                                                                    if (group7 == null) {
                                                                        throw r47;
                                                                    }
                                                                    String str28 = group7;
                                                                    int parseInt5 = Integer.parseInt(group7);
                                                                    String group8 = matcher4.group(2);
                                                                    if (group8 == null) {
                                                                        throw r47;
                                                                    }
                                                                    String str29 = group8;
                                                                    f = Integer.parseInt(group8) / zzakuVar.zzb;
                                                                    f2 = parseInt5 / zzakuVar.zza;
                                                                } catch (NumberFormatException unused5) {
                                                                    zzds.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str10));
                                                                }
                                                            }
                                                            zzakwVar = r47;
                                                        }
                                                    } else {
                                                        str11 = str192;
                                                        hashMap2 = hashMap4;
                                                        str12 = str202;
                                                        f = 0.0f;
                                                        f2 = 0.0f;
                                                    }
                                                    zzc3 = zzep.zzc(newPullParser, "extent");
                                                    if (zzc3 == null && (zzc6 = zzep.zzc(newPullParser, "style")) != null && (zzakyVar = (zzaky) hashMap3.get(zzc6)) != null) {
                                                        zzc3 = zzakyVar.zzN();
                                                    }
                                                    if (zzc3 == null) {
                                                        Matcher matcher5 = zzb.matcher(zzc3);
                                                        Matcher matcher6 = zzf.matcher(zzc3);
                                                        if (matcher5.matches()) {
                                                            try {
                                                                String group9 = matcher5.group(1);
                                                                if (group9 == null) {
                                                                    throw r47;
                                                                }
                                                                String str30 = group9;
                                                                float parseFloat2 = Float.parseFloat(group9) / 100.0f;
                                                                String group10 = matcher5.group(2);
                                                                if (group10 == null) {
                                                                    throw r47;
                                                                }
                                                                String str31 = group10;
                                                                f3 = parseFloat2;
                                                                f4 = Float.parseFloat(group10) / 100.0f;
                                                            } catch (NumberFormatException unused6) {
                                                                String.valueOf(str10);
                                                                zzds.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str10)));
                                                            }
                                                        } else {
                                                            if (!matcher6.matches()) {
                                                                String.valueOf(str10);
                                                                zzds.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(str10)));
                                                            } else if (zzakuVar == null) {
                                                                String.valueOf(str10);
                                                                zzds.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(str10)));
                                                            } else {
                                                                try {
                                                                    String group11 = matcher6.group(1);
                                                                    if (group11 == null) {
                                                                        throw r47;
                                                                    }
                                                                    String str32 = group11;
                                                                    int parseInt6 = Integer.parseInt(group11);
                                                                    String group12 = matcher6.group(2);
                                                                    if (group12 == null) {
                                                                        throw r47;
                                                                    }
                                                                    String str33 = group12;
                                                                    f4 = Integer.parseInt(group12) / zzakuVar.zzb;
                                                                    f3 = parseInt6 / zzakuVar.zza;
                                                                } catch (NumberFormatException unused7) {
                                                                    String.valueOf(str10);
                                                                    zzds.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str10)));
                                                                }
                                                            }
                                                            zzakwVar = r47;
                                                        }
                                                    } else {
                                                        f3 = 1.0f;
                                                        f4 = 1.0f;
                                                    }
                                                    zzc4 = zzep.zzc(newPullParser, "displayAlign");
                                                    if (zzc4 != null) {
                                                        String zza2 = zzggj.zza(zzc4);
                                                        int hashCode = zza2.hashCode();
                                                        if (hashCode != -1364013995) {
                                                            if (hashCode == 92734940 && zza2.equals("after")) {
                                                                f5 = f + f4;
                                                                i6 = 2;
                                                                float f7 = 1.0f / i4;
                                                                zzc5 = zzep.zzc(newPullParser, "writingMode");
                                                                if (zzc5 != null) {
                                                                    String zza3 = zzggj.zza(zzc5);
                                                                    int hashCode2 = zza3.hashCode();
                                                                    if (hashCode2 != 3694) {
                                                                        if (hashCode2 != 3553396) {
                                                                            if (hashCode2 == 3553576 && zza3.equals("tbrl")) {
                                                                                i7 = 1;
                                                                            }
                                                                        }
                                                                    }
                                                                    zzakwVar = new zzakw(zzc10, f2, f5, 0, i6, f3, f4, 1, f7, i7);
                                                                }
                                                                i7 = Integer.MIN_VALUE;
                                                                zzakwVar = new zzakw(zzc10, f2, f5, 0, i6, f3, f4, 1, f7, i7);
                                                            }
                                                        } else if (zza2.equals("center")) {
                                                            f5 = f + (f4 / 2.0f);
                                                            i6 = 1;
                                                            float f72 = 1.0f / i4;
                                                            zzc5 = zzep.zzc(newPullParser, "writingMode");
                                                            if (zzc5 != null) {
                                                            }
                                                            i7 = Integer.MIN_VALUE;
                                                            zzakwVar = new zzakw(zzc10, f2, f5, 0, i6, f3, f4, 1, f72, i7);
                                                        }
                                                    }
                                                    i6 = 0;
                                                    f5 = f;
                                                    float f722 = 1.0f / i4;
                                                    zzc5 = zzep.zzc(newPullParser, "writingMode");
                                                    if (zzc5 != null) {
                                                    }
                                                    i7 = Integer.MIN_VALUE;
                                                    zzakwVar = new zzakw(zzc10, f2, f5, 0, i6, f3, f4, 1, f722, i7);
                                                }
                                            } else {
                                                str9 = zzc11;
                                            }
                                            str10 = str9;
                                            if (str10 == null) {
                                            }
                                            zzc3 = zzep.zzc(newPullParser, "extent");
                                            if (zzc3 == null) {
                                                zzc3 = zzakyVar.zzN();
                                            }
                                            if (zzc3 == null) {
                                            }
                                            zzc4 = zzep.zzc(newPullParser, "displayAlign");
                                            if (zzc4 != null) {
                                            }
                                            i6 = 0;
                                            f5 = f;
                                            float f7222 = 1.0f / i4;
                                            zzc5 = zzep.zzc(newPullParser, "writingMode");
                                            if (zzc5 != null) {
                                            }
                                            i7 = Integer.MIN_VALUE;
                                            zzakwVar = new zzakw(zzc10, f2, f5, 0, i6, f3, f4, 1, f7222, i7);
                                        }
                                        if (zzakwVar != null) {
                                            hashMap4 = hashMap2;
                                            hashMap4.put(zzakwVar.zza, zzakwVar);
                                        } else {
                                            hashMap4 = hashMap2;
                                        }
                                        str13 = str6;
                                        hashMap = hashMap6;
                                        str192 = str11;
                                        str7 = str12;
                                        if (zzep.zza(newPullParser, str13)) {
                                            str202 = str7;
                                            hashMap5 = hashMap;
                                            str212 = str8;
                                            str222 = str13;
                                            str16 = str3;
                                        } else {
                                            zzaktVar2 = zzaktVar4;
                                            arrayDeque = arrayDeque2;
                                        }
                                    } else {
                                        String str34 = str192;
                                        HashMap hashMap7 = hashMap5;
                                        str7 = str202;
                                        str8 = str212;
                                        if (zzep.zzb(newPullParser, str7)) {
                                            while (true) {
                                                newPullParser.next();
                                                str192 = str34;
                                                if (!zzep.zzb(newPullParser, str192) || (zzc2 = zzep.zzc(newPullParser, "id")) == null) {
                                                    hashMap = hashMap7;
                                                } else {
                                                    hashMap = hashMap7;
                                                    hashMap.put(zzc2, newPullParser.nextText());
                                                }
                                                if (!zzep.zza(newPullParser, str7)) {
                                                    str34 = str192;
                                                    hashMap7 = hashMap;
                                                }
                                            }
                                        } else {
                                            hashMap = hashMap7;
                                            str192 = str34;
                                        }
                                    }
                                }
                                str13 = str6;
                                if (zzep.zza(newPullParser, str13)) {
                                }
                            }
                        } else {
                            str3 = str16;
                            hashMap = hashMap5;
                            Object obj3 = "region";
                            try {
                                attributeCount = newPullParser.getAttributeCount();
                                zzd2 = zzd(newPullParser, r47);
                                i5 = 0;
                                str4 = str;
                                j = -9223372036854775807L;
                                j2 = -9223372036854775807L;
                                j3 = -9223372036854775807L;
                                strArr = null;
                                str5 = null;
                            } catch (zzajr e) {
                                e = e;
                            }
                            while (i5 < attributeCount) {
                                String attributeName = newPullParser.getAttributeName(i5);
                                String attributeValue6 = newPullParser.getAttributeValue(i5);
                                switch (attributeName.hashCode()) {
                                    case -934795532:
                                        zzaktVar2 = zzaktVar4;
                                        obj = obj3;
                                        if (attributeName.equals(obj) && hashMap4.containsKey(attributeValue6)) {
                                            str4 = attributeValue6;
                                        }
                                        try {
                                            i5++;
                                            obj3 = obj;
                                            zzaktVar4 = zzaktVar2;
                                        } catch (zzajr e2) {
                                            e = e2;
                                            arrayDeque = arrayDeque2;
                                            zzds.zzd("TtmlParser", "Suppressing parser error", e);
                                            zzaktVar4 = zzaktVar2;
                                            zzakuVar2 = zzakuVar;
                                            i9 = i4;
                                            zzakzVar2 = zzakzVar;
                                            i8 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            arrayDeque3 = arrayDeque;
                                            hashMap5 = hashMap;
                                            str14 = str;
                                            zzaktVar3 = zzaktVar;
                                            str15 = str2;
                                            str16 = str3;
                                            obj2 = null;
                                        }
                                        break;
                                    case 99841:
                                        zzaktVar2 = zzaktVar4;
                                        if (attributeName.equals("dur")) {
                                            j3 = zzg(attributeValue6, zzaktVar2);
                                        }
                                        obj = obj3;
                                        i5++;
                                        obj3 = obj;
                                        zzaktVar4 = zzaktVar2;
                                    case 100571:
                                        zzaktVar2 = zzaktVar4;
                                        if (attributeName.equals(ViewProps.END)) {
                                            j = zzg(attributeValue6, zzaktVar2);
                                        }
                                        obj = obj3;
                                        i5++;
                                        obj3 = obj;
                                        zzaktVar4 = zzaktVar2;
                                    case 93616297:
                                        if (attributeName.equals("begin")) {
                                            zzaktVar2 = zzaktVar4;
                                            j2 = zzg(attributeValue6, zzaktVar2);
                                            obj = obj3;
                                            i5++;
                                            obj3 = obj;
                                            zzaktVar4 = zzaktVar2;
                                        }
                                        zzaktVar2 = zzaktVar4;
                                        obj = obj3;
                                        i5++;
                                        obj3 = obj;
                                        zzaktVar4 = zzaktVar2;
                                    case 109780401:
                                        if (attributeName.equals("style")) {
                                            String[] zzc13 = zzc(attributeValue6);
                                            if (zzc13.length > 0) {
                                                strArr = zzc13;
                                            }
                                        }
                                        zzaktVar2 = zzaktVar4;
                                        obj = obj3;
                                        i5++;
                                        obj3 = obj;
                                        zzaktVar4 = zzaktVar2;
                                    case 1292595405:
                                        if (attributeName.equals("backgroundImage")) {
                                            try {
                                                if (attributeValue6.startsWith("#")) {
                                                    str5 = attributeValue6.substring(1);
                                                }
                                            } catch (zzajr e3) {
                                                e = e3;
                                                zzaktVar2 = zzaktVar4;
                                                arrayDeque = arrayDeque2;
                                                zzds.zzd("TtmlParser", "Suppressing parser error", e);
                                                zzaktVar4 = zzaktVar2;
                                                zzakuVar2 = zzakuVar;
                                                i9 = i4;
                                                zzakzVar2 = zzakzVar;
                                                i8 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                arrayDeque3 = arrayDeque;
                                                hashMap5 = hashMap;
                                                str14 = str;
                                                zzaktVar3 = zzaktVar;
                                                str15 = str2;
                                                str16 = str3;
                                                obj2 = null;
                                            }
                                        }
                                        zzaktVar2 = zzaktVar4;
                                        obj = obj3;
                                        i5++;
                                        obj3 = obj;
                                        zzaktVar4 = zzaktVar2;
                                    default:
                                        zzaktVar2 = zzaktVar4;
                                        obj = obj3;
                                        i5++;
                                        obj3 = obj;
                                        zzaktVar4 = zzaktVar2;
                                }
                                newPullParser.next();
                                eventType = newPullParser.getEventType();
                                arrayDeque3 = arrayDeque;
                                hashMap5 = hashMap;
                                str14 = str;
                                zzaktVar3 = zzaktVar;
                                str15 = str2;
                                str16 = str3;
                                obj2 = null;
                            }
                            zzaktVar2 = zzaktVar4;
                            if (zzaksVar3 != null) {
                                zzaksVar = zzaksVar3;
                                long j6 = zzaksVar.zzd;
                                if (j6 != -9223372036854775807L) {
                                    j2 = j2 != -9223372036854775807L ? j2 + j6 : -9223372036854775807L;
                                    if (j != -9223372036854775807L) {
                                        j += j6;
                                    } else {
                                        zzaksVar2 = zzaksVar;
                                        j = -9223372036854775807L;
                                    }
                                }
                                zzaksVar2 = zzaksVar;
                            } else {
                                zzaksVar = zzaksVar3;
                                zzaksVar2 = null;
                            }
                            if (j == -9223372036854775807L) {
                                if (j3 != -9223372036854775807L) {
                                    j = j2 + j3;
                                } else {
                                    if (zzaksVar2 != null) {
                                        j = zzaksVar2.zze;
                                        if (j != -9223372036854775807L) {
                                        }
                                    }
                                    j5 = j2;
                                    j4 = -9223372036854775807L;
                                    zzaks zzb2 = zzaks.zzb(newPullParser.getName(), j5, j4, zzd2, strArr, str4, str5, zzaksVar2);
                                    arrayDeque = arrayDeque2;
                                    arrayDeque.push(zzb2);
                                    if (zzaksVar != null) {
                                        zzaksVar.zzd(zzb2);
                                    }
                                }
                            }
                            j4 = j;
                            j5 = j2;
                            zzaks zzb22 = zzaks.zzb(newPullParser.getName(), j5, j4, zzd2, strArr, str4, str5, zzaksVar2);
                            arrayDeque = arrayDeque2;
                            arrayDeque.push(zzb22);
                            if (zzaksVar != null) {
                            }
                        }
                        zzaktVar4 = zzaktVar2;
                        zzakuVar2 = zzakuVar;
                        i9 = i4;
                    } else {
                        str2 = str15;
                        str3 = str16;
                        arrayDeque = arrayDeque3;
                        zzaktVar = zzaktVar3;
                        zzakzVar = zzakzVar2;
                        i3 = i8;
                        hashMap = hashMap5;
                        if (eventType == 4) {
                            if (zzaksVar3 == null) {
                                throw null;
                            }
                            zzaks zzaksVar4 = zzaksVar3;
                            zzaksVar3.zzd(zzaks.zza(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                zzaks zzaksVar5 = (zzaks) arrayDeque.peek();
                                if (zzaksVar5 == null) {
                                    throw null;
                                }
                                zzaks zzaksVar6 = zzaksVar5;
                                zzakzVar2 = new zzakz(zzaksVar5, hashMap3, hashMap4, hashMap);
                            } else {
                                zzakzVar2 = zzakzVar;
                            }
                            arrayDeque.pop();
                        }
                    }
                    zzakzVar2 = zzakzVar;
                } else {
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    hashMap = hashMap5;
                    arrayDeque = arrayDeque3;
                    zzaktVar = zzaktVar3;
                    zzakzVar = zzakzVar2;
                    i3 = i8;
                    if (eventType == 2) {
                        i8 = i3 + 1;
                    } else {
                        if (eventType == 3) {
                            i8 = i3 - 1;
                        }
                        zzakzVar2 = zzakzVar;
                    }
                    zzakzVar2 = zzakzVar;
                    newPullParser.next();
                    eventType = newPullParser.getEventType();
                    arrayDeque3 = arrayDeque;
                    hashMap5 = hashMap;
                    str14 = str;
                    zzaktVar3 = zzaktVar;
                    str15 = str2;
                    str16 = str3;
                    obj2 = null;
                }
                i8 = i3;
                newPullParser.next();
                eventType = newPullParser.getEventType();
                arrayDeque3 = arrayDeque;
                hashMap5 = hashMap;
                str14 = str;
                zzaktVar3 = zzaktVar;
                str15 = str2;
                str16 = str3;
                obj2 = null;
            }
            zzakz zzakzVar3 = zzakzVar2;
            if (zzakzVar3 != null) {
                return zzakzVar3;
            }
            throw null;
        } catch (IOException e4) {
            throw new IllegalStateException("Unexpected error when reading input.", e4);
        } catch (XmlPullParserException e5) {
            throw new IllegalStateException("Unable to decode source", e5);
        }
    }

    public zzakv() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
