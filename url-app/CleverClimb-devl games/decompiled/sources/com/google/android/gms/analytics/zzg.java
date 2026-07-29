package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes.dex */
public final class zzg {
    private final zzj zzri;
    private final Clock zzrj;
    private boolean zzrk;
    private long zzrl;
    private long zzrm;
    private long zzrn;
    private long zzro;
    private long zzrp;
    private boolean zzrq;
    private final Map<Class<? extends zzi>, zzi> zzrr;
    private final List<zzo> zzrs;

    private zzg(zzg zzgVar) {
        this.zzri = zzgVar.zzri;
        this.zzrj = zzgVar.zzrj;
        this.zzrl = zzgVar.zzrl;
        this.zzrm = zzgVar.zzrm;
        this.zzrn = zzgVar.zzrn;
        this.zzro = zzgVar.zzro;
        this.zzrp = zzgVar.zzrp;
        this.zzrs = new ArrayList(zzgVar.zzrs);
        this.zzrr = new HashMap(zzgVar.zzrr.size());
        for (Map.Entry<Class<? extends zzi>, zzi> entry : zzgVar.zzrr.entrySet()) {
            zzi zzc = zzc(entry.getKey());
            entry.getValue().zzb(zzc);
            this.zzrr.put(entry.getKey(), zzc);
        }
    }

    @VisibleForTesting
    zzg(zzj zzjVar, Clock clock) {
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotNull(clock);
        this.zzri = zzjVar;
        this.zzrj = clock;
        this.zzro = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;
        this.zzrp = 3024000000L;
        this.zzrr = new HashMap();
        this.zzrs = new ArrayList();
    }

    @TargetApi(19)
    private static <T extends zzi> T zzc(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            }
            if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            if (Build.VERSION.SDK_INT < 19 || !(e instanceof ReflectiveOperationException)) {
                throw new RuntimeException(e);
            }
            throw new IllegalArgumentException("Linkage exception", e);
        }
    }

    @VisibleForTesting
    public final <T extends zzi> T zza(Class<T> cls) {
        return (T) this.zzrr.get(cls);
    }

    @VisibleForTesting
    public final void zza(long j) {
        this.zzrm = j;
    }

    @VisibleForTesting
    public final void zza(zzi zziVar) {
        Preconditions.checkNotNull(zziVar);
        Class<?> cls = zziVar.getClass();
        if (cls.getSuperclass() != zzi.class) {
            throw new IllegalArgumentException();
        }
        zziVar.zzb(zzb(cls));
    }

    @VisibleForTesting
    public final <T extends zzi> T zzb(Class<T> cls) {
        T t = (T) this.zzrr.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) zzc(cls);
        this.zzrr.put(cls, t2);
        return t2;
    }

    @VisibleForTesting
    public final zzg zzo() {
        return new zzg(this);
    }

    @VisibleForTesting
    public final Collection<zzi> zzp() {
        return this.zzrr.values();
    }

    public final List<zzo> zzq() {
        return this.zzrs;
    }

    @VisibleForTesting
    public final long zzr() {
        return this.zzrl;
    }

    @VisibleForTesting
    public final void zzs() {
        this.zzri.zzy().zze(this);
    }

    @VisibleForTesting
    public final boolean zzt() {
        return this.zzrk;
    }

    @VisibleForTesting
    final void zzu() {
        this.zzrn = this.zzrj.elapsedRealtime();
        this.zzrl = this.zzrm != 0 ? this.zzrm : this.zzrj.currentTimeMillis();
        this.zzrk = true;
    }

    final zzj zzv() {
        return this.zzri;
    }

    @VisibleForTesting
    final boolean zzw() {
        return this.zzrq;
    }

    @VisibleForTesting
    final void zzx() {
        this.zzrq = true;
    }
}
