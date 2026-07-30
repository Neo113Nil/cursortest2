package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class om1 extends Binder implements xz0 {
    public final /* synthetic */ MultiInstanceInvalidationService g;

    public om1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.g = multiInstanceInvalidationService;
        attachInterface(this, xz0.d);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = xz0.d;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        wz0 wz0Var = null;
        wz0 wz0Var2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                v(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(wz0.c);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof wz0)) {
                    vz0 vz0Var = new vz0();
                    vz0Var.g = readStrongBinder;
                    wz0Var2 = vz0Var;
                } else {
                    wz0Var2 = (wz0) queryLocalInterface;
                }
            }
            int readInt = parcel.readInt();
            wz0Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.g;
            synchronized (multiInstanceInvalidationService.o) {
                multiInstanceInvalidationService.o.unregister(wz0Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(wz0.c);
            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof wz0)) {
                vz0 vz0Var2 = new vz0();
                vz0Var2.g = readStrongBinder2;
                wz0Var = vz0Var2;
            } else {
                wz0Var = (wz0) queryLocalInterface2;
            }
        }
        String readString = parcel.readString();
        wz0Var.getClass();
        int i3 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.g;
            synchronized (multiInstanceInvalidationService2.o) {
                try {
                    int i4 = multiInstanceInvalidationService2.m + 1;
                    multiInstanceInvalidationService2.m = i4;
                    if (multiInstanceInvalidationService2.o.register(wz0Var, Integer.valueOf(i4))) {
                        multiInstanceInvalidationService2.n.put(Integer.valueOf(i4), readString);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService2.m--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i3);
        return true;
    }

    @Override // defpackage.xz0
    public final void v(String[] strArr, int i) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.g;
        synchronized (multiInstanceInvalidationService.o) {
            String str = (String) multiInstanceInvalidationService.n.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.o.beginBroadcast();
            int i2 = 0;
            while (true) {
                pm1 pm1Var = multiInstanceInvalidationService.o;
                if (i2 >= beginBroadcast) {
                    pm1Var.finishBroadcast();
                    Unit unit = Unit.a;
                    return;
                }
                try {
                    Object broadcastCookie = pm1Var.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.n.get(num);
                    if (i != intValue && str.equals(str2)) {
                        try {
                            ((wz0) multiInstanceInvalidationService.o.getBroadcastItem(i2)).o(strArr);
                            Unit unit2 = Unit.a;
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                    i2++;
                } catch (Throwable th) {
                    multiInstanceInvalidationService.o.finishBroadcast();
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
