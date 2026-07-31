package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class it1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f27390a;

    public it1(@NotNull wl0 instreamAdPlaylist) {
        Intrinsics.checkNotNullParameter(instreamAdPlaylist, "instreamAdPlaylist");
        this.f27390a = a(instreamAdPlaylist);
    }

    private static ArrayList a(wl0 wl0Var) {
        ArrayList arrayList = new ArrayList();
        ss c4 = wl0Var.c();
        if (c4 != null) {
            arrayList.add(new wi1(c4, 0L));
        }
        arrayList.addAll(wl0Var.a());
        return arrayList;
    }

    @NotNull
    public final ArrayList a() {
        return this.f27390a;
    }
}
