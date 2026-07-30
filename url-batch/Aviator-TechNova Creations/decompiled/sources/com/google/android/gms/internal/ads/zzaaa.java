package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaaa extends zzaag implements zzmm {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgvz zzc = zzgvz.zzc(zzzg.zza);
    public final Context zza;
    private final Object zzd;
    private zzzl zze;
    private Thread zzf;
    private zzzp zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzyt zzj;

    public zzaaa(Context context) {
        zzyt zzytVar = new zzyt();
        zzzl zzzlVar = zzzl.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzytVar;
        if (zzzlVar instanceof zzzl) {
            this.zze = zzzlVar;
        } else {
            zzzk zzzkVar = new zzzk(zzzlVar, bArr);
            zzzkVar.zzx((zzbl) zzzlVar);
            this.zze = new zzzl(zzzkVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int zzj(zzv zzvVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String zzi = zzi(str);
        String zzi2 = zzi(zzvVar.zzd);
        if (zzi2 == null || zzi == null) {
            return (z && zzi2 == null) ? 1 : 0;
        }
        if (zzi2.startsWith(zzi) || zzi.startsWith(zzi2)) {
            return 3;
        }
        String str2 = zzfj.zza;
        return zzi2.split("-", 2)[0].equals(zzi.split("-", 2)[0]) ? 2 : 0;
    }

    static /* synthetic */ int zzm(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ int zzn(zzv zzvVar, zzguf zzgufVar) {
        int i = 0;
        while (i < zzgufVar.size()) {
            int i2 = 0;
            while (true) {
                List list = zzvVar.zzc;
                if (i2 < list.size()) {
                    if (((zzx) list.get(i2)).zzb.equals(zzgufVar.get(i))) {
                        return i;
                    }
                    i2++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z;
        zzzp zzzpVar;
        synchronized (this.zzd) {
            z = false;
            if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza()) {
                z = true;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static void zzv(zzyn zzynVar, zzbl zzblVar, Map map) {
        for (int i = 0; i < zzynVar.zzb; i++) {
            if (((zzbh) zzblVar.zzH.get(zzynVar.zza(i))) != null) {
                throw null;
            }
        }
    }

    private static final Pair zzw(int i, zzaaf zzaafVar, int[][][] iArr, zzzr zzzrVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzaaf zzaafVar2 = zzaafVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzaafVar2.zza(i2)) {
                zzyn zzb2 = zzaafVar2.zzb(i2);
                for (int i3 = 0; i3 < zzb2.zzb; i3++) {
                    zzbg zza = zzb2.zza(i3);
                    List zza2 = zzzrVar.zza(i2, zza, iArr[i2][i3]);
                    int i4 = zza.zza;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        zzzs zzzsVar = (zzzs) zza2.get(i5);
                        int zza3 = zzzsVar.zza();
                        if (!zArr[i5] && zza3 != 0) {
                            if (zza3 == 1) {
                                randomAccess = zzguf.zzj(zzzsVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzzsVar);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    zzzs zzzsVar2 = (zzzs) zza2.get(i7);
                                    if (zzzsVar2.zza() == 2 && zzzsVar.zzc(zzzsVar2)) {
                                        arrayList2.add(zzzsVar2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            zzaafVar2 = zzaafVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzzs) list.get(i8)).zzc;
        }
        zzzs zzzsVar3 = (zzzs) list.get(0);
        return Pair.create(new zzaab(zzzsVar3.zzb, iArr2, 0), Integer.valueOf(zzzsVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zza(zzml zzmlVar) {
        synchronized (this.zzd) {
            boolean z = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzb() {
        zzzp zzzpVar;
        synchronized (this.zzd) {
            Thread thread = this.zzf;
            if (thread != null) {
                zzgrc.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null) {
            zzzpVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzzl zzc() {
        zzzl zzzlVar;
        synchronized (this.zzd) {
            zzzlVar = this.zze;
        }
        return zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzl();
    }

    public final void zzf(zzzk zzzkVar) {
        boolean equals;
        zzzl zzzlVar = new zzzl(zzzkVar, null);
        synchronized (this.zzd) {
            equals = this.zze.equals(zzzlVar);
            this.zze = zzzlVar;
        }
        if (equals) {
            return;
        }
        if (zzzlVar.zzU && this.zza == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final zzmm zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    protected final Pair zzh(zzaaf zzaafVar, int[][][] iArr, final int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) throws zziw {
        final zzzl zzzlVar;
        int i;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzzlVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfj.zzM(context3));
        }
        if (zzzlVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzzp(this.zza, this, this.zzi);
        }
        int i2 = 2;
        zzaab[] zzaabVarArr = new zzaab[2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (zzaafVar.zza(i4) == 2 && zzaafVar.zzb(i4).zzb > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair zzw = zzw(1, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzc
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i5, zzbg zzbgVar, int[] iArr4) {
                final zzaaa zzaaaVar = zzaaa.this;
                final zzzl zzzlVar2 = zzzlVar;
                zzgrd zzgrdVar = new zzgrd() { // from class: com.google.android.gms.internal.ads.zzzf
                    @Override // com.google.android.gms.internal.ads.zzgrd
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzaaa.this.zzk(zzzlVar2, (zzv) obj);
                    }
                };
                int i6 = iArr2[i5];
                int i7 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i8 = 0; i8 < zzbgVar.zza; i8++) {
                    zzgucVar.zzf(new zzyx(i5, zzbgVar, i8, zzzlVar2, iArr4[i8], z, zzgrdVar, i6));
                }
                return zzgucVar.zzi();
            }
        }, zzyy.zza);
        if (zzw != null) {
            zzaabVarArr[((Integer) zzw.second).intValue()] = (zzaab) zzw.first;
        }
        final String str2 = zzw == null ? null : ((zzaab) zzw.first).zza.zza(((zzaab) zzw.first).zzb[0]).zzd;
        int i5 = zzzlVar.zzw.zzb;
        final Point zzO = (!zzzlVar.zzk || (context2 = this.zza) == null) ? null : zzfj.zzO(context2);
        Pair zzw2 = zzw(2, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzh
            /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
            @Override // com.google.android.gms.internal.ads.zzzr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final /* synthetic */ List zza(int i6, zzbg zzbgVar, int[] iArr4) {
                int i7;
                int i8;
                int i9;
                boolean z2;
                int i10;
                int i11;
                int i12;
                Point point;
                int i13;
                zzbg zzbgVar2 = zzbgVar;
                int i14 = zzaaa.zzb;
                Point point2 = zzO;
                int i15 = iArr2[i6];
                zzzl zzzlVar2 = zzzl.this;
                int i16 = point2 != null ? point2.x : zzzlVar2.zzi;
                int i17 = point2 != null ? point2.y : zzzlVar2.zzj;
                boolean z3 = zzzlVar2.zzl;
                if (i16 == Integer.MAX_VALUE) {
                    i7 = -1;
                    i8 = Integer.MAX_VALUE;
                } else if (i17 == Integer.MAX_VALUE) {
                    i8 = Integer.MAX_VALUE;
                    i7 = -1;
                } else {
                    int i18 = Integer.MAX_VALUE;
                    for (int i19 = 0; i19 < zzbgVar2.zza; i19++) {
                        zzv zza = zzbgVar2.zza(i19);
                        int i20 = zza.zzv;
                        if (i20 > 0 && (i10 = zza.zzw) > 0) {
                            if (z3) {
                                if ((i20 > i10) != (i16 > i17)) {
                                    i12 = i17;
                                    i11 = i16;
                                    if (i20 * i11 < i10 * i12) {
                                        String str3 = zzfj.zza;
                                        point = new Point(i12, ((r10 + i20) - 1) / i20);
                                    } else {
                                        String str4 = zzfj.zza;
                                        point = new Point(((r12 + i10) - 1) / i10, i11);
                                    }
                                    i13 = i20 * i10;
                                    if (i20 >= ((int) (point.x * 0.98f)) && i10 >= ((int) (point.y * 0.98f)) && i13 < i18) {
                                        i18 = i13;
                                    }
                                }
                            }
                            i11 = i17;
                            i12 = i16;
                            if (i20 * i11 < i10 * i12) {
                            }
                            i13 = i20 * i10;
                            if (i20 >= ((int) (point.x * 0.98f))) {
                                i18 = i13;
                            }
                        }
                    }
                    i7 = -1;
                    i8 = i18;
                }
                int i21 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                int i22 = 0;
                while (i22 < zzbgVar2.zza) {
                    int zzc2 = zzbgVar2.zza(i22).zzc();
                    if (i8 != Integer.MAX_VALUE) {
                        i9 = i7;
                        if (zzc2 == i9 || zzc2 > i8) {
                            z2 = false;
                            zzgucVar.zzf(new zzzz(i6, zzbgVar2, i22, zzzlVar2, iArr4[i22], str2, i15, z2));
                            i22++;
                            zzbgVar2 = zzbgVar;
                            i7 = i9;
                        }
                    } else {
                        i9 = i7;
                    }
                    z2 = true;
                    zzgucVar.zzf(new zzzz(i6, zzbgVar2, i22, zzzlVar2, iArr4[i22], str2, i15, z2));
                    i22++;
                    zzbgVar2 = zzbgVar;
                    i7 = i9;
                }
                return zzgucVar.zzi();
            }
        }, zzzb.zza);
        boolean z2 = zzzlVar.zzE;
        int i6 = 4;
        Pair zzw3 = zzw2 == null ? zzw(4, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzze
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i7, zzbg zzbgVar, int[] iArr4) {
                int i8 = zzaaa.zzb;
                int i9 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i10 = 0; i10 < zzbgVar.zza; i10++) {
                    zzgucVar.zzf(new zzzi(i7, zzbgVar, i10, zzzl.this, iArr4[i10]));
                }
                return zzgucVar.zzi();
            }
        }, zzyz.zza) : null;
        if (zzw3 != null) {
            zzaabVarArr[((Integer) zzw3.second).intValue()] = (zzaab) zzw3.first;
        } else if (zzw2 != null) {
            zzaabVarArr[((Integer) zzw2.second).intValue()] = (zzaab) zzw2.first;
        }
        if (!zzzlVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str = null;
        } else {
            String str3 = zzfj.zza;
            str = locale.toLanguageTag();
        }
        int i7 = 3;
        Pair zzw4 = zzw(3, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzd
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i8, zzbg zzbgVar, int[] iArr4) {
                int i9 = zzaaa.zzb;
                int i10 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i11 = 0; i11 < zzbgVar.zza; i11++) {
                    zzgucVar.zzf(new zzzq(i8, zzbgVar, i11, zzzl.this, iArr4[i11], str2, str));
                }
                return zzgucVar.zzi();
            }
        }, zzza.zza);
        if (zzw4 != null) {
            zzaabVarArr[((Integer) zzw4.second).intValue()] = (zzaab) zzw4.first;
        }
        int i8 = 0;
        while (i8 < i2) {
            int zza = zzaafVar.zza(i8);
            if (zza != i2 && zza != i && zza != i7 && zza != i6) {
                zzyn zzb2 = zzaafVar.zzb(i8);
                int[][] iArr4 = iArr[i8];
                int i9 = i3;
                int i10 = i9;
                zzbg zzbgVar = null;
                zzzj zzzjVar = null;
                while (i9 < zzb2.zzb) {
                    zzbg zza2 = zzb2.zza(i9);
                    int[] iArr5 = iArr4[i9];
                    zzzj zzzjVar2 = zzzjVar;
                    for (int i11 = i3; i11 < zza2.zza; i11++) {
                        if (zzmn.zzaa(iArr5[i11], zzzlVar.zzV)) {
                            zzzj zzzjVar3 = new zzzj(zza2.zza(i11), iArr5[i11]);
                            if (zzzjVar2 == null || zzzjVar3.compareTo(zzzjVar2) > 0) {
                                zzbgVar = zza2;
                                zzzjVar2 = zzzjVar3;
                                i10 = i11;
                            }
                        }
                    }
                    i9++;
                    zzzjVar = zzzjVar2;
                    i3 = 0;
                }
                zzaabVarArr[i8] = zzbgVar == null ? null : new zzaab(zzbgVar, new int[]{i10}, 0);
            }
            i8++;
            i2 = 2;
            i3 = 0;
            i7 = 3;
            i = 1;
            i6 = 4;
        }
        HashMap hashMap = new HashMap();
        int i12 = 2;
        for (int i13 = 0; i13 < 2; i13++) {
            zzv(zzaafVar.zzb(i13), zzzlVar, hashMap);
        }
        zzv(zzaafVar.zze(), zzzlVar, hashMap);
        for (int i14 = 0; i14 < 2; i14++) {
            if (((zzbh) hashMap.get(Integer.valueOf(zzaafVar.zza(i14)))) != null) {
                throw null;
            }
        }
        int i15 = 0;
        while (i15 < i12) {
            zzyn zzb3 = zzaafVar.zzb(i15);
            if (zzzlVar.zzb(i15, zzb3)) {
                if (zzzlVar.zzc(i15, zzb3) != null) {
                    throw null;
                }
                zzaabVarArr[i15] = null;
            }
            i15++;
            i12 = 2;
        }
        int i16 = 0;
        while (i16 < i12) {
            int zza3 = zzaafVar.zza(i16);
            if (zzzlVar.zza(i16) || zzzlVar.zzI.contains(Integer.valueOf(zza3))) {
                zzaabVarArr[i16] = null;
            }
            i16++;
            i12 = 2;
        }
        zzyt zzytVar = this.zzj;
        zzaas zzt = zzt();
        zzguf zzd = zzyu.zzd(zzaabVarArr);
        int i17 = 2;
        zzaac[] zzaacVarArr = new zzaac[2];
        int i18 = 0;
        while (i18 < i17) {
            zzaab zzaabVar = zzaabVarArr[i18];
            if (zzaabVar != null && (length = (iArr3 = zzaabVar.zzb).length) != 0) {
                zzaacVarArr[i18] = length == 1 ? new zzaad(zzaabVar.zza, iArr3[0], 0, 0, null) : zzytVar.zza(zzaabVar.zza, iArr3, 0, zzt, (zzguf) zzd.get(i18));
            }
            i18++;
            i17 = 2;
        }
        zzmo[] zzmoVarArr = new zzmo[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            zzmoVarArr[i19] = (zzzlVar.zza(i19) || zzzlVar.zzI.contains(Integer.valueOf(zzaafVar.zza(i19))) || (zzaafVar.zza(i19) != -2 && zzaacVarArr[i19] == null)) ? null : zzmo.zza;
        }
        boolean z3 = zzzlVar.zzW;
        return Pair.create(zzmoVarArr, zzaacVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ boolean zzk(zzzl zzzlVar, zzv zzvVar) {
        Boolean bool;
        zzzp zzzpVar;
        zzzp zzzpVar2;
        if (!zzzlVar.zzU || ((bool = this.zzi) != null && bool.booleanValue())) {
            return true;
        }
        int i = zzvVar.zzG;
        char c = 65535;
        if (i != -1 && i > 2) {
            String str = zzvVar.zzo;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 187078296:
                        if (str.equals("audio/ac3")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1504578661:
                        if (str.equals("audio/eac3")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if ((c == 0 || c == 1 || c == 2 || c == 3) && (Build.VERSION.SDK_INT < 32 || (zzzpVar2 = this.zzg) == null || !zzzpVar2.zza())) {
                    return true;
                }
            }
            return Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza() && zzzpVar.zzb() && this.zzg.zzc() && this.zzg.zzd(this.zzh, zzvVar);
        }
        return true;
    }
}
