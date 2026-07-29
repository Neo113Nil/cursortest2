package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.a;
import android.support.customtabs.b;
import android.support.customtabs.d;
import android.support.customtabs.e;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzoh implements zzbfy {
    private e zzbgw;
    private b zzbgx;
    private d zzbgy;
    private zzoi zzbgz;

    public static boolean zzh(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzbfw.zzbn(context));
                }
            }
        }
        return false;
    }

    public final boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.zzbgx == null) {
            return false;
        }
        if (this.zzbgx == null) {
            this.zzbgw = null;
        } else if (this.zzbgw == null) {
            this.zzbgw = this.zzbgx.a((a) null);
        }
        e eVar = this.zzbgw;
        if (eVar == null) {
            return false;
        }
        return eVar.a(uri, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final void zza(b bVar) {
        this.zzbgx = bVar;
        this.zzbgx.a(0L);
        if (this.zzbgz != null) {
            this.zzbgz.zzjp();
        }
    }

    public final void zza(zzoi zzoiVar) {
        this.zzbgz = zzoiVar;
    }

    public final void zzc(Activity activity) {
        if (this.zzbgy == null) {
            return;
        }
        activity.unbindService(this.zzbgy);
        this.zzbgx = null;
        this.zzbgw = null;
        this.zzbgy = null;
    }

    public final void zzd(Activity activity) {
        String zzbn;
        if (this.zzbgx == null && (zzbn = zzbfw.zzbn(activity)) != null) {
            this.zzbgy = new zzbfx(this);
            b.a(activity, zzbn, this.zzbgy);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final void zzjo() {
        this.zzbgx = null;
        this.zzbgw = null;
        if (this.zzbgz != null) {
            this.zzbgz.zzjq();
        }
    }
}
