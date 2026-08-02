package com.squareup.util.android;

import android.content.ComponentName;
import android.content.Intent;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.cdf.NotificationType;
import com.squareup.cash.integration.analytics.Action;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.AnalyticsEventReceiver;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.SetupTeardown;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.Teardown;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final /* synthetic */ class ShareResultReceiver$$ExternalSyntheticLambda0 implements SetupTeardown {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Comparable f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ShareResultReceiver$$ExternalSyntheticLambda0(int i, Comparable comparable, Object obj) {
        this.$r8$classId = i;
        this.f$0 = comparable;
        this.f$1 = obj;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$1;
        Comparable comparable = this.f$0;
        switch (i) {
            case 0:
                ComponentName componentName = (ComponentName) comparable;
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) obj;
                int i2 = ShareResultReceiver.$r8$clinit;
                coroutineScope.getClass();
                variantSandboxedComponent.getClass();
                RealShareResultsReceiver realShareResultsReceiver = (RealShareResultsReceiver) ((VariantSandboxedComponent.Impl) variantSandboxedComponent).realShareResultsReceiverProvider.getValue();
                ShareResultsReceiver$ShareResult shareResultsReceiver$ShareResult = new ShareResultsReceiver$ShareResult(componentName, (Intent) obj2);
                realShareResultsReceiver.getClass();
                Timber.Forest.i("Share completed: componentName=" + componentName, new Object[0]);
                realShareResultsReceiver.mutableSharedResults.tryEmit(shareResultsReceiver$ShareResult);
                return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new Luhn$$ExternalSyntheticLambda0(9));
            default:
                VariantSandboxedComponent variantSandboxedComponent2 = (VariantSandboxedComponent) obj;
                int i3 = AnalyticsEventReceiver.$r8$clinit;
                coroutineScope.getClass();
                variantSandboxedComponent2.getClass();
                Analytics analytics = (Analytics) ((VariantSandboxedComponent.Impl) variantSandboxedComponent2).provideAnalyticsProvider.getValue();
                Action action = Action.CONFIRMED_COMPLETE;
                analytics.track(((Action) comparable).build((NotificationType) obj2, null), null);
                return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new ClusterItemKt$$ExternalSyntheticLambda0(11));
        }
    }
}
