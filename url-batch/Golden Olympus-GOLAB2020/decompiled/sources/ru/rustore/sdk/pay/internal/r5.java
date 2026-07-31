package ru.rustore.sdk.pay.internal;

import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r5 {
    public static final int a(@NotNull Fragment fragment, int i4, int i5) {
        int i6;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        TypedValue typedValue = new TypedValue();
        return (!fragment.requireContext().getTheme().resolveAttribute(i4, typedValue, true) || (i6 = typedValue.resourceId) <= 0) ? i5 : i6;
    }
}
