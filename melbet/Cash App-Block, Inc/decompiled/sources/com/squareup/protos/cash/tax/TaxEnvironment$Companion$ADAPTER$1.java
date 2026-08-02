package com.squareup.protos.cash.tax;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class TaxEnvironment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TaxEnvironment.Companion.getClass();
        switch (i) {
            case 0:
                return TaxEnvironment.DEV;
            case 1:
                return TaxEnvironment.STAGE;
            case 2:
                return TaxEnvironment.PREFLIGHT;
            case 3:
                return TaxEnvironment.PROD;
            case 4:
                return TaxEnvironment.NEXT_YEAR_DEV;
            case 5:
                return TaxEnvironment.NEXT_YEAR_STAGE;
            case 6:
                return TaxEnvironment.NEXT_YEAR_PREFLIGHT;
            case 7:
                return TaxEnvironment.LOCAL;
            default:
                return null;
        }
    }
}
