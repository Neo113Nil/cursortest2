package com.bytedance.adsdk.ugeno.bvs.fb;

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
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class fs extends Drawable {
    private final Paint btk;
    private final Paint bvs;
    private float cn;
    private final boolean[] cyb;
    private final Bitmap fb;
    private final int hhw;
    private ImageView.ScaleType iqz;
    private final Matrix iv;
    private float kgc;
    private Shader.TileMode klz;
    private ColorStateList kw;
    private Shader.TileMode mw;
    private final int nps;
    private boolean olo;
    private final RectF rc;
    private boolean rt;
    private final RectF zg;
    private final RectF zn;
    private final RectF zmn = new RectF();
    private final RectF fs = new RectF();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public fs(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.zn = rectF;
        this.zg = new RectF();
        this.iv = new Matrix();
        this.rc = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.klz = tileMode;
        this.mw = tileMode;
        this.rt = true;
        this.cn = 0.0f;
        this.cyb = new boolean[]{true, true, true, true};
        this.olo = false;
        this.kgc = 0.0f;
        this.kw = ColorStateList.valueOf(-16777216);
        this.iqz = ImageView.ScaleType.FIT_CENTER;
        this.fb = bitmap;
        int width = bitmap.getWidth();
        this.hhw = width;
        int height = bitmap.getHeight();
        this.nps = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.btk = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.bvs = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.kw.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.kgc);
    }

    public static fs zmn(Bitmap bitmap) {
        if (bitmap != null) {
            return new fs(bitmap);
        }
        return null;
    }

    public static Drawable zmn(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof fs) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(drawable)) {
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
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), zmn(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap fs = fs(drawable);
        return fs != null ? new fs(fs) : drawable;
    }

    public static Bitmap fs(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
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
        return this.kw.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.kw.getColorForState(iArr, 0);
        if (this.bvs.getColor() != colorForState) {
            this.bvs.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.bvs.fb.fs$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            zmn = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zmn[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zmn[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zmn[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zmn[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void zmn() {
        float width;
        float height;
        int i = AnonymousClass1.zmn[this.iqz.ordinal()];
        if (i == 1) {
            this.zg.set(this.zmn);
            RectF rectF = this.zg;
            float f = this.kgc;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.iv.reset();
            this.iv.setTranslate((int) (((this.zg.width() - this.hhw) * 0.5f) + 0.5f), (int) (((this.zg.height() - this.nps) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.zg.set(this.zmn);
            RectF rectF2 = this.zg;
            float f2 = this.kgc;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.iv.reset();
            float f3 = 0.0f;
            if (this.hhw * this.zg.height() > this.zg.width() * this.nps) {
                width = this.zg.height() / this.nps;
                height = 0.0f;
                f3 = (this.zg.width() - (this.hhw * width)) * 0.5f;
            } else {
                width = this.zg.width() / this.hhw;
                height = (this.zg.height() - (this.nps * width)) * 0.5f;
            }
            this.iv.setScale(width, width);
            Matrix matrix = this.iv;
            float f4 = this.kgc;
            matrix.postTranslate(((int) (f3 + 0.5f)) + (f4 / 2.0f), ((int) (height + 0.5f)) + (f4 / 2.0f));
        } else if (i == 3) {
            this.iv.reset();
            float min = (((float) this.hhw) > this.zmn.width() || ((float) this.nps) > this.zmn.height()) ? Math.min(this.zmn.width() / this.hhw, this.zmn.height() / this.nps) : 1.0f;
            float width2 = (int) (((this.zmn.width() - (this.hhw * min)) * 0.5f) + 0.5f);
            float height2 = (int) (((this.zmn.height() - (this.nps * min)) * 0.5f) + 0.5f);
            this.iv.setScale(min, min);
            this.iv.postTranslate(width2, height2);
            this.zg.set(this.zn);
            this.iv.mapRect(this.zg);
            RectF rectF3 = this.zg;
            float f5 = this.kgc;
            rectF3.inset(f5 / 2.0f, f5 / 2.0f);
            this.iv.setRectToRect(this.zn, this.zg, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.zg.set(this.zn);
            this.iv.setRectToRect(this.zn, this.zmn, Matrix.ScaleToFit.END);
            this.iv.mapRect(this.zg);
            RectF rectF4 = this.zg;
            float f6 = this.kgc;
            rectF4.inset(f6 / 2.0f, f6 / 2.0f);
            this.iv.setRectToRect(this.zn, this.zg, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.zg.set(this.zn);
            this.iv.setRectToRect(this.zn, this.zmn, Matrix.ScaleToFit.START);
            this.iv.mapRect(this.zg);
            RectF rectF5 = this.zg;
            float f7 = this.kgc;
            rectF5.inset(f7 / 2.0f, f7 / 2.0f);
            this.iv.setRectToRect(this.zn, this.zg, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.zg.set(this.zn);
            this.iv.setRectToRect(this.zn, this.zmn, Matrix.ScaleToFit.CENTER);
            this.iv.mapRect(this.zg);
            RectF rectF6 = this.zg;
            float f8 = this.kgc;
            rectF6.inset(f8 / 2.0f, f8 / 2.0f);
            this.iv.setRectToRect(this.zn, this.zg, Matrix.ScaleToFit.FILL);
        } else {
            this.zg.set(this.zmn);
            RectF rectF7 = this.zg;
            float f9 = this.kgc;
            rectF7.inset(f9 / 2.0f, f9 / 2.0f);
            this.iv.reset();
            this.iv.setRectToRect(this.zn, this.zg, Matrix.ScaleToFit.FILL);
        }
        this.fs.set(this.zg);
        this.rt = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.zmn.set(rect);
        zmn();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.rt) {
            BitmapShader bitmapShader = new BitmapShader(this.fb, this.klz, this.mw);
            Shader.TileMode tileMode = this.klz;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.mw == tileMode2) {
                bitmapShader.setLocalMatrix(this.iv);
            }
            this.btk.setShader(bitmapShader);
            this.rt = false;
        }
        if (this.olo) {
            if (this.kgc > 0.0f) {
                canvas.drawOval(this.fs, this.btk);
                canvas.drawOval(this.zg, this.bvs);
                return;
            } else {
                canvas.drawOval(this.fs, this.btk);
                return;
            }
        }
        if (zmn(this.cyb)) {
            float f = this.cn;
            if (this.kgc > 0.0f) {
                canvas.drawRoundRect(this.fs, f, f, this.btk);
                canvas.drawRoundRect(this.zg, f, f, this.bvs);
                zmn(canvas);
                fs(canvas);
                return;
            }
            canvas.drawRoundRect(this.fs, f, f, this.btk);
            zmn(canvas);
            return;
        }
        canvas.drawRect(this.fs, this.btk);
        if (this.kgc > 0.0f) {
            canvas.drawRect(this.zg, this.bvs);
        }
    }

    private void zmn(Canvas canvas) {
        if (fs(this.cyb) || this.cn == 0.0f) {
            return;
        }
        RectF rectF = this.fs;
        float f = rectF.left;
        float f2 = rectF.top;
        float width = rectF.width() + f;
        float height = this.fs.height() + f2;
        float f3 = this.cn;
        if (!this.cyb[0]) {
            this.rc.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.rc, this.btk);
        }
        if (!this.cyb[1]) {
            this.rc.set(width - f3, f2, width, f3);
            canvas.drawRect(this.rc, this.btk);
        }
        if (!this.cyb[2]) {
            this.rc.set(width - f3, height - f3, width, height);
            canvas.drawRect(this.rc, this.btk);
        }
        if (this.cyb[3]) {
            return;
        }
        this.rc.set(f, height - f3, f3 + f, height);
        canvas.drawRect(this.rc, this.btk);
    }

    private void fs(Canvas canvas) {
        float f;
        if (fs(this.cyb) || this.cn == 0.0f) {
            return;
        }
        RectF rectF = this.fs;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float width = rectF.width() + f2;
        float height = f3 + this.fs.height();
        float f4 = this.cn;
        float f5 = this.kgc / 2.0f;
        if (!this.cyb[0]) {
            canvas.drawLine(f2 - f5, f3, f2 + f4, f3, this.bvs);
            canvas.drawLine(f2, f3 - f5, f2, f3 + f4, this.bvs);
        }
        if (!this.cyb[1]) {
            canvas.drawLine((width - f4) - f5, f3, width, f3, this.bvs);
            canvas.drawLine(width, f3 - f5, width, f3 + f4, this.bvs);
        }
        if (this.cyb[2]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine((width - f4) - f5, height, width + f5, height, this.bvs);
            canvas.drawLine(width, height - f, width, height, this.bvs);
        }
        if (this.cyb[3]) {
            return;
        }
        canvas.drawLine(f2 - f5, height, f2 + f, height, this.bvs);
        canvas.drawLine(f2, height - f, f2, height, this.bvs);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.btk.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.btk.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.btk.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.btk.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.btk.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.btk.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.hhw;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.nps;
    }

    public fs zmn(float f, float f2, float f3, float f4) {
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
            this.cn = floatValue;
        } else {
            this.cn = 0.0f;
        }
        boolean[] zArr = this.cyb;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    public fs zmn(float f) {
        this.kgc = f;
        this.bvs.setStrokeWidth(f);
        return this;
    }

    public fs zmn(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.kw = colorStateList;
        this.bvs.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public fs zmn(boolean z) {
        this.olo = z;
        return this;
    }

    public fs zmn(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.iqz != scaleType) {
            this.iqz = scaleType;
            zmn();
        }
        return this;
    }

    public fs zmn(Shader.TileMode tileMode) {
        if (this.klz != tileMode) {
            this.klz = tileMode;
            this.rt = true;
            invalidateSelf();
        }
        return this;
    }

    public fs fs(Shader.TileMode tileMode) {
        if (this.mw != tileMode) {
            this.mw = tileMode;
            this.rt = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean zmn(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean fs(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
