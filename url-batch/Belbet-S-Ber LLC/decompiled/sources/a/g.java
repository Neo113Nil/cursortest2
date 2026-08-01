package a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements h1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23b;

    public /* synthetic */ g(int i, Object obj) {
        this.f22a = i;
        this.f23b = obj;
    }

    @Override // h1.b
    public final Bundle a() {
        switch (this.f22a) {
            case 0:
                g.i iVar = (g.i) this.f23b;
                Bundle bundle = new Bundle();
                l lVar = iVar.f52m;
                lVar.getClass();
                LinkedHashMap linkedHashMap = lVar.f39b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(lVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lVar.f43g));
                return bundle;
            case 1:
                g.i iVar2 = (g.i) this.f23b;
                while (g.i.l(((androidx.fragment.app.w) iVar2.f1527z.f79g).f676r)) {
                }
                iVar2.A.d(androidx.lifecycle.l.ON_STOP);
                return new Bundle();
            default:
                return ((androidx.fragment.app.k0) this.f23b).U();
        }
    }
}
