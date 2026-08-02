package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0168c extends Binder implements InterfaceC0167b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2518c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0169d f2519a;

    public BinderC0168c(C0169d c0169d) {
        this.f2519a = c0169d;
        attachInterface(this, InterfaceC0167b.f2517b);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        String str = InterfaceC0167b.f2517b;
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
        this.f2519a.a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
