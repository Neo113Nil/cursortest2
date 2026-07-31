package com.yandex.div.core.view2.divs.pager;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public interface FixedPageSizeProvider {
    boolean getHasOffScreenPages();

    float getItemSize();

    float getNeighbourSize();
}
