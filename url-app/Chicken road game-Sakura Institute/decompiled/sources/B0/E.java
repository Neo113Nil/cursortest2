package B0;

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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f899a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        h hVar = h.f922a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return hVar.a(canvas, path);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        h hVar = h.f922a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return hVar.e(canvas, rectF);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        j jVar = j.f923a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            jVar.a(canvas);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i2, int i4, int i5, int i6) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawARGB(i2, i4, i5, i6);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f4, float f5, boolean z4, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawArc(rectF, f4, f5, z4, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f4, float f5, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f4, f5, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i2, int i4, float[] fArr, int i5, int[] iArr, int i6, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i2, i4, fArr, i5, iArr, i6, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawCircle(f4, f5, f6, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawColor(i2);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f4, float f5, RectF rectF2, float f6, float f7, Paint paint) {
        j jVar = j.f923a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            jVar.e(canvas, rectF, f4, f5, rectF2, f6, f7, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i2, float[] fArr, int i4, int i5, Font font, Paint paint) {
        n nVar = n.f925a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            nVar.a(canvas, iArr, i2, fArr, i4, i5, font, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f4, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawLine(f4, f5, f6, f7, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i2, int i4, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawLines(fArr, i2, i4, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        n nVar = n.f925a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            nVar.b(canvas, ninePatch, rect, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f4, float f5, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawPoint(f4, f5, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i2, int i4, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i2, i4, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i2, int i4, float[] fArr, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i2, i4, fArr, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i2, int i4, int i5) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawRGB(i2, i4, i5);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        j jVar = j.f923a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            jVar.g(canvas, renderNode);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f4, float f5, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f4, f5, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i2, int i4, float f4, float f5, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawText(cArr, i2, i4, f4, f5, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i2, int i4, Path path, float f4, float f5, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i2, i4, path, f4, f5, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i2, int i4, int i5, int i6, float f4, float f5, boolean z4, Paint paint) {
        C0093g c0093g = C0093g.f921a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            c0093g.b(canvas, cArr, i2, i4, i5, i6, f4, f5, z4, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i2, float[] fArr, int i4, float[] fArr2, int i5, int[] iArr, int i6, short[] sArr, int i7, int i8, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i2, fArr, i4, fArr2, i5, iArr, i6, sArr, i7, i8, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        j jVar = j.f923a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            jVar.i(canvas);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f899a;
        if (canvas == null) {
            Intrinsics.g("nativeCanvas");
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
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.restore();
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i2) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.restoreToCount(i2);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f4) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.rotate(f4);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.save();
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i2) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i2);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i2, int i4) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i2, i4);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f4, float f5) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.scale(f4, f5);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i2) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.setDensity(i2);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f4, float f5) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.skew(f4, f5);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f4, float f5) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.translate(f4, f5);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        h hVar = h.f922a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return hVar.d(canvas, rect);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f4, float f5, float f6, float f7, float f8, float f9, boolean z4, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawArc(f4, f5, f6, f7, f8, f9, z4, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j4) {
        j jVar = j.f923a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            jVar.c(canvas, j4);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f4, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawOval(f4, f5, f6, f7, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        n nVar = n.f925a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            nVar.c(canvas, ninePatch, rectF, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f4, float f5, float f6, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawRoundRect(f4, f5, f6, f7, f8, f9, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f4, float f5, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawText(str, f4, f5, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f4, float f5, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f4, f5, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        l lVar = l.f924a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return lVar.c(canvas, rectF);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i2) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i2);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f4, float f5, float f6, float f7) {
        h hVar = h.f922a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return hVar.b(canvas, f4, f5, f6, f7);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2, PorterDuff.Mode mode) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawColor(i2, mode);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f4, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawRect(f4, f5, f6, f7, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i2, int i4, float f4, float f5, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawText(str, i2, i4, f4, f5, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f4, float f5, float f6, float f7, Paint paint, int i2) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.saveLayer(f4, f5, f6, f7, paint, i2);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f4, float f5, float f6, float f7, int i2, int i4) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f4, f5, f6, f7, i2, i4);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i2, int i4, int i5, int i6) {
        h hVar = h.f922a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return hVar.c(canvas, i2, i4, i5, i6);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i2, int i4, float f4, float f5, int i5, int i6, boolean z4, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i2, i4, f4, f5, i5, i6, z4, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2, BlendMode blendMode) {
        j jVar = j.f923a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            jVar.b(canvas, i2, blendMode);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i2, int i4, float f4, float f5, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawText(charSequence, i2, i4, f4, f5, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        l lVar = l.f924a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return lVar.b(canvas, path);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f4, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.saveLayer(f4, f5, f6, f7, paint);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f4, float f5, float f6, float f7, int i2) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f4, f5, f6, f7, i2);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f4, float f5, float f6, float f7, Region.Op op) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.clipRect(f4, f5, f6, f7, op);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i2, int i4, int i5, int i6, int i7, int i8, boolean z4, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i2, i4, i5, i6, i7, i8, z4, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j4, BlendMode blendMode) {
        j jVar = j.f923a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            jVar.d(canvas, j4, blendMode);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        j jVar = j.f923a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            jVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i2, int i4, int i5, int i6, float f4, float f5, boolean z4, Paint paint) {
        C0093g c0093g = C0093g.f921a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            c0093g.a(canvas, charSequence, i2, i4, i5, i6, f4, f5, z4, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f4, float f5, float f6, float f7, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.quickReject(f4, f5, f6, f7, edgeType);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f4, float f5, float f6, float f7) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.clipRect(f4, f5, f6, f7);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f4, float f5, float f6, float f7) {
        l lVar = l.f924a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return lVar.a(canvas, f4, f5, f6, f7);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i2, int i4, int i5, int i6) {
        Canvas canvas = this.f899a;
        if (canvas != null) {
            return canvas.clipRect(i2, i4, i5, i6);
        }
        Intrinsics.g("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i2, int i4, int i5, int i6, float f4, float f5, boolean z4, Paint paint) {
        j jVar = j.f923a;
        Canvas canvas = this.f899a;
        if (canvas != null) {
            jVar.h(canvas, measuredText, i2, i4, i5, i6, f4, f5, z4, paint);
        } else {
            Intrinsics.g("nativeCanvas");
            throw null;
        }
    }
}
