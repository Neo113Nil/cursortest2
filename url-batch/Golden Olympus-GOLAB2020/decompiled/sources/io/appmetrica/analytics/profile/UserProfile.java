package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC2528bo;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final List f40669a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f40670a;

        /* synthetic */ Builder(int i4) {
            this();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends InterfaceC2528bo> userProfileUpdate) {
            this.f40670a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.f40670a, 0);
        }

        private Builder() {
            this.f40670a = new LinkedList();
        }
    }

    /* synthetic */ UserProfile(LinkedList linkedList, int i4) {
        this(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends InterfaceC2528bo>> getUserProfileUpdates() {
        return this.f40669a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f40669a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
