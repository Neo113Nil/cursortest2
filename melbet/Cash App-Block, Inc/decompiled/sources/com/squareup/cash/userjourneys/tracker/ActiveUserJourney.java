package com.squareup.cash.userjourneys.tracker;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ActiveUserJourney {
    public final UUID id;
    public final boolean isSubJourney;
    public final UserJourney$Name name;

    public ActiveUserJourney(UserJourney$Name userJourney$Name, UUID uuid, boolean z) {
        userJourney$Name.getClass();
        uuid.getClass();
        this.name = userJourney$Name;
        this.id = uuid;
        this.isSubJourney = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveUserJourney)) {
            return false;
        }
        ActiveUserJourney activeUserJourney = (ActiveUserJourney) obj;
        return this.name == activeUserJourney.name && Intrinsics.areEqual(this.id, activeUserJourney.id) && this.isSubJourney == activeUserJourney.isSubJourney;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSubJourney) + ((this.id.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveUserJourney(name=");
        sb.append(this.name);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", isSubJourney=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isSubJourney, ")");
    }
}
