package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r60 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f31051a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private Player f31052b;

    public final void a(@NotNull ml1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31051a.add(listener);
    }

    public final boolean b() {
        return this.f31052b != null;
    }

    @Nullable
    public final Player a() {
        return this.f31052b;
    }

    public final void a(@Nullable Player player) {
        this.f31052b = player;
        Iterator it = this.f31051a.iterator();
        while (it.hasNext()) {
            ((pi1) it.next()).a(player);
        }
    }
}
