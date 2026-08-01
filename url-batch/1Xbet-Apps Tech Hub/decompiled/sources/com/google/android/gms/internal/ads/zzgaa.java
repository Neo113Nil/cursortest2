package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
abstract class zzgaa extends zzgag {
    private static final Logger zza = Logger.getLogger(zzgaa.class.getName());

    @CheckForNull
    private zzfwp zzb;
    private final boolean zzc;
    private final boolean zze;

    zzgaa(zzfwp zzfwpVar, boolean z, boolean z2) {
        super(zzfwpVar.size());
        zzfwpVar.getClass();
        this.zzb = zzfwpVar;
        this.zzc = z;
        this.zze = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzf(i, zzgbb.zzp(future));
        } catch (Error e) {
            e = e;
            zzI(e);
        } catch (RuntimeException e2) {
            e = e2;
            zzI(e);
        } catch (ExecutionException e3) {
            zzI(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(@CheckForNull zzfwp zzfwpVar) {
        int zzA = zzA();
        int i = 0;
        zzfty.zzj(zzA >= 0, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzfwpVar != null) {
                zzfyu it = zzfwpVar.iterator();
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
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
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

    @Override // com.google.android.gms.internal.ads.zzfzp
    @CheckForNull
    protected final String zza() {
        zzfwp zzfwpVar = this.zzb;
        return zzfwpVar != null ? "futures=".concat(zzfwpVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    protected final void zzb() {
        zzfwp zzfwpVar = this.zzb;
        zzy(1);
        if ((zzfwpVar != null) && isCancelled()) {
            boolean zzt = zzt();
            zzfyu it = zzfwpVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    abstract void zzf(int i, Object obj);

    abstract void zzu();

    final void zzv() {
        zzfwp zzfwpVar = this.zzb;
        zzfwpVar.getClass();
        if (zzfwpVar.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            final zzfwp zzfwpVar2 = this.zze ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfzz
                @Override // java.lang.Runnable
                public final void run() {
                    zzgaa.this.zzx(zzfwpVar2);
                }
            };
            zzfyu it = this.zzb.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).addListener(runnable, zzgap.INSTANCE);
            }
            return;
        }
        zzfyu it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfzy
                @Override // java.lang.Runnable
                public final void run() {
                    zzgaa.this.zzw(listenableFuture, i);
                }
            }, zzgap.INSTANCE);
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

    @Override // com.google.android.gms.internal.ads.zzgag
    final void zze(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable zzl = zzl();
        zzl.getClass();
        zzK(set, zzl);
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
