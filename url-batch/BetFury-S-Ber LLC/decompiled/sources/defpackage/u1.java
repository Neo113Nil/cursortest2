package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class u1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new v1(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                w5 w5Var = new w5(parcel);
                w5Var.f = parcel.readByte() != 0;
                return w5Var;
            case 2:
                return new b8(parcel);
            case 3:
                return new c8(parcel);
            case 4:
                return new ca((o20) parcel.readParcelable(o20.class.getClassLoader()), (o20) parcel.readParcelable(o20.class.getClassLoader()), (wh) parcel.readParcelable(wh.class.getClassLoader()), (o20) parcel.readParcelable(o20.class.getClassLoader()), parcel.readInt());
            case 5:
                return new wh(parcel.readLong());
            case 6:
                hq hqVar = new hq();
                hqVar.f = parcel.readString();
                hqVar.g = parcel.readInt();
                return hqVar;
            case 7:
                mq mqVar = new mq();
                mqVar.j = null;
                mqVar.k = new ArrayList();
                mqVar.l = new ArrayList();
                mqVar.f = parcel.createStringArrayList();
                mqVar.g = parcel.createStringArrayList();
                mqVar.h = (b8[]) parcel.createTypedArray(b8.CREATOR);
                mqVar.i = parcel.readInt();
                mqVar.j = parcel.readString();
                mqVar.k = parcel.createStringArrayList();
                mqVar.l = parcel.createTypedArrayList(c8.CREATOR);
                mqVar.m = parcel.createTypedArrayList(hq.CREATOR);
                return mqVar;
            case 8:
                return new pq(parcel);
            case 9:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new kv((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 10:
                vx vxVar = new vx();
                vxVar.f = parcel.readInt();
                vxVar.g = parcel.readInt();
                vxVar.h = parcel.readInt() == 1;
                return vxVar;
            case 11:
                x00 x00Var = new x00(parcel);
                x00Var.f = ((Integer) parcel.readValue(x00.class.getClassLoader())).intValue();
                return x00Var;
            case 12:
                return o20.a(parcel.readInt(), parcel.readInt());
            case 13:
                o30 o30Var = new o30(parcel);
                o30Var.f = parcel.readInt();
                return o30Var;
            case 14:
                return new ParcelImpl(parcel);
            case 15:
                xe0 xe0Var = new xe0();
                xe0Var.f = parcel.readInt();
                xe0Var.g = parcel.readInt();
                xe0Var.i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    xe0Var.h = iArr;
                    parcel.readIntArray(iArr);
                }
                return xe0Var;
            default:
                ye0 ye0Var = new ye0();
                ye0Var.f = parcel.readInt();
                ye0Var.g = parcel.readInt();
                int readInt2 = parcel.readInt();
                ye0Var.h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    ye0Var.i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                ye0Var.j = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    ye0Var.k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                ye0Var.m = parcel.readInt() == 1;
                ye0Var.n = parcel.readInt() == 1;
                ye0Var.o = parcel.readInt() == 1;
                ye0Var.l = parcel.readArrayList(xe0.class.getClassLoader());
                return ye0Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new v1[i];
            case 1:
                return new w5[i];
            case 2:
                return new b8[i];
            case 3:
                return new c8[i];
            case 4:
                return new ca[i];
            case 5:
                return new wh[i];
            case 6:
                return new hq[i];
            case 7:
                return new mq[i];
            case 8:
                return new pq[i];
            case 9:
                return new kv[i];
            case 10:
                return new vx[i];
            case 11:
                return new x00[i];
            case 12:
                return new o20[i];
            case 13:
                return new o30[i];
            case 14:
                return new ParcelImpl[i];
            case 15:
                return new xe0[i];
            default:
                return new ye0[i];
        }
    }
}
