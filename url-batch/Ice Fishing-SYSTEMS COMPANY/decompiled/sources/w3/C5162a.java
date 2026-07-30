package w3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5162a extends V.b {
    public static final Parcelable.Creator<C5162a> CREATOR = new B.g(10);

    /* renamed from: v, reason: collision with root package name */
    public boolean f41594v;

    public C5162a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f41594v = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f41594v ? 1 : 0);
    }
}
