package V0;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class c implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f1595a;

    public c(IBinder iBinder) {
        this.f1595a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1595a;
    }
}
