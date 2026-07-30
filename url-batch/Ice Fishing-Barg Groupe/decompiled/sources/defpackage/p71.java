package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p71 extends Binder implements vm0 {
    public final /* synthetic */ MultiInstanceInvalidationService TSizfFm2Yiuu;

    public p71(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.TSizfFm2Yiuu = multiInstanceInvalidationService;
        attachInterface(this, vm0.lS5Rgt96tfkO);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        q71 q71Var;
        String str = vm0.lS5Rgt96tfkO;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        um0 um0Var = null;
        um0 um0Var2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(um0.PxuCJdSBwIXG);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof um0)) {
                    tm0 tm0Var = new tm0();
                    tm0Var.TSizfFm2Yiuu = readStrongBinder;
                    um0Var = tm0Var;
                } else {
                    um0Var = (um0) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            um0Var.getClass();
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.TSizfFm2Yiuu;
                synchronized (multiInstanceInvalidationService.wdg6QnbFHrFF) {
                    try {
                        int i4 = multiInstanceInvalidationService.rtx2ld2ELZv4 + 1;
                        multiInstanceInvalidationService.rtx2ld2ELZv4 = i4;
                        if (multiInstanceInvalidationService.wdg6QnbFHrFF.register(um0Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.OPXfSBeufaJ8.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.rtx2ld2ELZv4--;
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
        if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(um0.PxuCJdSBwIXG);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof um0)) {
                    tm0 tm0Var2 = new tm0();
                    tm0Var2.TSizfFm2Yiuu = readStrongBinder2;
                    um0Var2 = tm0Var2;
                } else {
                    um0Var2 = (um0) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            um0Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.TSizfFm2Yiuu;
            synchronized (multiInstanceInvalidationService2.wdg6QnbFHrFF) {
                multiInstanceInvalidationService2.wdg6QnbFHrFF.unregister(um0Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int readInt2 = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        createStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.TSizfFm2Yiuu;
        synchronized (multiInstanceInvalidationService3.wdg6QnbFHrFF) {
            String str2 = (String) multiInstanceInvalidationService3.OPXfSBeufaJ8.get(Integer.valueOf(readInt2));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = multiInstanceInvalidationService3.wdg6QnbFHrFF.beginBroadcast();
                while (true) {
                    q71Var = multiInstanceInvalidationService3.wdg6QnbFHrFF;
                    if (i3 >= beginBroadcast) {
                        break;
                    }
                    try {
                        Object broadcastCookie = q71Var.getBroadcastCookie(i3);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.OPXfSBeufaJ8.get(num);
                        if (readInt2 != intValue && str2.equals(str3)) {
                            try {
                                ((um0) multiInstanceInvalidationService3.wdg6QnbFHrFF.getBroadcastItem(i3)).TSizfFm2Yiuu(createStringArray);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i3++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService3.wdg6QnbFHrFF.finishBroadcast();
                        throw th2;
                    }
                }
                q71Var.finishBroadcast();
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
