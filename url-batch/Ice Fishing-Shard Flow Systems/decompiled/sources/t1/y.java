package t1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class y extends E1.g {

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f8007f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8008g;

    public y(com.google.android.gms.common.internal.a aVar, int i2) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f8007f = aVar;
        this.f8008g = i2;
    }

    @Override // E1.g
    public final boolean b(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) E1.h.a(parcel, Bundle.CREATOR);
            E1.h.b(parcel);
            u.g(this.f8007f, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f8007f;
            int i5 = this.f8008g;
            aVar.getClass();
            C0904A c0904a = new C0904A(aVar, readInt, readStrongBinder, bundle);
            x xVar = aVar.j;
            xVar.sendMessage(xVar.obtainMessage(1, i5, -1, c0904a));
            this.f8007f = null;
        } else if (i2 == 2) {
            parcel.readInt();
            E1.h.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i2 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C0906C c0906c = (C0906C) E1.h.a(parcel, C0906C.CREATOR);
            E1.h.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f8007f;
            u.g(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            u.f(c0906c);
            aVar2.f4374A = c0906c;
            if (aVar2 instanceof D1.b) {
                C0917d c0917d = c0906c.f7900l;
                C0921h a7 = C0921h.a();
                C0922i c0922i = c0917d == null ? null : c0917d.f7925d;
                synchronized (a7) {
                    if (c0922i == null) {
                        c0922i = C0921h.f7957c;
                    } else {
                        C0922i c0922i2 = (C0922i) a7.f7958a;
                        if (c0922i2 != null) {
                            if (c0922i2.f7959d < c0922i.f7959d) {
                            }
                        }
                    }
                    a7.f7958a = c0922i;
                }
            }
            Bundle bundle2 = c0906c.f7897d;
            u.g(this.f8007f, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f8007f;
            int i7 = this.f8008g;
            aVar3.getClass();
            C0904A c0904a2 = new C0904A(aVar3, readInt2, readStrongBinder2, bundle2);
            x xVar2 = aVar3.j;
            xVar2.sendMessage(xVar2.obtainMessage(1, i7, -1, c0904a2));
            this.f8007f = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
