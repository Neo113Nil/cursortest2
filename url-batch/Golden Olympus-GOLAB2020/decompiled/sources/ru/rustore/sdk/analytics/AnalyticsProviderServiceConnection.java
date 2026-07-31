package ru.rustore.sdk.analytics;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.vk.store.provider.analytics.a;
import ru.vk.store.provider.analytics.b;

@Metadata
/* loaded from: classes3.dex */
public final class AnalyticsProviderServiceConnection implements ServiceConnection {

    @NotNull
    private final String applicationId;

    @NotNull
    private final Map<String, String> eventData;

    @NotNull
    private final String eventName;

    @NotNull
    private final Function1<RuStoreException, Unit> onError;

    @NotNull
    private final Function0<Unit> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsProviderServiceConnection(@NotNull String applicationId, @NotNull String eventName, @NotNull Map<String, String> eventData, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super RuStoreException, Unit> onError) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.applicationId = applicationId;
        this.eventName = eventName;
        this.eventData = eventData;
        this.onSuccess = onSuccess;
        this.onError = onError;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
        try {
            a.AbstractBinderC0263a.i(iBinder).d(this.applicationId, this.eventName, MappingExtKt.toBundle(this.eventData), new b.a() { // from class: ru.rustore.sdk.analytics.AnalyticsProviderServiceConnection$onServiceConnected$callback$1
                @Override // ru.vk.store.provider.analytics.b
                public void onError(int i4, String str) {
                    Function1 function1;
                    function1 = AnalyticsProviderServiceConnection.this.onError;
                    if (str == null) {
                        str = "";
                    }
                    function1.invoke(new RuStoreException(str));
                }

                @Override // ru.vk.store.provider.analytics.b
                public void onSuccess() {
                    Function0 function0;
                    function0 = AnalyticsProviderServiceConnection.this.onSuccess;
                    function0.invoke();
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
