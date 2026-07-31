package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivActionBinder$passToParentLongClickListener$1 extends s implements Function1<View, Boolean> {
    public static final DivActionBinder$passToParentLongClickListener$1 INSTANCE = new DivActionBinder$passToParentLongClickListener$1();

    DivActionBinder$passToParentLongClickListener$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z4 = false;
        do {
            ViewParent parent = view.getParent();
            view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (view == null || view.getParent() == null) {
                break;
            }
            z4 = view.performLongClick();
        } while (!z4);
        return Boolean.valueOf(z4);
    }
}
