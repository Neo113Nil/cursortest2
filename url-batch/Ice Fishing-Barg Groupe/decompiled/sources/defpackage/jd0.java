package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jd0 {
    public final ArrayList PxuCJdSBwIXG;

    public jd0(int i) {
        switch (i) {
            case 1:
                this.PxuCJdSBwIXG = new ArrayList(20);
                break;
            default:
                this.PxuCJdSBwIXG = new ArrayList();
                new HashMap();
                new HashMap();
                break;
        }
    }

    public hj0 PxuCJdSBwIXG() {
        return new hj0((String[]) this.PxuCJdSBwIXG.toArray(new String[0]));
    }

    public void TSizfFm2Yiuu(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.PxuCJdSBwIXG;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public List lS5Rgt96tfkO() {
        ArrayList arrayList;
        if (this.PxuCJdSBwIXG.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.PxuCJdSBwIXG) {
            arrayList = new ArrayList(this.PxuCJdSBwIXG);
        }
        return arrayList;
    }
}
