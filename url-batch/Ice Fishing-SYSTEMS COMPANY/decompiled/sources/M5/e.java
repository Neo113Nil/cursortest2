package M5;

import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {
    private final BigDecimal amountSpent;
    private final List<g> purchases;
    private final Integer sessionCount;
    private final Long sessionTime;

    public e() {
        this(null, null, null, null, 15, null);
    }

    public final BigDecimal getAmountSpent() {
        return this.amountSpent;
    }

    public final boolean getHasAtLeastOnePropertySet() {
        return (this.sessionTime == null && this.sessionCount == null && this.amountSpent == null && this.purchases == null) ? false : true;
    }

    public final List<g> getPurchases() {
        return this.purchases;
    }

    public final Integer getSessionCount() {
        return this.sessionCount;
    }

    public final Long getSessionTime() {
        return this.sessionTime;
    }

    public e(Long l9, Integer num, BigDecimal bigDecimal, List<g> list) {
        this.sessionTime = l9;
        this.sessionCount = num;
        this.amountSpent = bigDecimal;
        this.purchases = list;
    }

    public /* synthetic */ e(Long l9, Integer num, BigDecimal bigDecimal, List list, int i, kotlin.jvm.internal.e eVar) {
        this((i & 1) != 0 ? null : l9, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? null : list);
    }
}
