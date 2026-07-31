package com.bytedance.adsdk.zmn.fs.zn.zmn;

import com.bytedance.adsdk.zmn.fs.fs.zmn.cyb;
import java.util.Deque;

/* loaded from: classes10.dex */
public class zg extends hhw {
    @Override // com.bytedance.adsdk.zmn.fs.zn.zmn.hhw
    public int zmn(String str, int i, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque, com.bytedance.adsdk.zmn.fs.zn.zmn zmnVar) {
        if (!com.bytedance.adsdk.zmn.fs.btk.zmn.fb(zmn(i, str))) {
            return zmnVar.zmn(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{zmn(i, str), zmn(i2, str)});
        if (com.bytedance.adsdk.zmn.fs.fb.zn.zmn(str2) != null) {
            deque.push(new cyb(com.bytedance.adsdk.zmn.fs.fb.zn.zmn(str2)));
            return i + 2;
        }
        String valueOf = String.valueOf(zmn(i, str));
        if (com.bytedance.adsdk.zmn.fs.fb.zn.zmn(valueOf) != null) {
            deque.push(new cyb(com.bytedance.adsdk.zmn.fs.fb.zn.zmn(valueOf)));
            return i2;
        }
        throw new IllegalArgumentException("Unrecognized:" + valueOf + "examine:" + str.substring(0, i));
    }
}
