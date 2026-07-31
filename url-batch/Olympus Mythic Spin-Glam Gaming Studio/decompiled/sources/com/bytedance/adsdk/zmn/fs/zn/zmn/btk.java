package com.bytedance.adsdk.zmn.fs.zn.zmn;

import java.util.Deque;

/* loaded from: classes14.dex */
public class btk extends hhw {
    @Override // com.bytedance.adsdk.zmn.fs.zn.zmn.hhw
    public int zmn(String str, int i, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque, com.bytedance.adsdk.zmn.fs.zn.zmn zmnVar) {
        char zmn;
        int i2 = i;
        while (true) {
            zmn = zmn(i2, str);
            if (!com.bytedance.adsdk.zmn.fs.btk.zmn.fs(zmn) && !com.bytedance.adsdk.zmn.fs.btk.zmn.zn(zmn)) {
                break;
            }
            i2++;
        }
        if (zmn != '(') {
            return zmnVar.zmn(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.zmn.fs.fs.zmn.iv(str.substring(i, i2)));
        return i2 + 1;
    }
}
