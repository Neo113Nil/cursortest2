package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cw0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ow0 f24329a = new ow0();

    static final class a extends kotlin.jvm.internal.s implements Function1<u31, Set<? extends mw0>> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            u31 nativeAd = (u31) obj;
            Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
            cw0.this.f24329a.getClass();
            return ow0.a(nativeAd);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1<mw0, eu0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f24331b = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            mw0 mediaValue = (mw0) obj;
            Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
            return mediaValue.b();
        }
    }

    @NotNull
    public final Set<eu0> a(@NotNull h41 nativeAdBlock) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        return kotlin.sequences.k.E(kotlin.sequences.k.r(kotlin.sequences.k.y(kotlin.sequences.k.t(CollectionsKt.asSequence(nativeAdBlock.c().e()), new a()), b.f24331b)));
    }
}
