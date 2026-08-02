package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cnq extends BasePendingResult implements cnr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected cnq(cmv cmvVar) {
        super(cmvVar);
        oy.au(cmvVar, "GoogleApiClient must not be null");
    }

    private final void n(RemoteException remoteException) {
        h(new Status(8, remoteException.getLocalizedMessage(), null, null));
    }

    protected abstract void b(cmh cmhVar);

    public final void g(cmh cmhVar) {
        try {
            b(cmhVar);
        } catch (DeadObjectException e) {
            n(e);
            throw e;
        } catch (RemoteException e2) {
            n(e2);
        }
    }

    public final void h(Status status) {
        oy.am(!status.c(), "Failed result must not be success");
        l(a(status));
    }

    @Override // defpackage.cnr
    public /* bridge */ /* synthetic */ void i(Object obj) {
        throw null;
    }
}
