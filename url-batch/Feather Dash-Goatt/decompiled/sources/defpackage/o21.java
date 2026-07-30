package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class o21 extends t0 {
    public static final Parcelable.Creator<o21> CREATOR = new g2(7);
    public final Bundle d;
    public s9 e;
    public i8 g;

    public o21(Bundle bundle) {
        this.d = bundle;
    }

    public final Map a() {
        if (this.e == null) {
            s9 s9Var = new s9(0);
            Bundle bundle = this.d;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        s9Var.put(str, str2);
                    }
                }
            }
            this.e = s9Var;
        }
        return this.e;
    }

    public final i8 b() {
        if (this.g == null) {
            Bundle bundle = this.d;
            if (nq0.B(bundle)) {
                this.g = new i8(new nq0(bundle));
            }
        }
        return this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.K(parcel, 2, this.d);
        y90.Q(parcel, P);
    }
}
