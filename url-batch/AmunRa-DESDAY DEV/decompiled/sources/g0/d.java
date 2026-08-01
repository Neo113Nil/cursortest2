package g0;

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
    public final /* synthetic */ MultiInstanceInvalidationService f2436c;

    public d(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2436c = multiInstanceInvalidationService;
        attachInterface(this, c.f2435b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = c.f2435b;
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
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.f2434a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                    C0134a c0134a = new C0134a();
                    c0134a.f2433c = readStrongBinder;
                    bVar = c0134a;
                } else {
                    bVar = (b) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            Z0.d.e(bVar, "callback");
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2436c;
                synchronized (multiInstanceInvalidationService.f1531c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f1529a + 1;
                        multiInstanceInvalidationService.f1529a = i4;
                        if (multiInstanceInvalidationService.f1531c.register(bVar, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f1530b.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f1529a--;
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
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(b.f2434a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof b)) {
                    C0134a c0134a2 = new C0134a();
                    c0134a2.f2433c = readStrongBinder2;
                    bVar2 = c0134a2;
                } else {
                    bVar2 = (b) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            Z0.d.e(bVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f2436c;
            synchronized (multiInstanceInvalidationService2.f1531c) {
                multiInstanceInvalidationService2.f1531c.unregister(bVar2);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            Z0.d.e(createStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f2436c;
            synchronized (multiInstanceInvalidationService3.f1531c) {
                String str2 = (String) multiInstanceInvalidationService3.f1530b.get(Integer.valueOf(readInt2));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.f1531c.beginBroadcast();
                    while (i3 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f1531c.getBroadcastCookie(i3);
                            Z0.d.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f1530b.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((C0134a) ((b) multiInstanceInvalidationService3.f1531c.getBroadcastItem(i3))).a(createStringArray);
                                } catch (RemoteException e2) {
                                    Log.w("ROOM", "Error invoking a remote callback", e2);
                                }
                            }
                            i3++;
                        } finally {
                            multiInstanceInvalidationService3.f1531c.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }
}
