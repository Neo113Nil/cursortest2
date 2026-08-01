package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106g implements i0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2252a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2253b;

    public C0106g(i0.d dVar) {
        g1.d.e(dVar, "registry");
        this.f2253b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // i0.c
    public final Bundle a() {
        switch (this.f2252a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0108i) this.f2253b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2253b));
                return bundle2;
        }
    }

    public C0106g(AbstractActivityC0108i abstractActivityC0108i) {
        this.f2253b = abstractActivityC0108i;
    }
}
