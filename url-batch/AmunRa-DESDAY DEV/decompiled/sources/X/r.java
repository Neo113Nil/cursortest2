package X;

import android.os.Bundle;
import androidx.lifecycle.EnumC0070l;
import g.AbstractActivityC0131i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1032b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1031a = i;
        this.f1032b = obj;
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f1031a) {
            case 0:
                AbstractActivityC0131i abstractActivityC0131i = (AbstractActivityC0131i) this.f1032b;
                while (AbstractActivityC0131i.n(((C0051u) abstractActivityC0131i.f2392s.f64b).f1038k)) {
                }
                abstractActivityC0131i.f2393t.d(EnumC0070l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0131i abstractActivityC0131i2 = (AbstractActivityC0131i) this.f1032b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0131i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1085b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1089g));
                return bundle;
            default:
                return ((I) this.f1032b).R();
        }
    }
}
