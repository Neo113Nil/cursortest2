package f0;

import X0.f;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class d extends Binder implements c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2414c;

    public d(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2414c = multiInstanceInvalidationService;
        attachInterface(this, c.f2413b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = c.f2413b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        int i3 = 0;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.f2412a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                    C0138a c0138a = new C0138a();
                    c0138a.f2411c = readStrongBinder;
                    bVar = c0138a;
                } else {
                    bVar = (b) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            f.e(bVar, "callback");
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2414c;
                synchronized (multiInstanceInvalidationService.f1628c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f1626a + 1;
                        multiInstanceInvalidationService.f1626a = i4;
                        if (multiInstanceInvalidationService.f1628c.register(bVar, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f1627b.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f1626a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(b.f2412a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof b)) {
                    C0138a c0138a2 = new C0138a();
                    c0138a2.f2411c = readStrongBinder2;
                    bVar2 = c0138a2;
                } else {
                    bVar2 = (b) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            f.e(bVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f2414c;
            synchronized (multiInstanceInvalidationService2.f1628c) {
                multiInstanceInvalidationService2.f1628c.unregister(bVar2);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            f.e(createStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f2414c;
            synchronized (multiInstanceInvalidationService3.f1628c) {
                String str2 = (String) multiInstanceInvalidationService3.f1627b.get(Integer.valueOf(readInt2));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.f1628c.beginBroadcast();
                    while (i3 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f1628c.getBroadcastCookie(i3);
                            f.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f1627b.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((C0138a) ((b) multiInstanceInvalidationService3.f1628c.getBroadcastItem(i3))).a(createStringArray);
                                } catch (RemoteException e2) {
                                    Log.w("ROOM", "Error invoking a remote callback", e2);
                                }
                            }
                            i3++;
                        } finally {
                            multiInstanceInvalidationService3.f1628c.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }
}
