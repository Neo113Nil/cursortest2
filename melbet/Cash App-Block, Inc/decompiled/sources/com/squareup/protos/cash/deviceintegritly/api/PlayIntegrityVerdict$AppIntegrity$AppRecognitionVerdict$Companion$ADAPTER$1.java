package com.squareup.protos.cash.deviceintegritly.api;

import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PlayIntegrityVerdict$AppIntegrity$AppRecognitionVerdict$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict.Companion.getClass();
        if (i == 1) {
            return PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict.PLAY_RECOGNIZED;
        }
        if (i == 2) {
            return PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict.UNRECOGNIZED_VERSION;
        }
        if (i == 3) {
            return PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict.UNEVALUATED;
        }
        if (i != 4) {
            return null;
        }
        return PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict.INVALID_ATTESTATION;
    }
}
