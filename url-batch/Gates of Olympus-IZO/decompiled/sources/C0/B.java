package C0;

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
public final class B extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f424a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        f fVar = f.f443a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return fVar.a(canvas, path);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        f fVar = f.f443a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return fVar.e(canvas, rectF);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        h hVar = h.f444a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            hVar.a(canvas);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i3, int i4, int i5, int i6) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawARGB(i3, i4, i5, i6);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f3, float f4, boolean z3, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawArc(rectF, f3, f4, z3, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f3, float f4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f3, f4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i3, int i4, float[] fArr, int i5, int[] iArr, int i6, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i3, i4, fArr, i5, iArr, i6, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawCircle(f3, f4, f5, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawColor(i3);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f3, float f4, RectF rectF2, float f5, float f6, Paint paint) {
        h hVar = h.f444a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            hVar.e(canvas, rectF, f3, f4, rectF2, f5, f6, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i3, float[] fArr, int i4, int i5, Font font, Paint paint) {
        l lVar = l.f446a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            lVar.a(canvas, iArr, i3, fArr, i4, i5, font, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawLine(f3, f4, f5, f6, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i3, int i4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawLines(fArr, i3, i4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        l lVar = l.f446a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            lVar.b(canvas, ninePatch, rect, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f3, float f4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawPoint(f3, f4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i3, int i4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i3, i4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i3, int i4, float[] fArr, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i3, i4, fArr, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i3, int i4, int i5) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawRGB(i3, i4, i5);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        h hVar = h.f444a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            hVar.g(canvas, renderNode);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f3, float f4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f3, f4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i3, int i4, float f3, float f4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawText(cArr, i3, i4, f3, f4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i3, int i4, Path path, float f3, float f4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i3, i4, path, f3, f4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        C0012d c0012d = C0012d.f442a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            c0012d.b(canvas, cArr, i3, i4, i5, i6, f3, f4, z3, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i3, float[] fArr, int i4, float[] fArr2, int i5, int[] iArr, int i6, short[] sArr, int i7, int i8, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i3, fArr, i4, fArr2, i5, iArr, i6, sArr, i7, i8, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        h hVar = h.f444a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            hVar.i(canvas);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f424a;
        if (canvas == null) {
            Z1.i.j("nativeCanvas");
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
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.restore();
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i3) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.restoreToCount(i3);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f3) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.rotate(f3);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.save();
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i3) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i3);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i3, int i4) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i3, i4);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f3, float f4) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.scale(f3, f4);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i3) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.setDensity(i3);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f3, float f4) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.skew(f3, f4);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f3, float f4) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.translate(f3, f4);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        f fVar = f.f443a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return fVar.d(canvas, rect);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f3, float f4, float f5, float f6, float f7, float f8, boolean z3, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawArc(f3, f4, f5, f6, f7, f8, z3, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3) {
        h hVar = h.f444a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            hVar.c(canvas, j3);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawOval(f3, f4, f5, f6, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        l lVar = l.f446a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            lVar.c(canvas, ninePatch, rectF, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawRoundRect(f3, f4, f5, f6, f7, f8, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f3, float f4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawText(str, f3, f4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f3, float f4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f3, f4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        j jVar = j.f445a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return jVar.c(canvas, rectF);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i3) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i3);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f3, float f4, float f5, float f6) {
        f fVar = f.f443a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return fVar.b(canvas, f3, f4, f5, f6);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3, PorterDuff.Mode mode) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawColor(i3, mode);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawRect(f3, f4, f5, f6, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i3, int i4, float f3, float f4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawText(str, i3, i4, f3, f4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f4, float f5, float f6, Paint paint, int i3) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f4, f5, f6, paint, i3);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f4, float f5, float f6, int i3, int i4) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f4, f5, f6, i3, i4);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i3, int i4, int i5, int i6) {
        f fVar = f.f443a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return fVar.c(canvas, i3, i4, i5, i6);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i3, int i4, float f3, float f4, int i5, int i6, boolean z3, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i3, i4, f3, f4, i5, i6, z3, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3, BlendMode blendMode) {
        h hVar = h.f444a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            hVar.b(canvas, i3, blendMode);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i3, int i4, float f3, float f4, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawText(charSequence, i3, i4, f3, f4, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        j jVar = j.f445a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return jVar.b(canvas, path);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f4, f5, f6, paint);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f4, float f5, float f6, int i3) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f4, f5, f6, i3);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f4, float f5, float f6, Region.Op op) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.clipRect(f3, f4, f5, f6, op);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, boolean z3, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i3, i4, i5, i6, i7, i8, z3, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3, BlendMode blendMode) {
        h hVar = h.f444a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            hVar.d(canvas, j3, blendMode);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        h hVar = h.f444a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            hVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        C0012d c0012d = C0012d.f442a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            c0012d.a(canvas, charSequence, i3, i4, i5, i6, f3, f4, z3, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f4, float f5, float f6, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.quickReject(f3, f4, f5, f6, edgeType);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f4, float f5, float f6) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.clipRect(f3, f4, f5, f6);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f4, float f5, float f6) {
        j jVar = j.f445a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return jVar.a(canvas, f3, f4, f5, f6);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i3, int i4, int i5, int i6) {
        Canvas canvas = this.f424a;
        if (canvas != null) {
            return canvas.clipRect(i3, i4, i5, i6);
        }
        Z1.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        h hVar = h.f444a;
        Canvas canvas = this.f424a;
        if (canvas != null) {
            hVar.h(canvas, measuredText, i3, i4, i5, i6, f3, f4, z3, paint);
        } else {
            Z1.i.j("nativeCanvas");
            throw null;
        }
    }
}
