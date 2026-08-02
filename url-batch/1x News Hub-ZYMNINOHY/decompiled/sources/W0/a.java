package W0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1616a;

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f1617c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1618d;

    public /* synthetic */ a(IBinder iBinder, String str, int i3) {
        this.f1616a = i3;
        this.f1617c = iBinder;
        this.f1618d = str;
    }

    public Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1618d);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f1616a) {
        }
        return this.f1617c;
    }

    public Parcel b(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f1617c.transact(i3, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e3) {
                obtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void c(Parcel parcel, int i3) {
        try {
            this.f1617c.transact(i3, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
