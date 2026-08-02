package com.squareup.cash.support.backend.real;

import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.support.backend.real.RealSupportActivityItemLoader;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/support/backend/real/SupportActivityItemLoaderError;", "Lcom/squareup/cash/observability/types/ReportedError;", "jvm"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SupportActivityItemLoaderError extends ReportedError {
    public final Set features;
    public final Map metadata;

    public SupportActivityItemLoaderError(String str, RealSupportActivityItemLoader.AnalyticsFailures analyticsFailures) {
        str.getClass();
        this.features = ArraysKt___ArraysKt.toSet(new ErrorFeature[]{ErrorFeature.Support.INSTANCE, ErrorFeature.Activity.INSTANCE});
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("parameters", MapsKt__MapsKt.mapOf(new Pair(BreadcrumbHelper.Category.ERROR, analyticsFailures), new Pair("entityId", str)));
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }
}
