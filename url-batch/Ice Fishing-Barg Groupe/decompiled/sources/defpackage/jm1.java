package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jm1 {
    public static ArrayList PxuCJdSBwIXG(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((fr1) obj) != fr1.OPXfSBeufaJ8) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(al.KZw9XyiywG4x(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((fr1) obj2).rtx2ld2ELZv4);
        }
        return arrayList2;
    }

    public static byte[] lS5Rgt96tfkO(List list) {
        list.getClass();
        yf yfVar = new yf();
        ArrayList PxuCJdSBwIXG = PxuCJdSBwIXG(list);
        int size = PxuCJdSBwIXG.size();
        int i = 0;
        while (i < size) {
            Object obj = PxuCJdSBwIXG.get(i);
            i++;
            String str = (String) obj;
            yfVar.Pf0ThKz3j5YS(str.length());
            yfVar.xbgXKYA2cIfu(str);
        }
        return yfVar.RfyTYNmI9Srp(yfVar.OPXfSBeufaJ8);
    }
}
