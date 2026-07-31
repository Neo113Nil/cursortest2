package com.bytedance.adsdk.ugeno.bvs.fb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.fb;
import com.bytedance.adsdk.ugeno.zmn.nps;
import com.bytedance.adsdk.ugeno.zmn.zg;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class zmn extends ImageView implements IAnimation, nps {
    static final /* synthetic */ boolean fs = true;
    private Bitmap am;
    private Paint bjh;
    private final float[] btk;
    private ColorFilter bvs;
    private int cn;
    private int cyb;
    private boolean doe;
    private Drawable hhw;
    private fb iqz;
    private boolean iv;
    private Shader.TileMode kgc;
    private float kjb;
    private boolean klz;
    private Shader.TileMode kw;
    private boolean mw;
    private ColorStateList nps;
    private float nqi;
    private ImageView.ScaleType olo;
    private zg phc;
    private Drawable rc;
    private float rp;
    private boolean rt;
    private Path uqh;
    private final RectF yj;
    private Canvas zak;
    private float zg;
    private float zn;
    public static final Shader.TileMode zmn = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] fb = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public zmn(Context context) {
        super(context);
        this.btk = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.nps = ColorStateList.valueOf(-16777216);
        this.zg = 0.0f;
        this.bvs = null;
        this.iv = false;
        this.klz = false;
        this.mw = false;
        this.rt = false;
        Shader.TileMode tileMode = zmn;
        this.kgc = tileMode;
        this.kw = tileMode;
        this.doe = false;
        this.nqi = 50.0f;
        this.yj = new RectF();
        this.phc = new zg(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.olo;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!fs && scaleType == null) {
            throw new AssertionError();
        }
        if (this.olo != scaleType) {
            this.olo = scaleType;
            int i = AnonymousClass1.zmn[scaleType.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            zn();
            zmn(false);
            invalidate();
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.bvs.fb.zmn$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            zmn = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zmn[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zmn[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zmn[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zmn[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.cn = 0;
        this.rc = fs.zmn(drawable);
        zn();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.cn = 0;
        this.rc = fs.zmn(bitmap);
        zn();
        super.setImageDrawable(this.rc);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.cn != i) {
            this.cn = i;
            this.rc = zmn();
            zn();
            super.setImageDrawable(this.rc);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    private Drawable zmn() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.cn;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.cn, e);
                this.cn = 0;
            }
        }
        return fs.zmn(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.cyb != i) {
            this.cyb = i;
            Drawable fs2 = fs();
            this.hhw = fs2;
            setBackgroundDrawable(fs2);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.hhw = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    private Drawable fs() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.cyb;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.cyb, e);
                this.cyb = 0;
            }
        }
        return fs.zmn(drawable);
    }

    private void zn() {
        zmn(this.rc, this.olo);
    }

    private void zmn(boolean z) {
        if (this.rt) {
            if (z) {
                this.hhw = fs.zmn(this.hhw);
            }
            zmn(this.hhw, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.bvs != colorFilter) {
            this.bvs = colorFilter;
            this.klz = true;
            this.iv = true;
            fb();
            invalidate();
        }
    }

    private void fb() {
        Drawable drawable = this.rc;
        if (drawable == null || !this.iv) {
            return;
        }
        Drawable mutate = drawable.mutate();
        this.rc = mutate;
        if (this.klz) {
            mutate.setColorFilter(this.bvs);
        }
    }

    private void zmn(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof fs) {
            fs fsVar = (fs) drawable;
            fsVar.zmn(scaleType).zmn(this.zg).zmn(this.nps).zmn(this.mw).zmn(this.kgc).fs(this.kw);
            float[] fArr = this.btk;
            if (fArr != null) {
                fsVar.zmn(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            fb();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                zmn(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.hhw = drawable;
        zmn(true);
        super.setBackgroundDrawable(this.hhw);
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float f2 : this.btk) {
            f = Math.max(f2, f);
        }
        return f;
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        zmn(dimension, dimension, dimension, dimension);
    }

    public void setCornerRadius(float f) {
        zmn(f, f, f, f);
    }

    public void zmn(float f, float f2, float f3, float f4) {
        float[] fArr = this.btk;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        zn();
        zmn(false);
        invalidate();
    }

    public float getBorderWidth() {
        return this.zg;
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderWidth(float f) {
        if (this.zg == f) {
            return;
        }
        this.zg = f;
        zn();
        zmn(false);
        invalidate();
    }

    public int getBorderColor() {
        return this.nps.getDefaultColor();
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public ColorStateList getBorderColors() {
        return this.nps;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.nps.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.nps = colorStateList;
        zn();
        zmn(false);
        if (this.zg > 0.0f) {
            invalidate();
        }
    }

    public void setOval(boolean z) {
        this.mw = z;
        zn();
        zmn(false);
        invalidate();
    }

    public Shader.TileMode getTileModeX() {
        return this.kgc;
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.kgc == tileMode) {
            return;
        }
        this.kgc = tileMode;
        zn();
        zmn(false);
        invalidate();
    }

    public Shader.TileMode getTileModeY() {
        return this.kw;
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.kw == tileMode) {
            return;
        }
        this.kw = tileMode;
        zn();
        zmn(false);
        invalidate();
    }

    public void zmn(fb fbVar) {
        this.iqz = fbVar;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        fb fbVar = this.iqz;
        if (fbVar != null) {
            int[] zmn2 = fbVar.zmn(i, i2);
            super.onMeasure(zmn2[0], zmn2[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        fb fbVar = this.iqz;
        if (fbVar != null) {
            fbVar.zmn(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.doe && (canvas2 = this.zak) != null && this.am != null) {
            super.onDraw(canvas2);
            this.zak.drawPath(this.uqh, this.bjh);
            canvas.drawBitmap(this.am, 0.0f, 0.0f, (Paint) null);
        } else {
            super.onDraw(canvas);
        }
        fb fbVar = this.iqz;
        if (fbVar != null) {
            fbVar.zmn(canvas, this);
            this.iqz.zmn(canvas);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fb fbVar = this.iqz;
        if (fbVar != null) {
            fbVar.fs(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        fb fbVar = this.iqz;
        if (fbVar != null) {
            fbVar.fs(i, i2, i3, i3);
        }
        if (i <= 0 || i2 <= 0 || !this.doe) {
            return;
        }
        this.am = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.zak = new Canvas(this.am);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fb fbVar = this.iqz;
        if (fbVar != null) {
            fbVar.nps();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fb fbVar = this.iqz;
        if (fbVar != null) {
            fbVar.zg();
        }
        Canvas canvas = this.zak;
        if (canvas != null) {
            canvas.setBitmap(null);
        }
        Bitmap bitmap = this.am;
        if (bitmap != null) {
            bitmap.recycle();
            this.zak = null;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (this.doe) {
            this.iqz.nps();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.uqh.moveTo(x, y);
                this.rp = x;
                this.kjb = y;
                HashMap hashMap = new HashMap();
                hashMap.put("state", 1);
                this.iqz.zmn("eraseState", hashMap);
            } else if (action == 1) {
                this.uqh.computeBounds(this.yj, true);
                try {
                    i = (int) (((this.yj.width() * this.yj.height()) / (getWidth() * getHeight())) * 100.0f);
                } catch (Exception unused) {
                    i = 0;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("state", 2);
                hashMap2.put("percent", Integer.valueOf(i));
                this.iqz.zmn("eraseState", hashMap2);
            } else if (action == 2 && x > 0.0f && x < getWidth() && y > 0.0f && y < getHeight()) {
                float f = this.rp;
                float f2 = this.kjb;
                this.uqh.quadTo(f, f2, (f + x) / 2.0f, (f2 + y) / 2.0f);
                this.rp = x;
                this.kjb = y;
            }
            postInvalidate();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.zmn.nps
    public float getRipple() {
        return this.zn;
    }

    public void setShine(float f) {
        zg zgVar = this.phc;
        if (zgVar != null) {
            zgVar.zn(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getShine() {
        return this.phc.getShine();
    }

    public void setStretch(float f) {
        zg zgVar = this.phc;
        if (zgVar != null) {
            zgVar.fb(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getStretch() {
        return this.phc.getStretch();
    }

    public void setRubIn(float f) {
        zg zgVar = this.phc;
        if (zgVar != null) {
            zgVar.btk(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getRubIn() {
        return this.phc.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.zn = f;
        zg zgVar = this.phc;
        if (zgVar != null) {
            zgVar.fs(f);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setBorderRadius(float f) {
        zg zgVar = this.phc;
        if (zgVar != null) {
            zgVar.zmn(f);
        }
    }

    public float getBorderRadius() {
        return this.phc.zmn();
    }

    public void setEraseEnabled(boolean z) {
        if (z) {
            this.uqh = new Path();
            Paint paint = new Paint();
            this.bjh = paint;
            paint.setAntiAlias(true);
            this.bjh.setDither(true);
            this.bjh.setStyle(Paint.Style.STROKE);
            this.bjh.setStrokeWidth(this.nqi * 2.0f);
            this.bjh.setStrokeCap(Paint.Cap.ROUND);
            this.bjh.setStrokeJoin(Paint.Join.ROUND);
            this.bjh.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.bjh.setColor(0);
            this.doe = true;
        } else {
            this.doe = false;
        }
        postInvalidate();
    }

    public void setEraseRadius(float f) {
        this.nqi = f;
        Paint paint = this.bjh;
        if (paint != null) {
            paint.setStrokeWidth(f * 2.0f);
        }
    }
}
