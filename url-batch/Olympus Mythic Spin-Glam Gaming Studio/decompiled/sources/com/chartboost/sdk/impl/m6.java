package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class m6 {
    public static final a d = new a(null);
    public static volatile l6 e;
    public final Context a;
    public final v6 b;
    public final o6 c;

    public m6(Context context, v6 displayMeasurement, o6 deviceFieldsWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        Intrinsics.checkNotNullParameter(deviceFieldsWrapper, "deviceFieldsWrapper");
        this.a = context;
        this.b = displayMeasurement;
        this.c = deviceFieldsWrapper;
    }

    public final l6 b() {
        try {
            w6 a2 = this.b.a();
            w6 d2 = this.b.d();
            String packageName = this.a.getPackageName();
            int b = a2.b();
            int a3 = a2.a();
            int b2 = d2.b();
            int a4 = d2.a();
            float b3 = this.b.b();
            String valueOf = String.valueOf(this.b.c());
            int a5 = this.c.a();
            String b4 = this.c.b();
            PackageManager packageManager = this.a.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            Intrinsics.checkNotNull(packageName);
            l6 l6Var = new l6(b, a3, b2, a4, b3, valueOf, a5, b4, packageName, q8.getPackageVersionName(packageManager, packageName), this.c.c());
            e = l6Var;
            return l6Var;
        } catch (Exception e2) {
            xb.b("Cannot create device body", e2);
            return new l6(0, 0, 0, 0, 0.0f, null, 0, null, null, null, false, 2047, null);
        }
    }

    public static final class a {
        public final l6 a() {
            return m6.e;
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
