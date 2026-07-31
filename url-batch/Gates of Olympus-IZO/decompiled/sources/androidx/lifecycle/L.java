package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3976b;

    public /* synthetic */ L(int i3, Object obj) {
        this.f3975a = i3;
        this.f3976b = obj;
    }

    @Override // u1.d
    public final Bundle a() {
        switch (this.f3975a) {
            case 0:
                return M.a((M) this.f3976b);
            case 1:
                b.o oVar = (b.o) this.f3976b;
                Z1.i.f(oVar, "this$0");
                Bundle bundle = new Bundle();
                b.m mVar = oVar.f4185l;
                mVar.getClass();
                LinkedHashMap linkedHashMap = mVar.f4168b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(mVar.f4170d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(mVar.f4173g));
                return bundle;
            default:
                Map b2 = ((R.l) this.f3976b).b();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : ((LinkedHashMap) b2).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
