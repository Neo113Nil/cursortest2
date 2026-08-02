package com.google.android.gms.people.contactssync;

import com.google.android.gms.people.contactssync.model.TetheredContactsSyncRequest;
import defpackage.cmw;
import defpackage.ddi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface TetheredSyncClient extends cmw {
    ddi triggerTetheredContactsSync(TetheredContactsSyncRequest tetheredContactsSyncRequest);
}
