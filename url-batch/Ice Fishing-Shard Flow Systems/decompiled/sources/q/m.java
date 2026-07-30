package q;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import b.InterfaceC0264e;

/* loaded from: classes.dex */
public final class m extends Binder implements InterfaceC0264e {

    /* renamed from: e, reason: collision with root package name */
    public final Handler f7301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f7302f;

    public m(o oVar) {
        this.f7302f = oVar;
        attachInterface(this, InterfaceC0264e.f4132c);
        this.f7301e = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i5) {
        String str = InterfaceC0264e.f4132c;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        o oVar = this.f7302f;
        Handler handler = this.f7301e;
        if (i2 == 2) {
            handler.post(new l(1, oVar, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), parcel.readInt() != 0));
            return true;
        }
        if (i2 == 3) {
            handler.post(new d.l(parcel.readInt(), 3, oVar, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null)));
            return true;
        }
        if (i2 != 4) {
            return super.onTransact(i2, parcel, parcel2, i5);
        }
        handler.post(new l(0, oVar, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), parcel.readInt() != 0));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
