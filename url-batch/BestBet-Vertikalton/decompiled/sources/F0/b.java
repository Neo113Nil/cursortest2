package F0;

import Q.k;
import Y.C0035b;
import Y.C0036c;
import Y.F;
import Y.J;
import Y.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0083a;
import com.google.android.material.datepicker.o;
import g0.C0156u;
import g0.e0;
import g0.f0;
import java.util.ArrayList;
import k1.e;
import l.C0217N;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f244a) {
            case 0:
                c cVar = new c(parcel);
                cVar.f245a = ((Integer) parcel.readValue(c.class.getClassLoader())).intValue();
                return cVar;
            case 1:
                k kVar = new k(parcel);
                kVar.f882a = parcel.readInt();
                return kVar;
            case 2:
                return new C0035b(parcel);
            case 3:
                return new C0036c(parcel);
            case 4:
                F f2 = new F();
                f2.f1286a = parcel.readString();
                f2.f1287b = parcel.readInt();
                return f2;
            case 5:
                J j2 = new J();
                j2.f1328e = null;
                j2.f1329f = new ArrayList();
                j2.f1330g = new ArrayList();
                j2.f1325a = parcel.createStringArrayList();
                j2.f1326b = parcel.createStringArrayList();
                j2.f1327c = (C0035b[]) parcel.createTypedArray(C0035b.CREATOR);
                j2.d = parcel.readInt();
                j2.f1328e = parcel.readString();
                j2.f1329f = parcel.createStringArrayList();
                j2.f1330g = parcel.createTypedArrayList(C0036c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 6:
                return new N(parcel);
            case 7:
                e.e(parcel, "parcel");
                return new C0083a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.b((o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), parcel.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 10:
                return o.a(parcel.readInt(), parcel.readInt());
            case 11:
                C0156u c0156u = new C0156u();
                c0156u.f2935a = parcel.readInt();
                c0156u.f2936b = parcel.readInt();
                c0156u.f2937c = parcel.readInt() == 1;
                return c0156u;
            case 12:
                e0 e0Var = new e0();
                e0Var.f2823a = parcel.readInt();
                e0Var.f2824b = parcel.readInt();
                e0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    e0Var.f2825c = iArr;
                    parcel.readIntArray(iArr);
                }
                return e0Var;
            case 13:
                f0 f0Var = new f0();
                f0Var.f2830a = parcel.readInt();
                f0Var.f2831b = parcel.readInt();
                int readInt2 = parcel.readInt();
                f0Var.f2832c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    f0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                f0Var.f2833e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    f0Var.f2834f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                f0Var.h = parcel.readInt() == 1;
                f0Var.i = parcel.readInt() == 1;
                f0Var.f2836j = parcel.readInt() == 1;
                f0Var.f2835g = parcel.readArrayList(e0.class.getClassLoader());
                return f0Var;
            case 14:
                C0217N c0217n = new C0217N(parcel);
                c0217n.f3314a = parcel.readByte() != 0;
                return c0217n;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f244a) {
            case 0:
                return new c[i];
            case 1:
                return new k[i];
            case 2:
                return new C0035b[i];
            case 3:
                return new C0036c[i];
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
                return new C0156u[i];
            case 12:
                return new e0[i];
            case 13:
                return new f0[i];
            case 14:
                return new C0217N[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
