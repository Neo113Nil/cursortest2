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

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcgi extends zzcdn implements zzhs, zzmm {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcft zzc;
    private final zzxw zzd;
    private final zzcdv zze;
    private final WeakReference zzf;
    private final zzvp zzg;
    private zzjd zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcdm zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcfv zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzbO)).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
    
        if (r5.zzm == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcfz(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        if (r5.zzj == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcgc(r3, r6);
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
        r5 = new com.google.android.gms.internal.ads.zzcgd(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r5.zzi <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcga(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcgb(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (r5.zzj == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcgi(Context context, zzcdv zzcdvVar, zzcdw zzcdwVar, Integer num) {
        final zzgp zzgpVar;
        this.zzb = context;
        this.zze = zzcdvVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzcdwVar);
        zzcft zzcftVar = new zzcft();
        this.zzc = zzcftVar;
        zzxw zzxwVar = new zzxw(context);
        this.zzd = zzxwVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzD().incrementAndGet();
        zzme zzmeVar = new zzme(context, new zzcgf(this));
        zzmeVar.zzb(zzxwVar);
        zzmeVar.zza(zzcftVar);
        zzmf zzc = zzmeVar.zzc();
        this.zzh = zzc;
        zzc.zzz(this);
        final boolean z = false;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzftu.zzd(zzcdwVar != null ? zzcdwVar.zzbm() : null).zzb("");
        this.zzp = zzcdwVar != null ? zzcdwVar.zzf() : 0;
        final String zzc2 = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzcdwVar.zzn().zza);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbW)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.zzi.limit()];
            this.zzi.get(bArr);
            zzgpVar = new zzgp() { // from class: com.google.android.gms.internal.ads.zzcfx
                @Override // com.google.android.gms.internal.ads.zzgp
                public final zzgq zza() {
                    return new zzgl(bArr);
                }
            };
        }
        this.zzg = new zzvp(zzgpVar, new zzvo(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzo)).booleanValue() ? new zzacl() { // from class: com.google.android.gms.internal.ads.zzcgh
            @Override // com.google.android.gms.internal.ads.zzacl
            public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
                int i = zzack.zza;
                int i2 = zzcgi.zza;
                return new zzace[]{new zzail(0), new zzahd(0), new zzaig(0, null)};
            }
        } : new zzacl() { // from class: com.google.android.gms.internal.ads.zzcfy
            @Override // com.google.android.gms.internal.ads.zzacl
            public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
                int i = zzack.zza;
                int i2 = zzcgi.zza;
                return new zzace[]{new zzail(0), new zzahd(0)};
            }
        }));
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j = this.zzn;
                Map zze = ((zzhn) this.zzs.remove(0)).zze();
                long j2 = 0;
                if (zze != null) {
                    Iterator it = zze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzftf.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
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
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzH() {
        zzjd zzjdVar = this.zzh;
        if (zzjdVar != null) {
            zzjdVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzI(long j) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzJ(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzK(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzL(zzcdm zzcdmVar) {
        this.zzk = zzcdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzM(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzN(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzO(boolean z) {
        this.zzh.zzr(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzQ(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzy();
            if (i >= 2) {
                return;
            }
            zzxw zzxwVar = this.zzd;
            zzxi zzc = zzxwVar.zzd().zzc();
            zzc.zzp(i, !z);
            zzxwVar.zzk(zzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzR(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcfs zzcfsVar = (zzcfs) ((WeakReference) it.next()).get();
            if (zzcfsVar != null) {
                zzcfsVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzS(Surface surface, boolean z) {
        zzjd zzjdVar = this.zzh;
        if (zzjdVar != null) {
            zzjdVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzT(float f, boolean z) {
        zzjd zzjdVar = this.zzh;
        if (zzjdVar != null) {
            zzjdVar.zzt(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final boolean zzV() {
        return this.zzh != null;
    }

    final /* synthetic */ zzgq zzW(String str, boolean z) {
        zzcgi zzcgiVar = true != z ? null : this;
        zzcdv zzcdvVar = this.zze;
        return new zzcgl(str, zzcgiVar, zzcdvVar.zzd, zzcdvVar.zzf, zzcdvVar.zzn, zzcdvVar.zzo);
    }

    final /* synthetic */ zzgq zzX(String str, boolean z) {
        zzcgi zzcgiVar = true != z ? null : this;
        zzcdv zzcdvVar = this.zze;
        zzcfs zzcfsVar = new zzcfs(str, zzcgiVar, zzcdvVar.zzd, zzcdvVar.zzf, zzcdvVar.zzi);
        this.zzu.add(new WeakReference(zzcfsVar));
        return zzcfsVar;
    }

    final /* synthetic */ zzgq zzY(String str, boolean z) {
        zzgy zzgyVar = new zzgy();
        zzgyVar.zzf(str);
        zzgyVar.zze(true != z ? null : this);
        zzgyVar.zzc(this.zze.zzd);
        zzgyVar.zzd(this.zze.zzf);
        zzgyVar.zzb(true);
        return zzgyVar.zza();
    }

    final /* synthetic */ zzgq zzZ(zzgp zzgpVar) {
        zzgq zza2 = zzgpVar.zza();
        zzcgg zzcggVar = new zzcgg(this);
        return new zzcfv(this.zzb, zza2, this.zzo, this.zzp, this, zzcggVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zza(zzgq zzgqVar, zzgv zzgvVar, boolean z, int i) {
        this.zzl += i;
    }

    final zzum zzaa(Uri uri) {
        zzau zzauVar = new zzau();
        zzauVar.zzb(uri);
        zzbs zzc = zzauVar.zzc();
        zzvp zzvpVar = this.zzg;
        zzvpVar.zza(this.zze.zzg);
        return zzvpVar.zzb(zzc);
    }

    final /* synthetic */ void zzab(boolean z, long j) {
        zzcdm zzcdmVar = this.zzk;
        if (zzcdmVar != null) {
            zzcdmVar.zzi(z, j);
        }
    }

    final /* synthetic */ zzlz[] zzac(Handler handler, zzaau zzaauVar, zzpo zzpoVar, zzwo zzwoVar, zztk zztkVar) {
        zzsu zzsuVar = zzsu.zzb;
        zzox zzoxVar = zzox.zza;
        zzdy[] zzdyVarArr = new zzdy[0];
        zzqk zzqkVar = new zzqk();
        zzox zzoxVar2 = zzox.zza;
        if (zzoxVar == null) {
            if (zzoxVar2 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            zzoxVar = zzoxVar2;
        }
        Context context = this.zzb;
        zzqkVar.zzc(zzoxVar);
        zzqkVar.zzd(zzdyVarArr);
        return new zzlz[]{new zzrc(context, zzsj.zza, zzsuVar, false, handler, zzpoVar, zzqkVar.zze()), new zzzw(this.zzb, zzsj.zza, zzsu.zzb, 0L, false, handler, zzaauVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzb(zzgq zzgqVar, zzgv zzgvVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzc(zzgq zzgqVar, zzgv zzgvVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd(zzgq zzgqVar, zzgv zzgvVar, boolean z) {
        if (zzgqVar instanceof zzhn) {
            synchronized (this.zzq) {
                this.zzs.add((zzhn) zzgqVar);
            }
        } else if (zzgqVar instanceof zzcfv) {
            this.zzt = (zzcfv) zzgqVar;
            final zzcdw zzcdwVar = (zzcdw) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue() && zzcdwVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcge
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = zzcgi.zza;
                        zzcdw.this.zzd("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zze(zzmk zzmkVar, zzam zzamVar, zzim zzimVar) {
        zzcdw zzcdwVar = (zzcdw) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue() || zzcdwVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzamVar.zzl;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcdwVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void zzf(zzmk zzmkVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void zzg(zzmk zzmkVar, zzug zzugVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zzh(zzmk zzmkVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void zzi(zzcr zzcrVar, zzml zzmlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zzj(zzmk zzmkVar, zzub zzubVar, zzug zzugVar, IOException iOException, boolean z) {
        zzcdm zzcdmVar = this.zzk;
        if (zzcdmVar != null) {
            if (this.zze.zzk) {
                zzcdmVar.zzl("onLoadException", iOException);
            } else {
                zzcdmVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zzk(zzmk zzmkVar, int i) {
        zzcdm zzcdmVar = this.zzk;
        if (zzcdmVar != null) {
            zzcdmVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zzl(zzmk zzmkVar, zzch zzchVar) {
        zzcdm zzcdmVar = this.zzk;
        if (zzcdmVar != null) {
            zzcdmVar.zzk("onPlayerError", zzchVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void zzm(zzmk zzmkVar, zzcq zzcqVar, zzcq zzcqVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zzn(zzmk zzmkVar, Object obj, long j) {
        zzcdm zzcdmVar = this.zzk;
        if (zzcdmVar != null) {
            zzcdmVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void zzo(zzmk zzmkVar, zzil zzilVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zzp(zzmk zzmkVar, zzam zzamVar, zzim zzimVar) {
        zzcdw zzcdwVar = (zzcdw) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue() || zzcdwVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzamVar.zzt));
        hashMap.put("bitRate", String.valueOf(zzamVar.zzi));
        hashMap.put("resolution", zzamVar.zzr + "x" + zzamVar.zzs);
        String str = zzamVar.zzl;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcdwVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zzq(zzmk zzmkVar, zzdu zzduVar) {
        zzcdm zzcdmVar = this.zzk;
        if (zzcdmVar != null) {
            zzcdmVar.zzD(zzduVar.zzc, zzduVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final long zzz() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzum zzvaVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzvaVar = zzaa(uriArr[0]);
            } else {
                zzum[] zzumVarArr = new zzum[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzumVarArr[i] = zzaa(uriArr[i]);
                }
                zzvaVar = new zzva(false, false, zzumVarArr);
            }
            this.zzh.zzB(zzvaVar);
            this.zzh.zzp();
            zzE().incrementAndGet();
        }
    }
}
