package r5;

import android.os.Parcel;
import android.os.Parcelable;
import w0.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends w3.b {
    public static final Parcelable.Creator<a> CREATOR = new o(5);

    /* renamed from: f, reason: collision with root package name */
    public boolean f6614f;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6614f = parcel.readInt() == 1;
    }

    @Override // w3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f6614f ? 1 : 0);
    }
}
