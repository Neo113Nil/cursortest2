package com.yandex.div.core.widget;

import com.yandex.div.internal.widget.DivLayoutParams;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public abstract class GridContainerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float getColumnWeight(DivLayoutParams divLayoutParams) {
        return divLayoutParams.getHorizontalWeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getRowWeight(DivLayoutParams divLayoutParams) {
        return divLayoutParams.getVerticalWeight();
    }
}
