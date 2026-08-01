package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157i implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2580a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2581b;

    public C0157i(g0.d dVar) {
        X0.f.e(dVar, "registry");
        this.f2581b = new LinkedHashSet();
        dVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // g0.c
    public final Bundle a() {
        switch (this.f2580a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0159k) this.f2581b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2581b));
                return bundle2;
        }
    }

    public C0157i(AbstractActivityC0159k abstractActivityC0159k) {
        this.f2581b = abstractActivityC0159k;
    }
}
