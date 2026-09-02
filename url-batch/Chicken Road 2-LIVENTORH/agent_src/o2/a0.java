package o2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a0 extends s0.b {
    public static final Parcelable.Creator<a0> CREATOR = new a0.g(7);

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f2875h;
    public boolean i;

    public a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2875h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2875h) + "}";
    }

    @Override // s0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f2875h, parcel, i);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
