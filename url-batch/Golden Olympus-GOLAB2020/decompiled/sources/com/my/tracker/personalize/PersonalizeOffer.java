package com.my.tracker.personalize;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class PersonalizeOffer {
    public final int id;

    @NonNull
    public final List<PersonalizeItem> items;

    PersonalizeOffer(int i4, ArrayList arrayList) {
        this.id = i4;
        this.items = arrayList;
    }
}
