package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qp3 extends i1 {
    public static final Parcelable.Creator<qp3> CREATOR = new va3(23);
    public final List m;

    public qp3(ArrayList arrayList) {
        this.m = arrayList;
    }

    public static qp3 a(sm3... sm3VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(sm3VarArr[0].m));
        return new qp3(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        List list = this.m;
        if (list != null) {
            int b02 = yk3.b0(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            yk3.c0(parcel, b02);
        }
        yk3.c0(parcel, b0);
    }
}
