package com.google.android.gms.internal.ads;

import com.facebook.ads.AudienceNetworkActivity;

/* loaded from: classes2.dex */
final class zzva implements Runnable {
    private final /* synthetic */ String zzbpt;
    private final /* synthetic */ zzuw zzbpu;

    zzva(zzuw zzuwVar, String str) {
        this.zzbpu = zzuwVar;
        this.zzbpt = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqw zzaqwVar;
        zzaqwVar = this.zzbpu.zzbnd;
        zzaqwVar.loadData(this.zzbpt, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8");
    }
}
