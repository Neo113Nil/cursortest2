package defpackage;

import android.os.Bundle;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class rd implements qb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qb0
    public final Bundle a() {
        k50[] k50VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                wd wdVar = ((b) obj).n;
                wdVar.getClass();
                LinkedHashMap linkedHashMap = wdVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(wdVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(wdVar.g));
                return bundle;
            case 1:
                u3 u3Var = (u3) obj;
                while (b.j(((xp) u3Var.z.g).r, gx.CREATED)) {
                }
                u3Var.A.d(fx.ON_STOP);
                return new Bundle();
            case 2:
                return ((c) obj).T();
            default:
                j90 j90Var = (j90) obj;
                for (Map.Entry entry : vz.b0((LinkedHashMap) j90Var.e).entrySet()) {
                    j90Var.b(((ef0) entry.getValue()).h0(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : vz.b0((LinkedHashMap) j90Var.c).entrySet()) {
                    j90Var.b(((qb0) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) j90Var.b;
                if (linkedHashMap2.isEmpty()) {
                    k50VarArr = new k50[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        arrayList.add(new k50((String) entry3.getKey(), entry3.getValue()));
                    }
                    k50VarArr = (k50[]) arrayList.toArray(new k50[0]);
                }
                return bi.j((k50[]) Arrays.copyOf(k50VarArr, k50VarArr.length));
        }
    }
}
