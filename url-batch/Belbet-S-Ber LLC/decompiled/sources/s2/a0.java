package s2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a0 extends t0.b {
    public static final Parcelable.Creator<a0> CREATOR = new a0.h(6);
    public CharSequence h;
    public boolean i;

    public a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.h) + "}";
    }

    @Override // t0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.h, parcel, i);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
