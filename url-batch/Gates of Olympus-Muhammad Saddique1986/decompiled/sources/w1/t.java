package w1;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class t extends Binder implements l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f9905c;

    public t(v vVar) {
        this.f9905c = vVar;
        attachInterface(this, l.f9880a);
    }

    @Override // w1.l
    public final void b(String[] strArr) {
        f2.j.f(strArr, "tables");
        v vVar = this.f9905c;
        vVar.f9908b.execute(new L1.h(vVar, 4, strArr));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        String str = l.f9880a;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i4);
        }
        b(parcel.createStringArray());
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
