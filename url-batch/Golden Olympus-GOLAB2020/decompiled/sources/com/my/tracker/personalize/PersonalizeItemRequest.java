package com.my.tracker.personalize;

import androidx.annotation.NonNull;
import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PersonalizeItemRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> {
        Builder(String str) {
            super(str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.my.tracker.personalize.PersonalizePlacementsRequest.Builder
        @NonNull
        public PersonalizeItemRequest build() {
            return new PersonalizeItemRequest(this.f21632b, this.f21631a, this.f21634d, this.f21633c);
        }
    }

    PersonalizeItemRequest(List list, String str, boolean z4, Map map) {
        super(list, str, z4, map);
    }

    public static PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> newBuilder(@NonNull String str) {
        return new Builder(str);
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    String a() {
        return "/item";
    }
}
