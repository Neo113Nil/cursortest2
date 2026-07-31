package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR = new e5.a(5);

    /* renamed from: d, reason: collision with root package name */
    public int f8040d;

    /* renamed from: e, reason: collision with root package name */
    public int f8041e;

    /* renamed from: f, reason: collision with root package name */
    public int f8042f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f8043g;

    /* renamed from: h, reason: collision with root package name */
    public int f8044h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f8045j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8046k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8047l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8048m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8040d);
        parcel.writeInt(this.f8041e);
        parcel.writeInt(this.f8042f);
        if (this.f8042f > 0) {
            parcel.writeIntArray(this.f8043g);
        }
        parcel.writeInt(this.f8044h);
        if (this.f8044h > 0) {
            parcel.writeIntArray(this.i);
        }
        parcel.writeInt(this.f8046k ? 1 : 0);
        parcel.writeInt(this.f8047l ? 1 : 0);
        parcel.writeInt(this.f8048m ? 1 : 0);
        parcel.writeList(this.f8045j);
    }
}
