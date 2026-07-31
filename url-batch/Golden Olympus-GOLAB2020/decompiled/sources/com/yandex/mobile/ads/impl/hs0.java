package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hs0 {
    @NotNull
    public static ArrayList a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new lq0(context, new is0()));
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        if (a4 != null && !a4.g0()) {
            arrayList.add(ne0.a(context));
            arrayList.add(kf0.a(context));
        }
        return arrayList;
    }
}
