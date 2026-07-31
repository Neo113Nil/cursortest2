package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* loaded from: classes3.dex */
public abstract class Ak {

    /* renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f37189a = new SafePackageManager();

    public static Intent a(Context context) {
        Bundle bundle;
        C2864oj c2864oj;
        Intent addFlags = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            bundle = f37189a.getApplicationInfo(context, context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused) {
            bundle = new Bundle();
        }
        Intent putExtras = addFlags.putExtras(bundle);
        putExtras.setData(putExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Pf.f38131c).build());
        C3082x4 l4 = C3082x4.l();
        synchronized (l4) {
            try {
                if (l4.f40130o == null) {
                    C2864oj c2864oj2 = new C2864oj();
                    l4.f40130o = c2864oj2;
                    l4.f40123h.a(c2864oj2);
                }
                c2864oj = l4.f40130o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo a4 = c2864oj.a(context);
        putExtras.putExtra("screen_size", a4 == null ? null : Bb.a(a4));
        return putExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
