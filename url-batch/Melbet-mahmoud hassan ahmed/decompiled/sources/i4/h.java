package i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends s3.a implements p3.j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f17031f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17032g;

    public h(List<String> list, String str) {
        this.f17031f = list;
        this.f17032g = str;
    }

    @Override // p3.j
    public final Status a() {
        return this.f17032g != null ? Status.f2460k : Status.f2464o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.o(parcel, 1, this.f17031f, false);
        s3.c.m(parcel, 2, this.f17032g, false);
        s3.c.b(parcel, a7);
    }
}
