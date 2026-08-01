package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class s1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new t1(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                o5 o5Var = new o5(parcel);
                o5Var.f = parcel.readByte() != 0;
                return o5Var;
            case 2:
                return new p7(parcel);
            case 3:
                return new q7(parcel);
            case 4:
                return new p9((kx) parcel.readParcelable(kx.class.getClassLoader()), (kx) parcel.readParcelable(kx.class.getClassLoader()), (sf) parcel.readParcelable(sf.class.getClassLoader()), (kx) parcel.readParcelable(kx.class.getClassLoader()), parcel.readInt());
            case 5:
                return new sf(parcel.readLong());
            case 6:
                bn bnVar = new bn();
                bnVar.f = parcel.readString();
                bnVar.g = parcel.readInt();
                return bnVar;
            case 7:
                fn fnVar = new fn();
                fnVar.j = null;
                fnVar.k = new ArrayList();
                fnVar.l = new ArrayList();
                fnVar.f = parcel.createStringArrayList();
                fnVar.g = parcel.createStringArrayList();
                fnVar.h = (p7[]) parcel.createTypedArray(p7.CREATOR);
                fnVar.i = parcel.readInt();
                fnVar.j = parcel.readString();
                fnVar.k = parcel.createStringArrayList();
                fnVar.l = parcel.createTypedArrayList(q7.CREATOR);
                fnVar.m = parcel.createTypedArrayList(bn.CREATOR);
                return fnVar;
            case 8:
                return new kn(parcel);
            case 9:
                ws wsVar = new ws();
                wsVar.f = parcel.readInt();
                wsVar.g = parcel.readInt();
                wsVar.h = parcel.readInt() == 1;
                return wsVar;
            case 10:
                uv uvVar = new uv(parcel);
                uvVar.f = ((Integer) parcel.readValue(uv.class.getClassLoader())).intValue();
                return uvVar;
            case 11:
                return kx.a(parcel.readInt(), parcel.readInt());
            case 12:
                cy cyVar = new cy(parcel);
                cyVar.f = parcel.readInt();
                return cyVar;
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                r60 r60Var = new r60();
                r60Var.f = parcel.readInt();
                r60Var.g = parcel.readInt();
                r60Var.i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    r60Var.h = iArr;
                    parcel.readIntArray(iArr);
                }
                return r60Var;
            default:
                s60 s60Var = new s60();
                s60Var.f = parcel.readInt();
                s60Var.g = parcel.readInt();
                int readInt2 = parcel.readInt();
                s60Var.h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    s60Var.i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                s60Var.j = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    s60Var.k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                s60Var.m = parcel.readInt() == 1;
                s60Var.n = parcel.readInt() == 1;
                s60Var.o = parcel.readInt() == 1;
                s60Var.l = parcel.readArrayList(r60.class.getClassLoader());
                return s60Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new t1[i];
            case 1:
                return new o5[i];
            case 2:
                return new p7[i];
            case 3:
                return new q7[i];
            case 4:
                return new p9[i];
            case 5:
                return new sf[i];
            case 6:
                return new bn[i];
            case 7:
                return new fn[i];
            case 8:
                return new kn[i];
            case 9:
                return new ws[i];
            case 10:
                return new uv[i];
            case 11:
                return new kx[i];
            case 12:
                return new cy[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new r60[i];
            default:
                return new s60[i];
        }
    }
}
