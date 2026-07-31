package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.zh1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2059l5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ArrayList f28423a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile y60 f28424b;

    public static final void a(@NotNull y60 player) {
        Intrinsics.checkNotNullParameter(player, "player");
        f28424b = player;
        ArrayList arrayList = f28423a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            zh1.b listener = (zh1.b) obj;
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (f28424b != null) {
                y60 y60Var = f28424b;
                if (y60Var != null) {
                    y60Var.a(listener);
                }
            } else {
                f28423a.add(listener);
            }
        }
    }
}
