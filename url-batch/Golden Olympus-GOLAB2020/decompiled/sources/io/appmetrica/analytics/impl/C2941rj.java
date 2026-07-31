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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2941rj implements SdkEnvironmentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39739a;

    /* renamed from: b, reason: collision with root package name */
    public final C2570dc f39740b = new C2570dc();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f39741c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public SdkEnvironment f39742d;

    /* renamed from: e, reason: collision with root package name */
    public String f39743e;

    public C2941rj(@NotNull Context context) {
        this.f39739a = context;
        this.f39742d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.10.0", "50135769", AbstractC2967sj.a()), "phone", C2570dc.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(@Nullable ScreenInfo screenInfo) {
        float f4;
        if (screenInfo != null) {
            try {
                if (!Intrinsics.areEqual(screenInfo, getSdkEnvironment().getScreenInfo())) {
                    String str = this.f39743e;
                    if (str == null) {
                        Context context = this.f39739a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = Ue.f38360a;
                        try {
                            f4 = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f4 = 0.0f;
                        }
                        if (f4 == 0.0f) {
                            str = "phone";
                        } else {
                            float f5 = point.x;
                            float f6 = point.y;
                            float min = Math.min(f5 / f4, f6 / f4);
                            float f7 = f4 * 160.0f;
                            float f8 = f5 / f7;
                            float f9 = f6 / f7;
                            double sqrt = Math.sqrt((f9 * f9) + (f8 * f8));
                            if (sqrt < 15.0d || Ue.f38360a.hasSystemFeature(context, "android.hardware.touchscreen")) {
                                if (sqrt < 7.0d && min < 600.0f) {
                                    str = "phone";
                                }
                                str = "tablet";
                            } else {
                                str = "tv";
                            }
                        }
                    }
                    this.f39742d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f39741c.iterator();
                    while (it.hasNext()) {
                        ((J5) ((InterfaceC2916qj) it.next())).d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(@NotNull InterfaceC2916qj interfaceC2916qj) {
        this.f39741c.remove(interfaceC2916qj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    @NotNull
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f39742d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sdkEnvironment");
        return null;
    }

    public final synchronized void a(@Nullable String str) {
        if (str != null) {
            if (!Intrinsics.areEqual(str, this.f39743e)) {
                this.f39743e = str;
                if (!Intrinsics.areEqual(str, getSdkEnvironment().getDeviceType())) {
                    this.f39742d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f39741c.iterator();
                    while (it.hasNext()) {
                        ((J5) ((InterfaceC2916qj) it.next())).d();
                    }
                }
            }
        }
    }

    public final synchronized void a(@Nullable String str, @Nullable String str2) {
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
        if (!Intrinsics.areEqual(appVersionInfo.getAppVersionName(), str) || !Intrinsics.areEqual(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f39742d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f39741c.iterator();
            while (it.hasNext()) {
                ((J5) ((InterfaceC2916qj) it.next())).d();
            }
        }
    }

    public final synchronized void a(@NotNull Configuration configuration) {
        this.f39740b.getClass();
        List a4 = C2570dc.a(configuration);
        if (!Intrinsics.areEqual(getSdkEnvironment().getLocales(), a4)) {
            this.f39742d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, a4, 31, null);
            Iterator it = this.f39741c.iterator();
            while (it.hasNext()) {
                ((J5) ((InterfaceC2916qj) it.next())).d();
            }
        }
    }

    public final void a(@NotNull InterfaceC2916qj interfaceC2916qj) {
        this.f39741c.add(interfaceC2916qj);
    }
}
