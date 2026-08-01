package androidx.fragment.app;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.w1;
import g1.x1;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f510a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f510a) {
            case 0:
                return new c(parcel);
            case 1:
                return new d(parcel);
            case 2:
                h0 h0Var = new h0();
                h0Var.f546f = parcel.readString();
                h0Var.f547g = parcel.readInt();
                return h0Var;
            case 3:
                l0 l0Var = new l0();
                l0Var.f583j = null;
                l0Var.f584k = new ArrayList();
                l0Var.f585l = new ArrayList();
                l0Var.f581f = parcel.createStringArrayList();
                l0Var.f582g = parcel.createStringArrayList();
                l0Var.h = (c[]) parcel.createTypedArray(c.CREATOR);
                l0Var.i = parcel.readInt();
                l0Var.f583j = parcel.readString();
                l0Var.f584k = parcel.createStringArrayList();
                l0Var.f585l = parcel.createTypedArrayList(d.CREATOR);
                l0Var.f586m = parcel.createTypedArrayList(h0.CREATOR);
                return l0Var;
            case 4:
                return new o0(parcel);
            case 5:
                i3.d.e(parcel, "parcel");
                return new c.a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 6:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.x) parcel.readParcelable(com.google.android.material.datepicker.x.class.getClassLoader()), (com.google.android.material.datepicker.x) parcel.readParcelable(com.google.android.material.datepicker.x.class.getClassLoader()), (com.google.android.material.datepicker.g) parcel.readParcelable(com.google.android.material.datepicker.g.class.getClassLoader()), (com.google.android.material.datepicker.x) parcel.readParcelable(com.google.android.material.datepicker.x.class.getClassLoader()), parcel.readInt());
            case 7:
                return new com.google.android.material.datepicker.g(parcel.readLong());
            case 8:
                return com.google.android.material.datepicker.x.b(parcel.readInt(), parcel.readInt());
            case 9:
                com.google.android.material.datepicker.f0 f0Var = new com.google.android.material.datepicker.f0();
                f0Var.f1067f = (Long) parcel.readValue(Long.class.getClassLoader());
                return f0Var;
            case 10:
                g1.g0 g0Var = new g1.g0();
                g0Var.f1663f = parcel.readInt();
                g0Var.f1664g = parcel.readInt();
                g0Var.h = parcel.readInt() == 1;
                return g0Var;
            case 11:
                w1 w1Var = new w1();
                w1Var.f1818f = parcel.readInt();
                w1Var.f1819g = parcel.readInt();
                w1Var.i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    w1Var.h = iArr;
                    parcel.readIntArray(iArr);
                }
                return w1Var;
            case 12:
                x1 x1Var = new x1();
                x1Var.f1843f = parcel.readInt();
                x1Var.f1844g = parcel.readInt();
                int readInt2 = parcel.readInt();
                x1Var.h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    x1Var.i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                x1Var.f1845j = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    x1Var.f1846k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                x1Var.f1848m = parcel.readInt() == 1;
                x1Var.f1849n = parcel.readInt() == 1;
                x1Var.f1850o = parcel.readInt() == 1;
                x1Var.f1847l = parcel.readArrayList(w1.class.getClassLoader());
                return x1Var;
            case 13:
                l.m0 m0Var = new l.m0(parcel);
                m0Var.f2507f = parcel.readByte() != 0;
                return m0Var;
            case 14:
                return new ParcelImpl(parcel);
            case 15:
                r0.f fVar = new r0.f(parcel);
                fVar.f3199f = parcel.readInt();
                return fVar;
            default:
                z1.b bVar = new z1.b(parcel);
                bVar.f4129f = ((Integer) parcel.readValue(z1.b.class.getClassLoader())).intValue();
                return bVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f510a) {
            case 0:
                return new c[i];
            case 1:
                return new d[i];
            case 2:
                return new h0[i];
            case 3:
                return new l0[i];
            case 4:
                return new o0[i];
            case 5:
                return new c.a[i];
            case 6:
                return new com.google.android.material.datepicker.b[i];
            case 7:
                return new com.google.android.material.datepicker.g[i];
            case 8:
                return new com.google.android.material.datepicker.x[i];
            case 9:
                return new com.google.android.material.datepicker.f0[i];
            case 10:
                return new g1.g0[i];
            case 11:
                return new w1[i];
            case 12:
                return new x1[i];
            case 13:
                return new l.m0[i];
            case 14:
                return new ParcelImpl[i];
            case 15:
                return new r0.f[i];
            default:
                return new z1.b[i];
        }
    }
}
