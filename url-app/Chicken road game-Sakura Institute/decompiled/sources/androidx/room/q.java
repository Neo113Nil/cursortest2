package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends Binder implements l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1117c;

    public q(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1117c = multiInstanceInvalidationService;
        attachInterface(this, l.f1092b);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String str = l.f1092b;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        k kVar = null;
        k kVar2 = null;
        if (i7 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(k.f1091a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof k)) {
                    j jVar = new j();
                    jVar.f1090c = readStrongBinder;
                    kVar = jVar;
                } else {
                    kVar = (k) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            r6.k.f(kVar, "callback");
            int i9 = 0;
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1117c;
                synchronized (multiInstanceInvalidationService.f1062h) {
                    try {
                        int i10 = multiInstanceInvalidationService.f1060f + 1;
                        multiInstanceInvalidationService.f1060f = i10;
                        if (multiInstanceInvalidationService.f1062h.register(kVar, Integer.valueOf(i10))) {
                            multiInstanceInvalidationService.f1061g.put(Integer.valueOf(i10), readString);
                            i9 = i10;
                        } else {
                            multiInstanceInvalidationService.f1060f--;
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
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(k.f1091a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof k)) {
                    j jVar2 = new j();
                    jVar2.f1090c = readStrongBinder2;
                    kVar2 = jVar2;
                } else {
                    kVar2 = (k) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            r6.k.f(kVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f1117c;
            synchronized (multiInstanceInvalidationService2.f1062h) {
                multiInstanceInvalidationService2.f1062h.unregister(kVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i7 != 3) {
            return super.onTransact(i7, parcel, parcel2, i8);
        }
        int readInt2 = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        r6.k.f(createStringArray, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f1117c;
        synchronized (multiInstanceInvalidationService3.f1062h) {
            String str2 = (String) multiInstanceInvalidationService3.f1061g.get(Integer.valueOf(readInt2));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = multiInstanceInvalidationService3.f1062h.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService3.f1062h.getBroadcastCookie(i11);
                        r6.k.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.f1061g.get(num);
                        if (readInt2 != intValue && str2.equals(str3)) {
                            try {
                                ((k) multiInstanceInvalidationService3.f1062h.getBroadcastItem(i11)).c(createStringArray);
                            } catch (RemoteException e9) {
                                Log.w("ROOM", "Error invoking a remote callback", e9);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService3.f1062h.finishBroadcast();
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
