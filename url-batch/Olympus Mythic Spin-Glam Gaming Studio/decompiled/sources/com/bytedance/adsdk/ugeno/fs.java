package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.klz;
import com.bytedance.adsdk.ugeno.fb.bvs;
import com.bytedance.adsdk.ugeno.fb.hhw;
import com.bytedance.adsdk.ugeno.nps.zg;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fs extends com.bytedance.adsdk.ugeno.fs.zmn<com.bytedance.adsdk.ugeno.hhw.fs> implements com.bytedance.adsdk.ugeno.hhw.zn {
    private float ao;
    private float db;
    private String dey;
    private float eug;
    private int gt;
    private float hip;
    private float hz;
    private boolean ji;
    private boolean kh;
    private String lgz;
    private float ljl;
    private float lwz;
    private float mrt;
    private int ob;
    private int pf;
    private int pl;
    private int pw;
    private boolean qr;
    private int quu;
    private boolean rsi;
    private float sl;
    private boolean tev;
    private String tj;
    private boolean uaq;
    private float va;
    private JSONArray vgx;
    private float vpd;
    private boolean wd;

    public fs(Context context) {
        super(context);
        this.ob = 0;
        this.tev = true;
        this.rsi = true;
        this.hip = 500.0f;
        this.eug = -1.0f;
        this.mrt = 2000.0f;
        this.dey = "slide";
        this.lgz = "dot";
        this.va = 8.0f;
        this.vpd = 8.0f;
        this.lwz = 50.0f;
        this.ljl = 90.0f;
        this.uaq = false;
        this.quu = Color.parseColor("#666666");
        this.pl = Color.parseColor("#ffffff");
        this.tj = "row";
        this.ao = 1.0f;
        this.hz = 0.0f;
        this.sl = 0.0f;
        this.db = 0.0f;
        this.pf = 0;
        this.gt = 0;
        this.wd = true;
        this.ji = false;
        this.kh = true;
        float zmn = zg.zmn(this.fs, 8.0f);
        this.va = zmn;
        this.vpd = zmn;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public View zmn() {
        com.bytedance.adsdk.ugeno.hhw.fs fsVar = new com.bytedance.adsdk.ugeno.hhw.fs(this.fs);
        this.btk = fsVar;
        fsVar.zmn((fb) this);
        return this.btk;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn, com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
        ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).zn((int) this.hip).btk(this.ji).zmn(this.lgz).zmn(this.va).fs(this.vpd).zn(this.lwz).fb(this.ljl).fs(this.tj).zmn(this.ob).fs().fb(this.tev).zmn(this.rsi).fs((int) this.hip).fb((int) this.mrt).btk((int) this.eug).fs(this.wd).zn(this.uaq).nps(this.quu).hhw(this.pl).bvs((int) this.sl).iv((int) this.db).zg((int) this.hz).btk(this.ao).zn(this.dey).rt(this.gt);
        ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).setOnPageChangeListener(this);
        if (this.pf == 1) {
            tet();
        } else {
            bxw();
        }
        ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).zn();
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn
    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        if (znVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.add(znVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn
    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, ViewGroup.LayoutParams layoutParams) {
        if (znVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.add(znVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "startDelay":
                this.eug = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, -1.0f);
                break;
            case "startIndex":
                this.gt = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0);
                break;
            case "indicatorColor":
                this.quu = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2, this.quu);
                break;
            case "indicatorStyle":
                this.lgz = str2;
                break;
            case "indicatorWidth":
                this.va = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 8.0f));
                break;
            case "indicatorHeight":
                this.vpd = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 8.0f));
                break;
            case "nextMargin":
                this.db = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "driveMode":
                this.pf = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0);
                break;
            case "effect":
                this.dey = str2;
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.ob = 1;
                    break;
                } else {
                    this.ob = 0;
                    break;
                }
            case "disableOnInteraction":
                this.ji = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, false);
                break;
            case "indicator":
                this.uaq = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, false);
                break;
            case "indicatorX":
                this.lwz = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 50.0f);
                break;
            case "indicatorY":
                this.ljl = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 90.0f);
                break;
            case "previousMargin":
                this.sl = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "loop":
                this.tev = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, true);
                break;
            case "delay":
                this.mrt = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 2000.0f);
                break;
            case "speed":
                this.hip = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 500.0f);
                break;
            case "indicatorDirection":
                this.tj = str2;
                break;
            case "allowTouchMove":
                this.wd = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, true);
                break;
            case "pageCount":
                this.ao = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 1.0f);
                break;
            case "pageMargin":
                this.hz = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.pl = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2, this.pl);
                break;
            case "autoplay":
                this.rsi = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, true);
                break;
            case "dataList":
                this.vgx = com.bytedance.adsdk.ugeno.nps.fs.zmn(str2, (JSONArray) null);
                break;
        }
    }

    private void bxw() {
        List<com.bytedance.adsdk.ugeno.fs.zn<View>> list = ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.get(0);
        if (this.vgx == null) {
            return;
        }
        for (int i = 0; i < this.vgx.length(); i++) {
            klz klzVar = new klz(this.fs);
            zmn(klzVar);
            klzVar.zmn(this.uw);
            try {
                JSONObject optJSONObject = this.vgx.optJSONObject(i);
                if (optJSONObject != null) {
                    if (optJSONObject.has("$chunk")) {
                        this.fb.put("$item", optJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.fb.put("$item", optJSONObject);
                    }
                    ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).zmn((com.bytedance.adsdk.ugeno.hhw.fs) klzVar.zmn(znVar.yj(), this.fb, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void tet() {
        for (int i = 0; i < ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.size(); i++) {
            com.bytedance.adsdk.ugeno.fs.zn<View> znVar = ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.get(i);
            if (znVar != null) {
                klz klzVar = new klz(this.fs);
                zmn(klzVar);
                klzVar.zmn(this.uw);
                ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).zmn((com.bytedance.adsdk.ugeno.hhw.fs) klzVar.zmn(znVar.yj(), this.fb, (JSONObject) null));
            }
        }
    }

    private int yo() {
        if (this.pf == 1) {
            List<com.bytedance.adsdk.ugeno.fs.zn<View>> list = ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.vgx;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    public void zn() {
        ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).rt(((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).getCurrentItem() + 1);
    }

    public void fb() {
        ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).rt(((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).getCurrentItem() - 1);
    }

    public void zmn(int i) {
        if (((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).getCurrentItem() != i) {
            ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).rt(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hhw.zn
    public void zmn(boolean z, int i, float f, int i2) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z + "; position=" + i + "; positionOffset=" + f + "; positionOffsetPixels=" + i2);
        zmn(z, i, f);
    }

    @Override // com.bytedance.adsdk.ugeno.hhw.zn
    public void zmn(boolean z, int i, int i2, boolean z2, boolean z3) {
        if (this.pw != i) {
            nps(i);
            zg(i);
            this.pw = i;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z + "; position=" + i + "; loopPosition=" + i2 + "; isFirst=" + z2 + "; isLast=" + z3);
    }

    @Override // com.bytedance.adsdk.ugeno.hhw.zn
    public void zmn(boolean z, int i) {
        if (i == 0) {
            if (!z) {
                this.kh = true;
            }
            this.qr = false;
        } else if (i == 1) {
            this.qr = true;
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z + "; state=" + i);
    }

    private void nps(int i) {
        if (this.sxr == null) {
            return;
        }
        if (this.pw == 0 && i == yo() - 1) {
            this.sxr.zmn("SwiperView://reloop", 1);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
        }
        if (this.pw == yo() - 1 && i == 0) {
            this.sxr.zmn("SwiperView://reloop", 0);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
        }
    }

    private void zg(int i) {
        bvs bvsVar = this.sxr;
        if (bvsVar == null) {
            return;
        }
        bvsVar.zmn("SwiperView://slide", Integer.valueOf(this.pw), Integer.valueOf(i), Integer.valueOf(!this.qr ? 1 : 0));
    }

    private void zmn(boolean z, int i, float f) {
        if (this.sxr != null && !z && i == yo() - 1 && f == 0.0f && this.kh) {
            this.sxr.zmn("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.kh = false;
        }
    }

    private void zmn(klz klzVar) {
        if (this.ji) {
            klzVar.zmn(new com.bytedance.adsdk.ugeno.core.btk() { // from class: com.bytedance.adsdk.ugeno.fs.1
                @Override // com.bytedance.adsdk.ugeno.core.btk
                public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, List<hhw.zmn> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && ((com.bytedance.adsdk.ugeno.fs.zn) fs.this).btk != null) {
                        ((com.bytedance.adsdk.ugeno.hhw.fs) ((com.bytedance.adsdk.ugeno.fs.zn) fs.this).btk).hhw();
                    }
                }
            });
        }
    }
}
