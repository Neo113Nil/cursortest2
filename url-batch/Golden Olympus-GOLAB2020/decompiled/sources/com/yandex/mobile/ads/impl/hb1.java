package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ow0 f26695a;

    static final class a extends kotlin.jvm.internal.s implements Function1<ab2, ob2<ya1>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26696b = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ab2 it = (ab2) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.b();
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1<ob2<ya1>, Pair<? extends String, ? extends String>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f26697b = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ob2 it = (ob2) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return TuplesKt.to(((ya1) it.d()).getUrl(), it.e());
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function1<ab2, ej0> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f26698b = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ab2 it = (ab2) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.a();
        }
    }

    public /* synthetic */ hb1() {
        this(new ow0());
    }

    @NotNull
    public final SortedSet b(@NotNull n61 nativeAdResponse) {
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        return kotlin.sequences.k.k(kotlin.sequences.k.y(kotlin.sequences.k.y(kotlin.sequences.k.z(kotlin.sequences.k.t(CollectionsKt.asSequence(nativeAdResponse.e()), new kb1(this)), lb1.f28501b), ib1.f27153b), jb1.f27622b));
    }

    @NotNull
    public final Set<ej0> c(@NotNull n61 nativeAdResponse) {
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        return kotlin.sequences.k.E(kotlin.sequences.k.z(kotlin.sequences.k.z(kotlin.sequences.k.t(CollectionsKt.asSequence(nativeAdResponse.e()), new kb1(this)), lb1.f28501b), c.f26698b));
    }

    @NotNull
    public final List<Pair<String, String>> a(@NotNull n61 nativeAdResponse) {
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        return kotlin.sequences.k.D(kotlin.sequences.k.y(kotlin.sequences.k.y(kotlin.sequences.k.z(kotlin.sequences.k.t(CollectionsKt.asSequence(nativeAdResponse.e()), new kb1(this)), lb1.f28501b), a.f26696b), b.f26697b));
    }

    public hb1(@NotNull ow0 mediaValuesProvider) {
        Intrinsics.checkNotNullParameter(mediaValuesProvider, "mediaValuesProvider");
        this.f26695a = mediaValuesProvider;
    }
}
