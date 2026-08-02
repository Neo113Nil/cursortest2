package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.TetheredSyncStatus;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class czl extends cza {
    final /* synthetic */ bst a;

    public czl(bst bstVar) {
        this.a = bstVar;
    }

    @Override // defpackage.cza
    public final void e(Status status, TetheredSyncStatus tetheredSyncStatus, cmn cmnVar) {
        ox.s(status, tetheredSyncStatus, this.a, cmnVar);
    }
}
