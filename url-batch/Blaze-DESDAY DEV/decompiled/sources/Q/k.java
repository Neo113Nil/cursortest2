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
import c.C0083a;
import g0.C0137v;
import g0.g0;
import g0.h0;
import java.util.ArrayList;
import l.C0195O;
import x0.C0317b;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f727a;

    public /* synthetic */ k(int i) {
        this.f727a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f727a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f728a = parcel.readInt();
                return lVar;
            case 1:
                return new C0036b(parcel);
            case 2:
                return new C0037c(parcel);
            case 3:
                F f2 = new F();
                f2.f954a = parcel.readString();
                f2.f955b = parcel.readInt();
                return f2;
            case 4:
                J j2 = new J();
                j2.f996e = null;
                j2.f997f = new ArrayList();
                j2.f998g = new ArrayList();
                j2.f993a = parcel.createStringArrayList();
                j2.f994b = parcel.createStringArrayList();
                j2.f995c = (C0036b[]) parcel.createTypedArray(C0036b.CREATOR);
                j2.d = parcel.readInt();
                j2.f996e = parcel.readString();
                j2.f997f = parcel.createStringArrayList();
                j2.f998g = parcel.createTypedArrayList(C0037c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 5:
                return new N(parcel);
            case 6:
                g1.d.e(parcel, "parcel");
                return new C0083a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 7:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 9:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 10:
                C0137v c0137v = new C0137v();
                c0137v.f2524a = parcel.readInt();
                c0137v.f2525b = parcel.readInt();
                c0137v.f2526c = parcel.readInt() == 1;
                return c0137v;
            case 11:
                g0 g0Var = new g0();
                g0Var.f2416a = parcel.readInt();
                g0Var.f2417b = parcel.readInt();
                g0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    g0Var.f2418c = iArr;
                    parcel.readIntArray(iArr);
                }
                return g0Var;
            case 12:
                h0 h0Var = new h0();
                h0Var.f2424a = parcel.readInt();
                h0Var.f2425b = parcel.readInt();
                int readInt2 = parcel.readInt();
                h0Var.f2426c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    h0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                h0Var.f2427e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    h0Var.f2428f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                h0Var.h = parcel.readInt() == 1;
                h0Var.i = parcel.readInt() == 1;
                h0Var.f2430j = parcel.readInt() == 1;
                h0Var.f2429g = parcel.readArrayList(g0.class.getClassLoader());
                return h0Var;
            case 13:
                C0195O c0195o = new C0195O(parcel);
                c0195o.f2861a = parcel.readByte() != 0;
                return c0195o;
            case 14:
                return new ParcelImpl(parcel);
            default:
                C0317b c0317b = new C0317b(parcel);
                c0317b.f4123a = ((Integer) parcel.readValue(C0317b.class.getClassLoader())).intValue();
                return c0317b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f727a) {
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
                return new C0083a[i];
            case 7:
                return new com.google.android.material.datepicker.b[i];
            case 8:
                return new com.google.android.material.datepicker.d[i];
            case 9:
                return new com.google.android.material.datepicker.o[i];
            case 10:
                return new C0137v[i];
            case 11:
                return new g0[i];
            case 12:
                return new h0[i];
            case 13:
                return new C0195O[i];
            case 14:
                return new ParcelImpl[i];
            default:
                return new C0317b[i];
        }
    }
}
