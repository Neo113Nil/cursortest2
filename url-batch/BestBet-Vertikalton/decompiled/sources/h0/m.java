package h0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class m extends Binder implements i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2980c;

    public m(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2980c = multiInstanceInvalidationService;
        attachInterface(this, i.f2966b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = i.f2966b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        h hVar = null;
        h hVar2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(h.f2965a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof h)) {
                    g gVar = new g();
                    gVar.f2964c = readStrongBinder;
                    hVar = gVar;
                } else {
                    hVar = (h) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            k1.e.e(hVar, "callback");
            int i3 = 0;
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2980c;
                synchronized (multiInstanceInvalidationService.f2035c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f2033a + 1;
                        multiInstanceInvalidationService.f2033a = i4;
                        if (multiInstanceInvalidationService.f2035c.register(hVar, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f2034b.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f2033a--;
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
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(h.f2965a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof h)) {
                    g gVar2 = new g();
                    gVar2.f2964c = readStrongBinder2;
                    hVar2 = gVar2;
                } else {
                    hVar2 = (h) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            k1.e.e(hVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f2980c;
            synchronized (multiInstanceInvalidationService2.f2035c) {
                multiInstanceInvalidationService2.f2035c.unregister(hVar2);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            k1.e.e(createStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f2980c;
            synchronized (multiInstanceInvalidationService3.f2035c) {
                String str2 = (String) multiInstanceInvalidationService3.f2034b.get(Integer.valueOf(readInt2));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.f2035c.beginBroadcast();
                    for (int i5 = 0; i5 < beginBroadcast; i5++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f2035c.getBroadcastCookie(i5);
                            k1.e.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f2034b.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((h) multiInstanceInvalidationService3.f2035c.getBroadcastItem(i5)).a(createStringArray);
                                } catch (RemoteException e2) {
                                    Log.w("ROOM", "Error invoking a remote callback", e2);
                                }
                            }
                        } finally {
                            multiInstanceInvalidationService3.f2035c.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }
}
