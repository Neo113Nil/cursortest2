package com.bytedance.adsdk.zmn.fs.zn.zmn;

import com.bytedance.adsdk.zmn.fs.fs.zmn.phc;
import java.util.Deque;

/* loaded from: classes3.dex */
public class fb extends hhw {
    @Override // com.bytedance.adsdk.zmn.fs.zn.zmn.hhw
    public int zmn(String str, int i, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque, com.bytedance.adsdk.zmn.fs.zn.zmn zmnVar) {
        if ('(' != zmn(i, str)) {
            return zmnVar.zmn(str, i, deque);
        }
        deque.push(new phc(com.bytedance.adsdk.zmn.fs.fb.fb.LEFT_PAREN));
        return i + 1;
    }
}
