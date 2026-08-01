package Q;

import X.C0033b;
import X.C0034c;
import X.F;
import X.J;
import X.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0077a;
import f0.C0110u;
import f0.d0;
import f0.e0;
import java.util.ArrayList;
import l.C0201O;
import w0.C0331b;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f720a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f720a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f721a = parcel.readInt();
                return lVar;
            case 1:
                return new C0033b(parcel);
            case 2:
                return new C0034c(parcel);
            case 3:
                F f2 = new F();
                f2.f907a = parcel.readString();
                f2.f908b = parcel.readInt();
                return f2;
            case 4:
                J j2 = new J();
                j2.f949e = null;
                j2.f950f = new ArrayList();
                j2.f951g = new ArrayList();
                j2.f946a = parcel.createStringArrayList();
                j2.f947b = parcel.createStringArrayList();
                j2.f948c = (C0033b[]) parcel.createTypedArray(C0033b.CREATOR);
                j2.d = parcel.readInt();
                j2.f949e = parcel.readString();
                j2.f950f = parcel.createStringArrayList();
                j2.f951g = parcel.createTypedArrayList(C0034c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 5:
                return new N(parcel);
            case 6:
                e1.d.e(parcel, "parcel");
                return new C0077a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 7:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 9:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 10:
                C0110u c0110u = new C0110u();
                c0110u.f2299a = parcel.readInt();
                c0110u.f2300b = parcel.readInt();
                c0110u.f2301c = parcel.readInt() == 1;
                return c0110u;
            case 11:
                d0 d0Var = new d0();
                d0Var.f2182a = parcel.readInt();
                d0Var.f2183b = parcel.readInt();
                d0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    d0Var.f2184c = iArr;
                    parcel.readIntArray(iArr);
                }
                return d0Var;
            case 12:
                e0 e0Var = new e0();
                e0Var.f2190a = parcel.readInt();
                e0Var.f2191b = parcel.readInt();
                int readInt2 = parcel.readInt();
                e0Var.f2192c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    e0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                e0Var.f2193e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    e0Var.f2194f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                e0Var.h = parcel.readInt() == 1;
                e0Var.i = parcel.readInt() == 1;
                e0Var.f2196j = parcel.readInt() == 1;
                e0Var.f2195g = parcel.readArrayList(d0.class.getClassLoader());
                return e0Var;
            case 13:
                C0201O c0201o = new C0201O(parcel);
                c0201o.f2897a = parcel.readByte() != 0;
                return c0201o;
            case 14:
                return new ParcelImpl(parcel);
            default:
                C0331b c0331b = new C0331b(parcel);
                c0331b.f4057a = ((Integer) parcel.readValue(C0331b.class.getClassLoader())).intValue();
                return c0331b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f720a) {
            case 0:
                return new l[i];
            case 1:
                return new C0033b[i];
            case 2:
                return new C0034c[i];
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
                return new C0110u[i];
            case 11:
                return new d0[i];
            case 12:
                return new e0[i];
            case 13:
                return new C0201O[i];
            case 14:
                return new ParcelImpl[i];
            default:
                return new C0331b[i];
        }
    }
}
