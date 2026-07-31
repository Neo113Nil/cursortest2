package androidx.lifecycle;

import android.os.Bundle;
import b.AbstractActivityC0319o;
import b.C0317m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements y1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5177b;

    public /* synthetic */ L(int i3, Object obj) {
        this.f5176a = i3;
        this.f5177b = obj;
    }

    @Override // y1.d
    public final Bundle a() {
        switch (this.f5176a) {
            case 0:
                return M.a((M) this.f5177b);
            case 1:
                AbstractActivityC0319o abstractActivityC0319o = (AbstractActivityC0319o) this.f5177b;
                f2.j.f(abstractActivityC0319o, "this$0");
                Bundle bundle = new Bundle();
                C0317m c0317m = abstractActivityC0319o.f5321l;
                c0317m.getClass();
                LinkedHashMap linkedHashMap = c0317m.f5304b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0317m.f5306d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0317m.f5309g));
                return bundle;
            default:
                Map a3 = ((R.l) this.f5177b).a();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : ((LinkedHashMap) a3).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
