package J1;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f3381a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3382b;

    public a(IBinder iBinder, String str) {
        this.f3381a = iBinder;
        this.f3382b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3381a;
    }
}
