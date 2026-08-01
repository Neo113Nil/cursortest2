package k4;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;
import wd.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5388a;

    public d(int i3) {
        switch (i3) {
            case 1:
                this.f5388a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 2:
                this.f5388a = new LinkedHashMap();
                break;
            default:
                this.f5388a = new LinkedHashMap();
                break;
        }
    }

    public void a(h hVar, Function1 function1) {
        function1.getClass();
        LinkedHashMap linkedHashMap = this.f5388a;
        if (!linkedHashMap.containsKey(hVar)) {
            linkedHashMap.put(hVar, new f(hVar, function1));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + hVar.b() + '.').toString());
    }

    public void b(c5.a aVar) {
        aVar.getClass();
        int i3 = aVar.f1803a;
        int i10 = aVar.f1804b;
        Integer valueOf = Integer.valueOf(i3);
        LinkedHashMap linkedHashMap = this.f5388a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i10)) + " with " + aVar);
        }
        treeMap.put(Integer.valueOf(i10), aVar);
    }

    public c c() {
        Collection values = this.f5388a.values();
        values.getClass();
        f[] fVarArr = (f[]) values.toArray(new f[0]);
        return new c((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
