package b1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j1 implements Parcelable {
    public static final Parcelable.Creator<j1> CREATOR = new androidx.fragment.app.b(8);

    /* renamed from: f, reason: collision with root package name */
    public int f821f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f822i;

    /* renamed from: j, reason: collision with root package name */
    public int f823j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f824k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f825l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f826m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f827n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f828o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f821f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        if (this.h > 0) {
            parcel.writeIntArray(this.f822i);
        }
        parcel.writeInt(this.f823j);
        if (this.f823j > 0) {
            parcel.writeIntArray(this.f824k);
        }
        parcel.writeInt(this.f826m ? 1 : 0);
        parcel.writeInt(this.f827n ? 1 : 0);
        parcel.writeInt(this.f828o ? 1 : 0);
        parcel.writeList(this.f825l);
    }
}
