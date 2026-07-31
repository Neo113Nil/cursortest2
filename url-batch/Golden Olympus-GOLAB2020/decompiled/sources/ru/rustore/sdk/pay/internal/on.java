package ru.rustore.sdk.pay.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class on {
    public static View a(ViewGroup viewGroup, int i4) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate");
        return inflate;
    }
}
