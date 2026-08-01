package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131g implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2390a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2391b;

    public C0131g(h0.d dVar) {
        b1.d.e(dVar, "registry");
        this.f2391b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f2390a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0133i) this.f2391b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2391b));
                return bundle2;
        }
    }

    public C0131g(AbstractActivityC0133i abstractActivityC0133i) {
        this.f2391b = abstractActivityC0133i;
    }
}
