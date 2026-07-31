package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public final class k9 {
    public final b9 a;
    public final j1 b;
    public final String c;

    public k9(b9 googleAdvertisingId, j1 amazonAdvertisingId, String manufacturer) {
        Intrinsics.checkNotNullParameter(googleAdvertisingId, "googleAdvertisingId");
        Intrinsics.checkNotNullParameter(amazonAdvertisingId, "amazonAdvertisingId");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        this.a = googleAdvertisingId;
        this.b = amazonAdvertisingId;
        this.c = manufacturer;
    }

    public final h1 a() {
        try {
            if (b()) {
                return this.b.b();
            }
            return this.a.b();
        } catch (Exception e) {
            xb.b("getAdvertisingId error", e);
            return new h1(xi.c, "");
        }
    }

    public final String a(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        String a = p6.a(context, z);
        Intrinsics.checkNotNullExpressionValue(a, "getUniqueId(...)");
        return a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ k9(b9 b9Var, j1 j1Var, String MANUFACTURER, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(b9Var, j1Var, MANUFACTURER);
        if ((i & 4) != 0) {
            MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        }
    }

    public final boolean b() {
        return StringsKt.equals("Amazon", this.c, true);
    }
}
