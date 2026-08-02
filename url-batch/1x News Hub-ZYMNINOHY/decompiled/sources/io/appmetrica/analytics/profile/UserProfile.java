package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC0528go;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final List f8958a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f8959a;

        public /* synthetic */ Builder(int i3) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends InterfaceC0528go> userProfileUpdate) {
            this.f8959a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f8959a, 0);
        }

        private Builder() {
            this.f8959a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i3) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends InterfaceC0528go>> getUserProfileUpdates() {
        return this.f8958a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f8958a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
