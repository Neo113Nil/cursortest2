package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kdn extends kdo {
    @Override // defpackage.kdo
    public final void a(int i, kdq kdqVar) {
        if (!b(i, kdqVar.b())) {
            throw new RemoteException(a.ai(i, "BinderProxy#transact(", ", FLAG_ONEWAY) returned false"));
        }
    }
}
