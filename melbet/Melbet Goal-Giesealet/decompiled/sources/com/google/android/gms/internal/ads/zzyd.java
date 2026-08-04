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

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzyd extends zzyj implements zzlm {
    public static final /* synthetic */ int zzb = 0;
    private static final zzglj zzc = zzglj.zzc(zzxj.zza);
    public final Context zza;
    private final Object zzd;
    private zzxo zze;
    private Thread zzf;
    private zzxs zzg;
    private zzc zzh;
    private Boolean zzi;
    private final zzww zzj;

    public zzyd(Context context) {
        zzww zzwwVar = new zzww();
        zzxo zzxoVar = zzxo.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzwwVar;
        if (zzxoVar instanceof zzxo) {
            this.zze = zzxoVar;
        } else {
            zzxn zzxnVar = new zzxn(zzxoVar, bArr);
            zzxnVar.zzx((zzbk) zzxoVar);
            this.zze = new zzxo(zzxnVar, bArr);
        }
        this.zzh = zzc.zza;
        if (this.zze.zzU && context == null) {
            zzds.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int zzj(zzu zzuVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzuVar.zzd)) {
            return 4;
        }
        String zzi = zzi(str);
        String zzi2 = zzi(zzuVar.zzd);
        if (zzi2 == null || zzi == null) {
            return (z && zzi2 == null) ? 1 : 0;
        }
        if (zzi2.startsWith(zzi) || zzi.startsWith(zzi2)) {
            return 3;
        }
        String str2 = zzeo.zza;
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
    static /* synthetic */ int zzn(zzu zzuVar, zzgjz zzgjzVar) {
        int i = 0;
        while (i < zzgjzVar.size()) {
            int i2 = 0;
            while (true) {
                List list = zzuVar.zzc;
                if (i2 < list.size()) {
                    if (((zzw) list.get(i2)).zzb.equals(zzgjzVar.get(i))) {
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
        zzxs zzxsVar;
        synchronized (this.zzd) {
            z = false;
            if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzxsVar = this.zzg) != null && zzxsVar.zza()) {
                z = true;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static void zzv(zzwq zzwqVar, zzbk zzbkVar, Map map) {
        for (int i = 0; i < zzwqVar.zzb; i++) {
            if (((zzbg) zzbkVar.zzH.get(zzwqVar.zza(i))) != null) {
                throw null;
            }
        }
    }

    private static final Pair zzw(int i, zzyi zzyiVar, int[][][] iArr, zzxu zzxuVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzyi zzyiVar2 = zzyiVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzyiVar2.zza(i2)) {
                zzwq zzb2 = zzyiVar2.zzb(i2);
                for (int i3 = 0; i3 < zzb2.zzb; i3++) {
                    zzbf zza = zzb2.zza(i3);
                    List zza2 = zzxuVar.zza(i2, zza, iArr[i2][i3]);
                    int i4 = zza.zza;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        zzxv zzxvVar = (zzxv) zza2.get(i5);
                        int zza3 = zzxvVar.zza();
                        if (!zArr[i5] && zza3 != 0) {
                            if (zza3 == 1) {
                                randomAccess = zzgjz.zzj(zzxvVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzxvVar);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    zzxv zzxvVar2 = (zzxv) zza2.get(i7);
                                    if (zzxvVar2.zza() == 2 && zzxvVar.zzc(zzxvVar2)) {
                                        arrayList2.add(zzxvVar2);
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
            zzyiVar2 = zzyiVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzxv) list.get(i8)).zzc;
        }
        zzxv zzxvVar3 = (zzxv) list.get(0);
        return Pair.create(new zzye(zzxvVar3.zzb, iArr2, 0), Integer.valueOf(zzxvVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zza(zzll zzllVar) {
        synchronized (this.zzd) {
            boolean z = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zzb() {
        zzxs zzxsVar;
        synchronized (this.zzd) {
            Thread thread = this.zzf;
            if (thread != null) {
                zzghc.zzi(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzxsVar = this.zzg) != null) {
            zzxsVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzxo zzc() {
        zzxo zzxoVar;
        synchronized (this.zzd) {
            zzxoVar = this.zze;
        }
        return zzxoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zze(zzc zzcVar) {
        if (this.zzh.equals(zzcVar)) {
            return;
        }
        this.zzh = zzcVar;
        zzl();
    }

    public final void zzf(zzxn zzxnVar) {
        boolean equals;
        zzxo zzxoVar = new zzxo(zzxnVar, null);
        synchronized (this.zzd) {
            equals = this.zze.equals(zzxoVar);
            this.zze = zzxoVar;
        }
        if (equals) {
            return;
        }
        if (zzxoVar.zzU && this.zza == null) {
            zzds.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final zzlm zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    protected final Pair zzh(zzyi zzyiVar, int[][][] iArr, final int[] iArr2, zzup zzupVar, zzbe zzbeVar) throws zzhz {
        final zzxo zzxoVar;
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
            zzxoVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzeo.zzN(context3));
        }
        if (zzxoVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzxs(this.zza, this, this.zzi);
        }
        int i2 = 2;
        zzye[] zzyeVarArr = new zzye[2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (zzyiVar.zza(i4) == 2 && zzyiVar.zzb(i4).zzb > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair zzw = zzw(1, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxf
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ List zza(int i5, zzbf zzbfVar, int[] iArr4) {
                final zzyd zzydVar = zzyd.this;
                final zzxo zzxoVar2 = zzxoVar;
                zzghd zzghdVar = new zzghd() { // from class: com.google.android.gms.internal.ads.zzxi
                    @Override // com.google.android.gms.internal.ads.zzghd
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzyd.this.zzk(zzxoVar2, (zzu) obj);
                    }
                };
                int i6 = iArr2[i5];
                int i7 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                for (int i8 = 0; i8 < zzbfVar.zza; i8++) {
                    zzgjwVar.zzf(new zzxa(i5, zzbfVar, i8, zzxoVar2, iArr4[i8], z, zzghdVar, i6));
                }
                return zzgjwVar.zzi();
            }
        }, zzxb.zza);
        if (zzw != null) {
            zzyeVarArr[((Integer) zzw.second).intValue()] = (zzye) zzw.first;
        }
        final String str2 = zzw == null ? null : ((zzye) zzw.first).zza.zza(((zzye) zzw.first).zzb[0]).zzd;
        int i5 = zzxoVar.zzw.zzb;
        final Point zzP = (!zzxoVar.zzk || (context2 = this.zza) == null) ? null : zzeo.zzP(context2);
        Pair zzw2 = zzw(2, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxk
            /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
            @Override // com.google.android.gms.internal.ads.zzxu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final /* synthetic */ List zza(int i6, zzbf zzbfVar, int[] iArr4) {
                int i7;
                int i8;
                int i9;
                boolean z2;
                int i10;
                int i11;
                int i12;
                Point point;
                int i13;
                zzbf zzbfVar2 = zzbfVar;
                int i14 = zzyd.zzb;
                Point point2 = zzP;
                int i15 = iArr2[i6];
                zzxo zzxoVar2 = zzxo.this;
                int i16 = point2 != null ? point2.x : zzxoVar2.zzi;
                int i17 = point2 != null ? point2.y : zzxoVar2.zzj;
                boolean z3 = zzxoVar2.zzl;
                if (i16 == Integer.MAX_VALUE) {
                    i7 = -1;
                    i8 = Integer.MAX_VALUE;
                } else if (i17 == Integer.MAX_VALUE) {
                    i8 = Integer.MAX_VALUE;
                    i7 = -1;
                } else {
                    int i18 = Integer.MAX_VALUE;
                    for (int i19 = 0; i19 < zzbfVar2.zza; i19++) {
                        zzu zza = zzbfVar2.zza(i19);
                        int i20 = zza.zzv;
                        if (i20 > 0 && (i10 = zza.zzw) > 0) {
                            if (z3) {
                                if ((i20 > i10) != (i16 > i17)) {
                                    i12 = i17;
                                    i11 = i16;
                                    if (i20 * i11 < i10 * i12) {
                                        String str3 = zzeo.zza;
                                        point = new Point(i12, ((r10 + i20) - 1) / i20);
                                    } else {
                                        String str4 = zzeo.zza;
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
                int i21 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                int i22 = 0;
                while (i22 < zzbfVar2.zza) {
                    int zzc2 = zzbfVar2.zza(i22).zzc();
                    if (i8 != Integer.MAX_VALUE) {
                        i9 = i7;
                        if (zzc2 == i9 || zzc2 > i8) {
                            z2 = false;
                            zzgjwVar.zzf(new zzyc(i6, zzbfVar2, i22, zzxoVar2, iArr4[i22], str2, i15, z2));
                            i22++;
                            zzbfVar2 = zzbfVar;
                            i7 = i9;
                        }
                    } else {
                        i9 = i7;
                    }
                    z2 = true;
                    zzgjwVar.zzf(new zzyc(i6, zzbfVar2, i22, zzxoVar2, iArr4[i22], str2, i15, z2));
                    i22++;
                    zzbfVar2 = zzbfVar;
                    i7 = i9;
                }
                return zzgjwVar.zzi();
            }
        }, zzxe.zza);
        boolean z2 = zzxoVar.zzE;
        int i6 = 4;
        Pair zzw3 = zzw2 == null ? zzw(4, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxh
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ List zza(int i7, zzbf zzbfVar, int[] iArr4) {
                int i8 = zzyd.zzb;
                int i9 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                for (int i10 = 0; i10 < zzbfVar.zza; i10++) {
                    zzgjwVar.zzf(new zzxl(i7, zzbfVar, i10, zzxo.this, iArr4[i10]));
                }
                return zzgjwVar.zzi();
            }
        }, zzxc.zza) : null;
        if (zzw3 != null) {
            zzyeVarArr[((Integer) zzw3.second).intValue()] = (zzye) zzw3.first;
        } else if (zzw2 != null) {
            zzyeVarArr[((Integer) zzw2.second).intValue()] = (zzye) zzw2.first;
        }
        if (!zzxoVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str = null;
        } else {
            String str3 = zzeo.zza;
            str = locale.toLanguageTag();
        }
        int i7 = 3;
        Pair zzw4 = zzw(3, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxg
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ List zza(int i8, zzbf zzbfVar, int[] iArr4) {
                int i9 = zzyd.zzb;
                int i10 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                for (int i11 = 0; i11 < zzbfVar.zza; i11++) {
                    zzgjwVar.zzf(new zzxt(i8, zzbfVar, i11, zzxo.this, iArr4[i11], str2, str));
                }
                return zzgjwVar.zzi();
            }
        }, zzxd.zza);
        if (zzw4 != null) {
            zzyeVarArr[((Integer) zzw4.second).intValue()] = (zzye) zzw4.first;
        }
        int i8 = 0;
        while (i8 < i2) {
            int zza = zzyiVar.zza(i8);
            if (zza != i2 && zza != i && zza != i7 && zza != i6) {
                zzwq zzb2 = zzyiVar.zzb(i8);
                int[][] iArr4 = iArr[i8];
                int i9 = i3;
                int i10 = i9;
                zzbf zzbfVar = null;
                zzxm zzxmVar = null;
                while (i9 < zzb2.zzb) {
                    zzbf zza2 = zzb2.zza(i9);
                    int[] iArr5 = iArr4[i9];
                    zzxm zzxmVar2 = zzxmVar;
                    for (int i11 = i3; i11 < zza2.zza; i11++) {
                        if (zzln.zzZ(iArr5[i11], zzxoVar.zzV)) {
                            zzxm zzxmVar3 = new zzxm(zza2.zza(i11), iArr5[i11]);
                            if (zzxmVar2 == null || zzxmVar3.compareTo(zzxmVar2) > 0) {
                                zzbfVar = zza2;
                                zzxmVar2 = zzxmVar3;
                                i10 = i11;
                            }
                        }
                    }
                    i9++;
                    zzxmVar = zzxmVar2;
                    i3 = 0;
                }
                zzyeVarArr[i8] = zzbfVar == null ? null : new zzye(zzbfVar, new int[]{i10}, 0);
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
            zzv(zzyiVar.zzb(i13), zzxoVar, hashMap);
        }
        zzv(zzyiVar.zze(), zzxoVar, hashMap);
        for (int i14 = 0; i14 < 2; i14++) {
            if (((zzbg) hashMap.get(Integer.valueOf(zzyiVar.zza(i14)))) != null) {
                throw null;
            }
        }
        int i15 = 0;
        while (i15 < i12) {
            zzwq zzb3 = zzyiVar.zzb(i15);
            if (zzxoVar.zzb(i15, zzb3)) {
                if (zzxoVar.zzc(i15, zzb3) != null) {
                    throw null;
                }
                zzyeVarArr[i15] = null;
            }
            i15++;
            i12 = 2;
        }
        int i16 = 0;
        while (i16 < i12) {
            int zza3 = zzyiVar.zza(i16);
            if (zzxoVar.zza(i16) || zzxoVar.zzI.contains(Integer.valueOf(zza3))) {
                zzyeVarArr[i16] = null;
            }
            i16++;
            i12 = 2;
        }
        zzww zzwwVar = this.zzj;
        zzyu zzt = zzt();
        zzgjz zzd = zzwx.zzd(zzyeVarArr);
        int i17 = 2;
        zzyf[] zzyfVarArr = new zzyf[2];
        int i18 = 0;
        while (i18 < i17) {
            zzye zzyeVar = zzyeVarArr[i18];
            if (zzyeVar != null && (length = (iArr3 = zzyeVar.zzb).length) != 0) {
                zzyfVarArr[i18] = length == 1 ? new zzyg(zzyeVar.zza, iArr3[0], 0, 0, null) : zzwwVar.zza(zzyeVar.zza, iArr3, 0, zzt, (zzgjz) zzd.get(i18));
            }
            i18++;
            i17 = 2;
        }
        zzlo[] zzloVarArr = new zzlo[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            zzloVarArr[i19] = (zzxoVar.zza(i19) || zzxoVar.zzI.contains(Integer.valueOf(zzyiVar.zza(i19))) || (zzyiVar.zza(i19) != -2 && zzyfVarArr[i19] == null)) ? null : zzlo.zza;
        }
        boolean z3 = zzxoVar.zzW;
        return Pair.create(zzloVarArr, zzyfVarArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r4.equals("audio/eac3") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 32) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r4 = r3.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r4 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r4.zza() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r4.equals("audio/ac4") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r4.equals("audio/ac3") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r4.equals("audio/eac3-joc") != false) goto L31;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ boolean zzk(zzxo zzxoVar, zzu zzuVar) {
        Boolean bool;
        int i;
        zzxs zzxsVar;
        if (!zzxoVar.zzU || (((bool = this.zzi) != null && bool.booleanValue()) || (i = zzuVar.zzG) == -1 || i <= 2)) {
            return true;
        }
        String str = zzuVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    break;
                case 187078296:
                    break;
                case 187078297:
                    break;
                case 1504578661:
                    break;
            }
            return true;
        }
        return Build.VERSION.SDK_INT >= 32 && (zzxsVar = this.zzg) != null && zzxsVar.zza() && zzxsVar.zzb() && this.zzg.zzc() && this.zzg.zzd(this.zzh, zzuVar);
    }
}
