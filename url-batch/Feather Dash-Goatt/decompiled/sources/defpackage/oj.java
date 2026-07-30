package defpackage;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.feathherdashh.dashgame.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class oj implements c61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c61
    public final Bundle a() {
        Pair[] pairArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Bundle bundle = new Bundle();
                rj rjVar = ((MainActivity) obj).o;
                rjVar.getClass();
                HashMap hashMap = rjVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(rjVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) rjVar.g.clone());
                return bundle;
            case 1:
                Map c = ((u51) obj).c();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : c.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                mc mcVar = (mc) obj;
                for (Map.Entry entry2 : ik0.e((LinkedHashMap) mcVar.h).entrySet()) {
                    mcVar.m(((be1) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : ik0.e((LinkedHashMap) mcVar.e).entrySet()) {
                    mcVar.m(((c61) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) mcVar.d;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return yr1.D((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
