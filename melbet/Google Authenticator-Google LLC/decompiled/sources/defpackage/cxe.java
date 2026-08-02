package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxe extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(2);
    private final int a;

    private cxe() {
        this.a = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cxe) {
            return Objects.equals(Integer.valueOf(this.a), Integer.valueOf(((cxe) obj).a));
        }
        return false;
    }

    public int getMaxInflight() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, getMaxInflight());
        oy.r(parcel, q);
    }

    public cxe(int i) {
        this.a = i;
    }
}
