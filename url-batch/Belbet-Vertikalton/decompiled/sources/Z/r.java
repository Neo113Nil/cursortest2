package Z;

import android.os.Bundle;
import androidx.lifecycle.EnumC0077l;
import h.AbstractActivityC0132i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements j0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1632b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1631a = i;
        this.f1632b = obj;
    }

    @Override // j0.c
    public final Bundle a() {
        switch (this.f1631a) {
            case 0:
                AbstractActivityC0132i abstractActivityC0132i = (AbstractActivityC0132i) this.f1632b;
                while (AbstractActivityC0132i.n(((C0056u) abstractActivityC0132i.f2802s.f145b).e)) {
                }
                abstractActivityC0132i.f2803t.d(EnumC0077l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0132i abstractActivityC0132i2 = (AbstractActivityC0132i) this.f1632b;
                Bundle bundle = new Bundle();
                b.j jVar = abstractActivityC0132i2.f2183h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f2169b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.f2171d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f2173g));
                return bundle;
            default:
                return ((I) this.f1632b).R();
        }
    }
}
