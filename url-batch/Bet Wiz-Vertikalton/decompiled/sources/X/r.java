package X;

import android.os.Bundle;
import androidx.lifecycle.EnumC0069l;
import g.AbstractActivityC0132i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1104b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1103a = i;
        this.f1104b = obj;
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f1103a) {
            case 0:
                AbstractActivityC0132i abstractActivityC0132i = (AbstractActivityC0132i) this.f1104b;
                while (AbstractActivityC0132i.n(((C0051u) abstractActivityC0132i.f2454s.f67b).h)) {
                }
                abstractActivityC0132i.f2455t.d(EnumC0069l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0132i abstractActivityC0132i2 = (AbstractActivityC0132i) this.f1104b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0132i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1154b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1158g));
                return bundle;
            default:
                return ((I) this.f1104b).R();
        }
    }
}
