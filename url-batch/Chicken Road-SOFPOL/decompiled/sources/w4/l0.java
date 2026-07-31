package w4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l0 extends w3.b {
    public static final Parcelable.Creator<l0> CREATOR = new w0.o(7);

    /* renamed from: f, reason: collision with root package name */
    public Parcelable f7970f;

    public l0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7970f = parcel.readParcelable(classLoader == null ? d0.class.getClassLoader() : classLoader);
    }

    @Override // w3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f7970f, 0);
    }
}
