package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.au0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.hb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1970hb implements au0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26689a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a10 f26690b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d10 f26691c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f26692d;

    public /* synthetic */ C1970hb(Context context, boolean z4, int i4) {
        this(context, (i4 & 2) != 0 ? false : z4, new a10(), new d10());
    }

    @Override // com.yandex.mobile.ads.impl.au0
    @NotNull
    public final au0.a a(int i4, int i5) {
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i4);
        if (mode != 0) {
            Context context = this.f26692d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            int i6 = lh2.f28593b;
            Intrinsics.checkNotNullParameter(context, "context");
            int i7 = context.getResources().getDisplayMetrics().widthPixels;
            d10 d10Var = this.f26691c;
            Context context2 = this.f26692d;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            d10Var.getClass();
            int a4 = d10.a(context2, 420.0f);
            int i8 = this.f26692d.getResources().getConfiguration().orientation;
            a10 a10Var = this.f26690b;
            Context context3 = this.f26692d;
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            if (a10Var.a(context3) != z00.f35411b || i8 != 1) {
                i7 = (int) Math.min(i7, a4);
            }
            i4 = View.MeasureSpec.makeMeasureSpec((int) Math.min(i7, size), 1073741824);
        }
        if (mode2 != 0) {
            boolean z4 = this.f26689a;
            Context context4 = this.f26692d;
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            int c4 = lh2.c(context4);
            d10 d10Var2 = this.f26691c;
            Context context5 = this.f26692d;
            Intrinsics.checkNotNullExpressionValue(context5, "context");
            d10Var2.getClass();
            int a5 = d10.a(context5, 350.0f);
            if (!z4) {
                c4 = (int) Math.min(c4, a5);
            }
            i5 = View.MeasureSpec.makeMeasureSpec((int) Math.min(c4, size2), 1073741824);
        }
        au0.a aVar = new au0.a();
        aVar.f23450b = i5;
        aVar.f23449a = i4;
        return aVar;
    }

    public C1970hb(@NotNull Context context, boolean z4, @NotNull a10 deviceTypeProvider, @NotNull d10 dimensionConverter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f26689a = z4;
        this.f26690b = deviceTypeProvider;
        this.f26691c = dimensionConverter;
        this.f26692d = context.getApplicationContext();
    }
}
