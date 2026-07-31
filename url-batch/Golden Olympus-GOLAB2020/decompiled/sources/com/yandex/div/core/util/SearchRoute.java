package com.yandex.div.core.util;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class SearchRoute<T> {
    private int enterLeaveBalance;

    @Nullable
    private final T item;
    private int movedDistance;

    public SearchRoute(@Nullable T t4) {
        this.item = t4;
    }

    public final int distance() {
        return this.movedDistance;
    }

    @Nullable
    public final T getItem() {
        return this.item;
    }

    public final void onEnter() {
        this.enterLeaveBalance++;
        this.movedDistance++;
    }

    public final void onLeave() {
        int i4 = this.enterLeaveBalance;
        if (i4 <= 0) {
            this.movedDistance++;
        } else {
            this.enterLeaveBalance = i4 - 1;
            this.movedDistance--;
        }
    }
}
