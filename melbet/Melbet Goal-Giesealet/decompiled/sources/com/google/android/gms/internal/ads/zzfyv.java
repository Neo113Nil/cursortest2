package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfyv implements zzfzp {
    private final Map zza;
    private final zzarw zzb;
    private final zzgdy zzc;
    private final long zzd;

    zzfyv(zzarw zzarwVar, Map map, zzfui zzfuiVar, zzgea zzgeaVar) {
        this.zza = map;
        this.zzb = zzarwVar;
        this.zzc = zzgeaVar.zza(112);
        this.zzd = zzfuiVar.zzj();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zza();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Void zza() throws Exception {
        zzast zzastVar;
        try {
            try {
                this.zzc.zza();
                ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
                if (listenableFuture != null && (zzastVar = (zzast) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzarw zzarwVar = this.zzb;
                    synchronized (zzarwVar) {
                        zzarwVar.zzad(zzastVar.zzg());
                        zzarwVar.zzN(zzastVar.zzc());
                    }
                }
            } catch (Throwable th) {
                this.zzc.zzc();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
            this.zzc.zzb(e);
        }
        this.zzc.zzc();
        return null;
    }
}
