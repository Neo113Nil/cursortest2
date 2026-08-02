package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
abstract class zzgbi extends zzgbo {
    private static final zzgct zza = new zzgct(zzgbi.class);

    @CheckForNull
    private zzfxm zzb;
    private final boolean zzc;
    private final boolean zzf;

    zzgbi(zzfxm zzfxmVar, boolean z, boolean z2) {
        super(zzfxmVar.size());
        zzfxmVar.getClass();
        this.zzb = zzfxmVar;
        this.zzc = z;
        this.zzf = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzf(i, zzgcj.zzp(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(@CheckForNull zzfxm zzfxmVar) {
        int zzA = zzA();
        int i = 0;
        zzfuu.zzk(zzA >= 0, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzfxmVar != null) {
                zzfzx it = zzfxmVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private static void zzJ(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @CheckForNull
    protected final String zza() {
        zzfxm zzfxmVar = this.zzb;
        return zzfxmVar != null ? "futures=".concat(zzfxmVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzfxm zzfxmVar = this.zzb;
        zzy(1);
        if ((zzfxmVar != null) && isCancelled()) {
            boolean zzt = zzt();
            zzfzx it = zzfxmVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    abstract void zzf(int i, Object obj);

    abstract void zzu();

    final void zzv() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            final zzfxm zzfxmVar = this.zzf ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbh
                @Override // java.lang.Runnable
                public final void run() {
                    zzgbi.this.zzx(zzfxmVar);
                }
            };
            zzfzx it = this.zzb.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).addListener(runnable, zzgbx.INSTANCE);
            }
            return;
        }
        zzfzx it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbg
                @Override // java.lang.Runnable
                public final void run() {
                    zzgbi.this.zzw(listenableFuture, i);
                }
            }, zzgbx.INSTANCE);
            i++;
        }
    }

    final /* synthetic */ void zzw(ListenableFuture listenableFuture, int i) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
        } finally {
            zzx(null);
        }
    }

    void zzy(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    final void zze(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        zzK(set, (Throwable) Objects.requireNonNull(zzl()));
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzK(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }
}
