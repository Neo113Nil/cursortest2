package ru.rustore.sdk.metrics.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f43700a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.h f43701b;

    public static final class a extends kotlin.jvm.internal.s implements Function0<c1> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object m243constructorimpl;
            String value;
            d1 d1Var = d1.this;
            try {
                Result.Companion companion = Result.Companion;
                PackageManager packageManager = d1Var.f43700a.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                String packageName = d1Var.f43700a.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                value = e1.a(packageManager, packageName).versionName;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Intrinsics.checkNotNullExpressionValue(value, "requireNotNull(context.p…packageName).versionName)");
            Intrinsics.checkNotNullParameter(value, "value");
            m243constructorimpl = Result.m243constructorimpl(new c1(value));
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = null;
            }
            c1 c1Var = (c1) m243constructorimpl;
            String str = c1Var != null ? c1Var.f43696a : null;
            if (str != null) {
                return new c1(str);
            }
            return null;
        }
    }

    public d1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43700a = context;
        this.f43701b = W1.i.b(new a());
    }
}
