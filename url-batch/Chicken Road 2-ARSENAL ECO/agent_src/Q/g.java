package Q;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class g extends Binder implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1928d;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1928d = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        d callback = null;
        if (i7 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                    callback = new d();
                    callback.f1914d = readStrongBinder;
                } else {
                    callback = (d) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            kotlin.jvm.internal.i.e(callback, "callback");
            int i9 = 0;
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1928d;
                synchronized (multiInstanceInvalidationService.f3540h) {
                    try {
                        int i10 = multiInstanceInvalidationService.f3538f + 1;
                        multiInstanceInvalidationService.f3538f = i10;
                        if (multiInstanceInvalidationService.f3540h.register(callback, Integer.valueOf(i10))) {
                            multiInstanceInvalidationService.f3539g.put(Integer.valueOf(i10), readString);
                            i9 = i10;
                        } else {
                            multiInstanceInvalidationService.f3538f--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i9);
            return true;
        }
        if (i7 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof d)) {
                    callback = new d();
                    callback.f1914d = readStrongBinder2;
                } else {
                    callback = (d) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            kotlin.jvm.internal.i.e(callback, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f1928d;
            synchronized (multiInstanceInvalidationService2.f3540h) {
                multiInstanceInvalidationService2.f3540h.unregister(callback);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i7 != 3) {
            return super.onTransact(i7, parcel, parcel2, i8);
        }
        int readInt2 = parcel.readInt();
        String[] tables = parcel.createStringArray();
        kotlin.jvm.internal.i.e(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f1928d;
        synchronized (multiInstanceInvalidationService3.f3540h) {
            String str = (String) multiInstanceInvalidationService3.f3539g.get(Integer.valueOf(readInt2));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = multiInstanceInvalidationService3.f3540h.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService3.f3540h.getBroadcastCookie(i11);
                        kotlin.jvm.internal.i.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService3.f3539g.get(num);
                        if (readInt2 != intValue && str.equals(str2)) {
                            try {
                                ((d) multiInstanceInvalidationService3.f3540h.getBroadcastItem(i11)).b(tables);
                            } catch (RemoteException e4) {
                                Log.w("ROOM", "Error invoking a remote callback", e4);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService3.f3540h.finishBroadcast();
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
