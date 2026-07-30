package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jd3 extends i1 implements Iterable {
    public static final Parcelable.Creator<jd3> CREATOR = new va3(11);
    public final Bundle m;

    public jd3(Bundle bundle) {
        this.m = bundle;
    }

    public final Object a(String str) {
        return this.m.get(str);
    }

    public final Double b() {
        return Double.valueOf(this.m.getDouble("value"));
    }

    public final String c() {
        return this.m.getString(FirebaseAnalytics.Param.CURRENCY);
    }

    public final Bundle d() {
        return new Bundle(this.m);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new id3(this);
    }

    public final String toString() {
        return this.m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.T(parcel, 2, d());
        yk3.c0(parcel, b0);
    }
}
