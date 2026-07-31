package com.bytedance.adsdk.ugeno.fs;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.nps.zg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class zmn<E extends ViewGroup> extends zn {
    protected List<zn<View>> zmn;

    public zmn(Context context) {
        this(context, null);
    }

    public zmn(Context context, zmn zmnVar) {
        super(context, zmnVar);
        this.zmn = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
    }

    public void zmn(zn znVar) {
        if (znVar == null) {
            return;
        }
        this.zmn.add(znVar);
        View rc = znVar.rc();
        if (rc != null) {
            ((ViewGroup) this.btk).addView(rc);
        }
    }

    public void zmn(zn znVar, ViewGroup.LayoutParams layoutParams) {
        if (znVar == null) {
            return;
        }
        this.zmn.add(znVar);
        View rc = znVar.rc();
        if (rc != null) {
            ((ViewGroup) this.btk).addView(rc, layoutParams);
        }
    }

    public List<zn<View>> bvs() {
        return this.zmn;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public zn zmn(String str) {
        zn<View> btk;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.rc)) {
            return this;
        }
        for (zn<View> znVar : this.zmn) {
            if (znVar != null && (btk = znVar.btk(str)) != null) {
                return btk;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public zn fs(String str) {
        zn<View> hhw;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.klz)) {
            return this;
        }
        for (zn<View> znVar : this.zmn) {
            if (znVar != null && (hhw = znVar.hhw(str)) != null) {
                return hhw;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    protected zn zn(String str) {
        zn<View> nps;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.klz) && this.cd == 0) {
            return this;
        }
        if (this.cd != 0) {
            return null;
        }
        for (zn<View> znVar : this.zmn) {
            if (znVar != null && (nps = znVar.nps(str)) != null) {
                return nps;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    protected zn fb(String str) {
        zn<View> zg;
        if (!TextUtils.isEmpty(str) && klz(str) != null) {
            return this;
        }
        for (zn<View> znVar : this.zmn) {
            if (znVar != null && (zg = znVar.zg(str)) != null) {
                return zg;
            }
        }
        return null;
    }

    public C0110zmn iv() {
        return new C0110zmn(this);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.fs.zmn$zmn, reason: collision with other inner class name */
    public static class C0110zmn {
        protected zmn bjh;
        protected float btk;
        protected float bvs;
        protected boolean cn;
        protected boolean cyb;
        protected boolean doe;
        protected float hhw;
        protected boolean iqz;
        protected float iv;
        protected boolean kgc;
        protected float klz;
        protected boolean kw;
        protected float mw;
        protected float nps;
        protected boolean nqi;
        protected boolean olo;
        protected boolean phc;
        protected float rc;
        protected float rt;
        protected ViewGroup.LayoutParams uqh;
        protected float zg;
        protected float zmn = -2.0f;
        protected float fs = -2.0f;
        protected float zn = 0.0f;
        protected float fb = 0.0f;

        public C0110zmn(zmn zmnVar) {
            this.bjh = zmnVar;
        }

        public void zmn(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            str.hashCode();
            switch (str) {
                case "paddingLeft":
                    this.rc = zg.zmn(context, str2);
                    this.cyb = true;
                    break;
                case "minWidth":
                    this.zn = zg.zmn(context, str2);
                    break;
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.fs = -1.0f;
                        break;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.fs = -2.0f;
                        break;
                    } else {
                        this.fs = zg.zmn(context, str2);
                        break;
                    }
                case "margin":
                    this.btk = zg.zmn(context, str2);
                    break;
                case "marginTop":
                    this.zg = zg.zmn(context, str2);
                    this.doe = true;
                    break;
                case "padding":
                    this.iv = zg.zmn(context, str2);
                    this.cn = true;
                    break;
                case "marginBottom":
                    this.bvs = zg.zmn(context, str2);
                    this.nqi = true;
                    break;
                case "minHeight":
                    this.fb = zg.zmn(context, str2);
                    break;
                case "paddingTop":
                    this.klz = zg.zmn(context, str2);
                    this.kgc = true;
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.zmn = -1.0f;
                        break;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.zmn = -2.0f;
                        break;
                    } else {
                        this.zmn = zg.zmn(context, str2);
                        break;
                    }
                case "paddingBottom":
                    this.rt = zg.zmn(context, str2);
                    this.kw = true;
                    break;
                case "paddingRight":
                    this.mw = zg.zmn(context, str2);
                    this.olo = true;
                    break;
                case "marginRight":
                    this.nps = zg.zmn(context, str2);
                    this.phc = true;
                    break;
                case "marginLeft":
                    this.hhw = zg.zmn(context, str2);
                    this.iqz = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.zmn + ", mHeight=" + this.fs + ", mMargin=" + this.btk + ", mMarginLeft=" + this.hhw + ", mMarginRight=" + this.nps + ", mMarginTop=" + this.zg + ", mMarginBottom=" + this.bvs + ", mParams=" + this.uqh + '}';
        }

        public ViewGroup.LayoutParams zmn() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.zmn, (int) this.fs);
            marginLayoutParams.leftMargin = (int) (this.iqz ? this.hhw : this.btk);
            marginLayoutParams.rightMargin = (int) (this.phc ? this.nps : this.btk);
            marginLayoutParams.topMargin = (int) (this.doe ? this.zg : this.btk);
            marginLayoutParams.bottomMargin = (int) (this.nqi ? this.bvs : this.btk);
            return marginLayoutParams;
        }
    }
}
