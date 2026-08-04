package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzerx implements zzeup {
    private final zzgpd zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzerx(zzgpd zzgpdVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgpdVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzerw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzerx.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 22;
    }

    final /* synthetic */ zzery zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgq)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzery(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgr)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                boolean z = true;
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = true;
                }
                return new zzery(bool);
            }
        }
        return new zzery(null);
    }
}
