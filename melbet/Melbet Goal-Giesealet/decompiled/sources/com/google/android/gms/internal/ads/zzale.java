package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzale {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzef zzc = new zzef();
    private final StringBuilder zzd = new StringBuilder();

    static void zzb(zzef zzefVar) {
        while (true) {
            for (boolean z = true; zzefVar.zzd() > 0 && z; z = false) {
                char c = (char) zzefVar.zzi()[zzefVar.zzg()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzefVar.zzk(1);
                } else {
                    int zzg = zzefVar.zzg();
                    int zze = zzefVar.zze();
                    byte[] zzi = zzefVar.zzi();
                    if (zzg + 2 <= zze) {
                        int i = zzg + 1;
                        if (zzi[zzg] == 47) {
                            int i2 = zzg + 2;
                            if (zzi[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= zze) {
                                        break;
                                    }
                                    if (((char) zzi[i2]) == '*' && ((char) zzi[i3]) == '/') {
                                        zze = i2 + 2;
                                        i2 = zze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzefVar.zzk(zze - zzefVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    static String zzc(zzef zzefVar, StringBuilder sb) {
        zzb(zzefVar);
        if (zzefVar.zzd() == 0) {
            return null;
        }
        String zzd = zzd(zzefVar, sb);
        if (!zzd.isEmpty()) {
            return zzd;
        }
        char zzs = (char) zzefVar.zzs();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzs).length());
        sb2.append(zzs);
        return sb2.toString();
    }

    private static String zzd(zzef zzefVar, StringBuilder sb) {
        sb.setLength(0);
        int zzg = zzefVar.zzg();
        int zze = zzefVar.zze();
        loop0: while (true) {
            for (boolean z = false; zzg < zze && !z; z = true) {
                char c = (char) zzefVar.zzi()[zzg];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    zzg++;
                }
            }
        }
        zzefVar.zzk(zzg - zzefVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0308, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00aa, code lost:
    
        if (")".equals(zzc(r4, r1)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zza(zzef zzefVar) {
        String str;
        String sb;
        StringBuilder sb2 = this.zzd;
        int i = 0;
        sb2.setLength(0);
        int zzg = zzefVar.zzg();
        while (!TextUtils.isEmpty(zzefVar.zzN(StandardCharsets.UTF_8))) {
        }
        zzef zzefVar2 = this.zzc;
        zzefVar2.zzb(zzefVar.zzi(), zzefVar.zzg());
        zzefVar2.zzh(zzg);
        ArrayList arrayList = new ArrayList();
        loop1: while (true) {
            zzb(zzefVar2);
            if (zzefVar2.zzd() >= 5 && "::cue".equals(zzefVar2.zzK(5, StandardCharsets.UTF_8))) {
                int zzg2 = zzefVar2.zzg();
                String zzc = zzc(zzefVar2, sb2);
                if (zzc != null) {
                    if ("{".equals(zzc)) {
                        zzefVar2.zzh(zzg2);
                        str = "";
                    } else if ("(".equals(zzc)) {
                        int zzg3 = zzefVar2.zzg();
                        int zze = zzefVar2.zze();
                        int i2 = i;
                        while (zzg3 < zze && i2 == 0) {
                            int i3 = zzg3 + 1;
                            i2 = ((char) zzefVar2.zzi()[zzg3]) == ')' ? 1 : i;
                            zzg3 = i3;
                        }
                        str = zzefVar2.zzK((zzg3 - 1) - zzefVar2.zzg(), StandardCharsets.UTF_8).trim();
                    } else {
                        str = null;
                    }
                    if (str == null || !"{".equals(zzc(zzefVar2, sb2))) {
                        break;
                    }
                    zzalf zzalfVar = new zzalf();
                    if (!str.isEmpty()) {
                        int indexOf = str.indexOf(91);
                        if (indexOf != -1) {
                            Matcher matcher = zza.matcher(str.substring(indexOf));
                            if (matcher.matches()) {
                                String group = matcher.group(1);
                                group.getClass();
                                zzalfVar.zzd(group);
                            }
                            str = str.substring(i, indexOf);
                        }
                        String str2 = zzeo.zza;
                        String[] split = str.split("\\.", -1);
                        String str3 = split[i];
                        int indexOf2 = str3.indexOf(35);
                        if (indexOf2 != -1) {
                            zzalfVar.zzb(str3.substring(i, indexOf2));
                            zzalfVar.zza(str3.substring(indexOf2 + 1));
                        } else {
                            zzalfVar.zzb(str3);
                        }
                        int length = split.length;
                        if (length > 1) {
                            zzalfVar.zzc((String[]) Arrays.copyOfRange(split, 1, length));
                        }
                    }
                    int i4 = i;
                    String str4 = null;
                    while (i4 == 0) {
                        int zzg4 = zzefVar2.zzg();
                        str4 = zzc(zzefVar2, sb2);
                        int i5 = (str4 == null || "}".equals(str4)) ? 1 : i;
                        if (i5 == 0) {
                            zzefVar2.zzh(zzg4);
                            zzb(zzefVar2);
                            String zzd = zzd(zzefVar2, sb2);
                            if (!zzd.isEmpty() && ":".equals(zzc(zzefVar2, sb2))) {
                                zzb(zzefVar2);
                                StringBuilder sb3 = new StringBuilder();
                                int i6 = i;
                                while (true) {
                                    if (i6 != 0) {
                                        sb = sb3.toString();
                                        break;
                                    }
                                    int zzg5 = zzefVar2.zzg();
                                    String zzc2 = zzc(zzefVar2, sb2);
                                    if (zzc2 == null) {
                                        sb = null;
                                        break;
                                    }
                                    if ("}".equals(zzc2) || ";".equals(zzc2)) {
                                        zzefVar2.zzh(zzg5);
                                        i6 = 1;
                                    } else {
                                        sb3.append(zzc2);
                                    }
                                }
                                if (sb != null && !sb.isEmpty()) {
                                    int zzg6 = zzefVar2.zzg();
                                    String zzc3 = zzc(zzefVar2, sb2);
                                    if (!";".equals(zzc3)) {
                                        if ("}".equals(zzc3)) {
                                            zzefVar2.zzh(zzg6);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if ("color".equals(zzd)) {
                                        zzalfVar.zzn(zzdd.zzb(sb));
                                    } else if ("background-color".equals(zzd)) {
                                        zzalfVar.zzq(zzdd.zzb(sb));
                                    } else if ("ruby-position".equals(zzd)) {
                                        if ("over".equals(sb)) {
                                            zzalfVar.zzw(1);
                                        } else if ("under".equals(sb)) {
                                            zzalfVar.zzw(2);
                                        }
                                    } else if ("text-combine-upright".equals(zzd)) {
                                        zzalfVar.zzy("all".equals(sb) || sb.startsWith("digits"));
                                    } else if ("text-decoration".equals(zzd)) {
                                        if ("underline".equals(sb)) {
                                            zzalfVar.zzh(true);
                                        }
                                    } else if ("font-family".equals(zzd)) {
                                        zzalfVar.zzl(sb);
                                    } else if ("font-weight".equals(zzd)) {
                                        if ("bold".equals(sb)) {
                                            zzalfVar.zzi(true);
                                        }
                                    } else if ("font-style".equals(zzd)) {
                                        if ("italic".equals(sb)) {
                                            zzalfVar.zzj(true);
                                        }
                                    } else if ("font-size".equals(zzd)) {
                                        Matcher matcher2 = zzb.matcher(zzggj.zza(sb));
                                        if (matcher2.matches()) {
                                            String group2 = matcher2.group(2);
                                            group2.getClass();
                                            int hashCode = group2.hashCode();
                                            if (hashCode == 37) {
                                                if (!group2.equals("%")) {
                                                    break loop1;
                                                }
                                                zzalfVar.zzt(3);
                                                String group3 = matcher2.group(1);
                                                group3.getClass();
                                                zzalfVar.zzs(Float.parseFloat(group3));
                                            } else if (hashCode == 3240) {
                                                if (!group2.equals("em")) {
                                                    break loop1;
                                                }
                                                zzalfVar.zzt(2);
                                                String group32 = matcher2.group(1);
                                                group32.getClass();
                                                zzalfVar.zzs(Float.parseFloat(group32));
                                            } else {
                                                if (hashCode != 3592 || !group2.equals("px")) {
                                                    break loop1;
                                                }
                                                zzalfVar.zzt(1);
                                                String group322 = matcher2.group(1);
                                                group322.getClass();
                                                zzalfVar.zzs(Float.parseFloat(group322));
                                            }
                                        } else {
                                            StringBuilder sb4 = new StringBuilder(sb.length() + 22);
                                            sb4.append("Invalid font-size: '");
                                            sb4.append(sb);
                                            sb4.append("'.");
                                            zzds.zzc("WebvttCssParser", sb4.toString());
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        i4 = i5;
                        i = 0;
                    }
                    if ("}".equals(str4)) {
                        arrayList.add(zzalfVar);
                    }
                    i = 0;
                }
            }
            str = null;
            if (str == null) {
                break;
            }
            break;
        }
        throw new IllegalStateException();
    }
}
