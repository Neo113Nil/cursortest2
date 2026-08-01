package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jq implements iq {
    public final int a;
    public final /* synthetic */ c b;

    public jq(c cVar, int i) {
        this.b = cVar;
        this.a = i;
    }

    @Override // defpackage.iq
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c cVar = this.b;
        a aVar = cVar.w;
        int i = this.a;
        if (aVar == null || i >= 0 || !aVar.g().O(-1, 0)) {
            return cVar.P(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
