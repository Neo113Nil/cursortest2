package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ca2;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gz1 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashSet f26397b = new HashSet(CollectionsKt.listOf((Object[]) new p42[]{p42.f30336c, p42.f30335b}));

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r42 f26398a;

    public /* synthetic */ gz1() {
        this(new r42(f26397b));
    }

    @Nullable
    public final dd2 a(@NotNull hu creative) {
        Intrinsics.checkNotNullParameter(creative, "creative");
        int e4 = creative.e();
        hz1 i4 = creative.i();
        if (i4 == null) {
            return null;
        }
        ca2 a4 = this.f26398a.a(i4.a());
        if (a4 == null) {
            return null;
        }
        float d4 = a4.d();
        if (ca2.b.f24148c == a4.c()) {
            d4 = (long) ((d4 / 100) * e4);
        }
        return new dd2((long) Math.min(d4, e4));
    }

    public gz1(@NotNull r42 timeOffsetParser) {
        Intrinsics.checkNotNullParameter(timeOffsetParser, "timeOffsetParser");
        this.f26398a = timeOffsetParser;
    }
}
