package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rn1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final it1 f31306a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1937g2 f31307b;

    public rn1(@NotNull it1 schedulePlaylistItemsProvider, @NotNull C1937g2 adBreakStatusController) {
        Intrinsics.checkNotNullParameter(schedulePlaylistItemsProvider, "schedulePlaylistItemsProvider");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        this.f31306a = schedulePlaylistItemsProvider;
        this.f31307b = adBreakStatusController;
    }

    @Nullable
    public final ss a(long j4) {
        ArrayList a4 = this.f31306a.a();
        int size = a4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = a4.get(i4);
            i4++;
            wi1 wi1Var = (wi1) obj;
            ss a5 = wi1Var.a();
            boolean z4 = Math.abs(wi1Var.b() - j4) < 200;
            EnumC1913f2 a6 = this.f31307b.a(a5);
            if (z4 && EnumC1913f2.f25581d == a6) {
                return a5;
            }
        }
        return null;
    }
}
