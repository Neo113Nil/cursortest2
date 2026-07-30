package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fb1 extends ab1 {
    public final ArrayList OPXfSBeufaJ8;
    public final vc1 RAsUl2FVSrh6;
    public final Object rtx2ld2ELZv4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb1(vc1 vc1Var, Object obj, Map map) {
        super(vc1Var.lS5Rgt96tfkO(uc1.PxuCJdSBwIXG(kb1.class)), null, map);
        vc1Var.getClass();
        obj.getClass();
        map.getClass();
        vc1.Companion.getClass();
        this.OPXfSBeufaJ8 = new ArrayList();
        this.RAsUl2FVSrh6 = vc1Var;
        this.rtx2ld2ELZv4 = obj;
    }

    public final eb1 TSizfFm2Yiuu() {
        int hashCode;
        eb1 eb1Var = (eb1) super.PxuCJdSBwIXG();
        ArrayList arrayList = this.OPXfSBeufaJ8;
        arrayList.getClass();
        id0 id0Var = eb1Var.x50lh2ztY7Y5;
        id0Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            za1 za1Var = (za1) obj;
            if (za1Var != null) {
                s82 s82Var = (s82) id0Var.Y1f8riQaR6yg;
                eb1 eb1Var2 = (eb1) id0Var.TSizfFm2Yiuu;
                cb1 cb1Var = eb1Var2.OPXfSBeufaJ8;
                cb1 cb1Var2 = za1Var.OPXfSBeufaJ8;
                int i2 = cb1Var2.lS5Rgt96tfkO;
                String str = (String) cb1Var2.a92UlCVFR9N8;
                if (i2 == 0 && str == null) {
                    u9.XL4ISE6Oc65B("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) cb1Var.a92UlCVFR9N8;
                if (str2 != null && cs0.wdg6QnbFHrFF(str, str2)) {
                    u9.dgRBjINgWbAK("Destination ", za1Var, " cannot have the same route as graph ", eb1Var2);
                    return null;
                }
                if (i2 == cb1Var.lS5Rgt96tfkO) {
                    u9.dgRBjINgWbAK("Destination ", za1Var, " cannot have the same id as graph ", eb1Var2);
                    return null;
                }
                za1 za1Var2 = (za1) s82Var.lS5Rgt96tfkO(i2);
                if (za1Var2 == za1Var) {
                    continue;
                } else {
                    if (za1Var.wdg6QnbFHrFF != null) {
                        u9.rtx2ld2ELZv4("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (za1Var2 != null) {
                        za1Var2.wdg6QnbFHrFF = null;
                    }
                    za1Var.wdg6QnbFHrFF = eb1Var2;
                    s82Var.Y1f8riQaR6yg(cb1Var2.lS5Rgt96tfkO, za1Var);
                }
            }
        }
        Object obj2 = this.rtx2ld2ELZv4;
        if (obj2 == null) {
            if (this.TSizfFm2Yiuu != null) {
                u9.rtx2ld2ELZv4("You must set a start destination route");
                return null;
            }
            u9.rtx2ld2ELZv4("You must set a start destination id");
            return null;
        }
        KSerializer serializer = SerializersKt.serializer(bu1.PxuCJdSBwIXG(obj2.getClass()));
        serializer.getClass();
        int EcgxDIVH5in8 = ni0.EcgxDIVH5in8(serializer);
        za1 wdg6QnbFHrFF = id0Var.wdg6QnbFHrFF(EcgxDIVH5in8);
        if (wdg6QnbFHrFF == null) {
            u9.wdg6QnbFHrFF("Cannot find startDestination ", serializer.getDescriptor().lS5Rgt96tfkO(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
            return null;
        }
        Map TSizfFm2Yiuu = wdg6QnbFHrFF.TSizfFm2Yiuu();
        LinkedHashMap linkedHashMap = new LinkedHashMap(w41.i68hK7ahKtgp(TSizfFm2Yiuu.size()));
        for (Map.Entry entry : TSizfFm2Yiuu.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((v91) entry.getValue()).PxuCJdSBwIXG);
        }
        String S9EYkSpbGuxq = ni0.S9EYkSpbGuxq(obj2, linkedHashMap);
        eb1 eb1Var3 = (eb1) id0Var.TSizfFm2Yiuu;
        if (S9EYkSpbGuxq != null) {
            if (S9EYkSpbGuxq.equals((String) eb1Var3.OPXfSBeufaJ8.a92UlCVFR9N8)) {
                u9.dgRBjINgWbAK("Start destination ", S9EYkSpbGuxq, " cannot use the same route as the graph ", eb1Var3);
            } else if (ia2.fRTaYY6FBZcX(S9EYkSpbGuxq)) {
                u9.XL4ISE6Oc65B("Cannot have an empty start destination route");
            } else {
                za1.Companion.getClass();
                hashCode = "android-app://androidx.navigation/".concat(S9EYkSpbGuxq).hashCode();
            }
            id0Var.lS5Rgt96tfkO = EcgxDIVH5in8;
            return eb1Var;
        }
        hashCode = 0;
        id0Var.lS5Rgt96tfkO = hashCode;
        id0Var.a92UlCVFR9N8 = S9EYkSpbGuxq;
        id0Var.lS5Rgt96tfkO = EcgxDIVH5in8;
        return eb1Var;
    }
}
