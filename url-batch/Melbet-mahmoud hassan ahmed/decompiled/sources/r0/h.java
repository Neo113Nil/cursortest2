package r0;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import m4.q;

/* loaded from: classes.dex */
public final class h extends Binder {

    /* renamed from: f, reason: collision with root package name */
    private static final int f20664f;

    static {
        f20664f = o2.m0.f19752a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public static m4.q<Bundle> a(IBinder iBinder) {
        int readInt;
        q.a r7 = m4.q.r();
        int i7 = 1;
        int i8 = 0;
        while (i7 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i8);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            r7.a((Bundle) o2.a.e(obtain2.readBundle()));
                            i8++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i7 = readInt;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return r7.h();
    }
}
