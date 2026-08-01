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
import c.C0078a;
import f0.C0109u;
import f0.d0;
import f0.e0;
import java.util.ArrayList;
import l.C0200P;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f681a;

    public /* synthetic */ k(int i) {
        this.f681a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f681a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f682a = parcel.readInt();
                return lVar;
            case 1:
                return new C0033b(parcel);
            case 2:
                return new C0034c(parcel);
            case 3:
                F f2 = new F();
                f2.f838a = parcel.readString();
                f2.f839b = parcel.readInt();
                return f2;
            case 4:
                J j2 = new J();
                j2.f880e = null;
                j2.f881f = new ArrayList();
                j2.f882g = new ArrayList();
                j2.f877a = parcel.createStringArrayList();
                j2.f878b = parcel.createStringArrayList();
                j2.f879c = (C0033b[]) parcel.createTypedArray(C0033b.CREATOR);
                j2.d = parcel.readInt();
                j2.f880e = parcel.readString();
                j2.f881f = parcel.createStringArrayList();
                j2.f882g = parcel.createTypedArrayList(C0034c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 5:
                return new N(parcel);
            case 6:
                Z0.d.e(parcel, "parcel");
                return new C0078a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 7:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 9:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 10:
                C0109u c0109u = new C0109u();
                c0109u.f2231a = parcel.readInt();
                c0109u.f2232b = parcel.readInt();
                c0109u.f2233c = parcel.readInt() == 1;
                return c0109u;
            case 11:
                d0 d0Var = new d0();
                d0Var.f2114a = parcel.readInt();
                d0Var.f2115b = parcel.readInt();
                d0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    d0Var.f2116c = iArr;
                    parcel.readIntArray(iArr);
                }
                return d0Var;
            case 12:
                e0 e0Var = new e0();
                e0Var.f2122a = parcel.readInt();
                e0Var.f2123b = parcel.readInt();
                int readInt2 = parcel.readInt();
                e0Var.f2124c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    e0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                e0Var.f2125e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    e0Var.f2126f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                e0Var.h = parcel.readInt() == 1;
                e0Var.i = parcel.readInt() == 1;
                e0Var.f2128j = parcel.readInt() == 1;
                e0Var.f2127g = parcel.readArrayList(d0.class.getClassLoader());
                return e0Var;
            case 13:
                C0200P c0200p = new C0200P(parcel);
                c0200p.f2992a = parcel.readByte() != 0;
                return c0200p;
            case 14:
                return new ParcelImpl(parcel);
            default:
                w0.b bVar = new w0.b(parcel);
                bVar.f4120a = ((Integer) parcel.readValue(w0.b.class.getClassLoader())).intValue();
                return bVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f681a) {
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
                return new C0078a[i];
            case 7:
                return new com.google.android.material.datepicker.b[i];
            case 8:
                return new com.google.android.material.datepicker.d[i];
            case 9:
                return new com.google.android.material.datepicker.o[i];
            case 10:
                return new C0109u[i];
            case 11:
                return new d0[i];
            case 12:
                return new e0[i];
            case 13:
                return new C0200P[i];
            case 14:
                return new ParcelImpl[i];
            default:
                return new w0.b[i];
        }
    }
}
