package w1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class w extends Binder implements n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9916d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f9917c;

    public w(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f9917c = multiInstanceInvalidationService;
        attachInterface(this, n.f9882b);
    }

    @Override // w1.n
    public final void a(int i3, String[] strArr) {
        f2.j.f(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f9917c;
        synchronized (multiInstanceInvalidationService.f5253f) {
            String str = (String) multiInstanceInvalidationService.f5252e.get(Integer.valueOf(i3));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f5253f.beginBroadcast();
            for (int i4 = 0; i4 < beginBroadcast; i4++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f5253f.getBroadcastCookie(i4);
                    f2.j.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f5252e.get(num);
                    if (i3 != intValue && str.equals(str2)) {
                        try {
                            ((l) multiInstanceInvalidationService.f5253f.getBroadcastItem(i4)).b(strArr);
                        } catch (RemoteException e3) {
                            Log.w("ROOM", "Error invoking a remote callback", e3);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f5253f.finishBroadcast();
                }
            }
        }
    }

    @Override // w1.n
    public final int c(l lVar, String str) {
        f2.j.f(lVar, "callback");
        int i3 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f9917c;
        synchronized (multiInstanceInvalidationService.f5253f) {
            try {
                int i4 = multiInstanceInvalidationService.f5251d + 1;
                multiInstanceInvalidationService.f5251d = i4;
                if (multiInstanceInvalidationService.f5253f.register(lVar, Integer.valueOf(i4))) {
                    multiInstanceInvalidationService.f5252e.put(Integer.valueOf(i4), str);
                    i3 = i4;
                } else {
                    multiInstanceInvalidationService.f5251d--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        String str = n.f9882b;
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
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(l.f9880a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof l)) {
                    k kVar = new k();
                    kVar.f9879c = readStrongBinder;
                    lVar = kVar;
                } else {
                    lVar = (l) queryLocalInterface;
                }
            }
            int c2 = c(lVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(c2);
        } else if (i3 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(l.f9880a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof l)) {
                    k kVar2 = new k();
                    kVar2.f9879c = readStrongBinder2;
                    lVar2 = kVar2;
                } else {
                    lVar2 = (l) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            f2.j.f(lVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f9917c;
            synchronized (multiInstanceInvalidationService.f5253f) {
                multiInstanceInvalidationService.f5253f.unregister(lVar2);
            }
            parcel2.writeNoException();
        } else {
            if (i3 != 3) {
                return super.onTransact(i3, parcel, parcel2, i4);
            }
            a(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
