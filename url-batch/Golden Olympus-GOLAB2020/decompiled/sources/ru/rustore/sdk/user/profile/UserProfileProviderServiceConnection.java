package ru.rustore.sdk.user.profile;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.user.profile.model.UserProfile;
import ru.vk.store.provider.user.a;
import ru.vk.store.provider.user.b;

@Metadata
/* loaded from: classes3.dex */
public final class UserProfileProviderServiceConnection implements ServiceConnection {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int USER_UNAUTHORIZED_ERROR_CODE = 1001;

    @NotNull
    private final String applicationId;

    @NotNull
    private final Function1<RuStoreException, Unit> onError;

    @NotNull
    private final Function1<UserProfile, Unit> onSuccess;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileProviderServiceConnection(@NotNull String applicationId, @NotNull Function1<? super UserProfile, Unit> onSuccess, @NotNull Function1<? super RuStoreException, Unit> onError) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.applicationId = applicationId;
        this.onSuccess = onSuccess;
        this.onError = onError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RuStoreException createError(int i4, String str) {
        if (i4 == 1001) {
            return new RuStoreUserUnauthorizedException();
        }
        if (str == null) {
            str = "";
        }
        return new RuStoreException(str);
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(@Nullable ComponentName componentName) {
        this.onError.invoke(new RuStoreException("onBindingDied"));
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(@Nullable ComponentName componentName) {
        this.onError.invoke(new RuStoreException("onNullBinding"));
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
        try {
            a.AbstractBinderC0267a.i(iBinder).b(this.applicationId, new b.a() { // from class: ru.rustore.sdk.user.profile.UserProfileProviderServiceConnection$onServiceConnected$callback$1
                @Override // ru.vk.store.provider.user.b
                public void onError(int i4, String str) {
                    Function1 function1;
                    RuStoreException createError;
                    function1 = UserProfileProviderServiceConnection.this.onError;
                    createError = UserProfileProviderServiceConnection.this.createError(i4, str);
                    function1.invoke(createError);
                }

                @Override // ru.vk.store.provider.user.b
                public void onSuccess(Bundle userData) {
                    Function1 function1;
                    Intrinsics.checkNotNullParameter(userData, "userData");
                    function1 = UserProfileProviderServiceConnection.this.onSuccess;
                    function1.invoke(new UserProfile(userData));
                }
            });
        } catch (Exception e4) {
            Function1<RuStoreException, Unit> function1 = this.onError;
            String message = e4.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(new RuStoreException(message));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@Nullable ComponentName componentName) {
        this.onError.invoke(new RuStoreException("onServiceDisconnected"));
    }
}
