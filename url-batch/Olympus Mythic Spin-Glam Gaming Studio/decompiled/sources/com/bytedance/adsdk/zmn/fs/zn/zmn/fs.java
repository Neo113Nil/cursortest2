package com.bytedance.adsdk.zmn.fs.zn.zmn;

import com.bytedance.adsdk.zmn.fs.fs.zmn.iqz;
import java.util.Deque;

/* loaded from: classes3.dex */
public class fs extends hhw {
    @Override // com.bytedance.adsdk.zmn.fs.zn.zmn.hhw
    public int zmn(String str, int i, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque, com.bytedance.adsdk.zmn.fs.zn.zmn zmnVar) {
        if ('\'' != zmn(i, str)) {
            return zmnVar.zmn(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && zmn(i3, str) != '\'') {
            i3++;
        }
        if (zmn(i3, str) != '\'') {
            throw new com.bytedance.adsdk.zmn.zmn.zmn("String expression not surrounded by '", str.substring(i));
        }
        deque.push(new iqz(str.substring(i2, i3)));
        return i3 + 1;
    }
}
