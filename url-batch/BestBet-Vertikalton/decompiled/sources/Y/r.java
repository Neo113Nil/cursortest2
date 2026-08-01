package Y;

import android.os.Bundle;
import androidx.lifecycle.EnumC0071l;
import g.AbstractActivityC0128i;
import j0.InterfaceC0169c;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC0169c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1483b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1482a = i;
        this.f1483b = obj;
    }

    @Override // j0.InterfaceC0169c
    public final Bundle a() {
        switch (this.f1482a) {
            case 0:
                AbstractActivityC0128i abstractActivityC0128i = (AbstractActivityC0128i) this.f1483b;
                while (AbstractActivityC0128i.n(((C0053u) abstractActivityC0128i.f2672s.f6b).d)) {
                }
                abstractActivityC0128i.f2673t.d(EnumC0071l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0128i abstractActivityC0128i2 = (AbstractActivityC0128i) this.f1483b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0128i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1571b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1575g));
                return bundle;
            default:
                return ((I) this.f1483b).R();
        }
    }
}
