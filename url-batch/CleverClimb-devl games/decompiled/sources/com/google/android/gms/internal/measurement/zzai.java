package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzai extends zzar {
    private final zzbf zzva;

    public zzai(zzat zzatVar, zzav zzavVar) {
        super(zzatVar);
        Preconditions.checkNotNull(zzavVar);
        this.zzva = new zzbf(zzatVar, zzavVar);
    }

    final void onServiceConnected() {
        zzk.zzab();
        this.zzva.onServiceConnected();
    }

    public final void setLocalDispatchPeriod(int i) {
        zzch();
        zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zzbw().zza(new zzaj(this, i));
    }

    public final void start() {
        this.zzva.start();
    }

    public final long zza(zzaw zzawVar) {
        zzch();
        Preconditions.checkNotNull(zzawVar);
        zzk.zzab();
        long zza = this.zzva.zza(zzawVar, true);
        if (zza == 0) {
            this.zzva.zzb(zzawVar);
        }
        return zza;
    }

    public final void zza(zzca zzcaVar) {
        zzch();
        zzbw().zza(new zzao(this, zzcaVar));
    }

    public final void zza(zzch zzchVar) {
        Preconditions.checkNotNull(zzchVar);
        zzch();
        zzb("Hit delivery requested", zzchVar);
        zzbw().zza(new zzam(this, zzchVar));
    }

    public final void zza(String str, Runnable runnable) {
        Preconditions.checkNotEmpty(str, "campaign param can't be empty");
        zzbw().zza(new zzal(this, str, runnable));
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        this.zzva.zzm();
    }

    public final void zzbn() {
        zzch();
        zzbw().zza(new zzan(this));
    }

    public final void zzbo() {
        zzch();
        Context context = getContext();
        if (!zzct.zza(context) || !zzcu.zze(context)) {
            zza((zzca) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
        context.startService(intent);
    }

    public final boolean zzbp() {
        zzch();
        try {
            zzbw().zza(new zzap(this)).get(4L, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            zzd("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            zze("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            zzd("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }

    public final void zzbq() {
        zzch();
        zzk.zzab();
        zzbf zzbfVar = this.zzva;
        zzk.zzab();
        zzbfVar.zzch();
        zzbfVar.zzq("Service disconnected");
    }

    final void zzbr() {
        zzk.zzab();
        this.zzva.zzbr();
    }
}
