package com.bytedance.sdk.openadsdk.hhw;

import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.zn;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes15.dex */
public class zmn {
    private static volatile zmn zmn;
    private int[] btk;
    private int[] bvs;
    private int cn;
    private boolean cyb;
    private boolean fb;
    private boolean fs;
    private int[] hhw;
    private boolean iv;
    private int[] klz;
    private boolean mw;
    private int[] nps;
    private boolean olo;
    private boolean rc;
    private boolean rt;
    private int[] zg;
    private boolean zn;

    private zmn() {
        fs();
    }

    public static zmn zmn() {
        if (zmn == null) {
            synchronized (zn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zmn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public void fs() {
        cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hhw.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                zmn.this.rt = btk.zmn("feature_switch", false);
                if (zmn.this.rt) {
                    try {
                        zmn.this.olo = btk.zmn("exclude_banner_native", false);
                        zmn.this.cn = btk.zmn("feature_timer_interval", 10000);
                        zmn.this.cyb = btk.zmn("enable_feature_cids", true);
                        String[] split = btk.zmn("pag_ad_show_cnt", "1,3,5&session").split(X3.j.c);
                        String[] split2 = btk.zmn("pag_ad_click_cnt", "1,3,5&session").split(X3.j.c);
                        String[] split3 = btk.zmn("pag_video_play_cnt", "1,3,5&session").split(X3.j.c);
                        String[] split4 = btk.zmn("pag_dislike_cnt", "1,3,5session").split(StringUtils.COMMA);
                        zmn zmnVar = zmn.this;
                        zmnVar.fs = zmnVar.zmn(split);
                        zmn zmnVar2 = zmn.this;
                        zmnVar2.zn = zmnVar2.zmn(split2);
                        zmn zmnVar3 = zmn.this;
                        zmnVar3.fb = zmnVar3.zmn(split3);
                        zmn zmnVar4 = zmn.this;
                        zmnVar4.btk = zmnVar4.fs(split);
                        zmn zmnVar5 = zmn.this;
                        zmnVar5.hhw = zmnVar5.fs(split2);
                        zmn zmnVar6 = zmn.this;
                        zmnVar6.nps = zmnVar6.fs(split3);
                        zmn zmnVar7 = zmn.this;
                        zmnVar7.klz = zmnVar7.zn(split4);
                        String[] split5 = btk.zmn("pag_landingPage_stay_time", "1,3,5&session").split(X3.j.c);
                        String[] split6 = btk.zmn("pag_video_stay_time", "1,3,5&session").split(X3.j.c);
                        zmn zmnVar8 = zmn.this;
                        zmnVar8.iv = zmnVar8.zmn(split5);
                        zmn zmnVar9 = zmn.this;
                        zmnVar9.rc = zmnVar9.zmn(split6);
                        zmn zmnVar10 = zmn.this;
                        zmnVar10.zg = zmnVar10.fs(split5);
                        zmn zmnVar11 = zmn.this;
                        zmnVar11.bvs = zmnVar11.fs(split6);
                        zmn.this.mw = btk.zmn("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] fs(String[] strArr) {
        if (strArr.length > 0) {
            return zn(strArr[0].split(StringUtils.COMMA));
        }
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] zn(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i = 0;
        for (String str : strArr) {
            try {
                int parseInt = Integer.parseInt(str);
                iArr[i] = parseInt;
                if (parseInt > 0) {
                    i++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i == length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public boolean zn() {
        return this.rt;
    }

    public int fb() {
        return this.cn;
    }

    public boolean btk() {
        return this.cyb;
    }

    public boolean hhw() {
        return this.fs;
    }

    public boolean nps() {
        return this.zn;
    }

    public boolean zg() {
        return this.fb;
    }

    public int[] bvs() {
        return this.btk;
    }

    public int[] iv() {
        return this.hhw;
    }

    public int[] rc() {
        return this.nps;
    }

    public int[] klz() {
        return this.zg;
    }

    public int[] mw() {
        return this.bvs;
    }

    public boolean rt() {
        return this.iv;
    }

    public boolean cn() {
        return this.rc;
    }

    public int[] cyb() {
        return this.klz;
    }

    public boolean olo() {
        return this.mw;
    }

    public boolean kgc() {
        return this.olo;
    }
}
