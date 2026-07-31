package b4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f1688f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1689g;

    protected a(IBinder iBinder, String str) {
        this.f1688f = iBinder;
        this.f1689g = str;
    }

    protected final Parcel E(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f1688f.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1688f;
    }

    protected final Parcel q0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1689g);
        return obtain;
    }
}
