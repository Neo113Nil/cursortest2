package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivCollectionHolderMixin implements DivCollectionHolder {

    @Nullable
    private List<DivItemBuilderResult> items;

    @Override // com.yandex.div.core.view2.divs.widgets.DivCollectionHolder
    @Nullable
    public List<DivItemBuilderResult> getItems() {
        return this.items;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivCollectionHolder
    public void setItems(@Nullable List<DivItemBuilderResult> list) {
        this.items = list;
    }
}
