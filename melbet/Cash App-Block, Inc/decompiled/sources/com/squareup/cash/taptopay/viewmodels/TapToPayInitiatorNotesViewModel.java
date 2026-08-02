package com.squareup.cash.taptopay.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TapToPayInitiatorNotesViewModel {
    public final boolean canGoToNext;
    public final boolean isDemoMode;
    public final List suggestions;

    public TapToPayInitiatorNotesViewModel(List list, boolean z, boolean z2) {
        list.getClass();
        this.canGoToNext = z;
        this.suggestions = list;
        this.isDemoMode = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapToPayInitiatorNotesViewModel)) {
            return false;
        }
        TapToPayInitiatorNotesViewModel tapToPayInitiatorNotesViewModel = (TapToPayInitiatorNotesViewModel) obj;
        return this.canGoToNext == tapToPayInitiatorNotesViewModel.canGoToNext && Intrinsics.areEqual(this.suggestions, tapToPayInitiatorNotesViewModel.suggestions) && this.isDemoMode == tapToPayInitiatorNotesViewModel.isDemoMode;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isDemoMode) + Recorder$$ExternalSyntheticOutline2.m(Boolean.hashCode(this.canGoToNext) * 31, 31, this.suggestions);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TapToPayInitiatorNotesViewModel(canGoToNext=");
        sb.append(this.canGoToNext);
        sb.append(", suggestions=");
        sb.append(this.suggestions);
        sb.append(", isDemoMode=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isDemoMode, ")");
    }
}
