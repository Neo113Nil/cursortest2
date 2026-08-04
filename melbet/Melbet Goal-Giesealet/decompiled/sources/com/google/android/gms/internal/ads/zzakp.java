package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzakp implements zzajv {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzef zze = new zzef();

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
    
        r3.zzg(0);
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
    
        r3.zzg(2);
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
    
        r3.zzj(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010b, code lost:
    
        if (r4.equals("{\\an7}") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0132, code lost:
    
        r3.zzj(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0114, code lost:
    
        if (r4.equals("{\\an6}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011d, code lost:
    
        if (r4.equals("{\\an4}") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0125, code lost:
    
        if (r4.equals("{\\an3}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012f, code lost:
    
        if (r4.equals("{\\an1}") != false) goto L52;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.android.gms.internal.ads.zzajv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i, int i2, zzaju zzajuVar, zzdf zzdfVar) {
        zzef zzefVar;
        String str;
        zzcl zzr;
        zzakp zzakpVar = this;
        zzef zzefVar2 = zzakpVar.zze;
        zzefVar2.zzb(bArr, i + i2);
        zzefVar2.zzh(i);
        Charset zzR = zzefVar2.zzR();
        if (zzR == null) {
            zzR = StandardCharsets.UTF_8;
        }
        while (true) {
            String zzN = zzefVar2.zzN(zzR);
            if (zzN == null) {
                return;
            }
            if (zzN.isEmpty()) {
                zzefVar = zzefVar2;
            } else {
                try {
                    Integer.parseInt(zzN);
                    zzef zzefVar3 = zzakpVar.zze;
                    String zzN2 = zzefVar3.zzN(zzR);
                    if (zzN2 == null) {
                        zzds.zzc("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(zzN2);
                    if (matcher.matches()) {
                        long zzc = zzc(matcher, 1);
                        long zzc2 = zzc(matcher, 6);
                        StringBuilder sb = zzakpVar.zzc;
                        int i3 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = zzakpVar.zzd;
                        arrayList.clear();
                        String zzN3 = zzefVar3.zzN(zzR);
                        while (!TextUtils.isEmpty(zzN3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = zzN3.trim();
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
                                zzefVar2 = zzefVar2;
                            }
                            sb.append(sb2.toString());
                            zzN3 = zzefVar3.zzN(zzR);
                            i3 = 0;
                        }
                        zzefVar = zzefVar2;
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
                        zzck zzckVar = new zzck();
                        zzckVar.zza(fromHtml);
                        if (str == null) {
                            zzr = zzckVar.zzr();
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
                                    zzckVar.zzj(1);
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
                                    zzckVar.zzg(1);
                                    break;
                            }
                            zzckVar.zzi(zzb(zzckVar.zzk()));
                            zzckVar.zzf(zzb(zzckVar.zzh()), 0);
                            zzr = zzckVar.zzr();
                        }
                        zzdfVar.zza(new zzajn(zzgjz.zzj(zzr), zzc, zzc2 - zzc));
                    } else {
                        zzefVar = zzefVar2;
                        zzds.zzc("SubripParser", "Skipping invalid timing: ".concat(zzN2));
                    }
                } catch (NumberFormatException unused) {
                    zzefVar = zzefVar2;
                    zzds.zzc("SubripParser", "Skipping invalid index: ".concat(zzN));
                }
            }
            zzakpVar = this;
            zzefVar2 = zzefVar;
        }
    }
}
