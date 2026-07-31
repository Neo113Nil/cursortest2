package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class sn1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final it1 f31881a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1937g2 f31882b;

    public sn1(@NotNull it1 schedulePlaylistItemsProvider, @NotNull C1937g2 adBreakStatusController) {
        Intrinsics.checkNotNullParameter(schedulePlaylistItemsProvider, "schedulePlaylistItemsProvider");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        this.f31881a = schedulePlaylistItemsProvider;
        this.f31882b = adBreakStatusController;
    }

    @Nullable
    public final ss a(long j4) {
        boolean z4;
        ArrayList a4 = this.f31881a.a();
        int size = a4.size();
        for (int i4 = 0; i4 < size; i4++) {
            ss a5 = ((wi1) a4.get(i4)).a();
            if (i4 <= 0 ? j4 >= 0 : j4 > ((wi1) a4.get(i4 - 1)).b()) {
                if (j4 <= ((wi1) a4.get(i4)).b()) {
                    z4 = false;
                    EnumC1913f2 a6 = this.f31882b.a(a5);
                    if (z4 && EnumC1913f2.f25579b == a6) {
                        return a5;
                    }
                }
            }
            z4 = true;
            EnumC1913f2 a62 = this.f31882b.a(a5);
            if (z4) {
            }
        }
        return null;
    }
}
