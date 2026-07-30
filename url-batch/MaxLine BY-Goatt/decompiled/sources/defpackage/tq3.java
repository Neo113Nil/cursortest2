package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tq3 extends i1 {
    public static final Parcelable.Creator<tq3> CREATOR = new va3(25);
    public final int m;
    public final String n;
    public final long o;
    public final Long p;
    public final String q;
    public final String r;
    public final Double s;

    public tq3(long j, Object obj, String str, String str2) {
        ll3.s(str);
        this.m = 2;
        this.n = str;
        this.o = j;
        this.r = str2;
        if (obj == null) {
            this.p = null;
            this.s = null;
            this.q = null;
            return;
        }
        if (obj instanceof Long) {
            this.p = (Long) obj;
            this.s = null;
            this.q = null;
        } else if (obj instanceof String) {
            this.p = null;
            this.s = null;
            this.q = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                lh.e("User attribute given of un-supported type");
                throw null;
            }
            this.p = null;
            this.s = (Double) obj;
            this.q = null;
        }
    }

    public final Object a() {
        Long l = this.p;
        if (l != null) {
            return l;
        }
        Double d = this.s;
        if (d != null) {
            return d;
        }
        String str = this.q;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        va3.c(this, parcel);
    }

    public tq3(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.m = i;
        this.n = str;
        this.o = j;
        this.p = l;
        this.s = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.q = str2;
        this.r = str3;
    }

    public tq3(vq3 vq3Var) {
        this(vq3Var.d, vq3Var.e, vq3Var.c, vq3Var.b);
    }
}
