package z5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x extends w3.b {
    public static final Parcelable.Creator<x> CREATOR = new w0.o(9);

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f9284f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9285g;

    public x(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9284f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9285g = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f9284f) + "}";
    }

    @Override // w3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f9284f, parcel, i);
        parcel.writeInt(this.f9285g ? 1 : 0);
    }
}
