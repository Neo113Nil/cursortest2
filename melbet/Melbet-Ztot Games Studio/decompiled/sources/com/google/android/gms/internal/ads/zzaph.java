package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public abstract class zzaph implements Comparable {
    private final zzaps zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzapl zzf;
    private Integer zzg;
    private zzapk zzh;
    private boolean zzi;
    private zzaoq zzj;
    private zzapg zzk;
    private final zzaov zzl;

    public zzaph(int i, String str, zzapl zzaplVar) {
        Uri parse;
        String host;
        this.zza = zzaps.zza ? new zzaps() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaplVar;
        this.zzl = new zzaov();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzaph) obj).zzg.intValue();
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

    public final zzaoq zzd() {
        return this.zzj;
    }

    public final zzaph zze(zzaoq zzaoqVar) {
        this.zzj = zzaoqVar;
        return this;
    }

    public final zzaph zzf(zzapk zzapkVar) {
        this.zzh = zzapkVar;
        return this;
    }

    public final zzaph zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    protected abstract zzapn zzh(zzapd zzapdVar);

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

    public Map zzl() throws zzaop {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzaps.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzapq zzapqVar) {
        zzapl zzaplVar;
        synchronized (this.zze) {
            zzaplVar = this.zzf;
        }
        zzaplVar.zza(zzapqVar);
    }

    protected abstract void zzo(Object obj);

    final void zzp(String str) {
        zzapk zzapkVar = this.zzh;
        if (zzapkVar != null) {
            zzapkVar.zzb(this);
        }
        if (zzaps.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzapf(this, str, id));
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
        zzapg zzapgVar;
        synchronized (this.zze) {
            zzapgVar = this.zzk;
        }
        if (zzapgVar != null) {
            zzapgVar.zza(this);
        }
    }

    final void zzs(zzapn zzapnVar) {
        zzapg zzapgVar;
        synchronized (this.zze) {
            zzapgVar = this.zzk;
        }
        if (zzapgVar != null) {
            zzapgVar.zzb(this, zzapnVar);
        }
    }

    final void zzt(int i) {
        zzapk zzapkVar = this.zzh;
        if (zzapkVar != null) {
            zzapkVar.zzc(this, i);
        }
    }

    final void zzu(zzapg zzapgVar) {
        synchronized (this.zze) {
            this.zzk = zzapgVar;
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

    public byte[] zzx() throws zzaop {
        return null;
    }

    public final zzaov zzy() {
        return this.zzl;
    }
}
