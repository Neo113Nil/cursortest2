package squareup.cash.savings;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.savings.SavingsHome;

/* loaded from: classes10.dex */
public final class SavingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SavingsHome.TransfersSection.AlternativeButtonBehavior.Companion.getClass();
        if (i == 1) {
            return SavingsHome.TransfersSection.AlternativeButtonBehavior.SHAKE_BALANCE;
        }
        return null;
    }
}
