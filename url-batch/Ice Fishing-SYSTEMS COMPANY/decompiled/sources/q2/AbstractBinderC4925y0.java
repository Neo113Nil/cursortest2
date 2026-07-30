package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* renamed from: q2.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4925y0 extends AbstractBinderC3186f8 implements A0 {
    public AbstractBinderC4925y0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static A0 G3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof A0 ? (A0) queryLocalInterface : new C4923x0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        C0 b02;
        switch (i) {
            case 1:
                c();
                parcel2.writeNoException();
                return true;
            case 2:
                f();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean a9 = AbstractC3241g8.a(parcel);
                AbstractC3241g8.f(parcel);
                o0(a9);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean g9 = g();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeInt(g9 ? 1 : 0);
                return true;
            case 5:
                int l9 = l();
                parcel2.writeNoException();
                parcel2.writeInt(l9);
                return true;
            case 6:
                float h9 = h();
                parcel2.writeNoException();
                parcel2.writeFloat(h9);
                return true;
            case 7:
                float j9 = j();
                parcel2.writeNoException();
                parcel2.writeFloat(j9);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    b02 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    b02 = queryLocalInterface instanceof C0 ? (C0) queryLocalInterface : new B0(readStrongBinder);
                }
                AbstractC3241g8.f(parcel);
                d2(b02);
                parcel2.writeNoException();
                return true;
            case 9:
                float m8 = m();
                parcel2.writeNoException();
                parcel2.writeFloat(m8);
                return true;
            case 10:
                boolean p6 = p();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                parcel2.writeInt(p6 ? 1 : 0);
                return true;
            case 11:
                C0 q6 = q();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, q6);
                return true;
            case 12:
                boolean r9 = r();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3241g8.f30958a;
                parcel2.writeInt(r9 ? 1 : 0);
                return true;
            case 13:
                y();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
