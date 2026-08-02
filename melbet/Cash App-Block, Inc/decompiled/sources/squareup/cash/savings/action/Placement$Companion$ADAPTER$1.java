package squareup.cash.savings.action;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes10.dex */
public final class Placement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Placement.Companion.getClass();
        if (i == 1) {
            return Placement.LEADING;
        }
        if (i != 2) {
            return null;
        }
        return Placement.TRAILING;
    }
}
