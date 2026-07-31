package ru.rustore.sdk.pay.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.pay.model.PackageName;
import ru.vk.store.provider.a;
import ru.vk.store.provider.b;

/* loaded from: classes3.dex */
public final class e1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final PackageName f43987a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f43988b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final y0 f43989c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final z0 f43990d;

    public static final class a extends b.a {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ru.vk.store.provider.b
        public final void onError(int i4, String errorMessage) {
            Throwable error;
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            z0 z0Var = e1.this.f43990d;
            if (i4 == 1001) {
                error = new RuStoreUserUnauthorizedException();
            } else if (i4 == 1004) {
                error = new RuStoreUserBannedException();
            } else if (i4 != 1005) {
                str = "Unknown error";
                if (!StringsKt.z(errorMessage)) {
                    try {
                        Result.Companion companion = Result.Companion;
                        str2 = Result.m243constructorimpl(new JSONObject(errorMessage).optString(CrashHianalyticsData.MESSAGE, "Unknown error"));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        str2 = Result.m243constructorimpl(ResultKt.createFailure(th));
                    }
                    str = Result.m244isFailureimpl(str2) ? "Unknown error" : str2;
                    Intrinsics.checkNotNullExpressionValue(str, "{\n            runCatchin…(DEFAULT_ERROR)\n        }");
                    str = str;
                }
                error = new RuStoreException(str);
            } else {
                error = new RuStoreApplicationBannedException();
            }
            Intrinsics.checkNotNullParameter(error, "error");
            z0Var.f45307a.error(error);
            Unit unit = Unit.f41027a;
        }

        @Override // ru.vk.store.provider.b
        public final void onSuccess(String paymentInfo) {
            Intrinsics.checkNotNullParameter(paymentInfo, "paymentInfo");
            y0 y0Var = e1.this.f43989c;
            Intrinsics.checkNotNullParameter(paymentInfo, "paymentInfo");
            y0Var.f45250a.success(paymentInfo);
            Unit unit = Unit.f41027a;
        }
    }

    public e1(@NotNull PackageName packageName, boolean z4, @NotNull y0 onSuccess, @NotNull z0 onError) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f43987a = packageName;
        this.f43988b = z4;
        this.f43989c = onSuccess;
        this.f43990d = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(@Nullable ComponentName componentName) {
        z0 z0Var = this.f43990d;
        RuntimeException error = new RuntimeException("onBindingDied");
        Intrinsics.checkNotNullParameter(error, "error");
        z0Var.f45307a.error(error);
        Unit unit = Unit.f41027a;
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(@Nullable ComponentName componentName) {
        z0 z0Var = this.f43990d;
        RuntimeException error = new RuntimeException("onNullBinding");
        Intrinsics.checkNotNullParameter(error, "error");
        z0Var.f45307a.error(error);
        Unit unit = Unit.f41027a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
        try {
            a.AbstractBinderC0261a.i(iBinder).a(this.f43987a.getValue(), this.f43988b, new a());
        } catch (Throwable error) {
            z0 z0Var = this.f43990d;
            Intrinsics.checkNotNullParameter(error, "error");
            z0Var.f45307a.error(error);
            Unit unit = Unit.f41027a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@Nullable ComponentName componentName) {
        z0 z0Var = this.f43990d;
        RuntimeException error = new RuntimeException("onServiceDisconnected");
        Intrinsics.checkNotNullParameter(error, "error");
        z0Var.f45307a.error(error);
        Unit unit = Unit.f41027a;
    }
}
