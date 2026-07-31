package com.bytedance.adsdk.ugeno.fb.fs;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fb.hhw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zmn {
    public static final HashSet<String> zmn = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
    protected String btk;
    protected String fb;
    protected hhw.zmn fs;
    protected Map<String, Object> hhw;
    protected String nps;
    protected String zg;
    protected com.bytedance.adsdk.ugeno.fs.zn zn;

    public abstract void zmn();

    public zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
        this.zn = znVar;
        this.fs = zmnVar;
        this.nps = str;
        btk();
    }

    private void btk() {
        hhw.zmn zmnVar = this.fs;
        if (zmnVar == null) {
            return;
        }
        this.fb = zmnVar.zmn();
        this.btk = this.fs.fs();
        Map<String, Object> zn = this.fs.zn();
        this.hhw = zn;
        if (zn == null || zn.isEmpty() || !this.hhw.containsKey("emitCustomEvent") || !(this.hhw.get("emitCustomEvent") instanceof String)) {
            return;
        }
        this.zg = (String) this.hhw.get("emitCustomEvent");
    }

    public void fs() {
        zn();
    }

    public void zn() {
        if (fb()) {
            hhw.zmn zmnVar = new hhw.zmn();
            zmnVar.zmn("custom");
            zmnVar.fs("emit");
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.zg);
            zmnVar.zmn(hashMap);
            new fs(this.zn, this.btk, zmnVar).zmn();
        }
    }

    public boolean fb() {
        return !TextUtils.isEmpty(this.zg);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.fb.fs.zmn$zmn, reason: collision with other inner class name */
    public static class C0109zmn {
        public static zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
            if (zmnVar == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.fb.fs zmn = com.bytedance.adsdk.ugeno.fb.fb.zmn(zmnVar.fs());
            if (zmn == null && (TextUtils.isEmpty(zmnVar.zmn()) || !TextUtils.equals(zmnVar.zmn(), "global"))) {
                zmn = com.bytedance.adsdk.ugeno.fb.fb.zmn(zmnVar.btk());
            }
            if (zmn == null) {
                return new zn(znVar, str, zmnVar);
            }
            zmn zmn2 = zmn.zmn(znVar, str, zmnVar);
            return zmn2 == null ? new zn(znVar, str, zmnVar) : zmn2;
        }
    }
}
