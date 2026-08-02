package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyu extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(11);
    public final String a;
    public final String b;
    private final cys c;
    private final cyt d;

    public cyu(String str, String str2, int i, int i2) {
        cys cysVar;
        this.a = str;
        this.b = str2;
        cyt cytVar = null;
        switch (i) {
            case 0:
                cysVar = cys.UNKNOWN;
                break;
            case 1:
                cysVar = cys.NULL_ACCOUNT;
                break;
            case 2:
                cysVar = cys.GOOGLE;
                break;
            case 3:
                cysVar = cys.DEVICE;
                break;
            case 4:
                cysVar = cys.SIM;
                break;
            case 5:
                cysVar = cys.EXCHANGE;
                break;
            case 6:
                cysVar = cys.THIRD_PARTY_EDITABLE;
                break;
            case 7:
                cysVar = cys.THIRD_PARTY_READONLY;
                break;
            case 8:
                cysVar = cys.SIM_SDN;
                break;
            case 9:
                cysVar = cys.PRELOAD_SDN;
                break;
            default:
                cysVar = null;
                break;
        }
        this.c = cysVar == null ? cys.UNKNOWN : cysVar;
        if (i2 == 0) {
            cytVar = cyt.UNKNOWN;
        } else if (i2 == 1) {
            cytVar = cyt.NONE;
        } else if (i2 == 2) {
            cytVar = cyt.EXACT;
        } else if (i2 == 3) {
            cytVar = cyt.SUBSTRING;
        } else if (i2 == 4) {
            cytVar = cyt.HEURISTIC;
        } else if (i2 == 5) {
            cytVar = cyt.SHEEPDOG_ELIGIBLE;
        }
        this.d = cytVar == null ? cyt.UNKNOWN : cytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyu cyuVar = (cyu) obj;
            if (Objects.equals(this.a, cyuVar.a) && Objects.equals(this.b, cyuVar.b) && this.c == cyuVar.c && this.d == cyuVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("accountType", this.a);
        T.b("dataSet", this.b);
        T.b("category", this.c);
        T.b("matchTag", this.d);
        return T.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.I(parcel, 2, this.b);
        oy.v(parcel, 3, this.c.k);
        oy.v(parcel, 4, this.d.g);
        oy.r(parcel, q);
    }
}
