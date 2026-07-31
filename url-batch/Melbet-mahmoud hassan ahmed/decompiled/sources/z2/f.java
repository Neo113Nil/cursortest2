package z2;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import x3.a;

/* loaded from: classes.dex */
public final class f extends s3.a {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* renamed from: f, reason: collision with root package name */
    public final String f23636f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23637g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23638h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23639i;

    /* renamed from: j, reason: collision with root package name */
    public final String f23640j;

    /* renamed from: k, reason: collision with root package name */
    public final String f23641k;

    /* renamed from: l, reason: collision with root package name */
    public final String f23642l;

    /* renamed from: m, reason: collision with root package name */
    public final Intent f23643m;

    /* renamed from: n, reason: collision with root package name */
    public final w f23644n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f23645o;

    public f(Intent intent, w wVar) {
        this(null, null, null, null, null, null, null, intent, x3.b.B3(wVar).asBinder(), false);
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z6) {
        this.f23636f = str;
        this.f23637g = str2;
        this.f23638h = str3;
        this.f23639i = str4;
        this.f23640j = str5;
        this.f23641k = str6;
        this.f23642l = str7;
        this.f23643m = intent;
        this.f23644n = (w) x3.b.O0(a.AbstractBinderC0153a.q0(iBinder));
        this.f23645o = z6;
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, w wVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, x3.b.B3(wVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 2, this.f23636f, false);
        s3.c.m(parcel, 3, this.f23637g, false);
        s3.c.m(parcel, 4, this.f23638h, false);
        s3.c.m(parcel, 5, this.f23639i, false);
        s3.c.m(parcel, 6, this.f23640j, false);
        s3.c.m(parcel, 7, this.f23641k, false);
        s3.c.m(parcel, 8, this.f23642l, false);
        s3.c.l(parcel, 9, this.f23643m, i7, false);
        s3.c.g(parcel, 10, x3.b.B3(this.f23644n).asBinder(), false);
        s3.c.c(parcel, 11, this.f23645o);
        s3.c.b(parcel, a7);
    }
}
