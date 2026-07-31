package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bb0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vy1 f23653a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f23654b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f23655c;

    public bb0(@NotNull Context context, @NotNull vy1 sizeInfo, @NotNull InterfaceC1912f1 adActivityListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f23653a = sizeInfo;
        this.f23654b = adActivityListener;
        this.f23655c = context.getApplicationContext();
    }

    public final void a() {
        int i4 = this.f23655c.getResources().getConfiguration().orientation;
        Context context = this.f23655c;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        vy1 vy1Var = this.f23653a;
        boolean b4 = C1801aa.b(context, vy1Var);
        boolean a4 = C1801aa.a(context, vy1Var);
        int i5 = b4 == a4 ? -1 : (!a4 ? 1 == i4 : 1 != i4) ? 6 : 7;
        if (-1 != i5) {
            this.f23654b.a(i5);
        }
    }
}
