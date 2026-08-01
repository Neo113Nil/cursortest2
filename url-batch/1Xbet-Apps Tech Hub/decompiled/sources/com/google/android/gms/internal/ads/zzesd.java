package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzesd implements zzeuy {
    private final zzgbl zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzesd(zzgbl zzgblVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgblVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesd.this.zzc();
            }
        });
    }

    final /* synthetic */ zzese zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfS)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzese(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfT)).booleanValue() && this.zzd.contains("native")) {
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
                return new zzese(bool);
            }
        }
        return new zzese(null);
    }
}
