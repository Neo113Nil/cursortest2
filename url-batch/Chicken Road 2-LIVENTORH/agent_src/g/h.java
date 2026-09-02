package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h implements g1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1643a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1644b;

    public h(g1.c cVar) {
        this.f1643a = 1;
        this.f1644b = new LinkedHashSet();
        cVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // g1.b
    public final Bundle a() {
        switch (this.f1643a) {
            case 0:
                Bundle bundle = new Bundle();
                ((j) this.f1644b).k().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f1644b));
                return bundle2;
        }
    }

    public h(j jVar) {
        this.f1643a = 0;
        this.f1644b = jVar;
    }
}
