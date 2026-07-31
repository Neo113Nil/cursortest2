package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class p extends Binder implements m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f4102c;

    public p(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f4102c = multiInstanceInvalidationService;
        attachInterface(this, m.f4083b);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        String str = m.f4083b;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        l lVar = null;
        l lVar2 = null;
        if (i3 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(l.f4082a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof l)) {
                    k kVar = new k();
                    kVar.f4081c = readStrongBinder;
                    lVar = kVar;
                } else {
                    lVar = (l) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            Z1.i.f(lVar, "callback");
            int i5 = 0;
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f4102c;
                synchronized (multiInstanceInvalidationService.f4052f) {
                    try {
                        int i6 = multiInstanceInvalidationService.f4050d + 1;
                        multiInstanceInvalidationService.f4050d = i6;
                        if (multiInstanceInvalidationService.f4052f.register(lVar, Integer.valueOf(i6))) {
                            multiInstanceInvalidationService.f4051e.put(Integer.valueOf(i6), readString);
                            i5 = i6;
                        } else {
                            multiInstanceInvalidationService.f4050d--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i5);
        } else if (i3 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(l.f4082a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof l)) {
                    k kVar2 = new k();
                    kVar2.f4081c = readStrongBinder2;
                    lVar2 = kVar2;
                } else {
                    lVar2 = (l) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            Z1.i.f(lVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f4102c;
            synchronized (multiInstanceInvalidationService2.f4052f) {
                multiInstanceInvalidationService2.f4052f.unregister(lVar2);
            }
            parcel2.writeNoException();
        } else {
            if (i3 != 3) {
                return super.onTransact(i3, parcel, parcel2, i4);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            Z1.i.f(createStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f4102c;
            synchronized (multiInstanceInvalidationService3.f4052f) {
                String str2 = (String) multiInstanceInvalidationService3.f4051e.get(Integer.valueOf(readInt2));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.f4052f.beginBroadcast();
                    for (int i7 = 0; i7 < beginBroadcast; i7++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f4052f.getBroadcastCookie(i7);
                            Z1.i.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f4051e.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((l) multiInstanceInvalidationService3.f4052f.getBroadcastItem(i7)).a(createStringArray);
                                } catch (RemoteException e3) {
                                    Log.w("ROOM", "Error invoking a remote callback", e3);
                                }
                            }
                        } finally {
                            multiInstanceInvalidationService3.f4052f.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
