package defpackage;

import android.os.Bundle;
import com.ice.fishing.grenza.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class zm implements lz1 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ Object lS5Rgt96tfkO;

    public /* synthetic */ zm(int i, Object obj) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
    }

    @Override // defpackage.lz1
    public final Bundle PxuCJdSBwIXG() {
        vi1[] vi1VarArr;
        int i = this.PxuCJdSBwIXG;
        Object obj = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                fn fnVar = ((MainActivity) obj).QrzZRwfaDlRX;
                fnVar.getClass();
                LinkedHashMap linkedHashMap = fnVar.lS5Rgt96tfkO;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(fnVar.TSizfFm2Yiuu));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(fnVar.a92UlCVFR9N8));
                return bundle;
            case 1:
                Map e9gEMXR7LXtO = ((az1) obj).e9gEMXR7LXtO();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : e9gEMXR7LXtO.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                xb xbVar = (xb) obj;
                for (Map.Entry entry2 : w41.wLFCmsViZrNT((LinkedHashMap) xbVar.e9gEMXR7LXtO).entrySet()) {
                    xbVar.QrzZRwfaDlRX(((l92) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : w41.wLFCmsViZrNT((LinkedHashMap) xbVar.TSizfFm2Yiuu).entrySet()) {
                    xbVar.QrzZRwfaDlRX(((lz1) entry3.getValue()).PxuCJdSBwIXG(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) xbVar.lS5Rgt96tfkO;
                if (linkedHashMap2.isEmpty()) {
                    vi1VarArr = new vi1[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new vi1((String) entry4.getKey(), entry4.getValue()));
                    }
                    vi1VarArr = (vi1[]) arrayList.toArray(new vi1[0]);
                }
                return mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(vi1VarArr, vi1VarArr.length));
        }
    }
}
