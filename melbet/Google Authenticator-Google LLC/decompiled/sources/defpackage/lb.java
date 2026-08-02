package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lb {
    public RecyclerView a;
    public final kt b = new lu(this);

    public abstract View c(ky kyVar);

    public abstract int[] d(ky kyVar, View view);

    public final void f() {
        ky kyVar;
        View c;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (kyVar = recyclerView.m) == null || (c = c(kyVar)) == null) {
            return;
        }
        int[] d = d(kyVar, c);
        int i = d[0];
        if (i == 0) {
            if (d[1] == 0) {
                return;
            } else {
                i = 0;
            }
        }
        this.a.ap(i, d[1], false);
    }
}
