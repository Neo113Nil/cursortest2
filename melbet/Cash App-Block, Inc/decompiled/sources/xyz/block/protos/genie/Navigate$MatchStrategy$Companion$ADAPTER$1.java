package xyz.block.protos.genie;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public final class Navigate$MatchStrategy$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Navigate.MatchStrategy.Companion.getClass();
        if (i == 0) {
            return Navigate.MatchStrategy.MATCH_STRATEGY_UNSPECIFIED;
        }
        if (i == 1) {
            return Navigate.MatchStrategy.MATCH_STRATEGY_NONE;
        }
        if (i != 2) {
            return null;
        }
        return Navigate.MatchStrategy.MATCH_STRATEGY_BY_MOTION_ID;
    }
}
