package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import j1.ExecutorC1174c;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6619b;

    public /* synthetic */ C(Context context, int i4) {
        this.f6618a = i4;
        this.f6619b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6618a) {
            case 0:
                gh.e(this.f6619b);
                break;
            case 1:
                (Build.VERSION.SDK_INT >= 28 ? j1.h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new C(this.f6619b, 2), new Random().nextInt(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 1)) + 5000);
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new C(this.f6619b, 3));
                break;
            default:
                j1.e.s(this.f6619b, new ExecutorC1174c(0), j1.e.f13875a, false);
                break;
        }
    }

    public /* synthetic */ C(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f6618a = 1;
        this.f6619b = context;
    }
}
