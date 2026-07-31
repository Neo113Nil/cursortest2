package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z90 extends h.f {
    @Override // androidx.recyclerview.widget.h.f
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        y90 oldItem = (y90) obj;
        y90 newItem = (y90) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.h.f
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        y90 oldItem = (y90) obj;
        y90 newItem = (y90) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof d90) && (newItem instanceof d90)) {
            return Intrinsics.areEqual(((d90) oldItem).a(), ((d90) newItem).a());
        }
        x90 x90Var = x90.f34503a;
        return Intrinsics.areEqual(oldItem, x90Var) && Intrinsics.areEqual(newItem, x90Var);
    }
}
