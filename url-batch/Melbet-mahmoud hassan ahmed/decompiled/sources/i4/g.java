package i4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends a4.a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void B3(j jVar, f fVar) {
        Parcel E = E();
        a4.c.b(E, jVar);
        a4.c.c(E, fVar);
        q0(12, E);
    }
}
