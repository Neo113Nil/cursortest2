package Y;

import android.os.Bundle;
import androidx.lifecycle.EnumC0072l;
import g.AbstractActivityC0108i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements i0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1151b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1150a = i;
        this.f1151b = obj;
    }

    @Override // i0.c
    public final Bundle a() {
        switch (this.f1150a) {
            case 0:
                AbstractActivityC0108i abstractActivityC0108i = (AbstractActivityC0108i) this.f1151b;
                while (AbstractActivityC0108i.n(((C0054u) abstractActivityC0108i.f2255s.f80b).d)) {
                }
                abstractActivityC0108i.f2256t.d(EnumC0072l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0108i abstractActivityC0108i2 = (AbstractActivityC0108i) this.f1151b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0108i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1197b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1201g));
                return bundle;
            default:
                return ((I) this.f1151b).R();
        }
    }
}
