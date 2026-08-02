package com.squareup.wire;

import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);

    public final int value;

    FieldEncoding(int i) {
        this.value = i;
    }

    public final ProtoAdapter rawProtoAdapter() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return ProtoAdapter.UINT64;
        }
        if (ordinal == 1) {
            return ProtoAdapter.FIXED64;
        }
        if (ordinal == 2) {
            return ProtoAdapter.BYTES;
        }
        if (ordinal == 3) {
            return ProtoAdapter.FIXED32;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
