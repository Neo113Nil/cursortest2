package com.squareup.cash.treehouse.android.configuration;

import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.util.clock.AndroidClock;

/* loaded from: classes6.dex */
public final class RealTreehouseLinkQrCodeProcessor {
    public final AndroidClock clock;
    public final GpsConfigQueries queries;

    public RealTreehouseLinkQrCodeProcessor(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock) {
        this.clock = androidClock;
        this.queries = cashAccountDatabaseImpl.treehouseAppConfigurationsQueries;
    }
}
