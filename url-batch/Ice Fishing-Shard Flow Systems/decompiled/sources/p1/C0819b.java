package p1;

import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819b extends AbstractC0943a {
    public static final Parcelable.Creator<C0819b> CREATOR = new I1.c(20);

    /* renamed from: d, reason: collision with root package name */
    public final String f7153d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7154e;

    /* renamed from: i, reason: collision with root package name */
    public final String f7155i;

    /* renamed from: l, reason: collision with root package name */
    public final String f7156l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7157m;

    /* renamed from: n, reason: collision with root package name */
    public int f7158n;

    /* renamed from: o, reason: collision with root package name */
    public final String f7159o;

    public C0819b(String str, String str2, String str3, String str4, String str5) {
        this.f7153d = str;
        this.f7154e = str2;
        this.f7155i = str3;
        this.f7156l = str4;
        this.f7157m = str5;
        this.f7159o = "22.0.1";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.K(parcel, 1, this.f7153d);
        AbstractC1053a.K(parcel, 2, this.f7154e);
        AbstractC1053a.K(parcel, 3, this.f7155i);
        AbstractC1053a.K(parcel, 4, this.f7156l);
        AbstractC1053a.K(parcel, 5, this.f7157m);
        int i5 = this.f7158n;
        AbstractC1053a.P(parcel, 6, 4);
        parcel.writeInt(i5);
        AbstractC1053a.K(parcel, 7, this.f7159o);
        AbstractC1053a.S(parcel, Q);
    }

    public C0819b(String str, String str2, String str3, String str4, String str5, int i2, String str6) {
        this.f7153d = str;
        this.f7154e = str2;
        this.f7155i = str3;
        this.f7156l = str4;
        this.f7157m = str5;
        this.f7158n = i2;
        this.f7159o = str6;
    }
}
