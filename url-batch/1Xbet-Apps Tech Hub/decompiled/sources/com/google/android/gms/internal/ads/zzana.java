package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzana implements Comparable {
    private final zzanl zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzane zzf;
    private Integer zzg;
    private zzand zzh;
    private boolean zzi;
    private zzamj zzj;
    private zzamz zzk;
    private final zzamo zzl;

    public zzana(int i, String str, zzane zzaneVar) {
        Uri parse;
        String host;
        this.zza = zzanl.zza ? new zzanl() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaneVar;
        this.zzl = new zzamo();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzana) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzamj zzd() {
        return this.zzj;
    }

    public final zzana zze(zzamj zzamjVar) {
        this.zzj = zzamjVar;
        return this;
    }

    public final zzana zzf(zzand zzandVar) {
        this.zzh = zzandVar;
        return this;
    }

    public final zzana zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    protected abstract zzang zzh(zzamw zzamwVar);

    public final String zzj() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzami {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzanl.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzanj zzanjVar) {
        zzane zzaneVar;
        synchronized (this.zze) {
            zzaneVar = this.zzf;
        }
        zzaneVar.zza(zzanjVar);
    }

    protected abstract void zzo(Object obj);

    final void zzp(String str) {
        zzand zzandVar = this.zzh;
        if (zzandVar != null) {
            zzandVar.zzb(this);
        }
        if (zzanl.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzamy(this, str, id));
            } else {
                this.zza.zza(str, id);
                this.zza.zzb(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    final void zzr() {
        zzamz zzamzVar;
        synchronized (this.zze) {
            zzamzVar = this.zzk;
        }
        if (zzamzVar != null) {
            zzamzVar.zza(this);
        }
    }

    final void zzs(zzang zzangVar) {
        zzamz zzamzVar;
        synchronized (this.zze) {
            zzamzVar = this.zzk;
        }
        if (zzamzVar != null) {
            zzamzVar.zzb(this, zzangVar);
        }
    }

    final void zzt(int i) {
        zzand zzandVar = this.zzh;
        if (zzandVar != null) {
            zzandVar.zzc(this, i);
        }
    }

    final void zzu(zzamz zzamzVar) {
        synchronized (this.zze) {
            this.zzk = zzamzVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzami {
        return null;
    }

    public final zzamo zzy() {
        return this.zzl;
    }
}
