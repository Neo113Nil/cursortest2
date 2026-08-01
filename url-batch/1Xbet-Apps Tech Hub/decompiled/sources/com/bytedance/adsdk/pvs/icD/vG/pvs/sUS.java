package com.bytedance.adsdk.pvs.icD.vG.pvs;

import java.util.Deque;

/* compiled from: NodeParser.java */
/* loaded from: classes.dex */
public abstract class sUS {
    public abstract int pvs(String str, int i, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque, com.bytedance.adsdk.pvs.icD.vG.pvs pvsVar);

    protected char pvs(int i, String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }

    protected int icD(int i, String str) {
        while (com.bytedance.adsdk.pvs.icD.NB.pvs.pvs(pvs(i, str))) {
            i++;
        }
        return i;
    }
}
