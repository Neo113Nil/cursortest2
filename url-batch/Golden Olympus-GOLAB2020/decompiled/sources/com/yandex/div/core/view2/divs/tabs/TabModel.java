package com.yandex.div.core.view2.divs.tabs;

import O1.Z;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class TabModel {

    @NotNull
    private final Z div;
    private final int index;

    @NotNull
    private final View view;

    public TabModel(int i4, @NotNull Z div, @NotNull View view) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(view, "view");
        this.index = i4;
        this.div = div;
        this.view = view;
    }

    @NotNull
    public final Z getDiv() {
        return this.div;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}
