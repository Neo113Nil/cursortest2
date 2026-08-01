package g0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0134d extends Binder implements InterfaceC0133c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2476c;

    public BinderC0134d(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2476c = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC0133c.f2475b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC0133c.f2475b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC0132b interfaceC0132b = null;
        InterfaceC0132b interfaceC0132b2 = null;
        int i3 = 0;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC0132b.f2474a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0132b)) {
                    C0131a c0131a = new C0131a();
                    c0131a.f2473c = readStrongBinder;
                    interfaceC0132b = c0131a;
                } else {
                    interfaceC0132b = (InterfaceC0132b) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            b1.d.e(interfaceC0132b, "callback");
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2476c;
                synchronized (multiInstanceInvalidationService.f1573c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f1571a + 1;
                        multiInstanceInvalidationService.f1571a = i4;
                        if (multiInstanceInvalidationService.f1573c.register(interfaceC0132b, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f1572b.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f1571a--;
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
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(InterfaceC0132b.f2474a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof InterfaceC0132b)) {
                    C0131a c0131a2 = new C0131a();
                    c0131a2.f2473c = readStrongBinder2;
                    interfaceC0132b2 = c0131a2;
                } else {
                    interfaceC0132b2 = (InterfaceC0132b) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            b1.d.e(interfaceC0132b2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f2476c;
            synchronized (multiInstanceInvalidationService2.f1573c) {
                multiInstanceInvalidationService2.f1573c.unregister(interfaceC0132b2);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            b1.d.e(createStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f2476c;
            synchronized (multiInstanceInvalidationService3.f1573c) {
                String str2 = (String) multiInstanceInvalidationService3.f1572b.get(Integer.valueOf(readInt2));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.f1573c.beginBroadcast();
                    while (i3 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f1573c.getBroadcastCookie(i3);
                            b1.d.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f1572b.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((C0131a) ((InterfaceC0132b) multiInstanceInvalidationService3.f1573c.getBroadcastItem(i3))).a(createStringArray);
                                } catch (RemoteException e2) {
                                    Log.w("ROOM", "Error invoking a remote callback", e2);
                                }
                            }
                            i3++;
                        } finally {
                            multiInstanceInvalidationService3.f1573c.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }
}
