package Z;

import android.os.Bundle;
import androidx.lifecycle.EnumC0069l;
import g.AbstractActivityC0110i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements j0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1213b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1212a = i;
        this.f1213b = obj;
    }

    @Override // j0.c
    public final Bundle a() {
        switch (this.f1212a) {
            case 0:
                AbstractActivityC0110i abstractActivityC0110i = (AbstractActivityC0110i) this.f1213b;
                while (AbstractActivityC0110i.p(((C0050u) abstractActivityC0110i.f2317s.f170b).d)) {
                }
                abstractActivityC0110i.f2318t.d(EnumC0069l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0110i abstractActivityC0110i2 = (AbstractActivityC0110i) this.f1213b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0110i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1252b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1256g));
                return bundle;
            default:
                return ((I) this.f1213b).R();
        }
    }
}
