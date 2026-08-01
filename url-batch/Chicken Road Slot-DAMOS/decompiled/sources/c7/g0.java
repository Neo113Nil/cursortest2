package c7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 extends o7.g {

    /* renamed from: e, reason: collision with root package name */
    public f f1909e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1910f;

    public g0(f fVar, int i3) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f1909e = fVar;
        this.f1910f = i3;
    }

    @Override // o7.g
    public final boolean D(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) o7.h.a(parcel, Bundle.CREATOR);
            o7.h.c(parcel);
            c0.h(this.f1909e, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar = this.f1909e;
            int i10 = this.f1910f;
            fVar.getClass();
            i0 i0Var = new i0(fVar, readInt, readStrongBinder, bundle);
            f0 f0Var = fVar.f1886k;
            f0Var.sendMessage(f0Var.obtainMessage(1, i10, -1, i0Var));
            this.f1909e = null;
        } else if (i3 == 2) {
            parcel.readInt();
            o7.h.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i3 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            k0 k0Var = (k0) o7.h.a(parcel, k0.CREATOR);
            o7.h.c(parcel);
            f fVar2 = this.f1909e;
            c0.h(fVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            c0.g(k0Var);
            fVar2.B = k0Var;
            if (fVar2 instanceof n7.b) {
                g gVar = k0Var.f1938r;
                l b10 = l.b();
                m mVar = gVar == null ? null : gVar.f1903d;
                synchronized (b10) {
                    if (mVar == null) {
                        mVar = l.f1940c;
                    } else {
                        m mVar2 = (m) b10.f1941a;
                        if (mVar2 != null) {
                            if (mVar2.f1945d < mVar.f1945d) {
                            }
                        }
                    }
                    b10.f1941a = mVar;
                }
            }
            Bundle bundle2 = k0Var.f1935d;
            c0.h(this.f1909e, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar3 = this.f1909e;
            int i11 = this.f1910f;
            fVar3.getClass();
            i0 i0Var2 = new i0(fVar3, readInt2, readStrongBinder2, bundle2);
            f0 f0Var2 = fVar3.f1886k;
            f0Var2.sendMessage(f0Var2.obtainMessage(1, i11, -1, i0Var2));
            this.f1909e = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
