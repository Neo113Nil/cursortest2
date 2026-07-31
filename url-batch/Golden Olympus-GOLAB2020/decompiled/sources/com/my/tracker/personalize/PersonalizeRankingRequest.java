package com.my.tracker.personalize;

import androidx.annotation.NonNull;
import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PersonalizeRankingRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeRankingRequest> {
        Builder(String str) {
            super(str);
        }

        @Override // com.my.tracker.personalize.PersonalizePlacementsRequest.Builder
        @NonNull
        public PersonalizeRankingRequest build() {
            return new PersonalizeRankingRequest(this.f21632b, this.f21631a, this.f21634d, this.f21633c);
        }
    }

    PersonalizeRankingRequest(List list, String str, boolean z4, Map map) {
        super(list, str, z4, map);
    }

    @NonNull
    public static PersonalizePlacementsRequest.Builder<PersonalizeRankingRequest> newBuilder(@NonNull String str) {
        return new Builder(str);
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    String a() {
        return "/ranking";
    }
}
