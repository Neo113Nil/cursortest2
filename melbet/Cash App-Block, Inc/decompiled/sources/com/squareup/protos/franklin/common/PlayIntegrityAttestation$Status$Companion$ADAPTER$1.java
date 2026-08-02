package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.Path;

/* loaded from: classes.dex */
public final class PlayIntegrityAttestation$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PlayIntegrityAttestation.Status.Companion.getClass();
        return Path.Companion.m4349fromValue(i);
    }
}
