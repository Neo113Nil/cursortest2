package k5;

import a0.a0;
import android.view.View;
import androidx.datastore.preferences.protobuf.j;
import java.util.Iterator;
import java.util.List;
import q3.l1;
import q3.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends j {

    /* renamed from: f, reason: collision with root package name */
    public final View f4195f;

    /* renamed from: g, reason: collision with root package name */
    public int f4196g;

    /* renamed from: h, reason: collision with root package name */
    public int f4197h;
    public final int[] i;

    public g(View view) {
        super(0);
        this.i = new int[2];
        this.f4195f = view;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(u0 u0Var) {
        this.f4195f.setTranslationY(0.0f);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void e() {
        View view = this.f4195f;
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        this.f4196g = iArr[1];
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final l1 f(l1 l1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((u0) it.next()).f6160a.d() & 8) != 0) {
                this.f4195f.setTranslationY(g5.a.c(r0.f6160a.c(), this.f4197h, 0));
                break;
            }
        }
        return l1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final a0 g(u0 u0Var, a0 a0Var) {
        View view = this.f4195f;
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        int i = this.f4196g - iArr[1];
        this.f4197h = i;
        view.setTranslationY(i);
        return a0Var;
    }
}
