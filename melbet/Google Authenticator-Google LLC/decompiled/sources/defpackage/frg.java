package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frg extends abn {
    public static final Parcelable.Creator CREATOR = new fgb(7);
    public CharSequence a;
    public boolean b;

    public frg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + String.valueOf(this.a) + "}";
    }

    @Override // defpackage.abn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.a, parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public frg(Parcelable parcelable) {
        super(parcelable);
    }
}
