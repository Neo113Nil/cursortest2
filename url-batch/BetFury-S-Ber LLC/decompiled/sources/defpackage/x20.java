package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class x20 extends Binder implements tu {
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ MultiInstanceInvalidationService c;

    public x20(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.c = multiInstanceInvalidationService;
        attachInterface(this, tu.b);
    }

    @Override // defpackage.tu
    public final int b(ru ruVar, String str) {
        ruVar.getClass();
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.h) {
            try {
                int i2 = multiInstanceInvalidationService.f + 1;
                multiInstanceInvalidationService.f = i2;
                if (multiInstanceInvalidationService.h.register(ruVar, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.g.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.f--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // defpackage.tu
    public final void c(ru ruVar, int i) {
        ruVar.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.h) {
            multiInstanceInvalidationService.h.unregister(ruVar);
        }
    }

    @Override // defpackage.tu
    public final void d(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.h) {
            String str = (String) multiInstanceInvalidationService.g.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.h.beginBroadcast();
            int i2 = 0;
            while (true) {
                y20 y20Var = multiInstanceInvalidationService.h;
                if (i2 >= beginBroadcast) {
                    y20Var.finishBroadcast();
                    return;
                }
                try {
                    Object broadcastCookie = y20Var.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.g.get(num);
                    if (i != intValue && str.equals(str2)) {
                        try {
                            ((ru) multiInstanceInvalidationService.h.getBroadcastItem(i2)).a(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                    i2++;
                } catch (Throwable th) {
                    multiInstanceInvalidationService.h.finishBroadcast();
                    throw th;
                }
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = tu.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        ru ruVar = null;
        ru ruVar2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(ru.a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof ru)) {
                    qu quVar = new qu();
                    quVar.c = readStrongBinder;
                    ruVar = quVar;
                } else {
                    ruVar = (ru) queryLocalInterface;
                }
            }
            int b = b(ruVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(b);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            d(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(ru.a);
            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof ru)) {
                qu quVar2 = new qu();
                quVar2.c = readStrongBinder2;
                ruVar2 = quVar2;
            } else {
                ruVar2 = (ru) queryLocalInterface2;
            }
        }
        c(ruVar2, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
