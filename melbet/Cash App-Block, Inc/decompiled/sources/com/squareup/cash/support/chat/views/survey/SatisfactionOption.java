package com.squareup.cash.support.chat.views.survey;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SatisfactionOption {
    public final String label;
    public final int rating;

    public SatisfactionOption(String str, int i) {
        str.getClass();
        this.label = str;
        this.rating = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SatisfactionOption)) {
            return false;
        }
        SatisfactionOption satisfactionOption = (SatisfactionOption) obj;
        return Intrinsics.areEqual(this.label, satisfactionOption.label) && this.rating == satisfactionOption.rating;
    }

    public final int hashCode() {
        return Integer.hashCode(this.rating) + (this.label.hashCode() * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("SatisfactionOption(label=", this.rating, this.label, ", rating=", ")");
    }
}
