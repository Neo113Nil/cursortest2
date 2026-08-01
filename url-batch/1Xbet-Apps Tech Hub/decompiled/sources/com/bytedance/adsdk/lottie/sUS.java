package com.bytedance.adsdk.lottie;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: LottieComposition.java */
/* loaded from: classes.dex */
public class sUS {
    private boolean IP;
    private Map<String, Mxy> Jd;
    private float Ju;
    private List<com.bytedance.adsdk.lottie.vG.vG.Jd> Mxy;
    private Map<String, com.bytedance.adsdk.lottie.vG.vG> NB;
    private Rect Wyp;
    private float kj;
    private float qh;
    private List<com.bytedance.adsdk.lottie.vG.sUS> sUS;
    private LongSparseArray<com.bytedance.adsdk.lottie.vG.vG.Jd> so;
    private Map<String, List<com.bytedance.adsdk.lottie.vG.vG.Jd>> vG;
    private SparseArray<com.bytedance.adsdk.lottie.vG.Jd> yiw;
    private final vA pvs = new vA();
    private final HashSet<String> icD = new HashSet<>();
    private int bNS = 0;

    public void pvs(Rect rect, float f, float f2, float f3, List<com.bytedance.adsdk.lottie.vG.vG.Jd> list, LongSparseArray<com.bytedance.adsdk.lottie.vG.vG.Jd> longSparseArray, Map<String, List<com.bytedance.adsdk.lottie.vG.vG.Jd>> map, Map<String, Mxy> map2, SparseArray<com.bytedance.adsdk.lottie.vG.Jd> sparseArray, Map<String, com.bytedance.adsdk.lottie.vG.vG> map3, List<com.bytedance.adsdk.lottie.vG.sUS> list2) {
        this.Wyp = rect;
        this.qh = f;
        this.kj = f2;
        this.Ju = f3;
        this.Mxy = list;
        this.so = longSparseArray;
        this.vG = map;
        this.Jd = map2;
        this.yiw = sparseArray;
        this.NB = map3;
        this.sUS = list2;
    }

    public void pvs(String str) {
        this.icD.add(str);
    }

    public void pvs(boolean z) {
        this.IP = z;
    }

    public void pvs(int i) {
        this.bNS += i;
    }

    public boolean pvs() {
        return this.IP;
    }

    public int icD() {
        return this.bNS;
    }

    public void icD(boolean z) {
        this.pvs.pvs(z);
    }

    public vA vG() {
        return this.pvs;
    }

    public com.bytedance.adsdk.lottie.vG.vG.Jd pvs(long j) {
        return this.so.get(j);
    }

    public Rect Jd() {
        return this.Wyp;
    }

    public float NB() {
        return (long) ((Ju() / this.Ju) * 1000.0f);
    }

    public float sUS() {
        return this.qh;
    }

    public float yiw() {
        return this.kj;
    }

    public float pvs(float f) {
        return com.bytedance.adsdk.lottie.sUS.NB.pvs(this.qh, this.kj, f);
    }

    public float so() {
        return this.Ju;
    }

    public List<com.bytedance.adsdk.lottie.vG.vG.Jd> Mxy() {
        return this.Mxy;
    }

    public List<com.bytedance.adsdk.lottie.vG.vG.Jd> icD(String str) {
        return this.vG.get(str);
    }

    public SparseArray<com.bytedance.adsdk.lottie.vG.Jd> Wyp() {
        return this.yiw;
    }

    public Map<String, com.bytedance.adsdk.lottie.vG.vG> qh() {
        return this.NB;
    }

    public com.bytedance.adsdk.lottie.vG.sUS vG(String str) {
        int size = this.sUS.size();
        for (int i = 0; i < size; i++) {
            com.bytedance.adsdk.lottie.vG.sUS sus = this.sUS.get(i);
            if (sus.pvs(str)) {
                return sus;
            }
        }
        return null;
    }

    public Map<String, Mxy> kj() {
        return this.Jd;
    }

    public float Ju() {
        return this.kj - this.qh;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.lottie.vG.vG.Jd> it = this.Mxy.iterator();
        while (it.hasNext()) {
            sb.append(it.next().pvs("\t"));
        }
        return sb.toString();
    }
}
