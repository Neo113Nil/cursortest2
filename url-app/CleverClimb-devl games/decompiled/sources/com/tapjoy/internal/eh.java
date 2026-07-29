package com.tapjoy.internal;

/* loaded from: classes2.dex */
public enum eh {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);

    final int e;

    eh(int i) {
        this.e = i;
    }

    public final ek a() {
        switch (this) {
            case VARINT:
                return ek.j;
            case FIXED32:
                return ek.g;
            case FIXED64:
                return ek.l;
            case LENGTH_DELIMITED:
                return ek.q;
            default:
                throw new AssertionError();
        }
    }
}
