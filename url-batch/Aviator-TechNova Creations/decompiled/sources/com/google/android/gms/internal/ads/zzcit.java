package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcit extends zzcfv implements zzhz, zzna {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcid zzc;
    private final zzaaa zzd;
    private final zzcgd zze;
    private final WeakReference zzf;
    private final zzxt zzg;
    private zzjh zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcfu zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcig zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzcw)).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
    
        if (r5.zzl == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcij(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        if (r5.zzi == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcim(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
    
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
    
        if (r4.limit() <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcin(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r5.zzh <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcil(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcik(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (r5.zzi == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcit(Context context, zzcgd zzcgdVar, zzcge zzcgeVar, Integer num) {
        final zzha zzhaVar;
        this.zzb = context;
        this.zze = zzcgdVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzcgeVar);
        zzcid zzcidVar = new zzcid();
        this.zzc = zzcidVar;
        zzaaa zzaaaVar = new zzaaa(context);
        this.zzd = zzaaaVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzf().incrementAndGet();
        zzmu zzmuVar = new zzmu(context, new zzmq() { // from class: com.google.android.gms.internal.ads.zzcio
            @Override // com.google.android.gms.internal.ads.zzmq
            public final /* synthetic */ zzml[] zza(Handler handler, zzadm zzadmVar, zzrc zzrcVar, zzyq zzyqVar, zzvi zzviVar) {
                return zzcit.this.zzW(handler, zzadmVar, zzrcVar, zzyqVar, zzviVar);
            }
        });
        zzmuVar.zza(zzaaaVar);
        zzmuVar.zzb(zzcidVar);
        zzmv zzc = zzmuVar.zzc();
        this.zzh = zzc;
        zzc.zzD(this);
        final boolean z = false;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzgra.zzd(zzcgeVar != null ? zzcgeVar.zzn() : null).zza("");
        this.zzp = zzcgeVar != null ? zzcgeVar.zzp() : 0;
        final String zze = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcgeVar.zzs().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcE)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.zzi.limit()];
            this.zzi.get(bArr);
            zzhaVar = new zzha() { // from class: com.google.android.gms.internal.ads.zzcii
                @Override // com.google.android.gms.internal.ads.zzha
                public final /* synthetic */ zzhb zza() {
                    int i = zzcit.zza;
                    return new zzgw(bArr);
                }
            };
        }
        this.zzg = new zzxt(zzhaVar, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzp)).booleanValue() ? zzciq.zza : zzcip.zza);
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzA(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcic zzcicVar = (zzcic) ((WeakReference) it.next()).get();
            if (zzcicVar != null) {
                zzcicVar.zzk(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final int zzC() {
        return this.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzD() {
        return this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzE(boolean z) {
        this.zzh.zzj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzF(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzG(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzH() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j = this.zzn;
                    Map zzj = ((zzhu) arrayList.remove(0)).zzj();
                    long j2 = 0;
                    if (zzj != null) {
                        Iterator it = zzj.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzgql.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzM(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzF();
            if (i >= 2) {
                return;
            }
            zzaaa zzaaaVar = this.zzd;
            zzzk zzd = zzaaaVar.zzc().zzd();
            zzd.zzy(i, !z);
            zzaaaVar.zzf(zzd);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzN() {
        return this.zzh.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzO() {
        return this.zzl;
    }

    final zzwm zzR(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.zzb(uri);
        zzak zzc = zzzVar.zzc();
        zzxt zzxtVar = this.zzg;
        zzxtVar.zza(this.zze.zzf);
        return zzxtVar.zzb(zzc);
    }

    final /* synthetic */ zzhb zzS(String str, boolean z) {
        zzcit zzcitVar = true != z ? null : this;
        zzcgd zzcgdVar = this.zze;
        return new zzciw(str, zzcitVar, zzcgdVar.zzd, zzcgdVar.zze, zzcgdVar.zzm, zzcgdVar.zzn);
    }

    final /* synthetic */ zzhb zzT(String str, boolean z) {
        zzhi zzhiVar = new zzhi();
        zzhiVar.zzb(str);
        zzhiVar.zzf(true != z ? null : this);
        zzcgd zzcgdVar = this.zze;
        zzhiVar.zzc(zzcgdVar.zzd);
        zzhiVar.zzd(zzcgdVar.zze);
        zzhiVar.zze(true);
        return zzhiVar.zza();
    }

    final /* synthetic */ zzhb zzU(String str, boolean z) {
        zzcit zzcitVar = true != z ? null : this;
        zzcgd zzcgdVar = this.zze;
        zzcic zzcicVar = new zzcic(str, zzcitVar, zzcgdVar.zzd, zzcgdVar.zze, zzcgdVar.zzh);
        this.zzu.add(new WeakReference(zzcicVar));
        return zzcicVar;
    }

    final /* synthetic */ zzhb zzV(zzha zzhaVar) {
        zzhb zza2 = zzhaVar.zza();
        zzcie zzcieVar = new zzcie() { // from class: com.google.android.gms.internal.ads.zzcir
            @Override // com.google.android.gms.internal.ads.zzcie
            public final /* synthetic */ void zza(boolean z, long j) {
                zzcit.this.zzX(z, j);
            }
        };
        return new zzcig(this.zzb, zza2, this.zzo, this.zzp, this, zzcieVar);
    }

    final /* synthetic */ zzml[] zzW(Handler handler, zzadm zzadmVar, zzrc zzrcVar, zzyq zzyqVar, zzvi zzviVar) {
        zzuw zzuwVar = zzuw.zzb;
        Context context = this.zzb;
        zzta zztaVar = new zzta(context, new zzuc(context, null, null), zzuwVar, false, handler, zzrcVar, new zzsp(context).zza());
        zzaca zzacaVar = new zzaca(context);
        zzacaVar.zza(zzuwVar);
        zzacaVar.zzb(handler);
        zzacaVar.zzc(zzadmVar);
        return new zzml[]{zztaVar, zzacaVar.zzd()};
    }

    final /* synthetic */ void zzX(boolean z, long j) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzr(z, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z) {
        if (zzhbVar instanceof zzhu) {
            synchronized (this.zzq) {
                this.zzs.add((zzhu) zzhbVar);
            }
        } else if (zzhbVar instanceof zzcig) {
            this.zzt = (zzcig) zzhbVar;
            final zzcge zzcgeVar = (zzcge) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() && zzcgeVar != null && this.zzt.zzk()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcis
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i = zzcit.zza;
                        zzcge.this.zze("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z, int i) {
        this.zzl += i;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zze(zzmy zzmyVar, int i) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzg(zzmy zzmyVar, zzau zzauVar) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzu("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzh(zzmy zzmyVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            if (this.zze.zzj) {
                zzcfuVar.zzv("onLoadException", iOException);
            } else {
                zzcfuVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzk(zzmy zzmyVar, zzv zzvVar, zzio zzioVar) {
        zzcge zzcgeVar = (zzcge) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() || zzcgeVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzvVar.zzn;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcgeVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzl(zzmy zzmyVar, zzv zzvVar, zzio zzioVar) {
        zzcge zzcgeVar = (zzcge) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() || zzcgeVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzvVar.zzz));
        hashMap.put("bitRate", String.valueOf(zzvVar.zzj));
        int i = zzvVar.zzv;
        int i2 = zzvVar.zzw;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        hashMap.put("resolution", sb.toString());
        String str = zzvVar.zzn;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcgeVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzm(zzmy zzmyVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzn(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzo(zzmy zzmyVar, Object obj, long j) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(zzmy zzmyVar, zzbv zzbvVar) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzs(zzcfu zzcfuVar) {
        this.zzk = zzcfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzt() {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzu(Surface surface, boolean z) {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzC(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzv(float f, boolean z) {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzB(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzw() {
        this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzx(long j) {
        this.zzh.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzy(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzz(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzwm zzxbVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzxbVar = zzR(uriArr[0]);
            } else {
                zzwm[] zzwmVarArr = new zzwm[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzwmVarArr[i] = zzR(uriArr[i]);
                }
                zzxbVar = new zzxb(false, false, new zzvv(), zzwmVarArr);
            }
            this.zzh.zzG(zzxbVar);
            this.zzh.zzg();
            zzi().incrementAndGet();
        }
    }
}
