package z3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class d extends r3.g<g> {
    protected d(Context context, Looper looper, r3.d dVar, q3.d dVar2, q3.j jVar) {
        super(context, looper, 300, dVar, dVar2, jVar);
    }

    @Override // r3.c
    protected final String D() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // r3.c
    protected final String E() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // r3.c
    protected final boolean H() {
        return true;
    }

    @Override // r3.c
    public final boolean R() {
        return true;
    }

    @Override // r3.c
    public final int j() {
        return 212800000;
    }

    @Override // r3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // r3.c
    public final o3.d[] v() {
        return l3.h.f18600b;
    }
}
