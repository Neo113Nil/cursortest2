package com.baidu.platform.comapi.wnplatform.arclayout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import com.baidu.platform.comapi.wnplatform.arclayout.b.b;

/* loaded from: classes2.dex */
public abstract class a extends RelativeLayout {
    private Bitmap clipBitmap;
    private com.baidu.platform.comapi.wnplatform.arclayout.b.a clipManager;
    private final Paint clipPaint;
    private final Path clipPath;
    protected Drawable drawable;
    protected PorterDuffXfermode pdMode;
    final Path rectView;
    private boolean requiersShapeUpdate;

    /* renamed from: com.baidu.platform.comapi.wnplatform.arclayout.a$a, reason: collision with other inner class name */
    class C0140a extends ViewOutlineProvider {
        C0140a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Path c8;
            if (a.this.clipManager == null || (c8 = a.this.clipManager.c()) == null) {
                return;
            }
            try {
                outline.setConvexPath(c8);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public a(Context context) {
        super(context);
        this.clipPaint = new Paint(1);
        this.clipPath = new Path();
        this.pdMode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.drawable = null;
        this.clipManager = new b();
        this.requiersShapeUpdate = true;
        this.rectView = new Path();
        init(context, null);
    }

    private void calculateLayout(int i8, int i9) {
        this.rectView.reset();
        this.rectView.addRect(0.0f, 0.0f, getWidth() * 1.0f, getHeight() * 1.0f, Path.Direction.CW);
        com.baidu.platform.comapi.wnplatform.arclayout.b.a aVar = this.clipManager;
        if (aVar != null && i8 > 0 && i9 > 0) {
            aVar.a(i8, i9);
            this.clipPath.reset();
            this.clipPath.set(this.clipManager.b(i8, i9));
            if (requiresBitmap()) {
                Bitmap bitmap = this.clipBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.clipBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.clipBitmap);
                Drawable drawable = this.drawable;
                if (drawable != null) {
                    drawable.setBounds(0, 0, i8, i9);
                    this.drawable.draw(canvas);
                } else {
                    canvas.drawPath(this.clipPath, this.clipManager.b());
                }
            }
            if (Build.VERSION.SDK_INT > 27) {
                this.rectView.op(this.clipPath, Path.Op.DIFFERENCE);
            }
        }
        postInvalidate();
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.clipPaint.setAntiAlias(true);
        setDrawingCacheEnabled(true);
        setWillNotDraw(false);
        this.clipPaint.setColor(-16776961);
        this.clipPaint.setStyle(Paint.Style.FILL);
        this.clipPaint.setStrokeWidth(1.0f);
        if (Build.VERSION.SDK_INT <= 27) {
            this.clipPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            setLayerType(1, this.clipPaint);
        } else {
            this.clipPaint.setXfermode(this.pdMode);
            setLayerType(1, null);
        }
    }

    private boolean requiresBitmap() {
        com.baidu.platform.comapi.wnplatform.arclayout.b.a aVar;
        return isInEditMode() || ((aVar = this.clipManager) != null && aVar.a()) || this.drawable != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.requiersShapeUpdate) {
            calculateLayout(canvas.getWidth(), canvas.getHeight());
            this.requiersShapeUpdate = false;
        }
        if (requiresBitmap()) {
            this.clipPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(this.clipBitmap, 0.0f, 0.0f, this.clipPaint);
        } else if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.clipPath, this.clipPaint);
        } else {
            canvas.drawPath(this.rectView, this.clipPaint);
        }
        setLayerType(2, null);
    }

    protected int dpToPx(float f8) {
        return (int) TypedValue.applyDimension(1, f8, Resources.getSystem().getDisplayMetrics());
    }

    @Override // android.view.View
    @TargetApi(21)
    public ViewOutlineProvider getOutlineProvider() {
        return new C0140a();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        if (z7) {
            requiresShapeUpdate();
        }
    }

    public void requiresShapeUpdate() {
        this.requiersShapeUpdate = true;
        postInvalidate();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
    }

    public void setClipPathCreator(b.a aVar) {
        ((b) this.clipManager).a(aVar);
        requiresShapeUpdate();
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
        requiresShapeUpdate();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clipPaint = new Paint(1);
        this.clipPath = new Path();
        this.pdMode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.drawable = null;
        this.clipManager = new b();
        this.requiersShapeUpdate = true;
        this.rectView = new Path();
        init(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.clipPaint = new Paint(1);
        this.clipPath = new Path();
        this.pdMode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.drawable = null;
        this.clipManager = new b();
        this.requiersShapeUpdate = true;
        this.rectView = new Path();
        init(context, attributeSet);
    }
}
