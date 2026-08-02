package nl.dionsegijn.konfetti.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.WorkflowSettings$a;
import com.squareup.cash.R;
import com.squareup.cash.cdf.stock.Sort;
import com.squareup.cash.investing.viewmodels.FollowingStockMetricType;
import com.squareup.cash.investing.viewmodels.PortfolioStockMetricType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class Position {

    /* loaded from: classes9.dex */
    public final class Absolute extends Position {
        public final float x;
        public final float y;

        public Absolute(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            return Float.compare(this.x, absolute.x) == 0 && Float.compare(this.y, absolute.y) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
        }

        public final String toString() {
            return "Absolute(x=" + this.x + ", y=" + this.y + ")";
        }
    }

    /* loaded from: classes9.dex */
    public final class Relative extends Position {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Relative) && Double.compare(0.5d, 0.5d) == 0 && Double.compare(0.5d, 0.5d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(0.5d) + (Double.hashCode(0.5d) * 31);
        }

        public final String toString() {
            return "Relative(x=0.5, y=0.5)";
        }
    }

    public static final int getDisplayLabelResId(FollowingStockMetricType followingStockMetricType) {
        followingStockMetricType.getClass();
        int ordinal = followingStockMetricType.ordinal();
        if (ordinal == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("No label for DEFAULT");
            return 0;
        }
        if (ordinal == 1) {
            return R.string.stock_metric_type_daily_percent_change;
        }
        if (ordinal == 2) {
            return R.string.stock_metric_type_share_price;
        }
        if (ordinal == 3) {
            return R.string.stock_metric_type_market_cap;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    public static final Integer getForcedOrientation(MiSnapSettings.Workflow workflow, MiSnapSettings.UseCase useCase) {
        int i;
        workflow.getClass();
        useCase.getClass();
        Integer num = workflow.a;
        if (num != null) {
            return num;
        }
        int i2 = WorkflowSettings$a.a[useCase.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            i = 12;
        } else {
            if (i2 != 4 && i2 != 5) {
                return null;
            }
            i = 11;
        }
        return Integer.valueOf(i);
    }

    public static final Sort getSortType(PortfolioStockMetricType portfolioStockMetricType) {
        portfolioStockMetricType.getClass();
        switch (portfolioStockMetricType.ordinal()) {
            case 0:
                return Sort.DAILY_PERCENT_CHANGE;
            case 1:
                return Sort.MY_DAILY_RETURN;
            case 2:
                return Sort.MY_TOTAL_RETURN;
            case 3:
                return null;
            case 4:
                return Sort.MY_TOTAL_INVESTMENT_VALUE;
            case 5:
                return Sort.SHARE_PRICE;
            case 6:
                return Sort.MARKET_CAP;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static final boolean shouldShowExitConfirmationDialog(MiSnapSettings.Workflow workflow, MiSnapSettings.UseCase useCase) {
        workflow.getClass();
        useCase.getClass();
        switch (WorkflowSettings$a.a[useCase.ordinal()]) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                Boolean bool = workflow.b;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            default:
                return false;
        }
    }

    public static final Sort getSortType(FollowingStockMetricType followingStockMetricType) {
        int ordinal = followingStockMetricType.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return Sort.DAILY_PERCENT_CHANGE;
        }
        if (ordinal == 2) {
            return Sort.SHARE_PRICE;
        }
        if (ordinal == 3) {
            return Sort.MARKET_CAP;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
