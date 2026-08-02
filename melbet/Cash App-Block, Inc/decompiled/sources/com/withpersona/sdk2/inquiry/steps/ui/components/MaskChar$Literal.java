package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.google.android.play.integrity.internal.aj;

/* loaded from: classes9.dex */
public final class MaskChar$Literal extends aj {

    /* renamed from: char, reason: not valid java name */
    public final char f831char;

    public MaskChar$Literal(char c) {
        this.f831char = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaskChar$Literal) && this.f831char == ((MaskChar$Literal) obj).f831char;
    }

    public final int hashCode() {
        return Character.hashCode(this.f831char);
    }

    public final String toString() {
        return "Literal(char=" + this.f831char + ")";
    }
}
