package com.bytedance.adsdk.fs;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public class iv {
    private final String btk;
    private final int[][] bvs;
    private final String fb;
    private final int fs;
    private final String hhw;
    private final JSONArray iv;
    private final List<zmn> nps;
    private Bitmap rc;
    private final String zg;
    private final int zmn;
    private final String zn;

    public static class zmn {
        public int btk;
        public String fb;
        public int fs;
        public int hhw;
        public String nps;
        public int zmn;
        public String zn;
    }

    public iv(int i, int i2, String str, String str2, String str3, String str4, List<zmn> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.zmn = i;
        this.fs = i2;
        this.zn = str;
        this.fb = str2;
        this.btk = str3;
        this.hhw = str4;
        this.nps = list;
        this.zg = str5;
        this.bvs = iArr;
        this.iv = jSONArray;
    }

    public int zmn() {
        return this.zmn;
    }

    public int fs() {
        return this.fs;
    }

    public List<zmn> zn() {
        return this.nps;
    }

    public String fb() {
        return this.hhw;
    }

    public String btk() {
        return this.zg;
    }

    public int[][] hhw() {
        return this.bvs;
    }

    public JSONArray nps() {
        return this.iv;
    }

    public String zg() {
        return this.zn;
    }

    public String bvs() {
        return this.fb;
    }

    public String iv() {
        return this.btk;
    }

    public Bitmap rc() {
        return this.rc;
    }

    public void zmn(Bitmap bitmap) {
        this.rc = bitmap;
    }
}
