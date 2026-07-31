package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ch2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bh2 f24216a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vq0 f24217b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bu0 f24218c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f24219d;

    public ch2(@NotNull bh2 view, @NotNull vq0 layoutParams, @NotNull bu0 measured, @NotNull Map<String, String> additionalInfo) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(measured, "measured");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.f24216a = view;
        this.f24217b = layoutParams;
        this.f24218c = measured;
        this.f24219d = additionalInfo;
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f24219d;
    }

    @NotNull
    public final vq0 b() {
        return this.f24217b;
    }

    @NotNull
    public final bu0 c() {
        return this.f24218c;
    }

    @NotNull
    public final bh2 d() {
        return this.f24216a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch2)) {
            return false;
        }
        ch2 ch2Var = (ch2) obj;
        return Intrinsics.areEqual(this.f24216a, ch2Var.f24216a) && Intrinsics.areEqual(this.f24217b, ch2Var.f24217b) && Intrinsics.areEqual(this.f24218c, ch2Var.f24218c) && Intrinsics.areEqual(this.f24219d, ch2Var.f24219d);
    }

    public final int hashCode() {
        return this.f24219d.hashCode() + ((this.f24218c.hashCode() + ((this.f24217b.hashCode() + (this.f24216a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ViewSizeInfo(view=" + this.f24216a + ", layoutParams=" + this.f24217b + ", measured=" + this.f24218c + ", additionalInfo=" + this.f24219d + ")";
    }
}
