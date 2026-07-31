package ru.rustore.sdk.install.identifier.internal.data;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.pm.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.install.identifier.internal.domain.VersionCode;

@Metadata
/* loaded from: classes3.dex */
public final class CurrentVersionRepository {

    @NotNull
    private final Context context;

    public CurrentVersionRepository(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final PackageInfo getPackageInfo(PackageManager packageManager, String str) {
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

    @Nullable
    public final VersionCode get() {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String packageName = this.context.getPackageName();
            PackageManager packageManager = this.context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            m243constructorimpl = Result.m243constructorimpl(new VersionCode(a.a(getPackageInfo(packageManager, packageName))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        return (VersionCode) m243constructorimpl;
    }
}
