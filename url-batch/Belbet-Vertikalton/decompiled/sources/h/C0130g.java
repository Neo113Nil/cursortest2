package h;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130g implements j0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2799a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2800b;

    public C0130g(j0.d dVar) {
        j1.h.e(dVar, "registry");
        this.f2800b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // j0.c
    public final Bundle a() {
        switch (this.f2799a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0132i) this.f2800b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2800b));
                return bundle2;
        }
    }

    public C0130g(AbstractActivityC0132i abstractActivityC0132i) {
        this.f2800b = abstractActivityC0132i;
    }
}
