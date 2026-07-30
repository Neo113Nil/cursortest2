package D1;

import K1.h;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;
import h0.C0458d;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r1.m;

/* loaded from: classes.dex */
public final class e extends Binder implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f351e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f352f;

    public e(f fVar, h hVar) {
        this.f352f = hVar;
        Objects.requireNonNull(fVar);
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i2 = this.f351e;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x015a, code lost:
    
        if (super.onTransact(r8, r9, r10, r11) != false) goto L92;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i5) {
        C0458d callback = null;
        C0458d callback2 = null;
        int i7 = 0;
        switch (this.f351e) {
            case 0:
                if (i2 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i2 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i8 = a.f348a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                String readString = parcel.readString();
                r1.g createFromParcel2 = parcel.readInt() != 0 ? r1.g.CREATOR.createFromParcel(parcel) : null;
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
                    sb.append("Parcel data not fully consumed, unread size: ");
                    sb.append(dataAvail);
                    throw new BadParcelableException(sb.toString());
                }
                h hVar = (h) this.f352f;
                if (createFromParcel.f4369d <= 0) {
                    hVar.b(readString);
                } else {
                    hVar.a(createFromParcel.f4371i != null ? new m(createFromParcel) : new r1.f(createFromParcel));
                }
                return true;
            default:
                if (i2 >= 1 && i2 <= 16777215) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                }
                if (i2 == 1598968902) {
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                if (i2 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C0458d)) {
                            callback2 = new C0458d();
                            callback2.f5074e = readStrongBinder;
                        } else {
                            callback2 = (C0458d) queryLocalInterface;
                        }
                    }
                    String readString2 = parcel.readString();
                    Intrinsics.checkNotNullParameter(callback2, "callback");
                    if (readString2 != null) {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f352f;
                        synchronized (multiInstanceInvalidationService.f4023i) {
                            try {
                                int i9 = multiInstanceInvalidationService.f4021d + 1;
                                multiInstanceInvalidationService.f4021d = i9;
                                if (multiInstanceInvalidationService.f4023i.register(callback2, Integer.valueOf(i9))) {
                                    multiInstanceInvalidationService.f4022e.put(Integer.valueOf(i9), readString2);
                                    i7 = i9;
                                } else {
                                    multiInstanceInvalidationService.f4021d--;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i7);
                    return true;
                }
                if (i2 == 2) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C0458d)) {
                            callback = new C0458d();
                            callback.f5074e = readStrongBinder2;
                        } else {
                            callback = (C0458d) queryLocalInterface2;
                        }
                    }
                    int readInt = parcel.readInt();
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = (MultiInstanceInvalidationService) this.f352f;
                    synchronized (multiInstanceInvalidationService2.f4023i) {
                        multiInstanceInvalidationService2.f4023i.unregister(callback);
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i2 != 3) {
                    return super.onTransact(i2, parcel, parcel2, i5);
                }
                int readInt2 = parcel.readInt();
                String[] tables = parcel.createStringArray();
                Intrinsics.checkNotNullParameter(tables, "tables");
                MultiInstanceInvalidationService multiInstanceInvalidationService3 = (MultiInstanceInvalidationService) this.f352f;
                synchronized (multiInstanceInvalidationService3.f4023i) {
                    String str = (String) multiInstanceInvalidationService3.f4022e.get(Integer.valueOf(readInt2));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return true;
                    }
                    int beginBroadcast = multiInstanceInvalidationService3.f4023i.beginBroadcast();
                    while (i7 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f4023i.getBroadcastCookie(i7);
                            Intrinsics.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService3.f4022e.get(num);
                            if (readInt2 != intValue && str.equals(str2)) {
                                try {
                                    ((C0458d) multiInstanceInvalidationService3.f4023i.getBroadcastItem(i7)).b(tables);
                                } catch (RemoteException e7) {
                                    Log.w("ROOM", "Error invoking a remote callback", e7);
                                }
                            }
                            i7++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.f4023i.finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService3.f4023i.finishBroadcast();
                    Unit unit = Unit.f6114a;
                    return true;
                }
        }
    }

    public e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f352f = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
