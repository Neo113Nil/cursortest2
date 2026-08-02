package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddp extends cri {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    static {
        new ddp(null, false, false);
        CREATOR = new dbh(17);
    }

    public ddp(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ddp)) {
            return false;
        }
        ddp ddpVar = (ddp) obj;
        return Objects.equals(this.c, ddpVar.c) && Objects.equals(Boolean.valueOf(this.a), Boolean.valueOf(ddpVar.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.M(parcel, 1, new ArrayList(this.c));
        oy.s(parcel, 2, this.a);
        oy.s(parcel, 3, this.b);
        oy.r(parcel, q);
    }
}
