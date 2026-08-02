package squareup.cash.savings;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.savings.SavingsHome;

/* loaded from: classes10.dex */
public final class SavingsHome$SavingsOptionsSection$SavingsOptionRow$RowImage$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage.Companion.getClass();
        if (i == 1) {
            return SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage.AUTOMATION;
        }
        if (i == 2) {
            return SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage.FLAG;
        }
        if (i == 3) {
            return SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage.DART;
        }
        if (i != 4) {
            return null;
        }
        return SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage.ROUND_UP;
    }
}
