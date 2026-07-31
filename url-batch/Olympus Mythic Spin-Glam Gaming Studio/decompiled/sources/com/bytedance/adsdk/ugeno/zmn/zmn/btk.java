package com.bytedance.adsdk.ugeno.zmn.zmn;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class btk extends zmn {
    private Paint btk;
    private boolean bvs;
    private float fb;
    private float hhw;
    private Path iv;
    private Path klz;
    private PorterDuffXfermode mw;
    private String nps;
    private Path rc;
    private boolean zg;
    private float zn;

    public btk(com.bytedance.adsdk.ugeno.fs.zn znVar, JSONObject jSONObject) {
        super(znVar, jSONObject);
        this.zg = true;
        this.bvs = true;
        Paint paint = new Paint();
        this.btk = paint;
        paint.setAntiAlias(true);
        this.fs.rc().setLayerType(2, null);
        this.mw = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.iv = new Path();
        this.rc = new Path();
        this.klz = new Path();
        this.btk.setXfermode(this.mw);
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void fs() {
        this.hhw = (float) this.zmn.optDouble("start", 0.0d);
        this.nps = this.zmn.optString("direction", "center");
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
        int uqd;
        int uqd2;
        if (this.fs.uqd() > 0.0f) {
            uqd = (int) (this.zn * this.fs.uqd());
            uqd2 = (int) (this.fb * this.fs.uqd());
            this.btk.setXfermode(this.mw);
            String str = this.nps;
            str.hashCode();
            switch (str) {
                case "bottom":
                    canvas.drawRect(0.0f, uqd2, this.zn, this.fb, this.btk);
                    break;
                case "center":
                    this.iv.reset();
                    this.rc.reset();
                    this.klz.reset();
                    Path.Direction direction = Path.Direction.CW;
                    this.iv.addCircle(this.zn / 2.0f, this.fb / 2.0f, uqd, direction);
                    Path path = this.rc;
                    float f = this.zn;
                    path.addRect(f / 2.0f, 0.0f, f, this.fb, direction);
                    Path path2 = this.rc;
                    Path path3 = this.iv;
                    Path.Op op = Path.Op.DIFFERENCE;
                    path2.op(path3, op);
                    this.klz.addRect(0.0f, 0.0f, this.zn / 2.0f, this.fb, direction);
                    this.klz.op(this.iv, op);
                    canvas.drawPath(this.rc, this.btk);
                    canvas.drawPath(this.klz, this.btk);
                    break;
                case "top":
                    canvas.drawRect(0.0f, 0.0f, this.zn, this.fb - uqd2, this.btk);
                    break;
                case "left":
                    canvas.drawRect(0.0f, 0.0f, this.zn - uqd, this.fb, this.btk);
                    break;
                case "right":
                    canvas.drawRect(uqd, 0.0f, this.zn, this.fb, this.btk);
                    break;
            }
            return;
        }
        this.btk.setXfermode(this.mw);
        canvas.drawRect(0.0f, 0.0f, this.zn, this.fb, this.btk);
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void zmn(int i, int i2) {
        if (i > 0 && this.zg) {
            this.zn = i;
            this.zg = false;
        }
        if (i2 <= 0 || !this.bvs) {
            return;
        }
        this.fb = i2;
        this.bvs = false;
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public List<PropertyValuesHolder> zn() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(fb(), this.hhw, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }
}
