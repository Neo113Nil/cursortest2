package s7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.p5;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 extends p5 implements j0 {
    @Override // s7.j0
    public final void t(List list) {
        Parcel F = F();
        F.writeTypedList(list);
        H(F);
    }
}
