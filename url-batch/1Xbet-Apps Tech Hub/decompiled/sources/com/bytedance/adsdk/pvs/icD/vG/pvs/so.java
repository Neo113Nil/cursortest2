package com.bytedance.adsdk.pvs.icD.vG.pvs;

import com.bytedance.adsdk.pvs.icD.icD.pvs.mnm;
import java.util.Deque;

/* compiled from: OperatorParser.java */
/* loaded from: classes.dex */
public class so extends sUS {
    @Override // com.bytedance.adsdk.pvs.icD.vG.pvs.sUS
    public int pvs(String str, int i, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque, com.bytedance.adsdk.pvs.icD.vG.pvs pvsVar) {
        if (!com.bytedance.adsdk.pvs.icD.NB.pvs.Jd(pvs(i, str))) {
            return pvsVar.pvs(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{pvs(i, str), pvs(i2, str)});
        if (com.bytedance.adsdk.pvs.icD.Jd.vG.pvs(str2) != null) {
            deque.push(new mnm(com.bytedance.adsdk.pvs.icD.Jd.vG.pvs(str2)));
            return i + 2;
        }
        String valueOf = String.valueOf(pvs(i, str));
        if (com.bytedance.adsdk.pvs.icD.Jd.vG.pvs(valueOf) != null) {
            deque.push(new mnm(com.bytedance.adsdk.pvs.icD.Jd.vG.pvs(valueOf)));
            return i2;
        }
        throw new IllegalArgumentException("Unrecognized:" + valueOf + "examine:" + str.substring(0, i));
    }
}
