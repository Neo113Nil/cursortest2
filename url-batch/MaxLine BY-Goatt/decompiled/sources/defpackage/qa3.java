package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qa3 extends i1 {
    public static final Parcelable.Creator<qa3> CREATOR = new s3(29);
    public final List m;
    public final String n;

    public qa3(String str, ArrayList arrayList) {
        this.m = arrayList;
        this.n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        List<String> list = this.m;
        if (list != null) {
            int b02 = yk3.b0(parcel, 1);
            parcel.writeStringList(list);
            yk3.c0(parcel, b02);
        }
        yk3.W(parcel, 2, this.n);
        yk3.c0(parcel, b0);
    }
}
