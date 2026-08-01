package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzew {
    private final zzeg zza;
    private final zzeq zzb;
    private final zzeu zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzew(Looper looper, zzeg zzegVar, zzeu zzeuVar) {
        this(new CopyOnWriteArraySet(), looper, zzegVar, zzeuVar, true);
    }

    public static /* synthetic */ boolean zzg(zzew zzewVar, Message message) {
        Iterator it = zzewVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzev) it.next()).zzb(zzewVar.zzc);
            if (zzewVar.zzb.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzef.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzew zza(Looper looper, zzeu zzeuVar) {
        return new zzew(this.zzd, looper, this.zza, zzeuVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzev(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzg(0)) {
            zzeq zzeqVar = this.zzb;
            zzeqVar.zzk(zzeqVar.zzb(0));
        }
        boolean z = !this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (z) {
            return;
        }
        while (!this.zze.isEmpty()) {
            ((Runnable) this.zze.peekFirst()).run();
            this.zze.removeFirst();
        }
    }

    public final void zzd(final int i, final zzet zzetVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzes
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzet zzetVar2 = zzetVar;
                    ((zzev) it.next()).zza(i, zzetVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzev) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzev zzevVar = (zzev) it.next();
            if (zzevVar.zza.equals(obj)) {
                zzevVar.zzc(this.zzc);
                this.zzd.remove(zzevVar);
            }
        }
    }

    private zzew(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzeg zzegVar, zzeu zzeuVar, boolean z) {
        this.zza = zzegVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzeuVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzegVar.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzer
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzew.zzg(zzew.this, message);
                return true;
            }
        });
        this.zzi = z;
    }
}
