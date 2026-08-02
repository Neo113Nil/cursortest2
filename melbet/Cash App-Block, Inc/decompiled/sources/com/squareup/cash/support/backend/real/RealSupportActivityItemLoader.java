package com.squareup.cash.support.backend.real;

import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.DefaultGetRequestHandler$Factory;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class RealSupportActivityItemLoader implements SupportActivityItemLoader {
    public final RealActivitiesCacheManager activitiesCacheManager;
    public final Lazy activityContext$delegate;
    public final LinkedHashMap cacheFromFetch = new LinkedHashMap();
    public final ErrorReporter errorReporter;
    public final KeysetHandle getHandler;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class AnalyticsFailures {
        public static final /* synthetic */ AnalyticsFailures[] $VALUES;
        public static final AnalyticsFailures FAILED_TO_LOAD;
        public static final AnalyticsFailures INVALID_FORMAT;
        public static final AnalyticsFailures NOT_FOUND;

        static {
            AnalyticsFailures analyticsFailures = new AnalyticsFailures("NOT_FOUND", 0);
            NOT_FOUND = analyticsFailures;
            AnalyticsFailures analyticsFailures2 = new AnalyticsFailures("FAILED_TO_LOAD", 1);
            FAILED_TO_LOAD = analyticsFailures2;
            AnalyticsFailures analyticsFailures3 = new AnalyticsFailures("INVALID_FORMAT", 2);
            INVALID_FORMAT = analyticsFailures3;
            $VALUES = new AnalyticsFailures[]{analyticsFailures, analyticsFailures2, analyticsFailures3};
        }

        public static AnalyticsFailures valueOf(String str) {
            return (AnalyticsFailures) Enum.valueOf(AnalyticsFailures.class, str);
        }

        public static AnalyticsFailures[] values() {
            return (AnalyticsFailures[]) $VALUES.clone();
        }
    }

    public RealSupportActivityItemLoader(RealActivityTokenFactory realActivityTokenFactory, DefaultGetRequestHandler$Factory defaultGetRequestHandler$Factory, RealActivitiesCacheManager realActivitiesCacheManager, ErrorReporter errorReporter) {
        this.activitiesCacheManager = realActivitiesCacheManager;
        this.errorReporter = errorReporter;
        this.activityContext$delegate = LazyKt.lazy(new AppUpdateDetector$$ExternalSyntheticLambda0(realActivityTokenFactory, 3));
        this.getHandler = defaultGetRequestHandler$Factory.create();
    }

    public static final ActivityItemViewModel access$toViewModel(RealSupportActivityItemLoader realSupportActivityItemLoader, FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
        String itemId = ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem);
        String str = formattedPaymentHistoryActivityItem.getPaymentHistoryData().primary_label;
        if (str == null) {
            str = "";
        }
        String str2 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_label;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().tertiary_label;
        return new ActivityItemViewModel(itemId, str, str2, str3 != null ? str3 : "", FormattedPaymentHistoryActivityItemUtilsKt.accessory(formattedPaymentHistoryActivityItem), FormattedPaymentHistoryActivityItemUtilsKt.avatar(formattedPaymentHistoryActivityItem), (AvatarBadgeViewModel) null, false, new ActivityItemPresentationContext(ActivityItemOrigin.HISTORY, 0, null, realSupportActivityItemLoader.getActivityContext().activityScope, realSupportActivityItemLoader.getActivityContext().activityToken), (Icons) null, (ReactionsState) null, FormattedPaymentHistoryActivityItemUtilsKt.contentDescription(formattedPaymentHistoryActivityItem), 5120);
    }

    public final ActivitiesManager.ActivityContext getActivityContext() {
        return (ActivitiesManager.ActivityContext) this.activityContext$delegate.getValue();
    }

    @Override // com.squareup.cash.support.backend.api.SupportActivityItemLoader
    public final Flow loadItem(String str) {
        str.getClass();
        return new SafeFlow(new RealSupportActivityItemLoader$loadItem$1(this, str, null));
    }
}
