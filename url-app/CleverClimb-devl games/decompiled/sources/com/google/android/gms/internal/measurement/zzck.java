package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzck {
    private final long zzaak;
    private final int zzaal;
    private double zzaam;
    private long zzaan;
    private final Object zzaao;
    private final Clock zzrj;
    private final String zztv;

    private zzck(int i, long j, String str, Clock clock) {
        this.zzaao = new Object();
        this.zzaal = 60;
        this.zzaam = this.zzaal;
        this.zzaak = 2000L;
        this.zztv = str;
        this.zzrj = clock;
    }

    public zzck(String str, Clock clock) {
        this(60, 2000L, str, clock);
    }

    public final boolean zzer() {
        synchronized (this.zzaao) {
            long currentTimeMillis = this.zzrj.currentTimeMillis();
            if (this.zzaam < this.zzaal) {
                double d2 = currentTimeMillis - this.zzaan;
                double d3 = this.zzaak;
                Double.isNaN(d2);
                Double.isNaN(d3);
                double d4 = d2 / d3;
                if (d4 > 0.0d) {
                    this.zzaam = Math.min(this.zzaal, this.zzaam + d4);
                }
            }
            this.zzaan = currentTimeMillis;
            if (this.zzaam >= 1.0d) {
                this.zzaam -= 1.0d;
                return true;
            }
            String str = this.zztv;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Excessive ");
            sb.append(str);
            sb.append(" detected; call ignored.");
            zzcl.zzab(sb.toString());
            return false;
        }
    }
}
