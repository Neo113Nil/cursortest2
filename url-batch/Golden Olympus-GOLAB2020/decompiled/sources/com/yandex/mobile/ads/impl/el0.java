package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ca2;
import com.yandex.mobile.ads.impl.ts;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class el0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<p42> f25336b = kotlin.collections.T.f(p42.f30337d, p42.f30338e, p42.f30336c, p42.f30335b, p42.f30339f);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<ca2.b, ts.a> f25337c = MapsKt.mapOf(TuplesKt.to(ca2.b.f24147b, ts.a.f32567c), TuplesKt.to(ca2.b.f24148c, ts.a.f32566b), TuplesKt.to(ca2.b.f24149d, ts.a.f32568d));

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r42 f25338a;

    public /* synthetic */ el0() {
        this(new r42(f25336b));
    }

    @Nullable
    public final ts a(@NotNull o42 timeOffset) {
        ts.a aVar;
        Intrinsics.checkNotNullParameter(timeOffset, "timeOffset");
        ca2 a4 = this.f25338a.a(timeOffset.a());
        if (a4 == null || (aVar = f25337c.get(a4.c())) == null) {
            return null;
        }
        return new ts(aVar, (long) a4.d());
    }

    public el0(@NotNull r42 timeOffsetParser) {
        Intrinsics.checkNotNullParameter(timeOffsetParser, "timeOffsetParser");
        this.f25338a = timeOffsetParser;
    }
}
