package com.squareup.cash.userjourneys.data;

import com.squareup.moshi.JsonClass;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/userjourneys/data/JsonJourneyList;", "", "journeyList", "", "Lcom/squareup/cash/userjourneys/data/UserJourney;", "<init>", "(Ljava/util/Set;)V", "getJourneyList", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class JsonJourneyList {
    private final Set<UserJourney> journeyList;

    public JsonJourneyList(Set<UserJourney> set) {
        set.getClass();
        this.journeyList = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JsonJourneyList copy$default(JsonJourneyList jsonJourneyList, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = jsonJourneyList.journeyList;
        }
        return jsonJourneyList.copy(set);
    }

    public final Set<UserJourney> component1() {
        return this.journeyList;
    }

    public final JsonJourneyList copy(Set<UserJourney> journeyList) {
        journeyList.getClass();
        return new JsonJourneyList(journeyList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JsonJourneyList) && Intrinsics.areEqual(this.journeyList, ((JsonJourneyList) other).journeyList);
    }

    public final Set<UserJourney> getJourneyList() {
        return this.journeyList;
    }

    public int hashCode() {
        return this.journeyList.hashCode();
    }

    public String toString() {
        return "JsonJourneyList(journeyList=" + this.journeyList + ")";
    }
}
