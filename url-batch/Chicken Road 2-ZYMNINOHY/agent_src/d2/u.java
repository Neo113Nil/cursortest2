package d2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractBinderC0310e;
import n2.AbstractC1320a;

/* loaded from: classes.dex */
public final class u extends AbstractBinderC0310e {

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f8302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8303c;

    public u(com.google.android.gms.common.internal.a aVar, int i4) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f8302b = aVar;
        this.f8303c = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC0310e
    public final boolean d(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC1320a.a(parcel, Bundle.CREATOR);
            AbstractC1320a.b(parcel);
            s.d(this.f8302b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f8302b;
            int i5 = this.f8303c;
            aVar.getClass();
            w wVar = new w(aVar, readInt, readStrongBinder, bundle);
            t tVar = aVar.f5782e;
            tVar.sendMessage(tVar.obtainMessage(1, i5, -1, wVar));
            this.f8302b = null;
        } else if (i4 == 2) {
            parcel.readInt();
            AbstractC1320a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i4 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            y yVar = (y) AbstractC1320a.a(parcel, y.CREATOR);
            AbstractC1320a.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f8302b;
            s.d(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            s.c(yVar);
            aVar2.f5796u = yVar;
            if (aVar2.u()) {
                C0385c c0385c = yVar.f8312d;
                h b4 = h.b();
                i iVar = c0385c == null ? null : c0385c.f8234a;
                synchronized (b4) {
                    if (iVar == null) {
                        iVar = h.f8267c;
                    } else {
                        i iVar2 = (i) b4.f8268a;
                        if (iVar2 != null) {
                            if (iVar2.f8269a < iVar.f8269a) {
                            }
                        }
                    }
                    b4.f8268a = iVar;
                }
            }
            Bundle bundle2 = yVar.f8309a;
            s.d(this.f8302b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f8302b;
            int i6 = this.f8303c;
            aVar3.getClass();
            w wVar2 = new w(aVar3, readInt2, readStrongBinder2, bundle2);
            t tVar2 = aVar3.f5782e;
            tVar2.sendMessage(tVar2.obtainMessage(1, i6, -1, wVar2));
            this.f8302b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
