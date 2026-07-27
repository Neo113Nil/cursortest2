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

/* renamed from: io.appmetrica.analytics.impl.jj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751jj implements SdkEnvironmentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8549a;

    /* renamed from: b, reason: collision with root package name */
    public final Pb f8550b = new Pb();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f8551c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public SdkEnvironment f8552d;

    /* renamed from: e, reason: collision with root package name */
    public String f8553e;

    public C0751jj(Context context) {
        this.f8549a = context;
        this.f8552d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.13.0", "50142752", AbstractC0777kj.a()), "phone", Pb.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(ScreenInfo screenInfo) {
        float f3;
        if (screenInfo != null) {
            try {
                if (!screenInfo.equals(getSdkEnvironment().getScreenInfo())) {
                    String str = this.f8553e;
                    if (str == null) {
                        Context context = this.f8549a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = T7.f7518a;
                        try {
                            f3 = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f3 = 0.0f;
                        }
                        if (!Float.isNaN(f3) && f3 != 0.0f) {
                            int i2 = point.x;
                            int i3 = point.y;
                            if (T7.a(context)) {
                                str = "tv";
                            } else {
                                float f6 = 160 * f3;
                                float f7 = i2;
                                float f8 = f7 / f6;
                                float f9 = i3;
                                float f10 = f9 / f6;
                                double sqrt = Math.sqrt((f10 * f10) + (f8 * f8));
                                float f11 = f7 / f3;
                                float f12 = f9 / f3;
                                if (f11 > f12) {
                                    f11 = f12;
                                }
                                if (sqrt < 7 && f11 < 600) {
                                    str = "phone";
                                }
                                str = "tablet";
                            }
                        }
                        str = "phone";
                    }
                    this.f8552d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f8551c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC1048v5) ((InterfaceC0725ij) it.next())).d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC0725ij interfaceC0725ij) {
        this.f8551c.remove(interfaceC0725ij);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f8552d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        kotlin.jvm.internal.i.l("sdkEnvironment");
        throw null;
    }

    public final synchronized void a(String str) {
        if (str != null) {
            if (!str.equals(this.f8553e)) {
                this.f8553e = str;
                if (!str.equals(getSdkEnvironment().getDeviceType())) {
                    this.f8552d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f8551c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC1048v5) ((InterfaceC0725ij) it.next())).d();
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
            this.f8552d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f8551c.iterator();
            while (it.hasNext()) {
                ((AbstractC1048v5) ((InterfaceC0725ij) it.next())).d();
            }
        }
    }

    public final synchronized void a(Configuration configuration) {
        this.f8550b.getClass();
        List a6 = Pb.a(configuration);
        if (!kotlin.jvm.internal.i.a(getSdkEnvironment().getLocales(), a6)) {
            this.f8552d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, a6, 31, null);
            Iterator it = this.f8551c.iterator();
            while (it.hasNext()) {
                ((AbstractC1048v5) ((InterfaceC0725ij) it.next())).d();
            }
        }
    }

    public final void a(InterfaceC0725ij interfaceC0725ij) {
        this.f8551c.add(interfaceC0725ij);
    }
}
