package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$Text$Alignment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetEditorialResponse.EditorialContent.Text.Alignment.Companion.getClass();
        if (i == 0) {
            return GetEditorialResponse.EditorialContent.Text.Alignment.ALIGNMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return GetEditorialResponse.EditorialContent.Text.Alignment.ALIGNMENT_LEFT;
        }
        if (i == 2) {
            return GetEditorialResponse.EditorialContent.Text.Alignment.ALIGNMENT_CENTER;
        }
        if (i != 3) {
            return null;
        }
        return GetEditorialResponse.EditorialContent.Text.Alignment.ALIGNMENT_RIGHT;
    }
}
