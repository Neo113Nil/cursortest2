package Z;

import android.os.Bundle;
import androidx.lifecycle.EnumC0078l;
import g.AbstractActivityC0106i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements j0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1204b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1203a = i;
        this.f1204b = obj;
    }

    @Override // j0.c
    public final Bundle a() {
        switch (this.f1203a) {
            case 0:
                AbstractActivityC0106i abstractActivityC0106i = (AbstractActivityC0106i) this.f1204b;
                while (AbstractActivityC0106i.n(((C0053u) abstractActivityC0106i.f2335s.f122b).f1212h)) {
                }
                abstractActivityC0106i.f2336t.d(EnumC0078l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0106i abstractActivityC0106i2 = (AbstractActivityC0106i) this.f1204b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0106i2.f1256h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1242b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1246g));
                return bundle;
            default:
                return ((I) this.f1204b).R();
        }
    }
}
