package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rl2 implements InstreamAdBreak {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ss f31272a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final tl2 f31273b;

    public /* synthetic */ rl2(ss ssVar) {
        this(ssVar, new tl2());
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof rl2) && Intrinsics.areEqual(((rl2) obj).f31272a, this.f31272a);
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    @NotNull
    public final InstreamAdBreakPosition getAdBreakPosition() {
        InstreamAdBreakPosition.Type type;
        tl2 tl2Var = this.f31273b;
        ts corePosition = this.f31272a.b();
        tl2Var.getClass();
        Intrinsics.checkNotNullParameter(corePosition, "corePosition");
        int ordinal = corePosition.a().ordinal();
        if (ordinal == 0) {
            type = InstreamAdBreakPosition.Type.PERCENTS;
        } else if (ordinal == 1) {
            type = InstreamAdBreakPosition.Type.MILLISECONDS;
        } else {
            if (ordinal != 2) {
                throw new W1.m();
            }
            type = InstreamAdBreakPosition.Type.POSITION;
        }
        return new InstreamAdBreakPosition(type, corePosition.b());
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    @NotNull
    public final String getType() {
        return this.f31272a.e();
    }

    public final int hashCode() {
        return this.f31272a.hashCode();
    }

    public rl2(@NotNull ss adBreak, @NotNull tl2 adBreakPositionAdapter) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(adBreakPositionAdapter, "adBreakPositionAdapter");
        this.f31272a = adBreak;
        this.f31273b = adBreakPositionAdapter;
    }
}
