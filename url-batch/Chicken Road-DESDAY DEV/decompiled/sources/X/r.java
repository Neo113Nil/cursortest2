package X;

import android.os.Bundle;
import androidx.lifecycle.EnumC0072l;
import g.AbstractActivityC0133i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1064b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1063a = i;
        this.f1064b = obj;
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f1063a) {
            case 0:
                AbstractActivityC0133i abstractActivityC0133i = (AbstractActivityC0133i) this.f1064b;
                while (AbstractActivityC0133i.n(((C0051u) abstractActivityC0133i.f2393s.f66b).h)) {
                }
                abstractActivityC0133i.f2394t.d(EnumC0072l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0133i abstractActivityC0133i2 = (AbstractActivityC0133i) this.f1064b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0133i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1110b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1114g));
                return bundle;
            default:
                return ((I) this.f1064b).R();
        }
    }
}
