package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class PlayIntegrityAttestation$AttestationType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PlayIntegrityAttestation.AttestationType.Companion.getClass();
        if (i == 0) {
            return PlayIntegrityAttestation.AttestationType.CLASSIC;
        }
        if (i != 1) {
            return null;
        }
        return PlayIntegrityAttestation.AttestationType.STANDARD;
    }
}
