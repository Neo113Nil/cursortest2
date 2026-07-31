package com.yandex.div.core.view2.reuse;

import O1.Z;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class Token {
    private final int childIndex;

    @NotNull
    private final Z div;
    private final int divHash;

    @NotNull
    private final DivItemBuilderResult item;

    public Token(@NotNull DivItemBuilderResult item, int i4) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.childIndex = i4;
        this.divHash = item.getDiv().propertiesHash();
        this.div = item.getDiv();
    }

    public final int getChildIndex() {
        return this.childIndex;
    }

    @NotNull
    public final Z getDiv() {
        return this.div;
    }

    public final int getDivHash() {
        return this.divHash;
    }

    @NotNull
    public final DivItemBuilderResult getItem() {
        return this.item;
    }

    public final boolean isCombinable(@NotNull Token other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.divHash == other.divHash && Intrinsics.areEqual(DivUtilKt.getType(this.div), DivUtilKt.getType(other.div));
    }
}
