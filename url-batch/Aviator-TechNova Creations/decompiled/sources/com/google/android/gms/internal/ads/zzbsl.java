package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbsl {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzfor zze;
    private final com.google.android.gms.ads.internal.util.zzbc zzf;
    private final com.google.android.gms.ads.internal.util.zzbc zzg;
    private zzbsk zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbsl(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbc zzbcVar, com.google.android.gms.ads.internal.util.zzbc zzbcVar2, zzfor zzforVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzforVar;
        this.zzf = zzbcVar;
        this.zzg = zzbcVar2;
    }

    protected final zzbsk zza(zzazh zzazhVar) {
        zzfoe zzn = zzfoe.zzn(this.zzb, 6);
        zzn.zza();
        final zzbsk zzbskVar = new zzbsk(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzazh zzazhVar2 = null;
        zzcei.zzf.execute(new Runnable(zzazhVar2, zzbskVar) { // from class: com.google.android.gms.internal.ads.zzbsb
            private final /* synthetic */ zzbsk zzb;

            {
                this.zzb = zzbskVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbsl.this.zzd(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbskVar.zze(new zzbru(this, zzbskVar, zzn), new zzbrv(this, zzbskVar, zzn));
        return zzbskVar;
    }

    public final zzbsf zzb(zzazh zzazhVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (obj) {
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                zzbsk zzbskVar = this.zzh;
                if (zzbskVar != null && this.zzi == 0) {
                    zzbskVar.zze(new zzcer() { // from class: com.google.android.gms.internal.ads.zzbrx
                        @Override // com.google.android.gms.internal.ads.zzcer
                        public final /* synthetic */ void zza(Object obj2) {
                            zzbsl.this.zze((zzbrg) obj2);
                        }
                    }, zzbry.zza);
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        zzbsk zzbskVar2 = this.zzh;
        if (zzbskVar2 != null && zzbskVar2.zzi() != -1) {
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
            zza(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final void zzc() {
        zzbsk zzbskVar = this.zzh;
        if (zzbskVar != null) {
            zzbskVar.zzc();
            this.zzh = null;
        }
    }

    final /* synthetic */ void zzd(zzazh zzazhVar, final zzbsk zzbskVar) {
        final long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            final zzbro zzbroVar = new zzbro(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbroVar.zzi(new zzbrf() { // from class: com.google.android.gms.internal.ads.zzbrz
                @Override // com.google.android.gms.internal.ads.zzbrf
                public final /* synthetic */ void zza() {
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    final long j = currentTimeMillis;
                    final ArrayList arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(currentTimeMillis2 - j));
                    String valueOf = String.valueOf(arrayList2.get(0));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                    sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb.append(valueOf);
                    sb.append(" ms.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    final zzbsl zzbslVar = zzbsl.this;
                    final zzbsk zzbskVar2 = zzbskVar;
                    final zzbrg zzbrgVar = zzbroVar;
                    zzfynVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsa
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbsl.this.zzf(zzbskVar2, zzbrgVar, arrayList2, j);
                        }
                    }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzd)).intValue());
                }
            });
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbroVar.zzm("/jsLoaded", new zzbrq(this, currentTimeMillis, zzbskVar, zzbroVar));
            com.google.android.gms.ads.internal.util.zzbv zzbvVar = new com.google.android.gms.ads.internal.util.zzbv();
            zzbrr zzbrrVar = new zzbrr(this, null, zzbroVar, zzbvVar);
            zzbvVar.zzb(zzbrrVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            if (!((Boolean) zzbje.zzd.zze()).booleanValue() || TextUtils.equals(this.zzb.getPackageName(), "com.google.android.gms")) {
                zzbroVar.zzm("/requestReload", zzbrrVar);
            }
            String str = this.zzc;
            String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbroVar.zzf(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbroVar.zzh(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbroVar.zzg(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbrt(this, zzbskVar, zzbroVar, arrayList, currentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zze)).intValue());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziK)).booleanValue()) {
                zzbskVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziM)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbskVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbskVar.zzg();
            }
        }
    }

    final /* synthetic */ void zze(zzbrg zzbrgVar) {
        if (zzbrgVar.zzk()) {
            this.zzi = 1;
        }
    }

    final /* synthetic */ void zzf(zzbsk zzbskVar, final zzbrg zzbrgVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbskVar.zzi() != -1 && zzbskVar.zzi() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziK)).booleanValue()) {
                    zzbskVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                } else {
                    zzbskVar.zzg();
                }
                zzgzy zzgzyVar = zzcei.zzf;
                Objects.requireNonNull(zzbrgVar);
                zzgzyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrw
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbrg.this.zzj();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzd));
                int zzi = zzbskVar.zzi();
                int i = this.zzi;
                String valueOf2 = String.valueOf(arrayList.get(0));
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 94 + String.valueOf(zzi).length() + 39 + String.valueOf(i).length() + 57 + String.valueOf(valueOf2).length() + 42 + String.valueOf(currentTimeMillis).length() + 15);
                sb.append("Could not receive /jsLoaded in ");
                sb.append(valueOf);
                sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                sb.append(zzi);
                sb.append(". Update status(onEngLoadedTimeout) is ");
                sb.append(i);
                sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                sb.append(valueOf2);
                sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                sb.append(currentTimeMillis);
                sb.append(" ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    final /* synthetic */ Object zzg() {
        return this.zza;
    }

    final /* synthetic */ zzfor zzh() {
        return this.zze;
    }

    final /* synthetic */ zzbsk zzi() {
        return this.zzh;
    }

    final /* synthetic */ void zzj(zzbsk zzbskVar) {
        this.zzh = zzbskVar;
    }

    final /* synthetic */ int zzk() {
        return this.zzi;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzi = i;
    }
}
