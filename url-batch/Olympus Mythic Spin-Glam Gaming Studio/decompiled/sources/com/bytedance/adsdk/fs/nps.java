package com.bytedance.adsdk.fs;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes15.dex */
public class nps {
    private Map<String, com.bytedance.adsdk.fs.zn.zn> btk;
    private List<com.bytedance.adsdk.fs.zn.zn.btk> bvs;
    private zn cyb;
    private Map<String, iv> fb;
    private List<com.bytedance.adsdk.fs.zn.hhw> hhw;
    private Rect iv;
    private zmn kgc;
    private float klz;
    private fs kw;
    private float mw;
    private SparseArray<com.bytedance.adsdk.fs.zn.fb> nps;
    private float rc;
    private boolean rt;
    private LongSparseArray<com.bytedance.adsdk.fs.zn.zn.btk> zg;
    private Map<String, List<com.bytedance.adsdk.fs.zn.zn.btk>> zn;
    private final kgc zmn = new kgc();
    private final HashSet<String> fs = new HashSet<>();
    private int cn = 0;
    private String olo = "";

    public static class fs {
        public int[][] fs;
        public String zmn;
        public JSONArray zn;
    }

    public static class zmn {
        public int btk;
        public int fb;
        public Map<String, Object> fs;
        public String hhw;
        public JSONArray nps;
        public int zmn;
        public Map<String, Object> zn;
    }

    public static class zn {
        public int[] btk;
        public String fb;
        public String fs;
        public String hhw;
        public JSONArray nps;
        public int zmn;
        public String zn;
    }

    public void zmn(Rect rect, float f, float f2, float f3, List<com.bytedance.adsdk.fs.zn.zn.btk> list, LongSparseArray<com.bytedance.adsdk.fs.zn.zn.btk> longSparseArray, Map<String, List<com.bytedance.adsdk.fs.zn.zn.btk>> map, Map<String, iv> map2, SparseArray<com.bytedance.adsdk.fs.zn.fb> sparseArray, Map<String, com.bytedance.adsdk.fs.zn.zn> map3, List<com.bytedance.adsdk.fs.zn.hhw> list2, zn znVar, String str, zmn zmnVar, fs fsVar) {
        this.iv = rect;
        this.rc = f;
        this.klz = f2;
        this.mw = f3;
        this.bvs = list;
        this.zg = longSparseArray;
        this.zn = map;
        this.fb = map2;
        this.nps = sparseArray;
        this.btk = map3;
        this.hhw = list2;
        this.cyb = znVar;
        this.olo = str;
        this.kgc = zmnVar;
        this.kw = fsVar;
    }

    public void zmn(String str) {
        this.fs.add(str);
    }

    public void zmn(boolean z) {
        this.rt = z;
    }

    public void zmn(int i) {
        this.cn += i;
    }

    public boolean zmn() {
        return this.rt;
    }

    public int fs() {
        return this.cn;
    }

    public void fs(boolean z) {
        this.zmn.zmn(z);
    }

    public kgc zn() {
        return this.zmn;
    }

    public com.bytedance.adsdk.fs.zn.zn.btk zmn(long j) {
        return this.zg.get(j);
    }

    public Rect fb() {
        return this.iv;
    }

    public float btk() {
        return (long) ((olo() / this.mw) * 1000.0f);
    }

    public float hhw() {
        return this.rc;
    }

    public float nps() {
        return this.klz;
    }

    public float zmn(float f) {
        return com.bytedance.adsdk.fs.hhw.btk.zmn(this.rc, this.klz, f);
    }

    public zn zg() {
        return this.cyb;
    }

    public String bvs() {
        return this.olo;
    }

    public fs iv() {
        return this.kw;
    }

    public zmn rc() {
        return this.kgc;
    }

    public float klz() {
        return this.mw;
    }

    public List<com.bytedance.adsdk.fs.zn.zn.btk> mw() {
        return this.bvs;
    }

    public List<com.bytedance.adsdk.fs.zn.zn.btk> fs(String str) {
        return this.zn.get(str);
    }

    public SparseArray<com.bytedance.adsdk.fs.zn.fb> rt() {
        return this.nps;
    }

    public Map<String, com.bytedance.adsdk.fs.zn.zn> cn() {
        return this.btk;
    }

    public com.bytedance.adsdk.fs.zn.hhw zn(String str) {
        int size = this.hhw.size();
        for (int i = 0; i < size; i++) {
            com.bytedance.adsdk.fs.zn.hhw hhwVar = this.hhw.get(i);
            if (hhwVar.zmn(str)) {
                return hhwVar;
            }
        }
        return null;
    }

    public Map<String, iv> cyb() {
        return this.fb;
    }

    public float olo() {
        return this.klz - this.rc;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.fs.zn.zn.btk> it = this.bvs.iterator();
        while (it.hasNext()) {
            sb.append(it.next().zmn("\t"));
        }
        return sb.toString();
    }
}
