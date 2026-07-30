package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ak1 implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<ak1> CREATOR = new s3(15);
    public final String m;
    public final Map n;

    public ak1(String str, Map map) {
        this.m = str;
        this.n = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak1)) {
            return false;
        }
        ak1 ak1Var = (ak1) obj;
        return Intrinsics.b(this.m, ak1Var.m) && Intrinsics.b(this.n, ak1Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + (this.m.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.m + ", extras=" + this.n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        Map map = this.n;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
