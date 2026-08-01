package com.bytedance.adsdk.ugeno.component.image;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import java.util.HashSet;

/* compiled from: RoundedDrawable.java */
/* loaded from: classes.dex */
public class pvs extends Drawable {
    private boolean IP;
    private final Bitmap Jd;
    private Shader.TileMode Ju;
    private final Paint Mxy;
    private final Paint NB;
    private final Matrix Wyp;
    private float bNS;
    private float cR;
    private Shader.TileMode kj;
    private final boolean[] mnm;
    private final RectF qh;
    private final int sUS;
    private final RectF so;
    private ImageView.ScaleType uc;
    private boolean vA;
    private final RectF vG;
    private final int yiw;
    private ColorStateList zM;
    private final RectF pvs = new RectF();
    private final RectF icD = new RectF();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public pvs(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.vG = rectF;
        this.so = new RectF();
        this.Wyp = new Matrix();
        this.qh = new RectF();
        this.kj = Shader.TileMode.CLAMP;
        this.Ju = Shader.TileMode.CLAMP;
        this.IP = true;
        this.bNS = 0.0f;
        this.mnm = new boolean[]{true, true, true, true};
        this.vA = false;
        this.cR = 0.0f;
        this.zM = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.uc = ImageView.ScaleType.FIT_CENTER;
        this.Jd = bitmap;
        int width = bitmap.getWidth();
        this.sUS = width;
        int height = bitmap.getHeight();
        this.yiw = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.NB = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.Mxy = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.zM.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.cR);
    }

    public static pvs pvs(Bitmap bitmap) {
        if (bitmap != null) {
            return new pvs(bitmap);
        }
        return null;
    }

    public static Drawable pvs(Drawable drawable) {
        if (drawable == null || (drawable instanceof pvs)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            Drawable.ConstantState constantState = drawable.mutate().getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), pvs(layerDrawable.getDrawable(i)));
            }
            return layerDrawable;
        }
        Bitmap icD = icD(drawable);
        return icD != null ? new pvs(icD) : drawable;
    }

    public static Bitmap icD(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.zM.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.zM.getColorForState(iArr, 0);
        if (this.Mxy.getColor() != colorForState) {
            this.Mxy.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    /* compiled from: RoundedDrawable.java */
    /* renamed from: com.bytedance.adsdk.ugeno.component.image.pvs$1, reason: invalid class name */
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
                pvs[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pvs[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pvs[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void pvs() {
        float width;
        float height;
        int i = AnonymousClass1.pvs[this.uc.ordinal()];
        if (i == 1) {
            this.so.set(this.pvs);
            RectF rectF = this.so;
            float f = this.cR;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.Wyp.reset();
            this.Wyp.setTranslate((int) (((this.so.width() - this.sUS) * 0.5f) + 0.5f), (int) (((this.so.height() - this.yiw) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.so.set(this.pvs);
            RectF rectF2 = this.so;
            float f2 = this.cR;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.Wyp.reset();
            float f3 = 0.0f;
            if (this.sUS * this.so.height() > this.so.width() * this.yiw) {
                width = this.so.height() / this.yiw;
                height = 0.0f;
                f3 = (this.so.width() - (this.sUS * width)) * 0.5f;
            } else {
                width = this.so.width() / this.sUS;
                height = (this.so.height() - (this.yiw * width)) * 0.5f;
            }
            this.Wyp.setScale(width, width);
            Matrix matrix = this.Wyp;
            float f4 = this.cR;
            matrix.postTranslate(((int) (f3 + 0.5f)) + (f4 / 2.0f), ((int) (height + 0.5f)) + (f4 / 2.0f));
        } else if (i == 3) {
            this.Wyp.reset();
            float min = (((float) this.sUS) > this.pvs.width() || ((float) this.yiw) > this.pvs.height()) ? Math.min(this.pvs.width() / this.sUS, this.pvs.height() / this.yiw) : 1.0f;
            float width2 = (int) (((this.pvs.width() - (this.sUS * min)) * 0.5f) + 0.5f);
            float height2 = (int) (((this.pvs.height() - (this.yiw * min)) * 0.5f) + 0.5f);
            this.Wyp.setScale(min, min);
            this.Wyp.postTranslate(width2, height2);
            this.so.set(this.vG);
            this.Wyp.mapRect(this.so);
            RectF rectF3 = this.so;
            float f5 = this.cR;
            rectF3.inset(f5 / 2.0f, f5 / 2.0f);
            this.Wyp.setRectToRect(this.vG, this.so, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.so.set(this.vG);
            this.Wyp.setRectToRect(this.vG, this.pvs, Matrix.ScaleToFit.END);
            this.Wyp.mapRect(this.so);
            RectF rectF4 = this.so;
            float f6 = this.cR;
            rectF4.inset(f6 / 2.0f, f6 / 2.0f);
            this.Wyp.setRectToRect(this.vG, this.so, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.so.set(this.vG);
            this.Wyp.setRectToRect(this.vG, this.pvs, Matrix.ScaleToFit.START);
            this.Wyp.mapRect(this.so);
            RectF rectF5 = this.so;
            float f7 = this.cR;
            rectF5.inset(f7 / 2.0f, f7 / 2.0f);
            this.Wyp.setRectToRect(this.vG, this.so, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.so.set(this.vG);
            this.Wyp.setRectToRect(this.vG, this.pvs, Matrix.ScaleToFit.CENTER);
            this.Wyp.mapRect(this.so);
            RectF rectF6 = this.so;
            float f8 = this.cR;
            rectF6.inset(f8 / 2.0f, f8 / 2.0f);
            this.Wyp.setRectToRect(this.vG, this.so, Matrix.ScaleToFit.FILL);
        } else {
            this.so.set(this.pvs);
            RectF rectF7 = this.so;
            float f9 = this.cR;
            rectF7.inset(f9 / 2.0f, f9 / 2.0f);
            this.Wyp.reset();
            this.Wyp.setRectToRect(this.vG, this.so, Matrix.ScaleToFit.FILL);
        }
        this.icD.set(this.so);
        this.IP = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.pvs.set(rect);
        pvs();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.IP) {
            BitmapShader bitmapShader = new BitmapShader(this.Jd, this.kj, this.Ju);
            if (this.kj == Shader.TileMode.CLAMP && this.Ju == Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.Wyp);
            }
            this.NB.setShader(bitmapShader);
            this.IP = false;
        }
        if (this.vA) {
            if (this.cR > 0.0f) {
                canvas.drawOval(this.icD, this.NB);
                canvas.drawOval(this.so, this.Mxy);
                return;
            } else {
                canvas.drawOval(this.icD, this.NB);
                return;
            }
        }
        if (pvs(this.mnm)) {
            float f = this.bNS;
            if (this.cR > 0.0f) {
                canvas.drawRoundRect(this.icD, f, f, this.NB);
                canvas.drawRoundRect(this.so, f, f, this.Mxy);
                pvs(canvas);
                icD(canvas);
                return;
            }
            canvas.drawRoundRect(this.icD, f, f, this.NB);
            pvs(canvas);
            return;
        }
        canvas.drawRect(this.icD, this.NB);
        if (this.cR > 0.0f) {
            canvas.drawRect(this.so, this.Mxy);
        }
    }

    private void pvs(Canvas canvas) {
        if (icD(this.mnm) || this.bNS == 0.0f) {
            return;
        }
        float f = this.icD.left;
        float f2 = this.icD.top;
        float width = this.icD.width() + f;
        float height = this.icD.height() + f2;
        float f3 = this.bNS;
        if (!this.mnm[0]) {
            this.qh.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.qh, this.NB);
        }
        if (!this.mnm[1]) {
            this.qh.set(width - f3, f2, width, f3);
            canvas.drawRect(this.qh, this.NB);
        }
        if (!this.mnm[2]) {
            this.qh.set(width - f3, height - f3, width, height);
            canvas.drawRect(this.qh, this.NB);
        }
        if (this.mnm[3]) {
            return;
        }
        this.qh.set(f, height - f3, f3 + f, height);
        canvas.drawRect(this.qh, this.NB);
    }

    private void icD(Canvas canvas) {
        if (icD(this.mnm) || this.bNS == 0.0f) {
            return;
        }
        float f = this.icD.left;
        float f2 = this.icD.top;
        float width = f + this.icD.width();
        float height = f2 + this.icD.height();
        float f3 = this.bNS;
        float f4 = this.cR / 2.0f;
        if (!this.mnm[0]) {
            canvas.drawLine(f - f4, f2, f + f3, f2, this.Mxy);
            canvas.drawLine(f, f2 - f4, f, f2 + f3, this.Mxy);
        }
        if (!this.mnm[1]) {
            canvas.drawLine((width - f3) - f4, f2, width, f2, this.Mxy);
            canvas.drawLine(width, f2 - f4, width, f2 + f3, this.Mxy);
        }
        if (!this.mnm[2]) {
            canvas.drawLine((width - f3) - f4, height, width + f4, height, this.Mxy);
            canvas.drawLine(width, height - f3, width, height, this.Mxy);
        }
        if (this.mnm[3]) {
            return;
        }
        canvas.drawLine(f - f4, height, f + f3, height, this.Mxy);
        canvas.drawLine(f, height - f3, f, height, this.Mxy);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.NB.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.NB.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.NB.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.NB.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.NB.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.NB.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.sUS;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.yiw;
    }

    public pvs pvs(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (!hashSet.isEmpty()) {
            float floatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(floatValue)));
            }
            this.bNS = floatValue;
        } else {
            this.bNS = 0.0f;
        }
        boolean[] zArr = this.mnm;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    public pvs pvs(float f) {
        this.cR = f;
        this.Mxy.setStrokeWidth(f);
        return this;
    }

    public pvs pvs(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.zM = colorStateList;
        this.Mxy.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public pvs pvs(boolean z) {
        this.vA = z;
        return this;
    }

    public pvs pvs(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.uc != scaleType) {
            this.uc = scaleType;
            pvs();
        }
        return this;
    }

    public pvs pvs(Shader.TileMode tileMode) {
        if (this.kj != tileMode) {
            this.kj = tileMode;
            this.IP = true;
            invalidateSelf();
        }
        return this;
    }

    public pvs icD(Shader.TileMode tileMode) {
        if (this.Ju != tileMode) {
            this.Ju = tileMode;
            this.IP = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean pvs(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean icD(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
