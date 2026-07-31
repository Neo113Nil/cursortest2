package ru.rustore.sdk.pay.internal;

import androidx.recyclerview.widget.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u9 extends h.f {
    @Override // androidx.recyclerview.widget.h.f
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        tm oldItem = (tm) obj;
        tm newItem = (tm) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.h.f
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        tm oldItem = (tm) obj;
        tm newItem = (tm) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.f45048a, newItem.f45048a);
    }
}
