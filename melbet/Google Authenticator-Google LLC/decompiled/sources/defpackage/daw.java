package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class daw extends cri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(13);
    public final Integer a;

    public daw(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof daw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Objects.equals(this.a, ((daw) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int q = oy.q(parcel, 20293);
        oy.E(parcel, 2, num);
        oy.r(parcel, q);
    }
}
