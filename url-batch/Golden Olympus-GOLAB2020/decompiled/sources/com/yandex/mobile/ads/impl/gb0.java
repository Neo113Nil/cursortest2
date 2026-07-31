package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.vy1;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gb0 implements vy1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vy1.a f26090a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26091b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26092c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f26093d;

    public gb0(int i4, int i5, @NotNull vy1.a sizeType) {
        Intrinsics.checkNotNullParameter(sizeType, "sizeType");
        this.f26090a = sizeType;
        this.f26091b = (i4 >= 0 || -1 == i4) ? i4 : 0;
        this.f26092c = (i5 >= 0 || -2 == i5) ? i5 : 0;
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String format = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        this.f26093d = format;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = this.f26092c;
        return -2 == i4 ? lh2.b(context) : i4;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = this.f26092c;
        return -2 == i4 ? lh2.c(context) : lh2.a(context, i4);
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = this.f26091b;
        return -1 == i4 ? lh2.d(context) : i4;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = this.f26091b;
        if (-1 != i4) {
            return lh2.a(context, i4);
        }
        int i5 = lh2.f28593b;
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(gb0.class, obj.getClass())) {
            gb0 gb0Var = (gb0) obj;
            if (this.f26091b == gb0Var.f26091b && this.f26092c == gb0Var.f26092c && this.f26090a == gb0Var.f26090a) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int getHeight() {
        return this.f26092c;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int getWidth() {
        return this.f26091b;
    }

    public final int hashCode() {
        return this.f26090a.hashCode() + C1842c3.a(this.f26093d, ((this.f26091b * 31) + this.f26092c) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return this.f26093d;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    @NotNull
    public final vy1.a a() {
        return this.f26090a;
    }
}
