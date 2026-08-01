package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class qb implements e10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e10
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ub ubVar = ((c3) obj).m;
                ubVar.getClass();
                LinkedHashMap linkedHashMap = ubVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ubVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ubVar.g));
                return bundle;
            case 1:
                c3 c3Var = (c3) obj;
                while (c3.k(((ok) c3Var.z.g).r)) {
                }
                c3Var.A.d(up.ON_STOP);
                return new Bundle();
            default:
                return ((bl) obj).T();
        }
    }
}
