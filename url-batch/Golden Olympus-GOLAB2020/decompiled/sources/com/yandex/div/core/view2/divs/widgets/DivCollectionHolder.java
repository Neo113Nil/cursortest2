package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface DivCollectionHolder {
    @Nullable
    List<DivItemBuilderResult> getItems();

    void setItems(@Nullable List<DivItemBuilderResult> list);
}
