package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbog {
    private final Context zzb;
    private final String zzc;
    private final zzcbt zzd;
    private final zzfkk zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;
    private zzbof zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbog(Context context, zzcbt zzcbtVar, String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, zzfkk zzfkkVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcbtVar;
        this.zze = zzfkkVar;
        this.zzf = zzbdVar;
        this.zzg = zzbdVar2;
    }

    public final zzboa zzb(zzasi zzasiVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (this.zza) {
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                zzbof zzbofVar = this.zzh;
                if (zzbofVar != null && this.zzi == 0) {
                    zzbofVar.zzi(new zzccj() { // from class: com.google.android.gms.internal.ads.zzbnm
                        @Override // com.google.android.gms.internal.ads.zzccj
                        public final void zza(Object obj) {
                            zzbog.this.zzk((zzbnb) obj);
                        }
                    }, new zzcch() { // from class: com.google.android.gms.internal.ads.zzbnn
                        @Override // com.google.android.gms.internal.ads.zzcch
                        public final void zza() {
                        }
                    });
                }
            }
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
            zzbof zzbofVar2 = this.zzh;
            if (zzbofVar2 != null && zzbofVar2.zze() != -1) {
                int i = this.zzi;
                if (i == 0) {
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                if (i != 1) {
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                    return this.zzh.zza();
                }
                this.zzi = 2;
                zzd(null);
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            this.zzh = zzd(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
            return this.zzh.zza();
        }
    }

    protected final zzbof zzd(zzasi zzasiVar) {
        zzfjw zza = zzfjv.zza(this.zzb, 6);
        zza.zzh();
        final zzbof zzbofVar = new zzbof(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzasi zzasiVar2 = null;
        zzcca.zze.execute(new Runnable(zzasiVar2, zzbofVar) { // from class: com.google.android.gms.internal.ads.zzbnq
            public final /* synthetic */ zzbof zzb;

            {
                this.zzb = zzbofVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbog.this.zzj(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbofVar.zzi(new zzbnv(this, zzbofVar, zza), new zzbnw(this, zzbofVar, zza));
        return zzbofVar;
    }

    final /* synthetic */ void zzi(zzbof zzbofVar, final zzbnb zzbnbVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbofVar.zze() != -1 && zzbofVar.zze() != 1) {
                zzbofVar.zzg();
                zzcca.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbno
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbnb.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzc)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbofVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - j) + " ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    final /* synthetic */ void zzj(zzasi zzasiVar, zzbof zzbofVar) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            zzbnj zzbnjVar = new zzbnj(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbnjVar.zzk(new zzbnp(this, arrayList, currentTimeMillis, zzbofVar, zzbnjVar));
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbnjVar.zzq("/jsLoaded", new zzbnr(this, currentTimeMillis, zzbofVar, zzbnjVar));
            com.google.android.gms.ads.internal.util.zzcc zzccVar = new com.google.android.gms.ads.internal.util.zzcc();
            zzbns zzbnsVar = new zzbns(this, null, zzbnjVar, zzccVar);
            zzccVar.zzb(zzbnsVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbnjVar.zzq("/requestReload", zzbnsVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbnjVar.zzh(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.zzc.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbnjVar.zzf(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbnjVar.zzg(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new zzbnu(this, zzbofVar, zzbnjVar, arrayList, currentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzd)).intValue());
        } catch (Throwable th) {
            zzcbn.zzh("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbofVar.zzg();
        }
    }

    final /* synthetic */ void zzk(zzbnb zzbnbVar) {
        if (zzbnbVar.zzi()) {
            this.zzi = 1;
        }
    }
}
