package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ll implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ ArrayList j;

    public ll(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f = i;
        this.g = arrayList;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f; i++) {
            View view = (View) this.g.get(i);
            String str = (String) this.h.get(i);
            WeakHashMap weakHashMap = e90.a;
            view.setTransitionName(str);
            ((View) this.i.get(i)).setTransitionName((String) this.j.get(i));
        }
    }
}
