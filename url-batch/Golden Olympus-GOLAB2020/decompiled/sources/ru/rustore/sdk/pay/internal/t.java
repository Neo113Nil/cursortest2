package ru.rustore.sdk.pay.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.PackageName;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f45025a;

    public t(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45025a = context.getPackageManager();
    }

    @NotNull
    public final s a(@NotNull PackageName packageName) {
        Object m243constructorimpl;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Result.Companion companion = Result.Companion;
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.f45025a;
                String value = packageName.getValue();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(value, of);
            } else {
                packageInfo = this.f45025a.getPackageInfo(packageName.getValue(), 0);
            }
            m243constructorimpl = Result.m243constructorimpl(new s(packageInfo != null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        s sVar = new s(false);
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = sVar;
        }
        return (s) m243constructorimpl;
    }
}
