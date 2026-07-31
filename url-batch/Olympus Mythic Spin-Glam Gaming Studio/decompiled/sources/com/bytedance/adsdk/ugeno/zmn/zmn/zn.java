package com.bytedance.adsdk.ugeno.zmn.zmn;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class zn extends zmn {
    private float btk;
    private PorterDuffXfermode bvs;
    private float fb;
    private View hhw;
    private LinearGradient iv;
    private Paint nps;
    private Matrix rc;
    private Paint zg;
    private String zn;

    public zn(com.bytedance.adsdk.ugeno.fs.zn znVar, JSONObject jSONObject) {
        super(znVar, jSONObject);
        this.hhw = this.fs.rc();
        Paint paint = new Paint();
        this.nps = paint;
        paint.setAntiAlias(true);
        this.hhw.setLayerType(2, null);
        this.bvs = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.zg = new Paint();
        this.rc = new Matrix();
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void fs() {
        this.zn = this.zmn.optString("direction", "left");
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void zmn(Canvas canvas) {
        zn(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void fs(Canvas canvas) {
        zn(canvas);
    }

    private void zn(Canvas canvas) {
        char c;
        try {
            if (this.fs.kra() > 0.0f) {
                int kra = (int) (this.fb * this.fs.kra());
                int kra2 = (int) (this.btk * this.fs.kra());
                this.nps.setXfermode(this.bvs);
                String str = this.zn;
                switch (str.hashCode()) {
                    case -1383228885:
                        if (str.equals("bottom")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115029:
                        if (str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3317767:
                        if (str.equals("left")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108511772:
                        if (str.equals("right")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    float f = kra;
                    canvas.drawRect(f, 0.0f, this.fb, this.btk, this.nps);
                    this.rc.setTranslate(f, this.btk);
                    this.iv.setLocalMatrix(this.rc);
                    this.zg.setShader(this.iv);
                    if (this.fs.kra() <= 1.0f && this.fs.kra() > 0.9f) {
                        this.zg.setAlpha((int) (255.0f - (this.fs.kra() * 255.0f)));
                    }
                    canvas.drawRect(0.0f, 0.0f, f, this.btk, this.zg);
                    return;
                }
                if (c == 1) {
                    float f2 = kra;
                    canvas.drawRect(0.0f, 0.0f, this.fb - f2, this.btk, this.nps);
                    this.rc.setTranslate(this.fb - f2, 0.0f);
                    this.iv.setLocalMatrix(this.rc);
                    this.zg.setShader(this.iv);
                    if (this.fs.kra() <= 1.0f && this.fs.kra() > 0.9f) {
                        this.zg.setAlpha((int) (255.0f - (this.fs.kra() * 255.0f)));
                    }
                    float f3 = this.fb;
                    canvas.drawRect(f3, this.btk, f3 - f2, 0.0f, this.zg);
                    return;
                }
                if (c == 2) {
                    float f4 = kra2;
                    canvas.drawRect(0.0f, f4, this.fb, this.btk, this.nps);
                    this.rc.setTranslate(0.0f, f4);
                    this.iv.setLocalMatrix(this.rc);
                    this.zg.setShader(this.iv);
                    if (this.fs.kra() <= 1.0f && this.fs.kra() > 0.9f) {
                        this.zg.setAlpha((int) (255.0f - (this.fs.kra() * 255.0f)));
                    }
                    canvas.drawRect(0.0f, 0.0f, this.fb, f4, this.zg);
                    return;
                }
                if (c != 3) {
                    return;
                }
                float f5 = kra2;
                canvas.drawRect(0.0f, 0.0f, this.fb, this.btk - f5, this.nps);
                this.rc.setTranslate(0.0f, this.btk - f5);
                this.iv.setLocalMatrix(this.rc);
                this.zg.setShader(this.iv);
                if (this.fs.kra() <= 1.0f && this.fs.kra() > 0.9f) {
                    this.zg.setAlpha((int) (255.0f - (this.fs.kra() * 255.0f)));
                }
                float f6 = this.fb;
                float f7 = this.btk;
                canvas.drawRect(f6, f7, 0.0f, f7 - f5, this.zg);
                return;
            }
            this.nps.setXfermode(this.bvs);
            canvas.drawRect(0.0f, 0.0f, this.fb, this.btk, this.nps);
        } catch (Throwable th) {
            Log.e("BaseEffectWrapper", th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void zmn(int i, int i2) {
        this.fb = i;
        this.btk = i2;
        String str = this.zn;
        str.hashCode();
        switch (str) {
            case "bottom":
                this.iv = new LinearGradient(0.0f, -this.btk, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.iv = new LinearGradient(0.0f, this.btk, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.iv = new LinearGradient(this.fb, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.iv = new LinearGradient(-this.fb, 0.0f, 0.0f, this.btk, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public List<PropertyValuesHolder> zn() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.zmn.btk.ALPHA.fs(), 0.0f, 1.0f));
        return arrayList;
    }
}
