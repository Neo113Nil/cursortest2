package h2;

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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f3102a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        boolean clipOutPath;
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            clipOutPath = canvas.clipOutPath(path);
            return clipOutPath;
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        boolean clipOutRect;
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(rectF);
            return clipOutRect;
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i8, int i9, int i10) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawARGB(i, i8, i9, i10);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f6, float f8, boolean z3, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawArc(rectF, f6, f8, z3, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f6, float f8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f6, f8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i8, float[] fArr, int i9, int[] iArr, int i10, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i, i8, fArr, i9, iArr, i10, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f6, float f8, float f9, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawCircle(f6, f8, f9, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawColor(i);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f6, float f8, RectF rectF2, float f9, float f10, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, f6, f8, rectF2, f9, f10, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i8, int i9, Font font, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawGlyphs(iArr, i, fArr, i8, i9, font, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f6, float f8, float f9, float f10, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawLine(f6, f8, f9, f10, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawLines(fArr, i, i8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rect, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f6, float f8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPoint(f6, f8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i, i8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i8, float[] fArr, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i, i8, fArr, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i8, int i9) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawRGB(i, i8, i9);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f6, float f8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f6, f8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i8, float f6, float f8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawText(cArr, i, i8, f6, f8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i8, Path path, float f6, float f8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i, i8, path, f6, f8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i8, int i9, int i10, float f6, float f8, boolean z3, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i, i8, i9, i10, f6, f8, z3, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i8, float[] fArr2, int i9, int[] iArr, int i10, short[] sArr, int i11, int i12, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i, fArr, i8, fArr2, i9, iArr, i10, sArr, i11, i12, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f3102a;
        if (canvas == null) {
            q6.i.j("nativeCanvas");
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
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.restore();
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.restoreToCount(i);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f6) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.rotate(f6);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.save();
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i8) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i8);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f6, float f8) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.scale(f6, f8);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.setDensity(i);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f6, float f8) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.skew(f6, f8);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f6, float f8) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.translate(f6, f8);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f6, float f8, float f9, float f10, float f11, float f12, boolean z3, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawArc(f6, f8, f9, f10, f11, f12, z3, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j7) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawColor(j7);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f6, float f8, float f9, float f10, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawOval(f6, f8, f9, f10, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f6, float f8, float f9, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawRoundRect(f6, f8, f9, f10, f11, f12, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f6, float f8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawText(str, f6, f8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f6, float f8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f6, f8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        boolean quickReject;
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            quickReject = canvas.quickReject(rectF);
            return quickReject;
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f6, float f8, float f9, float f10, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawRect(f6, f8, f9, f10, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i8, float f6, float f8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawText(str, i, i8, f6, f8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f8, float f9, float f10, Paint paint, int i) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.saveLayer(f6, f8, f9, f10, paint, i);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f8, float f9, float f10, int i, int i8) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f6, f8, f9, f10, i, i8);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        boolean clipOutRect;
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(rect);
            return clipOutRect;
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i8, float f6, float f8, int i9, int i10, boolean z3, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i8, f6, f8, i9, i10, z3, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rectF, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i8, float f6, float f8, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawText(charSequence, i, i8, f6, f8, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i8, int i9, int i10, float f6, float f8, boolean z3, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i, i8, i9, i10, f6, f8, z3, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f8, float f9, float f10, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.saveLayer(f6, f8, f9, f10, paint);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f8, float f9, float f10, int i) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f6, f8, f9, f10, i);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f8, float f9, float f10, Region.Op op) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.clipRect(f6, f8, f9, f10, op);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i8, int i9, int i10, int i11, int i12, boolean z3, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i8, i9, i10, i11, i12, z3, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawColor(i, mode);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f8, float f9, float f10) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.clipRect(f6, f8, f9, f10);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawColor(i, blendMode);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        boolean quickReject;
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            quickReject = canvas.quickReject(path);
            return quickReject;
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f6, float f8, float f9, float f10) {
        boolean clipOutRect;
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(f6, f8, f9, f10);
            return clipOutRect;
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i8, int i9, int i10) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.clipRect(i, i8, i9, i10);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i8, int i9, int i10, float f6, float f8, boolean z3, Paint paint) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawTextRun(measuredText, i, i8, i9, i10, f6, f8, z3, paint);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j7, BlendMode blendMode) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            canvas.drawColor(j7, blendMode);
        } else {
            q6.i.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f8, float f9, float f10, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            return canvas.quickReject(f6, f8, f9, f10, edgeType);
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i8, int i9, int i10) {
        boolean clipOutRect;
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(i, i8, i9, i10);
            return clipOutRect;
        }
        q6.i.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f8, float f9, float f10) {
        boolean quickReject;
        Canvas canvas = this.f3102a;
        if (canvas != null) {
            quickReject = canvas.quickReject(f6, f8, f9, f10);
            return quickReject;
        }
        q6.i.j("nativeCanvas");
        throw null;
    }
}
