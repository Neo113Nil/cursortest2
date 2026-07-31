package z3;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class e extends b implements f {
    public e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // z3.b
    protected final boolean E(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        J3((Status) c.a(parcel, Status.CREATOR), (l3.f) c.a(parcel, l3.f.CREATOR));
        return true;
    }
}
