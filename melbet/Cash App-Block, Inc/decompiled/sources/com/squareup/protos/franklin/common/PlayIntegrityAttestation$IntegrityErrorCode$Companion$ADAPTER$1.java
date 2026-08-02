package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.ByteString;

/* loaded from: classes.dex */
public final class PlayIntegrityAttestation$IntegrityErrorCode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PlayIntegrityAttestation.IntegrityErrorCode.Companion.getClass();
        return ByteString.Companion.m4340fromValue(i);
    }
}
