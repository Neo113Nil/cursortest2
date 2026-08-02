package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes8.dex */
public enum ImagePurposeScope$ImagePurpose implements WireEnum {
    DO_NOT_USE(0),
    PROFILE(1),
    RECEIPT(2),
    POINT_OF_SALE(3),
    POINT_OF_SALE_ADDITIONAL(4),
    POINT_OF_SALE_TERMINAL(6),
    PROFILE_BANNER(5);

    public static final ImagePurposeScope$ImagePurpose$Companion$ADAPTER$1 ADAPTER;
    public static final y0 Companion;
    public final int value;

    static {
        ImagePurposeScope$ImagePurpose imagePurposeScope$ImagePurpose = DO_NOT_USE;
        Companion = new y0();
        ADAPTER = new ImagePurposeScope$ImagePurpose$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ImagePurposeScope$ImagePurpose.class), Syntax.PROTO_2, imagePurposeScope$ImagePurpose);
    }

    ImagePurposeScope$ImagePurpose(int i) {
        this.value = i;
    }

    public static final ImagePurposeScope$ImagePurpose fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return DO_NOT_USE;
            case 1:
                return PROFILE;
            case 2:
                return RECEIPT;
            case 3:
                return POINT_OF_SALE;
            case 4:
                return POINT_OF_SALE_ADDITIONAL;
            case 5:
                return PROFILE_BANNER;
            case 6:
                return POINT_OF_SALE_TERMINAL;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
