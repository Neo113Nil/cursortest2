package com.bytedance.sdk.openadsdk.core.mw.fs.fs;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.fs.fb;
import com.bytedance.adsdk.fs.iv;
import com.bytedance.adsdk.ugeno.btk;
import com.bytedance.adsdk.ugeno.fs.zn;
import com.bytedance.adsdk.ugeno.nps.zg;
import com.bytedance.adsdk.ugeno.zmn;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class zmn extends zn<fs> {
    private int dey;
    private boolean eug;
    private String hip;
    private boolean lgz;
    private float lwz;
    private boolean mrt;
    protected HashMap<String, Bitmap> ob;
    protected ImageView.ScaleType rsi;
    protected ImageView.ScaleType tev;
    private boolean va;
    private float vpd;
    protected String zmn;

    public zmn(Context context) {
        super(context);
        this.hip = "images";
        this.va = true;
        this.lwz = 1.0f;
        this.tev = ImageView.ScaleType.FIT_CENTER;
        this.rsi = ImageView.ScaleType.FIT_XY;
        this.ob = new HashMap<>();
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    /* renamed from: zn, reason: merged with bridge method [inline-methods] */
    public fs zmn() {
        fs fsVar = new fs(this.fs);
        fsVar.zmn(this);
        return fsVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
        ((fs) this.btk).setProgress(this.vpd);
        if (this.lwz <= 0.0f) {
            this.lwz = 1.0f;
        }
        ((fs) this.btk).setSpeed(this.lwz);
        if (this.zmn.startsWith("local")) {
            ((fs) this.btk).setAnimation(mw(this.zmn));
            ((fs) this.btk).setImageAssetsFolder(this.hip);
        } else {
            ((fs) this.btk).setAnimationFromUrl(this.zmn);
        }
        ((fs) this.btk).setImageAssetDelegate(new AnonymousClass1());
        if (so()) {
            ((fs) this.btk).setScaleType(this.rsi);
        } else {
            ((fs) this.btk).setScaleType(this.tev);
        }
        if (so()) {
            ((fs) this.btk).setRepeatCount(this.dey);
        } else {
            ((fs) this.btk).zmn(this.mrt);
        }
        if (so()) {
            T t = this.btk;
            if (t == 0 || !this.va) {
                return;
            }
            ((fs) t).zmn();
            return;
        }
        T t2 = this.btk;
        if (t2 != 0) {
            ((fs) t2).zmn();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.mw.fs.fs.zmn$1, reason: invalid class name */
    class AnonymousClass1 implements fb {
        AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.fs.fb
        public Bitmap zmn(final iv ivVar) {
            final String str;
            if (ivVar == null) {
                return null;
            }
            String iv = ivVar.iv();
            String bvs = ivVar.bvs();
            if (!TextUtils.isEmpty(iv) && TextUtils.isEmpty(bvs)) {
                str = com.bytedance.adsdk.ugeno.zn.fs.zmn(iv, ((zn) zmn.this).fb);
            } else if (!TextUtils.isEmpty(bvs) && TextUtils.isEmpty(iv)) {
                str = com.bytedance.adsdk.ugeno.zn.fs.zmn(bvs, ((zn) zmn.this).fb);
            } else if (TextUtils.isEmpty(bvs) || TextUtils.isEmpty(iv)) {
                str = null;
            } else {
                str = com.bytedance.adsdk.ugeno.zn.fs.zmn(iv, ((zn) zmn.this).fb) + com.bytedance.adsdk.ugeno.zn.fs.zmn(bvs, ((zn) zmn.this).fb);
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Bitmap bitmap = zmn.this.ob.get(str);
            if (bitmap != null) {
                return bitmap;
            }
            btk.zmn().fs().zmn(((zn) zmn.this).bvs, str, new zmn.InterfaceC0116zmn() { // from class: com.bytedance.sdk.openadsdk.core.mw.fs.fs.zmn.1.1
                @Override // com.bytedance.adsdk.ugeno.zmn.InterfaceC0116zmn
                public void zmn(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, ivVar.zmn(), ivVar.fs(), false);
                        zmn.this.ob.put(str, createScaledBitmap);
                        zg.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mw.fs.fs.zmn.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((fs) ((zn) zmn.this).btk).zmn(ivVar.zg(), createScaledBitmap);
                            }
                        });
                    }
                }
            });
            return zmn.this.ob.get(str);
        }
    }

    public void fb() {
        T t = this.btk;
        if (t != 0) {
            ((fs) t).zmn();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.zmn(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleMode":
                this.rsi = cn(str2);
                break;
            case "scaleType":
                this.tev = rt(str2);
                break;
            case "progress":
                this.vpd = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case "imagePath":
                this.hip = str2;
                break;
            case "autoReverse":
                this.eug = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, false);
                break;
            case "src":
                this.zmn = com.bytedance.sdk.openadsdk.core.mw.fb.zmn(str2);
                break;
            case "loop":
                if (so()) {
                    this.dey = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0);
                    break;
                } else {
                    this.mrt = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, false);
                    break;
                }
            case "speed":
                this.lwz = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 1.0f);
                break;
            case "autoPlay":
                this.lgz = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, false);
                break;
            case "autoplay":
                this.va = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, true);
                break;
        }
    }

    public void zmn(AnimatorListenerAdapter animatorListenerAdapter) {
        ((fs) this.btk).zmn(animatorListenerAdapter);
    }

    private String mw(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("local")) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        return str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private ImageView.ScaleType rt(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1274298614:
                if (str.equals("fitEnd")) {
                    c = 1;
                    break;
                }
                break;
            case -522179887:
                if (str.equals("fitStart")) {
                    c = 2;
                    break;
                }
                break;
            case -340708175:
                if (str.equals("centerInside")) {
                    c = 3;
                    break;
                }
                break;
            case 97441490:
                if (str.equals("fitXY")) {
                    c = 4;
                    break;
                }
                break;
            case 520762310:
                if (str.equals("fitCenter")) {
                    c = 5;
                    break;
                }
                break;
            case 1161480325:
                if (str.equals("centerCrop")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return ImageView.ScaleType.CENTER;
            case 1:
                return ImageView.ScaleType.FIT_END;
            case 2:
                return ImageView.ScaleType.FIT_START;
            case 3:
                return ImageView.ScaleType.CENTER_INSIDE;
            case 4:
            default:
                return scaleType;
            case 5:
                return ImageView.ScaleType.FIT_CENTER;
            case 6:
                return ImageView.ScaleType.CENTER_CROP;
        }
    }

    private ImageView.ScaleType cn(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            case "fill":
            default:
                return scaleType;
        }
    }
}
