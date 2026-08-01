package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class s extends Binder implements o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2131c;

    public s(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2131c = multiInstanceInvalidationService;
        attachInterface(this, o.f2111b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = o.f2111b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        n nVar = null;
        n nVar2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(n.f2110a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof n)) {
                    m mVar = new m();
                    mVar.f2109c = readStrongBinder;
                    nVar = mVar;
                } else {
                    nVar = (n) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            j1.h.e(nVar, "callback");
            int i3 = 0;
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2131c;
                synchronized (multiInstanceInvalidationService.f2080c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f2078a + 1;
                        multiInstanceInvalidationService.f2078a = i4;
                        if (multiInstanceInvalidationService.f2080c.register(nVar, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f2079b.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f2078a--;
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
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(n.f2110a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof n)) {
                    m mVar2 = new m();
                    mVar2.f2109c = readStrongBinder2;
                    nVar2 = mVar2;
                } else {
                    nVar2 = (n) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            j1.h.e(nVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f2131c;
            synchronized (multiInstanceInvalidationService2.f2080c) {
                multiInstanceInvalidationService2.f2080c.unregister(nVar2);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            j1.h.e(createStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f2131c;
            synchronized (multiInstanceInvalidationService3.f2080c) {
                String str2 = (String) multiInstanceInvalidationService3.f2079b.get(Integer.valueOf(readInt2));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.f2080c.beginBroadcast();
                    for (int i5 = 0; i5 < beginBroadcast; i5++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f2080c.getBroadcastCookie(i5);
                            j1.h.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f2079b.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((n) multiInstanceInvalidationService3.f2080c.getBroadcastItem(i5)).a(createStringArray);
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                        } finally {
                            multiInstanceInvalidationService3.f2080c.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }
}
