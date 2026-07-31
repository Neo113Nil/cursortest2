package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vw extends h.f {
    @Override // androidx.recyclerview.widget.h.f
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        wx prevItem = (wx) obj;
        wx newItem = (wx) obj2;
        Intrinsics.checkNotNullParameter(prevItem, "prevItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return prevItem.a(newItem);
    }

    @Override // androidx.recyclerview.widget.h.f
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        wx prevItem = (wx) obj;
        wx newItem = (wx) obj2;
        Intrinsics.checkNotNullParameter(prevItem, "prevItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return prevItem.a(newItem);
    }
}
