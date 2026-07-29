package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaw {
    private final Map<String, String> zzsi;
    private final String zztz;
    private final long zzwc;
    private final String zzwd;
    private final boolean zzwe;
    private long zzwf;

    public zzaw(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.zzwc = 0L;
        this.zztz = str;
        this.zzwd = str2;
        this.zzwe = z;
        this.zzwf = j2;
        this.zzsi = map != null ? new HashMap<>(map) : Collections.emptyMap();
    }

    public final String zzaz() {
        return this.zztz;
    }

    public final void zzb(long j) {
        this.zzwf = j;
    }

    public final long zzco() {
        return this.zzwc;
    }

    public final String zzcp() {
        return this.zzwd;
    }

    public final boolean zzcq() {
        return this.zzwe;
    }

    public final long zzcr() {
        return this.zzwf;
    }

    public final Map<String, String> zzcs() {
        return this.zzsi;
    }
}
