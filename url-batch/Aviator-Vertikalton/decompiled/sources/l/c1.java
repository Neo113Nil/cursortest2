package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c1 extends R.b {
    public static final Parcelable.Creator<c1> CREATOR = new B0.b(5);

    /* renamed from: c, reason: collision with root package name */
    public int f3340c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3341d;

    public c1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3340c = parcel.readInt();
        this.f3341d = parcel.readInt() != 0;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3340c);
        parcel.writeInt(this.f3341d ? 1 : 0);
    }
}
