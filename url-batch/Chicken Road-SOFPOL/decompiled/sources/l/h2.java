package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h2 extends w3.b {
    public static final Parcelable.Creator<h2> CREATOR = new w0.o(3);

    /* renamed from: f, reason: collision with root package name */
    public int f4253f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4254g;

    public h2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4253f = parcel.readInt();
        this.f4254g = parcel.readInt() != 0;
    }

    @Override // w3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4253f);
        parcel.writeInt(this.f4254g ? 1 : 0);
    }
}
