package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
final class ec implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f4559f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ gc f4560g;

    ec(gc gcVar, int i7, boolean z6) {
        this.f4560g = gcVar;
        this.f4559f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var;
        gc gcVar = this.f4560g;
        if (this.f4559f > 0) {
            try {
                Thread.sleep(r1 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = gcVar.f5536a.getPackageManager().getPackageInfo(gcVar.f5536a.getPackageName(), 0);
            Context context = gcVar.f5536a;
            a9Var = c13.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            a9Var = null;
        }
        this.f4560g.f5545j = a9Var;
        if (this.f4559f < 4) {
            if (a9Var != null && a9Var.k0() && !a9Var.y0().equals("0000000000000000000000000000000000000000000000000000000000000000") && a9Var.l0() && a9Var.w0().I() && a9Var.w0().F() != -2) {
                return;
            }
            this.f4560g.o(this.f4559f + 1, true);
        }
    }
}
