package M0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class F extends S.b {
    public static final Parcelable.Creator<F> CREATOR = new D0.b(2);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f562c;
    public boolean d;

    public F(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f562c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f562c) + "}";
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f562c, parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
