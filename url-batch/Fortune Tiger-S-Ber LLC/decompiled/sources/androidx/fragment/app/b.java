package androidx.fragment.app;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import b1.i1;
import b1.j1;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f395a;

    public /* synthetic */ b(int i4) {
        this.f395a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f395a) {
            case 0:
                return new c(parcel);
            case 1:
                return new d(parcel);
            case 2:
                h0 h0Var = new h0();
                h0Var.f428f = parcel.readString();
                h0Var.g = parcel.readInt();
                return h0Var;
            case 3:
                l0 l0Var = new l0();
                l0Var.f464j = null;
                l0Var.f465k = new ArrayList();
                l0Var.f466l = new ArrayList();
                l0Var.f462f = parcel.createStringArrayList();
                l0Var.g = parcel.createStringArrayList();
                l0Var.h = (c[]) parcel.createTypedArray(c.CREATOR);
                l0Var.f463i = parcel.readInt();
                l0Var.f464j = parcel.readString();
                l0Var.f465k = parcel.createStringArrayList();
                l0Var.f466l = parcel.createTypedArrayList(d.CREATOR);
                l0Var.f467m = parcel.createTypedArrayList(h0.CREATOR);
                return l0Var;
            case 4:
                return new o0(parcel);
            case 5:
                u2.c.e(parcel, "parcel");
                return new b.a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 6:
                b1.w wVar = new b1.w();
                wVar.f935f = parcel.readInt();
                wVar.g = parcel.readInt();
                wVar.h = parcel.readInt() == 1;
                return wVar;
            case 7:
                i1 i1Var = new i1();
                i1Var.f803f = parcel.readInt();
                i1Var.g = parcel.readInt();
                i1Var.f804i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    i1Var.h = iArr;
                    parcel.readIntArray(iArr);
                }
                return i1Var;
            case 8:
                j1 j1Var = new j1();
                j1Var.f821f = parcel.readInt();
                j1Var.g = parcel.readInt();
                int readInt2 = parcel.readInt();
                j1Var.h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    j1Var.f822i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                j1Var.f823j = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    j1Var.f824k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                j1Var.f826m = parcel.readInt() == 1;
                j1Var.f827n = parcel.readInt() == 1;
                j1Var.f828o = parcel.readInt() == 1;
                j1Var.f825l = parcel.readArrayList(i1.class.getClassLoader());
                return j1Var;
            case 9:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), (com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), (com.google.android.material.datepicker.c) parcel.readParcelable(com.google.android.material.datepicker.c.class.getClassLoader()), (com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), parcel.readInt());
            case 10:
                return new com.google.android.material.datepicker.c(parcel.readLong());
            case 11:
                return com.google.android.material.datepicker.r.a(parcel.readInt(), parcel.readInt());
            case 12:
                return new ParcelImpl(parcel);
            case 13:
                k.m0 m0Var = new k.m0(parcel);
                m0Var.f2600f = parcel.readByte() != 0;
                return m0Var;
            case 14:
                o0.g gVar = new o0.g(parcel);
                gVar.f2980f = parcel.readInt();
                return gVar;
            default:
                t1.b bVar = new t1.b(parcel);
                bVar.f3379f = ((Integer) parcel.readValue(t1.b.class.getClassLoader())).intValue();
                return bVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f395a) {
            case 0:
                return new c[i4];
            case 1:
                return new d[i4];
            case 2:
                return new h0[i4];
            case 3:
                return new l0[i4];
            case 4:
                return new o0[i4];
            case 5:
                return new b.a[i4];
            case 6:
                return new b1.w[i4];
            case 7:
                return new i1[i4];
            case 8:
                return new j1[i4];
            case 9:
                return new com.google.android.material.datepicker.b[i4];
            case 10:
                return new com.google.android.material.datepicker.c[i4];
            case 11:
                return new com.google.android.material.datepicker.r[i4];
            case 12:
                return new ParcelImpl[i4];
            case 13:
                return new k.m0[i4];
            case 14:
                return new o0.g[i4];
            default:
                return new t1.b[i4];
        }
    }
}
