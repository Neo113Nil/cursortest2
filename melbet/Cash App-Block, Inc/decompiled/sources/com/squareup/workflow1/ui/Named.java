package com.squareup.workflow1.ui;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.slf4j.Marker;

/* loaded from: classes8.dex */
public final class Named implements Compatible {
    public final String compatibilityKey;
    public final String name;
    public final Object wrapped;

    public Named(Object obj, String str) {
        this.wrapped = obj;
        this.name = str;
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("name must not be blank.");
            throw null;
        }
        Compatible compatible = obj instanceof Compatible ? (Compatible) obj : null;
        String compatibilityKey = compatible != null ? compatible.getCompatibilityKey() : null;
        this.compatibilityKey = Intrinsics.stringPlus(str.length() == 0 ? "" : Intrinsics.stringPlus(str, Marker.ANY_NON_NULL_MARKER), compatibilityKey == null ? obj.getClass().getName() : compatibilityKey);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Named)) {
            return false;
        }
        Named named = (Named) obj;
        return this.wrapped.equals(named.wrapped) && this.name.equals(named.name);
    }

    @Override // com.squareup.workflow1.ui.Compatible
    public final String getCompatibilityKey() {
        return this.compatibilityKey;
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.wrapped.hashCode() * 31);
    }

    public final String toString() {
        return super.toString() + ": " + this.compatibilityKey;
    }
}
