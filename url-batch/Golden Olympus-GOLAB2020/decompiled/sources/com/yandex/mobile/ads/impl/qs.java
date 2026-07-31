package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qs {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<ss> f30881a;

    public qs(@NotNull ArrayList adBreaks) {
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        this.f30881a = adBreaks;
    }

    @NotNull
    public final List<ss> a() {
        return this.f30881a;
    }

    public final void b() {
        Iterator<ss> it = this.f30881a.iterator();
        while (it.hasNext()) {
            it.next().a(null);
        }
    }
}
