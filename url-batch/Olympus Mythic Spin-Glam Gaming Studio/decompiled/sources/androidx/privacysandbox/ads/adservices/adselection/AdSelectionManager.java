package androidx.privacysandbox.ads.adservices.adselection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AdSelectionManager.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH§@¢\u0006\u0002\u0010 ¨\u0006\""}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "", "()V", "getAdSelectionData", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persistAdSelectionResult", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportEvent", "", "reportEventRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportImpression", "reportImpressionRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAds", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adSelectionFromOutcomesConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAdCounterHistogram", "updateAdCounterHistogramRequest", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AdSelectionManager {
    public abstract Object getAdSelectionData(GetAdSelectionDataRequest getAdSelectionDataRequest, Continuation continuation);

    public abstract Object persistAdSelectionResult(PersistAdSelectionResultRequest persistAdSelectionResultRequest, Continuation continuation);

    public abstract Object reportEvent(ReportEventRequest reportEventRequest, Continuation continuation);

    public abstract Object reportImpression(ReportImpressionRequest reportImpressionRequest, Continuation continuation);

    public abstract Object selectAds(AdSelectionConfig adSelectionConfig, Continuation continuation);

    public abstract Object selectAds(AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, Continuation continuation);

    public abstract Object updateAdCounterHistogram(UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, Continuation continuation);
}
