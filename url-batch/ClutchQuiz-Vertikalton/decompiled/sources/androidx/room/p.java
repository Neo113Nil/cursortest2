package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class p extends Binder implements l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1676c;

    public p(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1676c = multiInstanceInvalidationService;
        attachInterface(this, l.f1662b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = l.f1662b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        k kVar = null;
        k kVar2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(k.f1661a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof k)) {
                    j jVar = new j();
                    jVar.f1660c = readStrongBinder;
                    kVar = jVar;
                } else {
                    kVar = (k) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            g1.f.e(kVar, "callback");
            int i3 = 0;
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1676c;
                synchronized (multiInstanceInvalidationService.f1647c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f1645a + 1;
                        multiInstanceInvalidationService.f1645a = i4;
                        if (multiInstanceInvalidationService.f1647c.register(kVar, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f1646b.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f1645a--;
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
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(k.f1661a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof k)) {
                    j jVar2 = new j();
                    jVar2.f1660c = readStrongBinder2;
                    kVar2 = jVar2;
                } else {
                    kVar2 = (k) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            g1.f.e(kVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f1676c;
            synchronized (multiInstanceInvalidationService2.f1647c) {
                multiInstanceInvalidationService2.f1647c.unregister(kVar2);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            g1.f.e(createStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f1676c;
            synchronized (multiInstanceInvalidationService3.f1647c) {
                String str2 = (String) multiInstanceInvalidationService3.f1646b.get(Integer.valueOf(readInt2));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.f1647c.beginBroadcast();
                    for (int i5 = 0; i5 < beginBroadcast; i5++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f1647c.getBroadcastCookie(i5);
                            g1.f.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f1646b.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((k) multiInstanceInvalidationService3.f1647c.getBroadcastItem(i5)).a(createStringArray);
                                } catch (RemoteException e2) {
                                    Log.w("ROOM", "Error invoking a remote callback", e2);
                                }
                            }
                        } finally {
                            multiInstanceInvalidationService3.f1647c.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }
}
