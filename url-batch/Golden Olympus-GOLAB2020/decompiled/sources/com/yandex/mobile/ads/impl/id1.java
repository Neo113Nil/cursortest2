package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class id1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f62 f27157a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c92 f27158b;

    public id1(@NotNull f62 notice, @NotNull c92 validationResult) {
        Intrinsics.checkNotNullParameter(notice, "notice");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        this.f27157a = notice;
        this.f27158b = validationResult;
    }

    @NotNull
    public final f62 a() {
        return this.f27157a;
    }

    @NotNull
    public final c92 b() {
        return this.f27158b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id1)) {
            return false;
        }
        id1 id1Var = (id1) obj;
        return Intrinsics.areEqual(this.f27157a, id1Var.f27157a) && Intrinsics.areEqual(this.f27158b, id1Var.f27158b);
    }

    public final int hashCode() {
        return this.f27158b.hashCode() + (this.f27157a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.f27157a + ", validationResult=" + this.f27158b + ")";
    }
}
