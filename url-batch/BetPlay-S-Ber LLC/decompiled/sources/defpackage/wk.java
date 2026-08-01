package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class wk implements vk {
    public final int a;
    public final /* synthetic */ n b;

    public wk(n nVar, int i) {
        this.b = nVar;
        this.a = i;
    }

    @Override // defpackage.vk
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        n nVar = this.b;
        Fragment fragment = nVar.w;
        int i = this.a;
        if (fragment == null || i >= 0 || !fragment.getChildFragmentManager().N(-1, 0)) {
            return nVar.O(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
