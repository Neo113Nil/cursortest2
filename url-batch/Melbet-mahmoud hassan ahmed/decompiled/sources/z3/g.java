package z3;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void O0(l3.d dVar, f fVar) {
        Parcel E = E();
        c.b(E, dVar);
        c.c(E, fVar);
        q0(1, E);
    }
}
