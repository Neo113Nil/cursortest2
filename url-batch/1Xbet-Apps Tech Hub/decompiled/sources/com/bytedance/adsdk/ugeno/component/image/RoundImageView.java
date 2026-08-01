package com.bytedance.adsdk.ugeno.component.image;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.core.IAnimation;

/* loaded from: classes.dex */
public class RoundImageView extends ImageView implements IAnimation {
    static final /* synthetic */ boolean icD = true;
    private boolean IP;
    private boolean Ju;
    private ColorFilter Mxy;
    private final float[] NB;
    private boolean Wyp;
    private int bNS;
    private Shader.TileMode cR;
    private boolean kj;
    private int mnm;
    private Drawable qh;
    private Drawable sUS;
    private float so;
    private com.bytedance.adsdk.ugeno.icD uc;
    private ImageView.ScaleType vA;
    private float vG;
    private ColorStateList yiw;
    private Shader.TileMode zM;
    public static final Shader.TileMode pvs = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] Jd = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public RoundImageView(Context context) {
        super(context);
        this.NB = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.yiw = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.so = 0.0f;
        this.Mxy = null;
        this.Wyp = false;
        this.kj = false;
        this.Ju = false;
        this.IP = false;
        Shader.TileMode tileMode = pvs;
        this.cR = tileMode;
        this.zM = tileMode;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.vA;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!icD && scaleType == null) {
            throw new AssertionError();
        }
        if (this.vA != scaleType) {
            this.vA = scaleType;
            switch (AnonymousClass1.pvs[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            vG();
            pvs(false);
            invalidate();
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.component.image.RoundImageView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            pvs = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pvs[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pvs[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pvs[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pvs[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pvs[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pvs[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.bNS = 0;
        this.qh = pvs.pvs(drawable);
        vG();
        super.setImageDrawable(this.qh);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.bNS = 0;
        this.qh = pvs.pvs(bitmap);
        vG();
        super.setImageDrawable(this.qh);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.bNS != i) {
            this.bNS = i;
            this.qh = pvs();
            vG();
            super.setImageDrawable(this.qh);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    private Drawable pvs() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.bNS;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.bNS, e);
                this.bNS = 0;
            }
        }
        return pvs.pvs(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.mnm != i) {
            this.mnm = i;
            Drawable icD2 = icD();
            this.sUS = icD2;
            setBackgroundDrawable(icD2);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.sUS = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    private Drawable icD() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.mnm;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.mnm, e);
                this.mnm = 0;
            }
        }
        return pvs.pvs(drawable);
    }

    private void vG() {
        pvs(this.qh, this.vA);
    }

    private void pvs(boolean z) {
        if (this.IP) {
            if (z) {
                this.sUS = pvs.pvs(this.sUS);
            }
            pvs(this.sUS, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.Mxy != colorFilter) {
            this.Mxy = colorFilter;
            this.kj = icD;
            this.Wyp = icD;
            Jd();
            invalidate();
        }
    }

    private void Jd() {
        Drawable drawable = this.qh;
        if (drawable == null || !this.Wyp) {
            return;
        }
        Drawable mutate = drawable.mutate();
        this.qh = mutate;
        if (this.kj) {
            mutate.setColorFilter(this.Mxy);
        }
    }

    private void pvs(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof pvs) {
            pvs pvsVar = (pvs) drawable;
            pvsVar.pvs(scaleType).pvs(this.so).pvs(this.yiw).pvs(this.Ju).pvs(this.cR).icD(this.zM);
            float[] fArr = this.NB;
            if (fArr != null) {
                pvsVar.pvs(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            Jd();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                pvs(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.sUS = drawable;
        pvs(icD);
        super.setBackgroundDrawable(this.sUS);
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float f2 : this.NB) {
            f = Math.max(f2, f);
        }
        return f;
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        pvs(dimension, dimension, dimension, dimension);
    }

    public void setCornerRadius(float f) {
        pvs(f, f, f, f);
    }

    public void pvs(float f, float f2, float f3, float f4) {
        float[] fArr = this.NB;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        vG();
        pvs(false);
        invalidate();
    }

    public float getBorderWidth() {
        return this.so;
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderWidth(float f) {
        if (this.so == f) {
            return;
        }
        this.so = f;
        vG();
        pvs(false);
        invalidate();
    }

    public int getBorderColor() {
        return this.yiw.getDefaultColor();
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public ColorStateList getBorderColors() {
        return this.yiw;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.yiw.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.yiw = colorStateList;
        vG();
        pvs(false);
        if (this.so > 0.0f) {
            invalidate();
        }
    }

    public void setOval(boolean z) {
        this.Ju = z;
        vG();
        pvs(false);
        invalidate();
    }

    public Shader.TileMode getTileModeX() {
        return this.cR;
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.cR == tileMode) {
            return;
        }
        this.cR = tileMode;
        vG();
        pvs(false);
        invalidate();
    }

    public Shader.TileMode getTileModeY() {
        return this.zM;
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.zM == tileMode) {
            return;
        }
        this.zM = tileMode;
        vG();
        pvs(false);
        invalidate();
    }

    public void pvs(com.bytedance.adsdk.ugeno.icD icd) {
        this.uc = icd;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.icD icd = this.uc;
        if (icd != null) {
            int[] pvs2 = icd.pvs(i, i2);
            super.onMeasure(pvs2[0], pvs2[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.icD icd = this.uc;
        if (icd != null) {
            icd.pvs(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.icD icd = this.uc;
        if (icd != null) {
            icd.pvs(canvas, this);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.icD icd = this.uc;
        if (icd != null) {
            icd.icD(i, i2, i3, i3);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.icD icd = this.uc;
        if (icd != null) {
            icd.sUS();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.icD icd = this.uc;
        if (icd != null) {
            icd.yiw();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.vG;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.vG = f;
        postInvalidate();
    }
}
