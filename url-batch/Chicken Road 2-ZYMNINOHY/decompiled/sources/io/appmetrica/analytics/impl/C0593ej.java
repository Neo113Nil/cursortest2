package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.ej, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593ej implements SdkEnvironmentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11803a;

    /* renamed from: b, reason: collision with root package name */
    public final Ib f11804b = new Ib();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f11805c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public SdkEnvironment f11806d;

    /* renamed from: e, reason: collision with root package name */
    public String f11807e;

    public C0593ej(Context context) {
        this.f11803a = context;
        this.f11806d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("8.0.0", "50147728", AbstractC0619fj.a()), "phone", Ib.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(ScreenInfo screenInfo) {
        float f4;
        if (screenInfo != null) {
            try {
                if (!screenInfo.equals(getSdkEnvironment().getScreenInfo())) {
                    String str = this.f11807e;
                    if (str == null) {
                        Context context = this.f11803a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = N7.f10692a;
                        try {
                            f4 = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f4 = 0.0f;
                        }
                        if (!Float.isNaN(f4) && f4 != 0.0f) {
                            int i4 = point.x;
                            int i5 = point.y;
                            if (N7.a(context)) {
                                str = "tv";
                            } else {
                                float f5 = 160 * f4;
                                float f6 = i4;
                                float f7 = f6 / f5;
                                float f8 = i5;
                                float f9 = f8 / f5;
                                double sqrt = Math.sqrt((f9 * f9) + (f7 * f7));
                                float f10 = f6 / f4;
                                float f11 = f8 / f4;
                                if (f10 > f11) {
                                    f10 = f11;
                                }
                                if (sqrt < 7 && f10 < 600) {
                                    str = "phone";
                                }
                                str = "tablet";
                            }
                        }
                        str = "phone";
                    }
                    this.f11806d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f11805c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0838o5) ((InterfaceC0568dj) it.next())).d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC0568dj interfaceC0568dj) {
        this.f11805c.remove(interfaceC0568dj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f11806d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        kotlin.jvm.internal.i.i("sdkEnvironment");
        throw null;
    }

    public final synchronized void a(String str) {
        if (str != null) {
            if (!str.equals(this.f11807e)) {
                this.f11807e = str;
                if (!str.equals(getSdkEnvironment().getDeviceType())) {
                    this.f11806d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f11805c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0838o5) ((InterfaceC0568dj) it.next())).d();
                    }
                }
            }
        }
    }

    public final synchronized void a(String str, String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } finally {
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!kotlin.jvm.internal.i.a(appVersionInfo.getAppVersionName(), str) || !kotlin.jvm.internal.i.a(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f11806d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f11805c.iterator();
            while (it.hasNext()) {
                ((AbstractC0838o5) ((InterfaceC0568dj) it.next())).d();
            }
        }
    }

    public final synchronized void a(Configuration configuration) {
        this.f11804b.getClass();
        List a3 = Ib.a(configuration);
        if (!kotlin.jvm.internal.i.a(getSdkEnvironment().getLocales(), a3)) {
            this.f11806d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, a3, 31, null);
            Iterator it = this.f11805c.iterator();
            while (it.hasNext()) {
                ((AbstractC0838o5) ((InterfaceC0568dj) it.next())).d();
            }
        }
    }

    public final void a(InterfaceC0568dj interfaceC0568dj) {
        this.f11805c.add(interfaceC0568dj);
    }
}
