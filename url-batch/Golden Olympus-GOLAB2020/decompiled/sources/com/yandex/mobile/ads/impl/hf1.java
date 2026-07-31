package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.vy1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hf1 implements vy1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f26730a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vy1 f26731b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final vy1 f26732c;

    public hf1(@NotNull Context appContext, @NotNull gb0 portraitSizeInfo, @NotNull gb0 landscapeSizeInfo) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(portraitSizeInfo, "portraitSizeInfo");
        Intrinsics.checkNotNullParameter(landscapeSizeInfo, "landscapeSizeInfo");
        this.f26730a = appContext;
        this.f26731b = portraitSizeInfo;
        this.f26732c = landscapeSizeInfo;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return xr.b(context) == cf1.f24192c ? this.f26732c.a(context) : this.f26731b.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return xr.b(context) == cf1.f24192c ? this.f26732c.b(context) : this.f26731b.b(context);
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return xr.b(context) == cf1.f24192c ? this.f26732c.c(context) : this.f26731b.c(context);
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return xr.b(context) == cf1.f24192c ? this.f26732c.d(context) : this.f26731b.d(context);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf1)) {
            return false;
        }
        hf1 hf1Var = (hf1) obj;
        return Intrinsics.areEqual(this.f26730a, hf1Var.f26730a) && Intrinsics.areEqual(this.f26731b, hf1Var.f26731b) && Intrinsics.areEqual(this.f26732c, hf1Var.f26732c);
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int getHeight() {
        return xr.b(this.f26730a) == cf1.f24192c ? this.f26732c.getHeight() : this.f26731b.getHeight();
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int getWidth() {
        return xr.b(this.f26730a) == cf1.f24192c ? this.f26732c.getWidth() : this.f26731b.getWidth();
    }

    public final int hashCode() {
        return this.f26732c.hashCode() + ((this.f26731b.hashCode() + (this.f26730a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return xr.b(this.f26730a) == cf1.f24192c ? this.f26732c.toString() : this.f26731b.toString();
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    @NotNull
    public final vy1.a a() {
        if (xr.b(this.f26730a) == cf1.f24192c) {
            return this.f26732c.a();
        }
        return this.f26731b.a();
    }
}
