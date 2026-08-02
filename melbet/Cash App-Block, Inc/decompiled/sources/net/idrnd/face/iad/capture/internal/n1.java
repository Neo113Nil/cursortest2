package net.idrnd.face.iad.capture.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes9.dex */
public enum n1 implements Internal.EnumLite {
    CENTER_TOP(0),
    CENTER_CENTER(1),
    CENTER_BOTTOM(2),
    LEFT_TOP(3),
    LEFT_CENTER(4),
    LEFT_BOTTOM(5),
    RIGHT_TOP(6),
    RIGHT_CENTER(7),
    RIGHT_BOTTOM(8),
    UNRECOGNIZED(-1);

    public final int a;

    n1(int i) {
        this.a = i;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }
}
