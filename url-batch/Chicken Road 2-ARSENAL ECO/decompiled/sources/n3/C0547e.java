package n3;

import java.math.BigDecimal;
import java.util.List;

/* renamed from: n3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547e {
    private final BigDecimal amountSpent;
    private final List<C0549g> purchases;
    private final Integer sessionCount;
    private final Long sessionTime;

    public C0547e() {
        this(null, null, null, null, 15, null);
    }

    public final BigDecimal getAmountSpent() {
        return this.amountSpent;
    }

    public final boolean getHasAtLeastOnePropertySet() {
        return (this.sessionTime == null && this.sessionCount == null && this.amountSpent == null && this.purchases == null) ? false : true;
    }

    public final List<C0549g> getPurchases() {
        return this.purchases;
    }

    public final Integer getSessionCount() {
        return this.sessionCount;
    }

    public final Long getSessionTime() {
        return this.sessionTime;
    }

    public C0547e(Long l7, Integer num, BigDecimal bigDecimal, List<C0549g> list) {
        this.sessionTime = l7;
        this.sessionCount = num;
        this.amountSpent = bigDecimal;
        this.purchases = list;
    }

    public /* synthetic */ C0547e(Long l7, Integer num, BigDecimal bigDecimal, List list, int i7, kotlin.jvm.internal.e eVar) {
        this((i7 & 1) != 0 ? null : l7, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : bigDecimal, (i7 & 8) != 0 ? null : list);
    }
}
