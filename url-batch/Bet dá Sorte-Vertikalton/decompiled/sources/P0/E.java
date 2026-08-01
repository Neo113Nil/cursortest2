package P0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class E extends R.b {
    public static final Parcelable.Creator<E> CREATOR = new G0.b(2);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f587c;
    public boolean d;

    public E(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f587c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f587c) + "}";
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f587c, parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
