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
public final class C0600jj implements SdkEnvironmentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7653a;

    /* renamed from: b, reason: collision with root package name */
    public final Pb f7654b = new Pb();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f7655c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public SdkEnvironment f7656d;

    /* renamed from: e, reason: collision with root package name */
    public String f7657e;

    public C0600jj(Context context) {
        this.f7653a = context;
        this.f7656d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.13.0", "50142752", AbstractC0626kj.a()), "phone", Pb.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(ScreenInfo screenInfo) {
        float f;
        if (screenInfo != null) {
            try {
                if (!screenInfo.equals(getSdkEnvironment().getScreenInfo())) {
                    String str = this.f7657e;
                    if (str == null) {
                        Context context = this.f7653a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = T7.f6690a;
                        try {
                            f = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f = 0.0f;
                        }
                        if (!Float.isNaN(f) && f != 0.0f) {
                            int i3 = point.x;
                            int i4 = point.y;
                            if (T7.a(context)) {
                                str = "tv";
                            } else {
                                float f3 = 160 * f;
                                float f4 = i3;
                                float f5 = f4 / f3;
                                float f6 = i4;
                                float f7 = f6 / f3;
                                double sqrt = Math.sqrt((f7 * f7) + (f5 * f5));
                                float f8 = f4 / f;
                                float f9 = f6 / f;
                                if (f8 > f9) {
                                    f8 = f9;
                                }
                                if (sqrt < 7 && f8 < 600) {
                                    str = "phone";
                                }
                                str = "tablet";
                            }
                        }
                        str = "phone";
                    }
                    this.f7656d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f7655c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0897v5) ((InterfaceC0574ij) it.next())).d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC0574ij interfaceC0574ij) {
        this.f7655c.remove(interfaceC0574ij);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f7656d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        kotlin.jvm.internal.j.g("sdkEnvironment");
        throw null;
    }

    public final synchronized void a(String str) {
        if (str != null) {
            if (!str.equals(this.f7657e)) {
                this.f7657e = str;
                if (!str.equals(getSdkEnvironment().getDeviceType())) {
                    this.f7656d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f7655c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0897v5) ((InterfaceC0574ij) it.next())).d();
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
        if (!kotlin.jvm.internal.j.a(appVersionInfo.getAppVersionName(), str) || !kotlin.jvm.internal.j.a(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f7656d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f7655c.iterator();
            while (it.hasNext()) {
                ((AbstractC0897v5) ((InterfaceC0574ij) it.next())).d();
            }
        }
    }

    public final synchronized void a(Configuration configuration) {
        this.f7654b.getClass();
        List a3 = Pb.a(configuration);
        if (!kotlin.jvm.internal.j.a(getSdkEnvironment().getLocales(), a3)) {
            this.f7656d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, a3, 31, null);
            Iterator it = this.f7655c.iterator();
            while (it.hasNext()) {
                ((AbstractC0897v5) ((InterfaceC0574ij) it.next())).d();
            }
        }
    }

    public final void a(InterfaceC0574ij interfaceC0574ij) {
        this.f7655c.add(interfaceC0574ij);
    }
}
