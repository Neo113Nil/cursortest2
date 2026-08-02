package com.stripe.android.financialconnections.di;

import androidx.core.os.LocaleListCompat;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.AppUpdateData;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory implements Factory {
    public final /* synthetic */ int $r8$classId;

    public abstract class InstanceHolder {
        public static final FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory INSTANCE = new FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory(0);
        public static final FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory INSTANCE$1 = new FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory(1);
        public static final FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory INSTANCE$2 = new FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory(2);
        public static final FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory INSTANCE$3 = new FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory(3);
        public static final FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory INSTANCE$4 = new FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory(4);
        public static final FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory INSTANCE$5 = new FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory(5);
    }

    public FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory(FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule) {
        this.$r8$classId = 6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return new ApiVersion(SetsKt__SetsJVMKt.setOf("financial_connections_client_api_beta=v1"));
            case 1:
                return Boolean.FALSE;
            case 2:
                LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
                if (adjustedDefault.isEmpty()) {
                    adjustedDefault = null;
                }
                if (adjustedDefault != null) {
                    return adjustedDefault.get(0);
                }
                return null;
            case 3:
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler);
                return defaultIoScheduler;
            case 4:
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler2);
                return defaultIoScheduler2;
            case 5:
                return AppUpdateData.Json$default(new MarkdownParser$$ExternalSyntheticLambda0(8));
            default:
                return new IntegrityVerdictManager();
        }
    }

    public /* synthetic */ FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory(int i) {
        this.$r8$classId = i;
    }
}
