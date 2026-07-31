package com.bytedance.adsdk.ugeno.bvs.fb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.btk;
import com.bytedance.adsdk.ugeno.core.hhw;
import com.bytedance.adsdk.ugeno.core.rc;
import com.bytedance.adsdk.ugeno.nps.fb;
import com.bytedance.adsdk.ugeno.nps.zg;
import com.bytedance.adsdk.ugeno.zmn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class zn extends com.bytedance.adsdk.ugeno.fs.zn<zmn> {
    private int dey;
    private float eug;
    private int hip;
    private float lgz;
    private float mrt;
    protected ImageView.ScaleType ob;
    protected String rsi;
    protected boolean tev;
    protected String zmn;

    public zn(Context context) {
        super(context);
        this.ob = ImageView.ScaleType.FIT_XY;
        this.hip = -1;
        this.eug = -1.0f;
        this.mrt = -1.0f;
        this.dey = 0;
        this.lgz = 50.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
        bvs();
        ((zmn) this.btk).setScaleType(this.ob);
        ((zmn) this.btk).setBorderColor(this.xrr);
        ((zmn) this.btk).setCornerRadius(this.dgt);
        ((zmn) this.btk).setBorderWidth(this.yo);
        int i = this.hip;
        if (i != -1) {
            ((zmn) this.btk).setColorFilter(i);
        }
        ((zmn) this.btk).setEraseEnabled(this.dey == 1);
        ((zmn) this.btk).setEraseRadius(this.lgz);
    }

    public void rt(String str) {
        this.zmn = str;
    }

    private void bvs() {
        if (TextUtils.isEmpty(this.zmn)) {
            return;
        }
        ((zmn) this.btk).setImageDrawable(null);
        if (this.zmn.startsWith("local://")) {
            try {
                String replace = this.zmn.replace("local://", "");
                if (TextUtils.equals(zn(), "raw")) {
                    ((zmn) this.btk).setImageResource(fb.zmn(this.fs, replace));
                    return;
                } else {
                    zmn((ImageView) this.btk, replace);
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (this.zmn.startsWith("@")) {
            try {
                ((zmn) this.btk).setImageResource(Integer.parseInt(this.zmn.substring(1)));
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        iv();
    }

    public void zmn(ImageView imageView, String str) {
        imageView.setImageResource(fb.fs(this.fs, str));
    }

    private void iv() {
        if (this.eug > 0.0f) {
            btk.zmn().fs().zmn(this.bvs, this.zmn, new zmn.InterfaceC0116zmn() { // from class: com.bytedance.adsdk.ugeno.bvs.fb.zn.1
                @Override // com.bytedance.adsdk.ugeno.zmn.InterfaceC0116zmn
                public void zmn(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.fs.zn) zn.this).bmc != null) {
                            hhw unused = ((com.bytedance.adsdk.ugeno.fs.zn) zn.this).bmc;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.fs.zn) zn.this).bmc != null) {
                        hhw unused2 = ((com.bytedance.adsdk.ugeno.fs.zn) zn.this).bmc;
                    }
                    final Bitmap zmn = zg.zmn(((com.bytedance.adsdk.ugeno.fs.zn) zn.this).fs, bitmap, (int) zn.this.eug);
                    if (zmn != null) {
                        zg.zmn(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bvs.fb.zn.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((zmn) ((com.bytedance.adsdk.ugeno.fs.zn) zn.this).btk).setImageBitmap(zmn);
                            }
                        });
                    }
                    zn znVar = zn.this;
                    if (znVar.tev || znVar.mrt > 0.0f) {
                        Bitmap zmn2 = zg.zmn(((com.bytedance.adsdk.ugeno.fs.zn) zn.this).fs, bitmap, zn.this.mrt > 0.0f ? (int) zn.this.mrt : 10);
                        if (zmn2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(((com.bytedance.adsdk.ugeno.fs.zn) zn.this).fs.getResources(), zmn2);
                            zg.zmn(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bvs.fb.zn.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((zmn) ((com.bytedance.adsdk.ugeno.fs.zn) zn.this).btk).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.zmn fs = btk.zmn().fs();
        rc rcVar = this.bvs;
        String str = this.zmn;
        T t = this.btk;
        fs.zmn(rcVar, str, (ImageView) t, ((zmn) t).getWidth(), ((zmn) this.btk).getHeight(), new zmn.InterfaceC0116zmn() { // from class: com.bytedance.adsdk.ugeno.bvs.fb.zn.2
            @Override // com.bytedance.adsdk.ugeno.zmn.InterfaceC0116zmn
            public void zmn(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.fs.zn) zn.this).bmc != null) {
                        hhw unused = ((com.bytedance.adsdk.ugeno.fs.zn) zn.this).bmc;
                    }
                } else if (((com.bytedance.adsdk.ugeno.fs.zn) zn.this).bmc != null) {
                    hhw unused2 = ((com.bytedance.adsdk.ugeno.fs.zn) zn.this).bmc;
                }
            }
        });
        if (this.tev || this.mrt > 0.0f) {
            btk.zmn().fs().zmn(this.bvs, this.zmn, new zmn.InterfaceC0116zmn() { // from class: com.bytedance.adsdk.ugeno.bvs.fb.zn.3
                @Override // com.bytedance.adsdk.ugeno.zmn.InterfaceC0116zmn
                public void zmn(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap zmn = zg.zmn(((com.bytedance.adsdk.ugeno.fs.zn) zn.this).fs, bitmap, zn.this.mrt > 0.0f ? (int) zn.this.mrt : 10);
                    zg.zmn(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bvs.fb.zn.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (zmn != null) {
                                ((zmn) ((com.bytedance.adsdk.ugeno.fs.zn) zn.this).btk).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.fs.zn) zn.this).fs.getResources(), zmn));
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    /* renamed from: fb, reason: merged with bridge method [inline-methods] */
    public zmn zmn() {
        zmn zmnVar = new zmn(this.fs);
        zmnVar.zmn(this);
        return zmnVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        T t;
        if (TextUtils.isEmpty(str)) {
        }
        super.zmn(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleMode":
            case "scaleType":
                this.ob = mw(str2);
                break;
            case "imageBlur":
                this.eug = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, -1.0f);
                break;
            case "eraseRadius":
                float zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 50.0f);
                this.lgz = zmn;
                T t2 = this.btk;
                if (t2 != 0) {
                    ((zmn) t2).setEraseRadius(zmn);
                    break;
                }
                break;
            case "isBgGaussianBlur":
                this.tev = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, false);
                break;
            case "src":
                this.zmn = str2;
                break;
            case "erase":
                int zmn2 = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0);
                this.dey = zmn2;
                if (zmn2 == 1 && (t = this.btk) != 0) {
                    ((zmn) t).setEraseEnabled(true);
                    break;
                }
                break;
            case "tintColor":
                this.hip = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                break;
            case "imageBgBlur":
                this.mrt = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, -1.0f);
                break;
        }
    }

    private ImageView.ScaleType mw(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            case "fill":
            case "fitXY":
            default:
                return scaleType;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn, com.bytedance.adsdk.ugeno.fb
    public void nps() {
        super.nps();
        ((zmn) this.btk).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bvs.fb.zn.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((zmn) ((com.bytedance.adsdk.ugeno.fs.zn) zn.this).btk).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !fs$$ExternalSyntheticApiModelOutline0.m(drawable)) {
                    return;
                }
                zn$$ExternalSyntheticApiModelOutline0.m(drawable).start();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn, com.bytedance.adsdk.ugeno.fb
    public void zg() {
        super.zg();
        Drawable drawable = ((zmn) this.btk).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !fs$$ExternalSyntheticApiModelOutline0.m(drawable)) {
            return;
        }
        zn$$ExternalSyntheticApiModelOutline0.m(drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn, com.bytedance.adsdk.ugeno.fb
    public void zmn(String str, Map<String, Object> map) {
        this.nps = (com.bytedance.adsdk.ugeno.fs.zmn) fs((com.bytedance.adsdk.ugeno.fs.zn) this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tf());
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        zmn(this.nps, str, arrayList.toArray());
    }

    private void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.fs.zn<View>> bvs;
        if (znVar == null) {
            return;
        }
        znVar.zmn(str, objArr);
        if (!(znVar instanceof com.bytedance.adsdk.ugeno.fs.zmn) || (bvs = ((com.bytedance.adsdk.ugeno.fs.zmn) znVar).bvs()) == null || bvs.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.fs.zn<View>> it = bvs.iterator();
        while (it.hasNext()) {
            zmn(it.next(), str, objArr);
        }
    }

    protected String zn() {
        return this.rsi;
    }
}
