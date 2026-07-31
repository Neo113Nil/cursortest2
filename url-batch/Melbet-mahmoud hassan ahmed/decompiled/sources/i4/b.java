package i4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class b extends s3.a implements p3.j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: f, reason: collision with root package name */
    final int f17028f;

    /* renamed from: g, reason: collision with root package name */
    private int f17029g;

    /* renamed from: h, reason: collision with root package name */
    private Intent f17030h;

    public b() {
        this(2, 0, null);
    }

    b(int i7, int i8, Intent intent) {
        this.f17028f = i7;
        this.f17029g = i8;
        this.f17030h = intent;
    }

    @Override // p3.j
    public final Status a() {
        return this.f17029g == 0 ? Status.f2460k : Status.f2464o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f17028f);
        s3.c.h(parcel, 2, this.f17029g);
        s3.c.l(parcel, 3, this.f17030h, i7, false);
        s3.c.b(parcel, a7);
    }
}
