package ru.rustore.sdk.pay.internal;

import androidx.recyclerview.widget.h;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.qm;

/* loaded from: classes3.dex */
public final class rm extends h.f {
    @Override // androidx.recyclerview.widget.h.f
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        qm oldItem = (qm) obj;
        qm newItem = (qm) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return ((oldItem instanceof qm.a) && (newItem instanceof qm.a)) ? Intrinsics.areEqual(oldItem, newItem) : (oldItem instanceof qm.b) && (newItem instanceof qm.b);
    }

    @Override // androidx.recyclerview.widget.h.f
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        qm oldItem = (qm) obj;
        qm newItem = (qm) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return ((oldItem instanceof qm.a) && (newItem instanceof qm.a)) ? Intrinsics.areEqual(((qm.a) oldItem).f44855a, ((qm.a) newItem).f44855a) : (oldItem instanceof qm.b) && (newItem instanceof qm.b);
    }
}
