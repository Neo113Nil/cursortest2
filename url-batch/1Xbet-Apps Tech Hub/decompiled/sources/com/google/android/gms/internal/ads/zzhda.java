package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzhda implements Iterator, Closeable, zzaon {
    private static final zzaom zza = new zzhcz("eof ");
    private static final zzhdh zzb = zzhdh.zzb(zzhda.class);
    protected zzaoj zzc;
    protected zzhdb zzd;
    zzaom zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzaom zzaomVar = this.zze;
        if (zzaomVar == zza) {
            return false;
        }
        if (zzaomVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzh.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzaom) this.zzh.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzaom next() {
        zzaom zzb2;
        zzaom zzaomVar = this.zze;
        if (zzaomVar != null && zzaomVar != zza) {
            this.zze = null;
            return zzaomVar;
        }
        zzhdb zzhdbVar = this.zzd;
        if (zzhdbVar == null || this.zzf >= this.zzg) {
            this.zze = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzhdbVar) {
                this.zzd.zze(this.zzf);
                zzb2 = this.zzc.zzb(this.zzd, this);
                this.zzf = this.zzd.zzb();
            }
            return zzb2;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzhdg(this.zzh, this);
    }

    public final void zzf(zzhdb zzhdbVar, long j, zzaoj zzaojVar) throws IOException {
        this.zzd = zzhdbVar;
        this.zzf = zzhdbVar.zzb();
        zzhdbVar.zze(zzhdbVar.zzb() + j);
        this.zzg = zzhdbVar.zzb();
        this.zzc = zzaojVar;
    }
}
