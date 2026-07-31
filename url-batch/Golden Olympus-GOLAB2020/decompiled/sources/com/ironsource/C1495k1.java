package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1495k1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1495k1 f16885a = new C1495k1();

    private C1495k1() {
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        } catch (Exception e4) {
            o9.d().a(e4);
            return 0;
        }
    }

    public static /* synthetic */ void b() {
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public static final MeasurementManager a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30 && a() >= 4) {
            try {
                return androidx.privacysandbox.ads.adservices.measurement.f.a(context.getSystemService(androidx.privacysandbox.ads.adservices.measurement.e.a()));
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
