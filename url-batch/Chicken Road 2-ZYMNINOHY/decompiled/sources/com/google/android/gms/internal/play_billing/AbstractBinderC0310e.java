package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m2.AbstractC1309a;

/* renamed from: com.google.android.gms.internal.play_billing.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0310e extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5944a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i4 = this.f5944a;
        return this;
    }

    public boolean d(int i4, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean e(int i4, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        switch (this.f5944a) {
            case 0:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                return e(i4, parcel, parcel2);
            case 1:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                return d(i4, parcel, parcel2);
            default:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                switch (i4) {
                    case 3:
                        AbstractC1309a.b(parcel);
                        break;
                    case 4:
                        AbstractC1309a.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        AbstractC1309a.b(parcel);
                        break;
                    case 7:
                        AbstractC1309a.b(parcel);
                        break;
                    case 8:
                        s2.f fVar = (s2.f) AbstractC1309a.a(parcel, s2.f.CREATOR);
                        AbstractC1309a.b(parcel);
                        c2.u uVar = (c2.u) this;
                        uVar.f5714c.post(new B.a(uVar, fVar, 14, false));
                        break;
                    case 9:
                        AbstractC1309a.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public AbstractBinderC0310e(String str, int i4) {
        this.f5944a = i4;
        switch (i4) {
            case 1:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
