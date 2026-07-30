package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class w8 {
    public static final v8 PxuCJdSBwIXG = new v8("");

    public static final List PxuCJdSBwIXG(v8 v8Var, int i, int i2, wnqUPcAvl7HT wnqupcavl7ht) {
        List list;
        if (i == i2 || (list = v8Var.rtx2ld2ELZv4) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= v8Var.OPXfSBeufaJ8.length()) {
            if (wnqupcavl7ht == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) wnqupcavl7ht.OPXfSBeufaJ8(((u8) obj).PxuCJdSBwIXG)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            u8 u8Var = (u8) list.get(i3);
            if (wnqupcavl7ht != null ? ((Boolean) wnqupcavl7ht.OPXfSBeufaJ8(u8Var.PxuCJdSBwIXG)).booleanValue() : true) {
                int i4 = u8Var.lS5Rgt96tfkO;
                int i5 = u8Var.TSizfFm2Yiuu;
                if (lS5Rgt96tfkO(i, i2, i4, i5)) {
                    arrayList2.add(new u8(ng0.wdg6QnbFHrFF(u8Var.lS5Rgt96tfkO, i, i2) - i, ng0.wdg6QnbFHrFF(i5, i, i2) - i, (p8) u8Var.PxuCJdSBwIXG, u8Var.Y1f8riQaR6yg));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean lS5Rgt96tfkO(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
