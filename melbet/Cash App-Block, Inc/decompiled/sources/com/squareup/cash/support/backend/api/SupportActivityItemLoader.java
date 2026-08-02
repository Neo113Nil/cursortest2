package com.squareup.cash.support.backend.api;

import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface SupportActivityItemLoader {

    /* loaded from: classes7.dex */
    public interface State {

        public final class Failure implements State {
            public static final Failure INSTANCE = new Failure();
            public static final Failure INSTANCE$1 = new Failure();
        }

        public final class Success implements State {
            public final FormattedPaymentHistoryActivityItem activityItem;
            public final ActivityItemViewModel activityItemViewModel;

            public Success(ActivityItemViewModel activityItemViewModel, FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
                this.activityItemViewModel = activityItemViewModel;
                this.activityItem = formattedPaymentHistoryActivityItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return this.activityItemViewModel.equals(success.activityItemViewModel) && this.activityItem.equals(success.activityItem);
            }

            public final int hashCode() {
                return this.activityItem.hashCode() + (this.activityItemViewModel.hashCode() * 31);
            }

            public final String toString() {
                return "Success(activityItemViewModel=" + this.activityItemViewModel + ", activityItem=" + this.activityItem + ")";
            }
        }
    }

    Flow loadItem(String str);
}
