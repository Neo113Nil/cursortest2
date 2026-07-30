package l0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class f {
    private List<Integer> list;

    public f(List<Integer> list) {
        this.list = list;
    }

    public List<Float> getList() {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = this.list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(it.next().intValue()));
        }
        return arrayList;
    }
}
