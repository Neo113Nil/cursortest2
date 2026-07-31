package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q60 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f30685a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private Player f30686b;

    public final void a(@NotNull ll1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30685a.add(listener);
    }

    public final boolean b() {
        return this.f30686b != null;
    }

    @Nullable
    public final Player a() {
        return this.f30686b;
    }

    public final void a(@Nullable Player player) {
        this.f30686b = player;
        Iterator it = this.f30685a.iterator();
        while (it.hasNext()) {
            ((oi1) it.next()).a(player);
        }
    }
}
