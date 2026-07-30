package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class na1 extends dr2 {
    public static final ma1 Companion = new ma1();
    public final LinkedHashMap lS5Rgt96tfkO = new LinkedHashMap();

    @Override // defpackage.dr2
    public final void Y1f8riQaR6yg() {
        LinkedHashMap linkedHashMap = this.lS5Rgt96tfkO;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((or2) it.next()).PxuCJdSBwIXG();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        ov2.RfyTYNmI9Srp(16);
        sb.append(jh0.nLZGh9p8gVSu(16, identityHashCode & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.lS5Rgt96tfkO.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
