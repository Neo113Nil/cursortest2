package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class e71 implements fu0 {
    public final int d;
    public final List e;
    public Float g = null;
    public Float h = null;
    public z61 i = null;
    public z61 j = null;

    public e71(int i, ArrayList arrayList) {
        this.d = i;
        this.e = arrayList;
    }

    @Override // defpackage.fu0
    public final boolean t() {
        return this.e.contains(this);
    }
}
