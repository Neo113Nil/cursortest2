package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.work.WorkRequest;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzakr implements zzaka {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzakq zzc;
    private final zzek zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzakr() {
        this(null);
    }

    private static float zzc(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzd(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static long zze(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = zzet.zza;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0050, code lost:
    
        if (r3.equals("playresx") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzf(zzek zzekVar, Charset charset) {
        while (true) {
            String zzy = zzekVar.zzy(charset);
            if (zzy == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(zzy)) {
                while (true) {
                    String zzy2 = zzekVar.zzy(charset);
                    if (zzy2 != null && (zzekVar.zzb() == 0 || zzekVar.zza(charset) != '[')) {
                        String[] split = zzy2.split(":");
                        if (split.length == 2) {
                            char c = 0;
                            String zza2 = zzfuf.zza(split[0].trim());
                            switch (zza2.hashCode()) {
                                case 1879649548:
                                    break;
                                case 1879649549:
                                    if (zza2.equals("playresy")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                this.zzf = Float.parseFloat(split[1].trim());
                            } else if (c == 1) {
                                try {
                                    this.zzg = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(zzy)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzaks zzaksVar = null;
                while (true) {
                    String zzy3 = zzekVar.zzy(charset);
                    if (zzy3 != null && (zzekVar.zzb() == 0 || zzekVar.zza(charset) != '[')) {
                        if (zzy3.startsWith("Format:")) {
                            zzaksVar = zzaks.zza(zzy3);
                        } else if (zzy3.startsWith("Style:")) {
                            if (zzaksVar == null) {
                                zzea.zzf("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(zzy3));
                            } else {
                                zzaku zzb = zzaku.zzb(zzy3, zzaksVar);
                                if (zzb != null) {
                                    linkedHashMap.put(zzb.zza, zzb);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(zzy)) {
                zzea.zze("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(zzy)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01aa  */
    @Override // com.google.android.gms.internal.ads.zzaka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i, int i2, zzajz zzajzVar, zzdn zzdnVar) {
        int i3;
        Charset charset;
        zzek zzekVar;
        zzakq zzakqVar;
        long j;
        Layout.Alignment alignment;
        int i4;
        int i5;
        int i6;
        Integer num;
        int i7;
        zzakr zzakrVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzakrVar.zzd.zzI(bArr, i + i2);
        zzakrVar.zzd.zzK(i);
        Charset zzB = zzakrVar.zzd.zzB();
        if (zzB == null) {
            zzB = zzfuj.zzc;
        }
        if (!zzakrVar.zzb) {
            zzakrVar.zzf(zzakrVar.zzd, zzB);
        }
        zzek zzekVar2 = zzakrVar.zzd;
        zzakq zzakqVar2 = zzakrVar.zzb ? zzakrVar.zzc : null;
        while (true) {
            String zzy = zzekVar2.zzy(zzB);
            if (zzy == null) {
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    List list = (List) arrayList.get(i8);
                    if (list.isEmpty()) {
                        if (i8 != 0) {
                            i3 = 1;
                            i8 += i3;
                        } else {
                            i8 = 0;
                        }
                    }
                    if (i8 == arrayList.size() - 1) {
                        throw new IllegalStateException();
                    }
                    zzdnVar.zza(new zzajs(list, ((Long) arrayList2.get(i8)).longValue(), ((Long) arrayList2.get(i8 + 1)).longValue() - ((Long) arrayList2.get(i8)).longValue()));
                    i3 = 1;
                    i8 += i3;
                }
                return;
            }
            if (zzy.startsWith("Format:")) {
                zzakqVar2 = zzakq.zza(zzy);
            } else {
                if (zzy.startsWith("Dialogue:")) {
                    if (zzakqVar2 == null) {
                        zzea.zzf("SsaParser", "Skipping dialogue line before complete format: ".concat(zzy));
                    } else {
                        zzdi.zzd(zzy.startsWith("Dialogue:"));
                        String[] split = zzy.substring(9).split(",", zzakqVar2.zze);
                        if (split.length != zzakqVar2.zze) {
                            zzea.zzf("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(zzy));
                        } else {
                            long zze = zze(split[zzakqVar2.zza]);
                            if (zze == -9223372036854775807L) {
                                zzea.zzf("SsaParser", "Skipping invalid timing: ".concat(zzy));
                            } else {
                                long zze2 = zze(split[zzakqVar2.zzb]);
                                if (zze2 == -9223372036854775807L) {
                                    zzea.zzf("SsaParser", "Skipping invalid timing: ".concat(zzy));
                                } else {
                                    Map map = zzakrVar.zze;
                                    zzaku zzakuVar = (map == null || (i7 = zzakqVar2.zzc) == -1) ? null : (zzaku) map.get(split[i7].trim());
                                    String str = split[zzakqVar2.zzd];
                                    zzakt zza2 = zzakt.zza(str);
                                    String replace = zzakt.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f = zzakrVar.zzf;
                                    float f2 = zzakrVar.zzg;
                                    SpannableString spannableString = new SpannableString(replace);
                                    zzcz zzczVar = new zzcz();
                                    zzczVar.zzl(spannableString);
                                    charset = zzB;
                                    if (zzakuVar != null) {
                                        Integer num2 = zzakuVar.zzc;
                                        zzekVar = zzekVar2;
                                        if (num2 != null) {
                                            zzakqVar = zzakqVar2;
                                            j = zze2;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            zzakqVar = zzakqVar2;
                                            j = zze2;
                                        }
                                        if (zzakuVar.zzj == 3 && (num = zzakuVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f3 = zzakuVar.zze;
                                        if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                            zzczVar.zzn(f3 / f2, 1);
                                        }
                                        if (!zzakuVar.zzf) {
                                            i5 = 33;
                                            i6 = 0;
                                            if (zzakuVar.zzg) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                if (zzakuVar.zzh) {
                                                    spannableString.setSpan(new UnderlineSpan(), i6, spannableString.length(), i5);
                                                }
                                                if (zzakuVar.zzi) {
                                                    spannableString.setSpan(new StrikethroughSpan(), i6, spannableString.length(), i5);
                                                }
                                            }
                                        } else if (zzakuVar.zzg) {
                                            i5 = 33;
                                            i6 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i5 = 33;
                                            i6 = 0;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (zzakuVar.zzh) {
                                        }
                                        if (zzakuVar.zzi) {
                                        }
                                    } else {
                                        zzekVar = zzekVar2;
                                        zzakqVar = zzakqVar2;
                                        j = zze2;
                                    }
                                    int i9 = zza2.zza;
                                    if (i9 == -1) {
                                        i9 = zzakuVar != null ? zzakuVar.zzb : -1;
                                    }
                                    switch (i9) {
                                        case 0:
                                        default:
                                            zzea.zzf("SsaParser", "Unknown alignment: " + i9);
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzczVar.zzm(alignment);
                                    int i10 = Integer.MIN_VALUE;
                                    switch (i9) {
                                        case 0:
                                        default:
                                            zzea.zzf("SsaParser", "Unknown alignment: " + i9);
                                        case -1:
                                            i4 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i4 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i4 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i4 = 2;
                                            break;
                                    }
                                    zzczVar.zzi(i4);
                                    switch (i9) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            zzea.zzf("SsaParser", "Unknown alignment: " + i9);
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i10 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i10 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i10 = 0;
                                            break;
                                    }
                                    zzczVar.zzf(i10);
                                    PointF pointF = zza2.zzb;
                                    if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                        zzczVar.zzh(zzc(zzczVar.zzb()));
                                        zzczVar.zze(zzc(zzczVar.zza()), 0);
                                    } else {
                                        zzczVar.zzh(pointF.x / f);
                                        zzczVar.zze(zza2.zzb.y / f2, 0);
                                    }
                                    zzdb zzp = zzczVar.zzp();
                                    int zzd = zzd(j, arrayList2, arrayList);
                                    for (int zzd2 = zzd(zze, arrayList2, arrayList); zzd2 < zzd; zzd2++) {
                                        ((List) arrayList.get(zzd2)).add(zzp);
                                    }
                                    zzakrVar = this;
                                    zzB = charset;
                                    zzekVar2 = zzekVar;
                                    zzakqVar2 = zzakqVar;
                                }
                            }
                        }
                    }
                }
                charset = zzB;
                zzekVar = zzekVar2;
                zzakqVar = zzakqVar2;
                zzakrVar = this;
                zzB = charset;
                zzekVar2 = zzekVar;
                zzakqVar2 = zzakqVar;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }

    public zzakr(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzek();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String zzA = zzet.zzA((byte[]) list.get(0));
        zzdi.zzd(zzA.startsWith("Format:"));
        zzakq zza2 = zzakq.zza(zzA);
        zza2.getClass();
        this.zzc = zza2;
        zzf(new zzek((byte[]) list.get(1)), zzfuj.zzc);
    }
}
