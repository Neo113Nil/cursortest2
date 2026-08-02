package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alz implements amd {
    public final Set a = new LinkedHashSet();

    public alz(boe boeVar) {
        boeVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.amd
    public final Bundle a() {
        Bundle h = pk.h((kol[]) Arrays.copyOf(new kol[0], 0));
        List p = ixc.p(this.a);
        h.putStringArrayList("classes_to_restore", p instanceof ArrayList ? (ArrayList) p : new ArrayList<>(p));
        return h;
    }
}
