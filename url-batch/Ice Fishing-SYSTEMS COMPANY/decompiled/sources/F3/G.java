package F3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class G extends V.b {
    public static final Parcelable.Creator<G> CREATOR = new B.g(2);

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1014v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1015w;

    public G(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1014v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1015w = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1014v) + "}";
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f1014v, parcel, i);
        parcel.writeInt(this.f1015w ? 1 : 0);
    }
}
