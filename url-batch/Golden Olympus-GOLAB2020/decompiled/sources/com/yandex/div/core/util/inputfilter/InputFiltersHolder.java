package com.yandex.div.core.util.inputfilter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class InputFiltersHolder implements BaseInputFilter {

    @NotNull
    private String currentValue;
    private int cursorPosition;

    @NotNull
    private final List<BaseInputFilter> filters;

    /* JADX WARN: Multi-variable type inference failed */
    public InputFiltersHolder(@NotNull List<? extends BaseInputFilter> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.filters = filters;
        this.currentValue = "";
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List<BaseInputFilter> list = this.filters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((BaseInputFilter) it.next()).checkValue(value)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final String getCurrentValue() {
        return this.currentValue;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    public final void setCurrentValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentValue = str;
    }

    public final void setCursorPosition(int i4) {
        this.cursorPosition = i4;
    }
}
