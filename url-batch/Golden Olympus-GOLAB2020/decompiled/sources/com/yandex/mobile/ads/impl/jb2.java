package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jb2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<k70> f27623a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<a62> f27624b;

    private jb2(List<k70> list, List<a62> list2) {
        this.f27623a = list;
        this.f27624b = list2;
    }

    @NotNull
    public final List<k70> a() {
        return this.f27623a;
    }

    @NotNull
    public final List<a62> b() {
        return this.f27624b;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private List<k70> f27625a = CollectionsKt.emptyList();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private List<a62> f27626b = CollectionsKt.emptyList();

        @NotNull
        public final a a(@NotNull List<k70> extensions) {
            Intrinsics.checkNotNullParameter(extensions, "extensions");
            this.f27625a = extensions;
            return this;
        }

        @NotNull
        public final a b(@NotNull List<a62> trackingEvents) {
            Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
            this.f27626b = trackingEvents;
            return this;
        }

        @NotNull
        public final jb2 a() {
            return new jb2(this.f27625a, this.f27626b, 0);
        }
    }

    public /* synthetic */ jb2(List list, List list2, int i4) {
        this(list, list2);
    }
}
