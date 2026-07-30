package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class or2 {
    public final LinkedHashMap PxuCJdSBwIXG = new LinkedHashMap();

    public final void PxuCJdSBwIXG() {
        LinkedHashMap linkedHashMap = this.PxuCJdSBwIXG;
        Map wLFCmsViZrNT = w41.wLFCmsViZrNT(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = wLFCmsViZrNT.values().iterator();
        while (it.hasNext()) {
            ((dr2) it.next()).lS5Rgt96tfkO();
        }
    }

    public final String toString() {
        String TSizfFm2Yiuu = bu1.PxuCJdSBwIXG(or2.class).TSizfFm2Yiuu();
        if (TSizfFm2Yiuu == null) {
            TSizfFm2Yiuu = "ViewModelStore";
        }
        int hashCode = hashCode();
        ov2.RfyTYNmI9Srp(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        return TSizfFm2Yiuu + "@" + num + "(keys=" + zk.l(this.PxuCJdSBwIXG.keySet()) + ")";
    }
}
