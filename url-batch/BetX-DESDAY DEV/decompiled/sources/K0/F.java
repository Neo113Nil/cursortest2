package K0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class F extends R.b {
    public static final Parcelable.Creator<F> CREATOR = new B0.b(2);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f529c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f530d;

    public F(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f529c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f530d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f529c) + "}";
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f529c, parcel, i);
        parcel.writeInt(this.f530d ? 1 : 0);
    }
}
