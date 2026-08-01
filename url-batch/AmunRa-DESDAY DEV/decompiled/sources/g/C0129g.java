package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129g implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2389a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2390b;

    public C0129g(h0.d dVar) {
        Z0.d.e(dVar, "registry");
        this.f2390b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f2389a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0131i) this.f2390b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2390b));
                return bundle2;
        }
    }

    public C0129g(AbstractActivityC0131i abstractActivityC0131i) {
        this.f2390b = abstractActivityC0131i;
    }
}
