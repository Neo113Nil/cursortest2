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
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f43839a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final W1.h f43840b;

    public static final class a extends kotlin.jvm.internal.s implements Function0<Long> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object m243constructorimpl;
            b0 b0Var = b0.this;
            try {
                Result.Companion companion = Result.Companion;
                String packageName = b0Var.f43839a.getPackageName();
                PackageManager packageManager = b0Var.f43839a.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                m243constructorimpl = Result.m243constructorimpl(Long.valueOf(androidx.core.content.pm.a.a(b0.a(b0Var, packageManager, packageName))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = null;
            }
            return (Long) m243constructorimpl;
        }
    }

    public b0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43839a = context;
        this.f43840b = W1.i.b(new a());
    }

    public static final PackageInfo a(b0 b0Var, PackageManager packageManager, String str) {
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
