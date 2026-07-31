package com.yandex.mobile.ads.impl;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tb0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Typeface f32278a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Typeface f32279b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Typeface f32280c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final Typeface f32281d;

    public tb0(@Nullable Typeface typeface, @Nullable Typeface typeface2, @Nullable Typeface typeface3, @Nullable Typeface typeface4) {
        this.f32278a = typeface;
        this.f32279b = typeface2;
        this.f32280c = typeface3;
        this.f32281d = typeface4;
    }

    @Nullable
    public final Typeface a() {
        return this.f32281d;
    }

    @Nullable
    public final Typeface b() {
        return this.f32278a;
    }

    @Nullable
    public final Typeface c() {
        return this.f32280c;
    }

    @Nullable
    public final Typeface d() {
        return this.f32279b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb0)) {
            return false;
        }
        tb0 tb0Var = (tb0) obj;
        return Intrinsics.areEqual(this.f32278a, tb0Var.f32278a) && Intrinsics.areEqual(this.f32279b, tb0Var.f32279b) && Intrinsics.areEqual(this.f32280c, tb0Var.f32280c) && Intrinsics.areEqual(this.f32281d, tb0Var.f32281d);
    }

    public final int hashCode() {
        Typeface typeface = this.f32278a;
        int hashCode = (typeface == null ? 0 : typeface.hashCode()) * 31;
        Typeface typeface2 = this.f32279b;
        int hashCode2 = (hashCode + (typeface2 == null ? 0 : typeface2.hashCode())) * 31;
        Typeface typeface3 = this.f32280c;
        int hashCode3 = (hashCode2 + (typeface3 == null ? 0 : typeface3.hashCode())) * 31;
        Typeface typeface4 = this.f32281d;
        return hashCode3 + (typeface4 != null ? typeface4.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "FontTypefaceData(light=" + this.f32278a + ", regular=" + this.f32279b + ", medium=" + this.f32280c + ", bold=" + this.f32281d + ")";
    }
}
