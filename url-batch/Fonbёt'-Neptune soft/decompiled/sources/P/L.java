package P;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new F.k(3);

    /* renamed from: a, reason: collision with root package name */
    public int f852a;

    /* renamed from: b, reason: collision with root package name */
    public int f853b;

    /* renamed from: c, reason: collision with root package name */
    public int f854c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f855d;

    /* renamed from: e, reason: collision with root package name */
    public int f856e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f857f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f858g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f859h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f860i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f861j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f852a);
        parcel.writeInt(this.f853b);
        parcel.writeInt(this.f854c);
        if (this.f854c > 0) {
            parcel.writeIntArray(this.f855d);
        }
        parcel.writeInt(this.f856e);
        if (this.f856e > 0) {
            parcel.writeIntArray(this.f857f);
        }
        parcel.writeInt(this.f859h ? 1 : 0);
        parcel.writeInt(this.f860i ? 1 : 0);
        parcel.writeInt(this.f861j ? 1 : 0);
        parcel.writeList(this.f858g);
    }
}
