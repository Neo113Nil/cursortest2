package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kd3 extends i1 {
    public static final Parcelable.Creator<kd3> CREATOR = new va3(12);
    public final String m;
    public final jd3 n;
    public final String o;
    public final long p;

    public kd3(kd3 kd3Var, long j) {
        ll3.v(kd3Var);
        this.m = kd3Var.m;
        this.n = kd3Var.n;
        this.o = kd3Var.o;
        this.p = j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.n);
        String str = this.o;
        int length = String.valueOf(str).length();
        String str2 = this.m;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return q40.p(sb, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        va3.b(this, parcel, i);
    }

    public kd3(String str, jd3 jd3Var, String str2, long j) {
        this.m = str;
        this.n = jd3Var;
        this.o = str2;
        this.p = j;
    }
}
