package g;

import android.os.Bundle;
import j0.InterfaceC0169c;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126g implements InterfaceC0169c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2669a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2670b;

    public C0126g(j0.d dVar) {
        k1.e.e(dVar, "registry");
        this.f2670b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // j0.InterfaceC0169c
    public final Bundle a() {
        switch (this.f2669a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0128i) this.f2670b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2670b));
                return bundle2;
        }
    }

    public C0126g(AbstractActivityC0128i abstractActivityC0128i) {
        this.f2670b = abstractActivityC0128i;
    }
}
