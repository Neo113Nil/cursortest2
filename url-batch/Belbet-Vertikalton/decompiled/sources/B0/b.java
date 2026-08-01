package B0;

import S.k;
import Z.C0038b;
import Z.C0039c;
import Z.F;
import Z.J;
import Z.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.o;
import d.C0110a;
import h0.C0169t;
import h0.b0;
import h0.c0;
import j1.h;
import java.util.ArrayList;
import n.C0259O;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f44a) {
            case 0:
                c cVar = new c(parcel);
                cVar.f45a = ((Integer) parcel.readValue(c.class.getClassLoader())).intValue();
                return cVar;
            case 1:
                k kVar = new k(parcel);
                kVar.f1139a = parcel.readInt();
                return kVar;
            case 2:
                return new C0038b(parcel);
            case 3:
                return new C0039c(parcel);
            case 4:
                F f2 = new F();
                f2.f1429a = parcel.readString();
                f2.f1430b = parcel.readInt();
                return f2;
            case 5:
                J j = new J();
                j.e = null;
                j.f1472f = new ArrayList();
                j.f1473g = new ArrayList();
                j.f1468a = parcel.createStringArrayList();
                j.f1469b = parcel.createStringArrayList();
                j.f1470c = (C0038b[]) parcel.createTypedArray(C0038b.CREATOR);
                j.f1471d = parcel.readInt();
                j.e = parcel.readString();
                j.f1472f = parcel.createStringArrayList();
                j.f1473g = parcel.createTypedArrayList(C0039c.CREATOR);
                j.f1474h = parcel.createTypedArrayList(F.CREATOR);
                return j;
            case 6:
                return new N(parcel);
            case 7:
                return new com.google.android.material.datepicker.b((o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 9:
                return o.a(parcel.readInt(), parcel.readInt());
            case 10:
                h.e(parcel, "parcel");
                return new C0110a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 11:
                C0169t c0169t = new C0169t();
                c0169t.f3114a = parcel.readInt();
                c0169t.f3115b = parcel.readInt();
                c0169t.f3116c = parcel.readInt() == 1;
                return c0169t;
            case 12:
                b0 b0Var = new b0();
                b0Var.f2989a = parcel.readInt();
                b0Var.f2990b = parcel.readInt();
                b0Var.f2992d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    b0Var.f2991c = iArr;
                    parcel.readIntArray(iArr);
                }
                return b0Var;
            case 13:
                c0 c0Var = new c0();
                c0Var.f2997a = parcel.readInt();
                c0Var.f2998b = parcel.readInt();
                int readInt2 = parcel.readInt();
                c0Var.f2999c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    c0Var.f3000d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                c0Var.e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    c0Var.f3001f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0Var.f3003h = parcel.readInt() == 1;
                c0Var.i = parcel.readInt() == 1;
                c0Var.j = parcel.readInt() == 1;
                c0Var.f3002g = parcel.readArrayList(b0.class.getClassLoader());
                return c0Var;
            case 14:
                C0259O c0259o = new C0259O(parcel);
                c0259o.f3502a = parcel.readByte() != 0;
                return c0259o;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f44a) {
            case 0:
                return new c[i];
            case 1:
                return new k[i];
            case 2:
                return new C0038b[i];
            case 3:
                return new C0039c[i];
            case 4:
                return new F[i];
            case 5:
                return new J[i];
            case 6:
                return new N[i];
            case 7:
                return new com.google.android.material.datepicker.b[i];
            case 8:
                return new com.google.android.material.datepicker.d[i];
            case 9:
                return new o[i];
            case 10:
                return new C0110a[i];
            case 11:
                return new C0169t[i];
            case 12:
                return new b0[i];
            case 13:
                return new c0[i];
            case 14:
                return new C0259O[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
