package ru.rustore.sdk.pay.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f45304a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final W1.h f45305b;

    public static final class a extends kotlin.jvm.internal.s implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object m243constructorimpl;
            z zVar = z.this;
            try {
                Result.Companion companion = Result.Companion;
                PackageManager packageManager = zVar.f45304a.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                String packageName = zVar.f45304a.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                m243constructorimpl = Result.m243constructorimpl(z.a(zVar, packageManager, packageName).versionName);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = null;
            }
            return (String) m243constructorimpl;
        }
    }

    public z(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45304a = context;
        this.f45305b = W1.i.b(new a());
    }

    public static final PackageInfo a(z zVar, PackageManager packageManager, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo2, "{\n            getPackage…packageName, 0)\n        }");
            return packageInfo2;
        }
        of = PackageManager.PackageInfoFlags.of(0L);
        packageInfo = packageManager.getPackageInfo(str, of);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n            getPackage…nfoFlags.of(0))\n        }");
        return packageInfo;
    }
}
