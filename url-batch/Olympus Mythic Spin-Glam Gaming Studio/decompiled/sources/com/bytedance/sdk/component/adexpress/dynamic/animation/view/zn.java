package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rc;
import com.bytedance.sdk.component.adexpress.dynamic.fb.nps;

/* loaded from: classes12.dex */
public class zn {
    private int btk;
    private int fb;
    private int hhw;
    Paint zmn;
    Path fs = new Path();
    Path zn = new Path();

    public zn() {
        Paint paint = new Paint();
        this.zmn = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(Canvas canvas, IAnimation iAnimation, View view) {
        int i;
        String str;
        float[] fArr;
        int i2 = 0;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArr = nps.fs(str);
                    } catch (Exception unused) {
                        fArr = null;
                        if (!str.startsWith("#")) {
                        }
                        ((ViewGroup) view.getParent()).setClipChildren(true);
                        canvas.drawCircle(this.fb, this.btk, Math.min(r1, r4) * 2 * iAnimation.getRippleValue(), this.zmn);
                        if (iAnimation.getShineValue() != 0.0f) {
                        }
                        if (iAnimation.getMarqueeValue() == 0.0f) {
                        }
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (!str.startsWith("#")) {
                    this.zmn.setColor(Color.parseColor(str));
                    this.zmn.setAlpha(90);
                } else if (fArr != null) {
                    this.zmn.setColor(com.bytedance.sdk.component.adexpress.fb.nps.zmn(fArr[3] * (1.0f - iAnimation.getRippleValue()), fArr[0] / 256.0f, fArr[1] / 256.0f, fArr[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            canvas.drawCircle(this.fb, this.btk, Math.min(r1, r4) * 2 * iAnimation.getRippleValue(), this.zmn);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.fs.reset();
            try {
                i = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                i = 0;
            }
            if (i >= 0) {
                int shineValue = ((int) ((((this.fb * 4) + (i * 2)) + (this.btk * 2)) * iAnimation.getShineValue())) - ((this.btk * 2) + i);
                float f = shineValue;
                int i3 = this.btk;
                this.zmn.setShader(new LinearGradient(f, 0.0f, ((i + i3) / 2) + shineValue, i3 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.zmn.setStrokeWidth(this.fb * 2);
                Path path = this.zn;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i4 = shineValue + i;
                canvas.drawLine(f, 0.0f, i4 + r1, this.btk, this.zmn);
            }
        }
        if (iAnimation.getMarqueeValue() == 0.0f) {
            try {
                i2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (i2 >= 0) {
                this.fs.reset();
                this.fs.moveTo(0.0f, 0.0f);
                this.fs.lineTo(this.fb * 2, 0.0f);
                this.fs.lineTo(this.fb * 2, this.btk * 2);
                this.fs.lineTo(0.0f, this.btk * 2);
                this.fs.lineTo(0.0f, 0.0f);
                this.zmn.setShader(new LinearGradient(0.0f, 0.0f, this.fb * 2, this.btk * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.zmn.setColor(-65536);
                this.zmn.setStyle(Paint.Style.STROKE);
                this.zmn.setStrokeWidth(i2);
                canvas.drawPath(this.fs, this.zmn);
            }
        }
    }

    public void zmn(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.hhw * f);
        view.setTranslationX((r1 - r6) / 2);
        if (view instanceof rc) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i).setTranslationX((-(this.hhw - layoutParams.width)) / 2);
                i++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void zmn(View view, int i, int i2) {
        String str;
        this.fb = i / 2;
        this.btk = i2 / 2;
        if (this.hhw == 0 && view.getLayoutParams().width > 0) {
            this.hhw = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.zn.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.fb * 2);
            view.setPivotY(this.btk);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.btk);
        } else {
            view.setPivotX(this.fb);
            view.setPivotY(this.btk);
        }
    }
}
