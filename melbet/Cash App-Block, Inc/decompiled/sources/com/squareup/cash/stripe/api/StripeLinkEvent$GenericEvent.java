package com.squareup.cash.stripe.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class StripeLinkEvent$GenericEvent {
    public final String eventName;
    public final String failureReason;
    public final Institution institution;

    public StripeLinkEvent$GenericEvent(String str, Institution institution, String str2) {
        str.getClass();
        this.eventName = str;
        this.institution = institution;
        this.failureReason = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeLinkEvent$GenericEvent)) {
            return false;
        }
        StripeLinkEvent$GenericEvent stripeLinkEvent$GenericEvent = (StripeLinkEvent$GenericEvent) obj;
        return Intrinsics.areEqual(this.eventName, stripeLinkEvent$GenericEvent.eventName) && Intrinsics.areEqual(this.institution, stripeLinkEvent$GenericEvent.institution) && Intrinsics.areEqual(this.failureReason, stripeLinkEvent$GenericEvent.failureReason);
    }

    public final int hashCode() {
        int hashCode = (this.institution.hashCode() + (this.eventName.hashCode() * 31)) * 31;
        String str = this.failureReason;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenericEvent(eventName=");
        sb.append(this.eventName);
        sb.append(", institution=");
        sb.append(this.institution);
        sb.append(", failureReason=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.failureReason, ")");
    }
}
