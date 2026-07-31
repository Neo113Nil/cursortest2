package com.bytedance.adsdk.ugeno.bvs.zn;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.bvs.fb.zn;

/* loaded from: classes12.dex */
public abstract class zmn extends zn {
    private int hip;

    public abstract String mw(String str);

    public zmn(Context context) {
        super(context);
        this.hip = -16777216;
    }

    @Override // com.bytedance.adsdk.ugeno.bvs.fb.zn, com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        ((zn) this).zmn = cn(((zn) this).zmn);
        super.fs();
        ((com.bytedance.adsdk.ugeno.bvs.fb.zmn) this.btk).setColorFilter(this.hip);
        ((com.bytedance.adsdk.ugeno.bvs.fb.zmn) this.btk).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    private String cn(String str) {
        String mw = mw(str);
        if (TextUtils.isEmpty(mw)) {
            return "";
        }
        return "local://".concat(String.valueOf(mw));
    }

    @Override // com.bytedance.adsdk.ugeno.bvs.fb.zn, com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        str.hashCode();
        if (str.equals("textColor")) {
            this.hip = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bvs.fb.zn
    protected String zn() {
        return "drawable";
    }
}
