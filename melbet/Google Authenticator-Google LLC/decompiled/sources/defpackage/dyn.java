package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyn extends Drawable {
    private static final Path a = pi.r("M20.5337 -1.94303L18.5045 -1.07337C16.8521 -0.36517 15.073 0 13.2752 0H0.5C0.223858 0 0 0.22385 0 0.5C0 0.77614 0.223858 1.0 0.5 1.0H30H59.5C59.7761 1.0 60 0.77614 60 0.5C60 0.22385 59.7761 0 59.5 0H46.7248C44.927 0 43.1479 -0.36517 41.4955 -1.07337L39.4663 -1.94303C33.4213 -4.53373 26.5787 -4.53373 20.5337 -1.94303Z");
    private final float b;
    private final Paint c;
    private final Paint d;
    private final Paint e;
    private final RectF f;
    private final Path g;
    private final Path h;
    private final Path i;
    private final Path j;
    private final Matrix k;
    private float l;
    private Bitmap m;
    private final Paint n;

    public dyn(ehi ehiVar, float f) {
        this.b = f;
        Paint paint = new Paint(1);
        paint.setColor(ehiVar.a(jhb.i));
        this.c = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(0);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        paint3.setMaskFilter(new BlurMaskFilter(Math.max(1.0f, f + f), BlurMaskFilter.Blur.NORMAL));
        this.e = paint3;
        this.f = new RectF();
        this.g = new Path();
        this.h = new Path();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.n = new Paint(1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.n);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        float width = rect.width();
        float height = rect.height();
        RectF rectF = this.f;
        rectF.set(rect);
        Path path = this.g;
        path.reset();
        float f = height / 2.0f;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        Path path2 = this.h;
        path2.reset();
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-50.0f, -50.0f);
        path2.addRect(rectF2, Path.Direction.CW);
        path2.op(path, Path.Op.DIFFERENCE);
        Paint paint = this.d;
        float f2 = this.b;
        paint.setShadowLayer(5.0f * f2, 0.6f * f2, (-0.6f) * f2, -651065601);
        this.l = f2 + f2;
        Matrix matrix = this.k;
        matrix.reset();
        matrix.setScale((width + f2) / 60.0f, (f2 * 3.0f) / 4.5f);
        matrix.postTranslate(0.0f, height - this.l);
        Path path3 = this.j;
        path3.reset();
        a.transform(matrix, path3);
        Path path4 = this.i;
        path4.reset();
        path4.addRect(0.0f, height - this.l, width, height, Path.Direction.CW);
        path4.op(path3, Path.Op.UNION);
        Paint paint2 = this.e;
        paint2.setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, new int[]{-5986305, -5986305, -10969601, -13210388, -13210388, -13210388}, new float[]{0.0f, 0.51f, 0.676f, 0.759f, 0.892f, 1.0f}, Shader.TileMode.CLAMP));
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            canvas.drawPath(path, this.c);
            canvas.drawPath(path4, paint2);
            canvas.drawPath(path2, paint);
            canvas.restoreToCount(save);
            Bitmap bitmap = this.m;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.m = createBitmap;
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.n.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.n.setColorFilter(colorFilter);
    }
}
