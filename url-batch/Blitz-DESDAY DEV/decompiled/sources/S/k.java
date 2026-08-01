package S;

import Z.C0032b;
import Z.C0033c;
import Z.F;
import Z.J;
import Z.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0077a;
import h0.C0133u;
import h0.e0;
import h0.f0;
import java.util.ArrayList;
import l.O;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f793a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f793a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f794a = parcel.readInt();
                return lVar;
            case 1:
                return new C0032b(parcel);
            case 2:
                return new C0033c(parcel);
            case 3:
                F f2 = new F();
                f2.f1016a = parcel.readString();
                f2.f1017b = parcel.readInt();
                return f2;
            case 4:
                J j2 = new J();
                j2.f1058e = null;
                j2.f1059f = new ArrayList();
                j2.f1060g = new ArrayList();
                j2.f1055a = parcel.createStringArrayList();
                j2.f1056b = parcel.createStringArrayList();
                j2.f1057c = (C0032b[]) parcel.createTypedArray(C0032b.CREATOR);
                j2.d = parcel.readInt();
                j2.f1058e = parcel.readString();
                j2.f1059f = parcel.createStringArrayList();
                j2.f1060g = parcel.createTypedArrayList(C0033c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 5:
                return new N(parcel);
            case 6:
                g1.d.e(parcel, "parcel");
                return new C0077a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 7:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 9:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 10:
                C0133u c0133u = new C0133u();
                c0133u.f2590a = parcel.readInt();
                c0133u.f2591b = parcel.readInt();
                c0133u.f2592c = parcel.readInt() == 1;
                return c0133u;
            case 11:
                e0 e0Var = new e0();
                e0Var.f2478a = parcel.readInt();
                e0Var.f2479b = parcel.readInt();
                e0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    e0Var.f2480c = iArr;
                    parcel.readIntArray(iArr);
                }
                return e0Var;
            case 12:
                f0 f0Var = new f0();
                f0Var.f2485a = parcel.readInt();
                f0Var.f2486b = parcel.readInt();
                int readInt2 = parcel.readInt();
                f0Var.f2487c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    f0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                f0Var.f2488e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    f0Var.f2489f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                f0Var.h = parcel.readInt() == 1;
                f0Var.i = parcel.readInt() == 1;
                f0Var.f2491j = parcel.readInt() == 1;
                f0Var.f2490g = parcel.readArrayList(e0.class.getClassLoader());
                return f0Var;
            case 13:
                O o2 = new O(parcel);
                o2.f2915a = parcel.readByte() != 0;
                return o2;
            case 14:
                return new ParcelImpl(parcel);
            default:
                z0.b bVar = new z0.b(parcel);
                bVar.f4322a = ((Integer) parcel.readValue(z0.b.class.getClassLoader())).intValue();
                return bVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f793a) {
            case 0:
                return new l[i];
            case 1:
                return new C0032b[i];
            case 2:
                return new C0033c[i];
            case 3:
                return new F[i];
            case 4:
                return new J[i];
            case 5:
                return new N[i];
            case 6:
                return new C0077a[i];
            case 7:
                return new com.google.android.material.datepicker.b[i];
            case 8:
                return new com.google.android.material.datepicker.d[i];
            case 9:
                return new com.google.android.material.datepicker.o[i];
            case 10:
                return new C0133u[i];
            case 11:
                return new e0[i];
            case 12:
                return new f0[i];
            case 13:
                return new O[i];
            case 14:
                return new ParcelImpl[i];
            default:
                return new z0.b[i];
        }
    }
}
