package ru.rustore.sdk.user.profile;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapErrorKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.reactive.single.SingleTimeoutKt;
import ru.rustore.sdk.user.profile.model.UserProfile;

@Metadata
/* loaded from: classes3.dex */
public final class UserProfileProvider {

    @Deprecated
    @NotNull
    public static final String ACTION = "ru.vk.store.provider.user.RemoteUserProfileProvider";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long SERVICE_CONNECTION_TIMEOUT_MS = 30000;

    @NotNull
    private final Context context;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UserProfileProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Single<UserProfile> getUserProfileInternal(String str) {
        return Single.Companion.create(new UserProfileProvider$getUserProfileInternal$1(this, str));
    }

    @NotNull
    public final Single<UserProfile> getUserProfile(@NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        return SingleSubscribeOnKt.subscribeOn(SingleMapErrorKt.mapError(SingleTimeoutKt.timeout$default(getUserProfileInternal(applicationId), SERVICE_CONNECTION_TIMEOUT_MS, TimeUnit.MILLISECONDS, null, 4, null), UserProfileProvider$getUserProfile$1.INSTANCE), Dispatchers.INSTANCE.getIo());
    }
}
