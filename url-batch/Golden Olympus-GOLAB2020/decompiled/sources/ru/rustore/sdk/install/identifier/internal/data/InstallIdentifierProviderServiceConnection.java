package ru.rustore.sdk.install.identifier.internal.data;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.vk.store.sdk.install.identifier.a;
import ru.vk.store.sdk.install.identifier.b;

@Metadata
/* loaded from: classes3.dex */
public final class InstallIdentifierProviderServiceConnection implements ServiceConnection {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int OWNER_BLOCKED = 1005;

    @Deprecated
    public static final int USER_BLOCKED = 1004;

    @Deprecated
    public static final int USER_UNAUTHORIZED_ERROR = 1001;

    @NotNull
    private final Function1<Throwable, Unit> onError;

    @NotNull
    private final Function1<String, Unit> onSuccess;

    @NotNull
    private final String packageName;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstallIdentifierProviderServiceConnection(@NotNull String packageName, @NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.packageName = packageName;
        this.onSuccess = onSuccess;
        this.onError = onError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Exception getError(int i4) {
        if (i4 == 1001) {
            return new RuStoreUserUnauthorizedException();
        }
        if (i4 == 1004) {
            return new RuStoreUserBannedException();
        }
        if (i4 == 1005) {
            return new RuStoreApplicationBannedException();
        }
        return new RuStoreException("Error code is " + i4);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
        try {
            b.a.i(iBinder).g(this.packageName, new a.AbstractBinderC0271a() { // from class: ru.rustore.sdk.install.identifier.internal.data.InstallIdentifierProviderServiceConnection$onServiceConnected$callback$1
                @Override // ru.vk.store.sdk.install.identifier.a
                public void onError(int i4) {
                    Function1 function1;
                    Exception error;
                    function1 = InstallIdentifierProviderServiceConnection.this.onError;
                    error = InstallIdentifierProviderServiceConnection.this.getError(i4);
                    function1.invoke(error);
                }

                @Override // ru.vk.store.sdk.install.identifier.a
                public void onSuccess(String data) {
                    Function1 function1;
                    Intrinsics.checkNotNullParameter(data, "data");
                    function1 = InstallIdentifierProviderServiceConnection.this.onSuccess;
                    function1.invoke(data);
                }
            });
        } catch (Throwable th) {
            this.onError.invoke(th);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@Nullable ComponentName componentName) {
        this.onError.invoke(new RuntimeException("onServiceDisconnected"));
    }
}
