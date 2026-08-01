package androidx.fragment.app;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import f1.h1;
import f1.i1;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f395a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f395a) {
            case 0:
                return new c(parcel);
            case 1:
                return new d(parcel);
            case 2:
                h0 h0Var = new h0();
                h0Var.f433f = parcel.readString();
                h0Var.f434g = parcel.readInt();
                return h0Var;
            case 3:
                l0 l0Var = new l0();
                l0Var.f472j = null;
                l0Var.f473k = new ArrayList();
                l0Var.f474l = new ArrayList();
                l0Var.f469f = parcel.createStringArrayList();
                l0Var.f470g = parcel.createStringArrayList();
                l0Var.f471h = (c[]) parcel.createTypedArray(c.CREATOR);
                l0Var.i = parcel.readInt();
                l0Var.f472j = parcel.readString();
                l0Var.f473k = parcel.createStringArrayList();
                l0Var.f474l = parcel.createTypedArrayList(d.CREATOR);
                l0Var.f475m = parcel.createTypedArrayList(h0.CREATOR);
                return l0Var;
            case 4:
                return new o0(parcel);
            case 5:
                f3.d.e(parcel, "parcel");
                return new c.a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 6:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), (com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), parcel.readInt());
            case 7:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 8:
                return com.google.android.material.datepicker.r.a(parcel.readInt(), parcel.readInt());
            case 9:
                f1.v vVar = new f1.v();
                vVar.f1511f = parcel.readInt();
                vVar.f1512g = parcel.readInt();
                vVar.f1513h = parcel.readInt() == 1;
                return vVar;
            case 10:
                h1 h1Var = new h1();
                h1Var.f1366f = parcel.readInt();
                h1Var.f1367g = parcel.readInt();
                h1Var.i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    h1Var.f1368h = iArr;
                    parcel.readIntArray(iArr);
                }
                return h1Var;
            case 11:
                i1 i1Var = new i1();
                i1Var.f1378f = parcel.readInt();
                i1Var.f1379g = parcel.readInt();
                int readInt2 = parcel.readInt();
                i1Var.f1380h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    i1Var.i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                i1Var.f1381j = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    i1Var.f1382k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                i1Var.f1384m = parcel.readInt() == 1;
                i1Var.f1385n = parcel.readInt() == 1;
                i1Var.f1386o = parcel.readInt() == 1;
                i1Var.f1383l = parcel.readArrayList(h1.class.getClassLoader());
                return i1Var;
            case 12:
                g2.k kVar = new g2.k();
                kVar.f1777f = parcel.readInt();
                kVar.f1778g = (e2.f) parcel.readParcelable(g2.k.class.getClassLoader());
                return kVar;
            case 13:
                l.k kVar2 = new l.k();
                kVar2.f2355f = parcel.readInt();
                return kVar2;
            case 14:
                l.p0 p0Var = new l.p0(parcel);
                p0Var.f2415f = parcel.readByte() != 0;
                return p0Var;
            case 15:
                return new ParcelImpl(parcel);
            case 16:
                q1.b bVar = new q1.b();
                bVar.f3089n = 255;
                bVar.f3091p = -2;
                bVar.f3092q = -2;
                bVar.f3093r = -2;
                bVar.f3100y = Boolean.TRUE;
                bVar.f3082f = parcel.readInt();
                bVar.f3083g = (Integer) parcel.readSerializable();
                bVar.f3084h = (Integer) parcel.readSerializable();
                bVar.i = (Integer) parcel.readSerializable();
                bVar.f3085j = (Integer) parcel.readSerializable();
                bVar.f3086k = (Integer) parcel.readSerializable();
                bVar.f3087l = (Integer) parcel.readSerializable();
                bVar.f3088m = (Integer) parcel.readSerializable();
                bVar.f3089n = parcel.readInt();
                bVar.f3090o = parcel.readString();
                bVar.f3091p = parcel.readInt();
                bVar.f3092q = parcel.readInt();
                bVar.f3093r = parcel.readInt();
                bVar.f3095t = parcel.readString();
                bVar.f3096u = parcel.readString();
                bVar.f3097v = parcel.readInt();
                bVar.f3099x = (Integer) parcel.readSerializable();
                bVar.f3101z = (Integer) parcel.readSerializable();
                bVar.A = (Integer) parcel.readSerializable();
                bVar.B = (Integer) parcel.readSerializable();
                bVar.C = (Integer) parcel.readSerializable();
                bVar.D = (Integer) parcel.readSerializable();
                bVar.E = (Integer) parcel.readSerializable();
                bVar.H = (Integer) parcel.readSerializable();
                bVar.F = (Integer) parcel.readSerializable();
                bVar.G = (Integer) parcel.readSerializable();
                bVar.f3100y = (Boolean) parcel.readSerializable();
                bVar.f3094s = (Locale) parcel.readSerializable();
                bVar.I = (Boolean) parcel.readSerializable();
                bVar.J = (Integer) parcel.readSerializable();
                return bVar;
            case 17:
                r0.g gVar = new r0.g(parcel);
                gVar.f3140f = parcel.readInt();
                return gVar;
            default:
                y1.b bVar2 = new y1.b(parcel);
                bVar2.f3782f = ((Integer) parcel.readValue(y1.b.class.getClassLoader())).intValue();
                return bVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f395a) {
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
                return new com.google.android.material.datepicker.d[i];
            case 8:
                return new com.google.android.material.datepicker.r[i];
            case 9:
                return new f1.v[i];
            case 10:
                return new h1[i];
            case 11:
                return new i1[i];
            case 12:
                return new g2.k[i];
            case 13:
                return new l.k[i];
            case 14:
                return new l.p0[i];
            case 15:
                return new ParcelImpl[i];
            case 16:
                return new q1.b[i];
            case 17:
                return new r0.g[i];
            default:
                return new y1.b[i];
        }
    }
}
