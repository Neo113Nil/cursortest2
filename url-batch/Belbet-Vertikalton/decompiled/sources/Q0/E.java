package Q0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class E extends T.b {
    public static final Parcelable.Creator<E> CREATOR = new H0.b(2);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f1002c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1003d;

    public E(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1002c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1003d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1002c) + "}";
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f1002c, parcel, i);
        parcel.writeInt(this.f1003d ? 1 : 0);
    }
}
