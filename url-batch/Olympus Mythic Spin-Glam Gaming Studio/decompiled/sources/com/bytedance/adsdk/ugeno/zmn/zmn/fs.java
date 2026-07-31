package com.bytedance.adsdk.ugeno.zmn.zmn;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class fs extends zmn {
    private int btk;
    private int fb;
    private Paint hhw;
    private int zn;

    public fs(com.bytedance.adsdk.ugeno.fs.zn znVar, JSONObject jSONObject) {
        super(znVar, jSONObject);
        Paint paint = new Paint();
        this.hhw = paint;
        paint.setAntiAlias(true);
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void fs() {
        this.zn = com.bytedance.adsdk.ugeno.nps.zmn.zmn(this.zmn.optString("backgroundColor"), -1);
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
        try {
            if (this.fs.cud() > 0.0f) {
                this.hhw.setColor(this.zn);
                this.hhw.setAlpha((int) ((1.0f - this.fs.cud()) * 255.0f));
                ((ViewGroup) this.fs.rc().getParent()).setClipChildren(true);
                canvas.drawCircle(this.fb, this.btk, Math.min(r0, r2) * 2 * this.fs.cud(), this.hhw);
            }
        } catch (Throwable th) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public void zmn(int i, int i2) {
        this.fb = i / 2;
        this.btk = i2 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.zmn.zmn
    public List<PropertyValuesHolder> zn() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(fb(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }
}
