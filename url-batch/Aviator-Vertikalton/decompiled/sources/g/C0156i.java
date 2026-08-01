package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156i implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2576a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2577b;

    public C0156i(g0.d dVar) {
        X0.f.e(dVar, "registry");
        this.f2577b = new LinkedHashSet();
        dVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // g0.c
    public final Bundle a() {
        switch (this.f2576a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0158k) this.f2577b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2577b));
                return bundle2;
        }
    }

    public C0156i(AbstractActivityC0158k abstractActivityC0158k) {
        this.f2577b = abstractActivityC0158k;
    }
}
