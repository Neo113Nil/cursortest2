package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130g implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2451a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2452b;

    public C0130g(h0.d dVar) {
        e1.d.e(dVar, "registry");
        this.f2452b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f2451a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0132i) this.f2452b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2452b));
                return bundle2;
        }
    }

    public C0130g(AbstractActivityC0132i abstractActivityC0132i) {
        this.f2452b = abstractActivityC0132i;
    }
}
