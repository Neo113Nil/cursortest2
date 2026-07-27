package W;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new B1.c(12);

    /* renamed from: a, reason: collision with root package name */
    public int f3276a;

    /* renamed from: b, reason: collision with root package name */
    public int f3277b;

    /* renamed from: c, reason: collision with root package name */
    public int f3278c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3279d;

    /* renamed from: e, reason: collision with root package name */
    public int f3280e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3281f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3282g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3283h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3284i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3285j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3276a);
        parcel.writeInt(this.f3277b);
        parcel.writeInt(this.f3278c);
        if (this.f3278c > 0) {
            parcel.writeIntArray(this.f3279d);
        }
        parcel.writeInt(this.f3280e);
        if (this.f3280e > 0) {
            parcel.writeIntArray(this.f3281f);
        }
        parcel.writeInt(this.f3283h ? 1 : 0);
        parcel.writeInt(this.f3284i ? 1 : 0);
        parcel.writeInt(this.f3285j ? 1 : 0);
        parcel.writeList(this.f3282g);
    }
}
