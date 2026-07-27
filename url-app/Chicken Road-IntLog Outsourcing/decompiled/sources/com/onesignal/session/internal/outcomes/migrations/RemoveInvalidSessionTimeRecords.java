package com.onesignal.session.internal.outcomes.migrations;

import com.onesignal.core.internal.database.IDatabaseProvider;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class RemoveInvalidSessionTimeRecords {
    public static final RemoveInvalidSessionTimeRecords INSTANCE = new RemoveInvalidSessionTimeRecords();

    private RemoveInvalidSessionTimeRecords() {
    }

    public final void run(IDatabaseProvider databaseProvider) {
        i.e(databaseProvider, "databaseProvider");
        databaseProvider.getOs().delete("outcome", "name = \"os__session_duration\" AND (session_time = 0 OR session_time IS NULL)", null);
    }
}
