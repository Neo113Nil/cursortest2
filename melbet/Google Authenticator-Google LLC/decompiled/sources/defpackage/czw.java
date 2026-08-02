package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czw extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(9);
    public final String a;
    public final List b;
    public final long c;

    public czw(String str, List list, long j) {
        this.a = str;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            czw czwVar = (czw) obj;
            if (Objects.equals(this.a, czwVar.a) && Objects.equals(this.b, czwVar.b) && this.c == czwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.F(parcel, 2, this.b);
        oy.w(parcel, 3, this.c);
        oy.r(parcel, q);
    }
}
