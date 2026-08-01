package j2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e0 extends p0.b {
    public static final Parcelable.Creator<e0> CREATOR = new a2.c(3);
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2310i;

    public e0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2310i = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.h) + "}";
    }

    @Override // p0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        TextUtils.writeToParcel(this.h, parcel, i4);
        parcel.writeInt(this.f2310i ? 1 : 0);
    }
}
