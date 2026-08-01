package i0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0142d extends Binder implements InterfaceC0141c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2615c;

    public BinderC0142d(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2615c = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC0141c.f2614b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC0141c.f2614b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC0140b interfaceC0140b = null;
        InterfaceC0140b interfaceC0140b2 = null;
        int i3 = 0;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC0140b.f2613a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0140b)) {
                    C0139a c0139a = new C0139a();
                    c0139a.f2612c = readStrongBinder;
                    interfaceC0140b = c0139a;
                } else {
                    interfaceC0140b = (InterfaceC0140b) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            g1.d.e(interfaceC0140b, "callback");
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2615c;
                synchronized (multiInstanceInvalidationService.f1704c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f1702a + 1;
                        multiInstanceInvalidationService.f1702a = i4;
                        if (multiInstanceInvalidationService.f1704c.register(interfaceC0140b, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f1703b.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f1702a--;
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
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(InterfaceC0140b.f2613a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof InterfaceC0140b)) {
                    C0139a c0139a2 = new C0139a();
                    c0139a2.f2612c = readStrongBinder2;
                    interfaceC0140b2 = c0139a2;
                } else {
                    interfaceC0140b2 = (InterfaceC0140b) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            g1.d.e(interfaceC0140b2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f2615c;
            synchronized (multiInstanceInvalidationService2.f1704c) {
                multiInstanceInvalidationService2.f1704c.unregister(interfaceC0140b2);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            g1.d.e(createStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f2615c;
            synchronized (multiInstanceInvalidationService3.f1704c) {
                String str2 = (String) multiInstanceInvalidationService3.f1703b.get(Integer.valueOf(readInt2));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.f1704c.beginBroadcast();
                    while (i3 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f1704c.getBroadcastCookie(i3);
                            g1.d.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f1703b.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((C0139a) ((InterfaceC0140b) multiInstanceInvalidationService3.f1704c.getBroadcastItem(i3))).a(createStringArray);
                                } catch (RemoteException e2) {
                                    Log.w("ROOM", "Error invoking a remote callback", e2);
                                }
                            }
                            i3++;
                        } finally {
                            multiInstanceInvalidationService3.f1704c.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }
}
