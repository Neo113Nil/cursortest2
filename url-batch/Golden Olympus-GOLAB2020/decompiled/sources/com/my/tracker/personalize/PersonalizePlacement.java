package com.my.tracker.personalize;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class PersonalizePlacement {
    public final int groupId;

    @NonNull
    public final String id;

    @NonNull
    public final PersonalizeOffer offer;
    public final int testId;

    PersonalizePlacement(String str, int i4, int i5, PersonalizeOffer personalizeOffer) {
        this.id = str;
        this.groupId = i4;
        this.testId = i5;
        this.offer = personalizeOffer;
    }
}
