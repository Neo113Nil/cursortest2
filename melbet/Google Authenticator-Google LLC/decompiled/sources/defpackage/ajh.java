package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajh extends Binder implements IInterface {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public ajh(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        int i3 = 0;
        ajg ajgVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                ajgVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ajg)) ? new ajg(readStrongBinder) : (ajg) queryLocalInterface;
            }
            String readString = parcel.readString();
            ajgVar.getClass();
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
                synchronized (remoteCallbackList) {
                    int i4 = multiInstanceInvalidationService.a + 1;
                    multiInstanceInvalidationService.a = i4;
                    Integer valueOf = Integer.valueOf(i4);
                    if (remoteCallbackList.register(ajgVar, valueOf)) {
                        multiInstanceInvalidationService.b.put(valueOf, readString);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService.a--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                ajgVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof ajg)) ? new ajg(readStrongBinder2) : (ajg) queryLocalInterface2;
            }
            int readInt = parcel.readInt();
            ajgVar.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
            RemoteCallbackList remoteCallbackList2 = multiInstanceInvalidationService2.c;
            synchronized (remoteCallbackList2) {
                remoteCallbackList2.unregister(ajgVar);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            createStringArray.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.a;
            RemoteCallbackList remoteCallbackList3 = multiInstanceInvalidationService3.c;
            synchronized (remoteCallbackList3) {
                Map map = multiInstanceInvalidationService3.b;
                String str = (String) map.get(Integer.valueOf(readInt2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = remoteCallbackList3.beginBroadcast();
                    while (i3 < beginBroadcast) {
                        try {
                            Object broadcastCookie = remoteCallbackList3.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str2 = (String) map.get(num);
                            if (readInt2 != intValue && ksp.b(str, str2)) {
                                try {
                                    ajg ajgVar2 = (ajg) remoteCallbackList3.getBroadcastItem(i3);
                                    Parcel obtain = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                        obtain.writeStringArray(createStringArray);
                                        ajgVar2.a.transact(1, obtain, null, 1);
                                        obtain.recycle();
                                    } catch (Throwable th) {
                                        obtain.recycle();
                                        throw th;
                                    }
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } finally {
                            multiInstanceInvalidationService3.c.finishBroadcast();
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
