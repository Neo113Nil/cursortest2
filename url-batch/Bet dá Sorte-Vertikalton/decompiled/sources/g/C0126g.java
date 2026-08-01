package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126g implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2430a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2431b;

    public C0126g(h0.d dVar) {
        b1.d.e(dVar, "registry");
        this.f2431b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f2430a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0128i) this.f2431b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2431b));
                return bundle2;
        }
    }

    public C0126g(AbstractActivityC0128i abstractActivityC0128i) {
        this.f2431b = abstractActivityC0128i;
    }
}
