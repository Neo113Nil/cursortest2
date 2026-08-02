package com.google.android.gms.people.contactssync;

import android.app.Activity;
import android.content.Context;
import defpackage.czm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TetheredSync {
    private TetheredSync() {
    }

    public static TetheredSyncClient getClient(Activity activity) {
        return new czm(activity);
    }

    public static TetheredSyncClient getClient(Context context) {
        return new czm(context);
    }
}
