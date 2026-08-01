package z4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends Binder implements e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f10742d;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f10742d = multiInstanceInvalidationService;
        attachInterface(this, e.f10735c);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        String str = e.f10735c;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return super.onTransact(i3, parcel, parcel2, i10);
                }
                w(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(d.f10731b);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f10728d = readStrongBinder;
                    dVar2 = cVar;
                } else {
                    dVar2 = (d) queryLocalInterface;
                }
            }
            int readInt = parcel.readInt();
            dVar2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f10742d;
            synchronized (multiInstanceInvalidationService.f753i) {
                multiInstanceInvalidationService.f753i.unregister(dVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(d.f10731b);
            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof d)) {
                c cVar2 = new c();
                cVar2.f10728d = readStrongBinder2;
                dVar = cVar2;
            } else {
                dVar = (d) queryLocalInterface2;
            }
        }
        String readString = parcel.readString();
        dVar.getClass();
        int i11 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f10742d;
            synchronized (multiInstanceInvalidationService2.f753i) {
                try {
                    int i12 = multiInstanceInvalidationService2.f751d + 1;
                    multiInstanceInvalidationService2.f751d = i12;
                    if (multiInstanceInvalidationService2.f753i.register(dVar, Integer.valueOf(i12))) {
                        multiInstanceInvalidationService2.f752e.put(Integer.valueOf(i12), readString);
                        i11 = i12;
                    } else {
                        multiInstanceInvalidationService2.f751d--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i11);
        return true;
    }

    @Override // z4.e
    public final void w(int i3, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f10742d;
        synchronized (multiInstanceInvalidationService.f753i) {
            String str = (String) multiInstanceInvalidationService.f752e.get(Integer.valueOf(i3));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f753i.beginBroadcast();
            int i10 = 0;
            while (true) {
                h hVar = multiInstanceInvalidationService.f753i;
                if (i10 >= beginBroadcast) {
                    hVar.finishBroadcast();
                    return;
                }
                try {
                    Object broadcastCookie = hVar.getBroadcastCookie(i10);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f752e.get(num);
                    if (i3 != intValue && str.equals(str2)) {
                        try {
                            ((d) multiInstanceInvalidationService.f753i.getBroadcastItem(i10)).k(strArr);
                        } catch (RemoteException e2) {
                            Log.w("ROOM", "Error invoking a remote callback", e2);
                        }
                    }
                    i10++;
                } catch (Throwable th) {
                    multiInstanceInvalidationService.f753i.finishBroadcast();
                    throw th;
                }
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
