package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest;
import androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest;
import androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdSelectionManagerFutures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures;", "", "Companion", "Api33Ext4JavaImpl", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AdSelectionManagerFutures {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdSelectionManagerFutures.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0006\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionConfig", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "selectAdsAsync", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "adSelectionFromOutcomesConfig", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "reportImpressionRequest", "", "reportImpressionAsync", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "updateAdCounterHistogramRequest", "updateAdCounterHistogramAsync", "(Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportEventRequest", "reportEventAsync", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "getAdSelectionDataAsync", "(Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "persistAdSelectionResultRequest", "persistAdSelectionResultAsync", "(Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "mAdSelectionManager", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {
        private final AdSelectionManager mAdSelectionManager;

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture selectAdsAsync(@NotNull AdSelectionConfig adSelectionConfig) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(adSelectionConfig, "adSelectionConfig");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture selectAdsAsync(@NotNull AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(adSelectionFromOutcomesConfig, "adSelectionFromOutcomesConfig");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2(this, adSelectionFromOutcomesConfig, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture reportImpressionAsync(@NotNull ReportImpressionRequest reportImpressionRequest) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(reportImpressionRequest, "reportImpressionRequest");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this, reportImpressionRequest, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture updateAdCounterHistogramAsync(@NotNull UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(updateAdCounterHistogramRequest, "updateAdCounterHistogramRequest");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1(this, updateAdCounterHistogramRequest, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture reportEventAsync(@NotNull ReportEventRequest reportEventRequest) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(reportEventRequest, "reportEventRequest");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportEventAsync$1(this, reportEventRequest, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture getAdSelectionDataAsync(@NotNull GetAdSelectionDataRequest getAdSelectionDataRequest) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(getAdSelectionDataRequest, "getAdSelectionDataRequest");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$getAdSelectionDataAsync$1(this, getAdSelectionDataRequest, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture persistAdSelectionResultAsync(@NotNull PersistAdSelectionResultRequest persistAdSelectionResultRequest) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(persistAdSelectionResultRequest, "persistAdSelectionResultRequest");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1(this, persistAdSelectionResultRequest, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }
    }
}
