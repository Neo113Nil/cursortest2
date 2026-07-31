package l3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d extends s3.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: f, reason: collision with root package name */
    private final String f18595f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18596g;

    public d(String str, String str2) {
        this.f18595f = str;
        this.f18596g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, this.f18595f, false);
        s3.c.m(parcel, 2, this.f18596g, false);
        s3.c.b(parcel, a7);
    }
}
