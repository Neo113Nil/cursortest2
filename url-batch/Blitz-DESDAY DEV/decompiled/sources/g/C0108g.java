package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108g implements j0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2314a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2315b;

    public C0108g(j0.d dVar) {
        g1.d.e(dVar, "registry");
        this.f2315b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // j0.c
    public final Bundle a() {
        switch (this.f2314a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0110i) this.f2315b).n().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2315b));
                return bundle2;
        }
    }

    public C0108g(AbstractActivityC0110i abstractActivityC0110i) {
        this.f2315b = abstractActivityC0110i;
    }
}
