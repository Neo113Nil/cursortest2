package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class r1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new s1(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                e5 e5Var = new e5(parcel);
                e5Var.f = parcel.readByte() != 0;
                return e5Var;
            case 2:
                return new f7(parcel);
            case 3:
                return new g7(parcel);
            case 4:
                return new c9((ju) parcel.readParcelable(ju.class.getClassLoader()), (ju) parcel.readParcelable(ju.class.getClassLoader()), (ee) parcel.readParcelable(ee.class.getClassLoader()), (ju) parcel.readParcelable(ju.class.getClassLoader()), parcel.readInt());
            case 5:
                return new ee(parcel.readLong());
            case 6:
                yk ykVar = new yk();
                ykVar.f = parcel.readString();
                ykVar.g = parcel.readInt();
                return ykVar;
            case 7:
                cl clVar = new cl();
                clVar.j = null;
                clVar.k = new ArrayList();
                clVar.l = new ArrayList();
                clVar.f = parcel.createStringArrayList();
                clVar.g = parcel.createStringArrayList();
                clVar.h = (f7[]) parcel.createTypedArray(f7.CREATOR);
                clVar.i = parcel.readInt();
                clVar.j = parcel.readString();
                clVar.k = parcel.createStringArrayList();
                clVar.l = parcel.createTypedArrayList(g7.CREATOR);
                clVar.m = parcel.createTypedArrayList(yk.CREATOR);
                return clVar;
            case 8:
                return new gl(parcel);
            case 9:
                iq iqVar = new iq();
                iqVar.f = parcel.readInt();
                iqVar.g = parcel.readInt();
                iqVar.h = parcel.readInt() == 1;
                return iqVar;
            case 10:
                ts tsVar = new ts(parcel);
                tsVar.f = ((Integer) parcel.readValue(ts.class.getClassLoader())).intValue();
                return tsVar;
            case 11:
                return ju.a(parcel.readInt(), parcel.readInt());
            case 12:
                zu zuVar = new zu(parcel);
                zuVar.f = parcel.readInt();
                return zuVar;
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                p30 p30Var = new p30();
                p30Var.f = parcel.readInt();
                p30Var.g = parcel.readInt();
                p30Var.i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    p30Var.h = iArr;
                    parcel.readIntArray(iArr);
                }
                return p30Var;
            default:
                q30 q30Var = new q30();
                q30Var.f = parcel.readInt();
                q30Var.g = parcel.readInt();
                int readInt2 = parcel.readInt();
                q30Var.h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    q30Var.i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                q30Var.j = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    q30Var.k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                q30Var.m = parcel.readInt() == 1;
                q30Var.n = parcel.readInt() == 1;
                q30Var.o = parcel.readInt() == 1;
                q30Var.l = parcel.readArrayList(p30.class.getClassLoader());
                return q30Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new s1[i];
            case 1:
                return new e5[i];
            case 2:
                return new f7[i];
            case 3:
                return new g7[i];
            case 4:
                return new c9[i];
            case 5:
                return new ee[i];
            case 6:
                return new yk[i];
            case 7:
                return new cl[i];
            case 8:
                return new gl[i];
            case 9:
                return new iq[i];
            case 10:
                return new ts[i];
            case 11:
                return new ju[i];
            case 12:
                return new zu[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new p30[i];
            default:
                return new q30[i];
        }
    }
}
