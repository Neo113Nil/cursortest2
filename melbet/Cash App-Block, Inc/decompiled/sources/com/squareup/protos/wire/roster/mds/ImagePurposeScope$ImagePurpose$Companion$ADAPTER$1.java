package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ImagePurposeScope$ImagePurpose$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ImagePurposeScope$ImagePurpose.Companion.getClass();
        switch (i) {
            case 0:
                return ImagePurposeScope$ImagePurpose.DO_NOT_USE;
            case 1:
                return ImagePurposeScope$ImagePurpose.PROFILE;
            case 2:
                return ImagePurposeScope$ImagePurpose.RECEIPT;
            case 3:
                return ImagePurposeScope$ImagePurpose.POINT_OF_SALE;
            case 4:
                return ImagePurposeScope$ImagePurpose.POINT_OF_SALE_ADDITIONAL;
            case 5:
                return ImagePurposeScope$ImagePurpose.PROFILE_BANNER;
            case 6:
                return ImagePurposeScope$ImagePurpose.POINT_OF_SALE_TERMINAL;
            default:
                return null;
        }
    }
}
