package Y;

import android.os.Bundle;
import androidx.lifecycle.EnumC0071l;
import g.AbstractActivityC0106i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements i0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1124b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1123a = i;
        this.f1124b = obj;
    }

    @Override // i0.c
    public final Bundle a() {
        switch (this.f1123a) {
            case 0:
                AbstractActivityC0106i abstractActivityC0106i = (AbstractActivityC0106i) this.f1124b;
                while (AbstractActivityC0106i.n(((C0054u) abstractActivityC0106i.f2215s.f115b).h)) {
                }
                abstractActivityC0106i.f2216t.d(EnumC0071l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0106i abstractActivityC0106i2 = (AbstractActivityC0106i) this.f1124b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0106i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1167b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1171g));
                return bundle;
            default:
                return ((I) this.f1124b).R();
        }
    }
}
