package com.bytedance.adsdk.zmn.fs.zn.zmn;

import com.bytedance.adsdk.zmn.fs.fs.zmn.cn;
import java.util.Deque;

/* loaded from: classes3.dex */
public class nps extends hhw {
    private boolean zmn(String str, int i, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque) {
        if ('-' == zmn(i, str)) {
            if (deque.peek() != null && !com.bytedance.adsdk.zmn.fs.fb.zn.zmn(deque.peek().zmn())) {
                return false;
            }
            if (com.bytedance.adsdk.zmn.fs.btk.zmn.zn(zmn(i + 1, str))) {
                return true;
            }
            throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
        }
        return com.bytedance.adsdk.zmn.fs.btk.zmn.zn(zmn(i, str));
    }

    @Override // com.bytedance.adsdk.zmn.fs.zn.zmn.hhw
    public int zmn(String str, int i, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque, com.bytedance.adsdk.zmn.fs.zn.zmn zmnVar) {
        char zmn;
        if (!zmn(str, i, deque)) {
            return zmnVar.zmn(str, i, deque);
        }
        int i2 = zmn(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            zmn = zmn(i2, str);
            if (com.bytedance.adsdk.zmn.fs.btk.zmn.zn(zmn) || (!z && zmn == '.')) {
                i2++;
                if (zmn == '.') {
                    z = true;
                }
            }
        }
        if (zmn == '.') {
            throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i2));
        }
        deque.push(new cn(str.substring(i, i2)));
        return i2;
    }
}
