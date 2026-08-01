package A0;

import Q.k;
import X.C0032b;
import X.C0033c;
import X.F;
import X.J;
import X.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0080a;
import com.google.android.material.datepicker.o;
import f0.C0106u;
import f0.d0;
import f0.e0;
import java.util.ArrayList;
import l.C0194N;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2a;

    public /* synthetic */ b(int i) {
        this.f2a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2a) {
            case 0:
                c cVar = new c(parcel);
                cVar.f3a = ((Integer) parcel.readValue(c.class.getClassLoader())).intValue();
                return cVar;
            case 1:
                k kVar = new k(parcel);
                kVar.f725a = parcel.readInt();
                return kVar;
            case 2:
                return new C0032b(parcel);
            case 3:
                return new C0033c(parcel);
            case 4:
                F f2 = new F();
                f2.f881a = parcel.readString();
                f2.f882b = parcel.readInt();
                return f2;
            case 5:
                J j2 = new J();
                j2.f923e = null;
                j2.f924f = new ArrayList();
                j2.f925g = new ArrayList();
                j2.f920a = parcel.createStringArrayList();
                j2.f921b = parcel.createStringArrayList();
                j2.f922c = (C0032b[]) parcel.createTypedArray(C0032b.CREATOR);
                j2.d = parcel.readInt();
                j2.f923e = parcel.readString();
                j2.f924f = parcel.createStringArrayList();
                j2.f925g = parcel.createTypedArrayList(C0033c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 6:
                return new N(parcel);
            case 7:
                b1.d.e(parcel, "parcel");
                return new C0080a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.b((o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), parcel.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 10:
                return o.a(parcel.readInt(), parcel.readInt());
            case 11:
                C0106u c0106u = new C0106u();
                c0106u.f2274a = parcel.readInt();
                c0106u.f2275b = parcel.readInt();
                c0106u.f2276c = parcel.readInt() == 1;
                return c0106u;
            case 12:
                d0 d0Var = new d0();
                d0Var.f2157a = parcel.readInt();
                d0Var.f2158b = parcel.readInt();
                d0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    d0Var.f2159c = iArr;
                    parcel.readIntArray(iArr);
                }
                return d0Var;
            case 13:
                e0 e0Var = new e0();
                e0Var.f2165a = parcel.readInt();
                e0Var.f2166b = parcel.readInt();
                int readInt2 = parcel.readInt();
                e0Var.f2167c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    e0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                e0Var.f2168e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    e0Var.f2169f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                e0Var.h = parcel.readInt() == 1;
                e0Var.i = parcel.readInt() == 1;
                e0Var.f2171j = parcel.readInt() == 1;
                e0Var.f2170g = parcel.readArrayList(d0.class.getClassLoader());
                return e0Var;
            case 14:
                C0194N c0194n = new C0194N(parcel);
                c0194n.f2876a = parcel.readByte() != 0;
                return c0194n;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2a) {
            case 0:
                return new c[i];
            case 1:
                return new k[i];
            case 2:
                return new C0032b[i];
            case 3:
                return new C0033c[i];
            case 4:
                return new F[i];
            case 5:
                return new J[i];
            case 6:
                return new N[i];
            case 7:
                return new C0080a[i];
            case 8:
                return new com.google.android.material.datepicker.b[i];
            case 9:
                return new com.google.android.material.datepicker.d[i];
            case 10:
                return new o[i];
            case 11:
                return new C0106u[i];
            case 12:
                return new d0[i];
            case 13:
                return new e0[i];
            case 14:
                return new C0194N[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
