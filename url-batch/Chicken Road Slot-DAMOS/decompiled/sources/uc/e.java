package uc;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {
    private final BigDecimal amountSpent;
    private final List<g> purchases;
    private final Integer sessionCount;
    private final Long sessionTime;

    public /* synthetic */ e(Long l10, Integer num, BigDecimal bigDecimal, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : l10, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : bigDecimal, (i3 & 8) != 0 ? null : list);
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

    public e(Long l10, Integer num, BigDecimal bigDecimal, List<g> list) {
        this.sessionTime = l10;
        this.sessionCount = num;
        this.amountSpent = bigDecimal;
        this.purchases = list;
    }

    public e() {
        this(null, null, null, null, 15, null);
    }
}
