package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.MoneybotSuggestionView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppMessage$Message$MoneybotSuggestion extends zzjx {
    public final MoneybotSuggestionView value;

    public InAppMessage$Message$MoneybotSuggestion(MoneybotSuggestionView moneybotSuggestionView) {
        moneybotSuggestionView.getClass();
        this.value = moneybotSuggestionView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessage$Message$MoneybotSuggestion) && Intrinsics.areEqual(this.value, ((InAppMessage$Message$MoneybotSuggestion) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MoneybotSuggestion(value=" + this.value + ")";
    }
}
