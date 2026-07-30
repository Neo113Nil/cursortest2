package b2;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f1262a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return h.f1282a.a(canvas, path);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return h.f1282a.e(canvas, rectF);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            i.f1283a.a(canvas);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i7, int i8, int i9, int i10) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawARGB(i7, i8, i9, i10);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f9, float f10, boolean z8, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawArc(rectF, f9, f10, z8, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f9, float f10, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f9, f10, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i7, int i8, float[] fArr, int i9, int[] iArr, int i10, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i7, i8, fArr, i9, iArr, i10, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f9, float f10, float f11, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawCircle(f9, f10, f11, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i7) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawColor(i7);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f9, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            i.f1283a.e(canvas, rectF, f9, f10, rectF2, f11, f12, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i7, float[] fArr, int i8, int i9, Font font, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            m.f1285a.a(canvas, iArr, i7, fArr, i8, i9, font, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f9, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawLine(f9, f10, f11, f12, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i7, int i8, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawLines(fArr, i7, i8, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            m.f1285a.b(canvas, ninePatch, rect, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f9, float f10, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawPoint(f9, f10, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i7, int i8, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i7, i8, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i7, int i8, float[] fArr, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i7, i8, fArr, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i7, int i8, int i9) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawRGB(i7, i8, i9);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            i.f1283a.g(canvas, renderNode);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f9, float f10, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f9, f10, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i7, int i8, float f9, float f10, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawText(cArr, i7, i8, f9, f10, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i7, int i8, Path path, float f9, float f10, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i7, i8, path, f9, f10, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i7, int i8, int i9, int i10, float f9, float f10, boolean z8, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            f.f1281a.b(canvas, cArr, i7, i8, i9, i10, f9, f10, z8, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i7, float[] fArr, int i8, float[] fArr2, int i9, int[] iArr, int i10, short[] sArr, int i11, int i12, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i7, fArr, i8, fArr2, i9, iArr, i10, sArr, i11, i12, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            i.f1283a.i(canvas);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f1262a;
        if (canvas == null) {
            r6.k.j("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.restore();
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i7) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.restoreToCount(i7);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f9) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.rotate(f9);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.save();
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i7) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i7);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i7, int i8) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i7, i8);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f9, float f10) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.scale(f9, f10);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i7) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.setDensity(i7);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f9, float f10) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.skew(f9, f10);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f9, float f10) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.translate(f9, f10);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return h.f1282a.d(canvas, rect);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f9, float f10, float f11, float f12, float f13, float f14, boolean z8, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawArc(f9, f10, f11, f12, f13, f14, z8, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j8) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            i.f1283a.c(canvas, j8);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f9, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawOval(f9, f10, f11, f12, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            m.f1285a.c(canvas, ninePatch, rectF, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f9, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawRoundRect(f9, f10, f11, f12, f13, f14, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f9, float f10, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawText(str, f9, f10, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f9, float f10, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f9, f10, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return k.f1284a.c(canvas, rectF);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i7) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i7);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f9, float f10, float f11, float f12) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return h.f1282a.b(canvas, f9, f10, f11, f12);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i7, PorterDuff.Mode mode) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawColor(i7, mode);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f9, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawRect(f9, f10, f11, f12, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i7, int i8, float f9, float f10, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawText(str, i7, i8, f9, f10, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f9, float f10, float f11, float f12, Paint paint, int i7) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.saveLayer(f9, f10, f11, f12, paint, i7);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f9, float f10, float f11, float f12, int i7, int i8) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f9, f10, f11, f12, i7, i8);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i7, int i8, int i9, int i10) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return h.f1282a.c(canvas, i7, i8, i9, i10);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i7, int i8, float f9, float f10, int i9, int i10, boolean z8, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i7, i8, f9, f10, i9, i10, z8, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i7, BlendMode blendMode) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            i.f1283a.b(canvas, i7, blendMode);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            i.f1283a.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i7, int i8, float f9, float f10, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawText(charSequence, i7, i8, f9, f10, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i7, int i8, int i9, int i10, float f9, float f10, boolean z8, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            f.f1281a.a(canvas, charSequence, i7, i8, i9, i10, f9, f10, z8, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return k.f1284a.b(canvas, path);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f9, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.saveLayer(f9, f10, f11, f12, paint);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f9, float f10, float f11, float f12, int i7) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f9, f10, f11, f12, i7);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f9, float f10, float f11, float f12, Region.Op op) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.clipRect(f9, f10, f11, f12, op);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i7, int i8, int i9, int i10, int i11, int i12, boolean z8, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i7, i8, i9, i10, i11, i12, z8, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j8, BlendMode blendMode) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            i.f1283a.d(canvas, j8, blendMode);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f9, float f10, float f11, float f12, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.quickReject(f9, f10, f11, f12, edgeType);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f9, float f10, float f11, float f12) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.clipRect(f9, f10, f11, f12);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f9, float f10, float f11, float f12) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return k.f1284a.a(canvas, f9, f10, f11, f12);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i7, int i8, int i9, int i10) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            return canvas.clipRect(i7, i8, i9, i10);
        }
        r6.k.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i7, int i8, int i9, int i10, float f9, float f10, boolean z8, Paint paint) {
        Canvas canvas = this.f1262a;
        if (canvas != null) {
            i.f1283a.h(canvas, measuredText, i7, i8, i9, i10, f9, f10, z8, paint);
        } else {
            r6.k.j("nativeCanvas");
            throw null;
        }
    }
}
