package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.UserDataStore;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzano {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzer zzc = new zzer();
    private final StringBuilder zzd = new StringBuilder();

    static void zzb(zzer zzerVar) {
        while (true) {
            for (boolean z = true; zzerVar.zzd() > 0 && z; z = false) {
                char c = (char) zzerVar.zzi()[zzerVar.zzg()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzerVar.zzk(1);
                } else {
                    int zzg = zzerVar.zzg();
                    int zze = zzerVar.zze();
                    byte[] zzi = zzerVar.zzi();
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
                                zzerVar.zzk(zze - zzerVar.zzg());
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

    static String zzc(zzer zzerVar, StringBuilder sb) {
        zzb(zzerVar);
        if (zzerVar.zzd() == 0) {
            return null;
        }
        String zzd = zzd(zzerVar, sb);
        if (!zzd.isEmpty()) {
            return zzd;
        }
        char zzs = (char) zzerVar.zzs();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzs).length());
        sb2.append(zzs);
        return sb2.toString();
    }

    private static String zzd(zzer zzerVar, StringBuilder sb) {
        sb.setLength(0);
        int zzg = zzerVar.zzg();
        int zze = zzerVar.zze();
        loop0: while (true) {
            for (boolean z = false; zzg < zze && !z; z = true) {
                char c = (char) zzerVar.zzi()[zzg];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    zzg++;
                }
            }
        }
        zzerVar.zzk(zzg - zzerVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0315, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00a9, code lost:
    
        if (")".equals(zzc(r4, r1)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zza(zzer zzerVar) {
        String str;
        String sb;
        char c;
        StringBuilder sb2 = this.zzd;
        int i = 0;
        sb2.setLength(0);
        int zzg = zzerVar.zzg();
        while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
        }
        zzer zzerVar2 = this.zzc;
        zzerVar2.zzb(zzerVar.zzi(), zzerVar.zzg());
        zzerVar2.zzh(zzg);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzb(zzerVar2);
            if (zzerVar2.zzd() >= 5 && "::cue".equals(zzerVar2.zzK(5, StandardCharsets.UTF_8))) {
                int zzg2 = zzerVar2.zzg();
                String zzc = zzc(zzerVar2, sb2);
                if (zzc != null) {
                    if ("{".equals(zzc)) {
                        zzerVar2.zzh(zzg2);
                        str = "";
                    } else if ("(".equals(zzc)) {
                        int zzg3 = zzerVar2.zzg();
                        int zze = zzerVar2.zze();
                        int i2 = i;
                        while (zzg3 < zze && i2 == 0) {
                            int i3 = zzg3 + 1;
                            i2 = ((char) zzerVar2.zzi()[zzg3]) == ')' ? 1 : i;
                            zzg3 = i3;
                        }
                        str = zzerVar2.zzK((zzg3 - 1) - zzerVar2.zzg(), StandardCharsets.UTF_8).trim();
                    } else {
                        str = null;
                    }
                    if (str == null || !"{".equals(zzc(zzerVar2, sb2))) {
                        break;
                    }
                    zzanp zzanpVar = new zzanp();
                    if (!str.isEmpty()) {
                        int indexOf = str.indexOf(91);
                        if (indexOf != -1) {
                            Matcher matcher = zza.matcher(str.substring(indexOf));
                            if (matcher.matches()) {
                                String group = matcher.group(1);
                                group.getClass();
                                zzanpVar.zzd(group);
                            }
                            str = str.substring(i, indexOf);
                        }
                        String str2 = zzfj.zza;
                        String[] split = str.split("\\.", -1);
                        String str3 = split[i];
                        int indexOf2 = str3.indexOf(35);
                        if (indexOf2 != -1) {
                            zzanpVar.zzb(str3.substring(i, indexOf2));
                            zzanpVar.zza(str3.substring(indexOf2 + 1));
                        } else {
                            zzanpVar.zzb(str3);
                        }
                        int length = split.length;
                        if (length > 1) {
                            zzanpVar.zzc((String[]) Arrays.copyOfRange(split, 1, length));
                        }
                    }
                    int i4 = i;
                    String str4 = null;
                    while (i4 == 0) {
                        int zzg4 = zzerVar2.zzg();
                        str4 = zzc(zzerVar2, sb2);
                        int i5 = (str4 == null || "}".equals(str4)) ? 1 : i;
                        if (i5 == 0) {
                            zzerVar2.zzh(zzg4);
                            zzb(zzerVar2);
                            String zzd = zzd(zzerVar2, sb2);
                            if (!zzd.isEmpty() && ":".equals(zzc(zzerVar2, sb2))) {
                                zzb(zzerVar2);
                                StringBuilder sb3 = new StringBuilder();
                                int i6 = i;
                                while (true) {
                                    if (i6 != 0) {
                                        sb = sb3.toString();
                                        break;
                                    }
                                    int zzg5 = zzerVar2.zzg();
                                    String zzc2 = zzc(zzerVar2, sb2);
                                    if (zzc2 == null) {
                                        sb = null;
                                        break;
                                    }
                                    if ("}".equals(zzc2) || ";".equals(zzc2)) {
                                        zzerVar2.zzh(zzg5);
                                        i6 = 1;
                                    } else {
                                        sb3.append(zzc2);
                                    }
                                }
                                if (sb != null && !sb.isEmpty()) {
                                    int zzg6 = zzerVar2.zzg();
                                    String zzc3 = zzc(zzerVar2, sb2);
                                    if (!";".equals(zzc3)) {
                                        if ("}".equals(zzc3)) {
                                            zzerVar2.zzh(zzg6);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if (TypedValues.Custom.S_COLOR.equals(zzd)) {
                                        zzanpVar.zzn(zzdp.zzb(sb));
                                    } else if ("background-color".equals(zzd)) {
                                        zzanpVar.zzq(zzdp.zzb(sb));
                                    } else if ("ruby-position".equals(zzd)) {
                                        if ("over".equals(sb)) {
                                            zzanpVar.zzw(1);
                                        } else if ("under".equals(sb)) {
                                            zzanpVar.zzw(2);
                                        }
                                    } else if ("text-combine-upright".equals(zzd)) {
                                        zzanpVar.zzy("all".equals(sb) || sb.startsWith("digits"));
                                    } else if ("text-decoration".equals(zzd)) {
                                        if ("underline".equals(sb)) {
                                            zzanpVar.zzh(true);
                                        }
                                    } else if ("font-family".equals(zzd)) {
                                        zzanpVar.zzl(sb);
                                    } else if ("font-weight".equals(zzd)) {
                                        if ("bold".equals(sb)) {
                                            zzanpVar.zzi(true);
                                        }
                                    } else if ("font-style".equals(zzd)) {
                                        if ("italic".equals(sb)) {
                                            zzanpVar.zzj(true);
                                        }
                                    } else if ("font-size".equals(zzd)) {
                                        Matcher matcher2 = zzb.matcher(zzgql.zza(sb));
                                        if (matcher2.matches()) {
                                            String group2 = matcher2.group(2);
                                            group2.getClass();
                                            int hashCode = group2.hashCode();
                                            if (hashCode == 37) {
                                                if (group2.equals("%")) {
                                                    c = 2;
                                                    if (c != 0) {
                                                    }
                                                    String group3 = matcher2.group(1);
                                                    group3.getClass();
                                                    zzanpVar.zzs(Float.parseFloat(group3));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group32 = matcher2.group(1);
                                                group32.getClass();
                                                zzanpVar.zzs(Float.parseFloat(group32));
                                            } else if (hashCode != 3240) {
                                                if (hashCode == 3592 && group2.equals("px")) {
                                                    c = 0;
                                                    if (c != 0) {
                                                        zzanpVar.zzt(1);
                                                    } else if (c == 1) {
                                                        zzanpVar.zzt(2);
                                                    } else {
                                                        if (c != 2) {
                                                            throw new IllegalStateException();
                                                        }
                                                        zzanpVar.zzt(3);
                                                    }
                                                    String group322 = matcher2.group(1);
                                                    group322.getClass();
                                                    zzanpVar.zzs(Float.parseFloat(group322));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group3222 = matcher2.group(1);
                                                group3222.getClass();
                                                zzanpVar.zzs(Float.parseFloat(group3222));
                                            } else {
                                                if (group2.equals(UserDataStore.EMAIL)) {
                                                    c = 1;
                                                    if (c != 0) {
                                                    }
                                                    String group32222 = matcher2.group(1);
                                                    group32222.getClass();
                                                    zzanpVar.zzs(Float.parseFloat(group32222));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group322222 = matcher2.group(1);
                                                group322222.getClass();
                                                zzanpVar.zzs(Float.parseFloat(group322222));
                                            }
                                        } else {
                                            StringBuilder sb4 = new StringBuilder(sb.length() + 22);
                                            sb4.append("Invalid font-size: '");
                                            sb4.append(sb);
                                            sb4.append("'.");
                                            zzee.zzc("WebvttCssParser", sb4.toString());
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
                        arrayList.add(zzanpVar);
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
    }
}
