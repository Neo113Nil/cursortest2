package X;

import android.os.Bundle;
import androidx.lifecycle.EnumC0071l;
import g.AbstractActivityC0136i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1130b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1129a = i;
        this.f1130b = obj;
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f1129a) {
            case 0:
                AbstractActivityC0136i abstractActivityC0136i = (AbstractActivityC0136i) this.f1130b;
                while (AbstractActivityC0136i.n(((C0051u) abstractActivityC0136i.f2450s.f30b).d)) {
                }
                abstractActivityC0136i.f2451t.d(EnumC0071l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0136i abstractActivityC0136i2 = (AbstractActivityC0136i) this.f1130b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0136i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1191b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1195g));
                return bundle;
            default:
                return ((I) this.f1130b).R();
        }
    }
}
