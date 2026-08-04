package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfnt extends AsyncTask {
    private zzfnu zza;
    protected final zzfnl zzd;

    public zzfnt(zzfnl zzfnlVar) {
        this.zzd = zzfnlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfnu zzfnuVar = this.zza;
        if (zzfnuVar != null) {
            zzfnuVar.zzb(this);
        }
    }

    public final void zzb(zzfnu zzfnuVar) {
        this.zza = zzfnuVar;
    }
}
