package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    public final SafePackageManager f10306a = new SafePackageManager();

    public final Intent a(Context context) {
        Bundle bundle;
        C0516bj c0516bj;
        C0501b4.l().f11473u.getClass();
        Intent data = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme(G7.f10311b).authority(context.getPackageName()).path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Bf.f10111c).build());
        ApplicationInfo applicationInfo = this.f10306a.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            bundle = new Bundle();
        }
        Intent putExtras = data.putExtras(bundle);
        C0501b4 l4 = C0501b4.l();
        synchronized (l4) {
            try {
                if (l4.o == null) {
                    C0516bj c0516bj2 = new C0516bj();
                    l4.o = c0516bj2;
                    l4.f11462h.a(c0516bj2);
                }
                c0516bj = l4.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo b4 = c0516bj.b(context);
        return putExtras.putExtra("screen_size", b4 != null ? AbstractC0637gb.a(b4) : null);
    }
}
