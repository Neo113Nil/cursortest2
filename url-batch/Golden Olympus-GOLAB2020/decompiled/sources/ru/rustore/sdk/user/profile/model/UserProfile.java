package ru.rustore.sdk.user.profile.model;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class UserProfile {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String KEY_USER_ID = "userId";

    @Deprecated
    @NotNull
    public static final String KEY_VK_ID = "vkId";

    @NotNull
    private final Bundle bundle;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UserProfile(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.bundle = bundle;
    }

    public final long getUserId() {
        return this.bundle.getLong("userId");
    }

    public final long getVkId() {
        return this.bundle.getLong(KEY_VK_ID);
    }
}
