package com.squareup.protos.document;

import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class DocumentCategoryEntity$RenderStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DocumentCategoryEntity.RenderStyle.Companion.getClass();
        if (i == 0) {
            return DocumentCategoryEntity.RenderStyle.INVALID;
        }
        if (i == 1) {
            return DocumentCategoryEntity.RenderStyle.REVERSE_CHRONO_LIST;
        }
        if (i == 2) {
            return DocumentCategoryEntity.RenderStyle.CATEGORY_LIST_BY_PRIORITY;
        }
        if (i != 3) {
            return null;
        }
        return DocumentCategoryEntity.RenderStyle.REVERSE_CHRONO_LIST_BY_YEAR;
    }
}
