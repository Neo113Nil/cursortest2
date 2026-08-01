package C0;

import Q.l;
import X.C0033b;
import X.C0034c;
import X.F;
import X.J;
import X.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0083a;
import com.google.android.material.datepicker.o;
import f0.C0114u;
import f0.c0;
import f0.d0;
import g1.f;
import java.util.ArrayList;
import l.C0195N;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f114a) {
            case 0:
                c cVar = new c(parcel);
                cVar.f115a = ((Integer) parcel.readValue(c.class.getClassLoader())).intValue();
                return cVar;
            case 1:
                l lVar = new l(parcel);
                lVar.f631a = parcel.readInt();
                return lVar;
            case 2:
                return new C0033b(parcel);
            case 3:
                return new C0034c(parcel);
            case 4:
                F f2 = new F();
                f2.f933a = parcel.readString();
                f2.f934b = parcel.readInt();
                return f2;
            case 5:
                J j2 = new J();
                j2.f975e = null;
                j2.f976f = new ArrayList();
                j2.f977g = new ArrayList();
                j2.f972a = parcel.createStringArrayList();
                j2.f973b = parcel.createStringArrayList();
                j2.f974c = (C0033b[]) parcel.createTypedArray(C0033b.CREATOR);
                j2.d = parcel.readInt();
                j2.f975e = parcel.readString();
                j2.f976f = parcel.createStringArrayList();
                j2.f977g = parcel.createTypedArrayList(C0034c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 6:
                return new N(parcel);
            case 7:
                f.e(parcel, "parcel");
                return new C0083a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.b((o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), parcel.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 10:
                return o.a(parcel.readInt(), parcel.readInt());
            case 11:
                C0114u c0114u = new C0114u();
                c0114u.f2348a = parcel.readInt();
                c0114u.f2349b = parcel.readInt();
                c0114u.f2350c = parcel.readInt() == 1;
                return c0114u;
            case 12:
                c0 c0Var = new c0();
                c0Var.f2227a = parcel.readInt();
                c0Var.f2228b = parcel.readInt();
                c0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    c0Var.f2229c = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0Var;
            case 13:
                d0 d0Var = new d0();
                d0Var.f2234a = parcel.readInt();
                d0Var.f2235b = parcel.readInt();
                int readInt2 = parcel.readInt();
                d0Var.f2236c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    d0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                d0Var.f2237e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    d0Var.f2238f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                d0Var.h = parcel.readInt() == 1;
                d0Var.i = parcel.readInt() == 1;
                d0Var.f2240j = parcel.readInt() == 1;
                d0Var.f2239g = parcel.readArrayList(c0.class.getClassLoader());
                return d0Var;
            case 14:
                C0195N c0195n = new C0195N(parcel);
                c0195n.f2891a = parcel.readByte() != 0;
                return c0195n;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f114a) {
            case 0:
                return new c[i];
            case 1:
                return new l[i];
            case 2:
                return new C0033b[i];
            case 3:
                return new C0034c[i];
            case 4:
                return new F[i];
            case 5:
                return new J[i];
            case 6:
                return new N[i];
            case 7:
                return new C0083a[i];
            case 8:
                return new com.google.android.material.datepicker.b[i];
            case 9:
                return new com.google.android.material.datepicker.d[i];
            case 10:
                return new o[i];
            case 11:
                return new C0114u[i];
            case 12:
                return new c0[i];
            case 13:
                return new d0[i];
            case 14:
                return new C0195N[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
