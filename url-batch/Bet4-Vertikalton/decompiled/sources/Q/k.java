package Q;

import Y.C0036b;
import Y.C0037c;
import Y.F;
import Y.J;
import Y.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0081a;
import g0.C0136w;
import g0.i0;
import g0.j0;
import java.util.ArrayList;
import l.C0191N;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f741a;

    public /* synthetic */ k(int i) {
        this.f741a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f741a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f742a = parcel.readInt();
                return lVar;
            case 1:
                return new C0036b(parcel);
            case 2:
                return new C0037c(parcel);
            case 3:
                F f2 = new F();
                f2.f927a = parcel.readString();
                f2.f928b = parcel.readInt();
                return f2;
            case 4:
                J j2 = new J();
                j2.f969e = null;
                j2.f970f = new ArrayList();
                j2.f971g = new ArrayList();
                j2.f966a = parcel.createStringArrayList();
                j2.f967b = parcel.createStringArrayList();
                j2.f968c = (C0036b[]) parcel.createTypedArray(C0036b.CREATOR);
                j2.d = parcel.readInt();
                j2.f969e = parcel.readString();
                j2.f970f = parcel.createStringArrayList();
                j2.f971g = parcel.createTypedArrayList(C0037c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 5:
                return new N(parcel);
            case 6:
                d1.d.e(parcel, "parcel");
                return new C0081a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 7:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 9:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 10:
                C0136w c0136w = new C0136w();
                c0136w.f2494a = parcel.readInt();
                c0136w.f2495b = parcel.readInt();
                c0136w.f2496c = parcel.readInt() == 1;
                return c0136w;
            case 11:
                i0 i0Var = new i0();
                i0Var.f2391a = parcel.readInt();
                i0Var.f2392b = parcel.readInt();
                i0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    i0Var.f2393c = iArr;
                    parcel.readIntArray(iArr);
                }
                return i0Var;
            case 12:
                j0 j0Var = new j0();
                j0Var.f2398a = parcel.readInt();
                j0Var.f2399b = parcel.readInt();
                int readInt2 = parcel.readInt();
                j0Var.f2400c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    j0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                j0Var.f2401e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    j0Var.f2402f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                j0Var.h = parcel.readInt() == 1;
                j0Var.i = parcel.readInt() == 1;
                j0Var.f2404j = parcel.readInt() == 1;
                j0Var.f2403g = parcel.readArrayList(i0.class.getClassLoader());
                return j0Var;
            case 13:
                C0191N c0191n = new C0191N(parcel);
                c0191n.f2834a = parcel.readByte() != 0;
                return c0191n;
            case 14:
                return new ParcelImpl(parcel);
            default:
                x0.b bVar = new x0.b(parcel);
                bVar.f4211a = ((Integer) parcel.readValue(x0.b.class.getClassLoader())).intValue();
                return bVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f741a) {
            case 0:
                return new l[i];
            case 1:
                return new C0036b[i];
            case 2:
                return new C0037c[i];
            case 3:
                return new F[i];
            case 4:
                return new J[i];
            case 5:
                return new N[i];
            case 6:
                return new C0081a[i];
            case 7:
                return new com.google.android.material.datepicker.b[i];
            case 8:
                return new com.google.android.material.datepicker.d[i];
            case 9:
                return new com.google.android.material.datepicker.o[i];
            case 10:
                return new C0136w[i];
            case 11:
                return new i0[i];
            case 12:
                return new j0[i];
            case 13:
                return new C0191N[i];
            case 14:
                return new ParcelImpl[i];
            default:
                return new x0.b[i];
        }
    }
}
