package com.bytedance.adsdk.ugeno.zmn;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zn {
    private long btk;
    private int bvs = 1;
    private String fb;
    private long fs;
    private zmn hhw;
    private JSONObject iv;
    private String nps;
    private String zg;
    private Map<String, TreeMap<Float, String>> zmn;
    private int zn;

    public static class zmn {
        public String fs;
        public String zmn;
    }

    public JSONObject zmn() {
        return this.iv;
    }

    public void zmn(JSONObject jSONObject) {
        this.iv = jSONObject;
    }

    public Map<String, TreeMap<Float, String>> fs() {
        return this.zmn;
    }

    public void zmn(Map<String, TreeMap<Float, String>> map) {
        this.zmn = map;
    }

    public long zn() {
        return this.fs;
    }

    public void zmn(long j) {
        this.fs = j;
    }

    public int fb() {
        return this.zn;
    }

    public void zmn(int i) {
        this.zn = i;
    }

    public String btk() {
        return this.fb;
    }

    public void zmn(String str) {
        this.fb = str;
    }

    public long hhw() {
        return this.btk;
    }

    public void fs(long j) {
        this.btk = j;
    }

    public zmn nps() {
        return this.hhw;
    }

    public void zmn(zmn zmnVar) {
        this.hhw = zmnVar;
    }

    public String zg() {
        return this.nps;
    }

    public void fs(String str) {
        this.nps = str;
    }

    public String bvs() {
        return this.zg;
    }

    public void zn(String str) {
        this.zg = str;
    }

    public int iv() {
        return this.bvs;
    }

    public void fs(int i) {
        this.bvs = i;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.zmn + ", mDuration=" + this.fs + ", mPlayCount=" + this.zn + ", mPlayDirection=" + this.fb + ", mDelay=" + this.btk + ", mName=" + this.zg + ", mPlayState=" + this.bvs + ", mTransformOrigin='" + this.hhw + "', mTimingFunction='" + this.nps + "'}";
    }
}
