package defpackage;

import android.view.View;
import androidx.fragment.app.a;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class up extends bi {
    public final /* synthetic */ a o;

    public up(a aVar) {
        this.o = aVar;
    }

    @Override // defpackage.bi
    public final View M(int i) {
        a aVar = this.o;
        View view = aVar.J;
        if (view != null) {
            return view.findViewById(i);
        }
        s9.h(aVar, " does not have a view", "Fragment ");
        return null;
    }

    @Override // defpackage.bi
    public final boolean P() {
        return this.o.J != null;
    }
}
