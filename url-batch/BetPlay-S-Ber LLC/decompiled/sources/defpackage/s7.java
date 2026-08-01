package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class s7 implements Parcelable {
    public static final Parcelable.Creator<s7> CREATOR = new v1(3);
    public final ArrayList f;
    public final ArrayList g;

    public s7(Parcel parcel) {
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.g);
    }
}
