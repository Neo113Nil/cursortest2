package Q;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0045b;
import androidx.fragment.app.C0046c;
import androidx.fragment.app.H;
import androidx.fragment.app.M;
import androidx.fragment.app.Q;
import androidx.versionedparcelable.ParcelImpl;
import c.C0094a;
import c.C0103j;
import e0.C0132u;
import e0.d0;
import e0.e0;
import java.util.ArrayList;
import l.C0246Q;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f725a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f725a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f726a = parcel.readInt();
                return lVar;
            case 1:
                return new C0045b(parcel);
            case 2:
                return new C0046c(parcel);
            case 3:
                H h = new H();
                h.f1207a = parcel.readString();
                h.f1208b = parcel.readInt();
                return h;
            case 4:
                M m2 = new M();
                m2.f1251e = null;
                m2.f1252f = new ArrayList();
                m2.f1253g = new ArrayList();
                m2.f1247a = parcel.createStringArrayList();
                m2.f1248b = parcel.createStringArrayList();
                m2.f1249c = (C0045b[]) parcel.createTypedArray(C0045b.CREATOR);
                m2.f1250d = parcel.readInt();
                m2.f1251e = parcel.readString();
                m2.f1252f = parcel.createStringArrayList();
                m2.f1253g = parcel.createTypedArrayList(C0046c.CREATOR);
                m2.h = parcel.createTypedArrayList(H.CREATOR);
                return m2;
            case 5:
                return new Q(parcel);
            case 6:
                X0.f.e(parcel, "parcel");
                return new C0094a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 7:
                X0.f.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                X0.f.b(readParcelable);
                return new C0103j((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 10:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 11:
                C0132u c0132u = new C0132u();
                c0132u.f2346a = parcel.readInt();
                c0132u.f2347b = parcel.readInt();
                c0132u.f2348c = parcel.readInt() == 1;
                return c0132u;
            case 12:
                d0 d0Var = new d0();
                d0Var.f2212a = parcel.readInt();
                d0Var.f2213b = parcel.readInt();
                d0Var.f2215d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    d0Var.f2214c = iArr;
                    parcel.readIntArray(iArr);
                }
                return d0Var;
            case 13:
                e0 e0Var = new e0();
                e0Var.f2222a = parcel.readInt();
                e0Var.f2223b = parcel.readInt();
                int readInt2 = parcel.readInt();
                e0Var.f2224c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    e0Var.f2225d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                e0Var.f2226e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    e0Var.f2227f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                e0Var.h = parcel.readInt() == 1;
                e0Var.i = parcel.readInt() == 1;
                e0Var.f2229j = parcel.readInt() == 1;
                e0Var.f2228g = parcel.readArrayList(d0.class.getClassLoader());
                return e0Var;
            case 14:
                C0246Q c0246q = new C0246Q(parcel);
                c0246q.f3285a = parcel.readByte() != 0;
                return c0246q;
            case 15:
                return new ParcelImpl(parcel);
            default:
                v0.b bVar = new v0.b(parcel);
                bVar.f4447a = ((Integer) parcel.readValue(v0.b.class.getClassLoader())).intValue();
                return bVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f725a) {
            case 0:
                return new l[i];
            case 1:
                return new C0045b[i];
            case 2:
                return new C0046c[i];
            case 3:
                return new H[i];
            case 4:
                return new M[i];
            case 5:
                return new Q[i];
            case 6:
                return new C0094a[i];
            case 7:
                return new C0103j[i];
            case 8:
                return new com.google.android.material.datepicker.b[i];
            case 9:
                return new com.google.android.material.datepicker.d[i];
            case 10:
                return new com.google.android.material.datepicker.o[i];
            case 11:
                return new C0132u[i];
            case 12:
                return new d0[i];
            case 13:
                return new e0[i];
            case 14:
                return new C0246Q[i];
            case 15:
                return new ParcelImpl[i];
            default:
                return new v0.b[i];
        }
    }
}
