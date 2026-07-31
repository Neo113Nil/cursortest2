package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ku {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final c80 f28323a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<a62> f28324b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final yq0 f28325c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private c80 f28326a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private List<a62> f28327b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private yq0 f28328c;

        @NotNull
        public final void a(@Nullable c80 c80Var) {
            this.f28326a = c80Var;
        }

        @NotNull
        public final void a(@Nullable yq0 yq0Var) {
            this.f28328c = yq0Var;
        }

        @NotNull
        public final void a(@Nullable List list) {
            this.f28327b = list;
        }

        @NotNull
        public final ku a() {
            return new ku(this.f28326a, this.f28327b, this.f28328c);
        }
    }

    public ku(@Nullable c80 c80Var, @Nullable List<a62> list, @Nullable yq0 yq0Var) {
        this.f28323a = c80Var;
        this.f28324b = list;
        this.f28325c = yq0Var;
    }

    @Nullable
    public final c80 a() {
        return this.f28323a;
    }

    @Nullable
    public final yq0 b() {
        return this.f28325c;
    }

    @Nullable
    public final List<a62> c() {
        return this.f28324b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku)) {
            return false;
        }
        ku kuVar = (ku) obj;
        return Intrinsics.areEqual(this.f28323a, kuVar.f28323a) && Intrinsics.areEqual(this.f28324b, kuVar.f28324b) && Intrinsics.areEqual(this.f28325c, kuVar.f28325c);
    }

    public final int hashCode() {
        c80 c80Var = this.f28323a;
        int hashCode = (c80Var == null ? 0 : c80Var.hashCode()) * 31;
        List<a62> list = this.f28324b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        yq0 yq0Var = this.f28325c;
        return hashCode2 + (yq0Var != null ? yq0Var.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CreativeExtensions(falseClick=" + this.f28323a + ", trackingEvents=" + this.f28324b + ", linearCreativeInfo=" + this.f28325c + ")";
    }
}
