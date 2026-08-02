package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzalb implements zzaka {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzakz zzh = new zzakz(30.0f, 1, 1);

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ca, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzd(String str, zzakz zzakzVar) throws zzajw {
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
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d4 = d3 + parseLong3;
            return (long) ((d4 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r13) / zzakzVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / zzakzVar.zzb) / zzakzVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzajw("Malformed time expression: ".concat(String.valueOf(str)));
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
                            d2 = zzakzVar.zzc;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d2 = zzakzVar.zza;
                }
                parseDouble2 /= d2;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d = 60.0d;
        }
        parseDouble2 *= d;
        return (long) (parseDouble2 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zze(String str) {
        char c;
        String zza2 = zzfuf.zza(str);
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
                if (zza2.equals("left")) {
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

    private static zzale zzf(zzale zzaleVar) {
        return zzaleVar == null ? new zzale() : zzaleVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static zzale zzg(XmlPullParser xmlPullParser, zzale zzaleVar) {
        char c;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        zzale zzaleVar2 = zzaleVar;
        int i = 0;
        while (i < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            char c2 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals(TypedValues.Custom.S_COLOR)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzs(attributeValue);
                        break;
                    }
                case 1:
                    zzaleVar2 = zzf(zzaleVar2);
                    try {
                        zzaleVar2.zzm(zzdl.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzea.zzf("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzaleVar2 = zzf(zzaleVar2);
                    try {
                        zzaleVar2.zzo(zzdl.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        zzea.zzf("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzaleVar2 = zzf(zzaleVar2);
                    zzaleVar2.zzp(attributeValue);
                    break;
                case 4:
                    try {
                        zzaleVar2 = zzf(zzaleVar2);
                        int i2 = zzet.zza;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new zzajw("Invalid number of entries for fontSize: " + length + ".");
                            }
                            matcher = zze.matcher(split[1]);
                            zzea.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new zzajw("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        int hashCode = group.hashCode();
                        if (hashCode != 37) {
                            if (hashCode != 3240) {
                                if (hashCode == 3592 && group.equals("px")) {
                                    c2 = 0;
                                }
                            } else if (group.equals("em")) {
                                c2 = 1;
                            }
                        } else if (group.equals("%")) {
                            c2 = 2;
                        }
                        if (c2 == 0) {
                            zzaleVar2.zzr(1);
                        } else if (c2 == 1) {
                            zzaleVar2.zzr(2);
                        } else {
                            if (c2 != 2) {
                                throw new zzajw("Invalid unit for fontSize: '" + group + "'.");
                            }
                            zzaleVar2.zzr(3);
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        zzaleVar2.zzq(Float.parseFloat(group2));
                        break;
                    } catch (zzajw unused3) {
                        zzea.zzf("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 5:
                    zzaleVar2 = zzf(zzaleVar2);
                    zzaleVar2.zzn("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzaleVar2 = zzf(zzaleVar2);
                    zzaleVar2.zzt("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzaleVar2 = zzf(zzaleVar2);
                    zzaleVar2.zzz(zze(attributeValue));
                    break;
                case '\b':
                    zzaleVar2 = zzf(zzaleVar2);
                    zzaleVar2.zzv(zze(attributeValue));
                    break;
                case '\t':
                    String zza2 = zzfuf.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals(DevicePublicKeyStringDef.NONE)) {
                            c2 = 0;
                        }
                    } else if (zza2.equals("all")) {
                        c2 = 1;
                    }
                    if (c2 == 0) {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzA(z);
                        break;
                    } else if (c2 == 1) {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzA(true);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    String zza3 = zzfuf.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals("container")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 == 0) {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzx(1);
                        break;
                    } else if (c2 != 1 && c2 != 2) {
                        if (c2 != 3 && c2 != 4) {
                            if (c2 == 5) {
                                zzaleVar2 = zzf(zzaleVar2);
                                zzaleVar2.zzx(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            zzaleVar2 = zzf(zzaleVar2);
                            zzaleVar2.zzx(3);
                            break;
                        }
                    } else {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzx(2);
                        break;
                    }
                case 11:
                    String zza4 = zzfuf.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            c2 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzw(1);
                        break;
                    } else if (c2 == 1) {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzw(2);
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    String zza5 = zzfuf.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                c2 = 0;
                                break;
                            }
                            break;
                    }
                    if (c2 == 0) {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzu(true);
                        break;
                    } else if (c2 == 1) {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzu(z);
                        break;
                    } else if (c2 == 2) {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzC(true);
                        break;
                    } else if (c2 == 3) {
                        zzaleVar2 = zzf(zzaleVar2);
                        zzaleVar2.zzC(z);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    zzaleVar2 = zzf(zzaleVar2);
                    zzaleVar2.zzB(zzakx.zza(attributeValue));
                    break;
                case 14:
                    zzale zzf2 = zzf(zzaleVar2);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e) {
                            zzea.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        zzea.zzf("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zzf2.zzy(f);
                    zzaleVar2 = zzf2;
                    break;
            }
            i++;
            z = false;
        }
        return zzaleVar2;
    }

    private static String[] zzh(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i = zzet.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i, int i2, zzajz zzajzVar, zzdn zzdnVar) {
        zzaju.zza(zzc(bArr, i, i2), zzajzVar, zzdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04ec A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0182, B:38:0x01db, B:41:0x01e9, B:43:0x01ef, B:45:0x01f7, B:47:0x01ff, B:49:0x0207, B:51:0x020f, B:53:0x0217, B:55:0x021d, B:57:0x0225, B:59:0x022d, B:61:0x0233, B:63:0x0239, B:65:0x0241, B:67:0x0249, B:70:0x0252, B:73:0x06b7, B:74:0x0275, B:76:0x027b, B:78:0x0284, B:80:0x0293, B:82:0x029d, B:84:0x02b1, B:86:0x02b7, B:88:0x04f1, B:97:0x02bb, B:100:0x02c5, B:102:0x02cb, B:104:0x02d6, B:106:0x02dc, B:107:0x02e3, B:111:0x02ef, B:116:0x04ec, B:117:0x02fc, B:119:0x0304, B:124:0x031d, B:126:0x0323, B:128:0x0330, B:129:0x037e, B:131:0x0386, B:135:0x0395, B:137:0x039b, B:139:0x03a8, B:140:0x03f9, B:142:0x0401, B:155:0x0447, B:157:0x044f, B:173:0x0498, B:191:0x03b4, B:195:0x03b6, B:196:0x03b7, B:197:0x03c2, B:200:0x03ca, B:203:0x03d6, B:205:0x03dc, B:207:0x03e7, B:211:0x04a5, B:214:0x04a7, B:215:0x04a8, B:216:0x04b3, B:217:0x04be, B:220:0x033a, B:223:0x033c, B:224:0x033d, B:225:0x0347, B:228:0x0351, B:231:0x035c, B:233:0x0362, B:235:0x036d, B:239:0x04c6, B:242:0x04c8, B:243:0x04c9, B:244:0x04d4, B:245:0x04df, B:248:0x0507, B:252:0x0524, B:271:0x05c6, B:280:0x0580, B:284:0x0589, B:277:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018c, B:369:0x0198, B:372:0x01a3, B:374:0x01a9, B:376:0x01b4, B:379:0x01bf, B:382:0x01c1, B:383:0x01c2, B:384:0x010d, B:386:0x0119, B:389:0x0124, B:391:0x012a, B:393:0x0135, B:398:0x014b, B:401:0x0152, B:403:0x0178, B:411:0x016d, B:414:0x0173, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #2, #4, #6, #10, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0386 A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0182, B:38:0x01db, B:41:0x01e9, B:43:0x01ef, B:45:0x01f7, B:47:0x01ff, B:49:0x0207, B:51:0x020f, B:53:0x0217, B:55:0x021d, B:57:0x0225, B:59:0x022d, B:61:0x0233, B:63:0x0239, B:65:0x0241, B:67:0x0249, B:70:0x0252, B:73:0x06b7, B:74:0x0275, B:76:0x027b, B:78:0x0284, B:80:0x0293, B:82:0x029d, B:84:0x02b1, B:86:0x02b7, B:88:0x04f1, B:97:0x02bb, B:100:0x02c5, B:102:0x02cb, B:104:0x02d6, B:106:0x02dc, B:107:0x02e3, B:111:0x02ef, B:116:0x04ec, B:117:0x02fc, B:119:0x0304, B:124:0x031d, B:126:0x0323, B:128:0x0330, B:129:0x037e, B:131:0x0386, B:135:0x0395, B:137:0x039b, B:139:0x03a8, B:140:0x03f9, B:142:0x0401, B:155:0x0447, B:157:0x044f, B:173:0x0498, B:191:0x03b4, B:195:0x03b6, B:196:0x03b7, B:197:0x03c2, B:200:0x03ca, B:203:0x03d6, B:205:0x03dc, B:207:0x03e7, B:211:0x04a5, B:214:0x04a7, B:215:0x04a8, B:216:0x04b3, B:217:0x04be, B:220:0x033a, B:223:0x033c, B:224:0x033d, B:225:0x0347, B:228:0x0351, B:231:0x035c, B:233:0x0362, B:235:0x036d, B:239:0x04c6, B:242:0x04c8, B:243:0x04c9, B:244:0x04d4, B:245:0x04df, B:248:0x0507, B:252:0x0524, B:271:0x05c6, B:280:0x0580, B:284:0x0589, B:277:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018c, B:369:0x0198, B:372:0x01a3, B:374:0x01a9, B:376:0x01b4, B:379:0x01bf, B:382:0x01c1, B:383:0x01c2, B:384:0x010d, B:386:0x0119, B:389:0x0124, B:391:0x012a, B:393:0x0135, B:398:0x014b, B:401:0x0152, B:403:0x0178, B:411:0x016d, B:414:0x0173, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #2, #4, #6, #10, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0401 A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0182, B:38:0x01db, B:41:0x01e9, B:43:0x01ef, B:45:0x01f7, B:47:0x01ff, B:49:0x0207, B:51:0x020f, B:53:0x0217, B:55:0x021d, B:57:0x0225, B:59:0x022d, B:61:0x0233, B:63:0x0239, B:65:0x0241, B:67:0x0249, B:70:0x0252, B:73:0x06b7, B:74:0x0275, B:76:0x027b, B:78:0x0284, B:80:0x0293, B:82:0x029d, B:84:0x02b1, B:86:0x02b7, B:88:0x04f1, B:97:0x02bb, B:100:0x02c5, B:102:0x02cb, B:104:0x02d6, B:106:0x02dc, B:107:0x02e3, B:111:0x02ef, B:116:0x04ec, B:117:0x02fc, B:119:0x0304, B:124:0x031d, B:126:0x0323, B:128:0x0330, B:129:0x037e, B:131:0x0386, B:135:0x0395, B:137:0x039b, B:139:0x03a8, B:140:0x03f9, B:142:0x0401, B:155:0x0447, B:157:0x044f, B:173:0x0498, B:191:0x03b4, B:195:0x03b6, B:196:0x03b7, B:197:0x03c2, B:200:0x03ca, B:203:0x03d6, B:205:0x03dc, B:207:0x03e7, B:211:0x04a5, B:214:0x04a7, B:215:0x04a8, B:216:0x04b3, B:217:0x04be, B:220:0x033a, B:223:0x033c, B:224:0x033d, B:225:0x0347, B:228:0x0351, B:231:0x035c, B:233:0x0362, B:235:0x036d, B:239:0x04c6, B:242:0x04c8, B:243:0x04c9, B:244:0x04d4, B:245:0x04df, B:248:0x0507, B:252:0x0524, B:271:0x05c6, B:280:0x0580, B:284:0x0589, B:277:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018c, B:369:0x0198, B:372:0x01a3, B:374:0x01a9, B:376:0x01b4, B:379:0x01bf, B:382:0x01c1, B:383:0x01c2, B:384:0x010d, B:386:0x0119, B:389:0x0124, B:391:0x012a, B:393:0x0135, B:398:0x014b, B:401:0x0152, B:403:0x0178, B:411:0x016d, B:414:0x0173, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #2, #4, #6, #10, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x044f A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0182, B:38:0x01db, B:41:0x01e9, B:43:0x01ef, B:45:0x01f7, B:47:0x01ff, B:49:0x0207, B:51:0x020f, B:53:0x0217, B:55:0x021d, B:57:0x0225, B:59:0x022d, B:61:0x0233, B:63:0x0239, B:65:0x0241, B:67:0x0249, B:70:0x0252, B:73:0x06b7, B:74:0x0275, B:76:0x027b, B:78:0x0284, B:80:0x0293, B:82:0x029d, B:84:0x02b1, B:86:0x02b7, B:88:0x04f1, B:97:0x02bb, B:100:0x02c5, B:102:0x02cb, B:104:0x02d6, B:106:0x02dc, B:107:0x02e3, B:111:0x02ef, B:116:0x04ec, B:117:0x02fc, B:119:0x0304, B:124:0x031d, B:126:0x0323, B:128:0x0330, B:129:0x037e, B:131:0x0386, B:135:0x0395, B:137:0x039b, B:139:0x03a8, B:140:0x03f9, B:142:0x0401, B:155:0x0447, B:157:0x044f, B:173:0x0498, B:191:0x03b4, B:195:0x03b6, B:196:0x03b7, B:197:0x03c2, B:200:0x03ca, B:203:0x03d6, B:205:0x03dc, B:207:0x03e7, B:211:0x04a5, B:214:0x04a7, B:215:0x04a8, B:216:0x04b3, B:217:0x04be, B:220:0x033a, B:223:0x033c, B:224:0x033d, B:225:0x0347, B:228:0x0351, B:231:0x035c, B:233:0x0362, B:235:0x036d, B:239:0x04c6, B:242:0x04c8, B:243:0x04c9, B:244:0x04d4, B:245:0x04df, B:248:0x0507, B:252:0x0524, B:271:0x05c6, B:280:0x0580, B:284:0x0589, B:277:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018c, B:369:0x0198, B:372:0x01a3, B:374:0x01a9, B:376:0x01b4, B:379:0x01bf, B:382:0x01c1, B:383:0x01c2, B:384:0x010d, B:386:0x0119, B:389:0x0124, B:391:0x012a, B:393:0x0135, B:398:0x014b, B:401:0x0152, B:403:0x0178, B:411:0x016d, B:414:0x0173, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #2, #4, #6, #10, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04be A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0182, B:38:0x01db, B:41:0x01e9, B:43:0x01ef, B:45:0x01f7, B:47:0x01ff, B:49:0x0207, B:51:0x020f, B:53:0x0217, B:55:0x021d, B:57:0x0225, B:59:0x022d, B:61:0x0233, B:63:0x0239, B:65:0x0241, B:67:0x0249, B:70:0x0252, B:73:0x06b7, B:74:0x0275, B:76:0x027b, B:78:0x0284, B:80:0x0293, B:82:0x029d, B:84:0x02b1, B:86:0x02b7, B:88:0x04f1, B:97:0x02bb, B:100:0x02c5, B:102:0x02cb, B:104:0x02d6, B:106:0x02dc, B:107:0x02e3, B:111:0x02ef, B:116:0x04ec, B:117:0x02fc, B:119:0x0304, B:124:0x031d, B:126:0x0323, B:128:0x0330, B:129:0x037e, B:131:0x0386, B:135:0x0395, B:137:0x039b, B:139:0x03a8, B:140:0x03f9, B:142:0x0401, B:155:0x0447, B:157:0x044f, B:173:0x0498, B:191:0x03b4, B:195:0x03b6, B:196:0x03b7, B:197:0x03c2, B:200:0x03ca, B:203:0x03d6, B:205:0x03dc, B:207:0x03e7, B:211:0x04a5, B:214:0x04a7, B:215:0x04a8, B:216:0x04b3, B:217:0x04be, B:220:0x033a, B:223:0x033c, B:224:0x033d, B:225:0x0347, B:228:0x0351, B:231:0x035c, B:233:0x0362, B:235:0x036d, B:239:0x04c6, B:242:0x04c8, B:243:0x04c9, B:244:0x04d4, B:245:0x04df, B:248:0x0507, B:252:0x0524, B:271:0x05c6, B:280:0x0580, B:284:0x0589, B:277:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018c, B:369:0x0198, B:372:0x01a3, B:374:0x01a9, B:376:0x01b4, B:379:0x01bf, B:382:0x01c1, B:383:0x01c2, B:384:0x010d, B:386:0x0119, B:389:0x0124, B:391:0x012a, B:393:0x0135, B:398:0x014b, B:401:0x0152, B:403:0x0178, B:411:0x016d, B:414:0x0173, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #2, #4, #6, #10, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x018c A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0182, B:38:0x01db, B:41:0x01e9, B:43:0x01ef, B:45:0x01f7, B:47:0x01ff, B:49:0x0207, B:51:0x020f, B:53:0x0217, B:55:0x021d, B:57:0x0225, B:59:0x022d, B:61:0x0233, B:63:0x0239, B:65:0x0241, B:67:0x0249, B:70:0x0252, B:73:0x06b7, B:74:0x0275, B:76:0x027b, B:78:0x0284, B:80:0x0293, B:82:0x029d, B:84:0x02b1, B:86:0x02b7, B:88:0x04f1, B:97:0x02bb, B:100:0x02c5, B:102:0x02cb, B:104:0x02d6, B:106:0x02dc, B:107:0x02e3, B:111:0x02ef, B:116:0x04ec, B:117:0x02fc, B:119:0x0304, B:124:0x031d, B:126:0x0323, B:128:0x0330, B:129:0x037e, B:131:0x0386, B:135:0x0395, B:137:0x039b, B:139:0x03a8, B:140:0x03f9, B:142:0x0401, B:155:0x0447, B:157:0x044f, B:173:0x0498, B:191:0x03b4, B:195:0x03b6, B:196:0x03b7, B:197:0x03c2, B:200:0x03ca, B:203:0x03d6, B:205:0x03dc, B:207:0x03e7, B:211:0x04a5, B:214:0x04a7, B:215:0x04a8, B:216:0x04b3, B:217:0x04be, B:220:0x033a, B:223:0x033c, B:224:0x033d, B:225:0x0347, B:228:0x0351, B:231:0x035c, B:233:0x0362, B:235:0x036d, B:239:0x04c6, B:242:0x04c8, B:243:0x04c9, B:244:0x04d4, B:245:0x04df, B:248:0x0507, B:252:0x0524, B:271:0x05c6, B:280:0x0580, B:284:0x0589, B:277:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018c, B:369:0x0198, B:372:0x01a3, B:374:0x01a9, B:376:0x01b4, B:379:0x01bf, B:382:0x01c1, B:383:0x01c2, B:384:0x010d, B:386:0x0119, B:389:0x0124, B:391:0x012a, B:393:0x0135, B:398:0x014b, B:401:0x0152, B:403:0x0178, B:411:0x016d, B:414:0x0173, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #2, #4, #6, #10, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e9 A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_ENTER, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0182, B:38:0x01db, B:41:0x01e9, B:43:0x01ef, B:45:0x01f7, B:47:0x01ff, B:49:0x0207, B:51:0x020f, B:53:0x0217, B:55:0x021d, B:57:0x0225, B:59:0x022d, B:61:0x0233, B:63:0x0239, B:65:0x0241, B:67:0x0249, B:70:0x0252, B:73:0x06b7, B:74:0x0275, B:76:0x027b, B:78:0x0284, B:80:0x0293, B:82:0x029d, B:84:0x02b1, B:86:0x02b7, B:88:0x04f1, B:97:0x02bb, B:100:0x02c5, B:102:0x02cb, B:104:0x02d6, B:106:0x02dc, B:107:0x02e3, B:111:0x02ef, B:116:0x04ec, B:117:0x02fc, B:119:0x0304, B:124:0x031d, B:126:0x0323, B:128:0x0330, B:129:0x037e, B:131:0x0386, B:135:0x0395, B:137:0x039b, B:139:0x03a8, B:140:0x03f9, B:142:0x0401, B:155:0x0447, B:157:0x044f, B:173:0x0498, B:191:0x03b4, B:195:0x03b6, B:196:0x03b7, B:197:0x03c2, B:200:0x03ca, B:203:0x03d6, B:205:0x03dc, B:207:0x03e7, B:211:0x04a5, B:214:0x04a7, B:215:0x04a8, B:216:0x04b3, B:217:0x04be, B:220:0x033a, B:223:0x033c, B:224:0x033d, B:225:0x0347, B:228:0x0351, B:231:0x035c, B:233:0x0362, B:235:0x036d, B:239:0x04c6, B:242:0x04c8, B:243:0x04c9, B:244:0x04d4, B:245:0x04df, B:248:0x0507, B:252:0x0524, B:271:0x05c6, B:280:0x0580, B:284:0x0589, B:277:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018c, B:369:0x0198, B:372:0x01a3, B:374:0x01a9, B:376:0x01b4, B:379:0x01bf, B:382:0x01c1, B:383:0x01c2, B:384:0x010d, B:386:0x0119, B:389:0x0124, B:391:0x012a, B:393:0x0135, B:398:0x014b, B:401:0x0152, B:403:0x0178, B:411:0x016d, B:414:0x0173, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #2, #4, #6, #10, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027b A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, LOOP:1: B:76:0x027b->B:91:0x04fd, LOOP_START, PHI: r2 r5 r11
      0x027b: PHI (r2v25 java.lang.String) = (r2v10 java.lang.String), (r2v72 java.lang.String) binds: [B:75:0x0279, B:91:0x04fd] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r5v31 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v48 java.util.HashMap) binds: [B:75:0x0279, B:91:0x04fd] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r11v32 com.google.android.gms.internal.ads.zzakz) = (r11v5 com.google.android.gms.internal.ads.zzakz), (r11v49 com.google.android.gms.internal.ads.zzakz) binds: [B:75:0x0279, B:91:0x04fd] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0182, B:38:0x01db, B:41:0x01e9, B:43:0x01ef, B:45:0x01f7, B:47:0x01ff, B:49:0x0207, B:51:0x020f, B:53:0x0217, B:55:0x021d, B:57:0x0225, B:59:0x022d, B:61:0x0233, B:63:0x0239, B:65:0x0241, B:67:0x0249, B:70:0x0252, B:73:0x06b7, B:74:0x0275, B:76:0x027b, B:78:0x0284, B:80:0x0293, B:82:0x029d, B:84:0x02b1, B:86:0x02b7, B:88:0x04f1, B:97:0x02bb, B:100:0x02c5, B:102:0x02cb, B:104:0x02d6, B:106:0x02dc, B:107:0x02e3, B:111:0x02ef, B:116:0x04ec, B:117:0x02fc, B:119:0x0304, B:124:0x031d, B:126:0x0323, B:128:0x0330, B:129:0x037e, B:131:0x0386, B:135:0x0395, B:137:0x039b, B:139:0x03a8, B:140:0x03f9, B:142:0x0401, B:155:0x0447, B:157:0x044f, B:173:0x0498, B:191:0x03b4, B:195:0x03b6, B:196:0x03b7, B:197:0x03c2, B:200:0x03ca, B:203:0x03d6, B:205:0x03dc, B:207:0x03e7, B:211:0x04a5, B:214:0x04a7, B:215:0x04a8, B:216:0x04b3, B:217:0x04be, B:220:0x033a, B:223:0x033c, B:224:0x033d, B:225:0x0347, B:228:0x0351, B:231:0x035c, B:233:0x0362, B:235:0x036d, B:239:0x04c6, B:242:0x04c8, B:243:0x04c9, B:244:0x04d4, B:245:0x04df, B:248:0x0507, B:252:0x0524, B:271:0x05c6, B:280:0x0580, B:284:0x0589, B:277:0x0645, B:291:0x0593, B:294:0x059d, B:299:0x05b2, B:301:0x05b7, B:303:0x05bf, B:327:0x05da, B:331:0x05e4, B:334:0x05ed, B:340:0x0601, B:342:0x0616, B:345:0x0624, B:347:0x0629, B:355:0x0608, B:367:0x018c, B:369:0x0198, B:372:0x01a3, B:374:0x01a9, B:376:0x01b4, B:379:0x01bf, B:382:0x01c1, B:383:0x01c2, B:384:0x010d, B:386:0x0119, B:389:0x0124, B:391:0x012a, B:393:0x0135, B:398:0x014b, B:401:0x0152, B:403:0x0178, B:411:0x016d, B:414:0x0173, B:426:0x0663, B:433:0x0670, B:436:0x0674, B:438:0x067e, B:440:0x0688, B:441:0x0694, B:444:0x068f, B:448:0x06a8, B:453:0x06b0, B:459:0x06cf), top: B:2:0x0006, inners: #2, #4, #6, #10, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04fd A[LOOP:1: B:76:0x027b->B:91:0x04fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04f9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzajv zzc(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        HashMap hashMap;
        ArrayDeque arrayDeque;
        zzalf zzalfVar;
        int i3;
        ArrayDeque arrayDeque2;
        zzalf zzalfVar2;
        int i4;
        zzala zzalaVar;
        int i5;
        HashMap hashMap2;
        zzajw zzajwVar;
        zzaky zzakyVar;
        long j;
        char c;
        zzakz zzakzVar;
        String str3;
        float f;
        float parseInt;
        String zza2;
        float parseInt2;
        float f2;
        String zza3;
        float f3;
        int i6;
        String zza4;
        int i7;
        zzalc zzalcVar;
        char c2;
        char c3;
        String group;
        String group2;
        String zza5;
        float f4;
        int i8;
        zzakz zzakzVar2;
        String group3;
        boolean z;
        StringBuilder sb;
        String zza6;
        String group4;
        String str4 = "";
        String str5 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser newPullParser = this.zzi.newPullParser();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            hashMap4.put("", new zzalc("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzakz zzakzVar3 = zzh;
            zzalf zzalfVar3 = null;
            zzala zzalaVar2 = null;
            int i9 = 0;
            int i10 = 15;
            while (eventType != 1) {
                zzaky zzakyVar2 = (zzaky) arrayDeque3.peek();
                if (i9 == 0) {
                    String name = newPullParser.getName();
                    str = str4;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str5, "frameRate");
                            int parseInt3 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str5, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                int i11 = zzet.zza;
                                zzalfVar2 = zzalfVar3;
                                i4 = i9;
                                zzdi.zze(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f4 = Integer.parseInt(r11[0]) / Integer.parseInt(r11[1]);
                            } else {
                                zzalfVar2 = zzalfVar3;
                                i4 = i9;
                                f4 = 1.0f;
                            }
                            zzakz zzakzVar4 = zzh;
                            int i12 = zzakzVar4.zzb;
                            String attributeValue3 = newPullParser.getAttributeValue(str5, "subFrameRate");
                            int parseInt4 = attributeValue3 != null ? Integer.parseInt(attributeValue3) : i12;
                            int i13 = zzakzVar4.zzc;
                            String attributeValue4 = newPullParser.getAttributeValue(str5, "tickRate");
                            if (attributeValue4 != null) {
                                i8 = Integer.parseInt(attributeValue4);
                                arrayDeque2 = arrayDeque3;
                            } else {
                                arrayDeque2 = arrayDeque3;
                                i8 = i13;
                            }
                            zzakz zzakzVar5 = new zzakz(parseInt3 * f4, parseInt4, i8);
                            String attributeValue5 = newPullParser.getAttributeValue(str5, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        group3 = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        str2 = str5;
                                    }
                                    if (group3 == null) {
                                        throw null;
                                    }
                                    int parseInt5 = Integer.parseInt(group3);
                                    String group5 = matcher.group(2);
                                    if (group5 == null) {
                                        throw null;
                                    }
                                    int parseInt6 = Integer.parseInt(group5);
                                    if (parseInt5 == 0) {
                                        str2 = str5;
                                        i5 = parseInt6;
                                        z = false;
                                    } else if (parseInt6 != 0) {
                                        str2 = str5;
                                        i5 = parseInt6;
                                        z = true;
                                    } else {
                                        str2 = str5;
                                        z = false;
                                        i5 = 0;
                                    }
                                    try {
                                        sb = new StringBuilder();
                                        zzakzVar2 = zzakzVar5;
                                    } catch (NumberFormatException unused2) {
                                        zzakzVar2 = zzakzVar5;
                                        zzea.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i5 = 15;
                                        zza6 = zzeu.zza(newPullParser, "extent");
                                        if (zza6 != null) {
                                        }
                                        zzalaVar = null;
                                        zzakzVar3 = zzakzVar2;
                                        String str6 = "metadata";
                                        if (!name.equals("tt")) {
                                            zzea.zze("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                                            hashMap = hashMap3;
                                            zzalaVar2 = zzalaVar;
                                            i10 = i5;
                                            zzalfVar3 = zzalfVar2;
                                            arrayDeque = arrayDeque2;
                                            i9 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            arrayDeque3 = arrayDeque;
                                            hashMap3 = hashMap;
                                            str4 = str;
                                            str5 = str2;
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzalaVar2 = zzalaVar;
                                        i10 = i5;
                                        zzalfVar3 = zzalfVar2;
                                        i9 = i4;
                                        hashMap = hashMap2;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap3 = hashMap;
                                        str4 = str;
                                        str5 = str2;
                                    }
                                    try {
                                        sb.append("Invalid cell resolution ");
                                        sb.append(parseInt5);
                                        sb.append(" ");
                                        sb.append(i5);
                                        zzdi.zze(z, sb.toString());
                                    } catch (NumberFormatException unused3) {
                                        zzea.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i5 = 15;
                                        zza6 = zzeu.zza(newPullParser, "extent");
                                        if (zza6 != null) {
                                        }
                                        zzalaVar = null;
                                        zzakzVar3 = zzakzVar2;
                                        String str62 = "metadata";
                                        if (!name.equals("tt")) {
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzalaVar2 = zzalaVar;
                                        i10 = i5;
                                        zzalfVar3 = zzalfVar2;
                                        i9 = i4;
                                        hashMap = hashMap2;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap3 = hashMap;
                                        str4 = str;
                                        str5 = str2;
                                    }
                                    zza6 = zzeu.zza(newPullParser, "extent");
                                    if (zza6 != null) {
                                        Matcher matcher2 = zzf.matcher(zza6);
                                        if (matcher2.matches()) {
                                            try {
                                                group4 = matcher2.group(1);
                                            } catch (NumberFormatException unused4) {
                                                zzea.zzf("TtmlParser", "Ignoring malformed tts extent: ".concat(zza6));
                                            }
                                            if (group4 == null) {
                                                throw null;
                                            }
                                            int parseInt7 = Integer.parseInt(group4);
                                            String group6 = matcher2.group(2);
                                            if (group6 == null) {
                                                throw null;
                                            }
                                            zzalaVar = new zzala(parseInt7, Integer.parseInt(group6));
                                            zzakzVar3 = zzakzVar2;
                                        } else {
                                            zzea.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zza6));
                                        }
                                    }
                                    zzalaVar = null;
                                    zzakzVar3 = zzakzVar2;
                                } else {
                                    zzea.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str5;
                            zzakzVar2 = zzakzVar5;
                            i5 = 15;
                            zza6 = zzeu.zza(newPullParser, "extent");
                            if (zza6 != null) {
                            }
                            zzalaVar = null;
                            zzakzVar3 = zzakzVar2;
                        } else {
                            str2 = str5;
                            arrayDeque2 = arrayDeque3;
                            zzalfVar2 = zzalfVar3;
                            i4 = i9;
                            zzalaVar = zzalaVar2;
                            i5 = i10;
                        }
                        String str622 = "metadata";
                        if (!name.equals("tt") && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                            zzea.zze("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            hashMap = hashMap3;
                            zzalaVar2 = zzalaVar;
                            i10 = i5;
                            zzalfVar3 = zzalfVar2;
                            arrayDeque = arrayDeque2;
                            i9 = 1;
                            newPullParser.next();
                            eventType = newPullParser.getEventType();
                            arrayDeque3 = arrayDeque;
                            hashMap3 = hashMap;
                            str4 = str;
                            str5 = str2;
                        }
                        if ("head".equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzeu.zzc(newPullParser, "style")) {
                                    String zza7 = zzeu.zza(newPullParser, "style");
                                    zzale zzg2 = zzg(newPullParser, new zzale());
                                    if (zza7 != null) {
                                        String[] zzh2 = zzh(zza7);
                                        zzakzVar = zzakzVar3;
                                        int i14 = 0;
                                        for (int length = zzh2.length; i14 < length; length = length) {
                                            zzg2.zzl((zzale) hashMap3.get(zzh2[i14]));
                                            i14++;
                                        }
                                    } else {
                                        zzakzVar = zzakzVar3;
                                    }
                                    String zzE = zzg2.zzE();
                                    if (zzE != null) {
                                        hashMap3.put(zzE, zzg2);
                                    }
                                } else {
                                    zzakzVar = zzakzVar3;
                                    if (zzeu.zzc(newPullParser, "region")) {
                                        String zza8 = zzeu.zza(newPullParser, "id");
                                        if (zza8 == null) {
                                            str3 = str622;
                                            hashMap2 = hashMap3;
                                        } else {
                                            String zza9 = zzeu.zza(newPullParser, "origin");
                                            if (zza9 != null) {
                                                Pattern pattern = zzb;
                                                Matcher matcher3 = pattern.matcher(zza9);
                                                Pattern pattern2 = zzf;
                                                str3 = str622;
                                                Matcher matcher4 = pattern2.matcher(zza9);
                                                if (matcher3.matches()) {
                                                    hashMap2 = hashMap3;
                                                    try {
                                                        group2 = matcher3.group(1);
                                                    } catch (NumberFormatException unused5) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(zza9));
                                                    }
                                                    if (group2 == null) {
                                                        throw null;
                                                    }
                                                    float parseFloat = Float.parseFloat(group2) / 100.0f;
                                                    String group7 = matcher3.group(2);
                                                    if (group7 == null) {
                                                        throw null;
                                                    }
                                                    parseInt = Float.parseFloat(group7) / 100.0f;
                                                    f = parseFloat;
                                                    zza2 = zzeu.zza(newPullParser, "extent");
                                                    if (zza2 == null) {
                                                        Matcher matcher5 = pattern.matcher(zza2);
                                                        Matcher matcher6 = pattern2.matcher(zza2);
                                                        if (matcher5.matches()) {
                                                            try {
                                                                group = matcher5.group(1);
                                                            } catch (NumberFormatException unused6) {
                                                                zzea.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(zza9));
                                                            }
                                                            if (group == null) {
                                                                throw null;
                                                            }
                                                            float parseFloat2 = Float.parseFloat(group) / 100.0f;
                                                            String group8 = matcher5.group(2);
                                                            if (group8 == null) {
                                                                throw null;
                                                            }
                                                            parseInt2 = Float.parseFloat(group8) / 100.0f;
                                                            f2 = parseFloat2;
                                                            zza3 = zzeu.zza(newPullParser, "displayAlign");
                                                            if (zza3 != null) {
                                                                String zza10 = zzfuf.zza(zza3);
                                                                int hashCode = zza10.hashCode();
                                                                if (hashCode != -1364013995) {
                                                                    if (hashCode == 92734940 && zza10.equals("after")) {
                                                                        c3 = 1;
                                                                        if (c3 != 0) {
                                                                            f3 = parseInt + (parseInt2 / 2.0f);
                                                                            i6 = 1;
                                                                        } else if (c3 == 1) {
                                                                            f3 = parseInt + parseInt2;
                                                                            i6 = 2;
                                                                        }
                                                                        float f5 = 1.0f / i5;
                                                                        zza4 = zzeu.zza(newPullParser, "writingMode");
                                                                        if (zza4 != null) {
                                                                            String zza11 = zzfuf.zza(zza4);
                                                                            int hashCode2 = zza11.hashCode();
                                                                            if (hashCode2 == 3694) {
                                                                                if (zza11.equals("tb")) {
                                                                                    c2 = 0;
                                                                                    if (c2 != 0) {
                                                                                    }
                                                                                    i7 = 2;
                                                                                    zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f5, i7);
                                                                                }
                                                                                c2 = 65535;
                                                                                if (c2 != 0) {
                                                                                }
                                                                                i7 = 2;
                                                                                zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f5, i7);
                                                                            } else if (hashCode2 != 3553396) {
                                                                                if (hashCode2 == 3553576 && zza11.equals("tbrl")) {
                                                                                    c2 = 2;
                                                                                    if (c2 != 0 || c2 == 1) {
                                                                                        i7 = 2;
                                                                                    } else if (c2 == 2) {
                                                                                        i7 = 1;
                                                                                    }
                                                                                    zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f5, i7);
                                                                                }
                                                                                c2 = 65535;
                                                                                if (c2 != 0) {
                                                                                }
                                                                                i7 = 2;
                                                                                zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f5, i7);
                                                                            } else {
                                                                                if (zza11.equals("tblr")) {
                                                                                    c2 = 1;
                                                                                    if (c2 != 0) {
                                                                                    }
                                                                                    i7 = 2;
                                                                                    zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f5, i7);
                                                                                }
                                                                                c2 = 65535;
                                                                                if (c2 != 0) {
                                                                                }
                                                                                i7 = 2;
                                                                                zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f5, i7);
                                                                            }
                                                                        }
                                                                        i7 = Integer.MIN_VALUE;
                                                                        zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f5, i7);
                                                                    }
                                                                    c3 = 65535;
                                                                    if (c3 != 0) {
                                                                    }
                                                                    float f52 = 1.0f / i5;
                                                                    zza4 = zzeu.zza(newPullParser, "writingMode");
                                                                    if (zza4 != null) {
                                                                    }
                                                                    i7 = Integer.MIN_VALUE;
                                                                    zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f52, i7);
                                                                } else {
                                                                    if (zza10.equals("center")) {
                                                                        c3 = 0;
                                                                        if (c3 != 0) {
                                                                        }
                                                                        float f522 = 1.0f / i5;
                                                                        zza4 = zzeu.zza(newPullParser, "writingMode");
                                                                        if (zza4 != null) {
                                                                        }
                                                                        i7 = Integer.MIN_VALUE;
                                                                        zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f522, i7);
                                                                    }
                                                                    c3 = 65535;
                                                                    if (c3 != 0) {
                                                                    }
                                                                    float f5222 = 1.0f / i5;
                                                                    zza4 = zzeu.zza(newPullParser, "writingMode");
                                                                    if (zza4 != null) {
                                                                    }
                                                                    i7 = Integer.MIN_VALUE;
                                                                    zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f5222, i7);
                                                                }
                                                                newPullParser.next();
                                                                eventType = newPullParser.getEventType();
                                                                arrayDeque3 = arrayDeque;
                                                                hashMap3 = hashMap;
                                                                str4 = str;
                                                                str5 = str2;
                                                            }
                                                            f3 = parseInt;
                                                            i6 = 0;
                                                            float f52222 = 1.0f / i5;
                                                            zza4 = zzeu.zza(newPullParser, "writingMode");
                                                            if (zza4 != null) {
                                                            }
                                                            i7 = Integer.MIN_VALUE;
                                                            zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f52222, i7);
                                                        } else if (!matcher6.matches()) {
                                                            zzea.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(zza9));
                                                        } else if (zzalaVar == null) {
                                                            zzea.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(zza9));
                                                        } else {
                                                            try {
                                                                String group9 = matcher6.group(1);
                                                                if (group9 == null) {
                                                                    throw null;
                                                                }
                                                                int parseInt8 = Integer.parseInt(group9);
                                                                String group10 = matcher6.group(2);
                                                                if (group10 == null) {
                                                                    throw null;
                                                                }
                                                                float f6 = parseInt8 / zzalaVar.zza;
                                                                parseInt2 = Integer.parseInt(group10) / zzalaVar.zzb;
                                                                f2 = f6;
                                                                zza3 = zzeu.zza(newPullParser, "displayAlign");
                                                                if (zza3 != null) {
                                                                }
                                                                f3 = parseInt;
                                                                i6 = 0;
                                                                float f522222 = 1.0f / i5;
                                                                zza4 = zzeu.zza(newPullParser, "writingMode");
                                                                if (zza4 != null) {
                                                                }
                                                                i7 = Integer.MIN_VALUE;
                                                                zzalcVar = new zzalc(zza8, f, f3, 0, i6, f2, parseInt2, 1, f522222, i7);
                                                            } catch (NumberFormatException unused7) {
                                                                zzea.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(zza9));
                                                            }
                                                        }
                                                    } else {
                                                        zzea.zzf("TtmlParser", "Ignoring region without an extent");
                                                    }
                                                } else {
                                                    hashMap2 = hashMap3;
                                                    if (!matcher4.matches()) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(zza9));
                                                    } else if (zzalaVar == null) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(zza9));
                                                    } else {
                                                        try {
                                                            String group11 = matcher4.group(1);
                                                            if (group11 == null) {
                                                                throw null;
                                                            }
                                                            int parseInt9 = Integer.parseInt(group11);
                                                            String group12 = matcher4.group(2);
                                                            if (group12 == null) {
                                                                throw null;
                                                            }
                                                            f = parseInt9 / zzalaVar.zza;
                                                            parseInt = Integer.parseInt(group12) / zzalaVar.zzb;
                                                            zza2 = zzeu.zza(newPullParser, "extent");
                                                            if (zza2 == null) {
                                                            }
                                                        } catch (NumberFormatException unused8) {
                                                            zzea.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(zza9));
                                                        }
                                                    }
                                                }
                                                if (zzalcVar != null) {
                                                    hashMap4.put(zzalcVar.zza, zzalcVar);
                                                }
                                                zzakzVar3 = zzakzVar;
                                                if (zzeu.zzb(newPullParser, "head")) {
                                                    arrayDeque = arrayDeque2;
                                                } else {
                                                    str622 = str3;
                                                    hashMap3 = hashMap2;
                                                }
                                            } else {
                                                str3 = str622;
                                                hashMap2 = hashMap3;
                                                zzea.zzf("TtmlParser", "Ignoring region without an origin");
                                            }
                                        }
                                        zzalcVar = null;
                                        if (zzalcVar != null) {
                                        }
                                        zzakzVar3 = zzakzVar;
                                        if (zzeu.zzb(newPullParser, "head")) {
                                        }
                                    } else if (zzeu.zzc(newPullParser, str622)) {
                                        do {
                                            newPullParser.next();
                                            if (zzeu.zzc(newPullParser, "image") && (zza5 = zzeu.zza(newPullParser, "id")) != null) {
                                                hashMap5.put(zza5, newPullParser.nextText());
                                            }
                                        } while (!zzeu.zzb(newPullParser, str622));
                                    }
                                }
                                str3 = str622;
                                hashMap2 = hashMap3;
                                zzakzVar3 = zzakzVar;
                                if (zzeu.zzb(newPullParser, "head")) {
                                }
                            }
                        } else {
                            hashMap2 = hashMap3;
                            zzakz zzakzVar6 = zzakzVar3;
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                zzale zzg3 = zzg(newPullParser, null);
                                String str7 = str;
                                long j2 = -9223372036854775807L;
                                long j3 = -9223372036854775807L;
                                long j4 = -9223372036854775807L;
                                int i15 = 0;
                                String[] strArr = null;
                                String str8 = null;
                                while (i15 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i15);
                                        String attributeValue6 = newPullParser.getAttributeValue(i15);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                if (attributeName.equals("region")) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    c = 2;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals("style")) {
                                                    c = 3;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    c = 5;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        if (c == 0) {
                                            zzakzVar3 = zzakzVar6;
                                            j3 = zzd(attributeValue6, zzakzVar3);
                                        } else if (c == 1) {
                                            zzakzVar3 = zzakzVar6;
                                            j2 = zzd(attributeValue6, zzakzVar3);
                                        } else if (c != 2) {
                                            if (c == 3) {
                                                String[] zzh3 = zzh(attributeValue6);
                                                if (zzh3.length > 0) {
                                                    strArr = zzh3;
                                                }
                                            } else if (c != 4) {
                                                if (c == 5) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            try {
                                                                str8 = attributeValue6.substring(1);
                                                            } catch (zzajw e) {
                                                                e = e;
                                                                zzajwVar = e;
                                                                zzakzVar3 = zzakzVar6;
                                                                arrayDeque = arrayDeque2;
                                                                zzea.zzg("TtmlParser", "Suppressing parser error", zzajwVar);
                                                                zzalaVar2 = zzalaVar;
                                                                i10 = i5;
                                                                zzalfVar3 = zzalfVar2;
                                                                hashMap = hashMap2;
                                                                i9 = 1;
                                                                newPullParser.next();
                                                                eventType = newPullParser.getEventType();
                                                                arrayDeque3 = arrayDeque;
                                                                hashMap3 = hashMap;
                                                                str4 = str;
                                                                str5 = str2;
                                                            }
                                                        }
                                                    } catch (zzajw e2) {
                                                        e = e2;
                                                    }
                                                }
                                            } else if (hashMap4.containsKey(attributeValue6)) {
                                                str7 = attributeValue6;
                                            }
                                            zzakzVar3 = zzakzVar6;
                                        } else {
                                            zzakzVar3 = zzakzVar6;
                                            try {
                                                j4 = zzd(attributeValue6, zzakzVar3);
                                            } catch (zzajw e3) {
                                                e = e3;
                                                zzajwVar = e;
                                                arrayDeque = arrayDeque2;
                                                zzea.zzg("TtmlParser", "Suppressing parser error", zzajwVar);
                                                zzalaVar2 = zzalaVar;
                                                i10 = i5;
                                                zzalfVar3 = zzalfVar2;
                                                hashMap = hashMap2;
                                                i9 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                arrayDeque3 = arrayDeque;
                                                hashMap3 = hashMap;
                                                str4 = str;
                                                str5 = str2;
                                            }
                                        }
                                        i15++;
                                        zzakzVar6 = zzakzVar3;
                                    } catch (zzajw e4) {
                                        e = e4;
                                        zzakzVar3 = zzakzVar6;
                                    }
                                }
                                zzakzVar3 = zzakzVar6;
                                if (zzakyVar2 != null) {
                                    long j5 = zzakyVar2.zzd;
                                    if (j5 != -9223372036854775807L) {
                                        j3 = j3 != -9223372036854775807L ? j3 + j5 : -9223372036854775807L;
                                        if (j2 != -9223372036854775807L) {
                                            j2 += j5;
                                        } else {
                                            zzakyVar = zzakyVar2;
                                            j2 = -9223372036854775807L;
                                        }
                                    }
                                    zzakyVar = zzakyVar2;
                                } else {
                                    zzakyVar = null;
                                }
                                if (j2 != -9223372036854775807L) {
                                    j = j2;
                                } else if (j4 != -9223372036854775807L) {
                                    j = j3 + j4;
                                } else {
                                    if (zzakyVar != null) {
                                        long j6 = zzakyVar.zze;
                                        if (j6 != -9223372036854775807L) {
                                            j = j6;
                                        }
                                    }
                                    j = -9223372036854775807L;
                                }
                                try {
                                    zzaky zzb2 = zzaky.zzb(newPullParser.getName(), j3, j, zzg3, strArr, str7, str8, zzakyVar);
                                    arrayDeque = arrayDeque2;
                                    try {
                                        arrayDeque.push(zzb2);
                                        if (zzakyVar2 != null) {
                                            zzakyVar2.zzf(zzb2);
                                        }
                                    } catch (zzajw e5) {
                                        e = e5;
                                        zzajwVar = e;
                                        zzea.zzg("TtmlParser", "Suppressing parser error", zzajwVar);
                                        zzalaVar2 = zzalaVar;
                                        i10 = i5;
                                        zzalfVar3 = zzalfVar2;
                                        hashMap = hashMap2;
                                        i9 = 1;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap3 = hashMap;
                                        str4 = str;
                                        str5 = str2;
                                    }
                                } catch (zzajw e6) {
                                    e = e6;
                                    arrayDeque = arrayDeque2;
                                }
                            } catch (zzajw e7) {
                                e = e7;
                                zzakzVar3 = zzakzVar6;
                                arrayDeque = arrayDeque2;
                            }
                        }
                        zzalaVar2 = zzalaVar;
                        i10 = i5;
                        zzalfVar3 = zzalfVar2;
                        i9 = i4;
                        hashMap = hashMap2;
                        newPullParser.next();
                        eventType = newPullParser.getEventType();
                        arrayDeque3 = arrayDeque;
                        hashMap3 = hashMap;
                        str4 = str;
                        str5 = str2;
                    } else {
                        str2 = str5;
                        HashMap hashMap6 = hashMap3;
                        arrayDeque = arrayDeque3;
                        zzalfVar = zzalfVar3;
                        i3 = i9;
                        if (eventType == 4) {
                            if (zzakyVar2 == null) {
                                throw null;
                            }
                            zzakyVar2.zzf(zzaky.zzc(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                zzaky zzakyVar3 = (zzaky) arrayDeque.peek();
                                if (zzakyVar3 == null) {
                                    throw null;
                                }
                                hashMap = hashMap6;
                                zzalfVar3 = new zzalf(zzakyVar3, hashMap, hashMap4, hashMap5);
                            } else {
                                hashMap = hashMap6;
                                zzalfVar3 = zzalfVar;
                            }
                            arrayDeque.pop();
                        }
                        hashMap = hashMap6;
                        zzalfVar3 = zzalfVar;
                    }
                } else {
                    str = str4;
                    str2 = str5;
                    hashMap = hashMap3;
                    arrayDeque = arrayDeque3;
                    zzalfVar = zzalfVar3;
                    i3 = i9;
                    if (eventType == 2) {
                        i9 = i3 + 1;
                    } else {
                        if (eventType == 3) {
                            i9 = i3 - 1;
                        }
                        zzalfVar3 = zzalfVar;
                    }
                    zzalfVar3 = zzalfVar;
                    newPullParser.next();
                    eventType = newPullParser.getEventType();
                    arrayDeque3 = arrayDeque;
                    hashMap3 = hashMap;
                    str4 = str;
                    str5 = str2;
                }
                i9 = i3;
                newPullParser.next();
                eventType = newPullParser.getEventType();
                arrayDeque3 = arrayDeque;
                hashMap3 = hashMap;
                str4 = str;
                str5 = str2;
            }
            zzalf zzalfVar4 = zzalfVar3;
            if (zzalfVar4 != null) {
                return zzalfVar4;
            }
            throw null;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    public zzalb() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
