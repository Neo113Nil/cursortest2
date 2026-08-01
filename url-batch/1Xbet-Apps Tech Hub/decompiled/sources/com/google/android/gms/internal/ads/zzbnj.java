package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.bumptech.glide.load.Key;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbnj implements zzbnb, zzbmz {
    private final zzcgv zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzbnj(Context context, zzcbt zzcbtVar, zzasi zzasiVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzchg {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcgv zza = zzchh.zza(context, zzcik.zza(), "", false, false, null, null, zzcbtVar, null, null, null, zzayp.zza(), null, null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzcbg.zzu()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zza(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnf
            @Override // java.lang.Runnable
            public final void run() {
                zzbnj.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbmy.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbmy.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbmy.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzf(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbng
            @Override // java.lang.Runnable
            public final void run() {
                zzbnj.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzg(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnd
            @Override // java.lang.Runnable
            public final void run() {
                zzbnj.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnh
            @Override // java.lang.Runnable
            public final void run() {
                zzbnj.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final boolean zzi() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final zzboi zzj() {
        return new zzboi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzk(final zzbnp zzbnpVar) {
        this.zza.zzN().zzG(new zzcih() { // from class: com.google.android.gms.internal.ads.zzbne
            @Override // com.google.android.gms.internal.ads.zzcih
            public final void zza() {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
                zzbnp zzbnpVar2 = zzbnp.this;
                final long j = zzbnpVar2.zzc;
                final ArrayList arrayList = zzbnpVar2.zzb;
                arrayList.add(Long.valueOf(currentTimeMillis - j));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                zzfqv zzfqvVar = com.google.android.gms.ads.internal.util.zzt.zza;
                final zzbog zzbogVar = zzbnpVar2.zza;
                final zzbof zzbofVar = zzbnpVar2.zzd;
                final zzbnb zzbnbVar = zzbnpVar2.zze;
                zzfqvVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbog.this.zzi(zzbofVar, zzbnbVar, arrayList, j);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbmy.zzd(this, str, jSONObject);
    }

    final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", Key.STRING_CHARSET_NAME);
    }

    final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", Key.STRING_CHARSET_NAME);
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzq(String str, zzbkd zzbkdVar) {
        this.zza.zzad(str, new zzbni(this, zzbkdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzr(String str, final zzbkd zzbkdVar) {
        this.zza.zzav(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbnc
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbkd zzbkdVar2;
                zzbkd zzbkdVar3 = (zzbkd) obj;
                if (!(zzbkdVar3 instanceof zzbni)) {
                    return false;
                }
                zzbkd zzbkdVar4 = zzbkd.this;
                zzbkdVar2 = ((zzbni) zzbkdVar3).zzb;
                return zzbkdVar2.equals(zzbkdVar4);
            }
        });
    }
}
