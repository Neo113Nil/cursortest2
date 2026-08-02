package com.squareup.cash.userjourneys.data;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/squareup/cash/userjourneys/data/CompletedJourney;", "", "journey", "Lcom/squareup/cash/userjourneys/data/UserJourney;", "terminationContext", "Lcom/squareup/cash/userjourneys/data/TerminationContext;", "<init>", "(Lcom/squareup/cash/userjourneys/data/UserJourney;Lcom/squareup/cash/userjourneys/data/TerminationContext;)V", "getJourney", "()Lcom/squareup/cash/userjourneys/data/UserJourney;", "getTerminationContext", "()Lcom/squareup/cash/userjourneys/data/TerminationContext;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CompletedJourney {
    private final UserJourney journey;
    private final TerminationContext terminationContext;

    public CompletedJourney(UserJourney userJourney, TerminationContext terminationContext) {
        userJourney.getClass();
        terminationContext.getClass();
        this.journey = userJourney;
        this.terminationContext = terminationContext;
    }

    public static /* synthetic */ CompletedJourney copy$default(CompletedJourney completedJourney, UserJourney userJourney, TerminationContext terminationContext, int i, Object obj) {
        if ((i & 1) != 0) {
            userJourney = completedJourney.journey;
        }
        if ((i & 2) != 0) {
            terminationContext = completedJourney.terminationContext;
        }
        return completedJourney.copy(userJourney, terminationContext);
    }

    /* renamed from: component1, reason: from getter */
    public final UserJourney getJourney() {
        return this.journey;
    }

    /* renamed from: component2, reason: from getter */
    public final TerminationContext getTerminationContext() {
        return this.terminationContext;
    }

    public final CompletedJourney copy(UserJourney journey, TerminationContext terminationContext) {
        journey.getClass();
        terminationContext.getClass();
        return new CompletedJourney(journey, terminationContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedJourney)) {
            return false;
        }
        CompletedJourney completedJourney = (CompletedJourney) other;
        return Intrinsics.areEqual(this.journey, completedJourney.journey) && Intrinsics.areEqual(this.terminationContext, completedJourney.terminationContext);
    }

    public final UserJourney getJourney() {
        return this.journey;
    }

    public final TerminationContext getTerminationContext() {
        return this.terminationContext;
    }

    public int hashCode() {
        return this.terminationContext.hashCode() + (this.journey.hashCode() * 31);
    }

    public String toString() {
        return "CompletedJourney(journey=" + this.journey + ", terminationContext=" + this.terminationContext + ")";
    }
}
