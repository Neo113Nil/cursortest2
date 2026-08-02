package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$Section$ResultsType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ProfileDirectorySearchResponse.Section.ResultsType.Companion.getClass();
        if (i == 0) {
            return ProfileDirectorySearchResponse.Section.ResultsType.UNKNOWN_TYPE;
        }
        if (i == 1) {
            return ProfileDirectorySearchResponse.Section.ResultsType.SINGLE_ROW_RESULTS;
        }
        if (i != 2) {
            return null;
        }
        return ProfileDirectorySearchResponse.Section.ResultsType.MULTIPATH_GROUPING;
    }
}
