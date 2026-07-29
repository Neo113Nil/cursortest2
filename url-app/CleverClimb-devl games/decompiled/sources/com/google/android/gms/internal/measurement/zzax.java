package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzax extends zzar {
    private final zzaz zzwg;
    private zzci zzwh;
    private final zzbw zzwi;
    private final zzcz zzwj;

    protected zzax(zzat zzatVar) {
        super(zzatVar);
        this.zzwj = new zzcz(zzatVar.zzbt());
        this.zzwg = new zzaz(this);
        this.zzwi = new zzay(this, zzatVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceDisconnected(ComponentName componentName) {
        zzk.zzab();
        if (this.zzwh != null) {
            this.zzwh = null;
            zza("Disconnected from device AnalyticsService", componentName);
            zzby().zzbq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzci zzciVar) {
        zzk.zzab();
        this.zzwh = zzciVar;
        zzcu();
        zzby().onServiceConnected();
    }

    private final void zzcu() {
        this.zzwj.start();
        this.zzwi.zzh(zzcc.zzzp.get().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcv() {
        zzk.zzab();
        if (isConnected()) {
            zzq("Inactivity, disconnecting from device AnalyticsService");
            disconnect();
        }
    }

    public final boolean connect() {
        zzk.zzab();
        zzch();
        if (this.zzwh != null) {
            return true;
        }
        zzci zzcw = this.zzwg.zzcw();
        if (zzcw == null) {
            return false;
        }
        this.zzwh = zzcw;
        zzcu();
        return true;
    }

    public final void disconnect() {
        zzk.zzab();
        zzch();
        try {
            ConnectionTracker.getInstance().unbindService(getContext(), this.zzwg);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzwh != null) {
            this.zzwh = null;
            zzby().zzbq();
        }
    }

    public final boolean isConnected() {
        zzk.zzab();
        zzch();
        return this.zzwh != null;
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
    }

    public final boolean zzb(zzch zzchVar) {
        Preconditions.checkNotNull(zzchVar);
        zzk.zzab();
        zzch();
        zzci zzciVar = this.zzwh;
        if (zzciVar == null) {
            return false;
        }
        try {
            zzciVar.zza(zzchVar.zzcs(), zzchVar.zzen(), zzchVar.zzeo() ? zzbu.zzdz() : zzbu.zzea(), Collections.emptyList());
            zzcu();
            return true;
        } catch (RemoteException unused) {
            zzq("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    public final boolean zzct() {
        zzk.zzab();
        zzch();
        zzci zzciVar = this.zzwh;
        if (zzciVar == null) {
            return false;
        }
        try {
            zzciVar.zzbn();
            zzcu();
            return true;
        } catch (RemoteException unused) {
            zzq("Failed to clear hits from AnalyticsService");
            return false;
        }
    }
}
