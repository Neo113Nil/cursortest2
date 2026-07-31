package com.bytedance.adsdk.zmn.fs.zn.zmn;

import com.bytedance.adsdk.zmn.fs.fs.zmn.doe;
import java.util.Deque;

/* loaded from: classes10.dex */
public class zn extends hhw {
    @Override // com.bytedance.adsdk.zmn.fs.zn.zmn.hhw
    public int zmn(String str, int i, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque, com.bytedance.adsdk.zmn.fs.zn.zmn zmnVar) {
        char zmn = zmn(i, str);
        if (!com.bytedance.adsdk.zmn.fs.btk.zmn.fs(zmn) && zmn != '$') {
            return zmnVar.zmn(str, i, deque);
        }
        return zmn(str, i, deque);
    }

    private int zmn(String str, int i, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char zmn = zmn(i2, str);
            if (!com.bytedance.adsdk.zmn.fs.btk.zmn.fs(zmn) && !com.bytedance.adsdk.zmn.fs.btk.zmn.zn(zmn) && '.' != zmn && '[' != zmn && ']' != zmn && '_' != zmn && '$' != zmn) {
                break;
            }
            i3++;
        }
        String substring = str.substring(i, i2);
        if (com.bytedance.adsdk.zmn.fs.fb.zmn.zmn(substring) != null) {
            deque.push(new com.bytedance.adsdk.zmn.fs.fs.zmn.nps(substring));
        } else {
            deque.push(new doe(substring));
        }
        return i2;
    }
}
