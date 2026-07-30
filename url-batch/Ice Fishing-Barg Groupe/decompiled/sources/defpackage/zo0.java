package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zo0 {
    public final LinkedHashMap PxuCJdSBwIXG;

    public zo0(int i) {
        switch (i) {
            case 1:
                this.PxuCJdSBwIXG = new LinkedHashMap(0, 0.75f, true);
                break;
            case 2:
                this.PxuCJdSBwIXG = new LinkedHashMap();
                break;
            default:
                this.PxuCJdSBwIXG = new LinkedHashMap();
                break;
        }
    }

    public void PxuCJdSBwIXG(ck ckVar, le0 le0Var) {
        le0Var.getClass();
        LinkedHashMap linkedHashMap = this.PxuCJdSBwIXG;
        if (linkedHashMap.containsKey(ckVar)) {
            u9.e9gEMXR7LXtO(o0.x50lh2ztY7Y5("A `initializer` with the same `clazz` has already been added: ", ckVar.lS5Rgt96tfkO(), "."));
        } else {
            linkedHashMap.put(ckVar, new fr2(ckVar, le0Var));
        }
    }

    public c TSizfFm2Yiuu() {
        Collection values = this.PxuCJdSBwIXG.values();
        values.getClass();
        fr2[] fr2VarArr = (fr2[]) values.toArray(new fr2[0]);
        return new c(2, (fr2[]) Arrays.copyOf(fr2VarArr, fr2VarArr.length));
    }

    public void lS5Rgt96tfkO(vv vvVar) {
        vvVar.getClass();
        LinkedHashMap linkedHashMap = this.PxuCJdSBwIXG;
        Object obj = linkedHashMap.get(1);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(1, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(2)) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(2) + " with " + vvVar);
        }
        treeMap.put(2, vvVar);
    }
}
