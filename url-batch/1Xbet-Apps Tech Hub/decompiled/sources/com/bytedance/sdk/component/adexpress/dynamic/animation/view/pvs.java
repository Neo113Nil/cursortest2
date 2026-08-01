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
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;
import com.bytedance.sdk.component.adexpress.dynamic.vG.yiw;

/* compiled from: AnimationWrapper.java */
/* loaded from: classes.dex */
public class pvs {
    private int Jd;
    private int NB;
    Paint pvs;
    private int sUS;
    Path icD = new Path();
    Path vG = new Path();

    public pvs() {
        Paint paint = new Paint();
        this.pvs = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(Canvas canvas, IAnimation iAnimation, View view) {
        int i;
        int i2;
        String str;
        float[] fArr;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArr = yiw.icD(str);
                    } catch (Exception unused) {
                        fArr = null;
                        if (!str.startsWith("#")) {
                        }
                        ((ViewGroup) view.getParent()).setClipChildren(true);
                        canvas.drawCircle(this.Jd, this.NB, Math.min(r1, r4) * 2 * iAnimation.getRippleValue(), this.pvs);
                        if (iAnimation.getShineValue() != 0.0f) {
                        }
                        if (iAnimation.getMarqueeValue() == 0.0f) {
                        }
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (!str.startsWith("#")) {
                    this.pvs.setColor(Color.parseColor(str));
                    this.pvs.setAlpha(90);
                } else if (fArr != null) {
                    this.pvs.setColor(com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(fArr[3] * (1.0f - iAnimation.getRippleValue()), fArr[0] / 256.0f, fArr[1] / 256.0f, fArr[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            canvas.drawCircle(this.Jd, this.NB, Math.min(r1, r4) * 2 * iAnimation.getRippleValue(), this.pvs);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.icD.reset();
            try {
                i2 = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                i2 = 0;
            }
            if (i2 >= 0) {
                int shineValue = ((int) ((((this.Jd * 4) + (i2 * 2)) + (this.NB * 2)) * iAnimation.getShineValue())) - ((this.NB * 2) + i2);
                float f = shineValue;
                int i3 = this.NB;
                this.pvs.setShader(new LinearGradient(f, 0.0f, ((i2 + i3) / 2) + shineValue, i3 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.pvs.setStrokeWidth(this.Jd * 2);
                Path path = this.vG;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i4 = shineValue + i2;
                canvas.drawLine(f, 0.0f, i4 + r1, this.NB, this.pvs);
            }
        }
        if (iAnimation.getMarqueeValue() == 0.0f) {
            try {
                i = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
                i = 0;
            }
            if (i >= 0) {
                this.icD.reset();
                this.icD.moveTo(0.0f, 0.0f);
                this.icD.lineTo(this.Jd * 2, 0.0f);
                this.icD.lineTo(this.Jd * 2, this.NB * 2);
                this.icD.lineTo(0.0f, this.NB * 2);
                this.icD.lineTo(0.0f, 0.0f);
                this.pvs.setShader(new LinearGradient(0.0f, 0.0f, this.Jd * 2, this.NB * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.pvs.setColor(-65536);
                this.pvs.setStyle(Paint.Style.STROKE);
                this.pvs.setStrokeWidth(i);
                canvas.drawPath(this.icD, this.pvs);
            }
        }
    }

    public void pvs(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.sUS * f);
        view.setTranslationX((this.sUS - layoutParams.width) / 2);
        if (view instanceof DynamicImageView) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i).setTranslationX((-(this.sUS - layoutParams.width)) / 2);
                i++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void pvs(View view, int i, int i2) {
        String str;
        this.Jd = i / 2;
        this.NB = i2 / 2;
        if (this.sUS == 0 && view.getLayoutParams().width > 0) {
            this.sUS = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.vG.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.Jd * 2);
            view.setPivotY(this.NB);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.NB);
        } else {
            view.setPivotX(this.Jd);
            view.setPivotY(this.NB);
        }
    }
}
