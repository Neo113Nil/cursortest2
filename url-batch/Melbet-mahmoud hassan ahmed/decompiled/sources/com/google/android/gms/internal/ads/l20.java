package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class l20 {

    /* renamed from: a, reason: collision with root package name */
    private g.e f7780a;

    /* renamed from: b, reason: collision with root package name */
    private g.b f7781b;

    /* renamed from: c, reason: collision with root package name */
    private g.d f7782c;

    /* renamed from: d, reason: collision with root package name */
    private j20 f7783d;

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i7 = 0; i7 < queryIntentActivities.size(); i7++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i7).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zv3.a(context));
                }
            }
        }
        return false;
    }

    public final g.e a() {
        g.b bVar = this.f7781b;
        if (bVar == null) {
            this.f7780a = null;
        } else if (this.f7780a == null) {
            this.f7780a = bVar.b(null);
        }
        return this.f7780a;
    }

    public final void b(Activity activity) {
        String a7;
        if (this.f7781b == null && (a7 = zv3.a(activity)) != null) {
            aw3 aw3Var = new aw3(this, null);
            this.f7782c = aw3Var;
            g.b.a(activity, a7, aw3Var);
        }
    }

    public final void c(g.b bVar) {
        this.f7781b = bVar;
        bVar.c(0L);
        j20 j20Var = this.f7783d;
        if (j20Var != null) {
            j20Var.zza();
        }
    }

    public final void d() {
        this.f7781b = null;
        this.f7780a = null;
    }

    public final void e(j20 j20Var) {
        this.f7783d = j20Var;
    }

    public final void f(Activity activity) {
        g.d dVar = this.f7782c;
        if (dVar == null) {
            return;
        }
        activity.unbindService(dVar);
        this.f7781b = null;
        this.f7780a = null;
        this.f7782c = null;
    }
}
