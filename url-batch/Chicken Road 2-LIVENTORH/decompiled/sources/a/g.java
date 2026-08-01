package a;

import android.os.Bundle;
import androidx.fragment.app.k0;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements g1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23b;

    public /* synthetic */ g(int i, Object obj) {
        this.f22a = i;
        this.f23b = obj;
    }

    @Override // g1.b
    public final Bundle a() {
        switch (this.f22a) {
            case 0:
                g.j jVar = (g.j) this.f23b;
                Bundle bundle = new Bundle();
                l lVar = jVar.f50m;
                lVar.getClass();
                LinkedHashMap linkedHashMap = lVar.f39b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(lVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lVar.f43g));
                return bundle;
            case 1:
                g.j jVar2 = (g.j) this.f23b;
                while (g.j.l(((androidx.fragment.app.w) jVar2.f1650y.f81g).f570q)) {
                }
                jVar2.f1651z.d(androidx.lifecycle.l.ON_STOP);
                return new Bundle();
            default:
                return ((k0) this.f23b).R();
        }
    }
}
