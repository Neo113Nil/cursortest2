package com.bytedance.sdk.component.yiw.vG;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

/* compiled from: TNCConfig.java */
/* loaded from: classes.dex */
public class Jd {
    public boolean pvs = false;
    public boolean icD = true;
    public Map<String, Integer> vG = null;
    public Map<String, String> Jd = null;
    public int NB = 10;
    public int sUS = 1;
    public int yiw = 1;
    public int so = 10;
    public int Mxy = 1;
    public int Wyp = 1;
    public int qh = TypedValues.Custom.TYPE_INT;
    public int kj = 120;
    public String Ju = null;
    public int IP = 0;
    public long bNS = 0;

    public String toString() {
        StringBuilder sb = new StringBuilder(" localEnable: ");
        sb.append(this.pvs);
        sb.append(" probeEnable: ").append(this.icD);
        StringBuilder append = sb.append(" hostFilter: ");
        Map<String, Integer> map = this.vG;
        append.append(map != null ? map.size() : 0);
        StringBuilder append2 = sb.append(" hostMap: ");
        Map<String, String> map2 = this.Jd;
        append2.append(map2 != null ? map2.size() : 0);
        sb.append(" reqTo: ").append(this.NB).append("#").append(this.sUS).append("#").append(this.yiw);
        sb.append(" reqErr: ").append(this.so).append("#").append(this.Mxy).append("#").append(this.Wyp);
        sb.append(" updateInterval: ").append(this.qh);
        sb.append(" updateRandom: ").append(this.kj);
        sb.append(" httpBlack: ").append(this.Ju);
        return sb.toString();
    }
}
