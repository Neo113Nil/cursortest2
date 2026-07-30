package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgel implements zzgdv {
    private final ExecutorService zza;
    private final zzika zzb;
    private final zzika zzc;
    private final zzgmz zzd;
    private final zzika zze;
    private final zzikv zzf;
    private final zzgbf zzg;

    zzgel(ExecutorService executorService, zzika zzikaVar, zzika zzikaVar2, zzgmz zzgmzVar, zzika zzikaVar3, zzikv zzikvVar, zzgbf zzgbfVar) {
        this.zza = executorService;
        this.zzb = zzikaVar;
        this.zzc = zzikaVar2;
        this.zzd = zzgmzVar;
        this.zze = zzikaVar3;
        this.zzf = zzikvVar;
        this.zzg = zzgbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final String zza() {
        return "1.825731049";
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zzb() {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgek
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgel.this.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zzc(Context context) {
        zzgfb zzh = ((zzgfb) this.zzf.zzb()).zzh(context);
        zzh.zzd(this.zzd.zzb());
        zzh.zzc(zzaxg.zzj());
        zzh.zzb(zzgcc.QUERY);
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        zzgfb zzh = ((zzgfb) this.zzf.zzb()).zzh(context);
        zzh.zzg(view);
        zzh.zzf(activity);
        zzh.zze(true != this.zzg.zze() ? "" : null);
        zzh.zzd(this.zzd.zzc(context, view));
        zzh.zzc(zzaxg.zzj());
        zzh.zzb(zzgcc.VIEW);
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        zzika zzikaVar = this.zze;
        Map zzd = this.zzd.zzd();
        ((zzget) zzikaVar.zzb()).zzb(zzd);
        zzgfb zzh = ((zzgfb) this.zzf.zzb()).zzh(context);
        zzh.zzg(view);
        zzh.zzf(null);
        zzh.zze(str);
        zzh.zzd(zzd);
        zzh.zzb(zzgcc.CLICK);
        zzh.zzc(zzaxg.zzj());
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((zzget) this.zze.zzb()).zza((MotionEvent) inputEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdv
    public final int zzg() {
        return 2;
    }

    final /* synthetic */ Void zzh() {
        ((zzgfe) this.zzc.zzb()).zza();
        ((zzgfx) this.zzb.zzb()).zza();
        return null;
    }
}
