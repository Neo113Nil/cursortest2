package D0;

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

/* loaded from: classes.dex */
public final class F extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f821a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        i iVar = i.f844a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return iVar.a(canvas, path);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        i iVar = i.f844a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return iVar.e(canvas, rectF);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        k kVar = k.f845a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            kVar.a(canvas);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i3, int i4, int i5, int i6) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawARGB(i3, i4, i5, i6);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f3, float f4, boolean z3, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawArc(rectF, f3, f4, z3, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f3, float f4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f3, f4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i3, int i4, float[] fArr, int i5, int[] iArr, int i6, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i3, i4, fArr, i5, iArr, i6, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawCircle(f3, f4, f5, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawColor(i3);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f3, float f4, RectF rectF2, float f5, float f6, Paint paint) {
        k kVar = k.f845a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            kVar.e(canvas, rectF, f3, f4, rectF2, f5, f6, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i3, float[] fArr, int i4, int i5, Font font, Paint paint) {
        o oVar = o.f847a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            oVar.a(canvas, iArr, i3, fArr, i4, i5, font, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawLine(f3, f4, f5, f6, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i3, int i4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawLines(fArr, i3, i4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        o oVar = o.f847a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            oVar.b(canvas, ninePatch, rect, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f3, float f4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawPoint(f3, f4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i3, int i4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i3, i4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i3, int i4, float[] fArr, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i3, i4, fArr, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i3, int i4, int i5) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawRGB(i3, i4, i5);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        k kVar = k.f845a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            kVar.g(canvas, renderNode);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f3, float f4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f3, f4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i3, int i4, float f3, float f4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawText(cArr, i3, i4, f3, f4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i3, int i4, Path path, float f3, float f4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i3, i4, path, f3, f4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        C0069g c0069g = C0069g.f843a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            c0069g.b(canvas, cArr, i3, i4, i5, i6, f3, f4, z3, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i3, float[] fArr, int i4, float[] fArr2, int i5, int[] iArr, int i6, short[] sArr, int i7, int i8, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i3, fArr, i4, fArr2, i5, iArr, i6, sArr, i7, i8, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        k kVar = k.f845a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            kVar.i(canvas);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f821a;
        if (canvas == null) {
            f2.j.j("nativeCanvas");
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
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.restore();
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i3) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.restoreToCount(i3);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f3) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.rotate(f3);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.save();
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i3) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i3);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i3, int i4) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i3, i4);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f3, float f4) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.scale(f3, f4);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i3) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.setDensity(i3);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f3, float f4) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.skew(f3, f4);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f3, float f4) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.translate(f3, f4);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        i iVar = i.f844a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return iVar.d(canvas, rect);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f3, float f4, float f5, float f6, float f7, float f8, boolean z3, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawArc(f3, f4, f5, f6, f7, f8, z3, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3) {
        k kVar = k.f845a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            kVar.c(canvas, j3);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawOval(f3, f4, f5, f6, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        o oVar = o.f847a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            oVar.c(canvas, ninePatch, rectF, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawRoundRect(f3, f4, f5, f6, f7, f8, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f3, float f4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawText(str, f3, f4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f3, float f4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f3, f4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        m mVar = m.f846a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return mVar.c(canvas, rectF);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i3) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i3);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f3, float f4, float f5, float f6) {
        i iVar = i.f844a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return iVar.b(canvas, f3, f4, f5, f6);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3, PorterDuff.Mode mode) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawColor(i3, mode);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawRect(f3, f4, f5, f6, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i3, int i4, float f3, float f4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawText(str, i3, i4, f3, f4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f4, float f5, float f6, Paint paint, int i3) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f4, f5, f6, paint, i3);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f4, float f5, float f6, int i3, int i4) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f4, f5, f6, i3, i4);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i3, int i4, int i5, int i6) {
        i iVar = i.f844a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return iVar.c(canvas, i3, i4, i5, i6);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i3, int i4, float f3, float f4, int i5, int i6, boolean z3, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i3, i4, f3, f4, i5, i6, z3, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3, BlendMode blendMode) {
        k kVar = k.f845a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            kVar.b(canvas, i3, blendMode);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i3, int i4, float f3, float f4, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawText(charSequence, i3, i4, f3, f4, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        m mVar = m.f846a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return mVar.b(canvas, path);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f4, f5, f6, paint);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f4, float f5, float f6, int i3) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f4, f5, f6, i3);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f4, float f5, float f6, Region.Op op) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.clipRect(f3, f4, f5, f6, op);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, boolean z3, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i3, i4, i5, i6, i7, i8, z3, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3, BlendMode blendMode) {
        k kVar = k.f845a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            kVar.d(canvas, j3, blendMode);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        k kVar = k.f845a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            kVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        C0069g c0069g = C0069g.f843a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            c0069g.a(canvas, charSequence, i3, i4, i5, i6, f3, f4, z3, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f4, float f5, float f6, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.quickReject(f3, f4, f5, f6, edgeType);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f4, float f5, float f6) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.clipRect(f3, f4, f5, f6);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f4, float f5, float f6) {
        m mVar = m.f846a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return mVar.a(canvas, f3, f4, f5, f6);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i3, int i4, int i5, int i6) {
        Canvas canvas = this.f821a;
        if (canvas != null) {
            return canvas.clipRect(i3, i4, i5, i6);
        }
        f2.j.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        k kVar = k.f845a;
        Canvas canvas = this.f821a;
        if (canvas != null) {
            kVar.h(canvas, measuredText, i3, i4, i5, i6, f3, f4, z3, paint);
        } else {
            f2.j.j("nativeCanvas");
            throw null;
        }
    }
}
