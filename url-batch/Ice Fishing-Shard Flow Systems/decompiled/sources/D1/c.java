package D1;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class c implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f349e;

    public c(IBinder iBinder) {
        this.f349e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f349e;
    }
}
