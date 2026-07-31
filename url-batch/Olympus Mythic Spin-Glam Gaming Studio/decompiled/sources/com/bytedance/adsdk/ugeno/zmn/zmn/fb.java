package com.bytedance.adsdk.ugeno.zmn.zmn;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.nps.zg;
import com.bytedance.adsdk.ugeno.nps.zmn;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class fb extends zmn {
    private static final float cn;
    private static final float cyb;
    private static final float olo;
    private static final float rt;
    private Path btk;
    private float bvs;
    private Paint fb;
    private zmn.C0112zmn hhw;
    private int iv;
    private float kgc;
    private boolean klz;
    private Path mw;
    private int nps;
    private int rc;
    private int zg;
    private int zn;

    static {
        float radians = (float) Math.toRadians(30.0d);
        rt = radians;
        cn = (float) Math.tan(radians);
        cyb = (float) Math.cos(radians);
        olo = (float) Math.sin(radians);
    }

    public fb(com.bytedance.adsdk.ugeno.fs.zn znVar, JSONObject jSONObject) {
        super(znVar, jSONObject);
        this.klz = true;
        Paint paint = new Paint();
        this.fb = paint;
        paint.setAntiAlias(true);
        this.btk = new Path();
        this.bvs = this.fs.nqi();
        this.mw = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void fs() {
        this.zn = (int) zg.zmn(this.fs.rc().getContext(), this.zmn.optInt("shineWidth", 30));
        String optString = this.zmn.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(optString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : optString;
        if (str.startsWith("linear")) {
            this.hhw = com.bytedance.adsdk.ugeno.nps.zmn.fs(str);
        } else {
            int zmn = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str);
            this.nps = zmn;
            this.zg = com.bytedance.adsdk.ugeno.nps.zmn.zmn(zmn, 32);
            this.klz = false;
        }
        this.kgc = cyb * this.zn;
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    @SuppressLint({"DrawAllocation"})
    public void zmn(Canvas canvas) {
        zn(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void fs(Canvas canvas) {
        zn(canvas);
    }

    private void zn(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.fs.gn() > 0.0f) {
                int i = this.iv;
                float f = cn;
                float gn = (i + (i * f)) * this.fs.gn();
                this.mw.reset();
                this.mw.moveTo(gn, 0.0f);
                int i2 = this.rc;
                float f2 = gn - (i2 * f);
                this.mw.lineTo(f2, i2);
                this.mw.lineTo(f2 + this.zn, this.rc);
                this.mw.lineTo(this.zn + gn, 0.0f);
                this.mw.close();
                float f3 = this.kgc;
                float f4 = cyb * f3;
                float f5 = f3 * olo;
                if (this.klz && this.hhw != null) {
                    linearGradient = new LinearGradient(gn, 0.0f, gn + f4, f5, this.hhw.fs, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    float f6 = gn + f4;
                    int i3 = this.zg;
                    linearGradient = new LinearGradient(gn, 0.0f, f6, f5, new int[]{i3, this.nps, i3}, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.fb.setShader(linearGradient);
                Path path = this.btk;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.mw, this.fb);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void zmn(int i, int i2) {
        this.iv = i;
        this.rc = i2;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            Path path = this.btk;
            float f = this.bvs;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public List<PropertyValuesHolder> zn() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(fb(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }
}
