package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityScope$Companion$ADAPTER$1", "Lcom/squareup/wire/EnumAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityScope$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ActivityScope.INSTANCE.getClass();
        return ActivityScope.Companion.fromValue(i);
    }
}
