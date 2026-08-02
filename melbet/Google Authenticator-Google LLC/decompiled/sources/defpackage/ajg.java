package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajg implements IInterface {
    public final IBinder a;

    public ajg(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
