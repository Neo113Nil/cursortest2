package com.bytedance.adsdk.zmn.fs.zn.zmn;

import java.util.Deque;

/* loaded from: classes6.dex */
public abstract class hhw {
    public abstract int zmn(String str, int i, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque, com.bytedance.adsdk.zmn.fs.zn.zmn zmnVar);

    protected char zmn(int i, String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }

    protected int fs(int i, String str) {
        while (com.bytedance.adsdk.zmn.fs.btk.zmn.zmn(zmn(i, str))) {
            i++;
        }
        return i;
    }
}
