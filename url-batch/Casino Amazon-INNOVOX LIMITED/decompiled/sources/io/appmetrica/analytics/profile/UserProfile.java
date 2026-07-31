package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC0185fo;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final List f1691a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f1692a;

        /* synthetic */ Builder(int i) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends InterfaceC0185fo> userProfileUpdate) {
            this.f1692a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f1692a, 0);
        }

        private Builder() {
            this.f1692a = new LinkedList();
        }
    }

    /* synthetic */ UserProfile(LinkedList linkedList, int i) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends InterfaceC0185fo>> getUserProfileUpdates() {
        return this.f1691a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f1691a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
