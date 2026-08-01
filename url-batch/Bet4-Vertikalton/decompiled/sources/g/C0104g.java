package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104g implements i0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2212a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2213b;

    public C0104g(i0.d dVar) {
        d1.d.e(dVar, "registry");
        this.f2213b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // i0.c
    public final Bundle a() {
        switch (this.f2212a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0106i) this.f2213b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2213b));
                return bundle2;
        }
    }

    public C0104g(AbstractActivityC0106i abstractActivityC0106i) {
        this.f2213b = abstractActivityC0106i;
    }
}
