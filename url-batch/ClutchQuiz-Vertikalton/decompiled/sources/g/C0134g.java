package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134g implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2447a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2448b;

    public C0134g(h0.d dVar) {
        g1.f.e(dVar, "registry");
        this.f2448b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f2447a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0136i) this.f2448b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2448b));
                return bundle2;
        }
    }

    public C0134g(AbstractActivityC0136i abstractActivityC0136i) {
        this.f2448b = abstractActivityC0136i;
    }
}
