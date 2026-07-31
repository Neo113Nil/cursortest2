package com.my.tracker.personalize;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class PersonalizePlacementsRequest extends PersonalizeRequest<List<PersonalizePlacement>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map f21630a = d();
    public final Map<String, String> customParams;
    public final List<String> placements;
    public final boolean reset;

    @NonNull
    public final String userId;

    public static abstract class Builder<T extends PersonalizePlacementsRequest> {

        /* renamed from: a, reason: collision with root package name */
        final String f21631a;

        /* renamed from: b, reason: collision with root package name */
        List f21632b;

        /* renamed from: c, reason: collision with root package name */
        Map f21633c;

        /* renamed from: d, reason: collision with root package name */
        boolean f21634d = true;

        Builder(String str) {
            this.f21631a = str;
        }

        @NonNull
        public abstract T build();

        @NonNull
        public Builder<T> withCustomParams(Map<String, String> map) {
            if (map != null) {
                this.f21633c = new HashMap(map);
                return this;
            }
            this.f21633c = null;
            return this;
        }

        @NonNull
        public Builder<T> withPlacements(List<String> list) {
            if (list != null) {
                this.f21632b = new ArrayList(list);
                return this;
            }
            this.f21632b = null;
            return this;
        }

        @NonNull
        public Builder<T> withReset(boolean z4) {
            this.f21634d = z4;
            return this;
        }
    }

    PersonalizePlacementsRequest(List list, String str, boolean z4, Map map) {
        this.placements = list;
        this.userId = str;
        this.reset = z4;
        this.customParams = map;
    }

    private Map d() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.customParams;
        if (map != null && !map.isEmpty()) {
            this.customParams.remove("custom_user_id");
            this.customParams.remove("placement_ids");
            this.customParams.remove("reset");
            this.customParams.remove("flat");
            for (Map.Entry<String, String> entry : this.customParams.entrySet()) {
                hashMap.put(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
        }
        List<String> list = this.placements;
        if (list != null && !list.isEmpty()) {
            hashMap.put("placement_ids", this.placements);
        }
        if (!TextUtils.isEmpty(this.userId)) {
            hashMap.put("custom_user_id", Collections.singletonList(this.userId));
        }
        hashMap.put("reset", Collections.singletonList(this.reset ? "1" : "0"));
        hashMap.put("flat", Collections.singletonList("1"));
        return hashMap;
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    final Map b() {
        return this.f21630a;
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    final b c() {
        return new d();
    }
}
