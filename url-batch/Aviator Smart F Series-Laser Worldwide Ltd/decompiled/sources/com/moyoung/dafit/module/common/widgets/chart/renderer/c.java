package com.moyoung.dafit.module.common.widgets.chart.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.renderer.c;
import com.github.mikephil.charting.utils.j;
import java.util.ArrayList;
import u4.g;
import v4.f;

/* loaded from: classes4.dex */
public class c extends b {
    public c(g gVar, com.github.mikephil.charting.animation.a aVar, j jVar) {
        super(gVar, aVar, jVar);
    }

    @Override // com.moyoung.dafit.module.common.widgets.chart.renderer.b
    protected void drawCubicFill(Canvas canvas, f fVar, Path path, com.github.mikephil.charting.utils.g gVar, c.a aVar) {
        float fillLinePosition = fVar.getFillFormatter().getFillLinePosition(fVar, this.mChart);
        if (this.mXBounds.range >= 1) {
            ArrayList arrayList = new ArrayList();
            int i8 = this.mXBounds.min;
            while (true) {
                c.a aVar2 = this.mXBounds;
                if (i8 > aVar2.range + aVar2.min) {
                    break;
                }
                if (fVar.getEntryForIndex(i8).getY() != 0.0f) {
                    arrayList.add(Integer.valueOf(i8));
                }
                i8++;
            }
            if (arrayList.size() < 2) {
                return;
            }
            float x7 = fVar.getEntryForIndex(((Integer) arrayList.get(arrayList.size() - 1)).intValue()).getX();
            float x8 = fVar.getEntryForIndex(((Integer) arrayList.get(0)).intValue()).getX();
            path.lineTo(x7, fillLinePosition);
            path.lineTo(x8, fillLinePosition);
            path.close();
            gVar.pathValueToPixel(path);
            Drawable fillDrawable = fVar.getFillDrawable();
            if (fillDrawable != null) {
                drawFilledPath(canvas, path, fillDrawable);
            } else {
                drawFilledPath(canvas, path, fVar.getFillColor(), fVar.getFillAlpha());
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.widgets.chart.renderer.b
    protected void drawHorizontalBezier(f fVar) {
        float phaseY = this.mAnimator.getPhaseY();
        com.github.mikephil.charting.utils.g transformer = this.mChart.getTransformer(fVar.getAxisDependency());
        this.mXBounds.set(this.mChart, fVar);
        this.cubicPath.reset();
        c.a aVar = this.mXBounds;
        boolean z7 = true;
        if (aVar.range >= 1) {
            Entry entryForIndex = fVar.getEntryForIndex(aVar.min);
            int i8 = this.mXBounds.min;
            while (true) {
                c.a aVar2 = this.mXBounds;
                if (i8 > aVar2.range + aVar2.min) {
                    break;
                }
                Entry entryForIndex2 = fVar.getEntryForIndex(i8);
                if (entryForIndex2.getY() != 0.0f) {
                    if (z7) {
                        this.cubicPath.moveTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                        entryForIndex = entryForIndex2;
                        z7 = false;
                    } else {
                        float x7 = entryForIndex.getX() + ((entryForIndex2.getX() - entryForIndex.getX()) / 2.0f);
                        this.cubicPath.cubicTo(x7, entryForIndex.getY() * phaseY, x7, entryForIndex2.getY() * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                        entryForIndex = entryForIndex2;
                    }
                }
                i8++;
            }
        }
        if (fVar.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, fVar, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(fVar.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }
}
