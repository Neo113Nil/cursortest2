package android.support.v4.media.session;

import N0.n;
import android.content.Intent;
import android.content.IntentSender;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.BinderC0168c;
import b.C0166a;
import b.C0169d;
import b.InterfaceC0167b;
import c1.C0202b;
import c1.d;
import c1.e;
import e.C0304a;
import e.C0309f;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1966a;

    public /* synthetic */ b(int i3) {
        this.f1966a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i3 = 0;
        InterfaceC0167b interfaceC0167b = null;
        K0.b bVar = null;
        switch (this.f1966a) {
            case 0:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f1945a = parcel.readInt();
                parcelableVolumeInfo.f1947c = parcel.readInt();
                parcelableVolumeInfo.f1948d = parcel.readInt();
                parcelableVolumeInfo.f1949e = parcel.readInt();
                parcelableVolumeInfo.f1946b = parcel.readInt();
                return parcelableVolumeInfo;
            case 1:
                return new PlaybackStateCompat(parcel);
            case 2:
                C0169d c0169d = new C0169d();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i4 = BinderC0168c.f2518c;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC0167b.f2517b);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0167b)) {
                        C0166a c0166a = new C0166a();
                        c0166a.f2516a = readStrongBinder;
                        interfaceC0167b = c0166a;
                    } else {
                        interfaceC0167b = (InterfaceC0167b) queryLocalInterface;
                    }
                }
                c0169d.f2520a = interfaceC0167b;
                return c0169d;
            case 3:
                int V2 = a.V(parcel);
                Intent intent = null;
                int i5 = 0;
                while (parcel.dataPosition() < V2) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        i3 = a.J(parcel, readInt);
                    } else if (c3 == 2) {
                        i5 = a.J(parcel, readInt);
                    } else if (c3 != 3) {
                        a.R(parcel, readInt);
                    } else {
                        intent = (Intent) a.q(parcel, readInt, Intent.CREATOR);
                    }
                }
                a.v(parcel, V2);
                return new C0202b(i3, i5, intent);
            case 4:
                int V3 = a.V(parcel);
                ArrayList<String> arrayList = null;
                String str = null;
                while (parcel.dataPosition() < V3) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        int L = a.L(parcel, readInt2);
                        int dataPosition = parcel.dataPosition();
                        if (L == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition + L);
                            arrayList = createStringArrayList;
                        }
                    } else if (c4 != 2) {
                        a.R(parcel, readInt2);
                    } else {
                        str = a.r(parcel, readInt2);
                    }
                }
                a.v(parcel, V3);
                return new d(arrayList, str);
            case 5:
                int V4 = a.V(parcel);
                n nVar = null;
                while (parcel.dataPosition() < V4) {
                    int readInt3 = parcel.readInt();
                    char c5 = (char) readInt3;
                    if (c5 == 1) {
                        i3 = a.J(parcel, readInt3);
                    } else if (c5 == 2) {
                        bVar = (K0.b) a.q(parcel, readInt3, K0.b.CREATOR);
                    } else if (c5 != 3) {
                        a.R(parcel, readInt3);
                    } else {
                        nVar = (n) a.q(parcel, readInt3, n.CREATOR);
                    }
                }
                a.v(parcel, V4);
                return new e(i3, bVar, nVar);
            case 6:
                j.e(parcel, "parcel");
                return new C0304a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            default:
                j.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                j.b(readParcelable);
                return new C0309f((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f1966a) {
            case 0:
                return new ParcelableVolumeInfo[i3];
            case 1:
                return new PlaybackStateCompat[i3];
            case 2:
                return new C0169d[i3];
            case 3:
                return new C0202b[i3];
            case 4:
                return new d[i3];
            case 5:
                return new e[i3];
            case 6:
                return new C0304a[i3];
            default:
                return new C0309f[i3];
        }
    }
}
