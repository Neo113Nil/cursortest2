package R;

import Z.C0035b;
import Z.C0036c;
import Z.F;
import Z.J;
import Z.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0087a;
import h0.C0139v;
import h0.h0;
import h0.i0;
import java.util.ArrayList;
import m.C0197O;
import y0.C0319b;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f787a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f787a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f788a = parcel.readInt();
                return lVar;
            case 1:
                return new C0035b(parcel);
            case 2:
                return new C0036c(parcel);
            case 3:
                F f2 = new F();
                f2.f997a = parcel.readString();
                f2.f998b = parcel.readInt();
                return f2;
            case 4:
                J j2 = new J();
                j2.f1040e = null;
                j2.f1041f = new ArrayList();
                j2.f1042g = new ArrayList();
                j2.f1037a = parcel.createStringArrayList();
                j2.f1038b = parcel.createStringArrayList();
                j2.f1039c = (C0035b[]) parcel.createTypedArray(C0035b.CREATOR);
                j2.d = parcel.readInt();
                j2.f1040e = parcel.readString();
                j2.f1041f = parcel.createStringArrayList();
                j2.f1042g = parcel.createTypedArrayList(C0036c.CREATOR);
                j2.f1043h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 5:
                return new N(parcel);
            case 6:
                h1.d.e(parcel, "parcel");
                return new C0087a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 7:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 9:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 10:
                C0139v c0139v = new C0139v();
                c0139v.f2622a = parcel.readInt();
                c0139v.f2623b = parcel.readInt();
                c0139v.f2624c = parcel.readInt() == 1;
                return c0139v;
            case 11:
                h0 h0Var = new h0();
                h0Var.f2514a = parcel.readInt();
                h0Var.f2515b = parcel.readInt();
                h0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    h0Var.f2516c = iArr;
                    parcel.readIntArray(iArr);
                }
                return h0Var;
            case 12:
                i0 i0Var = new i0();
                i0Var.f2521a = parcel.readInt();
                i0Var.f2522b = parcel.readInt();
                int readInt2 = parcel.readInt();
                i0Var.f2523c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    i0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                i0Var.f2524e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    i0Var.f2525f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                i0Var.f2527h = parcel.readInt() == 1;
                i0Var.i = parcel.readInt() == 1;
                i0Var.f2528j = parcel.readInt() == 1;
                i0Var.f2526g = parcel.readArrayList(h0.class.getClassLoader());
                return i0Var;
            case 13:
                C0197O c0197o = new C0197O(parcel);
                c0197o.f2971a = parcel.readByte() != 0;
                return c0197o;
            case 14:
                return new ParcelImpl(parcel);
            default:
                C0319b c0319b = new C0319b(parcel);
                c0319b.f4318a = ((Integer) parcel.readValue(C0319b.class.getClassLoader())).intValue();
                return c0319b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f787a) {
            case 0:
                return new l[i];
            case 1:
                return new C0035b[i];
            case 2:
                return new C0036c[i];
            case 3:
                return new F[i];
            case 4:
                return new J[i];
            case 5:
                return new N[i];
            case 6:
                return new C0087a[i];
            case 7:
                return new com.google.android.material.datepicker.b[i];
            case 8:
                return new com.google.android.material.datepicker.d[i];
            case 9:
                return new com.google.android.material.datepicker.o[i];
            case 10:
                return new C0139v[i];
            case 11:
                return new h0[i];
            case 12:
                return new i0[i];
            case 13:
                return new C0197O[i];
            case 14:
                return new ParcelImpl[i];
            default:
                return new C0319b[i];
        }
    }
}
