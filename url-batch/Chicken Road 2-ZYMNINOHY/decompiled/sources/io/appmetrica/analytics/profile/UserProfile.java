package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC0598eo;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final List f13386a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f13387a;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends InterfaceC0598eo> userProfileUpdate) {
            this.f13387a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f13387a, 0);
        }

        private Builder() {
            this.f13387a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i4) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends InterfaceC0598eo>> getUserProfileUpdates() {
        return this.f13386a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f13386a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
