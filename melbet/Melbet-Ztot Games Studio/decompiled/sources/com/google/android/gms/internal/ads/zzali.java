package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzali {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzek zzc = new zzek();
    private final StringBuilder zzd = new StringBuilder();

    static String zza(zzek zzekVar, StringBuilder sb) {
        zzc(zzekVar);
        if (zzekVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzekVar, sb);
        if (!"".equals(zzd)) {
            return zzd;
        }
        char zzm = (char) zzekVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zzm);
        return sb2.toString();
    }

    static void zzc(zzek zzekVar) {
        while (true) {
            for (boolean z = true; zzekVar.zzb() > 0 && z; z = false) {
                char c = (char) zzekVar.zzM()[zzekVar.zzd()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzekVar.zzL(1);
                } else {
                    int zzd = zzekVar.zzd();
                    int zze = zzekVar.zze();
                    byte[] zzM = zzekVar.zzM();
                    if (zzd + 2 <= zze) {
                        int i = zzd + 1;
                        if (zzM[zzd] == 47) {
                            int i2 = zzd + 2;
                            if (zzM[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= zze) {
                                        break;
                                    }
                                    if (((char) zzM[i2]) == '*' && ((char) zzM[i3]) == '/') {
                                        zze = i2 + 2;
                                        i2 = zze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzekVar.zzL(zze - zzekVar.zzd());
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

    private static String zzd(zzek zzekVar, StringBuilder sb) {
        sb.setLength(0);
        int zzd = zzekVar.zzd();
        int zze = zzekVar.zze();
        loop0: while (true) {
            for (boolean z = false; zzd < zze && !z; z = true) {
                char c = (char) zzekVar.zzM()[zzd];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    zzd++;
                }
            }
        }
        zzekVar.zzL(zzd - zzekVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0318, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00b0, code lost:
    
        if (")".equals(zza(r3, r4)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(zzek zzekVar) {
        String str;
        String sb;
        char c;
        int i = 0;
        this.zzd.setLength(0);
        int zzd = zzekVar.zzd();
        while (!TextUtils.isEmpty(zzekVar.zzy(zzfuj.zzc))) {
        }
        this.zzc.zzI(zzekVar.zzM(), zzekVar.zzd());
        this.zzc.zzK(zzd);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzek zzekVar2 = this.zzc;
            StringBuilder sb2 = this.zzd;
            zzc(zzekVar2);
            if (zzekVar2.zzb() >= 5 && "::cue".equals(zzekVar2.zzA(5, zzfuj.zzc))) {
                int zzd2 = zzekVar2.zzd();
                String zza2 = zza(zzekVar2, sb2);
                if (zza2 != null) {
                    if ("{".equals(zza2)) {
                        zzekVar2.zzK(zzd2);
                        str = "";
                    } else if ("(".equals(zza2)) {
                        int zzd3 = zzekVar2.zzd();
                        int zze = zzekVar2.zze();
                        boolean z = false;
                        while (zzd3 < zze && !z) {
                            int i2 = zzd3 + 1;
                            z = ((char) zzekVar2.zzM()[zzd3]) == ')';
                            zzd3 = i2;
                        }
                        str = zzekVar2.zzA((zzd3 - 1) - zzekVar2.zzd(), zzfuj.zzc).trim();
                    } else {
                        str = null;
                    }
                    if (str == null || !"{".equals(zza(this.zzc, this.zzd))) {
                        break;
                    }
                    zzalj zzaljVar = new zzalj();
                    if (!"".equals(str)) {
                        int indexOf = str.indexOf(91);
                        if (indexOf != -1) {
                            Matcher matcher = zza.matcher(str.substring(indexOf));
                            if (matcher.matches()) {
                                String group = matcher.group(1);
                                group.getClass();
                                zzaljVar.zzv(group);
                            }
                            str = str.substring(i, indexOf);
                        }
                        int i3 = zzet.zza;
                        String[] split = str.split("\\.", -1);
                        String str2 = split[i];
                        int indexOf2 = str2.indexOf(35);
                        if (indexOf2 != -1) {
                            zzaljVar.zzu(str2.substring(i, indexOf2));
                            zzaljVar.zzt(str2.substring(indexOf2 + 1));
                        } else {
                            zzaljVar.zzu(str2);
                        }
                        int length = split.length;
                        if (length > 1) {
                            zzaljVar.zzs((String[]) Arrays.copyOfRange(split, 1, length));
                        }
                    }
                    boolean z2 = false;
                    String str3 = null;
                    while (!z2) {
                        zzek zzekVar3 = this.zzc;
                        StringBuilder sb3 = this.zzd;
                        int zzd4 = zzekVar3.zzd();
                        str3 = zza(zzekVar3, sb3);
                        z2 = str3 == null || "}".equals(str3);
                        if (!z2) {
                            this.zzc.zzK(zzd4);
                            zzek zzekVar4 = this.zzc;
                            StringBuilder sb4 = this.zzd;
                            zzc(zzekVar4);
                            String zzd5 = zzd(zzekVar4, sb4);
                            if (!"".equals(zzd5) && ":".equals(zza(zzekVar4, sb4))) {
                                zzc(zzekVar4);
                                StringBuilder sb5 = new StringBuilder();
                                boolean z3 = false;
                                while (true) {
                                    if (z3) {
                                        sb = sb5.toString();
                                        break;
                                    }
                                    int zzd6 = zzekVar4.zzd();
                                    String zza3 = zza(zzekVar4, sb4);
                                    if (zza3 == null) {
                                        sb = null;
                                        break;
                                    }
                                    if ("}".equals(zza3) || ";".equals(zza3)) {
                                        zzekVar4.zzK(zzd6);
                                        z3 = true;
                                    } else {
                                        sb5.append(zza3);
                                    }
                                }
                                if (sb != null && !"".equals(sb)) {
                                    int zzd7 = zzekVar4.zzd();
                                    String zza4 = zza(zzekVar4, sb4);
                                    if (!";".equals(zza4)) {
                                        if ("}".equals(zza4)) {
                                            zzekVar4.zzK(zzd7);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if (TypedValues.Custom.S_COLOR.equals(zzd5)) {
                                        zzaljVar.zzk(zzdl.zza(sb));
                                    } else if ("background-color".equals(zzd5)) {
                                        zzaljVar.zzh(zzdl.zza(sb));
                                    } else if ("ruby-position".equals(zzd5)) {
                                        if ("over".equals(sb)) {
                                            zzaljVar.zzp(1);
                                        } else if ("under".equals(sb)) {
                                            zzaljVar.zzp(2);
                                        }
                                    } else if ("text-combine-upright".equals(zzd5)) {
                                        zzaljVar.zzj("all".equals(sb) || sb.startsWith("digits"));
                                    } else if ("text-decoration".equals(zzd5)) {
                                        if ("underline".equals(sb)) {
                                            zzaljVar.zzq(true);
                                        }
                                    } else if ("font-family".equals(zzd5)) {
                                        zzaljVar.zzl(sb);
                                    } else if ("font-weight".equals(zzd5)) {
                                        if ("bold".equals(sb)) {
                                            zzaljVar.zzi(true);
                                        }
                                    } else if ("font-style".equals(zzd5)) {
                                        if ("italic".equals(sb)) {
                                            zzaljVar.zzo(true);
                                        }
                                    } else if ("font-size".equals(zzd5)) {
                                        Matcher matcher2 = zzb.matcher(zzfuf.zza(sb));
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
                                                    zzaljVar.zzm(Float.parseFloat(group3));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group32 = matcher2.group(1);
                                                group32.getClass();
                                                zzaljVar.zzm(Float.parseFloat(group32));
                                            } else if (hashCode != 3240) {
                                                if (hashCode == 3592 && group2.equals("px")) {
                                                    c = 0;
                                                    if (c != 0) {
                                                        zzaljVar.zzn(1);
                                                    } else if (c == 1) {
                                                        zzaljVar.zzn(2);
                                                    } else {
                                                        if (c != 2) {
                                                            throw new IllegalStateException();
                                                        }
                                                        zzaljVar.zzn(3);
                                                    }
                                                    String group322 = matcher2.group(1);
                                                    group322.getClass();
                                                    zzaljVar.zzm(Float.parseFloat(group322));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group3222 = matcher2.group(1);
                                                group3222.getClass();
                                                zzaljVar.zzm(Float.parseFloat(group3222));
                                            } else {
                                                if (group2.equals("em")) {
                                                    c = 1;
                                                    if (c != 0) {
                                                    }
                                                    String group32222 = matcher2.group(1);
                                                    group32222.getClass();
                                                    zzaljVar.zzm(Float.parseFloat(group32222));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group322222 = matcher2.group(1);
                                                group322222.getClass();
                                                zzaljVar.zzm(Float.parseFloat(group322222));
                                            }
                                        } else {
                                            zzea.zzf("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    if ("}".equals(str3)) {
                        arrayList.add(zzaljVar);
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
