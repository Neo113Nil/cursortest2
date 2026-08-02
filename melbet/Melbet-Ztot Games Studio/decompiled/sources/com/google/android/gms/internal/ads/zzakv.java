package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzakv implements zzaka {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzek zze = new zzek();

    public static float zzc(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzd(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = parseLong + (Long.parseLong(group2) * 60000);
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = parseLong2 + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i, int i2, zzajz zzajzVar, zzdn zzdnVar) {
        String str;
        char c;
        char c2;
        zzdb zzp;
        zzakv zzakvVar = this;
        zzakvVar.zze.zzI(bArr, i + i2);
        zzakvVar.zze.zzK(i);
        Charset zzB = zzakvVar.zze.zzB();
        if (zzB == null) {
            zzB = zzfuj.zzc;
        }
        while (true) {
            String zzy = zzakvVar.zze.zzy(zzB);
            if (zzy == null) {
                return;
            }
            if (zzy.length() != 0) {
                try {
                    Integer.parseInt(zzy);
                    String zzy2 = zzakvVar.zze.zzy(zzB);
                    if (zzy2 == null) {
                        zzea.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(zzy2);
                    if (matcher.matches()) {
                        long zzd = zzd(matcher, 1);
                        long zzd2 = zzd(matcher, 6);
                        zzakvVar.zzc.setLength(0);
                        zzakvVar.zzd.clear();
                        for (String zzy3 = zzakvVar.zze.zzy(zzB); !TextUtils.isEmpty(zzy3); zzy3 = zzakvVar.zze.zzy(zzB)) {
                            if (zzakvVar.zzc.length() > 0) {
                                zzakvVar.zzc.append("<br>");
                            }
                            StringBuilder sb = zzakvVar.zzc;
                            ArrayList arrayList = zzakvVar.zzd;
                            String trim = zzy3.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = zzb.matcher(trim);
                            int i3 = 0;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i3;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i3 += length;
                            }
                            sb.append(sb2.toString());
                        }
                        Spanned fromHtml = Html.fromHtml(zzakvVar.zzc.toString());
                        int i4 = 0;
                        while (true) {
                            if (i4 < zzakvVar.zzd.size()) {
                                str = (String) zzakvVar.zzd.get(i4);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i4++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcz zzczVar = new zzcz();
                        zzczVar.zzl(fromHtml);
                        if (str == null) {
                            zzp = zzczVar.zzp();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0 || c == 1 || c == 2) {
                                zzczVar.zzi(0);
                            } else if (c == 3 || c == 4 || c == 5) {
                                zzczVar.zzi(2);
                            } else {
                                zzczVar.zzi(1);
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0 || c2 == 1 || c2 == 2) {
                                zzczVar.zzf(2);
                            } else if (c2 == 3 || c2 == 4 || c2 == 5) {
                                zzczVar.zzf(0);
                            } else {
                                zzczVar.zzf(1);
                            }
                            zzczVar.zzh(zzc(zzczVar.zzb()));
                            zzczVar.zze(zzc(zzczVar.zza()), 0);
                            zzp = zzczVar.zzp();
                        }
                        zzdnVar.zza(new zzajs(zzfxr.zzn(zzp), zzd, zzd2 - zzd));
                    } else {
                        zzea.zzf("SubripParser", "Skipping invalid timing: ".concat(zzy2));
                    }
                } catch (NumberFormatException unused) {
                    zzea.zzf("SubripParser", "Skipping invalid index: ".concat(zzy));
                }
            }
            zzakvVar = this;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }
}
