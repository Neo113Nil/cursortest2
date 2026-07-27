package com.onesignal.core.internal.database.impl;

import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.session.internal.outcomes.impl.OutcomeTableProvider;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class DatabaseProvider implements IDatabaseProvider {
    private final IApplicationService _application;
    private final Object lock;
    private OSDatabase osDatabase;

    public DatabaseProvider(IApplicationService _application) {
        i.e(_application, "_application");
        this._application = _application;
        this.lock = new Object();
    }

    @Override // com.onesignal.core.internal.database.IDatabaseProvider
    public IDatabase getOs() {
        if (this.osDatabase == null) {
            synchronized (this.lock) {
                if (this.osDatabase == null) {
                    this.osDatabase = new OSDatabase(new OutcomeTableProvider(), this._application.getAppContext(), 0, 4, null);
                }
            }
        }
        OSDatabase oSDatabase = this.osDatabase;
        i.b(oSDatabase);
        return oSDatabase;
    }
}
