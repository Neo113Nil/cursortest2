package com.bytedance.sdk.component.adexpress.dynamic.btk;

import com.bytedance.sdk.component.adexpress.dynamic.btk.fs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class iv {
    public static float zmn(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    public static List<fs.zmn> zmn(float f, List<fs.zmn> list) {
        ArrayList<fs.zmn> arrayList = new ArrayList();
        Iterator<fs.zmn> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((fs.zmn) it.next().clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (fs.zmn zmnVar : arrayList) {
            if (zmnVar.fs) {
                i = (int) (i + zmnVar.zmn);
            } else {
                i2 = (int) (i2 + zmnVar.zmn);
                z = false;
            }
        }
        if (z && f > i) {
            return arrayList;
        }
        float f2 = i;
        float f3 = f < f2 ? f / f2 : 1.0f;
        float f4 = f > f2 ? (f - f2) / i2 : 0.0f;
        if (f4 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (fs.zmn zmnVar2 : arrayList) {
                if (!zmnVar2.fs) {
                    float f5 = zmnVar2.zn;
                    if (f5 != 0.0f && zmnVar2.zmn * f4 > f5) {
                        zmnVar2.zmn = f5;
                        zmnVar2.fs = true;
                        z2 = true;
                    }
                }
                arrayList2.add(zmnVar2);
            }
            if (z2) {
                return zmn(f, arrayList2);
            }
        }
        int i3 = 0;
        for (fs.zmn zmnVar3 : arrayList) {
            if (zmnVar3.fs) {
                zmnVar3.zmn = zmn(zmnVar3.zmn * f3);
            } else {
                zmnVar3.zmn = zmn(zmnVar3.zmn * f4);
            }
            i3 = (int) (i3 + zmnVar3.zmn);
        }
        float f6 = i3;
        if (f6 < f) {
            float f7 = f - f6;
            for (int i4 = 0; i4 < arrayList.size() && f7 > 0.0f; i4 = (i4 + 1) % arrayList.size()) {
                fs.zmn zmnVar4 = (fs.zmn) arrayList.get(i4);
                if ((f < f2 && zmnVar4.fs) || (f > f2 && !zmnVar4.fs)) {
                    zmnVar4.zmn += 0.0625f;
                    f7 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
