package ru.rustore.sdk.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.analytics.event.AnalyticsEvent;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.core.util.RuStoreUtils;

@Metadata
/* loaded from: classes3.dex */
public final class AnalyticsEventProvider {

    @NotNull
    private static final String ACTION = "ru.vk.store.provider.analytics.RemoteAnalyticsProvider";

    @NotNull
    public static final AnalyticsEventProvider INSTANCE = new AnalyticsEventProvider();

    @NotNull
    private static final String TAG = "AnalyticsEventProvider";

    private AnalyticsEventProvider() {
    }

    public final void postAnalyticsEvent(@NotNull Context context, @NotNull AnalyticsEvent analyticsEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        postAnalyticsEvent(context, analyticsEvent.getEventName(), analyticsEvent.getEventData());
    }

    public final void postAnalyticsEvent(@NotNull Context context, @NotNull String eventName, @NotNull Map<String, String> eventData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        if (RuStoreUtils.INSTANCE.isRuStoreInstalled(context)) {
            Intent intent = new Intent(ACTION);
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.q…IntentServices(intent, 0)");
            ComponentName findRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(queryIntentServices);
            if (findRuStoreServiceComponentName == null) {
                return;
            }
            intent.setComponent(findRuStoreServiceComponentName);
            G g4 = new G();
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            AnalyticsProviderServiceConnection analyticsProviderServiceConnection = new AnalyticsProviderServiceConnection(packageName, eventName, eventData, new AnalyticsEventProvider$postAnalyticsEvent$1(context, g4), new AnalyticsEventProvider$postAnalyticsEvent$2(context, g4));
            g4.f41132b = analyticsProviderServiceConnection;
            try {
                context.bindService(intent, analyticsProviderServiceConnection, 1);
            } catch (SecurityException e4) {
                Log.e(TAG, "postAnalyticsEvent", e4);
            }
        }
    }
}
