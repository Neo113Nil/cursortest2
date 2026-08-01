package X;

import android.os.Bundle;
import androidx.lifecycle.EnumC0068l;
import g.AbstractActivityC0125i;
import h0.InterfaceC0131c;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC0131c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f993b;

    public /* synthetic */ r(int i, Object obj) {
        this.f992a = i;
        this.f993b = obj;
    }

    @Override // h0.InterfaceC0131c
    public final Bundle a() {
        switch (this.f992a) {
            case 0:
                AbstractActivityC0125i abstractActivityC0125i = (AbstractActivityC0125i) this.f993b;
                while (AbstractActivityC0125i.n(((C0051u) abstractActivityC0125i.f2323s.f59b).h)) {
                }
                abstractActivityC0125i.f2324t.d(EnumC0068l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0125i abstractActivityC0125i2 = (AbstractActivityC0125i) this.f993b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0125i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1050b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1054g));
                return bundle;
            default:
                return ((I) this.f993b).R();
        }
    }
}
