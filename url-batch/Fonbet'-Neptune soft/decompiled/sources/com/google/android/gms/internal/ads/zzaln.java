package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzaln implements zzakt {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzen zze = new zzen();

    public static float zzb(int i) {
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

    private static long zzc(Matcher matcher, int i) {
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
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0146, code lost:
    
        if (r4.equals("{\\an9}") != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015a, code lost:
    
        r3.zzf(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
    
        if (r4.equals("{\\an8}") != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
    
        if (r4.equals("{\\an7}") != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0162, code lost:
    
        if (r4.equals("{\\an3}") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0174, code lost:
    
        r3.zzf(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r4.equals("{\\an2}") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
    
        if (r4.equals("{\\an1}") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0104, code lost:
    
        if (r4.equals("{\\an9}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0127, code lost:
    
        r3.zzi(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010b, code lost:
    
        if (r4.equals("{\\an7}") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0132, code lost:
    
        r3.zzi(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0115, code lost:
    
        if (r4.equals("{\\an6}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011e, code lost:
    
        if (r4.equals("{\\an4}") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0125, code lost:
    
        if (r4.equals("{\\an3}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012f, code lost:
    
        if (r4.equals("{\\an1}") != false) goto L46;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.android.gms.internal.ads.zzakt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i, int i2, zzaks zzaksVar, zzdn zzdnVar) {
        zzen zzenVar;
        String str;
        zzcu zzq;
        zzaln zzalnVar = this;
        zzen zzenVar2 = zzalnVar.zze;
        zzenVar2.zzJ(bArr, i + i2);
        zzenVar2.zzL(i);
        Charset zzC = zzenVar2.zzC();
        if (zzC == null) {
            zzC = StandardCharsets.UTF_8;
        }
        while (true) {
            String zzz = zzenVar2.zzz(zzC);
            if (zzz == null) {
                return;
            }
            if (zzz.length() != 0) {
                try {
                    Integer.parseInt(zzz);
                    zzen zzenVar3 = zzalnVar.zze;
                    String zzz2 = zzenVar3.zzz(zzC);
                    if (zzz2 == null) {
                        zzea.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(zzz2);
                    if (matcher.matches()) {
                        long zzc = zzc(matcher, 1);
                        long zzc2 = zzc(matcher, 6);
                        StringBuilder sb = zzalnVar.zzc;
                        int i3 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = zzalnVar.zzd;
                        arrayList.clear();
                        String zzz3 = zzenVar3.zzz(zzC);
                        while (!TextUtils.isEmpty(zzz3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = zzz3.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = zzb.matcher(trim);
                            int i4 = i3;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i4;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i4 += length;
                                zzenVar2 = zzenVar2;
                            }
                            sb.append(sb2.toString());
                            zzz3 = zzenVar3.zzz(zzC);
                            i3 = 0;
                        }
                        zzenVar = zzenVar2;
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i5 = 0;
                        while (true) {
                            if (i5 < arrayList.size()) {
                                str = (String) arrayList.get(i5);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i5++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcs zzcsVar = new zzcs();
                        zzcsVar.zzl(fromHtml);
                        if (str == null) {
                            zzq = zzcsVar.zzq();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    break;
                                case -685620648:
                                    break;
                                case -685620617:
                                    break;
                                case -685620555:
                                    break;
                                case -685620524:
                                    break;
                                case -685620462:
                                    break;
                                default:
                                    zzcsVar.zzi(1);
                                    break;
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    break;
                                case -685620679:
                                    break;
                                case -685620648:
                                    break;
                                case -685620524:
                                    break;
                                case -685620493:
                                    break;
                                case -685620462:
                                    break;
                                default:
                                    zzcsVar.zzf(1);
                                    break;
                            }
                            zzcsVar.zzh(zzb(zzcsVar.zzb()));
                            zzcsVar.zze(zzb(zzcsVar.zza()), 0);
                            zzq = zzcsVar.zzq();
                        }
                        zzdnVar.zza(new zzakl(zzfyq.zzo(zzq), zzc, zzc2 - zzc));
                    } else {
                        zzenVar = zzenVar2;
                        zzea.zzf("SubripParser", "Skipping invalid timing: ".concat(zzz2));
                    }
                } catch (NumberFormatException unused) {
                    zzenVar = zzenVar2;
                    zzea.zzf("SubripParser", "Skipping invalid index: ".concat(zzz));
                }
            } else {
                zzenVar = zzenVar2;
            }
            zzalnVar = this;
            zzenVar2 = zzenVar;
        }
    }
}
